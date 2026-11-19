.class public Ln0/g1$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln0/g1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Ln0/p0$a;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Ln0/g1$b;

.field public final d:Ln0/g1$c;


# direct methods
.method public constructor <init>(Ln0/p0$a;Ljava/util/concurrent/Executor;Ln0/g1$b;Ln0/g1$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/g1$a;->a:Ln0/p0$a;

    iput-object p2, p0, Ln0/g1$a;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Ln0/g1$a;->c:Ln0/g1$b;

    iput-object p4, p0, Ln0/g1$a;->d:Ln0/g1$c;

    return-void
.end method


# virtual methods
.method public a()Ln0/p0$a;
    .locals 1

    iget-object v0, p0, Ln0/g1$a;->a:Ln0/p0$a;

    return-object v0
.end method

.method public b()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Ln0/g1$a;->b:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Ln0/g1$a;->c:Ln0/g1$b;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ln0/f1;

    invoke-direct {v2, v1}, Ln0/f1;-><init>(Ln0/g1$b;)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "CameraStateRegistry"

    const-string v2, "Unable to notify camera to configure."

    invoke-static {v1, v2, v0}, Lg0/r1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public c()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Ln0/g1$a;->b:Ljava/util/concurrent/Executor;

    iget-object v1, p0, Ln0/g1$a;->d:Ln0/g1$c;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ln0/e1;

    invoke-direct {v2, v1}, Ln0/e1;-><init>(Ln0/g1$c;)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "CameraStateRegistry"

    const-string v2, "Unable to notify camera to open."

    invoke-static {v1, v2, v0}, Lg0/r1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public d(Ln0/p0$a;)Ln0/p0$a;
    .locals 1

    iget-object v0, p0, Ln0/g1$a;->a:Ln0/p0$a;

    iput-object p1, p0, Ln0/g1$a;->a:Ln0/p0$a;

    return-object v0
.end method
