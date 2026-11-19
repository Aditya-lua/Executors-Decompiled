.class public final Lcom/google/android/gms/internal/measurement/j5;
.super Lcom/google/android/gms/internal/measurement/gb;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/tc;


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
    invoke-static {}, Lcom/google/android/gms/internal/measurement/k5;->c0()Lcom/google/android/gms/internal/measurement/k5;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/gb;-><init>(Lcom/google/android/gms/internal/measurement/kb;)V

    return-void
.end method


# virtual methods
.method public final B(I)Lcom/google/android/gms/internal/measurement/i5;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/gb;->b:Lcom/google/android/gms/internal/measurement/kb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/k5;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/k5;->L(I)Lcom/google/android/gms/internal/measurement/i5;

    move-result-object p1

    return-object p1
.end method

.method public final C(ILcom/google/android/gms/internal/measurement/h5;)Lcom/google/android/gms/internal/measurement/j5;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/gb;->r()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/gb;->b:Lcom/google/android/gms/internal/measurement/kb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/k5;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/gb;->v()Lcom/google/android/gms/internal/measurement/kb;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/measurement/i5;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/k5;->Z(ILcom/google/android/gms/internal/measurement/i5;)V

    return-object p0
.end method

.method public final D()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/gb;->b:Lcom/google/android/gms/internal/measurement/kb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/k5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/k5;->M()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final F()Lcom/google/android/gms/internal/measurement/j5;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/gb;->r()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/gb;->b:Lcom/google/android/gms/internal/measurement/kb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/k5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/k5;->a0()V

    return-object p0
.end method

.method public final G()Lcom/google/android/gms/internal/measurement/j5;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/gb;->r()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/gb;->b:Lcom/google/android/gms/internal/measurement/kb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/k5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/k5;->b0()V

    return-object p0
.end method

.method public final H()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/gb;->b:Lcom/google/android/gms/internal/measurement/kb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/k5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/k5;->P()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final J()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/gb;->b:Lcom/google/android/gms/internal/measurement/kb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/k5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/k5;->R()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final z()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/gb;->b:Lcom/google/android/gms/internal/measurement/kb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/k5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/k5;->K()I

    move-result v0

    return v0
.end method
