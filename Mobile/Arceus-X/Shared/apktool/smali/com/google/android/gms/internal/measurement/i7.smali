.class public final Lcom/google/android/gms/internal/measurement/i7;
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
    invoke-static {}, Lcom/google/android/gms/internal/measurement/p7;->K()Lcom/google/android/gms/internal/measurement/p7;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/cb;-><init>(Lcom/google/android/gms/internal/measurement/gb;)V

    return-void
.end method


# virtual methods
.method public final A(I)Lcom/google/android/gms/internal/measurement/i7;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/cb;->p()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/p7;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/p7;->P(I)V

    return-object p0
.end method

.method public final x(Lcom/google/android/gms/internal/measurement/k7;)Lcom/google/android/gms/internal/measurement/i7;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/cb;->p()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/p7;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/p7;->J(Lcom/google/android/gms/internal/measurement/k7;)V

    return-object p0
.end method

.method public final z(I)Lcom/google/android/gms/internal/measurement/i7;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/cb;->p()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/p7;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/p7;->O(I)V

    return-object p0
.end method
