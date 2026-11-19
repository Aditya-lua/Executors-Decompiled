package g5;

import android.database.SQLException;
import com.github.luben.zstd.BuildConfig;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lg5/b;", BuildConfig.FLAVOR, "sql", BuildConfig.FLAVOR, "a", "(Lg5/b;Ljava/lang/String;)V", BuildConfig.FLAVOR, "errorCode", "errorMsg", BuildConfig.FLAVOR, "b", "(ILjava/lang/String;)Ljava/lang/Void;", "sqlite"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {
    public static final void a(@NotNull b bVar, @NotNull String sql) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(sql, "sql");
        d dVarW3 = bVar.w3(sql);
        try {
            dVarW3.n3();
            nu.a.a(dVarW3, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                nu.a.a(dVarW3, th2);
                throw th3;
            }
        }
    }

    @NotNull
    public static final Void b(int i10, @Nullable String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Error code: " + i10);
        if (str != null) {
            sb2.append(", message: " + str);
        }
        throw new SQLException(sb2.toString());
    }
}
