package adapter.impl;

import adapter.Adapter;
import old.Math;

public class AdapterImpl implements Adapter {

    @Override
    public Float twiceOf(Float f) {
        
        return (float)Math.twoTime(f.doubleValue());
    }

    @Override
    public Float halfOf(Float f) {
        
        return (float)Math.half(f.doubleValue());
    }

}
