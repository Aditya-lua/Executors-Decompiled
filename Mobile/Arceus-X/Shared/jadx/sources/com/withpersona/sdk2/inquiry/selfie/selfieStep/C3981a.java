package com.withpersona.sdk2.inquiry.selfie.selfieStep;

import com.withpersona.sdk2.camera.C3402b;
import com.withpersona.sdk2.inquiry.tracking.TrackingEventsLogger;
import p061ct.InterfaceC4364a;
import p132fn.C5698n0;
import p152go.C6159e;
import p498vq.C12247a;

/* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.selfie.selfieStep.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C3981a {
    /* JADX INFO: renamed from: a */
    public static void m20249a(SelfieStepFragment selfieStepFragment, C3402b c3402b) {
        selfieStepFragment.cameraPreview = c3402b;
    }

    /* JADX INFO: renamed from: b */
    public static void m20250b(SelfieStepFragment selfieStepFragment, C6159e c6159e) {
        selfieStepFragment.featureFlagManager = c6159e;
    }

    /* JADX INFO: renamed from: c */
    public static void m20251c(SelfieStepFragment selfieStepFragment, InterfaceC4364a<C5698n0> interfaceC4364a) {
        selfieStepFragment.selfieDirectionFeed = interfaceC4364a;
    }

    /* JADX INFO: renamed from: d */
    public static void m20252d(SelfieStepFragment selfieStepFragment, C12247a c12247a) {
        selfieStepFragment.systemUiController = c12247a;
    }

    /* JADX INFO: renamed from: e */
    public static void m20253e(SelfieStepFragment selfieStepFragment, TrackingEventsLogger trackingEventsLogger) {
        selfieStepFragment.trackingEventsLogger = trackingEventsLogger;
    }

    /* JADX INFO: renamed from: f */
    public static void m20254f(SelfieStepFragment selfieStepFragment, C3982b.a aVar) {
        selfieStepFragment.viewModelFactory = aVar;
    }
}
