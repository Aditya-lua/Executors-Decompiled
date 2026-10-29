package com.google.mlkit.vision.text;

import androidx.annotation.NonNull;
import androidx.p000lifecycle.f0;
import androidx.p000lifecycle.l;
import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.interfaces.Detector;
import k9.h;
import nd.a;

/* JADX INFO: loaded from: classes2.dex */
public interface TextRecognizer extends Detector<Text>, h {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @f0(l.a.ON_DESTROY)
    void close();

    @Override // k9.h
    @NonNull
    /* synthetic */ Feature[] getOptionalFeatures();

    @NonNull
    Task<Text> process(@NonNull InputImage inputImage);

    @NonNull
    Task<Text> process(@NonNull a aVar);
}
