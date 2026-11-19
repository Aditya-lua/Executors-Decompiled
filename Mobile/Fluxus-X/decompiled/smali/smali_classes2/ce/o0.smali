.class public final Lce/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lce/b;


# instance fields
.field public final a:Lde/u0;

.field public final b:Lde/u0;

.field public final c:Lde/u0;


# direct methods
.method public constructor <init>(Lde/u0;Lde/u0;Lde/u0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lce/o0;->a:Lde/u0;

    iput-object p2, p0, Lce/o0;->b:Lde/u0;

    iput-object p3, p0, Lce/o0;->c:Lde/u0;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lce/o0;->g()Lce/b;

    move-result-object v0

    invoke-interface {v0, p1}, Lce/b;->a(Ljava/util/List;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final b()Ljava/util/Set;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lce/o0;->g()Lce/b;

    move-result-object v0

    invoke-interface {v0}, Lce/b;->b()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final c(Lce/f;)V
    .locals 1
    .param p1    # Lce/f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Lce/o0;->g()Lce/b;

    move-result-object v0

    invoke-interface {v0, p1}, Lce/b;->c(Lce/f;)V

    return-void
.end method

.method public final d(Lce/d;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .param p1    # Lce/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lce/d;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lce/o0;->g()Lce/b;

    move-result-object v0

    invoke-interface {v0, p1}, Lce/b;->d(Lce/d;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ljava/util/List;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lce/o0;->g()Lce/b;

    move-result-object v0

    invoke-interface {v0, p1}, Lce/b;->e(Ljava/util/List;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final f(Lce/f;)V
    .locals 1
    .param p1    # Lce/f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Lce/o0;->g()Lce/b;

    move-result-object v0

    invoke-interface {v0, p1}, Lce/b;->f(Lce/f;)V

    return-void
.end method

.method public final g()Lce/b;
    .locals 1

    iget-object v0, p0, Lce/o0;->c:Lde/u0;

    invoke-interface {v0}, Lde/u0;->zza()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lce/o0;->b:Lde/u0;

    invoke-interface {v0}, Lde/u0;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lce/b;

    return-object v0

    :cond_0
    iget-object v0, p0, Lce/o0;->a:Lde/u0;

    invoke-interface {v0}, Lde/u0;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lce/b;

    return-object v0
.end method
