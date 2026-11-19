.class public final synthetic Lcom/google/mlkit/common/internal/model/zzc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/tasks/OnCompleteListener;


# instance fields
.field public final synthetic zza:Lcom/google/mlkit/common/internal/model/zzg;


# direct methods
.method public synthetic constructor <init>(Lcom/google/mlkit/common/internal/model/zzg;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/mlkit/common/internal/model/zzc;->zza:Lcom/google/mlkit/common/internal/model/zzg;

    return-void
.end method


# virtual methods
.method public final onComplete(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/common/internal/model/zzc;->zza:Lcom/google/mlkit/common/internal/model/zzg;

    invoke-virtual {v0, p1}, Lcom/google/mlkit/common/internal/model/zzg;->zzc(Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
