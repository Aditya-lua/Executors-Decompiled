.class public Lb3/d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb3/b$a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb3/d;->a(Landroid/content/Context;ILb3/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/widget/FrameLayout$LayoutParams;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Lb3/d;


# direct methods
.method public constructor <init>(Lb3/d;Landroid/widget/FrameLayout$LayoutParams;Landroid/view/View;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lb3/d$a;->c:Lb3/d;

    iput-object p2, p0, Lb3/d$a;->a:Landroid/widget/FrameLayout$LayoutParams;

    iput-object p3, p0, Lb3/d$a;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object v0, p0, Lb3/d$a;->a:Landroid/widget/FrameLayout$LayoutParams;

    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->height:I

    iget-object p1, p0, Lb3/d$a;->b:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public b(Z)V
    .locals 1

    iget-object v0, p0, Lb3/d$a;->b:Landroid/view/View;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x4

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public c(Landroidx/core/graphics/Insets;)V
    .locals 2

    iget-object v0, p0, Lb3/d$a;->a:Landroid/widget/FrameLayout$LayoutParams;

    iget v1, p1, Landroidx/core/graphics/Insets;->left:I

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    iget v1, p1, Landroidx/core/graphics/Insets;->top:I

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    iget v1, p1, Landroidx/core/graphics/Insets;->right:I

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    iget p1, p1, Landroidx/core/graphics/Insets;->bottom:I

    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    iget-object p1, p0, Lb3/d$a;->b:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public d(F)V
    .locals 1

    iget-object v0, p0, Lb3/d$a;->b:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method public e(I)V
    .locals 1

    iget-object v0, p0, Lb3/d$a;->a:Landroid/widget/FrameLayout$LayoutParams;

    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    iget-object p1, p0, Lb3/d$a;->b:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public f(F)V
    .locals 1

    iget-object v0, p0, Lb3/d$a;->b:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setTranslationX(F)V

    return-void
.end method

.method public g(F)V
    .locals 1

    iget-object v0, p0, Lb3/d$a;->b:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method public h(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Lb3/d$a;->b:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method
