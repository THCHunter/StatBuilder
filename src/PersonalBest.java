public class PersonalBest {
    
    int PBHardpointKills;
    int PBHardpointTime;
    int PBHardpointDefends;
    int PBSearchKills;
    int PBCaptureKills;
    int PBCaptureCaps;
    int PBCaptureReturns;
    
    public PersonalBest(int PBHardpointKills, int PBHardpointTime, int PBHardpointDefends, 
            int PBSearchKills, int PBCaptureKills, int PBCaptureCaps, int PBCaptureReturns){
        this.PBHardpointKills = PBHardpointKills;
        this.PBHardpointTime = PBHardpointTime;
        this.PBHardpointDefends = PBHardpointDefends;
        this.PBSearchKills = PBSearchKills;
        this.PBCaptureKills = PBCaptureKills;
        this.PBCaptureCaps = PBCaptureCaps;
        this.PBCaptureReturns = PBCaptureReturns;
    }
    
    public PersonalBest(){
        
    }
    
    public int getPBHardpointKills(){
        return this.PBHardpointKills;
    }
    
    public void setPBHardpointKills(int kills){
        this.PBHardpointKills = kills;
    }
    
    public void setPBHardpoint(int kills){
        if (kills > this.PBHardpointKills)
            this.PBHardpointKills = kills;
    }
   
    public int getPBHardpointTime(){
        return this.PBHardpointTime;
    }
    
    public void setPBHardpointTime(int time){
        this.PBHardpointTime = time;
    }
    
    public void checkPBHardpointTime(int time){
        if (time > this.PBHardpointTime)
            this.PBHardpointTime = time;
    }
    
    public int getPBHardpointDefends(){
        return this.PBHardpointDefends;
    }
    
    public void setPBHardpointDefends(int defends){
        this.PBHardpointDefends = defends;
    }
    
    public void checkPBHardpointDefends(int defends){
        if (defends > this.PBHardpointDefends)
            this.PBHardpointDefends = defends;
    }
    
    public int getPBSearchKills(){
        return this.PBSearchKills;
    }
    
    public void setPBSearchKills(int kills){
        this.PBSearchKills = kills;
    }
    
    public void checkPBSearchKills(int kills){
        if (kills > this.PBSearchKills)
            this.PBSearchKills = kills;
    }
    
    public int getPBCaptureKills(){
        return this.PBCaptureKills;
    }
    
    public void setPBCaptureKills(int kills){
        this.PBCaptureKills = kills;
    }
    
    public void checkPBCaptureKills(int kills){
        if (kills > this.PBCaptureKills)
            this.PBCaptureKills = kills;
    }
    
    public int getPBCaptureReturns(){
        return this.PBCaptureReturns;
    }
    
    public void setPBCaptureReturns(int returns){
        this.PBCaptureReturns = returns;
    }
    
    public void checkPBCaptureReturns(int returns){
        if (returns > this.PBCaptureReturns)
            this.PBCaptureReturns = returns;
    }
    
    public int getPBCaptureCaps(){
        return this.PBCaptureCaps;
    }
    
    public void setPBCaptureCaps(int captures){
        this.PBCaptureCaps = captures;
    }
    
    public void checkPBCaptureCaps(int captures){
        if (captures > this.PBCaptureCaps)
            this.PBCaptureCaps = captures;
    }
}

