.class public abstract Ln9/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln9/c$a;,
        Ln9/c$b;,
        Ln9/c$d;,
        Ln9/c$c;,
        Ln9/c$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Landroid/os/IInterface;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final GOOGLE_PLUS_REQUIRED_FEATURES:[Ljava/lang/String;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private static final zze:[Lcom/google/android/gms/common/Feature;


# instance fields
.field private volatile zzA:Ljava/lang/String;

.field private zzC:Lcom/google/android/gms/common/ConnectionResult;

.field private zzD:Z

.field private volatile zzE:Lcom/google/android/gms/common/internal/zzj;

.field zza:Ln9/j1;

.field final zzb:Landroid/os/Handler;

.field protected zzc:Ln9/c$c;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field protected zzd:Ljava/util/concurrent/atomic/AtomicInteger;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private zzf:I

.field private zzg:J

.field private zzh:J

.field private zzi:I

.field private zzj:J

.field private volatile zzk:Ljava/lang/String;

.field private final zzl:Landroid/content/Context;

.field private final zzm:Landroid/os/Looper;

.field private final zzn:Ln9/f;

.field private final zzo:Lj9/d;

.field private final zzp:Ljava/lang/Object;

.field private final zzq:Ljava/lang/Object;

.field private zzr:Ln9/i;

.field private zzs:Landroid/os/IInterface;

.field private final zzt:Ljava/util/ArrayList;

.field private zzu:Ln9/x0;

.field private zzv:I

.field private final zzw:Ln9/c$a;

.field private final zzx:Ln9/c$b;

.field private final zzy:I

.field private final zzz:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Lcom/google/android/gms/common/Feature;

    sput-object v0, Ln9/c;->zze:[Lcom/google/android/gms/common/Feature;

    const-string v0, "service_esmobile"

    const-string v1, "service_googleme"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ln9/c;->GOOGLE_PLUS_REQUIRED_FEATURES:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;ILn9/c$a;Ln9/c$b;Ljava/lang/String;)V
    .locals 9
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Looper;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-static {p1}, Ln9/f;->a(Landroid/content/Context;)Ln9/f;

    move-result-object v3

    .line 2
    invoke-static {}, Lj9/d;->f()Lj9/d;

    move-result-object v4

    .line 3
    invoke-static {p4}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    invoke-static {p5}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p3

    move-object v6, p4

    move-object v7, p5

    move-object v8, p6

    .line 5
    invoke-direct/range {v0 .. v8}, Ln9/c;-><init>(Landroid/content/Context;Landroid/os/Looper;Ln9/f;Lj9/d;ILn9/c$a;Ln9/c$b;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Ln9/f;Lj9/d;ILn9/c$a;Ln9/c$b;Ljava/lang/String;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Looper;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ln9/f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lj9/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Ln9/c;->zzk:Ljava/lang/String;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Ln9/c;->zzp:Ljava/lang/Object;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Ln9/c;->zzq:Ljava/lang/Object;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Ln9/c;->zzt:Ljava/util/ArrayList;

    const/4 v1, 0x1

    iput v1, p0, Ln9/c;->zzv:I

    iput-object v0, p0, Ln9/c;->zzC:Lcom/google/android/gms/common/ConnectionResult;

    const/4 v1, 0x0

    iput-boolean v1, p0, Ln9/c;->zzD:Z

    iput-object v0, p0, Ln9/c;->zzE:Lcom/google/android/gms/common/internal/zzj;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Ln9/c;->zzd:Ljava/util/concurrent/atomic/AtomicInteger;

    const-string v0, "Context must not be null"

    .line 8
    invoke-static {p1, v0}, Ln9/m;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ln9/c;->zzl:Landroid/content/Context;

    const-string p1, "Looper must not be null"

    .line 9
    invoke-static {p2, p1}, Ln9/m;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Ln9/c;->zzm:Landroid/os/Looper;

    const-string p1, "Supervisor must not be null"

    .line 10
    invoke-static {p3, p1}, Ln9/m;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p3, p0, Ln9/c;->zzn:Ln9/f;

    const-string p1, "API availability must not be null"

    .line 11
    invoke-static {p4, p1}, Ln9/m;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p4, p0, Ln9/c;->zzo:Lj9/d;

    new-instance p1, Ln9/u0;

    .line 12
    invoke-direct {p1, p0, p2}, Ln9/u0;-><init>(Ln9/c;Landroid/os/Looper;)V

    iput-object p1, p0, Ln9/c;->zzb:Landroid/os/Handler;

    iput p5, p0, Ln9/c;->zzy:I

    iput-object p6, p0, Ln9/c;->zzw:Ln9/c$a;

    iput-object p7, p0, Ln9/c;->zzx:Ln9/c$b;

    iput-object p8, p0, Ln9/c;->zzz:Ljava/lang/String;

    return-void
.end method

.method private final zzp(ILandroid/os/IInterface;)V
    .locals 12

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x4

    if-eq p1, v2, :cond_0

    move v3, v0

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    if-nez p2, :cond_1

    move v4, v0

    goto :goto_1

    :cond_1
    move v4, v1

    :goto_1
    if-ne v3, v4, :cond_2

    move v0, v1

    :cond_2
    invoke-static {v0}, Ln9/m;->a(Z)V

    iget-object v3, p0, Ln9/c;->zzp:Ljava/lang/Object;

    monitor-enter v3

    :try_start_0
    iput p1, p0, Ln9/c;->zzv:I

    iput-object p2, p0, Ln9/c;->zzs:Landroid/os/IInterface;

    const/4 v0, 0x0

    if-eq p1, v1, :cond_b

    const/4 v1, 0x2

    const/4 v4, 0x3

    if-eq p1, v1, :cond_4

    if-eq p1, v4, :cond_4

    if-eq p1, v2, :cond_3

    goto/16 :goto_5

    :cond_3
    invoke-static {p2}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p2, Landroid/os/IInterface;

    invoke-virtual {p0, p2}, Ln9/c;->onConnectedLocked(Landroid/os/IInterface;)V

    goto/16 :goto_5

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_6

    :cond_4
    const-string p1, "Calling connect() while still connected, missing disconnect() for "

    const-string p2, " on "

    const-string v1, "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "

    const-string v2, "unable to connect to service: "

    iget-object v9, p0, Ln9/c;->zzu:Ln9/x0;

    if-eqz v9, :cond_5

    iget-object v5, p0, Ln9/c;->zza:Ln9/j1;

    if-eqz v5, :cond_5

    const-string v6, "GmsClient"

    invoke-virtual {v5}, Ln9/j1;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5}, Ln9/j1;->b()Ljava/lang/String;

    move-result-object v5

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    add-int/lit8 v8, v8, 0x46

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v10

    add-int/2addr v8, v10

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v10, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v6, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v5, p0, Ln9/c;->zzn:Ln9/f;

    iget-object p1, p0, Ln9/c;->zza:Ln9/j1;

    invoke-virtual {p1}, Ln9/j1;->a()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Ln9/c;->zza:Ln9/j1;

    invoke-virtual {p1}, Ln9/j1;->b()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Ln9/c;->zza()Ljava/lang/String;

    move-result-object v10

    iget-object p1, p0, Ln9/c;->zza:Ln9/j1;

    invoke-virtual {p1}, Ln9/j1;->c()Z

    move-result v11

    const/16 v8, 0x1081

    invoke-virtual/range {v5 .. v11}, Ln9/f;->d(Ljava/lang/String;Ljava/lang/String;ILandroid/content/ServiceConnection;Ljava/lang/String;Z)V

    iget-object p1, p0, Ln9/c;->zzd:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    :cond_5
    new-instance p1, Ln9/x0;

    iget-object v5, p0, Ln9/c;->zzd:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v5

    invoke-direct {p1, p0, v5}, Ln9/x0;-><init>(Ln9/c;I)V

    iput-object p1, p0, Ln9/c;->zzu:Ln9/x0;

    iget v5, p0, Ln9/c;->zzv:I

    if-ne v5, v4, :cond_6

    invoke-virtual {p0}, Ln9/c;->getLocalStartServiceAction()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_6

    new-instance v5, Ln9/j1;

    invoke-virtual {p0}, Ln9/c;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Ln9/c;->getLocalStartServiceAction()Ljava/lang/String;

    move-result-object v7

    const/16 v9, 0x1081

    const/4 v10, 0x0

    const/4 v8, 0x1

    invoke-direct/range {v5 .. v10}, Ln9/j1;-><init>(Ljava/lang/String;Ljava/lang/String;ZIZ)V

    goto :goto_2

    :cond_6
    new-instance v4, Ln9/j1;

    invoke-virtual {p0}, Ln9/c;->getStartServicePackage()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Ln9/c;->getStartServiceAction()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Ln9/c;->getUseDynamicLookup()Z

    move-result v9

    const/4 v7, 0x0

    const/16 v8, 0x1081

    invoke-direct/range {v4 .. v9}, Ln9/j1;-><init>(Ljava/lang/String;Ljava/lang/String;ZIZ)V

    move-object v5, v4

    :goto_2
    iput-object v5, p0, Ln9/c;->zza:Ln9/j1;

    invoke-virtual {v5}, Ln9/j1;->c()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-virtual {p0}, Ln9/c;->getMinApkVersion()I

    move-result v4

    const v5, 0x1110e58

    if-lt v4, v5, :cond_7

    goto :goto_3

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    iget-object p2, p0, Ln9/c;->zza:Ln9/j1;

    invoke-virtual {p2}, Ln9/j1;->a()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    :goto_3
    iget-object v1, p0, Ln9/c;->zzn:Ln9/f;

    iget-object v4, p0, Ln9/c;->zza:Ln9/j1;

    invoke-virtual {v4}, Ln9/j1;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v5, p0, Ln9/c;->zza:Ln9/j1;

    invoke-virtual {v5}, Ln9/j1;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Ln9/c;->zza()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Ln9/c;->zza:Ln9/j1;

    invoke-virtual {v7}, Ln9/j1;->c()Z

    move-result v7

    invoke-virtual {p0}, Ln9/c;->getBindServiceExecutor()Ljava/util/concurrent/Executor;

    move-result-object v8

    new-instance v9, Ln9/e1;

    const/16 v10, 0x1081

    invoke-direct {v9, v4, v5, v10, v7}, Ln9/e1;-><init>(Ljava/lang/String;Ljava/lang/String;IZ)V

    invoke-virtual {v1, v9, p1, v6, v8}, Ln9/f;->c(Ln9/e1;Landroid/content/ServiceConnection;Ljava/lang/String;Ljava/util/concurrent/Executor;)Lcom/google/android/gms/common/ConnectionResult;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->A3()Z

    move-result v1

    if-nez v1, :cond_c

    const-string v1, "GmsClient"

    iget-object v4, p0, Ln9/c;->zza:Ln9/j1;

    invoke-virtual {v4}, Ln9/j1;->a()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Ln9/c;->zza:Ln9/j1;

    invoke-virtual {v5}, Ln9/j1;->b()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    add-int/lit8 v6, v6, 0x22

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    add-int/2addr v6, v7

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->w3()I

    move-result p2

    const/4 v1, -0x1

    if-ne p2, v1, :cond_9

    const/16 p2, 0x10

    goto :goto_4

    :cond_9
    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->w3()I

    move-result p2

    :goto_4
    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->y3()Landroid/app/PendingIntent;

    move-result-object v1

    if-eqz v1, :cond_a

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "pendingIntent"

    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->y3()Landroid/app/PendingIntent;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_a
    iget-object p1, p0, Ln9/c;->zzd:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p1

    invoke-virtual {p0, p2, v0, p1}, Ln9/c;->zzb(ILandroid/os/Bundle;I)V

    goto :goto_5

    :cond_b
    iget-object v8, p0, Ln9/c;->zzu:Ln9/x0;

    if-eqz v8, :cond_c

    iget-object v4, p0, Ln9/c;->zzn:Ln9/f;

    iget-object p1, p0, Ln9/c;->zza:Ln9/j1;

    invoke-virtual {p1}, Ln9/j1;->a()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Ln9/c;->zza:Ln9/j1;

    invoke-virtual {p1}, Ln9/j1;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Ln9/c;->zza()Ljava/lang/String;

    move-result-object v9

    iget-object p1, p0, Ln9/c;->zza:Ln9/j1;

    invoke-virtual {p1}, Ln9/j1;->c()Z

    move-result v10

    const/16 v7, 0x1081

    invoke-virtual/range {v4 .. v10}, Ln9/f;->d(Ljava/lang/String;Ljava/lang/String;ILandroid/content/ServiceConnection;Ljava/lang/String;Z)V

    iput-object v0, p0, Ln9/c;->zzu:Ln9/x0;

    :cond_c
    :goto_5
    monitor-exit v3

    return-void

    :goto_6
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method


# virtual methods
.method public checkAvailabilityAndConnect()V
    .locals 3

    iget-object v0, p0, Ln9/c;->zzo:Lj9/d;

    iget-object v1, p0, Ln9/c;->zzl:Landroid/content/Context;

    invoke-virtual {p0}, Ln9/c;->getMinApkVersion()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lj9/d;->h(Landroid/content/Context;I)I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2}, Ln9/c;->zzp(ILandroid/os/IInterface;)V

    new-instance v1, Ln9/c$d;

    invoke-direct {v1, p0}, Ln9/c$d;-><init>(Ln9/c;)V

    invoke-virtual {p0, v1, v0, v2}, Ln9/c;->triggerNotAvailable(Ln9/c$c;ILandroid/app/PendingIntent;)V

    return-void

    :cond_0
    new-instance v0, Ln9/c$d;

    invoke-direct {v0, p0}, Ln9/c$d;-><init>(Ln9/c;)V

    invoke-virtual {p0, v0}, Ln9/c;->connect(Ln9/c$c;)V

    return-void
.end method

.method public final checkConnected()V
    .locals 2

    invoke-virtual {p0}, Ln9/c;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not connected. Call connect() and wait for onConnected() to be called."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public connect(Ln9/c$c;)V
    .locals 1
    .param p1    # Ln9/c$c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "Connection progress callbacks cannot be null."

    invoke-static {p1, v0}, Ln9/m;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ln9/c;->zzc:Ln9/c$c;

    const/4 p1, 0x2

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Ln9/c;->zzp(ILandroid/os/IInterface;)V

    return-void
.end method

.method public abstract createServiceInterface(Landroid/os/IBinder;)Landroid/os/IInterface;
    .param p1    # Landroid/os/IBinder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/IBinder;",
            ")TT;"
        }
    .end annotation
.end method

.method public disconnect()V
    .locals 4

    .line 1
    iget-object v0, p0, Ln9/c;->zzd:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    iget-object v0, p0, Ln9/c;->zzt:Ljava/util/ArrayList;

    monitor-enter v0

    .line 2
    :try_start_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    .line 3
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln9/v0;

    invoke-virtual {v3}, Ln9/v0;->d()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 4
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 5
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Ln9/c;->zzq:Ljava/lang/Object;

    monitor-enter v1

    const/4 v0, 0x0

    :try_start_1
    iput-object v0, p0, Ln9/c;->zzr:Ln9/i;

    .line 6
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v1, 0x1

    .line 7
    invoke-direct {p0, v1, v0}, Ln9/c;->zzp(ILandroid/os/IInterface;)V

    return-void

    :catchall_1
    move-exception v0

    .line 8
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v0

    .line 9
    :goto_1
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1
.end method

.method public disconnect(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 10
    iput-object p1, p0, Ln9/c;->zzk:Ljava/lang/String;

    invoke-virtual {p0}, Ln9/c;->disconnect()V

    return-void
.end method

.method public enableLocalFallback()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getAccount()Landroid/accounts/Account;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getApiFeatures()[Lcom/google/android/gms/common/Feature;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    sget-object v0, Ln9/c;->zze:[Lcom/google/android/gms/common/Feature;

    return-object v0
.end method

.method public final getAvailableFeatures()[Lcom/google/android/gms/common/Feature;
    .locals 1

    iget-object v0, p0, Ln9/c;->zzE:Lcom/google/android/gms/common/internal/zzj;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, Lcom/google/android/gms/common/internal/zzj;->g:[Lcom/google/android/gms/common/Feature;

    return-object v0
.end method

.method public getBindServiceExecutor()Ljava/util/concurrent/Executor;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getConnectionHint()Landroid/os/Bundle;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getContext()Landroid/content/Context;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Ln9/c;->zzl:Landroid/content/Context;

    return-object v0
.end method

.method public getEndpointPackageName()Ljava/lang/String;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-virtual {p0}, Ln9/c;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ln9/c;->zza:Ln9/j1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ln9/j1;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Failed to connect when checking package"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getGCoreServiceId()I
    .locals 1

    iget v0, p0, Ln9/c;->zzy:I

    return v0
.end method

.method public getGetServiceRequestExtraArgs()Landroid/os/Bundle;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0
.end method

.method public getLastDisconnectMessage()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ln9/c;->zzk:Ljava/lang/String;

    return-object v0
.end method

.method public getLocalStartServiceAction()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public getMinApkVersion()I
    .locals 1

    sget v0, Lj9/d;->a:I

    return v0
.end method

.method public getRemoteService(Lcom/google/android/gms/common/internal/b;Ljava/util/Set;)V
    .locals 18
    .param p2    # Ljava/util/Set;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/internal/b;",
            "Ljava/util/Set<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    invoke-virtual {v1}, Ln9/c;->getGetServiceRequestExtraArgs()Landroid/os/Bundle;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/common/internal/GetServiceRequest;

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1f

    if-ge v4, v5, :cond_0

    iget-object v4, v1, Ln9/c;->zzA:Ljava/lang/String;

    :goto_0
    move-object/from16 v17, v4

    goto :goto_1

    :cond_0
    iget-object v4, v1, Ln9/c;->zzA:Ljava/lang/String;

    goto :goto_0

    :goto_1
    iget v5, v1, Ln9/c;->zzy:I

    sget v6, Lj9/d;->a:I

    sget-object v9, Lcom/google/android/gms/common/internal/GetServiceRequest;->t:[Lcom/google/android/gms/common/api/Scope;

    new-instance v10, Landroid/os/Bundle;

    invoke-direct {v10}, Landroid/os/Bundle;-><init>()V

    sget-object v12, Lcom/google/android/gms/common/internal/GetServiceRequest;->u:[Lcom/google/android/gms/common/Feature;

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/4 v4, 0x6

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x1

    move-object v13, v12

    invoke-direct/range {v3 .. v17}, Lcom/google/android/gms/common/internal/GetServiceRequest;-><init>(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;Landroid/accounts/Account;[Lcom/google/android/gms/common/Feature;[Lcom/google/android/gms/common/Feature;ZIZLjava/lang/String;)V

    iget-object v4, v1, Ln9/c;->zzl:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v3, Lcom/google/android/gms/common/internal/GetServiceRequest;->i:Ljava/lang/String;

    iput-object v2, v3, Lcom/google/android/gms/common/internal/GetServiceRequest;->l:Landroid/os/Bundle;

    if-eqz v0, :cond_1

    const/4 v2, 0x0

    new-array v2, v2, [Lcom/google/android/gms/common/api/Scope;

    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/common/api/Scope;

    iput-object v0, v3, Lcom/google/android/gms/common/internal/GetServiceRequest;->k:[Lcom/google/android/gms/common/api/Scope;

    :cond_1
    invoke-virtual {v1}, Ln9/c;->requiresSignIn()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v1}, Ln9/c;->getAccount()Landroid/accounts/Account;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance v0, Landroid/accounts/Account;

    const-string v2, "<<default account>>"

    const-string v4, "com.google"

    invoke-direct {v0, v2, v4}, Landroid/accounts/Account;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    iput-object v0, v3, Lcom/google/android/gms/common/internal/GetServiceRequest;->m:Landroid/accounts/Account;

    if-eqz p1, :cond_4

    invoke-interface/range {p1 .. p1}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    iput-object v0, v3, Lcom/google/android/gms/common/internal/GetServiceRequest;->j:Landroid/os/IBinder;

    goto :goto_2

    :cond_3
    invoke-virtual {v1}, Ln9/c;->requiresAccount()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {v1}, Ln9/c;->getAccount()Landroid/accounts/Account;

    move-result-object v0

    iput-object v0, v3, Lcom/google/android/gms/common/internal/GetServiceRequest;->m:Landroid/accounts/Account;

    :cond_4
    :goto_2
    sget-object v0, Ln9/c;->zze:[Lcom/google/android/gms/common/Feature;

    iput-object v0, v3, Lcom/google/android/gms/common/internal/GetServiceRequest;->n:[Lcom/google/android/gms/common/Feature;

    invoke-virtual {v1}, Ln9/c;->getApiFeatures()[Lcom/google/android/gms/common/Feature;

    move-result-object v0

    iput-object v0, v3, Lcom/google/android/gms/common/internal/GetServiceRequest;->o:[Lcom/google/android/gms/common/Feature;

    invoke-virtual {v1}, Ln9/c;->usesClientTelemetry()Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, 0x1

    iput-boolean v0, v3, Lcom/google/android/gms/common/internal/GetServiceRequest;->r:Z

    :cond_5
    :try_start_0
    iget-object v2, v1, Ln9/c;->zzq:Ljava/lang/Object;

    monitor-enter v2
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v0, v1, Ln9/c;->zzr:Ln9/i;

    if-eqz v0, :cond_6

    new-instance v4, Ln9/w0;

    iget-object v5, v1, Ln9/c;->zzd:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v5

    invoke-direct {v4, v1, v5}, Ln9/w0;-><init>(Ln9/c;I)V

    invoke-interface {v0, v4, v3}, Ln9/i;->R(Ln9/h;Lcom/google/android/gms/common/internal/GetServiceRequest;)V

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_4

    :cond_6
    const-string v0, "GmsClient"

    const-string v3, "mServiceBroker is null, client disconnected"

    invoke-static {v0, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :goto_3
    monitor-exit v2

    return-void

    :goto_4
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw v0
    :try_end_2
    .catch Landroid/os/DeadObjectException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    move-exception v0

    goto :goto_5

    :catch_1
    move-exception v0

    goto :goto_5

    :catch_2
    move-exception v0

    goto :goto_6

    :catch_3
    move-exception v0

    goto :goto_7

    :goto_5
    const-string v2, "GmsClient"

    const-string v3, "IGmsServiceBroker.getService failed"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    iget-object v0, v1, Ln9/c;->zzd:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/16 v2, 0x8

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v3, v0}, Ln9/c;->onPostInitHandler(ILandroid/os/IBinder;Landroid/os/Bundle;I)V

    return-void

    :goto_6
    throw v0

    :goto_7
    const-string v2, "GmsClient"

    const-string v3, "IGmsServiceBroker.getService failed"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v0, 0x3

    invoke-virtual {v1, v0}, Ln9/c;->triggerConnectionSuspended(I)V

    return-void
.end method

.method public getScopes()Ljava/util/Set;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;"
        }
    .end annotation

    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    return-object v0
.end method

.method public final getService()Landroid/os/IInterface;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Ln9/c;->zzp:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Ln9/c;->zzv:I

    const/4 v2, 0x5

    if-eq v1, v2, :cond_0

    invoke-virtual {p0}, Ln9/c;->checkConnected()V

    iget-object v1, p0, Ln9/c;->zzs:Landroid/os/IInterface;

    const-string v2, "Client is connected but service is null"

    invoke-static {v1, v2}, Ln9/m;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Landroid/os/IInterface;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    new-instance v1, Landroid/os/DeadObjectException;

    invoke-direct {v1}, Landroid/os/DeadObjectException;-><init>()V

    throw v1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public abstract getServiceDescriptor()Ljava/lang/String;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end method

.method public abstract getStartServiceAction()Ljava/lang/String;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end method

.method public getStartServicePackage()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "com.google.android.gms"

    return-object v0
.end method

.method public getTelemetryConfiguration()Lcom/google/android/gms/common/internal/ConnectionTelemetryConfiguration;
    .locals 1

    iget-object v0, p0, Ln9/c;->zzE:Lcom/google/android/gms/common/internal/zzj;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, v0, Lcom/google/android/gms/common/internal/zzj;->i:Lcom/google/android/gms/common/internal/ConnectionTelemetryConfiguration;

    return-object v0
.end method

.method public getUseDynamicLookup()Z
    .locals 2

    invoke-virtual {p0}, Ln9/c;->getMinApkVersion()I

    move-result v0

    const v1, 0xc9e4920

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hasConnectionInfo()Z
    .locals 1

    iget-object v0, p0, Ln9/c;->zzE:Lcom/google/android/gms/common/internal/zzj;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isConnected()Z
    .locals 3

    iget-object v0, p0, Ln9/c;->zzp:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Ln9/c;->zzv:I

    const/4 v2, 0x4

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public isConnecting()Z
    .locals 4

    iget-object v0, p0, Ln9/c;->zzp:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Ln9/c;->zzv:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v1, v2, :cond_1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :cond_1
    :goto_0
    monitor-exit v0

    return v3

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public onConnectedLocked(Landroid/os/IInterface;)V
    .locals 2
    .param p1    # Landroid/os/IInterface;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ln9/c;->zzh:J

    return-void
.end method

.method public onConnectionFailed(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 2
    .param p1    # Lcom/google/android/gms/common/ConnectionResult;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Lcom/google/android/gms/common/ConnectionResult;->w3()I

    move-result p1

    iput p1, p0, Ln9/c;->zzi:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ln9/c;->zzj:J

    return-void
.end method

.method public onConnectionSuspended(I)V
    .locals 2

    iput p1, p0, Ln9/c;->zzf:I

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Ln9/c;->zzg:J

    return-void
.end method

.method public onPostInitHandler(ILandroid/os/IBinder;Landroid/os/Bundle;I)V
    .locals 1

    new-instance v0, Ln9/y0;

    invoke-direct {v0, p0, p1, p2, p3}, Ln9/y0;-><init>(Ln9/c;ILandroid/os/IBinder;Landroid/os/Bundle;)V

    iget-object p1, p0, Ln9/c;->zzb:Landroid/os/Handler;

    const/4 p2, 0x1

    const/4 p3, -0x1

    invoke-virtual {p1, p2, p4, p3, v0}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public onUserSignOut(Ln9/c$e;)V
    .locals 0
    .param p1    # Ln9/c$e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-interface {p1}, Ln9/c$e;->a()V

    return-void
.end method

.method public requiresAccount()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public requiresGooglePlayServices()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public requiresSignIn()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public setAttributionTag(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    iput-object p1, p0, Ln9/c;->zzA:Ljava/lang/String;

    return-void
.end method

.method public triggerConnectionSuspended(I)V
    .locals 3

    iget-object v0, p0, Ln9/c;->zzd:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    iget-object v1, p0, Ln9/c;->zzb:Landroid/os/Handler;

    const/4 v2, 0x6

    invoke-virtual {v1, v2, v0, p1}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public triggerNotAvailable(Ln9/c$c;ILandroid/app/PendingIntent;)V
    .locals 2
    .param p1    # Ln9/c$c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "Connection progress callbacks cannot be null."

    invoke-static {p1, v0}, Ln9/m;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ln9/c;->zzc:Ln9/c$c;

    iget-object p1, p0, Ln9/c;->zzd:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p1

    iget-object v0, p0, Ln9/c;->zzb:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-virtual {v0, v1, p1, p2, p3}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public usesClientTelemetry()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final zza()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Ln9/c;->zzz:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Ln9/c;->zzl:Landroid/content/Context;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final zzb(ILandroid/os/Bundle;I)V
    .locals 2

    new-instance v0, Ln9/z0;

    invoke-direct {v0, p0, p1, p2}, Ln9/z0;-><init>(Ln9/c;ILandroid/os/Bundle;)V

    iget-object p1, p0, Ln9/c;->zzb:Landroid/os/Handler;

    const/4 p2, 0x7

    const/4 v1, -0x1

    invoke-virtual {p1, p2, p3, v1, v0}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method

.method public final synthetic zzc(Lcom/google/android/gms/common/internal/zzj;)V
    .locals 1

    iput-object p1, p0, Ln9/c;->zzE:Lcom/google/android/gms/common/internal/zzj;

    invoke-virtual {p0}, Ln9/c;->usesClientTelemetry()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p1, Lcom/google/android/gms/common/internal/zzj;->i:Lcom/google/android/gms/common/internal/ConnectionTelemetryConfiguration;

    invoke-static {}, Ln9/n;->b()Ln9/n;

    move-result-object v0

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/common/internal/ConnectionTelemetryConfiguration;->A3()Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;

    move-result-object p1

    :goto_0
    invoke-virtual {v0, p1}, Ln9/n;->c(Lcom/google/android/gms/common/internal/RootTelemetryConfiguration;)V

    :cond_1
    return-void
.end method

.method public final synthetic zzd(ILandroid/os/IInterface;)V
    .locals 0

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Ln9/c;->zzp(ILandroid/os/IInterface;)V

    return-void
.end method

.method public final synthetic zze(IILandroid/os/IInterface;)Z
    .locals 2

    iget-object v0, p0, Ln9/c;->zzp:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Ln9/c;->zzv:I

    if-eq v1, p1, :cond_0

    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    invoke-direct {p0, p2, p3}, Ln9/c;->zzp(ILandroid/os/IInterface;)V

    monitor-exit v0

    const/4 p1, 0x1

    return p1

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final synthetic zzf(I)V
    .locals 3

    iget-object p1, p0, Ln9/c;->zzp:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget v0, p0, Ln9/c;->zzv:I

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x3

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Ln9/c;->zzD:Z

    const/4 p1, 0x5

    goto :goto_0

    :cond_0
    const/4 p1, 0x4

    :goto_0
    iget-object v0, p0, Ln9/c;->zzb:Landroid/os/Handler;

    iget-object v1, p0, Ln9/c;->zzd:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    const/16 v2, 0x10

    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final synthetic zzg()Z
    .locals 2

    iget-boolean v0, p0, Ln9/c;->zzD:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Ln9/c;->getServiceDescriptor()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, Ln9/c;->getLocalStartServiceAction()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    :cond_2
    :try_start_0
    invoke-virtual {p0}, Ln9/c;->getServiceDescriptor()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    return v1
.end method

.method public final synthetic zzh()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ln9/c;->zzq:Ljava/lang/Object;

    return-object v0
.end method

.method public final synthetic zzi(Ln9/i;)V
    .locals 0

    iput-object p1, p0, Ln9/c;->zzr:Ln9/i;

    return-void
.end method

.method public final synthetic zzj()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Ln9/c;->zzt:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final synthetic zzk()Ln9/c$a;
    .locals 1

    iget-object v0, p0, Ln9/c;->zzw:Ln9/c$a;

    return-object v0
.end method

.method public final synthetic zzl()Ln9/c$b;
    .locals 1

    iget-object v0, p0, Ln9/c;->zzx:Ln9/c$b;

    return-object v0
.end method

.method public final synthetic zzm()Lcom/google/android/gms/common/ConnectionResult;
    .locals 1

    iget-object v0, p0, Ln9/c;->zzC:Lcom/google/android/gms/common/ConnectionResult;

    return-object v0
.end method

.method public final synthetic zzn(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 0

    iput-object p1, p0, Ln9/c;->zzC:Lcom/google/android/gms/common/ConnectionResult;

    return-void
.end method

.method public final synthetic zzo()Z
    .locals 1

    iget-boolean v0, p0, Ln9/c;->zzD:Z

    return v0
.end method
