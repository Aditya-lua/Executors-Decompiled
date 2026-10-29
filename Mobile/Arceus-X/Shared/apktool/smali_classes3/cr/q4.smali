.class public final Lcr/q4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/SpacerComponent;",
        "Lcr/y4;",
        "uiComponentHelper",
        "Landroid/view/View;",
        "b",
        "(Lcom/withpersona/sdk2/inquiry/steps/ui/components/SpacerComponent;Lcr/y4;)Landroid/view/View;",
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
.method public static synthetic a(Landroid/view/View;Lcom/withpersona/sdk2/inquiry/steps/ui/components/SpacerComponent;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcr/q4;->c(Landroid/view/View;Lcom/withpersona/sdk2/inquiry/steps/ui/components/SpacerComponent;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lcom/withpersona/sdk2/inquiry/steps/ui/components/SpacerComponent;Lcr/y4;)Landroid/view/View;
    .locals 2
    .param p0    # Lcom/withpersona/sdk2/inquiry/steps/ui/components/SpacerComponent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lcr/y4;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uiComponentHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/view/View;

    invoke-virtual {p1}, Lcr/y4;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v1, Lcr/p4;

    invoke-direct {v1, v0, p0}, Lcr/p4;-><init>(Landroid/view/View;Lcom/withpersona/sdk2/inquiry/steps/ui/components/SpacerComponent;)V

    invoke-virtual {p1, v1}, Lcr/y4;->d(Lkotlin/jvm/functions/Function0;)V

    return-object v0
.end method

.method public static final c(Landroid/view/View;Lcom/withpersona/sdk2/inquiry/steps/ui/components/SpacerComponent;)Lkotlin/Unit;
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/SpacerComponent;->a()I

    move-result v1

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lkotlin/ranges/d;->c(II)I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/steps/ui/components/SpacerComponent;->f()I

    move-result p1

    invoke-static {p1, v2}, Lkotlin/ranges/d;->c(II)I

    move-result p1

    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method
