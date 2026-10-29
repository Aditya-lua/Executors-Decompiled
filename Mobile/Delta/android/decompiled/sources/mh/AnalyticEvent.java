package mh;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mh.a, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJT\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001b\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001d\u0010\u000fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Lmh/a;", "", "", "id", "", "serializedEvent", "eventName", "eventContext", "serializedParams", "retryAttemptCount", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "a", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lmh/a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "e", "b", "Ljava/lang/String;", "g", "c", "d", "h", "f", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "database_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AnalyticEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final int id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String serializedEvent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String eventName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String eventContext;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String serializedParams;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final Integer retryAttemptCount;

    public AnalyticEvent(int i10, @NotNull String serializedEvent, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(serializedEvent, "serializedEvent");
        this.id = i10;
        this.serializedEvent = serializedEvent;
        this.eventName = str;
        this.eventContext = str2;
        this.serializedParams = str3;
        this.retryAttemptCount = num;
    }

    public static /* synthetic */ AnalyticEvent b(AnalyticEvent analyticEvent, int i10, String str, String str2, String str3, String str4, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = analyticEvent.id;
        }
        if ((i11 & 2) != 0) {
            str = analyticEvent.serializedEvent;
        }
        if ((i11 & 4) != 0) {
            str2 = analyticEvent.eventName;
        }
        if ((i11 & 8) != 0) {
            str3 = analyticEvent.eventContext;
        }
        if ((i11 & 16) != 0) {
            str4 = analyticEvent.serializedParams;
        }
        if ((i11 & 32) != 0) {
            num = analyticEvent.retryAttemptCount;
        }
        String str5 = str4;
        Integer num2 = num;
        return analyticEvent.a(i10, str, str2, str3, str5, num2);
    }

    @NotNull
    public final AnalyticEvent a(int id2, @NotNull String serializedEvent, @Nullable String eventName, @Nullable String eventContext, @Nullable String serializedParams, @Nullable Integer retryAttemptCount) {
        Intrinsics.checkNotNullParameter(serializedEvent, "serializedEvent");
        return new AnalyticEvent(id2, serializedEvent, eventName, eventContext, serializedParams, retryAttemptCount);
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getEventContext() {
        return this.eventContext;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticEvent)) {
            return false;
        }
        AnalyticEvent analyticEvent = (AnalyticEvent) other;
        return this.id == analyticEvent.id && Intrinsics.c(this.serializedEvent, analyticEvent.serializedEvent) && Intrinsics.c(this.eventName, analyticEvent.eventName) && Intrinsics.c(this.eventContext, analyticEvent.eventContext) && Intrinsics.c(this.serializedParams, analyticEvent.serializedParams) && Intrinsics.c(this.retryAttemptCount, analyticEvent.retryAttemptCount);
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getRetryAttemptCount() {
        return this.retryAttemptCount;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getSerializedEvent() {
        return this.serializedEvent;
    }

    @Nullable
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getSerializedParams() {
        return this.serializedParams;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.id) * 31) + this.serializedEvent.hashCode()) * 31;
        String str = this.eventName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.eventContext;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.serializedParams;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.retryAttemptCount;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "AnalyticEvent(id=" + this.id + ", serializedEvent=" + this.serializedEvent + ", eventName=" + this.eventName + ", eventContext=" + this.eventContext + ", serializedParams=" + this.serializedParams + ", retryAttemptCount=" + this.retryAttemptCount + ")";
    }

    public /* synthetic */ AnalyticEvent(int i10, String str, String str2, String str3, String str4, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : num);
    }
}
