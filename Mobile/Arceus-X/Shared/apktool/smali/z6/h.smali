.class public final Lz6/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk6/n;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u000f\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\u000cH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u001a\u0010\u0008\u001a\u00020\u00068\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0019\u001a\u0004\u0008\u001d\u0010\u001bR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010 R\u0014\u0010$\u001a\u00020\"8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010#\u00a8\u0006%"
    }
    d2 = {
        "Lz6/h;",
        "Lk6/n;",
        "Lw7/g;",
        "svg",
        "Lw7/f;",
        "renderOptions",
        "",
        "width",
        "height",
        "<init>",
        "(Lw7/g;Lw7/f;II)V",
        "Landroid/graphics/Canvas;",
        "Lcoil3/Canvas;",
        "canvas",
        "",
        "b",
        "(Landroid/graphics/Canvas;)V",
        "a",
        "Lw7/g;",
        "getSvg",
        "()Lw7/g;",
        "Lw7/f;",
        "getRenderOptions",
        "()Lw7/f;",
        "c",
        "I",
        "getWidth",
        "()I",
        "d",
        "getHeight",
        "",
        "i",
        "()J",
        "size",
        "",
        "()Z",
        "shareable",
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
.field public final a:Lw7/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lw7/f;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final c:I

.field public final d:I


# direct methods
.method public constructor <init>(Lw7/g;Lw7/f;II)V
    .locals 0
    .param p1    # Lw7/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lw7/f;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz6/h;->a:Lw7/g;

    iput-object p2, p0, Lz6/h;->b:Lw7/f;

    iput p3, p0, Lz6/h;->c:I

    iput p4, p0, Lz6/h;->d:I

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public b(Landroid/graphics/Canvas;)V
    .locals 2
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    iget-object v0, p0, Lz6/h;->a:Lw7/g;

    iget-object v1, p0, Lz6/h;->b:Lw7/f;

    invoke-virtual {v0, p1, v1}, Lw7/g;->o(Landroid/graphics/Canvas;Lw7/f;)V

    return-void
.end method

.method public getHeight()I
    .locals 1

    iget v0, p0, Lz6/h;->d:I

    return v0
.end method

.method public getWidth()I
    .locals 1

    iget v0, p0, Lz6/h;->c:I

    return v0
.end method

.method public i()J
    .locals 2

    const-wide/16 v0, 0x800

    return-wide v0
.end method
