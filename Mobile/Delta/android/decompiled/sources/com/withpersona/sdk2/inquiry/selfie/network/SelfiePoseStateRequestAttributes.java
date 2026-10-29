package com.withpersona.sdk2.inquiry.selfie.network;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import um.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/network/SelfiePoseStateRequestAttributes;", "", "", "index", "", "stepName", "<init>", "(ILjava/lang/String;)V", "a", "I", "()I", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "selfie_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i(generateAdapter = true)
public final class SelfiePoseStateRequestAttributes {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int index;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final String stepName;

    public SelfiePoseStateRequestAttributes(int i10, @NotNull String stepName) {
        Intrinsics.checkNotNullParameter(stepName, "stepName");
        this.index = i10;
        this.stepName = stepName;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getStepName() {
        return this.stepName;
    }
}
