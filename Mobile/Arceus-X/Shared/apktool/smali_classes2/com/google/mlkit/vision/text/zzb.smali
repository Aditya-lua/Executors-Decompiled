.class public final synthetic Lcom/google/mlkit/vision/text/zzb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_text_common/zzu;


# instance fields
.field public final synthetic zza:Landroid/graphics/Matrix;


# direct methods
.method public synthetic constructor <init>(Landroid/graphics/Matrix;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/vision/text/zzb;->zza:Landroid/graphics/Matrix;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvj;

    iget-object v0, p0, Lcom/google/mlkit/vision/text/zzb;->zza:Landroid/graphics/Matrix;

    new-instance v1, Lcom/google/mlkit/vision/text/Text$Symbol;

    invoke-direct {v1, p1, v0}, Lcom/google/mlkit/vision/text/Text$Symbol;-><init>(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzvj;Landroid/graphics/Matrix;)V

    return-object v1
.end method
