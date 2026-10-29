package us;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p388qn.AbstractC10623s;

/* JADX INFO: renamed from: us.l */
/* JADX INFO: loaded from: classes3.dex */
public class C11946l implements InterfaceC11945k {

    /* JADX INFO: renamed from: a */
    public final Map<Class<? extends AbstractC10623s>, InterfaceC11954t> f42368a;

    /* JADX INFO: renamed from: us.l$a */
    public static class a implements InterfaceC11945k.a {

        /* JADX INFO: renamed from: a */
        public final Map<Class<? extends AbstractC10623s>, InterfaceC11954t> f42369a = new HashMap(3);

        @Override // us.InterfaceC11945k.a
        @NonNull
        /* JADX INFO: renamed from: a */
        public <N extends AbstractC10623s> InterfaceC11945k.a mo44587a(@NonNull Class<N> cls, InterfaceC11954t interfaceC11954t) {
            if (interfaceC11954t == null) {
                this.f42369a.remove(cls);
                return this;
            }
            this.f42369a.put(cls, interfaceC11954t);
            return this;
        }

        @Override // us.InterfaceC11945k.a
        @NonNull
        public InterfaceC11945k build() {
            return new C11946l(Collections.unmodifiableMap(this.f42369a));
        }
    }

    public C11946l(@NonNull Map<Class<? extends AbstractC10623s>, InterfaceC11954t> map) {
        this.f42368a = map;
    }

    @Override // us.InterfaceC11945k
    /* JADX INFO: renamed from: a */
    public <N extends AbstractC10623s> InterfaceC11954t mo44586a(@NonNull Class<N> cls) {
        return this.f42368a.get(cls);
    }
}
