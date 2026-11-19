.class public final Ll6/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a%\u0010\t\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u001b\u0010\u000e\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000cH\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u00020\u0002*\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Ly6/g;",
        "request",
        "",
        "d",
        "(Ly6/g;)Z",
        "Lav/w0;",
        "Ly6/k;",
        "job",
        "Ly6/d;",
        "c",
        "(Ly6/g;Lav/w0;)Ly6/d;",
        "Ll6/h$a;",
        "Ll6/w$a;",
        "options",
        "a",
        "(Ll6/h$a;Ll6/w$a;)Ll6/h$a;",
        "b",
        "(Ll6/w$a;)Z",
        "coil-core_release"
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
.method public static final a(Ll6/h$a;Ll6/w$a;)Ll6/h$a;
    .locals 4
    .param p0    # Ll6/h$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ll6/w$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ls6/a;

    invoke-direct {v0}, Ls6/a;-><init>()V

    const-class v1, Landroid/net/Uri;

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lxu/c;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Ll6/h$a;->k(Ls6/c;Lxu/c;)Ll6/h$a;

    new-instance v0, Ls6/e;

    invoke-direct {v0}, Ls6/e;-><init>()V

    const-class v1, Ljava/lang/Integer;

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lxu/c;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Ll6/h$a;->k(Ls6/c;Lxu/c;)Ll6/h$a;

    new-instance v0, Lr6/a;

    invoke-direct {v0}, Lr6/a;-><init>()V

    const-class v1, Ll6/h0;

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lxu/c;

    move-result-object v2

    invoke-virtual {p0, v0, v2}, Ll6/h$a;->j(Lr6/c;Lxu/c;)Ll6/h$a;

    new-instance v0, Lp6/a$a;

    invoke-direct {v0}, Lp6/a$a;-><init>()V

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lxu/c;

    move-result-object v2

    invoke-virtual {p0, v0, v2}, Ll6/h$a;->h(Lp6/j$a;Lxu/c;)Ll6/h$a;

    new-instance v0, Lp6/f$a;

    invoke-direct {v0}, Lp6/f$a;-><init>()V

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lxu/c;

    move-result-object v2

    invoke-virtual {p0, v0, v2}, Ll6/h$a;->h(Lp6/j$a;Lxu/c;)Ll6/h$a;

    new-instance v0, Lp6/n$a;

    invoke-direct {v0}, Lp6/n$a;-><init>()V

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lxu/c;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Ll6/h$a;->h(Lp6/j$a;Lxu/c;)Ll6/h$a;

    new-instance v0, Lp6/h$a;

    invoke-direct {v0}, Lp6/h$a;-><init>()V

    const-class v1, Landroid/graphics/drawable/Drawable;

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lxu/c;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Ll6/h$a;->h(Lp6/j$a;Lxu/c;)Ll6/h$a;

    new-instance v0, Lp6/b$a;

    invoke-direct {v0}, Lp6/b$a;-><init>()V

    const-class v1, Landroid/graphics/Bitmap;

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lxu/c;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Ll6/h$a;->h(Lp6/j$a;Lxu/c;)Ll6/h$a;

    invoke-static {p1}, Ll6/u;->b(Ll6/w$a;)I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lkv/l;->b(IIILjava/lang/Object;)Lkv/h;

    move-result-object v0

    invoke-static {p1}, Ll6/a0;->b(Ll6/w$a;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ln6/x$a;

    invoke-direct {v1, v0}, Ln6/x$a;-><init>(Lkv/h;)V

    invoke-virtual {p0, v1}, Ll6/h$a;->g(Ln6/i$a;)Ll6/h$a;

    :cond_0
    new-instance v1, Ln6/c$c;

    invoke-static {p1}, Ll6/u;->a(Ll6/w$a;)Ln6/o;

    move-result-object p1

    invoke-direct {v1, v0, p1}, Ln6/c$c;-><init>(Lkv/h;Ln6/o;)V

    invoke-virtual {p0, v1}, Ll6/h$a;->g(Ln6/i$a;)Ll6/h$a;

    return-object p0
.end method

.method public static final b(Ll6/w$a;)Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Ll6/u;->c(Ll6/w$a;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Ll6/u;->a(Ll6/w$a;)Ln6/o;

    move-result-object p0

    sget-object v0, Ln6/o;->c:Ln6/o;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final c(Ly6/g;Lav/w0;)Ly6/d;
    .locals 1
    .param p0    # Ly6/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lav/w0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly6/g;",
            "Lav/w0<",
            "+",
            "Ly6/k;",
            ">;)",
            "Ly6/d;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-virtual {p0}, Ly6/g;->y()Lc7/c;

    move-result-object v0

    instance-of v0, v0, Lc7/d;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ly6/g;->y()Lc7/c;

    move-result-object p0

    check-cast p0, Lc7/d;

    invoke-interface {p0}, Lc7/d;->getView()Landroid/view/View;

    move-result-object p0

    invoke-static {p0}, Ly6/x;->a(Landroid/view/View;)Ly6/w;

    move-result-object p0

    invoke-virtual {p0, p1}, Ly6/w;->b(Lav/w0;)Ly6/u;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ly6/o;

    invoke-direct {p0, p1}, Ly6/o;-><init>(Lav/w0;)V

    return-object p0
.end method

.method public static final d(Ly6/g;)Z
    .locals 1
    .param p0    # Ly6/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Ly6/g;->y()Lc7/c;

    move-result-object v0

    instance-of v0, v0, Lc7/d;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ly6/g;->x()Lz6/i;

    move-result-object v0

    instance-of v0, v0, Lz6/k;

    if-nez v0, :cond_1

    invoke-static {p0}, Ly6/j;->m(Ly6/g;)Landroidx/lifecycle/l;

    move-result-object p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method
