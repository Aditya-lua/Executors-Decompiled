.class public final Landroidx/camera/core/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/a$a;
    }
.end annotation


# instance fields
.field public final a:Landroid/media/Image;

.field public final b:[Landroidx/camera/core/a$a;

.field public final c:Lg0/i1;


# direct methods
.method public constructor <init>(Landroid/media/Image;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/a;->a:Landroid/media/Image;

    invoke-virtual {p1}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    array-length v2, v0

    new-array v2, v2, [Landroidx/camera/core/a$a;

    iput-object v2, p0, Landroidx/camera/core/a;->b:[Landroidx/camera/core/a$a;

    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Landroidx/camera/core/a;->b:[Landroidx/camera/core/a$a;

    new-instance v3, Landroidx/camera/core/a$a;

    aget-object v4, v0, v1

    invoke-direct {v3, v4}, Landroidx/camera/core/a$a;-><init>(Landroid/media/Image$Plane;)V

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-array v0, v1, [Landroidx/camera/core/a$a;

    iput-object v0, p0, Landroidx/camera/core/a;->b:[Landroidx/camera/core/a$a;

    :cond_1
    invoke-static {}, Ln0/z3;->b()Ln0/z3;

    move-result-object v1

    invoke-virtual {p1}, Landroid/media/Image;->getTimestamp()J

    move-result-wide v2

    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lg0/o1;->f(Ln0/z3;JILandroid/graphics/Matrix;I)Lg0/i1;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/a;->c:Lg0/i1;

    return-void
.end method


# virtual methods
.method public H1()[Landroidx/camera/core/d$a;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/a;->b:[Landroidx/camera/core/a$a;

    return-object v0
.end method

.method public H2()Lg0/i1;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/a;->c:Lg0/i1;

    return-object v0
.end method

.method public M0(Landroid/graphics/Rect;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/a;->a:Landroid/media/Image;

    invoke-virtual {v0, p1}, Landroid/media/Image;->setCropRect(Landroid/graphics/Rect;)V

    return-void
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/a;->a:Landroid/media/Image;

    invoke-virtual {v0}, Landroid/media/Image;->close()V

    return-void
.end method

.method public getFormat()I
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/a;->a:Landroid/media/Image;

    invoke-virtual {v0}, Landroid/media/Image;->getFormat()I

    move-result v0

    return v0
.end method

.method public getHeight()I
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/a;->a:Landroid/media/Image;

    invoke-virtual {v0}, Landroid/media/Image;->getHeight()I

    move-result v0

    return v0
.end method

.method public getWidth()I
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/a;->a:Landroid/media/Image;

    invoke-virtual {v0}, Landroid/media/Image;->getWidth()I

    move-result v0

    return v0
.end method

.method public p()Landroid/media/Image;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/a;->a:Landroid/media/Image;

    return-object v0
.end method
