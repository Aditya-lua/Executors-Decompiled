.class public final Lcom/google/android/gms/internal/mlkit_vision_common/zzmp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_common/zzmc;


# instance fields
.field private zza:Lyf/b;

.field private final zzb:Lyf/b;

.field private final zzc:Lcom/google/android/gms/internal/mlkit_vision_common/zzme;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/mlkit_vision_common/zzme;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmp;->zzc:Lcom/google/android/gms/internal/mlkit_vision_common/zzme;

    sget-object p2, Lz7/a;->g:Lz7/a;

    invoke-static {p1}, Lb8/t;->f(Landroid/content/Context;)V

    invoke-static {}, Lb8/t;->c()Lb8/t;

    move-result-object p1

    invoke-virtual {p1, p2}, Lb8/t;->g(Lb8/f;)Ly7/i;

    move-result-object p1

    invoke-virtual {p2}, Lz7/a;->a()Ljava/util/Set;

    move-result-object p2

    const-string v0, "json"

    invoke-static {v0}, Ly7/c;->b(Ljava/lang/String;)Ly7/c;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, Lmf/x;

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmm;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/mlkit_vision_common/zzmm;-><init>(Ly7/i;)V

    invoke-direct {p2, v0}, Lmf/x;-><init>(Lyf/b;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmp;->zza:Lyf/b;

    :cond_0
    new-instance p2, Lmf/x;

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmn;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/mlkit_vision_common/zzmn;-><init>(Ly7/i;)V

    invoke-direct {p2, v0}, Lmf/x;-><init>(Lyf/b;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmp;->zzb:Lyf/b;

    return-void
.end method

.method public static zzb(Lcom/google/android/gms/internal/mlkit_vision_common/zzme;Lcom/google/android/gms/internal/mlkit_vision_common/zzmb;)Ly7/d;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_common/zzme;->zza()I

    move-result p0

    const/4 v0, 0x0

    invoke-interface {p1, p0, v0}, Lcom/google/android/gms/internal/mlkit_vision_common/zzmb;->zzd(IZ)[B

    move-result-object p0

    invoke-static {p0}, Ly7/d;->g(Ljava/lang/Object;)Ly7/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/mlkit_vision_common/zzmb;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmp;->zzc:Lcom/google/android/gms/internal/mlkit_vision_common/zzme;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_common/zzme;->zza()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmp;->zza:Lyf/b;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lyf/b;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly7/h;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmp;->zzc:Lcom/google/android/gms/internal/mlkit_vision_common/zzme;

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/mlkit_vision_common/zzmp;->zzb(Lcom/google/android/gms/internal/mlkit_vision_common/zzme;Lcom/google/android/gms/internal/mlkit_vision_common/zzmb;)Ly7/d;

    move-result-object p1

    invoke-interface {v0, p1}, Ly7/h;->a(Ly7/d;)V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmp;->zzb:Lyf/b;

    invoke-interface {v0}, Lyf/b;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly7/h;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_common/zzmp;->zzc:Lcom/google/android/gms/internal/mlkit_vision_common/zzme;

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/mlkit_vision_common/zzmp;->zzb(Lcom/google/android/gms/internal/mlkit_vision_common/zzme;Lcom/google/android/gms/internal/mlkit_vision_common/zzmb;)Ly7/d;

    move-result-object p1

    invoke-interface {v0, p1}, Ly7/h;->a(Ly7/d;)V

    return-void
.end method
