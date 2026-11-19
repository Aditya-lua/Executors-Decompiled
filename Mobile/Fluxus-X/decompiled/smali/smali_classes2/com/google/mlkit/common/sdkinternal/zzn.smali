.class public final synthetic Lcom/google/mlkit/common/sdkinternal/zzn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/mlkit/common/sdkinternal/ModelResource;

.field public final synthetic zzb:Ltb/a;

.field public final synthetic zzc:Ltb/b;

.field public final synthetic zzd:Ljava/util/concurrent/Callable;

.field public final synthetic zze:Ltb/k;


# direct methods
.method public synthetic constructor <init>(Lcom/google/mlkit/common/sdkinternal/ModelResource;Ltb/a;Ltb/b;Ljava/util/concurrent/Callable;Ltb/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/common/sdkinternal/zzn;->zza:Lcom/google/mlkit/common/sdkinternal/ModelResource;

    iput-object p2, p0, Lcom/google/mlkit/common/sdkinternal/zzn;->zzb:Ltb/a;

    iput-object p3, p0, Lcom/google/mlkit/common/sdkinternal/zzn;->zzc:Ltb/b;

    iput-object p4, p0, Lcom/google/mlkit/common/sdkinternal/zzn;->zzd:Ljava/util/concurrent/Callable;

    iput-object p5, p0, Lcom/google/mlkit/common/sdkinternal/zzn;->zze:Ltb/k;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/zzn;->zza:Lcom/google/mlkit/common/sdkinternal/ModelResource;

    iget-object v1, p0, Lcom/google/mlkit/common/sdkinternal/zzn;->zzb:Ltb/a;

    iget-object v2, p0, Lcom/google/mlkit/common/sdkinternal/zzn;->zzc:Ltb/b;

    iget-object v3, p0, Lcom/google/mlkit/common/sdkinternal/zzn;->zzd:Ljava/util/concurrent/Callable;

    iget-object v4, p0, Lcom/google/mlkit/common/sdkinternal/zzn;->zze:Ltb/k;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/mlkit/common/sdkinternal/ModelResource;->zza(Ltb/a;Ltb/b;Ljava/util/concurrent/Callable;Ltb/k;)V

    return-void
.end method
