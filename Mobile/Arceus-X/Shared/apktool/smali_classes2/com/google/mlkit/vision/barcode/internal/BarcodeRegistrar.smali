.class public Lcom/google/mlkit/vision/barcode/internal/BarcodeRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# static fields
.field public static final synthetic zza:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getComponents()Ljava/util/List;
    .locals 4
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-class v0, Lcom/google/mlkit/vision/barcode/internal/zzi;

    invoke-static {v0}, Lmf/c;->c(Ljava/lang/Class;)Lmf/c$b;

    move-result-object v1

    const-class v2, Lcom/google/mlkit/common/sdkinternal/MlKitContext;

    invoke-static {v2}, Lmf/r;->j(Ljava/lang/Class;)Lmf/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Lmf/c$b;->b(Lmf/r;)Lmf/c$b;

    move-result-object v1

    new-instance v3, Lcom/google/mlkit/vision/barcode/internal/zzc;

    invoke-direct {v3}, Lcom/google/mlkit/vision/barcode/internal/zzc;-><init>()V

    invoke-virtual {v1, v3}, Lmf/c$b;->f(Lmf/g;)Lmf/c$b;

    move-result-object v1

    invoke-virtual {v1}, Lmf/c$b;->d()Lmf/c;

    move-result-object v1

    const-class v3, Lcom/google/mlkit/vision/barcode/internal/zzg;

    invoke-static {v3}, Lmf/c;->c(Ljava/lang/Class;)Lmf/c$b;

    move-result-object v3

    invoke-static {v0}, Lmf/r;->j(Ljava/lang/Class;)Lmf/r;

    move-result-object v0

    invoke-virtual {v3, v0}, Lmf/c$b;->b(Lmf/r;)Lmf/c$b;

    move-result-object v0

    const-class v3, Lcom/google/mlkit/common/sdkinternal/ExecutorSelector;

    invoke-static {v3}, Lmf/r;->j(Ljava/lang/Class;)Lmf/r;

    move-result-object v3

    invoke-virtual {v0, v3}, Lmf/c$b;->b(Lmf/r;)Lmf/c$b;

    move-result-object v0

    invoke-static {v2}, Lmf/r;->j(Ljava/lang/Class;)Lmf/r;

    move-result-object v2

    invoke-virtual {v0, v2}, Lmf/c$b;->b(Lmf/r;)Lmf/c$b;

    move-result-object v0

    new-instance v2, Lcom/google/mlkit/vision/barcode/internal/zzd;

    invoke-direct {v2}, Lcom/google/mlkit/vision/barcode/internal/zzd;-><init>()V

    invoke-virtual {v0, v2}, Lmf/c$b;->f(Lmf/g;)Lmf/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lmf/c$b;->d()Lmf/c;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;->zzh(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;

    move-result-object v0

    return-object v0
.end method
