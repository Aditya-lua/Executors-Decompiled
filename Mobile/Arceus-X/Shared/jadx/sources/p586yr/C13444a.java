package p586yr;

import bs.InterfaceC1489b;
import java.net.URLEncoder;
import kotlin.Metadata;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ps.InterfaceC10333o;

/* JADX INFO: renamed from: yr.a */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m31665d2 = {"Lyr/a;", "Lbs/b;", "Lps/o;", "<init>", "()V", "", "expression", "data", "l", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "operations-stdlib_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C13444a implements InterfaceC1489b, InterfaceC10333o {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final C13444a f47092a = new C13444a();

    @Override // ps.InterfaceC10333o
    @Nullable
    /* JADX INFO: renamed from: a */
    public String mo39631a(@Nullable Object obj) {
        return super.mo39631a(obj);
    }

    @Override // bs.InterfaceC1489b
    @Nullable
    /* JADX INFO: renamed from: l */
    public Object mo6534l(@Nullable Object expression, @Nullable Object data) {
        String strMo39631a = mo39631a(expression);
        if (strMo39631a != null) {
            return URLEncoder.encode(strMo39631a, Charsets.UTF_8.name());
        }
        return null;
    }
}
