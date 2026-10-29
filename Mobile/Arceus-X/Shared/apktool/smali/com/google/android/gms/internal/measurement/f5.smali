.class public final Lcom/google/android/gms/internal/measurement/f5;
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
    invoke-static {}, Lcom/google/android/gms/internal/measurement/g5;->c0()Lcom/google/android/gms/internal/measurement/g5;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/cb;-><init>(Lcom/google/android/gms/internal/measurement/gb;)V

    return-void
.end method


# virtual methods
.method public final A(ILcom/google/android/gms/internal/measurement/d5;)Lcom/google/android/gms/internal/measurement/f5;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/cb;->p()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/g5;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/measurement/e5;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/g5;->Z(ILcom/google/android/gms/internal/measurement/e5;)V

    return-object p0
.end method

.method public final C()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/g5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/g5;->O()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final D()Lcom/google/android/gms/internal/measurement/f5;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/cb;->p()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/g5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/g5;->a0()V

    return-object p0
.end method

.method public final E()Lcom/google/android/gms/internal/measurement/f5;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/cb;->p()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/g5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/g5;->b0()V

    return-object p0
.end method

.method public final G()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/g5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/g5;->R()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final J()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/g5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/g5;->S()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final x()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/g5;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/g5;->M()I

    move-result v0

    return v0
.end method

.method public final z(I)Lcom/google/android/gms/internal/measurement/e5;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/g5;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/g5;->N(I)Lcom/google/android/gms/internal/measurement/e5;

    move-result-object p1

    return-object p1
.end method
