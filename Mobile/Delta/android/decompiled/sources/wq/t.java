package wq;

import android.text.StaticLayout;
import android.widget.TextView;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroid/widget/TextView;", "", Text.type, "", "b", "(Landroid/widget/TextView;Ljava/lang/CharSequence;)V", "", "a", "(Landroid/widget/TextView;)I", "shared_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class t {
    public static final int a(@NotNull TextView textView) {
        int width;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        CharSequence text = textView.getText();
        if (text == null || (width = textView.getWidth()) == 0 || StringsKt.p0(text)) {
            return 0;
        }
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(text, 0, text.length(), textView.getPaint(), width).build();
        Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "build(...)");
        return staticLayoutBuild.getLineCount();
    }

    public static final void b(@NotNull TextView textView, @Nullable CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (charSequence == null || StringsKt.p0(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setText(charSequence);
            textView.setVisibility(0);
        }
    }
}
