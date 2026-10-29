.class public final Lar/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;",
        "a",
        "(Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep;)Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;",
        "ui-step-renderer_release"
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
.method public static final a(Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep;)Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;
    .locals 3
    .param p0    # Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;

    invoke-interface {p0}, Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep;->getComponents()Ljava/util/List;

    move-result-object v1

    invoke-interface {p0}, Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep;->W0()Ljava/util/List;

    move-result-object v2

    invoke-interface {p0}, Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep;->getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;-><init>(Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;)V

    return-object v0
.end method
