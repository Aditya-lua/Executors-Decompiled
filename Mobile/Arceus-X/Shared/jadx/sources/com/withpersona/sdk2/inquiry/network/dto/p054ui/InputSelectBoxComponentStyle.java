package com.withpersona.sdk2.inquiry.network.dto.p054ui;

import com.withpersona.sdk2.inquiry.network.dto.p054ui.styling.TextBasedComponentStyle;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u0004\u0018\u00010\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0014À\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/InputSelectBoxComponentStyle;", "", "textBasedStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "getTextBasedStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextBasedComponentStyle;", "errorTextStyle", "getErrorTextStyle", "baseTextColor", "", "getBaseTextColor", "()Ljava/lang/Integer;", "headerCancelButtonColor", "getHeaderCancelButtonColor", "baseBorderColorValue", "getBaseBorderColorValue", "baseBackgroundColorValue", "getBaseBackgroundColorValue", "focusedBackgroundColorValue", "getFocusedBackgroundColorValue", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface InputSelectBoxComponentStyle {
    @Nullable
    Integer getBaseBackgroundColorValue();

    @Nullable
    Integer getBaseBorderColorValue();

    @Nullable
    Integer getBaseTextColor();

    @NotNull
    TextBasedComponentStyle getErrorTextStyle();

    @Nullable
    Integer getFocusedBackgroundColorValue();

    @Nullable
    Integer getHeaderCancelButtonColor();

    @NotNull
    TextBasedComponentStyle getTextBasedStyle();
}
