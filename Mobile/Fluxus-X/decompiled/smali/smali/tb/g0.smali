.class public final Ltb/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltb/g;
.implements Ltb/f;
.implements Ltb/e;
.implements Ltb/h0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<TResult:",
        "Ljava/lang/Object;",
        "TContinuationResult:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ltb/g<",
        "TTContinuationResult;>;",
        "Ltb/f;",
        "Ltb/e;",
        "Ltb/h0;"
    }
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Ltb/j;

.field public final c:Ltb/n0;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Ltb/j;Ltb/n0;)V
    .locals 0
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ltb/j;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ltb/n0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltb/g0;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Ltb/g0;->b:Ltb/j;

    iput-object p3, p0, Ltb/g0;->c:Ltb/n0;

    return-void
.end method

.method public static bridge synthetic c(Ltb/g0;)Ltb/j;
    .locals 0

    iget-object p0, p0, Ltb/g0;->b:Ltb/j;

    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Ltb/g0;->c:Ltb/n0;

    invoke-virtual {v0}, Ltb/n0;->r()Z

    return-void
.end method

.method public final b(Lcom/google/android/gms/tasks/Task;)V
    .locals 1
    .param p1    # Lcom/google/android/gms/tasks/Task;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Ltb/f0;

    invoke-direct {v0, p0, p1}, Ltb/f0;-><init>(Ltb/g0;Lcom/google/android/gms/tasks/Task;)V

    iget-object p1, p0, Ltb/g0;->a:Ljava/util/concurrent/Executor;

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final onFailure(Ljava/lang/Exception;)V
    .locals 1
    .param p1    # Ljava/lang/Exception;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Ltb/g0;->c:Ltb/n0;

    invoke-virtual {v0, p1}, Ltb/n0;->p(Ljava/lang/Exception;)V

    return-void
.end method

.method public final onSuccess(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TTContinuationResult;)V"
        }
    .end annotation

    iget-object v0, p0, Ltb/g0;->c:Ltb/n0;

    invoke-virtual {v0, p1}, Ltb/n0;->q(Ljava/lang/Object;)V

    return-void
.end method

.method public final zzc()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
