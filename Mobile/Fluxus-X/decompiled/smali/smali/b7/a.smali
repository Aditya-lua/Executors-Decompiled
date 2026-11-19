.class public final Lb7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La7/c;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u0004\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0019R(\u0010\u001f\u001a\u0004\u0018\u00010\u001b2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u001b8V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u001c\u0010\u001d\"\u0004\u0008\u0016\u0010\u001eR\u0014\u0010\u0011\u001a\u00020 8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\"R\u0014\u0010\u0012\u001a\u00020 8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Lb7/a;",
        "La7/c;",
        "Lx7/g;",
        "svg",
        "<init>",
        "(Lx7/g;)V",
        "",
        "value",
        "",
        "b",
        "(Ljava/lang/String;)V",
        "c",
        "Ly6/p;",
        "options",
        "e",
        "(Ly6/p;)V",
        "",
        "width",
        "height",
        "Ll6/n;",
        "f",
        "(II)Ll6/n;",
        "a",
        "Lx7/g;",
        "Lx7/f;",
        "Lx7/f;",
        "renderOptions",
        "La7/c$b;",
        "d",
        "()La7/c$b;",
        "(La7/c$b;)V",
        "viewBox",
        "",
        "getWidth",
        "()F",
        "getHeight",
        "coil-svg_release"
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
.field public final a:Lx7/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:Lx7/f;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lx7/g;)V
    .locals 0
    .param p1    # Lx7/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb7/a;->a:Lx7/g;

    return-void
.end method


# virtual methods
.method public a(La7/c$b;)V
    .locals 4
    .param p1    # La7/c$b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    iget-object v0, p0, Lb7/a;->a:Lx7/g;

    invoke-virtual {p1}, La7/c$b;->b()F

    move-result v1

    invoke-virtual {p1}, La7/c$b;->d()F

    move-result v2

    invoke-static {p1}, La7/i;->b(La7/c$b;)F

    move-result v3

    invoke-static {p1}, La7/i;->a(La7/c$b;)F

    move-result p1

    invoke-virtual {v0, v1, v2, v3, p1}, Lx7/g;->s(FFFF)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public b(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    iget-object v0, p0, Lb7/a;->a:Lx7/g;

    invoke-virtual {v0, p1}, Lx7/g;->t(Ljava/lang/String;)V

    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    iget-object v0, p0, Lb7/a;->a:Lx7/g;

    invoke-virtual {v0, p1}, Lx7/g;->r(Ljava/lang/String;)V

    return-void
.end method

.method public d()La7/c$b;
    .locals 5
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lb7/a;->a:Lx7/g;

    invoke-virtual {v0}, Lx7/g;->g()Landroid/graphics/RectF;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, La7/c$b;

    iget v2, v0, Landroid/graphics/RectF;->left:F

    iget v3, v0, Landroid/graphics/RectF;->top:F

    iget v4, v0, Landroid/graphics/RectF;->right:F

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    invoke-direct {v1, v2, v3, v4, v0}, La7/c$b;-><init>(FFFF)V

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public e(Ly6/p;)V
    .locals 1
    .param p1    # Ly6/p;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-static {p1}, La7/b;->a(Ly6/p;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Lx7/f;

    invoke-direct {v0}, Lx7/f;-><init>()V

    invoke-virtual {v0, p1}, Lx7/f;->a(Ljava/lang/String;)Lx7/f;

    iput-object v0, p0, Lb7/a;->b:Lx7/f;

    :cond_0
    return-void
.end method

.method public f(II)Ll6/n;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, La7/h;

    iget-object v1, p0, Lb7/a;->a:Lx7/g;

    iget-object v2, p0, Lb7/a;->b:Lx7/f;

    invoke-direct {v0, v1, v2, p1, p2}, La7/h;-><init>(Lx7/g;Lx7/f;II)V

    return-object v0
.end method

.method public getHeight()F
    .locals 1

    iget-object v0, p0, Lb7/a;->a:Lx7/g;

    invoke-virtual {v0}, Lx7/g;->f()F

    move-result v0

    return v0
.end method

.method public getWidth()F
    .locals 1

    iget-object v0, p0, Lb7/a;->a:Lx7/g;

    invoke-virtual {v0}, Lx7/g;->h()F

    move-result v0

    return v0
.end method
