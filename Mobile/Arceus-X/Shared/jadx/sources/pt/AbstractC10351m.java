package pt;

import kotlin.Metadata;
import kotlin.jvm.internal.C7731d0;
import kotlin.jvm.internal.InterfaceC7740i;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p315nt.InterfaceC9557b;

/* JADX INFO: renamed from: pt.m */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b!\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31665d2 = {"Lpt/m;", "Lpt/d;", "Lkotlin/jvm/internal/i;", "", "", "arity", "Lnt/b;", "completion", "<init>", "(ILnt/b;)V", "(I)V", "", "toString", "()Ljava/lang/String;", "I", "getArity", "()I", "kotlin-stdlib"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public abstract class AbstractC10351m extends AbstractC10342d implements InterfaceC7740i<Object> {
    private final int arity;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC10351m(int i10, @Nullable InterfaceC9557b<Object> interfaceC9557b) {
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

    public AbstractC10351m(int i10) {
        this(i10, null);
    }
}
