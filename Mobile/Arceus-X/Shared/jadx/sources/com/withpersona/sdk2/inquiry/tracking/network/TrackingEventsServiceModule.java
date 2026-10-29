package com.withpersona.sdk2.inquiry.tracking.network;

import android.content.Context;
import com.withpersona.sdk2.inquiry.network.core.JsonAdapterBinding;
import com.withpersona.sdk2.inquiry.network.core.dto.UiComponentError;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7700p0;
import kotlin.collections.C7702q0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p231jv.C7397y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\t\u001a\u00070\u0004¢\u0006\u0002\b\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0015"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule;", "", "Landroid/content/Context;", "context", "", "trackingEventsServiceServerEndpoint", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "Lcom/withpersona/sdk2/inquiry/network/core/ServerEndpoint;", "serverEndpoint", "()Ljava/lang/String;", "provideContext", "()Landroid/content/Context;", "Ljv/y;", "retrofit", "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;", "provideTrackingEventsServiceApi", "(Ljv/y;)Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;", "Landroid/content/Context;", "Ljava/lang/String;", "Companion", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class TrackingEventsServiceModule {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Context context;

    @NotNull
    private final String trackingEventsServiceServerEndpoint;

    @Metadata(m31664d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005H\u0007J\u0013\u0010\u0007\u001a\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\b0\u0005H\u0007¨\u0006\t"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceModule$Companion;", "", "<init>", "()V", "provideMoshiJsonAdapterBinding", "", "Lcom/withpersona/sdk2/inquiry/network/core/JsonAdapterBinding;", "provideMoshiJsonAdapter", "Lcom/withpersona/sdk2/inquiry/network/core/MoshiJsonAdapter;", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.tracking.network.TrackingEventsServiceModule.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<Object> provideMoshiJsonAdapter() {
            return C7700p0.m31904c(UiComponentError.Companion);
        }

        @NotNull
        public final Set<JsonAdapterBinding<?>> provideMoshiJsonAdapterBinding() {
            return C7702q0.m31908d();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    public TrackingEventsServiceModule(@NotNull Context context, @NotNull String str) {
        context.getClass();
        str.getClass();
        this.context = context;
        this.trackingEventsServiceServerEndpoint = str;
    }

    @NotNull
    public static final Set<Object> provideMoshiJsonAdapter() {
        return INSTANCE.provideMoshiJsonAdapter();
    }

    @NotNull
    public static final Set<JsonAdapterBinding<?>> provideMoshiJsonAdapterBinding() {
        return INSTANCE.provideMoshiJsonAdapterBinding();
    }

    @NotNull
    /* JADX INFO: renamed from: provideContext, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final TrackingEventsServiceApi provideTrackingEventsServiceApi(@NotNull C7397y retrofit) {
        retrofit.getClass();
        Object objM30660b = retrofit.m30660b(TrackingEventsServiceApi.class);
        objM30660b.getClass();
        return (TrackingEventsServiceApi) objM30660b;
    }

    @NotNull
    /* JADX INFO: renamed from: serverEndpoint, reason: from getter */
    public final String getTrackingEventsServiceServerEndpoint() {
        return this.trackingEventsServiceServerEndpoint;
    }
}
