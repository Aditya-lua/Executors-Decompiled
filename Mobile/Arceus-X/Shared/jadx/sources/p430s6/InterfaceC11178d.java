package p430s6;

import android.content.Context;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p096e7.C4852d;
import p096e7.C4854e;
import p239k6.InterfaceC7474n;

/* JADX INFO: renamed from: s6.d */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001:\u0003\u0014\u0019\u0005J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H¦\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH&¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\f\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\u00020\u000b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0012\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\u000b8&X§\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, m31665d2 = {"Ls6/d;", "", "Ls6/d$b;", "key", "Ls6/d$c;", "a", "(Ls6/d$b;)Ls6/d$c;", "value", "", "h", "(Ls6/d$b;Ls6/d$c;)V", "", "size", "g", "(J)V", "clear", "()V", "i", "()J", "e", "b", "maxSize", "d", "getInitialMaxSize$annotations", "initialMaxSize", "c", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InterfaceC11178d {

    /* JADX INFO: renamed from: s6.d$a */
    @Metadata(m31664d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\u00002\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0014¨\u0006\u0017"}, m31665d2 = {"Ls6/d$a;", "", "<init>", "()V", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "context", "", "percent", "c", "(Landroid/content/Context;D)Ls6/d$a;", "Ls6/d;", "b", "()Ls6/d;", "Lkotlin/Function0;", "", "a", "Lkotlin/jvm/functions/Function0;", "maxSizeBytesFactory", "", "Z", "strongReferencesEnabled", "weakReferencesEnabled", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public Function0<Long> maxSizeBytesFactory;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean strongReferencesEnabled = true;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public boolean weakReferencesEnabled = true;

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ a m42102d(a aVar, Context context, double d10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                d10 = C4854e.m23425a(context);
            }
            return aVar.m42105c(context, d10);
        }

        /* JADX INFO: renamed from: e */
        public static final long m42103e(double d10, Context context) {
            return (long) (d10 * C4854e.m23431g(context));
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final InterfaceC11178d m42104b() {
            InterfaceC11183i c11175a;
            InterfaceC11184j c11182h = this.weakReferencesEnabled ? new C11182h() : new C11176b();
            if (this.strongReferencesEnabled) {
                Function0<Long> function0 = this.maxSizeBytesFactory;
                if (function0 == null) {
                    throw new IllegalStateException("maxSizeBytesFactory == null");
                }
                c11175a = new C11181g(function0.invoke().longValue(), c11182h);
            } else {
                c11175a = new C11175a(c11182h);
            }
            return new C11180f(c11175a, c11182h);
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final a m42105c(@NotNull final Context context, final double percent) {
            if (0.0d > percent || percent > 1.0d) {
                throw new IllegalArgumentException("percent must be in the range [0.0, 1.0].");
            }
            this.maxSizeBytesFactory = new Function0() { // from class: s6.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Long.valueOf(InterfaceC11178d.a.m42103e(percent, context));
                }
            };
            return this;
        }
    }

    /* JADX INFO: renamed from: s6.d$b, reason: from toString */
    @Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0010R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, m31665d2 = {"Ls6/d$b;", "", "", "key", "", "extras", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getKey", "b", "Ljava/util/Map;", "()Ljava/util/Map;", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Key {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final String key;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final Map<String, String> extras;

        public Key(@NotNull String str, @NotNull Map<String, String> map) {
            this.key = str;
            this.extras = C4852d.m23424d(map);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Map<String, String> m42106a() {
            return this.extras;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Key)) {
                return false;
            }
            Key key = (Key) other;
            return Intrinsics.m31980c(this.key, key.key) && Intrinsics.m31980c(this.extras, key.extras);
        }

        public int hashCode() {
            return (this.key.hashCode() * 31) + this.extras.hashCode();
        }

        @NotNull
        public String toString() {
            return "Key(key=" + this.key + ", extras=" + this.extras + ')';
        }
    }

    /* JADX INFO: renamed from: s6.d$c, reason: from toString */
    @Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, m31665d2 = {"Ls6/d$c;", "", "Lk6/n;", "image", "", "", "extras", "<init>", "(Lk6/n;Ljava/util/Map;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Lk6/n;", "b", "()Lk6/n;", "Ljava/util/Map;", "()Ljava/util/Map;", "coil-core_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Value {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final InterfaceC7474n image;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final Map<String, Object> extras;

        public Value(@NotNull InterfaceC7474n interfaceC7474n, @NotNull Map<String, ? extends Object> map) {
            this.image = interfaceC7474n;
            this.extras = C4852d.m23424d(map);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Map<String, Object> m42107a() {
            return this.extras;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC7474n getImage() {
            return this.image;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Value)) {
                return false;
            }
            Value value = (Value) other;
            return Intrinsics.m31980c(this.image, value.image) && Intrinsics.m31980c(this.extras, value.extras);
        }

        public int hashCode() {
            return (this.image.hashCode() * 31) + this.extras.hashCode();
        }

        @NotNull
        public String toString() {
            return "Value(image=" + this.image + ", extras=" + this.extras + ')';
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    Value mo42094a(@NotNull Key key);

    /* JADX INFO: renamed from: b */
    void mo42095b(long j10);

    void clear();

    /* JADX INFO: renamed from: d */
    long mo42096d();

    /* JADX INFO: renamed from: e */
    long mo42097e();

    /* JADX INFO: renamed from: g */
    void mo42098g(long size);

    /* JADX INFO: renamed from: h */
    void mo42099h(@NotNull Key key, @NotNull Value value);

    /* JADX INFO: renamed from: i */
    long mo42100i();
}
