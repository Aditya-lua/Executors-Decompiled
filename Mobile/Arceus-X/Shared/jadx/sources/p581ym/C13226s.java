package p581ym;

import com.appsflyer.sdk_base.referrer.Payload;
import hu.InterfaceC6565a;
import hu.InterfaceC6567c;
import hu.InterfaceC6577m;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p201iu.C6985m;
import p201iu.C6988p;
import p229jt.C7342i;
import p229jt.EnumC7344k;
import p229jt.InterfaceC7341h;
import p560xu.C12924e;
import p560xu.C12930h;
import yt.C13450a;

/* JADX INFO: renamed from: ym.s */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \"2\u00020\u0001:\u0001\u0016B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0000\u0012\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001e\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u000eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00000\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 ¨\u0006#"}, m31665d2 = {"Lym/s;", "", "Lhu/a;", Payload.TYPE, "proxiedIdentifier", "Lkotlin/Function0;", "", "description", "<init>", "(Lhu/a;Lym/s;Lkotlin/jvm/functions/Function0;)V", "Lxu/h;", "e", "()Lxu/h;", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lhu/a;", "b", "Lym/s;", "c", "Lkotlin/jvm/functions/Function0;", "d", "Ljt/h;", "typeName", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/Sequence;", "proxiedIdentifiers", "f", "wf1-workflow-core"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C13226s {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC6565a type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final C13226s proxiedIdentifier;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final Function0<String> description;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h typeName;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Sequence<C13226s> proxiedIdentifiers;

    /* JADX INFO: renamed from: ym.s$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, m31665d2 = {"Lym/s$a;", "", "<init>", "()V", "Lxu/h;", "bytes", "Lym/s;", "a", "(Lxu/h;)Lym/s;", "", "NO_PROXY_IDENTIFIER_TAG", "B", "PROXY_IDENTIFIER_TAG", "wf1-workflow-core"}, m31666k = 1, m31667mv = {1, 6, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: ym.s.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final C13226s m48909a(@NotNull C12930h bytes) {
            C13226s c13226sM48909a;
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            C12924e c12924e = new C12924e();
            c12924e.mo48023d0(bytes);
            try {
                String strM48878b = C13217j.m48878b(c12924e);
                byte b = c12924e.readByte();
                if (b == 0) {
                    c13226sM48909a = null;
                } else {
                    if (b != 1) {
                        throw new IllegalArgumentException("Invalid WorkflowIdentifier");
                    }
                    c13226sM48909a = C13226s.INSTANCE.m48909a(c12924e.mo47997F2());
                }
                return new C13226s(C13450a.m49050c(Class.forName(strM48878b)), c13226sM48909a, null, 4, null);
            } catch (EOFException unused) {
                throw new IllegalArgumentException("Invalid WorkflowIdentifier");
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: ym.s$b */
    @Metadata(m31664d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lym/s;", "it", "a", "(Lym/s;)Lym/s;"}, m31666k = 3, m31667mv = {1, 6, 0})
    public static final class b extends AbstractC7746m implements Function1<C13226s, C13226s> {

        /* JADX INFO: renamed from: i */
        public static final b f46557i = new b();

        public b() {
            super(1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C13226s invoke(@NotNull C13226s it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.proxiedIdentifier;
        }
    }

    /* JADX INFO: renamed from: ym.s$c */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lym/s;", "it", "", "a", "(Lym/s;)Ljava/lang/CharSequence;"}, m31666k = 3, m31667mv = {1, 6, 0})
    public static final class c extends AbstractC7746m implements Function1<C13226s, CharSequence> {

        /* JADX INFO: renamed from: i */
        public static final c f46558i = new c();

        public c() {
            super(1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull C13226s it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.m48907d();
        }
    }

    /* JADX INFO: renamed from: ym.s$d */
    @Metadata(m31664d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"", "kotlin.jvm.PlatformType", "b", "()Ljava/lang/String;"}, m31666k = 3, m31667mv = {1, 6, 0})
    public static final class d extends AbstractC7746m implements Function0<String> {
        public d() {
            super(0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return C13226s.this.type instanceof InterfaceC6567c ? C13450a.m49048a((InterfaceC6567c) C13226s.this.type).getName() : C13226s.this.type.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C13226s(@NotNull InterfaceC6565a type, @Nullable C13226s c13226s, @Nullable Function0<String> function0) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.proxiedIdentifier = c13226s;
        this.description = function0;
        if (!(type instanceof InterfaceC6567c) && (!(type instanceof InterfaceC6577m) || !(((InterfaceC6577m) type).mo28432a() instanceof InterfaceC6567c))) {
            throw new IllegalArgumentException(Intrinsics.m31989l("Expected type to be either a KClass or a KType with a KClass classifier, but was ", type).toString());
        }
        this.typeName = C7342i.m30455a(EnumC7344k.PUBLICATION, new d());
        this.proxiedIdentifiers = C6985m.m29379h(this, b.f46557i);
    }

    /* JADX INFO: renamed from: d */
    public final String m48907d() {
        Object value = this.typeName.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-typeName>(...)");
        return (String) value;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final C12930h m48908e() {
        C12930h c12930h = null;
        if (!(this.type instanceof InterfaceC6567c)) {
            return null;
        }
        C13226s c13226s = this.proxiedIdentifier;
        if (c13226s != null) {
            C12930h c12930hM48908e = c13226s.m48908e();
            if (c12930hM48908e == null) {
                return null;
            }
            c12930h = c12930hM48908e;
        }
        C12924e c12924e = new C12924e();
        C13217j.m48880d(c12924e, m48907d());
        if (c12930h != null) {
            c12924e.writeByte(1);
            c12924e.mo48023d0(c12930h);
        } else {
            c12924e.writeByte(0);
        }
        return c12924e.mo47997F2();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13226s)) {
            return false;
        }
        C13226s c13226s = (C13226s) other;
        return Intrinsics.m31980c(this.type, c13226s.type) && Intrinsics.m31980c(this.proxiedIdentifier, c13226s.proxiedIdentifier);
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        C13226s c13226s = this.proxiedIdentifier;
        return iHashCode + (c13226s == null ? 0 : c13226s.hashCode());
    }

    @NotNull
    public String toString() {
        Function0<String> function0 = this.description;
        String strInvoke = function0 == null ? null : function0.invoke();
        if (strInvoke != null) {
            return strInvoke;
        }
        return "WorkflowIdentifier(" + C6988p.m29395w(this.proxiedIdentifiers, null, null, null, 0, null, c.f46558i, 31, null) + ')';
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
      (r2v0 hu.a)
      (wrap ym.s:?: TERNARY null = ((wrap int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null ym.s) : (r3v0 ym.s))
      (wrap kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r4v0 kotlin.jvm.functions.Function0))
     A[MD:(hu.a, ym.s, kotlin.jvm.functions.Function0<java.lang.String>):void (m)] (LINE:10) call: ym.s.<init>(hu.a, ym.s, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ C13226s(InterfaceC6565a interfaceC6565a, C13226s c13226s, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6565a, (i10 & 2) != 0 ? null : c13226s, (i10 & 4) != 0 ? null : function0);
    }
}
