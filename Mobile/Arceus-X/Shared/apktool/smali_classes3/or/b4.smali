.class public final Lor/b4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;",
        "Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;",
        "a",
        "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;",
        "ui_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;
    .locals 1
    .param p0    # Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ActionButtonComponent;

    if-eqz v0, :cond_0

    sget-object p0, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;->Action:Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    return-object p0

    :cond_0
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/steps/ui/components/CompleteButtonComponent;

    if-eqz v0, :cond_1

    sget-object p0, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;->Complete:Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    return-object p0

    :cond_1
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/steps/ui/components/SubmitButtonComponent;

    if-eqz v0, :cond_2

    sget-object p0, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;->Submit:Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    return-object p0

    :cond_2
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/steps/ui/components/CancelButtonComponent;

    if-eqz v0, :cond_3

    sget-object p0, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;->Cancel:Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    return-object p0

    :cond_3
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/steps/ui/components/ClickableStackComponent;

    if-eqz v0, :cond_4

    sget-object p0, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;->ClickableStack:Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    return-object p0

    :cond_4
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/steps/ui/components/VerifyPersonaButtonComponent;

    if-eqz v0, :cond_5

    sget-object p0, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;->ReusablePersona:Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    return-object p0

    :cond_5
    instance-of v0, p0, Lcom/withpersona/sdk2/inquiry/steps/ui/components/GovernmentIdNfcScanComponent;

    if-eqz v0, :cond_6

    sget-object p0, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;->Nfc:Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    return-object p0

    :cond_6
    instance-of p0, p0, Lcom/withpersona/sdk2/inquiry/steps/ui/components/MdocComponent;

    if-eqz p0, :cond_7

    sget-object p0, Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;->Mdoc:Lcom/withpersona/sdk2/inquiry/tracking/model/UiStepButtonType;

    return-object p0

    :cond_7
    const/4 p0, 0x0

    return-object p0
.end method
