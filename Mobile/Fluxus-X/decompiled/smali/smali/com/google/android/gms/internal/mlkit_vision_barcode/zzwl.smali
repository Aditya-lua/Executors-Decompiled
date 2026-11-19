.class public final synthetic Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwl;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwl;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;->zzb()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
