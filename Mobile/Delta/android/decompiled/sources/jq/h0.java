package jq;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\t\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroid/widget/TextView;", "Lkotlin/Function1;", "", "", "listener", "b", "(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;)V", "Landroid/text/TextWatcher;", "watcher", "a", "(Landroid/widget/TextView;Landroid/text/TextWatcher;)V", "shared_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h0 {

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ1\u0010\u000f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\rR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"jq/h0$a", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "s", "", "afterTextChanged", "(Landroid/text/Editable;)V", "", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "", "a", "Ljava/lang/String;", "oldText", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public String oldText;
        public final /* synthetic */ Function1<String, Unit> b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super String, Unit> function1) {
            this.b = function1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s8) {
            String strValueOf = String.valueOf(s8);
            String str = this.oldText;
            if (str == null) {
                Intrinsics.u("oldText");
                str = null;
            }
            if (Intrinsics.c(strValueOf, str)) {
                return;
            }
            this.b.invoke(String.valueOf(s8));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s8, int start, int count, int after) {
            this.oldText = String.valueOf(s8);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s8, int start, int before, int count) {
        }
    }

    public static final void a(@NotNull TextView textView, @NotNull TextWatcher watcher) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(watcher, "watcher");
        int i10 = t.f21676x;
        Object tag = textView.getTag(i10);
        if (tag != null) {
            textView.removeTextChangedListener((TextWatcher) tag);
        }
        textView.addTextChangedListener(watcher);
        textView.setTag(i10, watcher);
    }

    public static final void b(@NotNull TextView textView, @NotNull Function1<? super String, Unit> listener) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(listener, "listener");
        int i10 = t.f21676x;
        Object tag = textView.getTag(i10);
        if (tag != null) {
            textView.removeTextChangedListener((TextWatcher) tag);
        }
        a aVar = new a(listener);
        textView.addTextChangedListener(aVar);
        textView.setTag(i10, aVar);
    }
}
