package ym;

import com.appsflyer.sdk_base.referrer.Payload;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \"2\u00020\u0001:\u0001\u0016B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0000\u0012\u0012\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001e\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u000eR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00000\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 ¨\u0006#"}, d2 = {"Lym/s;", "", "Lhu/a;", Payload.TYPE, "proxiedIdentifier", "Lkotlin/Function0;", "", "description", "<init>", "(Lhu/a;Lym/s;Lkotlin/jvm/functions/Function0;)V", "Lxu/h;", "e", "()Lxu/h;", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lhu/a;", "b", "Lym/s;", "c", "Lkotlin/jvm/functions/Function0;", "d", "Ljt/h;", "typeName", "Lkotlin/sequences/Sequence;", "Lkotlin/sequences/Sequence;", "proxiedIdentifiers", "f", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final hu.a type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final s proxiedIdentifier;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Function0<String> description;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final jt.h typeName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Sequence<s> proxiedIdentifiers;

    /* JADX INFO: renamed from: ym.s$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lym/s$a;", "", "<init>", "()V", "Lxu/h;", "bytes", "Lym/s;", "a", "(Lxu/h;)Lym/s;", "", "NO_PROXY_IDENTIFIER_TAG", "B", "PROXY_IDENTIFIER_TAG", "wf1-workflow-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final s a(@NotNull xu.h bytes) {
            s sVarA;
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            xu.e eVar = new xu.e();
            eVar.d0(bytes);
            try {
                String strB = j.b(eVar);
                byte b = eVar.readByte();
                if (b == 0) {
                    sVarA = null;
                } else {
                    if (b != 1) {
                        throw new IllegalArgumentException("Invalid WorkflowIdentifier");
                    }
                    sVarA = s.INSTANCE.a(eVar.F2());
                }
                return new s(yt.a.c(Class.forName(strB)), sVarA, null, 4, null);
            } catch (EOFException unused) {
                throw new IllegalArgumentException("Invalid WorkflowIdentifier");
            }
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lym/s;", "it", "a", "(Lym/s;)Lym/s;"}, k = 3, mv = {1, 6, 0})
    public static final class b extends kotlin.jvm.internal.m implements Function1<s, s> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f35971i = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s invoke(@NotNull s it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.proxiedIdentifier;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lym/s;", "it", "", "a", "(Lym/s;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 6, 0})
    public static final class c extends kotlin.jvm.internal.m implements Function1<s, CharSequence> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final c f35972i = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull s it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.d();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "kotlin.jvm.PlatformType", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    public static final class d extends kotlin.jvm.internal.m implements Function0<String> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return s.this.type instanceof hu.c ? yt.a.a((hu.c) s.this.type).getName() : s.this.type.toString();
        }
    }

    public s(@NotNull hu.a type, @Nullable s sVar, @Nullable Function0<String> function0) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.proxiedIdentifier = sVar;
        this.description = function0;
        if (!(type instanceof hu.c) && (!(type instanceof hu.m) || !(((hu.m) type).a() instanceof hu.c))) {
            throw new IllegalArgumentException(Intrinsics.l("Expected type to be either a KClass or a KType with a KClass classifier, but was ", type).toString());
        }
        this.typeName = jt.i.a(jt.k.PUBLICATION, new d());
        this.proxiedIdentifiers = iu.m.h(this, b.f35971i);
    }

    public final String d() {
        Object value = this.typeName.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-typeName>(...)");
        return (String) value;
    }

    @Nullable
    public final xu.h e() {
        xu.h hVar = null;
        if (!(this.type instanceof hu.c)) {
            return null;
        }
        s sVar = this.proxiedIdentifier;
        if (sVar != null) {
            xu.h hVarE = sVar.e();
            if (hVarE == null) {
                return null;
            }
            hVar = hVarE;
        }
        xu.e eVar = new xu.e();
        j.d(eVar, d());
        if (hVar != null) {
            eVar.writeByte(1);
            eVar.d0(hVar);
        } else {
            eVar.writeByte(0);
        }
        return eVar.F2();
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
        return "WorkflowIdentifier(" + iu.p.w(this.proxiedIdentifiers, null, null, null, 0, null, c.f35972i, 31, null) + ')';
    }

    public /* synthetic */ s(hu.a aVar, s sVar, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i10 & 2) != 0 ? null : sVar, (i10 & 4) != 0 ? null : function0);
    }
}
