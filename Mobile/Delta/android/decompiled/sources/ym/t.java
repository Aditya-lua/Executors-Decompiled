package ym;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lu.r0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\rR$\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0010\"\u0004\b\u0011\u0010\u0005¨\u0006\u0013"}, d2 = {"Lym/t;", "Lym/r;", "", "initialValue", "<init>", "(Ljava/lang/String;)V", "Llu/c0;", "a", "Llu/c0;", "_textValue", "Llu/h;", "b", "Llu/h;", "()Llu/h;", "onTextChanged", "value", "()Ljava/lang/String;", "c", "textValue", "wf1-core-common"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class t implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final lu.c0<String> _textValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final lu.h<String> onTextChanged;

    public t(@NotNull String initialValue) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        lu.c0<String> c0VarA = r0.a(initialValue);
        this._textValue = c0VarA;
        this.onTextChanged = lu.j.n(c0VarA, 1);
    }

    @Override // ym.r
    @NotNull
    public lu.h<String> a() {
        return this.onTextChanged;
    }

    @Override // ym.r
    @NotNull
    public String b() {
        return this._textValue.getValue();
    }

    @Override // ym.r
    public void c(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._textValue.setValue(value);
    }
}
