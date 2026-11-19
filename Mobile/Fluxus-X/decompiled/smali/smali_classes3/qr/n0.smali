.class public final Lqr/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lqr/l0;",
        "Lqr/z5;",
        "uiComponentHelper",
        "Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CombinedStepImagePreview;",
        "config",
        "Landroid/widget/ImageView;",
        "b",
        "(Lqr/l0;Lqr/z5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CombinedStepImagePreview;)Landroid/widget/ImageView;",
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
.method public static synthetic a(Lbr/h;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CombinedStepImagePreview;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lqr/n0;->c(Lbr/h;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CombinedStepImagePreview;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lqr/l0;Lqr/z5;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CombinedStepImagePreview;)Landroid/widget/ImageView;
    .locals 1
    .param p0    # Lqr/l0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lqr/z5;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CombinedStepImagePreview;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "uiComponentHelper"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "config"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lqr/z5;->b()Landroid/view/LayoutInflater;

    move-result-object p0

    invoke-static {p0}, Lbr/h;->c(Landroid/view/LayoutInflater;)Lbr/h;

    move-result-object p0

    new-instance v0, Lqr/m0;

    invoke-direct {v0, p0, p2}, Lqr/m0;-><init>(Lbr/h;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CombinedStepImagePreview;)V

    invoke-virtual {p1, v0}, Lqr/z5;->d(Lkotlin/jvm/functions/Function0;)V

    invoke-virtual {p0}, Lbr/h;->b()Landroid/widget/ImageView;

    move-result-object p0

    const-string p1, "getRoot(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final c(Lbr/h;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CombinedStepImagePreview;)Lkotlin/Unit;
    .locals 1

    iget-object p0, p0, Lbr/h;->b:Landroid/widget/ImageView;

    const-string v0, "imageView"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CombinedStepImagePreview;->getStyles()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CombinedStepImagePreview$CombinedStepImagePreviewComponentStyle;

    move-result-object p1

    invoke-static {p0, p1}, Lyr/g;->b(Landroid/widget/ImageView;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/CombinedStepImagePreview$CombinedStepImagePreviewComponentStyle;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method
