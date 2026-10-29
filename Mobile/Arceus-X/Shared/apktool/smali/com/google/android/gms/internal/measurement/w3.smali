.class public final Lcom/google/android/gms/internal/measurement/w3;
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
    invoke-static {}, Lcom/google/android/gms/internal/measurement/x3;->R()Lcom/google/android/gms/internal/measurement/x3;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/cb;-><init>(Lcom/google/android/gms/internal/measurement/gb;)V

    return-void
.end method


# virtual methods
.method public final A(ILcom/google/android/gms/internal/measurement/g4;)Lcom/google/android/gms/internal/measurement/w3;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/cb;->p()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/x3;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/measurement/h4;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/x3;->P(ILcom/google/android/gms/internal/measurement/h4;)V

    return-object p0
.end method

.method public final C()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/x3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/x3;->N()I

    move-result v0

    return v0
.end method

.method public final D(I)Lcom/google/android/gms/internal/measurement/z3;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/x3;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/x3;->O(I)Lcom/google/android/gms/internal/measurement/z3;

    move-result-object p1

    return-object p1
.end method

.method public final E(ILcom/google/android/gms/internal/measurement/y3;)Lcom/google/android/gms/internal/measurement/w3;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/cb;->p()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/x3;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/measurement/z3;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/x3;->Q(ILcom/google/android/gms/internal/measurement/z3;)V

    return-object p0
.end method

.method public final x()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/x3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/x3;->J()I

    move-result v0

    return v0
.end method

.method public final z(I)Lcom/google/android/gms/internal/measurement/h4;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/x3;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/x3;->K(I)Lcom/google/android/gms/internal/measurement/h4;

    move-result-object p1

    return-object p1
.end method
