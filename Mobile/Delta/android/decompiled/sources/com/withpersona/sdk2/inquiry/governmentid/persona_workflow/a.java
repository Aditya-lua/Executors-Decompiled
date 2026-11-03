package com.withpersona.sdk2.inquiry.governmentid.persona_workflow;

import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import dn.x;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static void a(GovernmentIdStepFragment governmentIdStepFragment, com.withpersona.sdk2.camera.b bVar) {
        governmentIdStepFragment.cameraPreview = bVar;
    }

    public static void b(GovernmentIdStepFragment governmentIdStepFragment, eo.e eVar) {
        governmentIdStepFragment.featureFlagManager = eVar;
    }

    public static void c(GovernmentIdStepFragment governmentIdStepFragment, at.a<x> aVar) {
        governmentIdStepFragment.governmentIdFeed = aVar;
    }

    public static void d(GovernmentIdStepFragment governmentIdStepFragment, tq.a aVar) {
        governmentIdStepFragment.systemUiController = aVar;
    }

    public static void e(GovernmentIdStepFragment governmentIdStepFragment, TrackingEventsLogger trackingEventsLogger) {
        governmentIdStepFragment.trackingEventsLogger = trackingEventsLogger;
    }

    public static void f(GovernmentIdStepFragment governmentIdStepFragment, d.a aVar) {
        governmentIdStepFragment.viewModelFactory = aVar;
    }
}
