.class public final Lg0/h2;
.super Landroidx/camera/core/b;
.source "SourceFile"


# instance fields
.field public final d:Ljava/lang/Object;

.field public final e:Lg0/i1;

.field public f:Landroid/graphics/Rect;

.field public final g:I

.field public final h:I


# direct methods
.method public constructor <init>(Landroidx/camera/core/d;Landroid/util/Size;Lg0/i1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Landroidx/camera/core/b;-><init>(Landroidx/camera/core/d;)V

    .line 3
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/h2;->d:Ljava/lang/Object;

    if-nez p2, :cond_0

    .line 4
    invoke-super {p0}, Landroidx/camera/core/b;->getWidth()I

    move-result p1

    iput p1, p0, Lg0/h2;->g:I

    .line 5
    invoke-super {p0}, Landroidx/camera/core/b;->getHeight()I

    move-result p1

    iput p1, p0, Lg0/h2;->h:I

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    move-result p1

    iput p1, p0, Lg0/h2;->g:I

    .line 7
    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    move-result p1

    iput p1, p0, Lg0/h2;->h:I

    .line 8
    :goto_0
    iput-object p3, p0, Lg0/h2;->e:Lg0/i1;

    return-void
.end method

.method public constructor <init>(Landroidx/camera/core/d;Lg0/i1;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0, p2}, Lg0/h2;-><init>(Landroidx/camera/core/d;Landroid/util/Size;Lg0/i1;)V

    return-void
.end method


# virtual methods
.method public H2()Lg0/i1;
    .locals 1

    iget-object v0, p0, Lg0/h2;->e:Lg0/i1;

    return-object v0
.end method

.method public M0(Landroid/graphics/Rect;)V
    .locals 3

    if-eqz p1, :cond_1

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    invoke-virtual {p0}, Lg0/h2;->getWidth()I

    move-result p1

    invoke-virtual {p0}, Lg0/h2;->getHeight()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v2, p1, v1}, Landroid/graphics/Rect;->intersect(IIII)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    :cond_0
    move-object p1, v0

    :cond_1
    iget-object v0, p0, Lg0/h2;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lg0/h2;->f:Landroid/graphics/Rect;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public getHeight()I
    .locals 1

    iget v0, p0, Lg0/h2;->h:I

    return v0
.end method

.method public getWidth()I
    .locals 1

    iget v0, p0, Lg0/h2;->g:I

    return v0
.end method
