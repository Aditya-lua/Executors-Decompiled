.class public final Ld7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld7/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld7/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u000e\u0018\u00002\u00020\u0001:\u0001\rB-\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Ld7/b;",
        "Ld7/d;",
        "Ld7/e;",
        "target",
        "Lx6/k;",
        "result",
        "",
        "durationMillis",
        "",
        "preferExactIntrinsicSize",
        "<init>",
        "(Ld7/e;Lx6/k;IZ)V",
        "",
        "a",
        "()V",
        "Ld7/e;",
        "b",
        "Lx6/k;",
        "c",
        "I",
        "getDurationMillis",
        "()I",
        "d",
        "Z",
        "getPreferExactIntrinsicSize",
        "()Z",
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


# instance fields
.field public final a:Ld7/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lx6/k;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:I

.field public final d:Z


# direct methods
.method public constructor <init>(Ld7/e;Lx6/k;IZ)V
    .locals 0
    .param p1    # Ld7/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lx6/k;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld7/b;->a:Ld7/e;

    iput-object p2, p0, Ld7/b;->b:Lx6/k;

    iput p3, p0, Ld7/b;->c:I

    iput-boolean p4, p0, Ld7/b;->d:Z

    if-lez p3, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "durationMillis must be > 0."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()V
    .locals 7

    new-instance v0, Ld7/a;

    iget-object v1, p0, Ld7/b;->a:Ld7/e;

    invoke-interface {v1}, Ld7/e;->d()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iget-object v2, p0, Ld7/b;->b:Lx6/k;

    invoke-interface {v2}, Lx6/k;->p()Lk6/n;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v3, p0, Ld7/b;->a:Ld7/e;

    invoke-interface {v3}, Ld7/e;->getView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-static {v2, v3}, Lk6/v;->a(Lk6/n;Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Ld7/b;->b:Lx6/k;

    invoke-interface {v3}, Lx6/k;->a()Lx6/g;

    move-result-object v3

    invoke-virtual {v3}, Lx6/g;->w()Ly6/f;

    move-result-object v3

    iget v4, p0, Ld7/b;->c:I

    iget-object v5, p0, Ld7/b;->b:Lx6/k;

    instance-of v6, v5, Lx6/t;

    if-eqz v6, :cond_2

    check-cast v5, Lx6/t;

    invoke-virtual {v5}, Lx6/t;->c()Z

    move-result v5

    if-nez v5, :cond_1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v5, 0x1

    :goto_2
    iget-boolean v6, p0, Ld7/b;->d:Z

    invoke-direct/range {v0 .. v6}, Ld7/a;-><init>(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Ly6/f;IZZ)V

    iget-object v1, p0, Ld7/b;->b:Lx6/k;

    instance-of v2, v1, Lx6/t;

    if-eqz v2, :cond_3

    iget-object v1, p0, Ld7/b;->a:Ld7/e;

    invoke-static {v0}, Lk6/v;->c(Landroid/graphics/drawable/Drawable;)Lk6/n;

    move-result-object v0

    invoke-interface {v1, v0}, Lb7/c;->c(Lk6/n;)V

    return-void

    :cond_3
    instance-of v1, v1, Lx6/e;

    if-eqz v1, :cond_4

    iget-object v1, p0, Ld7/b;->a:Ld7/e;

    invoke-static {v0}, Lk6/v;->c(Landroid/graphics/drawable/Drawable;)Lk6/n;

    move-result-object v0

    invoke-interface {v1, v0}, Lb7/c;->a(Lk6/n;)V

    return-void

    :cond_4
    new-instance v0, Ljt/l;

    invoke-direct {v0}, Ljt/l;-><init>()V

    throw v0
.end method
