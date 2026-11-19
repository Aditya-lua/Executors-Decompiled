.class public final Lcom/google/android/gms/internal/measurement/f7;
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
    invoke-static {}, Lcom/google/android/gms/internal/measurement/h7;->H()Lcom/google/android/gms/internal/measurement/h7;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/gb;-><init>(Lcom/google/android/gms/internal/measurement/kb;)V

    return-void
.end method


# virtual methods
.method public final z(Lcom/google/android/gms/internal/measurement/t6;)Lcom/google/android/gms/internal/measurement/f7;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/gb;->r()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/gb;->b:Lcom/google/android/gms/internal/measurement/kb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/h7;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/gb;->v()Lcom/google/android/gms/internal/measurement/kb;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/u6;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/h7;->G(Lcom/google/android/gms/internal/measurement/u6;)V

    return-object p0
.end method
