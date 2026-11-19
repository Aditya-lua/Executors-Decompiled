.class public interface abstract Lz6/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz6/i;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Landroid/view/View;",
        ">",
        "Ljava/lang/Object;",
        "Lz6/i;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008f\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0011\u0010\u000c\u001a\u0004\u0018\u00010\tH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\u000bJ)\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001b\u0010\u0017\u001a\u00020\u0016*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00028\u00008&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001e\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006 \u00c0\u0006\u0001"
    }
    d2 = {
        "Lz6/k;",
        "Landroid/view/View;",
        "T",
        "Lz6/i;",
        "Lz6/g;",
        "a",
        "(Leu/b;)Ljava/lang/Object;",
        "i",
        "()Lz6/g;",
        "Lz6/a;",
        "getWidth",
        "()Lz6/a;",
        "getHeight",
        "",
        "paramSize",
        "viewSize",
        "paddingSize",
        "c",
        "(III)Lz6/a;",
        "Landroid/view/ViewTreeObserver;",
        "Landroid/view/ViewTreeObserver$OnPreDrawListener;",
        "victim",
        "",
        "d",
        "(Landroid/view/ViewTreeObserver;Landroid/view/ViewTreeObserver$OnPreDrawListener;)V",
        "getView",
        "()Landroid/view/View;",
        "view",
        "",
        "e",
        "()Z",
        "subtractPadding",
        "coil-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic b(Lz6/k;Leu/b;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(",
            "Lz6/k<",
            "TT;>;",
            "Leu/b<",
            "-",
            "Lz6/g;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-interface {p0}, Lz6/k;->i()Lz6/g;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Lav/p;

    invoke-static {p1}, Lfu/b;->c(Leu/b;)Leu/b;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lav/p;-><init>(Leu/b;I)V

    invoke-virtual {v0}, Lav/p;->G()V

    invoke-interface {p0}, Lz6/k;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    new-instance v2, Lz6/k$b;

    invoke-direct {v2, p0, v1, v0}, Lz6/k$b;-><init>(Lz6/k;Landroid/view/ViewTreeObserver;Lav/n;)V

    invoke-virtual {v1, v2}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    new-instance v3, Lz6/k$a;

    invoke-direct {v3, p0, v1, v2}, Lz6/k$a;-><init>(Lz6/k;Landroid/view/ViewTreeObserver;Lz6/k$b;)V

    invoke-interface {v0, v3}, Lav/n;->j(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0}, Lav/p;->y()Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_1

    invoke-static {p1}, Lgu/h;->c(Leu/b;)V

    :cond_1
    return-object p0
.end method

.method public static synthetic f(Lz6/k;Landroid/view/ViewTreeObserver;Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
    .locals 0

    invoke-interface {p0, p1, p2}, Lz6/k;->d(Landroid/view/ViewTreeObserver;Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    return-void
.end method

.method public static synthetic g(Lz6/k;)Lz6/g;
    .locals 0

    invoke-interface {p0}, Lz6/k;->i()Lz6/g;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Leu/b;)Ljava/lang/Object;
    .locals 0
    .param p1    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "-",
            "Lz6/g;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {p0, p1}, Lz6/k;->b(Lz6/k;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c(III)Lz6/a;
    .locals 1

    const/4 v0, -0x2

    if-ne p1, v0, :cond_0

    sget-object p1, Lz6/a$b;->a:Lz6/a$b;

    return-object p1

    :cond_0
    sub-int/2addr p1, p3

    if-lez p1, :cond_1

    invoke-static {p1}, Lz6/b;->a(I)I

    move-result p1

    invoke-static {p1}, Lz6/a$a;->a(I)Lz6/a$a;

    move-result-object p1

    return-object p1

    :cond_1
    sub-int/2addr p2, p3

    if-lez p2, :cond_2

    invoke-static {p2}, Lz6/b;->a(I)I

    move-result p1

    invoke-static {p1}, Lz6/a$a;->a(I)Lz6/a$a;

    move-result-object p1

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public d(Landroid/view/ViewTreeObserver;Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
    .locals 1

    invoke-virtual {p1}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    return-void

    :cond_0
    invoke-interface {p0}, Lz6/k;->getView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    return-void
.end method

.method public e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getHeight()Lz6/a;
    .locals 4

    invoke-interface {p0}, Lz6/k;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    invoke-interface {p0}, Lz6/k;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-interface {p0}, Lz6/k;->e()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p0}, Lz6/k;->getView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    invoke-interface {p0}, Lz6/k;->getView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    add-int/2addr v2, v3

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    invoke-interface {p0, v0, v1, v2}, Lz6/k;->c(III)Lz6/a;

    move-result-object v0

    return-object v0
.end method

.method public abstract getView()Landroid/view/View;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public getWidth()Lz6/a;
    .locals 4

    invoke-interface {p0}, Lz6/k;->getView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_0

    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    invoke-interface {p0}, Lz6/k;->getView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-interface {p0}, Lz6/k;->e()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p0}, Lz6/k;->getView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    invoke-interface {p0}, Lz6/k;->getView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    add-int/2addr v2, v3

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    invoke-interface {p0, v0, v1, v2}, Lz6/k;->c(III)Lz6/a;

    move-result-object v0

    return-object v0
.end method

.method public i()Lz6/g;
    .locals 3

    invoke-interface {p0}, Lz6/k;->getWidth()Lz6/a;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-interface {p0}, Lz6/k;->getHeight()Lz6/a;

    move-result-object v2

    if-nez v2, :cond_1

    return-object v1

    :cond_1
    new-instance v1, Lz6/g;

    invoke-direct {v1, v0, v2}, Lz6/g;-><init>(Lz6/a;Lz6/a;)V

    return-object v1
.end method
