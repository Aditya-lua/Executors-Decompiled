.class public final Lcom/google/android/gms/internal/measurement/v6;
.super Lcom/google/android/gms/internal/measurement/cb;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/pc;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    throw v0
.end method

.method public synthetic constructor <init>([B)V
    .locals 0

    .line 2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/y6;->W()Lcom/google/android/gms/internal/measurement/y6;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/cb;-><init>(Lcom/google/android/gms/internal/measurement/gb;)V

    return-void
.end method


# virtual methods
.method public final A(I)Lcom/google/android/gms/internal/measurement/a7;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/y6;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/y6;->H(I)Lcom/google/android/gms/internal/measurement/a7;

    move-result-object p1

    return-object p1
.end method

.method public final C(ILcom/google/android/gms/internal/measurement/z6;)Lcom/google/android/gms/internal/measurement/v6;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/cb;->p()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/y6;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/y6;->Q(ILcom/google/android/gms/internal/measurement/a7;)V

    return-object p0
.end method

.method public final D(Lcom/google/android/gms/internal/measurement/z6;)Lcom/google/android/gms/internal/measurement/v6;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/cb;->p()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/y6;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/a7;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/y6;->R(Lcom/google/android/gms/internal/measurement/a7;)V

    return-object p0
.end method

.method public final E(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/v6;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/cb;->p()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/y6;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/y6;->S(Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public final G()Lcom/google/android/gms/internal/measurement/v6;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/cb;->p()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/y6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/y6;->T()V

    return-object p0
.end method

.method public final J()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/y6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/y6;->K()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final K(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/v6;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/cb;->p()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/y6;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/y6;->U(Ljava/lang/String;)V

    return-object p0
.end method

.method public final N(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/v6;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/cb;->p()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/y6;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/y6;->V(Ljava/lang/String;)V

    return-object p0
.end method

.method public final x()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/y6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/y6;->F()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final z()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/y6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/y6;->G()I

    move-result v0

    return v0
.end method
