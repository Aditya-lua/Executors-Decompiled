.class public final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzws;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwe;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrd;

.field private zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvb;

.field private final zzc:I


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrd;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvb;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvb;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzws;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvb;

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzws;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrd;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxb;->zza()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxb;

    iput p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzws;->zzc:I

    return-void
.end method

.method public static zzf(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrd;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwe;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzws;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzws;-><init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrd;I)V

    return-object v0
.end method

.method public static zzg(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrd;I)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwe;
    .locals 1

    new-instance p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzws;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzws;-><init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrd;I)V

    return-object p1
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzws;->zzc:I

    return v0
.end method

.method public final zzb(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwe;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzws;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrd;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrd;->zzf(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrd;

    return-object p0
.end method

.method public final zzc(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvb;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwe;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzws;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvb;

    return-object p0
.end method

.method public final zzd()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzws;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrd;->zzk()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrf;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrf;->zzg()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvd;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvd;->zzk()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzba;->zzc(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvd;->zzk()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_0
    const-string v0, "NA"

    return-object v0
.end method

.method public final zze(IZ)[B
    .locals 2

    xor-int/lit8 p2, p1, 0x1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzws;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvb;

    const/4 v1, 0x1

    if-eq v1, p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    move p2, v1

    :goto_0
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvb;->zzf(Ljava/lang/Boolean;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvb;

    iget-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzws;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvb;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvb;->zze(Ljava/lang/Boolean;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvb;

    iget-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzws;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvb;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvb;->zzm()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvd;

    move-result-object p2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzws;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrd;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrd;->zzj(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzvd;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrd;

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxb;->zza()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxb;

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzws;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrd;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrd;->zzk()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrf;

    move-result-object p1

    new-instance p2, Ltf/d;

    invoke-direct {p2}, Ltf/d;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzox;->zza:Lsf/a;

    invoke-virtual {p2, v0}, Ltf/d;->i(Lsf/a;)Ltf/d;

    move-result-object p2

    invoke-virtual {p2, v1}, Ltf/d;->j(Z)Ltf/d;

    move-result-object p2

    invoke-virtual {p2}, Ltf/d;->h()Lrf/a;

    move-result-object p2

    invoke-interface {p2, p1}, Lrf/a;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "utf-8"

    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzws;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrd;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrd;->zzk()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrf;

    move-result-object p1

    new-instance p2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfi;

    invoke-direct {p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfi;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzox;->zza:Lsf/a;

    invoke-interface {v0, p2}, Lsf/a;->configure(Lsf/b;)V

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfi;->zza()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfj;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzfj;->zza(Ljava/lang/Object;)[B

    move-result-object p1
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :goto_1
    new-instance p2, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Failed to covert logging to UTF-8 byte array"

    invoke-direct {p2, v0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method
