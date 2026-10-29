package com.withpersona.sdk2.inquiry.tracking.network;

import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7328a;
import p229jt.C7347n;
import p229jt.C7348o;
import p231jv.C7396x;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.C10350l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0080@¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0080@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsService;", "", "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;", "trackingEventsServiceApi", "<init>", "(Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;)V", "", "sessionToken", "Ljt/n;", "Lcom/withpersona/sdk2/inquiry/tracking/network/PublicKeyResponse;", "getPublicKey-gIAlu-s$tracking_events_release", "(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "getPublicKey", "Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;", "request", "", "sendEvents-0E7RQCE$tracking_events_release", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/network/EncryptedTrackingEventsRequest;Lnt/b;)Ljava/lang/Object;", "sendEvents", "Lcom/withpersona/sdk2/inquiry/tracking/network/TrackingEventsServiceApi;", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class TrackingEventsService {

    @NotNull
    private final TrackingEventsServiceApi trackingEventsServiceApi;

    public TrackingEventsService(@NotNull TrackingEventsServiceApi trackingEventsServiceApi) {
        trackingEventsServiceApi.getClass();
        this.trackingEventsServiceApi = trackingEventsServiceApi;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: getPublicKey-gIAlu-s$tracking_events_release, reason: not valid java name */
    public final Object m50804getPublicKeygIAlus$tracking_events_release(@NotNull String str, @NotNull InterfaceC9557b<? super C7347n<PublicKeyResponse>> interfaceC9557b) {
        TrackingEventsService$getPublicKey$1 trackingEventsService$getPublicKey$1;
        if (interfaceC9557b instanceof TrackingEventsService$getPublicKey$1) {
            trackingEventsService$getPublicKey$1 = (TrackingEventsService$getPublicKey$1) interfaceC9557b;
            int i10 = trackingEventsService$getPublicKey$1.label;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                trackingEventsService$getPublicKey$1.label = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                trackingEventsService$getPublicKey$1 = new TrackingEventsService$getPublicKey$1(this, interfaceC9557b);
            }
        } else {
            trackingEventsService$getPublicKey$1 = new TrackingEventsService$getPublicKey$1(this, interfaceC9557b);
        }
        Object publicKey = trackingEventsService$getPublicKey$1.result;
        Object objM38805e = C10047c.m38805e();
        int i11 = trackingEventsService$getPublicKey$1.label;
        try {
            if (i11 == 0) {
                C7348o.m30470b(publicKey);
                TrackingEventsServiceApi trackingEventsServiceApi = this.trackingEventsServiceApi;
                trackingEventsService$getPublicKey$1.L$0 = C10350l.m39676a(str);
                trackingEventsService$getPublicKey$1.label = 1;
                publicKey = trackingEventsServiceApi.getPublicKey(str, trackingEventsService$getPublicKey$1);
                if (publicKey == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(publicKey);
            }
            C7396x c7396x = (C7396x) publicKey;
            if (c7396x.m30657g()) {
                PublicKeyResponse publicKeyResponse = (PublicKeyResponse) c7396x.m30653a();
                if (publicKeyResponse != null) {
                    return C7347n.m30460b(publicKeyResponse);
                }
                C7347n.Companion companion = C7347n.INSTANCE;
                return C7347n.m30460b(C7348o.m30469a(new Exception("Empty response body from /public-key")));
            }
            C7347n.Companion companion2 = C7347n.INSTANCE;
            return C7347n.m30460b(C7348o.m30469a(new Exception("Failed to get public key: " + c7396x.m30654b())));
        } catch (Exception e10) {
            C7347n.Companion companion3 = C7347n.INSTANCE;
            return C7347n.m30460b(C7348o.m30469a(new Exception("Failed to get public key: " + C7328a.m30430b(e10))));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: sendEvents-0E7RQCE$tracking_events_release, reason: not valid java name */
    public final Object m50805sendEvents0E7RQCE$tracking_events_release(@NotNull String str, @NotNull EncryptedTrackingEventsRequest encryptedTrackingEventsRequest, @NotNull InterfaceC9557b<? super C7347n<Unit>> interfaceC9557b) {
        TrackingEventsService$sendEvents$1 trackingEventsService$sendEvents$1;
        if (interfaceC9557b instanceof TrackingEventsService$sendEvents$1) {
            trackingEventsService$sendEvents$1 = (TrackingEventsService$sendEvents$1) interfaceC9557b;
            int i10 = trackingEventsService$sendEvents$1.label;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                trackingEventsService$sendEvents$1.label = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                trackingEventsService$sendEvents$1 = new TrackingEventsService$sendEvents$1(this, interfaceC9557b);
            }
        } else {
            trackingEventsService$sendEvents$1 = new TrackingEventsService$sendEvents$1(this, interfaceC9557b);
        }
        Object objSendEvents = trackingEventsService$sendEvents$1.result;
        Object objM38805e = C10047c.m38805e();
        int i11 = trackingEventsService$sendEvents$1.label;
        try {
            if (i11 == 0) {
                C7348o.m30470b(objSendEvents);
                TrackingEventsServiceApi trackingEventsServiceApi = this.trackingEventsServiceApi;
                trackingEventsService$sendEvents$1.L$0 = C10350l.m39676a(str);
                trackingEventsService$sendEvents$1.L$1 = C10350l.m39676a(encryptedTrackingEventsRequest);
                trackingEventsService$sendEvents$1.label = 1;
                objSendEvents = trackingEventsServiceApi.sendEvents(str, encryptedTrackingEventsRequest, trackingEventsService$sendEvents$1);
                if (objSendEvents == objM38805e) {
                    return objM38805e;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7348o.m30470b(objSendEvents);
            }
            C7396x c7396x = (C7396x) objSendEvents;
            if (c7396x.m30657g()) {
                C7347n.Companion companion = C7347n.INSTANCE;
                return C7347n.m30460b(Unit.f29331a);
            }
            C7347n.Companion companion2 = C7347n.INSTANCE;
            return C7347n.m30460b(C7348o.m30469a(new Exception("Failed to send events: " + c7396x.m30654b())));
        } catch (Exception e10) {
            C7347n.Companion companion3 = C7347n.INSTANCE;
            return C7347n.m30460b(C7348o.m30469a(new Exception("Failed to send events: " + C7328a.m30430b(e10))));
        }
    }
}
