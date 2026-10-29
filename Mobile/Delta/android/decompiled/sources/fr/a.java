package fr;

import android.view.View;
import android.widget.EditText;
import ar.d;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lfr/a;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "a", "(Landroid/view/View;)Ljava/lang/String;", "", "b", "(Landroid/view/View;)Z", "ui-step-renderer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f17219a = new a();

    @NotNull
    public final String a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(d.J);
        TextInputLayout textInputLayout2 = (TextInputLayout) view.findViewById(d.C0);
        TextInputLayout textInputLayout3 = (TextInputLayout) view.findViewById(d.L0);
        TextInputLayout textInputLayout4 = (TextInputLayout) view.findViewById(d.M);
        EditText editText = textInputLayout.getEditText();
        String strValueOf = String.valueOf(editText != null ? editText.getText() : null);
        EditText editText2 = textInputLayout2.getEditText();
        String strValueOf2 = String.valueOf(editText2 != null ? editText2.getText() : null);
        EditText editText3 = textInputLayout3.getEditText();
        String strValueOf3 = String.valueOf(editText3 != null ? editText3.getText() : null);
        EditText editText4 = textInputLayout4.getEditText();
        return CollectionsKt.m0(p.n(strValueOf, strValueOf2, strValueOf3, String.valueOf(editText4 != null ? editText4.getText() : null)), "", null, null, 0, null, null, 62, null);
    }

    public final boolean b(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        return a(view).length() == 4;
    }
}
