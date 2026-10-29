package su;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p256ku.AbstractC7888l0;
import p395qu.C10734m;

/* JADX INFO: renamed from: su.c */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m31665d2 = {"Lsu/c;", "Lsu/f;", "<init>", "()V", "", "parallelism", "", "name", "Lku/l0;", "P", "(ILjava/lang/String;)Lku/l0;", "", "close", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C11454c extends C11457f {

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final C11454c f40495i = new C11454c();

    public C11454c() {
        super(C11461j.f40507c, C11461j.f40508d, C11461j.f40509e, C11461j.f40505a);
    }

    @Override // p256ku.AbstractC7888l0
    @NotNull
    /* JADX INFO: renamed from: P */
    public AbstractC7888l0 mo32677P(int parallelism, @Nullable String name) {
        C10734m.m40890a(parallelism);
        return parallelism >= C11461j.f40507c ? C10734m.m40891b(this, name) : super.mo32677P(parallelism, name);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // p256ku.AbstractC7888l0
    @NotNull
    /* JADX INFO: renamed from: toString */
    public String getName() {
        return "Dispatchers.Default";
    }
}
