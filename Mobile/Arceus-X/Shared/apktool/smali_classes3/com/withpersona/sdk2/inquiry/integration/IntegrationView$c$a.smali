.class public final Lcom/withpersona/sdk2/inquiry/integration/IntegrationView$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lan/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/integration/IntegrationView$c;->a(Lnq/b;)Lan/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<RenderingT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lan/k;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;

.field public final synthetic c:Lnq/b;

.field public final synthetic d:Lzt/n;

.field public final synthetic e:Lar/g;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Lnq/b;Lzt/n;Lar/g;)V
    .locals 0

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView$c$a;->b:Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView$c$a;->c:Lnq/b;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView$c$a;->d:Lzt/n;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView$c$a;->e:Lar/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lan/y;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TRenderingT;",
            "Lan/y;",
            ")V"
        }
    .end annotation

    const-string v0, "rendering"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewEnvironment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView$c$a;->b:Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;->i()Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "getContext(...)"

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView$c$a;->c:Lnq/b;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {v2}, Lnq/b;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {v2}, Lnq/b;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v2, v0}, Lvq/c;->b(Lan/y;Landroid/content/Context;I)V

    :cond_0
    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView$c$a;->b:Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView$c$a;->c:Lnq/b;

    invoke-virtual {v0}, Lnq/b;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;->a(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    if-eqz p2, :cond_1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView$c$a;->c:Lnq/b;

    invoke-virtual {v0}, Lnq/b;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    invoke-virtual {v1, p2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iget-object p2, v0, Lnq/b;->d:Landroid/widget/FrameLayout;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_1
    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView$c$a;->d:Lzt/n;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView$c$a;->c:Lnq/b;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/integration/IntegrationView$c$a;->e:Lar/g;

    invoke-virtual {v1}, Lar/g;->c()Lar/h;

    move-result-object v1

    invoke-virtual {v1}, Lar/h;->a()Ljava/util/Map;

    move-result-object v1

    invoke-interface {p2, v0, p1, v1}, Lzt/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
