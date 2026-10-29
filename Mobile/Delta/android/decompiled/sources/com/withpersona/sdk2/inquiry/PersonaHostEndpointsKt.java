package com.withpersona.sdk2.inquiry;

import jt.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"endpoints", "Lcom/withpersona/sdk2/inquiry/PersonaHostEndpoints;", "Lcom/withpersona/sdk2/inquiry/PersonaHost;", "getEndpoints", "(Lcom/withpersona/sdk2/inquiry/PersonaHost;)Lcom/withpersona/sdk2/inquiry/PersonaHostEndpoints;", "inquiry-dynamic-feature_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class PersonaHostEndpointsKt {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PersonaHost.values().length];
            try {
                iArr[PersonaHost.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PersonaHost.FedRamp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final PersonaHostEndpoints getEndpoints(@NotNull PersonaHost personaHost) {
        Intrinsics.checkNotNullParameter(personaHost, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[personaHost.ordinal()];
        if (i10 == 1) {
            return new PersonaHostEndpoints("https://withpersona.com", "https://webrtc-consumer.withpersona.com", "https://inquiry-fallback.withpersona.com", "https://tg.withpersona.com");
        }
        if (i10 == 2) {
            return new PersonaHostEndpoints("https://app.withpersona-gov.com", "https://webrtc-consumer.withpersona-gov.com", "https://inquiry-fallback.withpersona-gov.com", "https://tg.withpersona-gov.com");
        }
        throw new l();
    }
}
