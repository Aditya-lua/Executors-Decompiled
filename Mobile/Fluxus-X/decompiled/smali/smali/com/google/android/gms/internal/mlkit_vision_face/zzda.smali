.class final Lcom/google/android/gms/internal/mlkit_vision_face/zzda;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltf/h;


# instance fields
.field private zza:Z

.field private zzb:Z

.field private zzc:Ltf/d;

.field private final zzd:Lcom/google/android/gms/internal/mlkit_vision_face/zzcw;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_face/zzcw;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzda;->zza:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzda;->zzb:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzda;->zzd:Lcom/google/android/gms/internal/mlkit_vision_face/zzcw;

    return-void
.end method

.method private final zzb()V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzda;->zza:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzda;->zza:Z

    return-void

    :cond_0
    new-instance v0, Ltf/c;

    const-string v1, "Cannot encode a second value in the ValueEncoderContext"

    invoke-direct {v0, v1}, Ltf/c;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final add(D)Ltf/h;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzda;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzda;->zzd:Lcom/google/android/gms/internal/mlkit_vision_face/zzcw;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzda;->zzc:Ltf/d;

    iget-boolean v2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzda;->zzb:Z

    .line 2
    invoke-virtual {v0, v1, p1, p2, v2}, Lcom/google/android/gms/internal/mlkit_vision_face/zzcw;->zza(Ltf/d;DZ)Ltf/f;

    return-object p0
.end method

.method public final add(F)Ltf/h;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 3
    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzda;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzda;->zzd:Lcom/google/android/gms/internal/mlkit_vision_face/zzcw;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzda;->zzc:Ltf/d;

    iget-boolean v2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzda;->zzb:Z

    .line 4
    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/mlkit_vision_face/zzcw;->zzb(Ltf/d;FZ)Ltf/f;

    return-object p0
.end method

.method public final add(I)Ltf/h;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 5
    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzda;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzda;->zzd:Lcom/google/android/gms/internal/mlkit_vision_face/zzcw;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzda;->zzc:Ltf/d;

    iget-boolean v2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzda;->zzb:Z

    .line 6
    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/mlkit_vision_face/zzcw;->zzd(Ltf/d;IZ)Lcom/google/android/gms/internal/mlkit_vision_face/zzcw;

    return-object p0
.end method

.method public final add(J)Ltf/h;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 7
    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzda;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzda;->zzd:Lcom/google/android/gms/internal/mlkit_vision_face/zzcw;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzda;->zzc:Ltf/d;

    iget-boolean v2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzda;->zzb:Z

    .line 8
    invoke-virtual {v0, v1, p1, p2, v2}, Lcom/google/android/gms/internal/mlkit_vision_face/zzcw;->zze(Ltf/d;JZ)Lcom/google/android/gms/internal/mlkit_vision_face/zzcw;

    return-object p0
.end method

.method public final add(Ljava/lang/String;)Ltf/h;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 9
    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzda;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzda;->zzd:Lcom/google/android/gms/internal/mlkit_vision_face/zzcw;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzda;->zzc:Ltf/d;

    iget-boolean v2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzda;->zzb:Z

    .line 10
    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/mlkit_vision_face/zzcw;->zzc(Ltf/d;Ljava/lang/Object;Z)Ltf/f;

    return-object p0
.end method

.method public final add(Z)Ltf/h;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 11
    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzda;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzda;->zzd:Lcom/google/android/gms/internal/mlkit_vision_face/zzcw;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzda;->zzc:Ltf/d;

    iget-boolean v2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzda;->zzb:Z

    .line 12
    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/mlkit_vision_face/zzcw;->zzd(Ltf/d;IZ)Lcom/google/android/gms/internal/mlkit_vision_face/zzcw;

    return-object p0
.end method

.method public final add([B)Ltf/h;
    .locals 3
    .param p1    # [B
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 13
    invoke-direct {p0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzda;->zzb()V

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzda;->zzd:Lcom/google/android/gms/internal/mlkit_vision_face/zzcw;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzda;->zzc:Ltf/d;

    iget-boolean v2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzda;->zzb:Z

    .line 14
    invoke-virtual {v0, v1, p1, v2}, Lcom/google/android/gms/internal/mlkit_vision_face/zzcw;->zzc(Ltf/d;Ljava/lang/Object;Z)Ltf/f;

    return-object p0
.end method

.method public final zza(Ltf/d;Z)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzda;->zza:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzda;->zzc:Ltf/d;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzda;->zzb:Z

    return-void
.end method
