package com.withpersona.sdk2.inquiry.governmentid.persona_workflow;

import com.withpersona.sdk2.camera.C3402b;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import p061ct.InterfaceC4364a;
import p132fn.C5717x;
import p152go.C6159e;
import p498vq.C12247a;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.governmentid.persona_workflow.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C3590a {
    /* JADX INFO: renamed from: a */
    public static void m17801a(GovernmentIdStepFragment governmentIdStepFragment, C3402b c3402b) {
        governmentIdStepFragment.cameraPreview = c3402b;
    }

    /* JADX INFO: renamed from: b */
    public static void m17802b(GovernmentIdStepFragment governmentIdStepFragment, C6159e c6159e) {
        governmentIdStepFragment.featureFlagManager = c6159e;
    }

    /* JADX INFO: renamed from: c */
    public static void m17803c(GovernmentIdStepFragment governmentIdStepFragment, InterfaceC4364a<C5717x> interfaceC4364a) {
        governmentIdStepFragment.governmentIdFeed = interfaceC4364a;
    }

    /* JADX INFO: renamed from: d */
    public static void m17804d(GovernmentIdStepFragment governmentIdStepFragment, C12247a c12247a) {
        governmentIdStepFragment.systemUiController = c12247a;
    }

    /* JADX INFO: renamed from: e */
    public static void m17805e(GovernmentIdStepFragment governmentIdStepFragment, TrackingEventsLogger trackingEventsLogger) {
        governmentIdStepFragment.trackingEventsLogger = trackingEventsLogger;
    }

    /* JADX INFO: renamed from: f */
    public static void m17806f(GovernmentIdStepFragment governmentIdStepFragment, C3593d.a aVar) {
        governmentIdStepFragment.viewModelFactory = aVar;
    }
}
