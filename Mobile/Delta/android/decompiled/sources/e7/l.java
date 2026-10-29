package e7;

import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\t\u0010\n\"\u0018\u0010\u000e\u001a\u00020\u000b*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lxu/l;", "Lxu/h0;", "file", "", "mustCreate", "", "a", "(Lxu/l;Lxu/h0;Z)V", "directory", "c", "(Lxu/l;Lxu/h0;)V", "", "d", "(Lxu/h0;)Ljava/lang/String;", "extension", "coil-core_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {
    public static final void a(@NotNull xu.l lVar, @NotNull xu.h0 h0Var, boolean z10) {
        if (z10) {
            h0.h(lVar.sink(h0Var, true));
        } else {
            if (lVar.exists(h0Var)) {
                return;
            }
            h0.h(lVar.sink(h0Var));
        }
    }

    public static /* synthetic */ void b(xu.l lVar, xu.h0 h0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        a(lVar, h0Var, z10);
    }

    public static final void c(@NotNull xu.l lVar, @NotNull xu.h0 h0Var) throws IOException {
        try {
            IOException iOException = null;
            for (xu.h0 h0Var2 : lVar.list(h0Var)) {
                try {
                    if (lVar.metadata(h0Var2).getIsDirectory()) {
                        c(lVar, h0Var2);
                    }
                    lVar.delete(h0Var2);
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
    public static final String d(@NotNull xu.h0 h0Var) {
        return StringsKt.c1(h0Var.e(), '.', "");
    }
}
