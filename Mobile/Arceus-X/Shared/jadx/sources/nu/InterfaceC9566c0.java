package nu;

import kotlin.Metadata;

/* JADX INFO: renamed from: nu.c0 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\r\u001a\u00028\u00008&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m31665d2 = {"Lnu/c0;", "T", "Lnu/p0;", "Lnu/b0;", "expect", "update", "", "i", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "value", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public interface InterfaceC9566c0<T> extends InterfaceC9592p0<T>, InterfaceC9564b0<T> {
    @Override // nu.InterfaceC9592p0
    T getValue();

    /* JADX INFO: renamed from: i */
    boolean mo37710i(T expect, T update);

    void setValue(T t8);
}
