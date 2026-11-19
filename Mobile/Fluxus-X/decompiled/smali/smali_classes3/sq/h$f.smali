.class public final Lsq/h$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lor/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsq/h;->t2(Lmq/q5$d$d;)Lsq/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lor/h<",
        "Lmq/q5$d$d;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "sq/h$f",
        "Lor/h;",
        "rendering",
        "Ljr/a;",
        "systemUiController",
        "",
        "b",
        "(Ljava/lang/Object;Ljr/a;)V",
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
.field public final synthetic b:Lor/i;

.field public final synthetic c:Lbr/b;

.field public final synthetic d:Lpu/n;

.field public final synthetic e:Lor/j;


# direct methods
.method public constructor <init>(Lor/i;Lbr/b;Lpu/n;Lor/j;)V
    .locals 0

    iput-object p1, p0, Lsq/h$f;->b:Lor/i;

    iput-object p2, p0, Lsq/h$f;->c:Lbr/b;

    iput-object p3, p0, Lsq/h$f;->d:Lpu/n;

    iput-object p4, p0, Lsq/h$f;->e:Lor/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Object;Ljr/a;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmq/q5$d$d;",
            "Ljr/a;",
            ")V"
        }
    .end annotation

    const-string v0, "rendering"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lsq/h$f;->b:Lor/i;

    invoke-virtual {v0}, Lor/i;->i()Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "getContext(...)"

    if-eqz v0, :cond_0

    iget-object v2, p0, Lsq/h$f;->c:Lbr/b;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {v2}, Lbr/b;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/view/View;->setBackgroundColor(I)V

    if-eqz p2, :cond_0

    invoke-virtual {v2}, Lbr/b;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v2, v0}, Ljr/a;->a(Landroid/content/Context;I)V

    :cond_0
    iget-object p2, p0, Lsq/h$f;->b:Lor/i;

    iget-object v0, p0, Lsq/h$f;->c:Lbr/b;

    invoke-virtual {v0}, Lbr/b;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lor/i;->a(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    if-eqz p2, :cond_1

    iget-object v0, p0, Lsq/h$f;->c:Lbr/b;

    invoke-virtual {v0}, Lbr/b;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    invoke-virtual {v1, p2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iget-object p2, v0, Lbr/b;->d:Landroid/widget/FrameLayout;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_1
    iget-object p2, p0, Lsq/h$f;->d:Lpu/n;

    iget-object v0, p0, Lsq/h$f;->c:Lbr/b;

    iget-object v1, p0, Lsq/h$f;->e:Lor/j;

    invoke-virtual {v1}, Lor/j;->c()Lor/k;

    move-result-object v1

    invoke-virtual {v1}, Lor/k;->a()Ljava/util/Map;

    move-result-object v1

    invoke-interface {p2, v0, p1, v1}, Lpu/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
