package cr;

import android.text.InputFilter;
import android.text.Spanned;
import com.appsflyer.sdk_base.referrer.Payload;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C7797x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p229jt.C7342i;
import p229jt.InterfaceC7341h;

/* JADX INFO: renamed from: cr.n */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0017"}, m31665d2 = {"Lcr/n;", "Landroid/text/InputFilter;", "", "precision", "<init>", "(I)V", "", Payload.SOURCE, "start", "end", "Landroid/text/Spanned;", "dest", "dstart", "dend", "filter", "(Ljava/lang/CharSequence;IILandroid/text/Spanned;II)Ljava/lang/CharSequence;", "a", "I", "Ljava/util/regex/Pattern;", "b", "Ljt/h;", "()Ljava/util/regex/Pattern;", "pattern", "ui-step-renderer_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C4281n implements InputFilter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int precision;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h pattern = C7342i.m30456b(new Function0() { // from class: cr.m
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return C4281n.m21832c(this.f18085a);
        }
    });

    public C4281n(int i10) {
        this.precision = i10;
    }

    /* JADX INFO: renamed from: c */
    public static final Pattern m21832c(C4281n c4281n) {
        return Pattern.compile("-?[0-9]*+((\\.[0-9]{0," + c4281n.precision + "})?)||(\\.)?");
    }

    /* JADX INFO: renamed from: b */
    public final Pattern m21833b() {
        Object value = this.pattern.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Pattern) value;
    }

    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: (wrap java.lang.Object:CAST), (wrap java.lang.Object:CAST), (wrap java.lang.Object:CAST) */
    @Override // android.text.InputFilter
    @Nullable
    public CharSequence filter(@NotNull CharSequence source, int start, int end, @NotNull Spanned dest, int dstart, int dend) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(dest, "dest");
        CharSequence charSequenceSubSequence = source.subSequence(start, end);
        CharSequence charSequenceSubSequence2 = dest.subSequence(0, dstart);
        CharSequence charSequenceSubSequence3 = dest.subSequence(dend, dest.length());
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) charSequenceSubSequence2);
        sb2.append((Object) charSequenceSubSequence);
        sb2.append((Object) charSequenceSubSequence3);
        Matcher matcher = m21833b().matcher(C7797x.m32302M(sb2.toString(), ',', '.', false, 4, null));
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        if (matcher.matches()) {
            return null;
        }
        return source.length() == 0 ? dest.subSequence(dstart, dend) : "";
    }
}
