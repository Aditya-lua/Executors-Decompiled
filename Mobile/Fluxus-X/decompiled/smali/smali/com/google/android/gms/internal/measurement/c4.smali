.class public final Lcom/google/android/gms/internal/measurement/c4;
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
    invoke-static {}, Lcom/google/android/gms/internal/measurement/d4;->W()Lcom/google/android/gms/internal/measurement/d4;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/gb;-><init>(Lcom/google/android/gms/internal/measurement/kb;)V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/c4;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/gb;->r()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/gb;->b:Lcom/google/android/gms/internal/measurement/kb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/d4;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/d4;->U(Ljava/lang/String;)V

    return-object p0
.end method

.method public final C()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/gb;->b:Lcom/google/android/gms/internal/measurement/kb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/d4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/d4;->J()I

    move-result v0

    return v0
.end method

.method public final D(I)Lcom/google/android/gms/internal/measurement/f4;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/gb;->b:Lcom/google/android/gms/internal/measurement/kb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/d4;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/measurement/d4;->K(I)Lcom/google/android/gms/internal/measurement/f4;

    move-result-object p1

    return-object p1
.end method

.method public final F(ILcom/google/android/gms/internal/measurement/f4;)Lcom/google/android/gms/internal/measurement/c4;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/measurement/gb;->r()V

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/gb;->b:Lcom/google/android/gms/internal/measurement/kb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/d4;

    invoke-virtual {v0, p1, p2}, Lcom/google/android/gms/internal/measurement/d4;->V(ILcom/google/android/gms/internal/measurement/f4;)V

    return-object p0
.end method

.method public final z()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/gb;->b:Lcom/google/android/gms/internal/measurement/kb;

    check-cast v0, Lcom/google/android/gms/internal/measurement/d4;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/d4;->H()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
