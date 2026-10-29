package com.withpersona.sdk2.inquiry.tracking;

import com.withpersona.sdk2.inquiry.tracking.model.TrackingEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import jt.o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.p;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ot.c;
import pt.d;
import pt.f;
import uu.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;", "", "<init>", "()V", "", "loggerId", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "event", "", "add", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Lnt/b;)Ljava/lang/Object;", "", "currentCount", "(Lnt/b;)Ljava/lang/Object;", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventFlushSession;", "beginFlush", "(Ljava/lang/String;Lnt/b;)Ljava/lang/Object;", "flushToken", "", "isSuccess", "onFlushFinished", "(Ljava/lang/String;ZLnt/b;)Ljava/lang/Object;", "Luu/a;", "mutex", "Luu/a;", "", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$TrackingEventData;", "events", "Ljava/util/List;", "Companion", "TrackingEventData", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TrackingEventsCache {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static volatile TrackingEventsCache INSTANCE;
    public static final int NO_FLUSH_TOKEN = 0;

    @NotNull
    private final uu.a mutex = g.b(false, 1, null);

    @NotNull
    private final List<TrackingEventData> events = new ArrayList();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007J\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$Companion;", "", "<init>", "()V", "NO_FLUSH_TOKEN", "", "INSTANCE", "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache;", "setInstance", "", "cache", "getInstance", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
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

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$add$1, reason: invalid class name */
    @f(c = "com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache", f = "TrackingEventsCache.kt", l = {94}, m = "add")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends d {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(nt.b<? super AnonymousClass1> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrackingEventsCache.this.add(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$beginFlush$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache", f = "TrackingEventsCache.kt", l = {94}, m = "beginFlush")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C06971 extends d {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C06971(nt.b<? super C06971> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrackingEventsCache.this.beginFlush(null, this);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$currentCount$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache", f = "TrackingEventsCache.kt", l = {94}, m = "currentCount")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C06981 extends d {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C06981(nt.b<? super C06981> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrackingEventsCache.this.currentCount(this);
        }
    }

    /* JADX INFO: renamed from: com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache$onFlushFinished$1, reason: invalid class name and case insensitive filesystem */
    @f(c = "com.withpersona.sdk2.inquiry.tracking.TrackingEventsCache", f = "TrackingEventsCache.kt", l = {94}, m = "onFlushFinished")
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C06991 extends d {
        int I$0;
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C06991(nt.b<? super C06991> bVar) {
            super(bVar);
        }

        @Override // pt.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TrackingEventsCache.this.onFlushFinished(null, false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onFlushFinished$lambda$7$lambda$5(String str, TrackingEventData trackingEventData) {
        trackingEventData.getClass();
        return Intrinsics.c(trackingEventData.getFlushToken(), str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object add(@NotNull String str, @NotNull TrackingEvent trackingEvent, @NotNull nt.b<? super Unit> bVar) {
        AnonymousClass1 anonymousClass1;
        String str2;
        uu.a aVar;
        if (bVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) bVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(bVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(bVar);
        }
        Object obj = anonymousClass1.result;
        Object objE = c.e();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            o.b(obj);
            uu.a aVar2 = this.mutex;
            anonymousClass1.L$0 = str;
            anonymousClass1.L$1 = trackingEvent;
            anonymousClass1.L$2 = aVar2;
            anonymousClass1.I$0 = 0;
            anonymousClass1.label = 1;
            if (aVar2.f(null, anonymousClass1) == objE) {
                return objE;
            }
            str2 = str;
            aVar = aVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (uu.a) anonymousClass1.L$2;
            trackingEvent = (TrackingEvent) anonymousClass1.L$1;
            String str3 = (String) anonymousClass1.L$0;
            o.b(obj);
            str2 = str3;
        }
        try {
            this.events.add(new TrackingEventData(str2, trackingEvent, null, 4, null));
            return Unit.f22483a;
        } finally {
            aVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object beginFlush(@NotNull String str, @NotNull nt.b<? super TrackingEventFlushSession> bVar) {
        C06971 c06971;
        String str2;
        uu.a aVar;
        if (bVar instanceof C06971) {
            c06971 = (C06971) bVar;
            int i10 = c06971.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c06971.label = i10 - Integer.MIN_VALUE;
            } else {
                c06971 = new C06971(bVar);
            }
        } else {
            c06971 = new C06971(bVar);
        }
        Object obj = c06971.result;
        Object objE = c.e();
        int i11 = c06971.label;
        if (i11 == 0) {
            o.b(obj);
            uu.a aVar2 = this.mutex;
            c06971.L$0 = str;
            c06971.L$1 = aVar2;
            c06971.I$0 = 0;
            c06971.label = 1;
            if (aVar2.f(null, c06971) == objE) {
                return objE;
            }
            str2 = str;
            aVar = aVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (uu.a) c06971.L$1;
            str2 = (String) c06971.L$0;
            o.b(obj);
        }
        try {
            String string = UUID.randomUUID().toString();
            string.getClass();
            List listC = kotlin.collections.o.c();
            for (TrackingEventData trackingEventData : this.events) {
                if (Intrinsics.c(trackingEventData.getLoggerId(), str2) && !trackingEventData.isFlushing()) {
                    trackingEventData.setFlushToken(string);
                    listC.add(trackingEventData.getEvent());
                }
            }
            return new TrackingEventFlushSession(kotlin.collections.o.a(listC), string);
        } finally {
            aVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object currentCount(@NotNull nt.b<? super Integer> bVar) {
        C06981 c06981;
        uu.a aVar;
        if (bVar instanceof C06981) {
            c06981 = (C06981) bVar;
            int i10 = c06981.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c06981.label = i10 - Integer.MIN_VALUE;
            } else {
                c06981 = new C06981(bVar);
            }
        } else {
            c06981 = new C06981(bVar);
        }
        Object obj = c06981.result;
        Object objE = c.e();
        int i11 = c06981.label;
        int i12 = 0;
        if (i11 == 0) {
            o.b(obj);
            uu.a aVar2 = this.mutex;
            c06981.L$0 = aVar2;
            c06981.I$0 = 0;
            c06981.label = 1;
            if (aVar2.f(null, c06981) == objE) {
                return objE;
            }
            aVar = aVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (uu.a) c06981.L$0;
            o.b(obj);
        }
        try {
            List<TrackingEventData> list = this.events;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (!((TrackingEventData) it.next()).isFlushing() && (i12 = i12 + 1) < 0) {
                        p.s();
                    }
                }
            }
            return pt.b.d(i12);
        } finally {
            aVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object onFlushFinished(@NotNull final String str, boolean z10, @NotNull nt.b<? super Unit> bVar) {
        C06991 c06991;
        uu.a aVar;
        if (bVar instanceof C06991) {
            c06991 = (C06991) bVar;
            int i10 = c06991.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c06991.label = i10 - Integer.MIN_VALUE;
            } else {
                c06991 = new C06991(bVar);
            }
        } else {
            c06991 = new C06991(bVar);
        }
        Object obj = c06991.result;
        Object objE = c.e();
        int i11 = c06991.label;
        if (i11 == 0) {
            o.b(obj);
            aVar = this.mutex;
            c06991.L$0 = str;
            c06991.L$1 = aVar;
            c06991.Z$0 = z10;
            c06991.I$0 = 0;
            c06991.label = 1;
            if (aVar.f(null, c06991) == objE) {
                return objE;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = c06991.Z$0;
            uu.a aVar2 = (uu.a) c06991.L$1;
            String str2 = (String) c06991.L$0;
            o.b(obj);
            aVar = aVar2;
            str = str2;
        }
        List<TrackingEventData> list = this.events;
        try {
            if (z10) {
                pt.b.a(u.F(list, new Function1() { // from class: com.withpersona.sdk2.inquiry.tracking.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(TrackingEventsCache.onFlushFinished$lambda$7$lambda$5(str, (TrackingEventsCache.TrackingEventData) obj2));
                    }
                }));
            } else {
                for (TrackingEventData trackingEventData : list) {
                    if (Intrinsics.c(trackingEventData.getFlushToken(), str)) {
                        trackingEventData.setFlushToken(null);
                    }
                }
                Unit unit = Unit.f22483a;
            }
            aVar.e(null);
            return Unit.f22483a;
        } catch (Throwable th2) {
            aVar.e(null);
            throw th2;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsCache$TrackingEventData;", "", "loggerId", "", "event", "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "flushToken", "<init>", "(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;Ljava/lang/String;)V", "getLoggerId", "()Ljava/lang/String;", "getEvent", "()Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;", "getFlushToken", "setFlushToken", "(Ljava/lang/String;)V", "isFlushing", "", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "tracking-events_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TrackingEventData {

        @NotNull
        private final TrackingEvent event;

        @Nullable
        private String flushToken;

        @NotNull
        private final String loggerId;

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
            return Intrinsics.c(this.loggerId, trackingEventData.loggerId) && Intrinsics.c(this.event, trackingEventData.event) && Intrinsics.c(this.flushToken, trackingEventData.flushToken);
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

        public /* synthetic */ TrackingEventData(String str, TrackingEvent trackingEvent, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, trackingEvent, (i10 & 4) != 0 ? null : str2);
        }
    }
}
