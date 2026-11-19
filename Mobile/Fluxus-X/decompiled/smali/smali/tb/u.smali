.class public final Ltb/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltb/h0;


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Ltb/c;

.field public final c:Ltb/n0;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Ltb/c;Ltb/n0;)V
    .locals 0
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ltb/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ltb/n0;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltb/u;->a:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Ltb/u;->b:Ltb/c;

    iput-object p3, p0, Ltb/u;->c:Ltb/n0;

    return-void
.end method

.method public static bridge synthetic a(Ltb/u;)Ltb/c;
    .locals 0

    iget-object p0, p0, Ltb/u;->b:Ltb/c;

    return-object p0
.end method

.method public static bridge synthetic c(Ltb/u;)Ltb/n0;
    .locals 0

    iget-object p0, p0, Ltb/u;->c:Ltb/n0;

    return-object p0
.end method


# virtual methods
.method public final b(Lcom/google/android/gms/tasks/Task;)V
    .locals 1
    .param p1    # Lcom/google/android/gms/tasks/Task;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Ltb/t;

    invoke-direct {v0, p0, p1}, Ltb/t;-><init>(Ltb/u;Lcom/google/android/gms/tasks/Task;)V

    iget-object p1, p0, Ltb/u;->a:Ljava/util/concurrent/Executor;

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final zzc()V
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method
