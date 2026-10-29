.class public final Lcom/google/android/gms/internal/measurement/nd;
.super Lcom/google/android/gms/internal/measurement/ld;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/measurement/ld;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/measurement/gb;

    iget-object v0, p1, Lcom/google/android/gms/internal/measurement/gb;->zzc:Lcom/google/android/gms/internal/measurement/md;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/md;->a()Lcom/google/android/gms/internal/measurement/md;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/measurement/md;->b()Lcom/google/android/gms/internal/measurement/md;

    move-result-object v0

    iput-object v0, p1, Lcom/google/android/gms/internal/measurement/gb;->zzc:Lcom/google/android/gms/internal/measurement/md;

    :cond_0
    return-object v0
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/measurement/gb;

    iget-object p1, p1, Lcom/google/android/gms/internal/measurement/gb;->zzc:Lcom/google/android/gms/internal/measurement/md;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/md;->d()V

    return-void
.end method
