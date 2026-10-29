package com.withpersona.sdk2.inquiry.selfie.selfieStep;

import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import fn.n0;
import go.e;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static void a(SelfieStepFragment selfieStepFragment, com.withpersona.sdk2.camera.b bVar) {
        selfieStepFragment.cameraPreview = bVar;
    }

    public static void b(SelfieStepFragment selfieStepFragment, e eVar) {
        selfieStepFragment.featureFlagManager = eVar;
    }

    public static void c(SelfieStepFragment selfieStepFragment, ct.a<n0> aVar) {
        selfieStepFragment.selfieDirectionFeed = aVar;
    }

    public static void d(SelfieStepFragment selfieStepFragment, vq.a aVar) {
        selfieStepFragment.systemUiController = aVar;
    }

    public static void e(SelfieStepFragment selfieStepFragment, TrackingEventsLogger trackingEventsLogger) {
        selfieStepFragment.trackingEventsLogger = trackingEventsLogger;
    }

    public static void f(SelfieStepFragment selfieStepFragment, b.a aVar) {
        selfieStepFragment.viewModelFactory = aVar;
    }
}
