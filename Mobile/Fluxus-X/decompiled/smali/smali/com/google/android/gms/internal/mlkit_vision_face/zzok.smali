.class public final Lcom/google/android/gms/internal/mlkit_vision_face/zzok;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_face/zzob;


# instance fields
.field private zza:Lag/b;

.field private final zzb:Lag/b;

.field private final zzc:Lcom/google/android/gms/internal/mlkit_vision_face/zznt;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/mlkit_vision_face/zznt;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzok;->zzc:Lcom/google/android/gms/internal/mlkit_vision_face/zznt;

    sget-object p2, La8/a;->g:La8/a;

    invoke-static {p1}, Lc8/t;->f(Landroid/content/Context;)V

    invoke-static {}, Lc8/t;->c()Lc8/t;

    move-result-object p1

    invoke-virtual {p1, p2}, Lc8/t;->g(Lc8/f;)Lz7/i;

    move-result-object p1

    invoke-virtual {p2}, La8/a;->a()Ljava/util/Set;

    move-result-object p2

    const-string v0, "json"

    invoke-static {v0}, Lz7/c;->b(Ljava/lang/String;)Lz7/c;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, Lof/x;

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzoh;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzoh;-><init>(Lz7/i;)V

    invoke-direct {p2, v0}, Lof/x;-><init>(Lag/b;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzok;->zza:Lag/b;

    :cond_0
    new-instance p2, Lof/x;

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_face/zzoi;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzoi;-><init>(Lz7/i;)V

    invoke-direct {p2, v0}, Lof/x;-><init>(Lag/b;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzok;->zzb:Lag/b;

    return-void
.end method

.method public static zzb(Lcom/google/android/gms/internal/mlkit_vision_face/zznt;Lcom/google/android/gms/internal/mlkit_vision_face/zznr;)Lz7/d;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_face/zznt;->zza()I

    move-result p0

    invoke-interface {p1}, Lcom/google/android/gms/internal/mlkit_vision_face/zznr;->zza()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {p1, p0, v1}, Lcom/google/android/gms/internal/mlkit_vision_face/zznr;->zze(IZ)[B

    move-result-object p0

    invoke-static {p0}, Lz7/d;->e(Ljava/lang/Object;)Lz7/d;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p1, p0, v1}, Lcom/google/android/gms/internal/mlkit_vision_face/zznr;->zze(IZ)[B

    move-result-object p0

    invoke-static {p0}, Lz7/d;->g(Ljava/lang/Object;)Lz7/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/mlkit_vision_face/zznr;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzok;->zzc:Lcom/google/android/gms/internal/mlkit_vision_face/zznt;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_face/zznt;->zza()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzok;->zza:Lag/b;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lag/b;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz7/h;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzok;->zzc:Lcom/google/android/gms/internal/mlkit_vision_face/zznt;

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzok;->zzb(Lcom/google/android/gms/internal/mlkit_vision_face/zznt;Lcom/google/android/gms/internal/mlkit_vision_face/zznr;)Lz7/d;

    move-result-object p1

    invoke-interface {v0, p1}, Lz7/h;->a(Lz7/d;)V

    :cond_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzok;->zzb:Lag/b;

    invoke-interface {v0}, Lag/b;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz7/h;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_face/zzok;->zzc:Lcom/google/android/gms/internal/mlkit_vision_face/zznt;

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/mlkit_vision_face/zzok;->zzb(Lcom/google/android/gms/internal/mlkit_vision_face/zznt;Lcom/google/android/gms/internal/mlkit_vision_face/zznr;)Lz7/d;

    move-result-object p1

    invoke-interface {v0, p1}, Lz7/h;->a(Lz7/d;)V

    return-void
.end method
