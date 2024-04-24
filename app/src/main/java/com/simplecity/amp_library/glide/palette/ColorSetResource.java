package com.simplecity.amp_library.glide.palette;

import android.support.annotation.NonNull;
import com.bumptech.glide.load.engine.Resource;

public class ColorSetResource implements Resource<ColorSet> {
    private final ColorSet colorSet;

    public ColorSetResource(@NonNull ColorSet colorSet) {
        this.colorSet = colorSet;
    }

    @Override
    public void recycle() {
        // This method is intentionally left empty as there is no need for recycling in this implementation.
    }
}