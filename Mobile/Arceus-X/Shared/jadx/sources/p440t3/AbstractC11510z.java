package p440t3;

import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p256ku.C7945z;
import p256ku.InterfaceC7937x;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p478uu.C11976g;
import p478uu.InterfaceC11970a;
import pt.AbstractC10342d;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: t3.z */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H¤@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u000f"}, m31665d2 = {"Lt3/z;", "", "<init>", "()V", "", "b", "(Lnt/b;)Ljava/lang/Object;", "a", "c", "Luu/a;", "Luu/a;", "runMutex", "Lku/x;", "Lku/x;", "didRun", "datastore-core_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
public abstract class AbstractC11510z {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC11970a runMutex = C11976g.m44697b(false, 1, null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7937x<Unit> didRun = C7945z.m32935c(null, 1, null);

    /* JADX INFO: renamed from: t3.z$a */
    @InterfaceC10344f(m39663c = "androidx.datastore.core.RunOnce", m39664f = "DataStoreImpl.kt", m39665l = {544, 497}, m39666m = "runIfNeeded")
    @Metadata(m31666k = 3, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static final class a extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public Object f40781t;

        /* JADX INFO: renamed from: u */
        public Object f40782u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f40783v;

        /* JADX INFO: renamed from: x */
        public int f40785x;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f40783v = obj;
            this.f40785x |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return AbstractC11510z.this.m43073c(this);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Object m43072a(@NotNull InterfaceC9557b<? super Unit> interfaceC9557b) {
        Object objMo32927B = this.didRun.mo32927B(interfaceC9557b);
        return objMo32927B == C10047c.m38805e() ? objMo32927B : Unit.f29331a;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public abstract Object mo43025b(@NotNull InterfaceC9557b<? super Unit> interfaceC9557b);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: c */
    public final Object m43073c(@NotNull InterfaceC9557b<? super Unit> interfaceC9557b) throws Throwable {
        a aVar;
        InterfaceC11970a interfaceC11970a;
        AbstractC11510z abstractC11510z;
        InterfaceC11970a interfaceC11970a2;
        Throwable th2;
        AbstractC11510z abstractC11510z2;
        if (interfaceC9557b instanceof a) {
            aVar = (a) interfaceC9557b;
            int i10 = aVar.f40785x;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                aVar.f40785x = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                aVar = new a(interfaceC9557b);
            }
        } else {
            aVar = new a(interfaceC9557b);
        }
        Object obj = aVar.f40783v;
        Object objM38805e = C10047c.m38805e();
        int i11 = aVar.f40785x;
        try {
            if (i11 == 0) {
                C7348o.m30470b(obj);
                if (this.didRun.mo32598d()) {
                    return Unit.f29331a;
                }
                interfaceC11970a = this.runMutex;
                aVar.f40781t = this;
                aVar.f40782u = interfaceC11970a;
                aVar.f40785x = 1;
                if (interfaceC11970a.mo44674f(null, aVar) != objM38805e) {
                    abstractC11510z = this;
                }
                return objM38805e;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC11970a2 = (InterfaceC11970a) aVar.f40782u;
                abstractC11510z2 = (AbstractC11510z) aVar.f40781t;
                try {
                    C7348o.m30470b(obj);
                    InterfaceC7937x<Unit> interfaceC7937x = abstractC11510z2.didRun;
                    Unit unit = Unit.f29331a;
                    interfaceC7937x.mo32930s(unit);
                    interfaceC11970a2.mo44673e(null);
                    return unit;
                } catch (Throwable th3) {
                    th2 = th3;
                    interfaceC11970a2.mo44673e(null);
                    throw th2;
                }
            }
            InterfaceC11970a interfaceC11970a3 = (InterfaceC11970a) aVar.f40782u;
            abstractC11510z = (AbstractC11510z) aVar.f40781t;
            C7348o.m30470b(obj);
            interfaceC11970a = interfaceC11970a3;
            if (abstractC11510z.didRun.mo32598d()) {
                Unit unit2 = Unit.f29331a;
                interfaceC11970a.mo44673e(null);
                return unit2;
            }
            aVar.f40781t = abstractC11510z;
            aVar.f40782u = interfaceC11970a;
            aVar.f40785x = 2;
            if (abstractC11510z.mo43025b(aVar) != objM38805e) {
                interfaceC11970a2 = interfaceC11970a;
                abstractC11510z2 = abstractC11510z;
                InterfaceC7937x<Unit> interfaceC7937x2 = abstractC11510z2.didRun;
                Unit unit3 = Unit.f29331a;
                interfaceC7937x2.mo32930s(unit3);
                interfaceC11970a2.mo44673e(null);
                return unit3;
            }
            return objM38805e;
        } catch (Throwable th4) {
            interfaceC11970a2 = interfaceC11970a;
            th2 = th4;
            interfaceC11970a2.mo44673e(null);
            throw th2;
        }
    }
}
