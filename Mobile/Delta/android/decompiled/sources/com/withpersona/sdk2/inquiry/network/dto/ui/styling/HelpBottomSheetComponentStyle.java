package com.withpersona.sdk2.inquiry.network.dto.ui.styling;

import android.os.Parcelable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0014À\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/HelpBottomSheetComponentStyle;", "Landroid/os/Parcelable;", "backgroundColorValue", "", "getBackgroundColorValue", "()Ljava/lang/Integer;", "fillColorValue", "getFillColorValue", "strokeColorValue", "getStrokeColorValue", "helpTextviewStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;", "getHelpTextviewStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/TextViewStyle;", "launchButtonStyle", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;", "getLaunchButtonStyle", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/ButtonSubmitComponentStyle;", "secondaryButtonStyle", "getSecondaryButtonStyle", "network-inquiry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface HelpBottomSheetComponentStyle extends Parcelable {
    @Nullable
    Integer getBackgroundColorValue();

    @Nullable
    Integer getFillColorValue();

    @Nullable
    TextViewStyle getHelpTextviewStyle();

    @Nullable
    ButtonSubmitComponentStyle getLaunchButtonStyle();

    @Nullable
    ButtonSubmitComponentStyle getSecondaryButtonStyle();

    @Nullable
    Integer getStrokeColorValue();
}
