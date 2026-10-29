.class public final Ll9/p1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lw1/a;

.field public final b:Lw1/a;

.field public final c:Lsb/k;

.field public d:I

.field public e:Z


# direct methods
.method public constructor <init>(Ljava/lang/Iterable;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lw1/a;

    invoke-direct {v0}, Lw1/a;-><init>()V

    iput-object v0, p0, Ll9/p1;->b:Lw1/a;

    new-instance v0, Lsb/k;

    invoke-direct {v0}, Lsb/k;-><init>()V

    iput-object v0, p0, Ll9/p1;->c:Lsb/k;

    const/4 v0, 0x0

    iput-boolean v0, p0, Ll9/p1;->e:Z

    new-instance v0, Lw1/a;

    invoke-direct {v0}, Lw1/a;-><init>()V

    iput-object v0, p0, Ll9/p1;->a:Lw1/a;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk9/g;

    iget-object v1, p0, Ll9/p1;->a:Lw1/a;

    invoke-interface {v0}, Lk9/g;->u()Ll9/b;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lw1/j;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ll9/p1;->a:Lw1/a;

    invoke-virtual {p1}, Lw1/a;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result p1

    iput p1, p0, Ll9/p1;->d:I

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/tasks/Task;
    .locals 1

    iget-object v0, p0, Ll9/p1;->c:Lsb/k;

    invoke-virtual {v0}, Lsb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method

.method public final b()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Ll9/p1;->a:Lw1/a;

    invoke-virtual {v0}, Lw1/a;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final c(Ll9/b;Lcom/google/android/gms/common/ConnectionResult;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Ll9/p1;->a:Lw1/a;

    invoke-virtual {v0, p1, p2}, Lw1/j;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Ll9/p1;->b:Lw1/a;

    invoke-virtual {v0, p1, p3}, Lw1/j;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget p1, p0, Ll9/p1;->d:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Ll9/p1;->d:I

    invoke-virtual {p2}, Lcom/google/android/gms/common/ConnectionResult;->A3()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Ll9/p1;->e:Z

    :cond_0
    iget p1, p0, Ll9/p1;->d:I

    if-nez p1, :cond_2

    iget-boolean p1, p0, Ll9/p1;->e:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Ll9/p1;->a:Lw1/a;

    new-instance p2, Lk9/c;

    invoke-direct {p2, p1}, Lk9/c;-><init>(Lw1/a;)V

    iget-object p1, p0, Ll9/p1;->c:Lsb/k;

    invoke-virtual {p1, p2}, Lsb/k;->b(Ljava/lang/Exception;)V

    return-void

    :cond_1
    iget-object p1, p0, Ll9/p1;->c:Lsb/k;

    iget-object p2, p0, Ll9/p1;->b:Lw1/a;

    invoke-virtual {p1, p2}, Lsb/k;->c(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method
