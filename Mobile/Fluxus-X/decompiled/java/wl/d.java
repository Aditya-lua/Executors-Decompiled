package wl;

import com.appsflyer.share.attribution.RequestError;
import com.github.luben.zstd.BuildConfig;
import com.roblox.protocols.designfoundationsplatforminterface.generated.ColorTokenVariants;
import com.roblox.protocols.designfoundationsplatforminterface.generated.DesignTokens;
import dv.c0;
import dv.h;
import dv.i;
import dv.r0;
import gu.f;
import gu.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.j0;
import p001kotlin.collections.k0;
import p001kotlin.jvm.internal.Intrinsics;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0003J/\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000f2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R&\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lwl/d;", "Lwl/c;", "<init>", "()V", BuildConfig.FLAVOR, "key", "Lwl/a;", "b", "(Ljava/lang/String;)Lwl/a;", "Lcom/roblox/protocols/designfoundationsplatforminterface/generated/DesignTokens;", "colorTokens", BuildConfig.FLAVOR, "e", "(Lcom/roblox/protocols/designfoundationsplatforminterface/generated/DesignTokens;)V", "d", BuildConfig.FLAVOR, "Lcom/roblox/protocols/designfoundationsplatforminterface/generated/ColorTokenVariants;", "f", "(Ljava/util/Map;)Ljava/util/Map;", "Ldv/c0;", "a", "Ldv/c0;", "_tokenMap", "Ldv/h;", "Ldv/h;", "()Ldv/h;", "tokenUpdates", BuildConfig.FLAVOR, "c", "()Z", "hasTokens", "universalapp_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final c0<Map<String, AndroidColorToken>> _tokenMap;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final h<Unit> tokenUpdates;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ldv/h;", "Ldv/i;", "collector", BuildConfig.FLAVOR, "collect", "(Ldv/i;Leu/b;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements h<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f35891a;

        /* JADX INFO: renamed from: wl.d$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0739a<T> implements i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ i f35892a;

            /* JADX INFO: renamed from: wl.d$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            @f(c = "com.roblox.protocols.designfoundations.DesignFoundationsPlatformHandler$special$$inlined$map$1$2", f = "DesignFoundationsPlatformHandler.kt", l = {RequestError.RESPONSE_CODE_FAILURE}, m = "emit", v = 1)
            public static final class C0740a extends gu.d {
                public int A;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public /* synthetic */ Object f35893t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public int f35894u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public Object f35895v;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                public Object f35897x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                public Object f35898y;

                /* JADX INFO: renamed from: z, reason: collision with root package name */
                public Object f35899z;

                public C0740a(eu.b bVar) {
                    super(bVar);
                }

                @Override // gu.a
                public final Object invokeSuspend(Object obj) {
                    this.f35893t = obj;
                    this.f35894u |= Integer.MIN_VALUE;
                    return C0739a.this.emit(null, this);
                }
            }

            public C0739a(i iVar) {
                this.f35892a = iVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // dv.i
            public final Object emit(Object obj, eu.b bVar) {
                C0740a c0740a;
                if (bVar instanceof C0740a) {
                    c0740a = (C0740a) bVar;
                    int i10 = c0740a.f35894u;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0740a.f35894u = i10 - Integer.MIN_VALUE;
                    } else {
                        c0740a = new C0740a(bVar);
                    }
                } else {
                    c0740a = new C0740a(bVar);
                }
                Object obj2 = c0740a.f35893t;
                Object objE = fu.c.e();
                int i11 = c0740a.f35894u;
                if (i11 == 0) {
                    o.b(obj2);
                    i iVar = this.f35892a;
                    Unit unit = Unit.f21506a;
                    c0740a.f35895v = l.a(obj);
                    c0740a.f35897x = l.a(c0740a);
                    c0740a.f35898y = l.a(obj);
                    c0740a.f35899z = l.a(iVar);
                    c0740a.A = 0;
                    c0740a.f35894u = 1;
                    if (iVar.emit(unit, c0740a) == objE) {
                        return objE;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f21506a;
            }
        }

        public a(h hVar) {
            this.f35891a = hVar;
        }

        @Override // dv.h
        public Object collect(i<? super Unit> iVar, eu.b bVar) {
            Object objCollect = this.f35891a.collect(new C0739a(iVar), bVar);
            return objCollect == fu.c.e() ? objCollect : Unit.f21506a;
        }
    }

    public d() {
        c0<Map<String, AndroidColorToken>> c0VarA = r0.a(k0.j());
        this._tokenMap = c0VarA;
        this.tokenUpdates = new a(c0VarA);
    }

    @Override // wl.c
    @NotNull
    public h<Unit> a() {
        return this.tokenUpdates;
    }

    @Override // wl.c
    @Nullable
    public AndroidColorToken b(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this._tokenMap.getValue().get(key);
    }

    @Override // wl.c
    public boolean c() {
        return !this._tokenMap.getValue().isEmpty();
    }

    public final void d() {
        this._tokenMap.setValue(k0.j());
    }

    public final void e(@NotNull DesignTokens colorTokens) {
        Intrinsics.checkNotNullParameter(colorTokens, "colorTokens");
        c0<Map<String, AndroidColorToken>> c0Var = this._tokenMap;
        HashMap<String, ColorTokenVariants> colorTokens2 = colorTokens.getColorTokens();
        Intrinsics.checkNotNullExpressionValue(colorTokens2, "getColorTokens(...)");
        c0Var.setValue(f(colorTokens2));
    }

    public final Map<String, AndroidColorToken> f(Map<String, ColorTokenVariants> colorTokens) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(j0.f(colorTokens.size()));
        Iterator<T> it = colorTokens.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), e.b((ColorTokenVariants) entry.getValue()));
        }
        return linkedHashMap;
    }
}
