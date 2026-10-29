package p016an;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nu.C9579j;
import nu.C9596r0;
import nu.InterfaceC9566c0;
import nu.InterfaceC9575h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: an.t */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\rR$\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0010\"\u0004\b\u0011\u0010\u0005¨\u0006\u0013"}, m31665d2 = {"Lan/t;", "Lan/r;", "", "initialValue", "<init>", "(Ljava/lang/String;)V", "Lnu/c0;", "a", "Lnu/c0;", "_textValue", "Lnu/h;", "b", "Lnu/h;", "()Lnu/h;", "onTextChanged", "value", "()Ljava/lang/String;", "c", "textValue", "wf1-core-common"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C0391t implements InterfaceC0389r {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9566c0<String> _textValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9575h<String> onTextChanged;

    public C0391t(@NotNull String initialValue) {
        Intrinsics.checkNotNullParameter(initialValue, "initialValue");
        InterfaceC9566c0<String> interfaceC9566c0M37859a = C9596r0.m37859a(initialValue);
        this._textValue = interfaceC9566c0M37859a;
        this.onTextChanged = C9579j.m37797n(interfaceC9566c0M37859a, 1);
    }

    @Override // p016an.InterfaceC0389r
    @NotNull
    /* JADX INFO: renamed from: a */
    public InterfaceC9575h<String> mo1449a() {
        return this.onTextChanged;
    }

    @Override // p016an.InterfaceC0389r
    @NotNull
    /* JADX INFO: renamed from: b */
    public String mo1450b() {
        return this._textValue.getValue();
    }

    @Override // p016an.InterfaceC0389r
    /* JADX INFO: renamed from: c */
    public void mo1451c(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this._textValue.setValue(value);
    }
}
