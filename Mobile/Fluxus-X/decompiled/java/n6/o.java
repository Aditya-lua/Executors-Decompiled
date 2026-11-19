package n6;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tJ!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Ln6/o;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "mimeType", "Lew/g;", Payload.SOURCE, BuildConfig.FLAVOR, "e", "(Ljava/lang/String;Lew/g;)Z", "a", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f25443a;

    @NotNull
    public static final o b = new o() { // from class: n6.l
        @Override // n6.o
        public final boolean e(String str, ew.g gVar) {
            return o.c(str, gVar);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final o f25441c = new o() { // from class: n6.m
        @Override // n6.o
        public final boolean e(String str, ew.g gVar) {
            return o.b(str, gVar);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final o f25442d = new o() { // from class: n6.n
        @Override // n6.o
        public final boolean e(String str, ew.g gVar) {
            return o.a(str, gVar);
        }
    };

    /* JADX INFO: renamed from: n6.o$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001R\u0017\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\u0001R\u0017\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\u0001¨\u0006\t"}, d2 = {"Ln6/o$a;", BuildConfig.FLAVOR, "<init>", "()V", "Ln6/o;", "IGNORE", "Ln6/o;", "RESPECT_PERFORMANCE", "RESPECT_ALL", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f25443a = new Companion();
    }

    static boolean a(String str, ew.g gVar) {
        return true;
    }

    static boolean b(String str, ew.g gVar) {
        if (str != null) {
            return Intrinsics.c(str, "image/jpeg") || Intrinsics.c(str, "image/webp") || Intrinsics.c(str, "image/heic") || Intrinsics.c(str, "image/heif");
        }
        return false;
    }

    static boolean c(String str, ew.g gVar) {
        return false;
    }

    boolean e(@Nullable String mimeType, @NotNull ew.g source);
}
