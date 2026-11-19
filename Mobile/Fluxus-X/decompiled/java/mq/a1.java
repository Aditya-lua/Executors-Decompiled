package mq;

import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;", "Lmq/z0;", "a", "(Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$CaptureMethod;)Lmq/z0;", "selfie_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a1 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23495a;

        static {
            int[] iArr = new int[NextStep.Selfie.CaptureMethod.values().length];
            try {
                iArr[NextStep.Selfie.CaptureMethod.ONLY_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NextStep.Selfie.CaptureMethod.PROFILE_AND_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NextStep.Selfie.CaptureMethod.CONFIGURABLE_POSES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f23495a = iArr;
        }
    }

    @NotNull
    public static final z0 a(@NotNull NextStep.Selfie.CaptureMethod captureMethod) {
        Intrinsics.checkNotNullParameter(captureMethod, "<this>");
        int i10 = a.f23495a[captureMethod.ordinal()];
        if (i10 == 1) {
            return z0.a.f24351a;
        }
        if (i10 == 2) {
            return z0.c.f24353a;
        }
        if (i10 == 3) {
            return z0.b.f24352a;
        }
        throw new zt.l();
    }
}
