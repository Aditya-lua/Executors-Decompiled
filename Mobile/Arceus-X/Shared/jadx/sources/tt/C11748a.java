package tt;

import eu.AbstractC5218d;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137fu.C5837a;
import st.C11451a;

/* JADX INFO: renamed from: tt.a */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, m31665d2 = {"Ltt/a;", "Lst/a;", "<init>", "()V", "Leu/d;", "b", "()Leu/d;", "", "version", "", "c", "(I)Z", "a", "kotlin-stdlib-jdk8"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public class C11748a extends C11451a {

    /* JADX INFO: renamed from: tt.a$a */
    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m31665d2 = {"Ltt/a$a;", "", "<init>", "()V", "", "b", "Ljava/lang/Integer;", "sdkVersion", "kotlin-stdlib-jdk8"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final a f41419a = new a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public static final Integer sdkVersion;

        static {
            Integer num;
            Integer num2 = null;
            try {
                Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                num = obj instanceof Integer ? (Integer) obj : null;
            } catch (Throwable unused) {
            }
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            sdkVersion = num2;
        }
    }

    @Override // p422rt.C11133a
    @NotNull
    /* JADX INFO: renamed from: b */
    public AbstractC5218d mo41901b() {
        return m43984c(34) ? new C5837a() : super.mo41901b();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m43984c(int version) {
        Integer num = a.sdkVersion;
        return num == null || num.intValue() >= version;
    }
}
