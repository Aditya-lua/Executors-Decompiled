package p536x5;

import android.annotation.SuppressLint;
import android.net.NetworkRequest;
import android.net.Uri;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7702q0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p146g6.NetworkRequestCompat;

/* JADX INFO: renamed from: x5.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0003&.*B1\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tB;\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u000bB_\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\b\u0010\u0012Bg\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\b\u0010\u0015B\u0011\b\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u0019J\r\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u0019J\r\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u0019J\u000f\u0010\u001d\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u0019J\u001a\u0010\u001e\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0097\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0017¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0017¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u0014\u001a\u00020\u00138\u0000X\u0081\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u0010/R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010/R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010/R\u001a\u0010\r\u001a\u00020\f8GX\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u00101\u001a\u0004\b*\u00102R\u001a\u0010\u000e\u001a\u00020\f8GX\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u00101\u001a\u0004\b&\u00102R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8GX\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u00103\u001a\u0004\b.\u00104R\u0013\u00107\u001a\u0004\u0018\u0001058F¢\u0006\u0006\u001a\u0004\b0\u00106¨\u00068"}, m31665d2 = {"Lx5/d;", "", "Lx5/x;", "requiredNetworkType", "", "requiresCharging", "requiresBatteryNotLow", "requiresStorageNotLow", "<init>", "(Lx5/x;ZZZ)V", "requiresDeviceIdle", "(Lx5/x;ZZZZ)V", "", "contentTriggerUpdateDelayMillis", "contentTriggerMaxDelayMillis", "", "Lx5/d$c;", "contentUriTriggers", "(Lx5/x;ZZZZJJLjava/util/Set;)V", "Lg6/s;", "requiredNetworkRequestCompat", "(Lg6/s;Lx5/x;ZZZZJJLjava/util/Set;)V", "other", "(Lx5/d;)V", "i", "()Z", "j", "h", "k", "g", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lx5/x;", "f", "()Lx5/x;", "b", "Lg6/s;", "e", "()Lg6/s;", "c", "Z", "d", "J", "()J", "Ljava/util/Set;", "()Ljava/util/Set;", "Landroid/net/NetworkRequest;", "()Landroid/net/NetworkRequest;", "requiredNetworkRequest", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C12694d {

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final C12694d f45224k = new C12694d(null, false, false, false, 15, null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final EnumC12734x requiredNetworkType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final NetworkRequestCompat requiredNetworkRequestCompat;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    public final boolean requiresCharging;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final boolean requiresDeviceIdle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    public final boolean requiresBatteryNotLow;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public final boolean requiresStorageNotLow;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    public final long contentTriggerUpdateDelayMillis;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    public final long contentTriggerMaxDelayMillis;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @NotNull
    public final Set<c> contentUriTriggers;

    /* JADX INFO: renamed from: x5.d$a */
    @Metadata(m31664d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0007J\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0007J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006&"}, m31665d2 = {"Lx5/d$a;", "", "<init>", "()V", "", "requiresCharging", "d", "(Z)Lx5/d$a;", "requiresDeviceIdle", "e", "Lx5/x;", "networkType", "b", "(Lx5/x;)Lx5/d$a;", "requiresBatteryNotLow", "c", "requiresStorageNotLow", "f", "Lx5/d;", "a", "()Lx5/d;", "Z", "Lg6/s;", "Lg6/s;", "requiredNetworkRequest", "Lx5/x;", "requiredNetworkType", "", "g", "J", "triggerContentUpdateDelay", "h", "triggerContentMaxDelay", "", "Lx5/d$c;", "i", "Ljava/util/Set;", "contentUriTriggers", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public boolean requiresCharging;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean requiresDeviceIdle;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public boolean requiresBatteryNotLow;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public boolean requiresStorageNotLow;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public NetworkRequestCompat requiredNetworkRequest = new NetworkRequestCompat(null, 1, null);

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public EnumC12734x requiredNetworkType = EnumC12734x.NOT_REQUIRED;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public long triggerContentUpdateDelay = -1;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public long triggerContentMaxDelay = -1;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public Set<c> contentUriTriggers = new LinkedHashSet();

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C12694d m47345a() {
            Set setQ0 = CollectionsKt.m31691Q0(this.contentUriTriggers);
            return new C12694d(this.requiredNetworkRequest, this.requiredNetworkType, this.requiresCharging, this.requiresDeviceIdle, this.requiresBatteryNotLow, this.requiresStorageNotLow, this.triggerContentUpdateDelay, this.triggerContentMaxDelay, setQ0);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final a m47346b(@NotNull EnumC12734x networkType) {
            Intrinsics.checkNotNullParameter(networkType, "networkType");
            this.requiredNetworkType = networkType;
            this.requiredNetworkRequest = new NetworkRequestCompat(null, 1, null);
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final a m47347c(boolean requiresBatteryNotLow) {
            this.requiresBatteryNotLow = requiresBatteryNotLow;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final a m47348d(boolean requiresCharging) {
            this.requiresCharging = requiresCharging;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final a m47349e(boolean requiresDeviceIdle) {
            this.requiresDeviceIdle = requiresDeviceIdle;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final a m47350f(boolean requiresStorageNotLow) {
            this.requiresStorageNotLow = requiresStorageNotLow;
            return this;
        }
    }

    /* JADX INFO: renamed from: x5.d$c */
    @Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, m31665d2 = {"Lx5/d$c;", "", "Landroid/net/Uri;", "uri", "", "isTriggeredForDescendants", "<init>", "(Landroid/net/Uri;Z)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroid/net/Uri;", "()Landroid/net/Uri;", "b", "Z", "()Z", "work-runtime_release"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Uri uri;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public final boolean isTriggeredForDescendants;

        public c(@NotNull Uri uri, boolean z10) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.uri = uri;
            this.isTriggeredForDescendants = z10;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsTriggeredForDescendants() {
            return this.isTriggeredForDescendants;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!Intrinsics.m31980c(c.class, other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.m31981d(other, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            c cVar = (c) other;
            return Intrinsics.m31980c(this.uri, cVar.uri) && this.isTriggeredForDescendants == cVar.isTriggeredForDescendants;
        }

        public int hashCode() {
            return (this.uri.hashCode() * 31) + Boolean.hashCode(this.isTriggeredForDescendants);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
      (wrap x5.x:?: TERNARY null = ((wrap int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap x5.x:0x0004: SGET  A[WRAPPED] (LINE:1) x5.x.a x5.x) : (r2v0 x5.x))
      (wrap boolean:?: TERNARY null = ((wrap int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
      (wrap boolean:?: TERNARY null = ((wrap int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
      (wrap boolean:?: TERNARY null = ((wrap int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
     A[MD:(x5.x, boolean, boolean, boolean):void (m)] (LINE:2) call: x5.d.<init>(x5.x, boolean, boolean, boolean):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C12694d(EnumC12734x enumC12734x, boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? EnumC12734x.NOT_REQUIRED : enumC12734x, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getContentTriggerMaxDelayMillis() {
        return this.contentTriggerMaxDelayMillis;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getContentTriggerUpdateDelayMillis() {
        return this.contentTriggerUpdateDelayMillis;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Set<c> m47336c() {
        return this.contentUriTriggers;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final NetworkRequest m47337d() {
        return this.requiredNetworkRequestCompat.m26851b();
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final NetworkRequestCompat getRequiredNetworkRequestCompat() {
        return this.requiredNetworkRequestCompat;
    }

    @SuppressLint({"NewApi"})
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.m31980c(C12694d.class, other.getClass())) {
            return false;
        }
        C12694d c12694d = (C12694d) other;
        if (this.requiresCharging == c12694d.requiresCharging && this.requiresDeviceIdle == c12694d.requiresDeviceIdle && this.requiresBatteryNotLow == c12694d.requiresBatteryNotLow && this.requiresStorageNotLow == c12694d.requiresStorageNotLow && this.contentTriggerUpdateDelayMillis == c12694d.contentTriggerUpdateDelayMillis && this.contentTriggerMaxDelayMillis == c12694d.contentTriggerMaxDelayMillis && Intrinsics.m31980c(m47337d(), c12694d.m47337d()) && this.requiredNetworkType == c12694d.requiredNetworkType) {
            return Intrinsics.m31980c(this.contentUriTriggers, c12694d.contentUriTriggers);
        }
        return false;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final EnumC12734x getRequiredNetworkType() {
        return this.requiredNetworkType;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m47340g() {
        return !this.contentUriTriggers.isEmpty();
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getRequiresBatteryNotLow() {
        return this.requiresBatteryNotLow;
    }

    @SuppressLint({"NewApi"})
    public int hashCode() {
        int iHashCode = ((((((((this.requiredNetworkType.hashCode() * 31) + (this.requiresCharging ? 1 : 0)) * 31) + (this.requiresDeviceIdle ? 1 : 0)) * 31) + (this.requiresBatteryNotLow ? 1 : 0)) * 31) + (this.requiresStorageNotLow ? 1 : 0)) * 31;
        long j10 = this.contentTriggerUpdateDelayMillis;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.contentTriggerMaxDelayMillis;
        int iHashCode2 = (((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.contentUriTriggers.hashCode()) * 31;
        NetworkRequest networkRequestM47337d = m47337d();
        return iHashCode2 + (networkRequestM47337d != null ? networkRequestM47337d.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getRequiresCharging() {
        return this.requiresCharging;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getRequiresDeviceIdle() {
        return this.requiresDeviceIdle;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getRequiresStorageNotLow() {
        return this.requiresStorageNotLow;
    }

    @SuppressLint({"NewApi"})
    @NotNull
    public String toString() {
        return "Constraints{requiredNetworkType=" + this.requiredNetworkType + ", requiresCharging=" + this.requiresCharging + ", requiresDeviceIdle=" + this.requiresDeviceIdle + ", requiresBatteryNotLow=" + this.requiresBatteryNotLow + ", requiresStorageNotLow=" + this.requiresStorageNotLow + ", contentTriggerUpdateDelayMillis=" + this.contentTriggerUpdateDelayMillis + ", contentTriggerMaxDelayMillis=" + this.contentTriggerMaxDelayMillis + ", contentUriTriggers=" + this.contentUriTriggers + ", }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"NewApi"})
    public C12694d(@NotNull EnumC12734x requiredNetworkType, boolean z10, boolean z11, boolean z12) {
        this(requiredNetworkType, z10, false, z11, z12);
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C12694d(@NotNull EnumC12734x requiredNetworkType, boolean z10, boolean z11, boolean z12, boolean z13) {
        this(requiredNetworkType, z10, z11, z12, z13, -1L, 0L, null, 192, null);
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0038: CONSTRUCTOR 
      (wrap x5.x:?: TERNARY null = ((wrap int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap x5.x:0x0004: SGET  A[WRAPPED] (LINE:5) x5.x.a x5.x) : (r3v0 x5.x))
      (wrap boolean:?: TERNARY null = ((wrap int:0x0006: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
      (wrap boolean:?: TERNARY null = ((wrap int:0x000c: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
      (wrap boolean:?: TERNARY null = ((wrap int:0x0011: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r6v0 boolean))
      (wrap boolean:?: TERNARY null = ((wrap int:0x0016: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
      (wrap long:?: TERNARY null = ((wrap int:0x001b: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r8v0 long))
      (wrap long:?: TERNARY null = ((wrap int:0x0022: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r10v0 long))
      (wrap java.util.Set:?: TERNARY null = ((wrap int:0x0027: ARITH (r13v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap java.util.Set:0x002b: INVOKE  STATIC call: kotlin.collections.q0.d():java.util.Set A[MD:<T>:():java.util.Set<T> (m), WRAPPED] (LINE:6)) : (r12v0 java.util.Set))
     A[MD:(x5.x, boolean, boolean, boolean, boolean, long, long, java.util.Set<x5.d$c>):void (m)] (LINE:7) call: x5.d.<init>(x5.x, boolean, boolean, boolean, boolean, long, long, java.util.Set):void type: THIS */
    public /* synthetic */ C12694d(EnumC12734x enumC12734x, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, Set set, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? EnumC12734x.NOT_REQUIRED : enumC12734x, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12, (i10 & 16) != 0 ? false : z13, (i10 & 32) != 0 ? -1L : j10, (i10 & 64) != 0 ? -1L : j11, (i10 & 128) != 0 ? C7702q0.m31908d() : set);
    }

    public C12694d(@NotNull EnumC12734x requiredNetworkType, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, @NotNull Set<c> contentUriTriggers) {
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
        Intrinsics.checkNotNullParameter(contentUriTriggers, "contentUriTriggers");
        this.requiredNetworkRequestCompat = new NetworkRequestCompat(null, 1, null);
        this.requiredNetworkType = requiredNetworkType;
        this.requiresCharging = z10;
        this.requiresDeviceIdle = z11;
        this.requiresBatteryNotLow = z12;
        this.requiresStorageNotLow = z13;
        this.contentTriggerUpdateDelayMillis = j10;
        this.contentTriggerMaxDelayMillis = j11;
        this.contentUriTriggers = contentUriTriggers;
    }

    public C12694d(@NotNull NetworkRequestCompat requiredNetworkRequestCompat, @NotNull EnumC12734x requiredNetworkType, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, @NotNull Set<c> contentUriTriggers) {
        Intrinsics.checkNotNullParameter(requiredNetworkRequestCompat, "requiredNetworkRequestCompat");
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
        Intrinsics.checkNotNullParameter(contentUriTriggers, "contentUriTriggers");
        this.requiredNetworkRequestCompat = requiredNetworkRequestCompat;
        this.requiredNetworkType = requiredNetworkType;
        this.requiresCharging = z10;
        this.requiresDeviceIdle = z11;
        this.requiresBatteryNotLow = z12;
        this.requiresStorageNotLow = z13;
        this.contentTriggerUpdateDelayMillis = j10;
        this.contentTriggerMaxDelayMillis = j11;
        this.contentUriTriggers = contentUriTriggers;
    }

    @SuppressLint({"NewApi"})
    public C12694d(@NotNull C12694d other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.requiresCharging = other.requiresCharging;
        this.requiresDeviceIdle = other.requiresDeviceIdle;
        this.requiredNetworkRequestCompat = other.requiredNetworkRequestCompat;
        this.requiredNetworkType = other.requiredNetworkType;
        this.requiresBatteryNotLow = other.requiresBatteryNotLow;
        this.requiresStorageNotLow = other.requiresStorageNotLow;
        this.contentUriTriggers = other.contentUriTriggers;
        this.contentTriggerUpdateDelayMillis = other.contentTriggerUpdateDelayMillis;
        this.contentTriggerMaxDelayMillis = other.contentTriggerMaxDelayMillis;
    }
}
