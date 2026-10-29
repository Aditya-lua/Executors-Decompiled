.class public final Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final zzf:Ln9/g;


# instance fields
.field final zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;

.field final zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbw;

.field zzc:Ljava/util/concurrent/ScheduledFuture;

.field zzd:Ljava/lang/String;

.field zze:I

.field private final zzg:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final zzh:Ljava/lang/Object;

.field private final zzi:Ljava/util/concurrent/ScheduledExecutorService;

.field private final zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbb;

.field private final zzk:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;

.field private final zzl:Ljava/lang/String;

.field private zzm:Ljava/util/concurrent/Executor;

.field private zzn:F

.field private zzo:F

.field private zzp:J

.field private zzq:J

.field private zzr:Z

.field private zzs:Lcom/google/mlkit/vision/barcode/internal/zze;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln9/g;

    const-string v1, "AutoZoom"

    invoke-direct {v0, v1}, Ln9/g;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzf:Ln9/g;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;Ljava/lang/String;)V
    .locals 7

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzg;->zza()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzd;

    const/4 v0, 0x2

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newScheduledThreadPool(I)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    invoke-static {v0}, Ljava/util/concurrent/Executors;->unconfigurableScheduledExecutorService(Ljava/util/concurrent/ScheduledExecutorService;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzar;->zza()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbb;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;

    new-instance v3, Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;

    invoke-direct {v3, p1}, Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;-><init>(Landroid/content/Context;)V

    new-instance v4, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwi;

    const-string v5, "scanner-auto-zoom"

    invoke-static {v5}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwh;->zzd(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwg;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwg;->zzd()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwh;

    move-result-object v6

    invoke-direct {v4, p1, v6}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwi;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwh;)V

    invoke-direct {v2, p1, v3, v4, v5}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;-><init>(Landroid/content/Context;Lcom/google/mlkit/common/sdkinternal/SharedPrefManager;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwf;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzh:Ljava/lang/Object;

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzg:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbw;->zzz()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbw;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbw;

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzi:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbb;

    iput-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzk:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;

    iput-object p3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzl:Ljava/lang/String;

    const/4 p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zze:I

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzn:F

    const/high16 p1, -0x40800000    # -1.0f

    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzo:F

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbb;->zza()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzp:J

    return-void
.end method

.method public static bridge synthetic zzb()Ln9/g;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzf:Ln9/g;

    return-object v0
.end method

.method public static zzd(Landroid/content/Context;Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;

    invoke-direct {v0, p0, v1, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;Ljava/lang/String;)V

    return-object v0
.end method

.method public static bridge synthetic zze(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzg:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method public static synthetic zzf(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;)V
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzh:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zze:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzg:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzc:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v1, :cond_2

    invoke-interface {v1}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzn:F

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v1, v1, v2

    if-lez v1, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zza()J

    move-result-wide v3

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;->zzi()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-ltz v1, :cond_1

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzf:Ln9/g;

    const-string v3, "AutoZoom"

    const-string v4, "Reset zoom = 1"

    invoke-virtual {v1, v3, v4}, Ln9/g;->f(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;->zzdM:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;

    const/4 v3, 0x0

    invoke-virtual {p0, v2, v1, v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzl(FLcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_2

    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :cond_2
    :goto_1
    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static bridge synthetic zzg(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;F)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzh:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzn:F

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzr(Z)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static bridge synthetic zzh(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;FFLcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzq(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;FFLcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;)V

    return-void
.end method

.method private final zzp(F)F
    .locals 3

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v1, p1, v0

    iget v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzo:F

    if-gez v1, :cond_0

    move p1, v0

    :cond_0
    const/4 v0, 0x0

    cmpl-float v0, v2, v0

    if-lez v0, :cond_1

    cmpl-float v0, p1, v2

    if-lez v0, :cond_1

    return v2

    :cond_1
    return p1
.end method

.method private final zzq(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;FFLcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzd:Ljava/lang/String;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuo;

    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuo;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzl:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuo;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuo;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzd:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuo;->zze(Ljava/lang/String;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuo;

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuo;->zzf(Ljava/lang/Float;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuo;

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuo;->zzc(Ljava/lang/Float;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuo;

    iget-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzh:Ljava/lang/Object;

    monitor-enter p2

    :try_start_0
    sget-object p3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbb;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbb;->zza()J

    move-result-wide v1

    iget-wide v3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzq:J

    sub-long/2addr v1, v3

    sget-object v3, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p3, v1, v2, v3}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuo;->zzb(Ljava/lang/Long;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuo;

    if-eqz p4, :cond_0

    new-instance p2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzup;

    invoke-direct {p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzup;-><init>()V

    invoke-virtual {p4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzc()F

    move-result p3

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzup;->zzc(Ljava/lang/Float;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzup;

    invoke-virtual {p4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zze()F

    move-result p3

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzup;->zze(Ljava/lang/Float;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzup;

    invoke-virtual {p4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzb()F

    move-result p3

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzup;->zzb(Ljava/lang/Float;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzup;

    invoke-virtual {p4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzd()F

    move-result p3

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzup;->zzd(Ljava/lang/Float;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzup;

    const/4 p3, 0x0

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzup;->zza(Ljava/lang/Float;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzup;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzup;->zzf()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzur;

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuo;->zzd(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzur;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuo;

    :cond_0
    iget-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzk:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;

    new-instance p3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrd;

    invoke-direct {p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrd;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzuo;->zzh()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzut;

    move-result-object p4

    invoke-virtual {p3, p4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrd;->zzi(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzut;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrd;

    invoke-static {p3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzws;->zzf(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrd;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwe;

    move-result-object p3

    invoke-virtual {p2, p3, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwp;->zzd(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzwe;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_1
    return-void
.end method

.method private final zzr(Z)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzh:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbw;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbr;->zzs()V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbb;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbb;->zza()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzp:J

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzc:Ljava/util/concurrent/ScheduledFuture;

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzc:Ljava/util/concurrent/ScheduledFuture;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method


# virtual methods
.method public final zza()J
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzh:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbb;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbb;->zza()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzp:J

    sub-long/2addr v2, v4

    sget-object v4, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v1

    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final synthetic zzc(F)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzet;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzs:Lcom/google/mlkit/vision/barcode/internal/zze;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzp(F)F

    move-result p1

    iget-object v0, v0, Lcom/google/mlkit/vision/barcode/internal/zze;->zza:Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions;

    sget v1, Lcom/google/mlkit/vision/barcode/internal/zzh;->zzc:I

    invoke-virtual {v0}, Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions;->zzb()Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions$ZoomCallback;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/mlkit/vision/barcode/ZoomSuggestionOptions$ZoomCallback;->setZoom(F)Z

    move-result v0

    const/4 v1, 0x1

    if-eq v1, v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzej;->zza(Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzet;

    move-result-object p1

    return-object p1
.end method

.method public final zzi(ILcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    iget-object v2, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzh:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget v3, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zze:I

    const/4 v4, 0x2

    if-eq v3, v4, :cond_0

    monitor-exit v2

    return-void

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzh()Z

    move-result v3

    if-eqz v3, :cond_10

    iget-object v3, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;->zzl()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    iget-object v3, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;->zzb()F

    move-result v3

    cmpg-float v3, v3, v4

    if-lez v3, :cond_1

    goto/16 :goto_6

    :cond_1
    iget-boolean v3, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzr:Z

    if-nez v3, :cond_2

    sget-object v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;->zzdK:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;

    iget v5, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzn:F

    invoke-direct {v1, v3, v5, v5, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzq(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;FFLcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;)V

    const/4 v3, 0x1

    iput-boolean v3, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzr:Z

    :cond_2
    sget-object v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzf:Ln9/g;

    const-string v5, "AutoZoom"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v6

    const-string v7, "Process PredictedArea: [%.2f, %.2f, %.2f, %.2f, %.2f], frameIndex = %d"

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzc()F

    move-result v8

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zze()F

    move-result v8

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzb()F

    move-result v8

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v11

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzd()F

    move-result v8

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v13

    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    filled-new-array/range {v9 .. v14}, [Ljava/lang/Object;

    move-result-object v8

    invoke-static {v6, v7, v8}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v5, v6}, Ln9/g;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbw;

    invoke-virtual {v3, v14, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbr;->zzt(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v3, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbw;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbv;->zzw()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    iget-object v6, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;->zzh()I

    move-result v6

    if-le v5, v6, :cond_5

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move/from16 v5, p1

    :cond_3
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-le v5, v6, :cond_3

    move v5, v6

    goto :goto_0

    :cond_4
    sget-object v3, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzf:Ln9/g;

    const-string v6, "AutoZoom"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Removing recent frameIndex = "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v6, v7}, Ln9/g;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbw;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbe;->zzf(Ljava/lang/Object;)Ljava/util/List;

    :cond_5
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    iget-object v5, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzb:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbw;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbv;->zzu()Ljava/util/Collection;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_6
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    move/from16 v8, p1

    if-eq v7, v8, :cond_6

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzh()Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzh()Z

    move-result v9

    if-nez v9, :cond_8

    :cond_7
    move v9, v4

    goto :goto_2

    :cond_8
    invoke-virtual {v7}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzc()F

    move-result v9

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzc()F

    move-result v10

    invoke-static {v9, v10}, Ljava/lang/Math;->max(FF)F

    move-result v12

    invoke-virtual {v7}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zze()F

    move-result v9

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zze()F

    move-result v10

    invoke-static {v9, v10}, Ljava/lang/Math;->max(FF)F

    move-result v13

    invoke-virtual {v7}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzb()F

    move-result v9

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzb()F

    move-result v10

    invoke-static {v9, v10}, Ljava/lang/Math;->min(FF)F

    move-result v14

    invoke-virtual {v7}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzd()F

    move-result v9

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzd()F

    move-result v10

    invoke-static {v9, v10}, Ljava/lang/Math;->min(FF)F

    move-result v15

    new-instance v11, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxg;

    const/16 v16, 0x0

    invoke-direct/range {v11 .. v16}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxg;-><init>(FFFFF)V

    invoke-virtual {v11}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzf()F

    move-result v9

    invoke-virtual {v7}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzf()F

    move-result v7

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzf()F

    move-result v10

    add-float/2addr v7, v10

    invoke-virtual {v11}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzf()F

    move-result v10

    sub-float/2addr v7, v10

    div-float/2addr v9, v7

    :goto_2
    iget-object v7, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;->zzd()F

    move-result v7

    cmpl-float v7, v9, v7

    if-ltz v7, :cond_6

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v3, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_9
    invoke-virtual {v3}, Ljava/util/HashSet;->size()I

    move-result v3

    iget-object v5, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;->zzg()I

    move-result v5

    if-ge v3, v5, :cond_a

    iget-object v3, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;->zzl()Z

    move-result v3

    if-eqz v3, :cond_f

    iget-object v3, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;->zza()F

    move-result v3

    cmpl-float v3, v3, v4

    if-gtz v3, :cond_f

    :cond_a
    iget-object v3, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzh:Ljava/lang/Object;

    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zza()J

    move-result-wide v4

    iget-object v6, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;->zzj()J

    move-result-wide v6

    cmp-long v4, v4, v6

    if-gez v4, :cond_b

    monitor-exit v3

    goto/16 :goto_4

    :catchall_1
    move-exception v0

    goto/16 :goto_5

    :cond_b
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzc()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zze()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzb()F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;->zzd()F

    move-result v7

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    invoke-static {v4, v5, v6, v7}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;->zzi(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzcs;->zzj(I)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzdv;

    move-result-object v4

    const v5, 0x4e6e6b28    # 1.0E9f

    :cond_c
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Float;

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v6

    iget-object v7, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;

    invoke-virtual {v7}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;->zzc()F

    move-result v7

    const/high16 v8, 0x40000000    # 2.0f

    div-float/2addr v7, v8

    const/high16 v8, -0x41000000    # -0.5f

    add-float/2addr v6, v8

    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v6

    const v8, 0x3a83126f    # 0.001f

    invoke-static {v6, v8}, Ljava/lang/Math;->max(FF)F

    move-result v6

    div-float v6, v7, v6

    cmpl-float v7, v5, v6

    if-lez v7, :cond_c

    move v5, v6

    goto :goto_3

    :cond_d
    iget v4, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzn:F

    mul-float/2addr v4, v5

    invoke-direct {v1, v4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzp(F)F

    move-result v4

    iget-object v5, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;->zzk()Z

    move-result v5

    if-eqz v5, :cond_e

    iget v5, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzn:F

    sub-float v6, v4, v5

    div-float/2addr v6, v5

    iget-object v5, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;->zze()F

    move-result v5

    cmpg-float v5, v6, v5

    if-gtz v5, :cond_e

    iget-object v5, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zza:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;

    invoke-virtual {v5}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxm;->zzf()F

    move-result v5

    neg-float v5, v5

    cmpl-float v5, v6, v5

    if-ltz v5, :cond_e

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzf:Ln9/g;

    const-string v5, "AutoZoom"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Auto zoom to "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v4, " is filtered by threshold"

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v5, v4}, Ln9/g;->f(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbb;->zza()J

    move-result-wide v4

    iput-wide v4, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzp:J

    monitor-exit v3

    goto :goto_4

    :cond_e
    sget-object v5, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzf:Ln9/g;

    const-string v6, "AutoZoom"

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Going to set zoom = "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Ln9/g;->f(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v5, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;->zzdL:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;

    invoke-virtual {v1, v4, v5, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzl(FLcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;)V

    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :cond_f
    :goto_4
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-void

    :goto_5
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    throw v0

    :cond_10
    :goto_6
    monitor-exit v2

    return-void

    :goto_7
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0
.end method

.method public final zzj()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzh:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zze:I

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzn(Z)V

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzi:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    iput v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zze:I

    monitor-exit v0

    return-void

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final zzk(F)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzh:Ljava/lang/Object;

    monitor-enter v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v1, p1, v1

    if-ltz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    :try_start_0
    invoke-static {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzaz;->zzd(Z)V

    iput p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzo:F

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final zzl(FLcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;)V
    .locals 8

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzh:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzm:Ljava/util/concurrent/Executor;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzs:Lcom/google/mlkit/vision/barcode/internal/zze;

    if-eqz v0, :cond_2

    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zze:I

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzg:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_1

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_1
    iget v5, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzn:F

    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxh;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxh;-><init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;F)V

    iget-object v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzm:Ljava/util/concurrent/Executor;

    invoke-static {v0, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzej;->zzc(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxh;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/internal/mlkit_vision_barcode/zzet;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxj;

    move-object v3, p0

    move v7, p1

    move-object v4, p2

    move-object v6, p3

    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxj;-><init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;FLcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;F)V

    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzeu;->zza()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-static {v0, v2, p1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzej;->zzb(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzet;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzeh;Ljava/util/concurrent/Executor;)V

    monitor-exit v1

    return-void

    :cond_2
    :goto_0
    monitor-exit v1

    return-void

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final zzm()V
    .locals 10

    iget-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzh:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zze:I

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    const/4 v3, 0x4

    if-ne v0, v3, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzr(Z)V

    iget-object v3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzi:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v4, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxi;

    invoke-direct {v4, p0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxi;-><init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;)V

    sget-object v9, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v5, 0x1f4

    move-wide v7, v5

    invoke-interface/range {v3 .. v9}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v3

    iput-object v3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzc:Ljava/util/concurrent/ScheduledFuture;

    iget v3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zze:I

    const/4 v4, 0x0

    if-ne v3, v0, :cond_1

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzd:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzj:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzbb;->zza()J

    move-result-wide v5

    iput-wide v5, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzq:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzr:Z

    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;->zzdF:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;

    iget v3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzn:F

    invoke-direct {p0, v0, v3, v3, v4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzq(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;FFLcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;->zzdH:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;

    iget v3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzn:F

    invoke-direct {p0, v0, v3, v3, v4}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzq(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;FFLcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;)V

    :goto_0
    iput v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zze:I

    monitor-exit v1

    return-void

    :cond_2
    :goto_1
    monitor-exit v1

    return-void

    :goto_2
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final zzn(Z)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzh:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zze:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_3

    const/4 v3, 0x4

    if-ne v1, v3, :cond_0

    goto :goto_2

    :cond_0
    invoke-direct {p0, v2}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzr(Z)V

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    iget-boolean p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzr:Z

    if-nez p1, :cond_1

    sget-object p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;->zzdK:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;

    iget v3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzn:F

    invoke-direct {p0, p1, v3, v3, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzq(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;FFLcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    :goto_0
    sget-object p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;->zzdI:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;

    iget v3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzn:F

    invoke-direct {p0, p1, v3, v3, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzq(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;FFLcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;)V

    goto :goto_1

    :cond_2
    sget-object p1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;->zzdJ:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;

    iget v3, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzn:F

    invoke-direct {p0, p1, v3, v3, v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzq(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzrc;FFLcom/google/android/gms/internal/mlkit_vision_barcode/zzxn;)V

    :goto_1
    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzr:Z

    iput v2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zze:I

    iput-object v1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzd:Ljava/lang/String;

    monitor-exit v0

    return-void

    :cond_3
    :goto_2
    monitor-exit v0

    return-void

    :goto_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final zzo(Lcom/google/mlkit/vision/barcode/internal/zze;Ljava/util/concurrent/Executor;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzs:Lcom/google/mlkit/vision/barcode/internal/zze;

    iput-object p2, p0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzxk;->zzm:Ljava/util/concurrent/Executor;

    return-void
.end method
