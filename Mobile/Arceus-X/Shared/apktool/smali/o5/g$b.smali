.class public Lo5/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo5/q$h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo5/g;->r(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/view/View;

.field public final synthetic b:Ljava/util/ArrayList;

.field public final synthetic c:Lo5/g;


# direct methods
.method public constructor <init>(Lo5/g;Landroid/view/View;Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lo5/g$b;->c:Lo5/g;

    iput-object p2, p0, Lo5/g$b;->a:Landroid/view/View;

    iput-object p3, p0, Lo5/g$b;->b:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lo5/q;)V
    .locals 0
    .param p1    # Lo5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method

.method public b(Lo5/q;)V
    .locals 0
    .param p1    # Lo5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method

.method public d(Lo5/q;)V
    .locals 0
    .param p1    # Lo5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method

.method public g(Lo5/q;)V
    .locals 0
    .param p1    # Lo5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p1, p0}, Lo5/q;->m0(Lo5/q$h;)Lo5/q;

    invoke-virtual {p1, p0}, Lo5/q;->c(Lo5/q$h;)Lo5/q;

    return-void
.end method

.method public k(Lo5/q;)V
    .locals 3
    .param p1    # Lo5/q;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p1, p0}, Lo5/q;->m0(Lo5/q$h;)Lo5/q;

    iget-object p1, p0, Lo5/g$b;->a:Landroid/view/View;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lo5/g$b;->b:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, p1, :cond_0

    iget-object v2, p0, Lo5/g$b;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
