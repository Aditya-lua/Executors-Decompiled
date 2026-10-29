package su;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p256ku.AbstractC7888l0;
import p395qu.C10734m;

/* JADX INFO: renamed from: su.k */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m31665d2 = {"Lsu/k;", "Lku/l0;", "<init>", "()V", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "F", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "w", "", "parallelism", "", "name", "P", "(ILjava/lang/String;)Lku/l0;", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C11462k extends AbstractC7888l0 {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final C11462k f40511c = new C11462k();

    @Override // p256ku.AbstractC7888l0
    /* JADX INFO: renamed from: F */
    public void mo32792F(@NotNull CoroutineContext context, @NotNull Runnable block) {
        C11454c.f40495i.m42916Z(block, true, true);
    }

    @Override // p256ku.AbstractC7888l0
    @NotNull
    /* JADX INFO: renamed from: P */
    public AbstractC7888l0 mo32677P(int parallelism, @Nullable String name) {
        C10734m.m40890a(parallelism);
        return parallelism >= C11461j.f40508d ? C10734m.m40891b(this, name) : super.mo32677P(parallelism, name);
    }

    @Override // p256ku.AbstractC7888l0
    @NotNull
    /* JADX INFO: renamed from: toString */
    public String getName() {
        return "Dispatchers.IO";
    }

    @Override // p256ku.AbstractC7888l0
    /* JADX INFO: renamed from: w */
    public void mo6246w(@NotNull CoroutineContext context, @NotNull Runnable block) {
        C11454c.f40495i.m42916Z(block, true, false);
    }
}
