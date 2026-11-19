package f7;

import com.github.luben.zstd.BuildConfig;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n\"\u0018\u0010\u000e\u001a\u00020\u000b*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lew/k;", "Lew/b0;", "file", BuildConfig.FLAVOR, "mustCreate", BuildConfig.FLAVOR, "a", "(Lew/k;Lew/b0;Z)V", "directory", "c", "(Lew/k;Lew/b0;)V", BuildConfig.FLAVOR, "d", "(Lew/b0;)Ljava/lang/String;", "extension", "coil-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {
    public static final void a(@NotNull ew.k kVar, @NotNull ew.b0 b0Var, boolean z10) {
        if (z10) {
            h0.h(kVar.u(b0Var, true));
        } else {
            if (kVar.m(b0Var)) {
                return;
            }
            h0.h(kVar.s(b0Var));
        }
    }

    public static /* synthetic */ void b(ew.k kVar, ew.b0 b0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        a(kVar, b0Var, z10);
    }

    public static final void c(@NotNull ew.k kVar, @NotNull ew.b0 b0Var) throws IOException {
        try {
            IOException iOException = null;
            for (ew.b0 b0Var2 : kVar.n(b0Var)) {
                try {
                    if (kVar.o(b0Var2).getIsDirectory()) {
                        c(kVar, b0Var2);
                    }
                    kVar.h(b0Var2);
                } catch (IOException e10) {
                    if (iOException == null) {
                        iOException = e10;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    @NotNull
    public static final String d(@NotNull ew.b0 b0Var) {
        return StringsKt.a1(b0Var.e(), '.', BuildConfig.FLAVOR);
    }
}
