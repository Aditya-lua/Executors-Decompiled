.class public Lz/h5$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz/h5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Ljava/util/concurrent/ScheduledExecutorService;

.field public final c:Landroid/os/Handler;

.field public final d:Lz/o3;

.field public final e:Ln0/k3;

.field public final f:Ln0/k3;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Landroid/os/Handler;Lz/o3;Ln0/k3;Ln0/k3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/h5$b;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lz/h5$b;->b:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p3, p0, Lz/h5$b;->c:Landroid/os/Handler;

    iput-object p4, p0, Lz/h5$b;->d:Lz/o3;

    iput-object p5, p0, Lz/h5$b;->e:Ln0/k3;

    iput-object p6, p0, Lz/h5$b;->f:Ln0/k3;

    return-void
.end method


# virtual methods
.method public a()Lz/h5$a;
    .locals 7

    new-instance v0, Lz/r5;

    iget-object v1, p0, Lz/h5$b;->e:Ln0/k3;

    iget-object v2, p0, Lz/h5$b;->f:Ln0/k3;

    iget-object v3, p0, Lz/h5$b;->d:Lz/o3;

    iget-object v4, p0, Lz/h5$b;->a:Ljava/util/concurrent/Executor;

    iget-object v5, p0, Lz/h5$b;->b:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v6, p0, Lz/h5$b;->c:Landroid/os/Handler;

    invoke-direct/range {v0 .. v6}, Lz/r5;-><init>(Ln0/k3;Ln0/k3;Lz/o3;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Landroid/os/Handler;)V

    return-object v0
.end method
