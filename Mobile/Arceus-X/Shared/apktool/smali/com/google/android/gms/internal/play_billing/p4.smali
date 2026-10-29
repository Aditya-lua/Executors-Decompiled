.class public Lcom/google/android/gms/internal/play_billing/p4;
.super Lcom/google/android/gms/internal/play_billing/b3;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/android/gms/internal/play_billing/t4<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lcom/google/android/gms/internal/play_billing/p4<",
        "TMessageType;TBuilderType;>;>",
        "Lcom/google/android/gms/internal/play_billing/b3<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# instance fields
.field public final a:Lcom/google/android/gms/internal/play_billing/t4;

.field public b:Lcom/google/android/gms/internal/play_billing/t4;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/play_billing/t4;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/play_billing/b3;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/p4;->a:Lcom/google/android/gms/internal/play_billing/t4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/t4;->l()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/t4;->u()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/play_billing/p4;->b:Lcom/google/android/gms/internal/play_billing/t4;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Default instance must be immutable."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static b(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/play_billing/e6;->a()Lcom/google/android/gms/internal/play_billing/e6;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/play_billing/e6;->b(Ljava/lang/Class;)Lcom/google/android/gms/internal/play_billing/h6;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lcom/google/android/gms/internal/play_billing/h6;->c(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final c()Lcom/google/android/gms/internal/play_billing/p4;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/p4;->a:Lcom/google/android/gms/internal/play_billing/t4;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/play_billing/t4;->p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/play_billing/p4;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/p4;->j()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object v1

    iput-object v1, v0, Lcom/google/android/gms/internal/play_billing/p4;->b:Lcom/google/android/gms/internal/play_billing/t4;

    return-object v0
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/p4;->c()Lcom/google/android/gms/internal/play_billing/p4;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic g()Lcom/google/android/gms/internal/play_billing/x5;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/p4;->j()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object v0

    return-object v0
.end method

.method public final h(Lcom/google/android/gms/internal/play_billing/t4;)Lcom/google/android/gms/internal/play_billing/p4;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/p4;->a:Lcom/google/android/gms/internal/play_billing/t4;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/play_billing/t4;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/p4;->b:Lcom/google/android/gms/internal/play_billing/t4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/t4;->l()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/p4;->n()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/p4;->b:Lcom/google/android/gms/internal/play_billing/t4;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/play_billing/p4;->b(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-object p0
.end method

.method public final i()Lcom/google/android/gms/internal/play_billing/t4;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/p4;->j()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/t4;->zzo()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Lcom/google/android/gms/internal/play_billing/s6;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/play_billing/s6;-><init>(Lcom/google/android/gms/internal/play_billing/x5;)V

    throw v1
.end method

.method public j()Lcom/google/android/gms/internal/play_billing/t4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/p4;->b:Lcom/google/android/gms/internal/play_billing/t4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/t4;->l()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/p4;->b:Lcom/google/android/gms/internal/play_billing/t4;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/p4;->b:Lcom/google/android/gms/internal/play_billing/t4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/t4;->A()V

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/p4;->b:Lcom/google/android/gms/internal/play_billing/t4;

    return-object v0
.end method

.method public final k()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/p4;->b:Lcom/google/android/gms/internal/play_billing/t4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/t4;->l()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/play_billing/p4;->n()V

    :cond_0
    return-void
.end method

.method public n()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/p4;->a:Lcom/google/android/gms/internal/play_billing/t4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/play_billing/t4;->u()Lcom/google/android/gms/internal/play_billing/t4;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/play_billing/p4;->b:Lcom/google/android/gms/internal/play_billing/t4;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/p4;->b(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/play_billing/p4;->b:Lcom/google/android/gms/internal/play_billing/t4;

    return-void
.end method

.method public final zzo()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/play_billing/p4;->b:Lcom/google/android/gms/internal/play_billing/t4;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/play_billing/t4;->k(Lcom/google/android/gms/internal/play_billing/t4;Z)Z

    move-result v0

    return v0
.end method
