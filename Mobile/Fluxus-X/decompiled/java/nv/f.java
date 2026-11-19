package nv;

import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ1\u0010\u000b\u001a\u00020\u0003\"\b\b\u0001\u0010\n*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00018\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\n*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u0014\u0010\u0006\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lnv/f;", BuildConfig.FLAVOR, "K", "Lnv/g;", "Lxu/c;", "key", "value", "next", "<init>", "(Lxu/c;Ljava/lang/Object;Lnv/g;)V", "T", "b", "(Lxu/c;Ljava/lang/Object;)Lnv/g;", "a", "(Lxu/c;)Ljava/lang/Object;", BuildConfig.FLAVOR, "toString", "()Ljava/lang/String;", "Lxu/c;", "Ljava/lang/Object;", "c", "Lnv/g;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f<K> extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final xu.c<K> key;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final K value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final g next;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull xu.c<K> key, @NotNull K value, @NotNull g next) {
        super(null);
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(next, "next");
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public static final f e(f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        g gVar = it.next;
        if (gVar instanceof f) {
            return (f) gVar;
        }
        return null;
    }

    public static final CharSequence f(f it) {
        Intrinsics.checkNotNullParameter(it, "it");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(it.key);
        sb2.append('=');
        sb2.append(it.value);
        return sb2.toString();
    }

    @Override // nv.g
    @Nullable
    public <T> T a(@NotNull xu.c<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return Intrinsics.c(key, this.key) ? (T) ou.a.a(key).cast(this.value) : (T) this.next.a(key);
    }

    @Override // nv.g
    @NotNull
    public <T> g b(@NotNull xu.c<T> key, @Nullable T value) {
        g fVar;
        Intrinsics.checkNotNullParameter(key, "key");
        if (Intrinsics.c(key, this.key)) {
            fVar = this.next;
        } else {
            g gVarB = this.next.b(key, null);
            fVar = gVarB == this.next ? this : new f(this.key, this.value, gVarB);
        }
        return value != null ? new f(key, value, fVar) : fVar;
    }

    @NotNull
    public String toString() {
        return CollectionsKt.m0(CollectionsKt.y0(yu.p.z(yu.m.h(this, new Function1() { // from class: nv.d
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.e((f) obj);
            }
        }))), null, "{", "}", 0, null, new Function1() { // from class: nv.e
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.f((f) obj);
            }
        }, 25, null);
    }
}
