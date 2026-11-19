package com.google.mlkit.vision.barcode;

import androidx.annotation.NonNull;
import androidx.p000lifecycle.f0;
import androidx.p000lifecycle.l;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.interfaces.Detector;
import java.util.List;
import k9.d;
import l9.j;
import qd.a;

/* JADX INFO: loaded from: classes2.dex */
public interface BarcodeScanner extends Detector<List<Barcode>>, j {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @f0(l.a.ON_DESTROY)
    void close();

    @Override // l9.j
    @NonNull
    /* synthetic */ d[] getOptionalFeatures();

    @NonNull
    Task<List<Barcode>> process(@NonNull InputImage inputImage);

    @NonNull
    Task<List<Barcode>> process(@NonNull a aVar);
}
