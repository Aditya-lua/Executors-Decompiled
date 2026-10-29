package com.google.mlkit.vision.text;

import androidx.annotation.NonNull;
import androidx.p616lifecycle.AbstractC0966l;
import androidx.p616lifecycle.InterfaceC0955f0;
import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.interfaces.Detector;
import p242k9.InterfaceC7498h;
import p328od.C9724a;

/* JADX INFO: loaded from: classes2.dex */
public interface TextRecognizer extends Detector<Text>, InterfaceC7498h {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @InterfaceC0955f0(AbstractC0966l.a.ON_DESTROY)
    void close();

    @Override // p242k9.InterfaceC7498h
    @NonNull
    /* synthetic */ Feature[] getOptionalFeatures();

    @NonNull
    Task<Text> process(@NonNull InputImage inputImage);

    @NonNull
    Task<Text> process(@NonNull C9724a c9724a);
}
