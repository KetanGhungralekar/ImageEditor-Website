package com.iiitb.imageEffectApplication.baseEffects;
import com.iiitb.imageEffectApplication.service.LoggingService;
import com.iiitb.imageEffectApplication.libraryInterfaces.Pixel;

// The base effect. Every effect should call apply after setting all the parameters
public interface PhotoEffect {
    Pixel[][] apply(Pixel[][] image, String fileName);
}
