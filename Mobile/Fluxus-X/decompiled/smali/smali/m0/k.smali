.class public Lm0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/a0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm0/k$b;,
        Lm0/k$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lx0/a0<",
        "Lm0/k$b;",
        "Lx0/b0<",
        "[B>;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Landroid/graphics/Bitmap;)I
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lm0/k$a;->a(Landroid/graphics/Bitmap;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/16 p0, 0x1005

    return p0

    :cond_0
    const/16 p0, 0x100

    return p0
.end method


# virtual methods
.method public a(Lm0/k$b;)Lx0/b0;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm0/k$b;",
            ")",
            "Lx0/b0<",
            "[B>;"
        }
    .end annotation

    invoke-virtual {p1}, Lm0/k$b;->b()Lx0/b0;

    move-result-object v0

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    invoke-virtual {v0}, Lx0/b0;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Bitmap;

    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {p1}, Lm0/k$b;->a()I

    move-result p1

    invoke-virtual {v2, v3, p1, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v4

    invoke-virtual {v0}, Lx0/b0;->d()Lp0/g;

    move-result-object v5

    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lx0/b0;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-static {p1}, Lm0/k;->b(Landroid/graphics/Bitmap;)I

    move-result v6

    invoke-virtual {v0}, Lx0/b0;->h()Landroid/util/Size;

    move-result-object v7

    invoke-virtual {v0}, Lx0/b0;->b()Landroid/graphics/Rect;

    move-result-object v8

    invoke-virtual {v0}, Lx0/b0;->f()I

    move-result v9

    invoke-virtual {v0}, Lx0/b0;->g()Landroid/graphics/Matrix;

    move-result-object v10

    invoke-virtual {v0}, Lx0/b0;->a()Ln0/e0;

    move-result-object v11

    invoke-static/range {v4 .. v11}, Lx0/b0;->m([BLp0/g;ILandroid/util/Size;Landroid/graphics/Rect;ILandroid/graphics/Matrix;Ln0/e0;)Lx0/b0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm0/k$b;

    invoke-virtual {p0, p1}, Lm0/k;->a(Lm0/k$b;)Lx0/b0;

    move-result-object p1

    return-object p1
.end method
