.class final Lcom/google/mlkit/common/sdkinternal/zzd;
.super Ljava/lang/ref/PhantomReference;
.source "SourceFile"

# interfaces
.implements Lcom/google/mlkit/common/sdkinternal/Cleaner$Cleanable;


# instance fields
.field private final zza:Ljava/util/Set;

.field private final zzb:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;Ljava/util/Set;Ljava/lang/Runnable;Lcom/google/mlkit/common/sdkinternal/zzc;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/ref/PhantomReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    iput-object p3, p0, Lcom/google/mlkit/common/sdkinternal/zzd;->zza:Ljava/util/Set;

    iput-object p4, p0, Lcom/google/mlkit/common/sdkinternal/zzd;->zzb:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final clean()V
    .locals 1

    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/zzd;->zza:Ljava/util/Set;

    invoke-interface {v0, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->clear()V

    iget-object v0, p0, Lcom/google/mlkit/common/sdkinternal/zzd;->zzb:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    return-void
.end method
