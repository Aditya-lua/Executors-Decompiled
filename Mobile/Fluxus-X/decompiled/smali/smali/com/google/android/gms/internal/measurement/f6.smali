.class public final Lcom/google/android/gms/internal/measurement/f6;
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
    invoke-static {}, Lcom/google/android/gms/internal/measurement/g6;->S()Lcom/google/android/gms/internal/measurement/g6;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/gb;-><init>(Lcom/google/android/gms/internal/measurement/kb;)V

    return-void
.end method


# virtual methods
.method public final B(Lcom/google/android/gms/internal/measurement/i7;)Lcom/google/android/gms/internal/measurement/f6;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/gb;->r()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/gb;->b:Lcom/google/android/gms/internal/measurement/kb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/g6;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/gb;->v()Lcom/google/android/gms/internal/measurement/kb;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/j7;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/g6;->O(Lcom/google/android/gms/internal/measurement/j7;)V

    return-object p0
.end method

.method public final C(Lcom/google/android/gms/internal/measurement/j7;)Lcom/google/android/gms/internal/measurement/f6;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/gb;->r()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/gb;->b:Lcom/google/android/gms/internal/measurement/kb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/g6;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/g6;->P(Lcom/google/android/gms/internal/measurement/j7;)V

    return-object p0
.end method

.method public final D(Z)Lcom/google/android/gms/internal/measurement/f6;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/gb;->r()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/gb;->b:Lcom/google/android/gms/internal/measurement/kb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/g6;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/g6;->R(Z)V

    return-object p0
.end method

.method public final z(I)Lcom/google/android/gms/internal/measurement/f6;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/gb;->r()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/gb;->b:Lcom/google/android/gms/internal/measurement/kb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/g6;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/g6;->N(I)V

    return-object p0
.end method
