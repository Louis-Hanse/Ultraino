/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package acousticfield3d.simulation;

import acousticfield3d.math.Vector3f;
import acousticfield3d.scene.Entity;
import acousticfield3d.scene.MeshEntity;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Asier
 */
public class AnimKeyFrame {
    public int number;
    
    HashMap<Transducer, Float> transAmplitudes;
    HashMap<Transducer, Float> transPhases;
    HashMap<Entity, Vector3f> pointsPositions;
    
    public float duration;

    public AnimKeyFrame() {
        transAmplitudes = new HashMap<>();
        transPhases = new HashMap<>();
        pointsPositions = new HashMap<>();
    }

    public HashMap<Transducer, Float> getTransAmplitudes() {
        return transAmplitudes;
    }

    public void setTransAmplitudes(HashMap<Transducer, Float> transAmplitudes) {
        this.transAmplitudes = transAmplitudes;
    }

    public HashMap<Transducer, Float> getTransPhases() {
        return transPhases;
    }

    public void setTransPhases(HashMap<Transducer, Float> transPhases) {
        this.transPhases = transPhases;
    }

    public HashMap<Entity, Vector3f> getPointsPositions() {
        return pointsPositions;
    }

    public void setPointsPositions(HashMap<Entity, Vector3f> pointsPositions) {
        this.pointsPositions = pointsPositions;
    }

    
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return number + " " + duration;
    }
    
    public void deleteTrans(Transducer t){
        transAmplitudes.remove(t);
        transPhases.remove(t);
    }
    
    public void deleteTrans(List<Transducer> trans){
        for(Transducer t : trans ){
            transAmplitudes.remove(t);
            transPhases.remove(t);
        }
    }
    
    
    public void snap(Simulation s){
        transAmplitudes.clear();
        transPhases.clear();
        pointsPositions.clear();
        for(Transducer t : s.transducers){
            transAmplitudes.put(t, t.getpAmplitude());
            transPhases.put(t, t.getPhase());
        }
        for(Entity e : s.controlPoints){
            pointsPositions.put(e, e.getTransform().getTranslation().clone());
        }
    }
    
    public void apply(){
        for(Transducer t : transAmplitudes.keySet()){
            t.setAmplitude( transAmplitudes.get(t) );
            t.setPhase( transPhases.get(t) );
        }
        for(Entity e : pointsPositions.keySet()){
            e.getTransform().getTranslation().set( pointsPositions.get(e) );
        }
    }
    
    void addTrans(Transducer t) {
       transAmplitudes.put(t, t.getpAmplitude());
       transPhases.put(t, t.getPhase());
    }
        
    /*
    public void applyInter(AnimKeyFrame b, float p){
        for(Transducer t : transStates.keySet()){
            TransState tsA = transStates.get(t);
            TransState tsB = b.transStates.get(t);
            if (tsA != null && tsB != null){
                tsA.applyMixed(tsB, p);
            }else if (tsB != null){
                tsA.apply();
            }
            
        }
    }
*/
    

  
    
}
