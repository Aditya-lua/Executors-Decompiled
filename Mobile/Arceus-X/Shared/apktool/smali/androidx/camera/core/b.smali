.class public abstract Landroidx/camera/core/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/b$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Landroidx/camera/core/d;

.field public final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroidx/camera/core/b$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/camera/core/d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/b;->a:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/b;->c:Ljava/util/Set;

    iput-object p1, p0, Landroidx/camera/core/b;->b:Landroidx/camera/core/d;

    return-void
.end method


# virtual methods
.method public H1()[Landroidx/camera/core/d$a;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/b;->b:Landroidx/camera/core/d;

    invoke-interface {v0}, Landroidx/camera/core/d;->H1()[Landroidx/camera/core/d$a;

    move-result-object v0

    return-object v0
.end method

.method public H2()Lg0/i1;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/b;->b:Landroidx/camera/core/d;

    invoke-interface {v0}, Landroidx/camera/core/d;->H2()Lg0/i1;

    move-result-object v0

    return-object v0
.end method

.method public M0(Landroid/graphics/Rect;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/b;->b:Landroidx/camera/core/d;

    invoke-interface {v0, p1}, Landroidx/camera/core/d;->M0(Landroid/graphics/Rect;)V

    return-void
.end method

.method public a(Landroidx/camera/core/b$a;)V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/b;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/b;->c:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/b;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/util/HashSet;

    iget-object v2, p0, Landroidx/camera/core/b;->c:Ljava/util/Set;

    invoke-direct {v1, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/b$a;

    invoke-interface {v1, p0}, Landroidx/camera/core/b$a;->a(Landroidx/camera/core/d;)V

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/b;->b:Landroidx/camera/core/d;

    invoke-interface {v0}, Landroidx/camera/core/d;->close()V

    invoke-virtual {p0}, Landroidx/camera/core/b;->b()V

    return-void
.end method

.method public getFormat()I
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/b;->b:Landroidx/camera/core/d;

    invoke-interface {v0}, Landroidx/camera/core/d;->getFormat()I

    move-result v0

    return v0
.end method

.method public getHeight()I
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/b;->b:Landroidx/camera/core/d;

    invoke-interface {v0}, Landroidx/camera/core/d;->getHeight()I

    move-result v0

    return v0
.end method

.method public getWidth()I
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/b;->b:Landroidx/camera/core/d;

    invoke-interface {v0}, Landroidx/camera/core/d;->getWidth()I

    move-result v0

    return v0
.end method

.method public p()Landroid/media/Image;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/b;->b:Landroidx/camera/core/d;

    invoke-interface {v0}, Landroidx/camera/core/d;->p()Landroid/media/Image;

    move-result-object v0

    return-object v0
.end method
