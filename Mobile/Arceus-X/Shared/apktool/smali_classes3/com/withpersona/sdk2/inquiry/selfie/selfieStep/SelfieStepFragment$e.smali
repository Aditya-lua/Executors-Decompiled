.class public final Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lar/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment;->t2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$d;)Leq/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lar/f<",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$d;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "com/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment$e",
        "Lar/f;",
        "rendering",
        "Lvq/a;",
        "systemUiController",
        "",
        "b",
        "(Ljava/lang/Object;Lvq/a;)V",
        "ui-step-renderer_release"
    }
    k = 0x1
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

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment$e;->b:Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment$e;->c:Lnq/b;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment$e;->d:Lzt/n;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment$e;->e:Lar/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Object;Lvq/a;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$d;",
            "Lvq/a;",
            ")V"
        }
    .end annotation

    const-string v0, "rendering"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment$e;->b:Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;->i()Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "getContext(...)"

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment$e;->c:Lnq/b;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {v2}, Lnq/b;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/view/View;->setBackgroundColor(I)V

    if-eqz p2, :cond_0

    invoke-virtual {v2}, Lnq/b;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v2, v0}, Lvq/a;->a(Landroid/content/Context;I)V

    :cond_0
    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment$e;->b:Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment$e;->c:Lnq/b;

    invoke-virtual {v0}, Lnq/b;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;->a(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    if-eqz p2, :cond_1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment$e;->c:Lnq/b;

    invoke-virtual {v0}, Lnq/b;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    invoke-virtual {v1, p2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iget-object p2, v0, Lnq/b;->d:Landroid/widget/FrameLayout;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_1
    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment$e;->d:Lzt/n;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment$e;->c:Lnq/b;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/selfieStep/SelfieStepFragment$e;->e:Lar/g;

    invoke-virtual {v1}, Lar/g;->c()Lar/h;

    move-result-object v1

    invoke-virtual {v1}, Lar/h;->a()Ljava/util/Map;

    move-result-object v1

    invoke-interface {p2, v0, p1, v1}, Lzt/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
