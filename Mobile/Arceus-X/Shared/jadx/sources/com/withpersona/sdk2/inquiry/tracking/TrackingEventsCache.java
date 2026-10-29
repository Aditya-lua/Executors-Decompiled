package com.withpersona.sdk2.inquiry.tracking;

import androidx.core.app.NotificationCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.withpersona.sdk2.inquiry.tracking.model.TrackingEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7697o;
import kotlin.collections.C7699p;
import kotlin.collections.C7708u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p478uu.C11976g;
import p478uu.InterfaceC11970a;
import pt.AbstractC10342d;
import pt.C10340b;
import pt.InterfaceC10344f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;", "", "<init>", "()V", "", "loggerId", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", NotificationCompat.CATEGORY_EVENT, "", "add", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Lnt/b;)Ljava/lang/Object;", "", "currentCount", "(Lnt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventFlushSession;", "beginFlush", "(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "flushToken", "", "isSuccess", "onFlushFinished", "(Ljava/lang/String;ZLnt/b;)Ljava/lang/Object;", "Luu/a;", "mutex", "Luu/a;", "", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$TrackingEventData;", "events", "Ljava/util/List;", "Companion", "TrackingEventData", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class TrackingEventsCache {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static volatile TrackingEventsCache INSTANCE;
    public static final int NO_FLUSH_TOKEN = 0;

    @NotNull
    private final InterfaceC11970a mutex = C11976g.m44697b(false, 1, null);

    @NotNull
    private final List<TrackingEventData> events = new ArrayList();

    @Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007J\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$Companion;", "", "<init>", "()V", "NO_FLUSH_TOKEN", "", "INSTANCE", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;", "setInstance", "", "cache", "getInstance", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final TrackingEventsCache getInstance() {
            return TrackingEventsCache.INSTANCE;
        }

        public final void setInstance(@NotNull TrackingEventsCache cache) {
            cache.getClass();
            TrackingEventsCache.INSTANCE = cache;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$add$1 */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache", m39664f = "TrackingEventsCache.kt", m39665l = {94}, m39666m = "add")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C41051 extends AbstractC10342d {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C41051(InterfaceC9557b<? super C41051> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return TrackingEventsCache.this.add(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$beginFlush$1 */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache", m39664f = "TrackingEventsCache.kt", m39665l = {94}, m39666m = "beginFlush")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C41061 extends AbstractC10342d {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C41061(InterfaceC9557b<? super C41061> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return TrackingEventsCache.this.beginFlush(null, this);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$currentCount$1 */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache", m39664f = "TrackingEventsCache.kt", m39665l = {94}, m39666m = "currentCount")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C41071 extends AbstractC10342d {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C41071(InterfaceC9557b<? super C41071> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return TrackingEventsCache.this.currentCount(this);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$onFlushFinished$1 */
    @InterfaceC10344f(m39663c = "com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache", m39664f = "TrackingEventsCache.kt", m39665l = {94}, m39666m = "onFlushFinished")
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C41081 extends AbstractC10342d {
        int I$0;
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C41081(InterfaceC9557b<? super C41081> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return TrackingEventsCache.this.onFlushFinished(null, false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onFlushFinished$lambda$7$lambda$5(String str, TrackingEventData trackingEventData) {
        trackingEventData.getClass();
        return Intrinsics.m31980c(trackingEventData.getFlushToken(), str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object add(@NotNull String str, @NotNull TrackingEvent trackingEvent, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        C41051 c41051;
        String str2;
        InterfaceC11970a interfaceC11970a;
        if (interfaceC9557b instanceof C41051) {
            c41051 = (C41051) interfaceC9557b;
            int i10 = c41051.label;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                c41051.label = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                c41051 = new C41051(interfaceC9557b);
            }
        } else {
            c41051 = new C41051(interfaceC9557b);
        }
        Object obj = c41051.result;
        Object objM38805e = C10047c.m38805e();
        int i11 = c41051.label;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            InterfaceC11970a interfaceC11970a2 = this.mutex;
            c41051.L$0 = str;
            c41051.L$1 = trackingEvent;
            c41051.L$2 = interfaceC11970a2;
            c41051.I$0 = 0;
            c41051.label = 1;
            if (interfaceC11970a2.mo44674f(null, c41051) == objM38805e) {
                return objM38805e;
            }
            str2 = str;
            interfaceC11970a = interfaceC11970a2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC11970a = (InterfaceC11970a) c41051.L$2;
            trackingEvent = (TrackingEvent) c41051.L$1;
            String str3 = (String) c41051.L$0;
            C7348o.m30470b(obj);
            str2 = str3;
        }
        try {
            this.events.add(new TrackingEventData(str2, trackingEvent, null, 4, null));
            return Unit.f29331a;
        } finally {
            interfaceC11970a.mo44673e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object beginFlush(@NotNull String str, @NotNull InterfaceC9557b<? super TrackingEventFlushSession> interfaceC9557b) {
        C41061 c41061;
        String str2;
        InterfaceC11970a interfaceC11970a;
        if (interfaceC9557b instanceof C41061) {
            c41061 = (C41061) interfaceC9557b;
            int i10 = c41061.label;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                c41061.label = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                c41061 = new C41061(interfaceC9557b);
            }
        } else {
            c41061 = new C41061(interfaceC9557b);
        }
        Object obj = c41061.result;
        Object objM38805e = C10047c.m38805e();
        int i11 = c41061.label;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            InterfaceC11970a interfaceC11970a2 = this.mutex;
            c41061.L$0 = str;
            c41061.L$1 = interfaceC11970a2;
            c41061.I$0 = 0;
            c41061.label = 1;
            if (interfaceC11970a2.mo44674f(null, c41061) == objM38805e) {
                return objM38805e;
            }
            str2 = str;
            interfaceC11970a = interfaceC11970a2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC11970a = (InterfaceC11970a) c41061.L$1;
            str2 = (String) c41061.L$0;
            C7348o.m30470b(obj);
        }
        try {
            String string = UUID.randomUUID().toString();
            string.getClass();
            List listM31877c = C7697o.m31877c();
            for (TrackingEventData trackingEventData : this.events) {
                if (Intrinsics.m31980c(trackingEventData.getLoggerId(), str2) && !trackingEventData.isFlushing()) {
                    trackingEventData.setFlushToken(string);
                    listM31877c.add(trackingEventData.getEvent());
                }
            }
            return new TrackingEventFlushSession(C7697o.m31875a(listM31877c), string);
        } finally {
            interfaceC11970a.mo44673e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object currentCount(@NotNull InterfaceC9557b<? super Integer> interfaceC9557b) {
        C41071 c41071;
        InterfaceC11970a interfaceC11970a;
        if (interfaceC9557b instanceof C41071) {
            c41071 = (C41071) interfaceC9557b;
            int i10 = c41071.label;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                c41071.label = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                c41071 = new C41071(interfaceC9557b);
            }
        } else {
            c41071 = new C41071(interfaceC9557b);
        }
        Object obj = c41071.result;
        Object objM38805e = C10047c.m38805e();
        int i11 = c41071.label;
        int i12 = 0;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            InterfaceC11970a interfaceC11970a2 = this.mutex;
            c41071.L$0 = interfaceC11970a2;
            c41071.I$0 = 0;
            c41071.label = 1;
            if (interfaceC11970a2.mo44674f(null, c41071) == objM38805e) {
                return objM38805e;
            }
            interfaceC11970a = interfaceC11970a2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC11970a = (InterfaceC11970a) c41071.L$0;
            C7348o.m30470b(obj);
        }
        try {
            List<TrackingEventData> list = this.events;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (!((TrackingEventData) it.next()).isFlushing() && (i12 = i12 + 1) < 0) {
                        C7699p.m31900s();
                    }
                }
            }
            return C10340b.m39661d(i12);
        } finally {
            interfaceC11970a.mo44673e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object onFlushFinished(@NotNull final String str, boolean z10, @NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        C41081 c41081;
        InterfaceC11970a interfaceC11970a;
        if (interfaceC9557b instanceof C41081) {
            c41081 = (C41081) interfaceC9557b;
            int i10 = c41081.label;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                c41081.label = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                c41081 = new C41081(interfaceC9557b);
            }
        } else {
            c41081 = new C41081(interfaceC9557b);
        }
        Object obj = c41081.result;
        Object objM38805e = C10047c.m38805e();
        int i11 = c41081.label;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            interfaceC11970a = this.mutex;
            c41081.L$0 = str;
            c41081.L$1 = interfaceC11970a;
            c41081.Z$0 = z10;
            c41081.I$0 = 0;
            c41081.label = 1;
            if (interfaceC11970a.mo44674f(null, c41081) == objM38805e) {
                return objM38805e;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = c41081.Z$0;
            InterfaceC11970a interfaceC11970a2 = (InterfaceC11970a) c41081.L$1;
            String str2 = (String) c41081.L$0;
            C7348o.m30470b(obj);
            interfaceC11970a = interfaceC11970a2;
            str = str2;
        }
        List<TrackingEventData> list = this.events;
        try {
            if (z10) {
                C10340b.m39658a(C7708u.m31925F(list, new Function1() { // from class: com.withpersona.sdk2.inquiry.tracking.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(TrackingEventsCache.onFlushFinished$lambda$7$lambda$5(str, (TrackingEventsCache.TrackingEventData) obj2));
                    }
                }));
            } else {
                for (TrackingEventData trackingEventData : list) {
                    if (Intrinsics.m31980c(trackingEventData.getFlushToken(), str)) {
                        trackingEventData.setFlushToken(null);
                    }
                }
                Unit unit = Unit.f29331a;
            }
            interfaceC11970a.mo44673e(null);
            return Unit.f29331a;
        } catch (Throwable th2) {
            interfaceC11970a.mo44673e(null);
            throw th2;
        }
    }

    @Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u001c"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$TrackingEventData;", "", "loggerId", "", NotificationCompat.CATEGORY_EVENT, "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "flushToken", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Ljava/lang/String;)V", "getLoggerId", "()Ljava/lang/String;", "getEvent", "()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "getFlushToken", "setFlushToken", "(Ljava/lang/String;)V", "isFlushing", "", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "tracking-events_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* data */ class TrackingEventData {

        @NotNull
        private final TrackingEvent event;

        @Nullable
        private String flushToken;

        @NotNull
        private final String loggerId;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public TrackingEventData(@NotNull String str, @NotNull TrackingEvent trackingEvent, @Nullable String str2) {
            str.getClass();
            trackingEvent.getClass();
            this.loggerId = str;
            this.event = trackingEvent;
            this.flushToken = str2;
        }

        public static /* synthetic */ TrackingEventData copy$default(TrackingEventData trackingEventData, String str, TrackingEvent trackingEvent, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = trackingEventData.loggerId;
            }
            if ((i10 & 2) != 0) {
                trackingEvent = trackingEventData.event;
            }
            if ((i10 & 4) != 0) {
                str2 = trackingEventData.flushToken;
            }
            return trackingEventData.copy(str, trackingEvent, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getLoggerId() {
            return this.loggerId;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final TrackingEvent getEvent() {
            return this.event;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getFlushToken() {
            return this.flushToken;
        }

        @NotNull
        public final TrackingEventData copy(@NotNull String loggerId, @NotNull TrackingEvent event, @Nullable String flushToken) {
            loggerId.getClass();
            event.getClass();
            return new TrackingEventData(loggerId, event, flushToken);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrackingEventData)) {
                return false;
            }
            TrackingEventData trackingEventData = (TrackingEventData) other;
            return Intrinsics.m31980c(this.loggerId, trackingEventData.loggerId) && Intrinsics.m31980c(this.event, trackingEventData.event) && Intrinsics.m31980c(this.flushToken, trackingEventData.flushToken);
        }

        @NotNull
        public final TrackingEvent getEvent() {
            return this.event;
        }

        @Nullable
        public final String getFlushToken() {
            return this.flushToken;
        }

        @NotNull
        public final String getLoggerId() {
            return this.loggerId;
        }

        public int hashCode() {
            int iHashCode = (this.event.hashCode() + (this.loggerId.hashCode() * 31)) * 31;
            String str = this.flushToken;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final boolean isFlushing() {
            return this.flushToken != null;
        }

        public final void setFlushToken(@Nullable String str) {
            this.flushToken = str;
        }

        @NotNull
        public String toString() {
            return "TrackingEventData(loggerId=" + this.loggerId + ", event=" + this.event + ", flushToken=" + this.flushToken + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
          (r1v0 java.lang.String)
          (r2v0 com.withpersona.sdk2.inquiry.tracking.model.TrackingEvent)
          (wrap java.lang.String:?: TERNARY null = ((wrap int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
         A[MD:(java.lang.String, com.withpersona.sdk2.inquiry.tracking.model.TrackingEvent, java.lang.String):void (m)] (LINE:5) call: com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache.TrackingEventData.<init>(java.lang.String, com.withpersona.sdk2.inquiry.tracking.model.TrackingEvent, java.lang.String):void type: THIS */
        public /* synthetic */ TrackingEventData(String str, TrackingEvent trackingEvent, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, trackingEvent, (i10 & 4) != 0 ? null : str2);
        }
    }
}
