package p433sf;

import androidx.annotation.NonNull;
import p410rf.InterfaceC10869e;
import p433sf.InterfaceC11292b;

/* JADX INFO: renamed from: sf.b */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC11292b<T extends InterfaceC11292b<T>> {
    @NonNull
    <U> T registerEncoder(@NonNull Class<U> cls, @NonNull InterfaceC10869e<? super U> interfaceC10869e);
}
