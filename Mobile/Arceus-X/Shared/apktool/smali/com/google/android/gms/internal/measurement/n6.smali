.class public final Lcom/google/android/gms/internal/measurement/n6;
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
    invoke-static {}, Lcom/google/android/gms/internal/measurement/o6;->b0()Lcom/google/android/gms/internal/measurement/o6;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/cb;-><init>(Lcom/google/android/gms/internal/measurement/gb;)V

    return-void
.end method


# virtual methods
.method public final A(I)Lcom/google/android/gms/internal/measurement/s6;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/o6;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/o6;->H(I)Lcom/google/android/gms/internal/measurement/s6;

    move-result-object p1

    return-object p1
.end method

.method public final C(ILcom/google/android/gms/internal/measurement/s6;)Lcom/google/android/gms/internal/measurement/n6;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/cb;->p()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/o6;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/o6;->S(ILcom/google/android/gms/internal/measurement/s6;)V

    return-object p0
.end method

.method public final D(ILcom/google/android/gms/internal/measurement/r6;)Lcom/google/android/gms/internal/measurement/n6;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/cb;->p()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/o6;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/measurement/s6;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/o6;->S(ILcom/google/android/gms/internal/measurement/s6;)V

    return-object p0
.end method

.method public final E(Lcom/google/android/gms/internal/measurement/s6;)Lcom/google/android/gms/internal/measurement/n6;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/cb;->p()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/o6;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/o6;->T(Lcom/google/android/gms/internal/measurement/s6;)V

    return-object p0
.end method

.method public final G(Lcom/google/android/gms/internal/measurement/r6;)Lcom/google/android/gms/internal/measurement/n6;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/cb;->p()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/o6;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/s6;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/o6;->T(Lcom/google/android/gms/internal/measurement/s6;)V

    return-object p0
.end method

.method public final J(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/n6;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/cb;->p()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/o6;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/o6;->U(Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public final K()Lcom/google/android/gms/internal/measurement/n6;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/cb;->p()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/o6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/o6;->V()V

    return-object p0
.end method

.method public final N(I)Lcom/google/android/gms/internal/measurement/n6;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/cb;->p()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/o6;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/o6;->W(I)V

    return-object p0
.end method

.method public final O()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/o6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/o6;->J()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final P(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/n6;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/cb;->p()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/o6;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/o6;->X(Ljava/lang/String;)V

    return-object p0
.end method

.method public final Q()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/o6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/o6;->K()Z

    move-result v0

    return v0
.end method

.method public final R()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/o6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/o6;->M()J

    move-result-wide v0

    return-wide v0
.end method

.method public final S(J)Lcom/google/android/gms/internal/measurement/n6;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/cb;->p()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/o6;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/o6;->Y(J)V

    return-object p0
.end method

.method public final T()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/o6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/o6;->O()J

    move-result-wide v0

    return-wide v0
.end method

.method public final U(J)Lcom/google/android/gms/internal/measurement/n6;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/cb;->p()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/o6;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/o6;->Z(J)V

    return-object p0
.end method

.method public final V(J)Lcom/google/android/gms/internal/measurement/n6;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/cb;->p()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/o6;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/o6;->a0(J)V

    return-object p0
.end method

.method public final x()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/o6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/o6;->F()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final z()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/o6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/o6;->G()I

    move-result v0

    return v0
.end method
