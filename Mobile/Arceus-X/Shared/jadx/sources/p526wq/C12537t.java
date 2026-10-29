package p526wq;

import android.text.StaticLayout;
import android.widget.TextView;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Text;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wq.t */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m31665d2 = {"Landroid/widget/TextView;", "", Text.type, "", "b", "(Landroid/widget/TextView;Ljava/lang/CharSequence;)V", "", "a", "(Landroid/widget/TextView;)I", "shared_release"}, m31666k = 2, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class C12537t {
    /* JADX INFO: renamed from: a */
    public static final int m46885a(@NotNull TextView textView) {
        int width;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        CharSequence text = textView.getText();
        if (text == null || (width = textView.getWidth()) == 0 || StringsKt.m32182p0(text)) {
            return 0;
        }
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(text, 0, text.length(), textView.getPaint(), width).build();
        Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "build(...)");
        return staticLayoutBuild.getLineCount();
    }

    /* JADX INFO: renamed from: b */
    public static final void m46886b(@NotNull TextView textView, @Nullable CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (charSequence == null || StringsKt.m32182p0(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setText(charSequence);
            textView.setVisibility(0);
        }
    }
}
