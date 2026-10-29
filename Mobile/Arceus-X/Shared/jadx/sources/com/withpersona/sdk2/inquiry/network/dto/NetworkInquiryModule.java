package com.withpersona.sdk2.inquiry.network.dto;

import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.LocalImage;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.UiComponentConfig;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7702q0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p471um.AbstractC11873h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NetworkInquiryModule;", "", "<init>", "()V", "Companion", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class NetworkInquiryModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u000b\u001a\u00070\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NetworkInquiryModule$Companion;", "", "<init>", "()V", "", "Lum/h$e;", "Lcom/withpersona/sdk2/inquiry/network/core/MoshiJsonAdapter;", "provideMoshiJsonAdapterFactory", "()Ljava/util/Set;", "", "Lcom/withpersona/sdk2/inquiry/network/core/HttpHeader;", "userAgent", "()Ljava/lang/String;", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.network.dto.NetworkInquiryModule.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<AbstractC11873h.e> provideMoshiJsonAdapterFactory() {
            return C7702q0.m31911g(NextStep.INSTANCE.createAdapter(), UiComponentConfig.INSTANCE.createAdapter(), LocalImage.INSTANCE.createAdapter(), Id.INSTANCE.createAdapter(), Included.INSTANCE.createAdapter());
        }

        @NotNull
        public final String userAgent() {
            return "Persona/1.0 (Android) Inquiry/2.51.0";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    @NotNull
    public static final Set<AbstractC11873h.e> provideMoshiJsonAdapterFactory() {
        return INSTANCE.provideMoshiJsonAdapterFactory();
    }

    @NotNull
    public static final String userAgent() {
        return INSTANCE.userAgent();
    }
}
