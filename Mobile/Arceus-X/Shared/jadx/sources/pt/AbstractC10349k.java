package pt;

import kotlin.Metadata;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.InterfaceC7740i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: pt.k */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b!\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"Lpt/k;", "Lpt/j;", "Lkotlin/jvm/internal/i;", "", "", "arity", "Lnt/b;", "completion", "<init>", "(ILnt/b;)V", "", "toString", "()Ljava/lang/String;", "t", "I", "getArity", "()I", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class AbstractC10349k extends AbstractC10348j implements InterfaceC7740i<Object> {

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final int arity;

    public AbstractC10349k(int i10, @Nullable InterfaceC9557b<Object> interfaceC9557b) {
        super(interfaceC9557b);
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.InterfaceC7740i
    public int getArity() {
        return this.arity;
    }

    @Override // pt.AbstractC10339a
    @NotNull
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strM32009i = C7731d0.m32009i(this);
        Intrinsics.checkNotNullExpressionValue(strM32009i, "renderLambdaToString(...)");
        return strM32009i;
    }
}
