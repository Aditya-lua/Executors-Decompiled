package com.withpersona.sdk2.inquiry.shared.inquiryTheme;

import androidx.p000lifecycle.l0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nu.c0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR$\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\n\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;", "", "Landroidx/lifecycle/l0;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/l0;)V", "a", "Landroidx/lifecycle/l0;", "Lnu/c0;", "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme;", "b", "Lnu/c0;", "themeFlow", "value", "()Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme;", "(Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme;)V", "theme", "shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 savedStateHandle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final c0<InquiryTheme> themeFlow;

    public a(@NotNull l0 savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
        this.themeFlow = savedStateHandle.e("inquiry_theme", InquiryTheme.INSTANCE.a());
    }

    @NotNull
    public final InquiryTheme a() {
        return this.themeFlow.getValue();
    }

    public final void b(@NotNull InquiryTheme value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.themeFlow.setValue(value);
    }
}
