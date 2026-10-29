.class public final Lae/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lae/b;


# instance fields
.field public final a:Lbe/u0;

.field public final b:Lbe/u0;

.field public final c:Lbe/u0;


# direct methods
.method public constructor <init>(Lbe/u0;Lbe/u0;Lbe/u0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lae/o0;->a:Lbe/u0;

    iput-object p2, p0, Lae/o0;->b:Lbe/u0;

    iput-object p3, p0, Lae/o0;->c:Lbe/u0;

    return-void
.end method


# virtual methods
.method public final a(Lae/d;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .param p1    # Lae/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lae/d;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lae/o0;->g()Lae/b;

    move-result-object v0

    invoke-interface {v0, p1}, Lae/b;->a(Lae/d;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lae/f;)V
    .locals 1
    .param p1    # Lae/f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Lae/o0;->g()Lae/b;

    move-result-object v0

    invoke-interface {v0, p1}, Lae/b;->b(Lae/f;)V

    return-void
.end method

.method public final c(Lae/f;)V
    .locals 1
    .param p1    # Lae/f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Lae/o0;->g()Lae/b;

    move-result-object v0

    invoke-interface {v0, p1}, Lae/b;->c(Lae/f;)V

    return-void
.end method

.method public final d(Ljava/util/List;)Lcom/google/android/gms/tasks/Task;
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

    invoke-virtual {p0}, Lae/o0;->g()Lae/b;

    move-result-object v0

    invoke-interface {v0, p1}, Lae/b;->d(Ljava/util/List;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final e()Ljava/util/Set;
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

    invoke-virtual {p0}, Lae/o0;->g()Lae/b;

    move-result-object v0

    invoke-interface {v0}, Lae/b;->e()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final f(Ljava/util/List;)Lcom/google/android/gms/tasks/Task;
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

    invoke-virtual {p0}, Lae/o0;->g()Lae/b;

    move-result-object v0

    invoke-interface {v0, p1}, Lae/b;->f(Ljava/util/List;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public final g()Lae/b;
    .locals 1

    iget-object v0, p0, Lae/o0;->c:Lbe/u0;

    invoke-interface {v0}, Lbe/u0;->zza()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lae/o0;->b:Lbe/u0;

    invoke-interface {v0}, Lbe/u0;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lae/b;

    return-object v0

    :cond_0
    iget-object v0, p0, Lae/o0;->a:Lbe/u0;

    invoke-interface {v0}, Lbe/u0;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lae/b;

    return-object v0
.end method
