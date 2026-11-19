.class public final Lcom/google/android/gms/internal/measurement/m7;
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
    invoke-static {}, Lcom/google/android/gms/internal/measurement/t7;->J()Lcom/google/android/gms/internal/measurement/t7;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/gb;-><init>(Lcom/google/android/gms/internal/measurement/kb;)V

    return-void
.end method


# virtual methods
.method public final B(I)Lcom/google/android/gms/internal/measurement/m7;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/gb;->r()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/gb;->b:Lcom/google/android/gms/internal/measurement/kb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/t7;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/t7;->M(I)V

    return-object p0
.end method

.method public final C(I)Lcom/google/android/gms/internal/measurement/m7;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/gb;->r()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/gb;->b:Lcom/google/android/gms/internal/measurement/kb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/t7;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/t7;->N(I)V

    return-object p0
.end method

.method public final z(Lcom/google/android/gms/internal/measurement/o7;)Lcom/google/android/gms/internal/measurement/m7;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/gb;->r()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/gb;->b:Lcom/google/android/gms/internal/measurement/kb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/t7;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/t7;->I(Lcom/google/android/gms/internal/measurement/o7;)V

    return-object p0
.end method
