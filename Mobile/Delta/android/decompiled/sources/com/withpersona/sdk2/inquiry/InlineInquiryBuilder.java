package com.withpersona.sdk2.inquiry;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\tH\u0007J\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\tH\u0007J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\tH\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0012\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0012\u0010\f\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0012\u0010\r\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/InlineInquiryBuilder;", "", "inquiry", "Lcom/withpersona/sdk2/inquiry/Inquiry;", "<init>", "(Lcom/withpersona/sdk2/inquiry/Inquiry;)V", "requestKey", "", "isNavBarEnabled", "", "Ljava/lang/Boolean;", "controlNavigationBar", "controlStatusBar", "handleBackPress", "build", "Lcom/withpersona/sdk2/inquiry/InlineInquiry;", "inquiry-dynamic-feature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InlineInquiryBuilder {

    @Nullable
    private Boolean controlNavigationBar;

    @Nullable
    private Boolean controlStatusBar;

    @Nullable
    private Boolean handleBackPress;

    @NotNull
    private final Inquiry inquiry;

    @Nullable
    private Boolean isNavBarEnabled;

    @Nullable
    private String requestKey;

    public InlineInquiryBuilder(@NotNull Inquiry inquiry) {
        Intrinsics.checkNotNullParameter(inquiry, "inquiry");
        this.inquiry = inquiry;
    }

    @ExperimentalInlineApi
    @NotNull
    public final InlineInquiry build() {
        return new InlineInquiry(this.inquiry, this.requestKey, this.isNavBarEnabled, this.controlNavigationBar, this.controlStatusBar, this.handleBackPress);
    }

    @ExperimentalInlineApi
    @NotNull
    public final InlineInquiryBuilder controlNavigationBar(boolean controlNavigationBar) {
        this.controlNavigationBar = Boolean.valueOf(controlNavigationBar);
        return this;
    }

    @ExperimentalInlineApi
    @NotNull
    public final InlineInquiryBuilder controlStatusBar(boolean controlStatusBar) {
        this.controlStatusBar = Boolean.valueOf(controlStatusBar);
        return this;
    }

    @ExperimentalInlineApi
    @NotNull
    public final InlineInquiryBuilder handleBackPress(boolean handleBackPress) {
        this.handleBackPress = Boolean.valueOf(handleBackPress);
        return this;
    }

    @ExperimentalInlineApi
    @NotNull
    public final InlineInquiryBuilder isNavBarEnabled(boolean isNavBarEnabled) {
        this.isNavBarEnabled = Boolean.valueOf(isNavBarEnabled);
        return this;
    }

    @ExperimentalInlineApi
    @NotNull
    public final InlineInquiryBuilder requestKey(@Nullable String requestKey) {
        this.requestKey = requestKey;
        return this;
    }
}
