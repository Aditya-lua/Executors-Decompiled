package com.withpersona.sdk2.inquiry.shared.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.google.android.material.button.MaterialButton;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Text;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nq.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001dR\u0016\u0010\u0014\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0017\u0010#\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b!\u0010\"R\u0011\u0010'\u001a\u00020$8F¢\u0006\u0006\u001a\u0004\b%\u0010&R$\u0010.\u001a\u00020(2\u0006\u0010)\u001a\u00020(8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/withpersona/sdk2/inquiry/shared/ui/ButtonWithLoadingIndicator;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "", "buttonStyleAttr", "<init>", "(Landroid/content/Context;I)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/View$OnClickListener;", "l", "", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "", "enabled", "setEnabled", "(Z)V", "isLoading", "setIsLoading", "b", "()V", "Lcom/google/android/material/button/MaterialButton;", "a", "(Ljava/lang/Integer;)Lcom/google/android/material/button/MaterialButton;", "c", "Lnq/f;", "Lnq/f;", "binding", "Z", "Lcom/google/android/material/button/MaterialButton;", "getButton", "()Lcom/google/android/material/button/MaterialButton;", "button", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "progressBar", "", "value", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", Text.type, "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ButtonWithLoadingIndicator extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final f binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean isLoading;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MaterialButton button;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonWithLoadingIndicator(@NotNull Context context, int i10) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        f fVarB = f.b(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(fVarB, "inflate(...)");
        this.binding = fVarB;
        this.button = a(Integer.valueOf(i10));
        b();
    }

    public final MaterialButton a(Integer buttonStyleAttr) {
        PersonaMaterialButton personaMaterialButton;
        if (buttonStyleAttr == null || buttonStyleAttr.intValue() == 0) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            personaMaterialButton = new PersonaMaterialButton(context);
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            personaMaterialButton = new PersonaMaterialButton(context2, null, buttonStyleAttr.intValue());
        }
        addView(personaMaterialButton, 0);
        return personaMaterialButton;
    }

    public final void b() {
        getProgressBar().setIndeterminateTintList(ColorStateList.valueOf(this.button.getCurrentTextColor()));
    }

    public final void c() {
        if (this.isLoading) {
            this.button.setTextScaleX(0.0f);
            getProgressBar().setVisibility(0);
        } else {
            this.button.setTextScaleX(1.0f);
            getProgressBar().setVisibility(8);
        }
    }

    @NotNull
    public final MaterialButton getButton() {
        return this.button;
    }

    @NotNull
    public final ProgressBar getProgressBar() {
        ProgressBar progressBar = this.binding.b;
        Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
        return progressBar;
    }

    @NotNull
    public final CharSequence getText() {
        CharSequence text = this.button.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return text;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        if (isEnabled() == enabled) {
            return;
        }
        super.setEnabled(enabled);
        this.button.setEnabled(enabled);
        c();
    }

    public final void setIsLoading(boolean isLoading) {
        if (this.isLoading == isLoading) {
            return;
        }
        this.isLoading = isLoading;
        this.button.setActivated(isLoading);
        c();
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener l10) {
        this.button.setOnClickListener(l10);
    }

    public final void setText(@NotNull CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.button.setText(value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonWithLoadingIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        f fVarB = f.b(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(fVarB, "inflate(...)");
        this.binding = fVarB;
        this.button = a(0);
        b();
    }
}
