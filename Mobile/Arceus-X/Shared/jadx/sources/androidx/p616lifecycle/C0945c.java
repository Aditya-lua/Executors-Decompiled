package androidx.p616lifecycle;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p348p1.C10146t;

/* JADX INFO: renamed from: androidx.lifecycle.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u0010"}, m31665d2 = {"Landroidx/lifecycle/c;", "V", "", "initialValue", "<init>", "(Ljava/lang/Object;)V", "b", "()Ljava/lang/Object;", "expectedValue", "newValue", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "base", "lifecycle-common"}, m31666k = 1, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class C0945c<V> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AtomicReference<V> base;

    public C0945c(V v5) {
        this.base = new AtomicReference<>(v5);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4891a(V expectedValue, V newValue) {
        return C10146t.m39085a(this.base, expectedValue, newValue);
    }

    /* JADX INFO: renamed from: b */
    public final V m4892b() {
        return this.base.get();
    }
}
