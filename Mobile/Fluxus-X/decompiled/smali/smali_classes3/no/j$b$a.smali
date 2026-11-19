.class public final Lno/j$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnn/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lno/j$b;->a(Lbr/b;)Lnn/k;
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
        "Lnn/k;"
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
.field public final synthetic b:Lor/i;

.field public final synthetic c:Lbr/b;

.field public final synthetic d:Lpu/n;

.field public final synthetic e:Lor/j;


# direct methods
.method public constructor <init>(Lor/i;Lbr/b;Lpu/n;Lor/j;)V
    .locals 0

    iput-object p1, p0, Lno/j$b$a;->b:Lor/i;

    iput-object p2, p0, Lno/j$b$a;->c:Lbr/b;

    iput-object p3, p0, Lno/j$b$a;->d:Lpu/n;

    iput-object p4, p0, Lno/j$b$a;->e:Lor/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lnn/z;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TRenderingT;",
            "Lnn/z;",
            ")V"
        }
    .end annotation

    const-string v0, "rendering"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewEnvironment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lno/j$b$a;->b:Lor/i;

    invoke-virtual {v0}, Lor/i;->i()Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "getContext(...)"

    if-eqz v0, :cond_0

    iget-object v2, p0, Lno/j$b$a;->c:Lbr/b;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {v2}, Lbr/b;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-virtual {v2}, Lbr/b;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v2, v0}, Ljr/c;->b(Lnn/z;Landroid/content/Context;I)V

    :cond_0
    iget-object p2, p0, Lno/j$b$a;->b:Lor/i;

    iget-object v0, p0, Lno/j$b$a;->c:Lbr/b;

    invoke-virtual {v0}, Lbr/b;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lor/i;->a(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    if-eqz p2, :cond_1

    iget-object v0, p0, Lno/j$b$a;->c:Lbr/b;

    invoke-virtual {v0}, Lbr/b;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    invoke-virtual {v1, p2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iget-object p2, v0, Lbr/b;->d:Landroid/widget/FrameLayout;

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_1
    iget-object p2, p0, Lno/j$b$a;->d:Lpu/n;

    iget-object v0, p0, Lno/j$b$a;->c:Lbr/b;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v1, p0, Lno/j$b$a;->e:Lor/j;

    invoke-virtual {v1}, Lor/j;->c()Lor/k;

    move-result-object v1

    invoke-virtual {v1}, Lor/k;->a()Ljava/util/Map;

    move-result-object v1

    invoke-interface {p2, v0, p1, v1}, Lpu/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
