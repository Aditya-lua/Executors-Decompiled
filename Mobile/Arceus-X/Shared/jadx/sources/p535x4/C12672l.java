package p535x4;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nu.C9596r0;
import nu.InterfaceC9566c0;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7334d;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10342d;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: x4.l */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012¨\u0006\u0014"}, m31665d2 = {"Lx4/l;", "", "", "size", "<init>", "(I)V", "", "tableIds", "", "b", "(Ljava/util/Set;)V", "Lnu/i;", "", "collector", "", "a", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "Lnu/c0;", "Lnu/c0;", "versions", "room-runtime"}, m31666k = 1, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C12672l {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9566c0<int[]> versions;

    /* JADX INFO: renamed from: x4.l$a */
    @InterfaceC10344f(m39663c = "androidx.room.ObservedTableVersions", m39664f = "InvalidationTracker.kt", m39665l = {638}, m39666m = "collect")
    @Metadata(m31666k = 3, m31667mv = {2, 1, 0}, m31669xi = 48)
    public static final class a extends AbstractC10342d {

        /* JADX INFO: renamed from: t */
        public /* synthetic */ Object f45047t;

        /* JADX INFO: renamed from: v */
        public int f45049v;

        public a(InterfaceC9557b<? super a> interfaceC9557b) {
            super(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f45047t = obj;
            this.f45049v |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            return C12672l.this.m47192a(null, this);
        }
    }

    public C12672l(int i10) {
        this.versions = C9596r0.m37859a(new int[i10]);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public final Object m47192a(@NotNull InterfaceC9577i<? super int[]> interfaceC9577i, @NotNull InterfaceC9557b<?> interfaceC9557b) {
        a aVar;
        if (interfaceC9557b instanceof a) {
            aVar = (a) interfaceC9557b;
            int i10 = aVar.f45049v;
            if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                aVar.f45049v = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
            } else {
                aVar = new a(interfaceC9557b);
            }
        } else {
            aVar = new a(interfaceC9557b);
        }
        Object obj = aVar.f45047t;
        Object objM38805e = C10047c.m38805e();
        int i11 = aVar.f45049v;
        if (i11 == 0) {
            C7348o.m30470b(obj);
            InterfaceC9566c0<int[]> interfaceC9566c0 = this.versions;
            aVar.f45049v = 1;
            if (interfaceC9566c0.collect(interfaceC9577i, aVar) == objM38805e) {
                return objM38805e;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
        }
        throw new C7334d();
    }

    /* JADX INFO: renamed from: b */
    public final void m47193b(@NotNull Set<Integer> tableIds) {
        int[] value;
        int[] iArr;
        Intrinsics.checkNotNullParameter(tableIds, "tableIds");
        if (tableIds.isEmpty()) {
            return;
        }
        InterfaceC9566c0<int[]> interfaceC9566c0 = this.versions;
        do {
            value = interfaceC9566c0.getValue();
            int[] iArr2 = value;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = tableIds.contains(Integer.valueOf(i10)) ? iArr2[i10] + 1 : iArr2[i10];
            }
        } while (!interfaceC9566c0.mo37710i(value, iArr));
    }
}
