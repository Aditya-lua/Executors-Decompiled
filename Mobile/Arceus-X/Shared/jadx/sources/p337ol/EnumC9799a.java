package p337ol;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p394qt.C10708b;
import p394qt.InterfaceC10707a;

/* JADX INFO: renamed from: ol.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m31665d2 = {"Lol/a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "c", "d", "e", "theme"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public enum EnumC9799a {
    LIGHT("Light"),
    DARK("Dark"),
    CLASSIC("Classic");


    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String value;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ InterfaceC10707a f35580g = C10708b.m40805a(m38603a());

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: ol.a$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u0005"}, m31665d2 = {"Lol/a$a;", "", "<init>", "()V", "", "theme", "Lol/a;", "a", "(Ljava/lang/String;)Lol/a;"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: ol.a.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final EnumC9799a m38605a(@Nullable String theme) {
            if (theme == null) {
                theme = "default";
            }
            String lowerCase = theme.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (Intrinsics.m31980c(lowerCase, "light")) {
                return EnumC9799a.LIGHT;
            }
            return Intrinsics.m31980c(lowerCase, "dark") ? EnumC9799a.DARK : EnumC9799a.CLASSIC;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    EnumC9799a(String str) {
        this.value = str;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final EnumC9799a m38604b(@Nullable String str) {
        return INSTANCE.m38605a(str);
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.value;
    }
}
