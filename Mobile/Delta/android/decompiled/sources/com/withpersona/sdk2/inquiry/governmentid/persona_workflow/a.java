package com.withpersona.sdk2.inquiry.governmentid.persona_workflow;

import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import fn.x;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static void a(GovernmentIdStepFragment governmentIdStepFragment, com.withpersona.sdk2.camera.b bVar) {
        governmentIdStepFragment.cameraPreview = bVar;
    }

    public static void b(GovernmentIdStepFragment governmentIdStepFragment, go.e eVar) {
        governmentIdStepFragment.featureFlagManager = eVar;
    }

    public static void c(GovernmentIdStepFragment governmentIdStepFragment, ct.a<x> aVar) {
        governmentIdStepFragment.governmentIdFeed = aVar;
    }

    public static void d(GovernmentIdStepFragment governmentIdStepFragment, vq.a aVar) {
        governmentIdStepFragment.systemUiController = aVar;
    }

    public static void e(GovernmentIdStepFragment governmentIdStepFragment, TrackingEventsLogger trackingEventsLogger) {
        governmentIdStepFragment.trackingEventsLogger = trackingEventsLogger;
    }

    public static void f(GovernmentIdStepFragment governmentIdStepFragment, d.a aVar) {
        governmentIdStepFragment.viewModelFactory = aVar;
    }
}
