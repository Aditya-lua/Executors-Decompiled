package il;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.roblox.protocols.designfoundationsplatforminterface.generated.ColorTokenVariants;
import com.roblox.protocols.designfoundationsplatforminterface.generated.DesignTokens;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7688j0;
import kotlin.collections.C7690k0;
import kotlin.jvm.internal.Intrinsics;
import nu.C9596r0;
import nu.InterfaceC9566c0;
import nu.InterfaceC9575h;
import nu.InterfaceC9577i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7348o;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import pt.AbstractC10342d;
import pt.C10350l;
import pt.InterfaceC10344f;

/* JADX INFO: renamed from: il.d */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0003J/\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000f2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R&\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m31665d2 = {"Lil/d;", "Lil/c;", "<init>", "()V", "", "key", "Lil/a;", "b", "(Ljava/lang/String;)Lil/a;", "Lcom/roblox/protocols/designfoundationsplatforminterface/generated/DesignTokens;", "colorTokens", "", "e", "(Lcom/roblox/protocols/designfoundationsplatforminterface/generated/DesignTokens;)V", "d", "", "Lcom/roblox/protocols/designfoundationsplatforminterface/generated/ColorTokenVariants;", "f", "(Ljava/util/Map;)Ljava/util/Map;", "Lnu/c0;", "a", "Lnu/c0;", "_tokenMap", "Lnu/h;", "Lnu/h;", "()Lnu/h;", "tokenUpdates", "", "c", "()Z", "hasTokens", "universalapp_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C6819d implements InterfaceC6818c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9566c0<Map<String, AndroidColorToken>> _tokenMap;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC9575h<Unit> tokenUpdates;

    /* JADX INFO: renamed from: il.d$a */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lnu/h;", "Lnu/i;", "collector", "", "collect", "(Lnu/i;Lnt/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a implements InterfaceC9575h<Unit> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC9575h f26778a;

        /* JADX INFO: renamed from: il.d$a$a, reason: collision with other inner class name */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final class C14190a<T> implements InterfaceC9577i {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC9577i f26779a;

            /* JADX INFO: renamed from: il.d$a$a$a, reason: collision with other inner class name */
            @InterfaceC10344f(m39663c = "com.roblox.protocols.designfoundations.DesignFoundationsPlatformHandler$special$$inlined$map$1$2", m39664f = "DesignFoundationsPlatformHandler.kt", m39665l = {50}, m39666m = "emit", m39667v = 1)
            @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
            public static final class C14191a extends AbstractC10342d {

                /* JADX INFO: renamed from: A */
                public int f26780A;

                /* JADX INFO: renamed from: t */
                public /* synthetic */ Object f26781t;

                /* JADX INFO: renamed from: u */
                public int f26782u;

                /* JADX INFO: renamed from: v */
                public Object f26783v;

                /* JADX INFO: renamed from: x */
                public Object f26785x;

                /* JADX INFO: renamed from: y */
                public Object f26786y;

                /* JADX INFO: renamed from: z */
                public Object f26787z;

                public C14191a(InterfaceC9557b interfaceC9557b) {
                    super(interfaceC9557b);
                }

                @Override // pt.AbstractC10339a
                public final Object invokeSuspend(Object obj) {
                    this.f26781t = obj;
                    this.f26782u |= EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    return C14190a.this.emit(null, this);
                }
            }

            public C14190a(InterfaceC9577i interfaceC9577i) {
                this.f26779a = interfaceC9577i;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // nu.InterfaceC9577i
            public final Object emit(Object obj, InterfaceC9557b interfaceC9557b) {
                C14191a c14191a;
                if (interfaceC9557b instanceof C14191a) {
                    c14191a = (C14191a) interfaceC9557b;
                    int i10 = c14191a.f26782u;
                    if ((i10 & EditorInfoCompat.IME_FLAG_FORCE_ASCII) != 0) {
                        c14191a.f26782u = i10 - EditorInfoCompat.IME_FLAG_FORCE_ASCII;
                    } else {
                        c14191a = new C14191a(interfaceC9557b);
                    }
                } else {
                    c14191a = new C14191a(interfaceC9557b);
                }
                Object obj2 = c14191a.f26781t;
                Object objM38805e = C10047c.m38805e();
                int i11 = c14191a.f26782u;
                if (i11 == 0) {
                    C7348o.m30470b(obj2);
                    InterfaceC9577i interfaceC9577i = this.f26779a;
                    Unit unit = Unit.f29331a;
                    c14191a.f26783v = C10350l.m39676a(obj);
                    c14191a.f26785x = C10350l.m39676a(c14191a);
                    c14191a.f26786y = C10350l.m39676a(obj);
                    c14191a.f26787z = C10350l.m39676a(interfaceC9577i);
                    c14191a.f26780A = 0;
                    c14191a.f26782u = 1;
                    if (interfaceC9577i.emit(unit, c14191a) == objM38805e) {
                        return objM38805e;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7348o.m30470b(obj2);
                }
                return Unit.f29331a;
            }
        }

        public a(InterfaceC9575h interfaceC9575h) {
            this.f26778a = interfaceC9575h;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [nu.i, nt.b] */
        @Override // nu.InterfaceC9575h
        public Object collect(InterfaceC9577i<? super Unit> interfaceC9577i, InterfaceC9557b interfaceC9557b) {
            Object objCollect = this.f26778a.collect(new C14190a(interfaceC9577i), interfaceC9557b);
            return objCollect == C10047c.m38805e() ? objCollect : Unit.f29331a;
        }
    }

    public C6819d() {
        InterfaceC9566c0<Map<String, AndroidColorToken>> interfaceC9566c0M37859a = C9596r0.m37859a(C7690k0.m31795j());
        this._tokenMap = interfaceC9566c0M37859a;
        this.tokenUpdates = new a(interfaceC9566c0M37859a);
    }

    @Override // il.InterfaceC6818c
    @NotNull
    /* JADX INFO: renamed from: a */
    public InterfaceC9575h<Unit> mo29190a() {
        return this.tokenUpdates;
    }

    @Override // il.InterfaceC6818c
    @Nullable
    /* JADX INFO: renamed from: b */
    public AndroidColorToken mo29191b(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this._tokenMap.getValue().get(key);
    }

    @Override // il.InterfaceC6818c
    /* JADX INFO: renamed from: c */
    public boolean mo29192c() {
        return !this._tokenMap.getValue().isEmpty();
    }

    /* JADX INFO: renamed from: d */
    public final void m29193d() {
        this._tokenMap.setValue(C7690k0.m31795j());
    }

    /* JADX INFO: renamed from: e */
    public final void m29194e(@NotNull DesignTokens colorTokens) {
        Intrinsics.checkNotNullParameter(colorTokens, "colorTokens");
        InterfaceC9566c0<Map<String, AndroidColorToken>> interfaceC9566c0 = this._tokenMap;
        HashMap<String, ColorTokenVariants> colorTokens2 = colorTokens.getColorTokens();
        Intrinsics.checkNotNullExpressionValue(colorTokens2, "getColorTokens(...)");
        interfaceC9566c0.setValue(m29195f(colorTokens2));
    }

    /* JADX INFO: renamed from: f */
    public final Map<String, AndroidColorToken> m29195f(Map<String, ColorTokenVariants> colorTokens) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7688j0.m31790f(colorTokens.size()));
        Iterator<T> it = colorTokens.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), C6820e.m29197b((ColorTokenVariants) entry.getValue()));
        }
        return linkedHashMap;
    }
}
