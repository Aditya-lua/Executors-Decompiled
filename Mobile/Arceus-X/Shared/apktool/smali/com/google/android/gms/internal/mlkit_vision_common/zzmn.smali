.class public final synthetic Lcom/google/android/gms/internal/mlkit_vision_common/zzmn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyf/b;


# instance fields
.field public final synthetic zza:Ly7/i;


# direct methods
.method public synthetic constructor <init>(Ly7/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmn;->zza:Ly7/i;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmn;->zza:Ly7/i;

    const-string v1, "proto"

    invoke-static {v1}, Ly7/c;->b(Ljava/lang/String;)Ly7/c;

    move-result-object v1

    sget-object v2, Lcom/google/android/gms/internal/mlkit_vision_common/zzml;->zza:Lcom/google/android/gms/internal/mlkit_vision_common/zzml;

    const-string v3, "FIREBASE_ML_SDK"

    const-class v4, [B

    invoke-interface {v0, v3, v4, v1, v2}, Ly7/i;->a(Ljava/lang/String;Ljava/lang/Class;Ly7/c;Ly7/g;)Ly7/h;

    move-result-object v0

    return-object v0
.end method
