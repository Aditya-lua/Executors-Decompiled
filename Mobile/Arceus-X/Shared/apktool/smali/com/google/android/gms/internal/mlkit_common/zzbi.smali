.class final Lcom/google/android/gms/internal/mlkit_common/zzbi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrf/h;


# instance fields
.field private zza:Z

.field private zzb:Z

.field private zzc:Lrf/d;

.field private final zzd:Lcom/google/android/gms/internal/mlkit_common/zzbe;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/mlkit_common/zzbe;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzbi;->zza:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzbi;->zzb:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_common/zzbi;->zzd:Lcom/google/android/gms/internal/mlkit_common/zzbe;

    return-void
.end method

.method private final zzb()V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzbi;->zza:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzbi;->zza:Z

    return-void

    :cond_0
    new-instance v0, Lrf/c;

    const-string v1, "Cannot encode a second value in the ValueEncoderContext"

    invoke-direct {v0, v1}, Lrf/c;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final add(D)Lrf/h;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_common/zzbi;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzbi;->zzd:Lcom/google/android/gms/internal/mlkit_common/zzbe;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzbi;->zzc:Lrf/d;

    iget-boolean v2, p0, Lcom/google/android/gms/internal/mlkit_common/zzbi;->zzb:Z

    .line 2
    invoke-virtual {v0, v1, p1, p2, v2}, Lcom/google/android/gms/internal/mlkit_common/zzbe;->zza(Lrf/d;DZ)Lrf/f;

    return-object p0
.end method

.method public final add(F)Lrf/h;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_common/zzbi;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzbi;->zzd:Lcom/google/android/gms/internal/mlkit_common/zzbe;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzbi;->zzc:Lrf/d;

    iget-boolean v2, p0, Lcom/google/android/gms/internal/mlkit_common/zzbi;->zzb:Z

    .line 4
    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/mlkit_common/zzbe;->zzb(Lrf/d;FZ)Lrf/f;

    return-object p0
.end method

.method public final add(I)Lrf/h;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 5
    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_common/zzbi;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzbi;->zzd:Lcom/google/android/gms/internal/mlkit_common/zzbe;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzbi;->zzc:Lrf/d;

    iget-boolean v2, p0, Lcom/google/android/gms/internal/mlkit_common/zzbi;->zzb:Z

    .line 6
    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/mlkit_common/zzbe;->zzd(Lrf/d;IZ)Lcom/google/android/gms/internal/mlkit_common/zzbe;

    return-object p0
.end method

.method public final add(J)Lrf/h;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 7
    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_common/zzbi;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzbi;->zzd:Lcom/google/android/gms/internal/mlkit_common/zzbe;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzbi;->zzc:Lrf/d;

    iget-boolean v2, p0, Lcom/google/android/gms/internal/mlkit_common/zzbi;->zzb:Z

    .line 8
    invoke-virtual {v0, v1, p1, p2, v2}, Lcom/google/android/gms/internal/mlkit_common/zzbe;->zze(Lrf/d;JZ)Lcom/google/android/gms/internal/mlkit_common/zzbe;

    return-object p0
.end method

.method public final add(Ljava/lang/String;)Lrf/h;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 9
    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_common/zzbi;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzbi;->zzd:Lcom/google/android/gms/internal/mlkit_common/zzbe;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzbi;->zzc:Lrf/d;

    iget-boolean v2, p0, Lcom/google/android/gms/internal/mlkit_common/zzbi;->zzb:Z

    .line 10
    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/mlkit_common/zzbe;->zzc(Lrf/d;Ljava/lang/Object;Z)Lrf/f;

    return-object p0
.end method

.method public final add(Z)Lrf/h;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 11
    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_common/zzbi;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzbi;->zzd:Lcom/google/android/gms/internal/mlkit_common/zzbe;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzbi;->zzc:Lrf/d;

    iget-boolean v2, p0, Lcom/google/android/gms/internal/mlkit_common/zzbi;->zzb:Z

    .line 12
    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/mlkit_common/zzbe;->zzd(Lrf/d;IZ)Lcom/google/android/gms/internal/mlkit_common/zzbe;

    return-object p0
.end method

.method public final add([B)Lrf/h;
    .locals 3
    .param p1    # [B
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 13
    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_common/zzbi;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzbi;->zzd:Lcom/google/android/gms/internal/mlkit_common/zzbe;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_common/zzbi;->zzc:Lrf/d;

    iget-boolean v2, p0, Lcom/google/android/gms/internal/mlkit_common/zzbi;->zzb:Z

    .line 14
    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/mlkit_common/zzbe;->zzc(Lrf/d;Ljava/lang/Object;Z)Lrf/f;

    return-object p0
.end method

.method public final zza(Lrf/d;Z)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/mlkit_common/zzbi;->zza:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_common/zzbi;->zzc:Lrf/d;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/mlkit_common/zzbi;->zzb:Z

    return-void
.end method
