package com.roblox.engine.jni.video;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class VideoCodecCapability {
    String codec;
    boolean isEncoder;
    boolean isHardware;
    public String[] levels;
    int maxBitrate;
    int maxFps;
    int maxHeight;
    int maxInstances;
    int maxWidth;
    int minBitrate;
    int minFps;
    int minHeight;
    int minWidth;
    String name;
    public String[] profiles;
}
