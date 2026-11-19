.class public Lz/r2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/m3;


# instance fields
.field public final a:Ljava/lang/Object;

.field public b:Lz/k3;

.field public c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ln0/r3;",
            ">;"
        }
    .end annotation
.end field

.field public volatile d:Z

.field public volatile e:Ln0/o3;


# direct methods
.method public constructor <init>(Lz/k3;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz/k3;",
            "Ljava/util/List<",
            "Ln0/r3;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lz/r2;->a:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lz/r2;->d:Z

    iget-object v1, p1, Lz/k3;->j:Lz/k3$c;

    sget-object v2, Lz/k3$c;->h:Lz/k3$c;

    if-ne v1, v2, :cond_0

    const/4 v0, 0x1

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "CaptureSession state must be OPENED. Current state:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p1, Lz/k3;->j:Lz/k3$c;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lx2/g;->b(ZLjava/lang/Object;)V

    iput-object p1, p0, Lz/r2;->b:Lz/k3;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lz/r2;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lz/r2;->a:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lz/r2;->d:Z

    const/4 v1, 0x0

    iput-object v1, p0, Lz/r2;->b:Lz/k3;

    iput-object v1, p0, Lz/r2;->e:Ln0/o3;

    iput-object v1, p0, Lz/r2;->c:Ljava/util/List;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public b(Ln0/o3;)V
    .locals 1

    iget-object v0, p0, Lz/r2;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lz/r2;->e:Ln0/o3;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
