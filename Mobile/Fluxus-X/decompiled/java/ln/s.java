package ln;

import com.appsflyer.sdk_base.referrer.Payload;
import com.github.luben.zstd.BuildConfig;
import java.io.EOFException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import p001kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \"2\u00020\u0001:\u0001\u0016B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0000\u0012\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001e\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u000eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00000\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 ¨\u0006#"}, d2 = {"Lln/s;", BuildConfig.FLAVOR, "Lxu/a;", Payload.TYPE, "proxiedIdentifier", "Lkotlin/Function0;", BuildConfig.FLAVOR, "description", "<init>", "(Lxu/a;Lln/s;Lkotlin/jvm/functions/Function0;)V", "Lew/h;", "e", "()Lew/h;", "toString", "()Ljava/lang/String;", "other", BuildConfig.FLAVOR, "equals", "(Ljava/lang/Object;)Z", BuildConfig.FLAVOR, "hashCode", "()I", "a", "Lxu/a;", "b", "Lln/s;", "c", "Lkotlin/jvm/functions/Function0;", "d", "Lzt/h;", "typeName", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/Sequence;", "proxiedIdentifiers", "f", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final xu.a type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final s proxiedIdentifier;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Function0<String> description;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final zt.h typeName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Sequence<s> proxiedIdentifiers;

    /* JADX INFO: renamed from: ln.s$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lln/s$a;", BuildConfig.FLAVOR, "<init>", "()V", "Lew/h;", "bytes", "Lln/s;", "a", "(Lew/h;)Lln/s;", BuildConfig.FLAVOR, "NO_PROXY_IDENTIFIER_TAG", "B", "PROXY_IDENTIFIER_TAG", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final s a(@NotNull ew.h bytes) {
            s sVarA;
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            ew.e eVar = new ew.e();
            eVar.z1(bytes);
            try {
                String strB = j.b(eVar);
                byte b = eVar.readByte();
                if (b == 0) {
                    sVarA = null;
                } else {
                    if (b != 1) {
                        throw new IllegalArgumentException("Invalid WorkflowIdentifier");
                    }
                    sVarA = s.INSTANCE.a(eVar.J2());
                }
                return new s(ou.a.c(Class.forName(strB)), sVarA, null, 4, null);
            } catch (EOFException unused) {
                throw new IllegalArgumentException("Invalid WorkflowIdentifier");
            }
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lln/s;", "it", "a", "(Lln/s;)Lln/s;"}, k = 3, mv = {1, 6, 0})
    public static final class b extends p001kotlin.jvm.internal.m implements Function1<s, s> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f22360i = new b();

        public b() {
            super(1);
        }

        @Override // p001kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s invoke(@NotNull s it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.proxiedIdentifier;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lln/s;", "it", BuildConfig.FLAVOR, "a", "(Lln/s;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 6, 0})
    public static final class c extends p001kotlin.jvm.internal.m implements Function1<s, CharSequence> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final c f22361i = new c();

        public c() {
            super(1);
        }

        @Override // p001kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull s it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.d();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {BuildConfig.FLAVOR, "kotlin.jvm.PlatformType", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    public static final class d extends p001kotlin.jvm.internal.m implements Function0<String> {
        public d() {
            super(0);
        }

        @Override // p001kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s.this.type instanceof xu.c ? ou.a.a((xu.c) s.this.type).getName() : s.this.type.toString();
        }
    }

    public s(@NotNull xu.a type, @Nullable s sVar, @Nullable Function0<String> function0) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.proxiedIdentifier = sVar;
        this.description = function0;
        if (!(type instanceof xu.c) && (!(type instanceof xu.m) || !(((xu.m) type).a() instanceof xu.c))) {
            throw new IllegalArgumentException(Intrinsics.l("Expected type to be either a KClass or a KType with a KClass classifier, but was ", type).toString());
        }
        this.typeName = zt.i.b(zt.k.PUBLICATION, new d());
        this.proxiedIdentifiers = yu.m.h(this, b.f22360i);
    }

    public final String d() {
        Object value = this.typeName.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-typeName>(...)");
        return (String) value;
    }

    @Nullable
    public final ew.h e() {
        ew.h hVar = null;
        if (!(this.type instanceof xu.c)) {
            return null;
        }
        s sVar = this.proxiedIdentifier;
        if (sVar != null) {
            ew.h hVarE = sVar.e();
            if (hVarE == null) {
                return null;
            }
            hVar = hVarE;
        }
        ew.e eVar = new ew.e();
        j.d(eVar, d());
        if (hVar != null) {
            eVar.writeByte(1);
            eVar.z1(hVar);
        } else {
            eVar.writeByte(0);
        }
        return eVar.J2();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof s)) {
            return false;
        }
        s sVar = (s) other;
        return Intrinsics.c(this.type, sVar.type) && Intrinsics.c(this.proxiedIdentifier, sVar.proxiedIdentifier);
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        s sVar = this.proxiedIdentifier;
        return iHashCode + (sVar == null ? 0 : sVar.hashCode());
    }

    @NotNull
    public String toString() {
        Function0<String> function0 = this.description;
        String strInvoke = function0 == null ? null : function0.invoke();
        if (strInvoke != null) {
            return strInvoke;
        }
        return "WorkflowIdentifier(" + yu.p.w(this.proxiedIdentifiers, null, null, null, 0, null, c.f22361i, 31, null) + ')';
    }

    public /* synthetic */ s(xu.a aVar, s sVar, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i10 & 2) != 0 ? null : sVar, (i10 & 4) != 0 ? null : function0);
    }
}
