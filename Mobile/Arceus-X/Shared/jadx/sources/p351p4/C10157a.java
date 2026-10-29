package p351p4;

import android.os.Build;
import android.os.ext.SdkExtensions;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: p4.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0005\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m31665d2 = {"Lp4/a;", "", "<init>", "()V", "", "a", "()I", "b", "ads-adservices_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
public final class C10157a {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C10157a f36531a = new C10157a();

    /* JADX INFO: renamed from: p4.a$a */
    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"Lp4/a$a;", "", "<init>", "()V", "", "a", "()I", "ads-adservices_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final a f36532a = new a();

        /* JADX INFO: renamed from: a */
        public final int m39106a() {
            return SdkExtensions.getExtensionVersion(31);
        }
    }

    /* JADX INFO: renamed from: p4.a$b */
    @Metadata(m31664d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m31665d2 = {"Lp4/a$b;", "", "<init>", "()V", "", "a", "()I", "ads-adservices_release"}, m31666k = 1, m31667mv = {1, 8, 0}, m31669xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a */
        @NotNull
        public static final b f36533a = new b();

        /* JADX INFO: renamed from: a */
        public final int m39107a() {
            return SdkExtensions.getExtensionVersion(1000000);
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m39104a() {
        if (Build.VERSION.SDK_INT >= 33) {
            return b.f36533a.m39107a();
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final int m39105b() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 31 || i10 == 32) {
            return a.f36532a.m39106a();
        }
        return 0;
    }
}
