package com.google.mlkit.vision.face;

import androidx.annotation.NonNull;
import androidx.p616lifecycle.AbstractC0966l;
import androidx.p616lifecycle.InterfaceC0955f0;
import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.interfaces.Detector;
import java.util.List;
import p242k9.InterfaceC7498h;
import p328od.C9724a;

/* JADX INFO: loaded from: classes2.dex */
public interface FaceDetector extends Detector<List<Face>>, InterfaceC7498h {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @InterfaceC0955f0(AbstractC0966l.a.ON_DESTROY)
    void close();

    @Override // p242k9.InterfaceC7498h
    @NonNull
    /* synthetic */ Feature[] getOptionalFeatures();

    @NonNull
    Task<List<Face>> process(@NonNull InputImage inputImage);

    @NonNull
    Task<List<Face>> process(@NonNull C9724a c9724a);
}
