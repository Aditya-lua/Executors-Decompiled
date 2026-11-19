.class public final Ln6/x$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/ImageDecoder$OnHeaderDecodedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln6/x;->a(Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Landroid/graphics/ImageDecoder;",
        "decoder",
        "Landroid/graphics/ImageDecoder$ImageInfo;",
        "info",
        "Landroid/graphics/ImageDecoder$Source;",
        "source",
        "",
        "onHeaderDecoded",
        "(Landroid/graphics/ImageDecoder;Landroid/graphics/ImageDecoder$ImageInfo;Landroid/graphics/ImageDecoder$Source;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic a:Ln6/x;

.field public final synthetic b:Lkotlin/jvm/internal/y;


# direct methods
.method public constructor <init>(Ln6/x;Lkotlin/jvm/internal/y;)V
    .locals 0

    iput-object p1, p0, Ln6/x$c;->a:Ln6/x;

    iput-object p2, p0, Ln6/x$c;->b:Lkotlin/jvm/internal/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onHeaderDecoded(Landroid/graphics/ImageDecoder;Landroid/graphics/ImageDecoder$ImageInfo;Landroid/graphics/ImageDecoder$Source;)V
    .locals 5

    invoke-virtual {p2}, Landroid/graphics/ImageDecoder$ImageInfo;->getSize()Landroid/util/Size;

    move-result-object p2

    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    move-result p3

    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    move-result p2

    iget-object v0, p0, Ln6/x$c;->a:Ln6/x;

    invoke-static {v0}, Ln6/x;->d(Ln6/x;)Ly6/p;

    move-result-object v0

    invoke-virtual {v0}, Ly6/p;->k()Lz6/g;

    move-result-object v0

    iget-object v1, p0, Ln6/x$c;->a:Ln6/x;

    invoke-static {v1}, Ln6/x;->d(Ln6/x;)Ly6/p;

    move-result-object v1

    invoke-virtual {v1}, Ly6/p;->j()Lz6/f;

    move-result-object v1

    iget-object v2, p0, Ln6/x$c;->a:Ln6/x;

    invoke-static {v2}, Ln6/x;->d(Ln6/x;)Ly6/p;

    move-result-object v2

    invoke-static {v2}, Ly6/i;->g(Ly6/p;)Lz6/g;

    move-result-object v2

    invoke-static {p3, p2, v0, v1, v2}, Ln6/h;->b(IILz6/g;Lz6/f;Lz6/g;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lf7/r;->c(J)I

    move-result v2

    invoke-static {v0, v1}, Lf7/r;->d(J)I

    move-result v0

    if-lez p3, :cond_3

    if-lez p2, :cond_3

    if-ne p3, v2, :cond_0

    if-eq p2, v0, :cond_3

    :cond_0
    iget-object v1, p0, Ln6/x$c;->a:Ln6/x;

    invoke-static {v1}, Ln6/x;->d(Ln6/x;)Ly6/p;

    move-result-object v1

    invoke-virtual {v1}, Ly6/p;->j()Lz6/f;

    move-result-object v1

    invoke-static {p3, p2, v2, v0, v1}, Ln6/h;->d(IIIILz6/f;)D

    move-result-wide v0

    iget-object v2, p0, Ln6/x$c;->b:Lkotlin/jvm/internal/y;

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    cmpg-double v3, v0, v3

    if-gez v3, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    iput-boolean v3, v2, Lkotlin/jvm/internal/y;->a:Z

    if-nez v3, :cond_2

    iget-object v2, p0, Ln6/x$c;->a:Ln6/x;

    invoke-static {v2}, Ln6/x;->d(Ln6/x;)Ly6/p;

    move-result-object v2

    invoke-virtual {v2}, Ly6/p;->i()Lz6/c;

    move-result-object v2

    sget-object v3, Lz6/c;->a:Lz6/c;

    if-ne v2, v3, :cond_3

    :cond_2
    int-to-double v2, p3

    mul-double/2addr v2, v0

    invoke-static {v2, v3}, Lsu/b;->c(D)I

    move-result p3

    int-to-double v2, p2

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Lsu/b;->c(D)I

    move-result p2

    invoke-virtual {p1, p3, p2}, Landroid/graphics/ImageDecoder;->setTargetSize(II)V

    :cond_3
    iget-object p2, p0, Ln6/x$c;->a:Ln6/x;

    invoke-static {p2, p1}, Ln6/x;->c(Ln6/x;Landroid/graphics/ImageDecoder;)V

    return-void
.end method
