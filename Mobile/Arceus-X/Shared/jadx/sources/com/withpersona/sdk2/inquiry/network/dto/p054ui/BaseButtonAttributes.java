package com.withpersona.sdk2.inquiry.network.dto.p054ui;

import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Button;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Text;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0014\u0010\f\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016À\u0006\u0003"}, m31665d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/ui/BaseButtonAttributes;", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/UiComponentAttributes;", Text.type, "", "getText", "()Ljava/lang/String;", "buttonType", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button$ButtonType;", "getButtonType", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/Button$ButtonType;", "autoSubmitCountdownText", "getAutoSubmitCountdownText", "autoSubmitIntervalSeconds", "", "getAutoSubmitIntervalSeconds", "()Ljava/lang/Integer;", "hidden", "Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "getHidden", "()Lcom/withpersona/sdk2/inquiry/network/dto/JsonLogicBoolean;", "disabled", "getDisabled", "network-inquiry_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public interface BaseButtonAttributes extends UiComponentAttributes {
    @Nullable
    String getAutoSubmitCountdownText();

    @Nullable
    Integer getAutoSubmitIntervalSeconds();

    @Nullable
    Button.ButtonType getButtonType();

    @Nullable
    JsonLogicBoolean getDisabled();

    @Nullable
    JsonLogicBoolean getHidden();

    @NotNull
    String getText();
}
