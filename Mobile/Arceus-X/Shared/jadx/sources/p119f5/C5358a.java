package p119f5;

import android.database.SQLException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p559xt.C12915a;

/* JADX INFO: renamed from: f5.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m31665d2 = {"Lf5/b;", "", "sql", "", "a", "(Lf5/b;Ljava/lang/String;)V", "", "errorCode", "errorMsg", "", "b", "(ILjava/lang/String;)Ljava/lang/Void;", "sqlite"}, m31666k = 2, m31667mv = {2, 1, 0}, m31669xi = 48)
public final class C5358a {
    /* JADX INFO: renamed from: a */
    public static final void m24693a(@NotNull InterfaceC5359b interfaceC5359b, @NotNull String sql) {
        Intrinsics.checkNotNullParameter(interfaceC5359b, "<this>");
        Intrinsics.checkNotNullParameter(sql, "sql");
        InterfaceC5361d interfaceC5361dMo24696r3 = interfaceC5359b.mo24696r3(sql);
        try {
            interfaceC5361dMo24696r3.mo24704g3();
            C12915a.m47941a(interfaceC5361dMo24696r3, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C12915a.m47941a(interfaceC5361dMo24696r3, th2);
                throw th3;
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Void m24694b(int i10, @Nullable String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error code: " + i10);
        if (str != null) {
            sb2.append(", message: " + str);
        }
        throw new SQLException(sb2.toString());
    }
}
