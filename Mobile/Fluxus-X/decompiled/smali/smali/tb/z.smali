.class public final Ltb/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/tasks/Task;

.field public final synthetic b:Ltb/a0;


# direct methods
.method public constructor <init>(Ltb/a0;Lcom/google/android/gms/tasks/Task;)V
    .locals 0

    iput-object p1, p0, Ltb/z;->b:Ltb/a0;

    iput-object p2, p0, Ltb/z;->a:Lcom/google/android/gms/tasks/Task;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Ltb/z;->b:Ltb/a0;

    invoke-static {v0}, Ltb/a0;->c(Ltb/a0;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ltb/z;->b:Ltb/a0;

    invoke-static {v1}, Ltb/a0;->a(Ltb/a0;)Lcom/google/android/gms/tasks/OnCompleteListener;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Ltb/a0;->a(Ltb/a0;)Lcom/google/android/gms/tasks/OnCompleteListener;

    move-result-object v1

    iget-object v2, p0, Ltb/z;->a:Lcom/google/android/gms/tasks/Task;

    invoke-interface {v1, v2}, Lcom/google/android/gms/tasks/OnCompleteListener;->onComplete(Lcom/google/android/gms/tasks/Task;)V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
