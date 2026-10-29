.class public final Lcom/google/android/gms/internal/measurement/b7;
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
    invoke-static {}, Lcom/google/android/gms/internal/measurement/d7;->H()Lcom/google/android/gms/internal/measurement/d7;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/cb;-><init>(Lcom/google/android/gms/internal/measurement/gb;)V

    return-void
.end method


# virtual methods
.method public final x(Lcom/google/android/gms/internal/measurement/p6;)Lcom/google/android/gms/internal/measurement/b7;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/cb;->p()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/cb;->b:Lcom/google/android/gms/internal/measurement/gb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/d7;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/cb;->t()Lcom/google/android/gms/internal/measurement/gb;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/measurement/q6;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/d7;->G(Lcom/google/android/gms/internal/measurement/q6;)V

    return-object p0
.end method
