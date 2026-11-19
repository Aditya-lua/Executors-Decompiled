.class public abstract Lcom/google/android/gms/internal/mlkit_vision_face/zzpa;
.super Lcom/google/android/gms/internal/mlkit_vision_face/zzb;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_face/zzpb;


# direct methods
.method public static zza(Landroid/os/IBinder;)Lcom/google/android/gms/internal/mlkit_vision_face/zzpb;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.mlkit.vision.face.aidls.IFaceDetectorCreator"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzpb;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzpb;

    return-object v0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzoz;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/mlkit_vision_face/zzoz;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
