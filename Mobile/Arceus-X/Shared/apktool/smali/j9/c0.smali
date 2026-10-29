.class public final Lj9/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lj9/a0;

.field public static final b:Lj9/a0;

.field public static final c:Lj9/a0;

.field public static final d:Lj9/a0;

.field public static final e:Lj9/a0;

.field public static final f:Lj9/a0;

.field public static volatile g:Ln9/p0;

.field public static final h:Ljava/lang/Object;

.field public static i:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj9/r;

    const-string v1, "0\u0082\u0005\u00c80\u0082\u0003\u00b0\u00a0\u0003\u0002\u0001\u0002\u0002\u0014\u007f\u00a2f\u00fa\u00a7p\u0085xb\u00b1"

    invoke-static {v1}, Lj9/x;->u2(Ljava/lang/String;)[B

    move-result-object v1

    invoke-direct {v0, v1}, Lj9/r;-><init>([B)V

    sput-object v0, Lj9/c0;->a:Lj9/a0;

    new-instance v0, Lj9/s;

    const-string v1, "0\u0082\u0006\u00040\u0082\u0003\u00ec\u00a0\u0003\u0002\u0001\u0002\u0002\u0014Q\u00d5\u00db\u0004\u00f7X\u00e7B\u0086<"

    invoke-static {v1}, Lj9/x;->u2(Ljava/lang/String;)[B

    move-result-object v1

    invoke-direct {v0, v1}, Lj9/s;-><init>([B)V

    sput-object v0, Lj9/c0;->b:Lj9/a0;

    new-instance v0, Lj9/t;

    const-string v1, "0\u0082\u0005\u00c80\u0082\u0003\u00b0\u00a0\u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\u0008s\u00f9/\u008eQ\u00ed"

    invoke-static {v1}, Lj9/x;->u2(Ljava/lang/String;)[B

    move-result-object v1

    invoke-direct {v0, v1}, Lj9/t;-><init>([B)V

    sput-object v0, Lj9/c0;->c:Lj9/a0;

    new-instance v0, Lj9/u;

    const-string v1, "0\u0082\u0006\u00040\u0082\u0003\u00ec\u00a0\u0003\u0002\u0001\u0002\u0002\u0014\u0003\u00a3\u00b2\u00ad\u00d7\u00e1r\u00cak\u00ec"

    invoke-static {v1}, Lj9/x;->u2(Ljava/lang/String;)[B

    move-result-object v1

    invoke-direct {v0, v1}, Lj9/u;-><init>([B)V

    sput-object v0, Lj9/c0;->d:Lj9/a0;

    new-instance v0, Lj9/v;

    const-string v1, "0\u0082\u0004C0\u0082\u0003+\u00a0\u0003\u0002\u0001\u0002\u0002\t\u0000\u00c2\u00e0\u0087FdJ0\u008d0"

    invoke-static {v1}, Lj9/x;->u2(Ljava/lang/String;)[B

    move-result-object v1

    invoke-direct {v0, v1}, Lj9/v;-><init>([B)V

    sput-object v0, Lj9/c0;->e:Lj9/a0;

    new-instance v0, Lj9/w;

    const-string v1, "0\u0082\u0004\u00a80\u0082\u0003\u0090\u00a0\u0003\u0002\u0001\u0002\u0002\t\u0000\u00d5\u0085\u00b8l}\u00d3N\u00f50"

    invoke-static {v1}, Lj9/x;->u2(Ljava/lang/String;)[B

    move-result-object v1

    invoke-direct {v0, v1}, Lj9/w;-><init>([B)V

    sput-object v0, Lj9/c0;->f:Lj9/a0;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lj9/c0;->h:Ljava/lang/Object;

    return-void
.end method

.method public static declared-synchronized a(Landroid/content/Context;)V
    .locals 2

    const-class v0, Lj9/c0;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lj9/c0;->i:Landroid/content/Context;

    if-nez v1, :cond_1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sput-object p0, Lj9/c0;->i:Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    goto :goto_0

    :cond_0
    monitor-exit v0

    return-void

    :cond_1
    :try_start_1
    const-string p0, "GoogleCertificates"

    const-string v1, "GoogleCertificates has been initialized already"

    invoke-static {p0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-void

    :goto_0
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0
.end method

.method public static b()V
    .locals 4

    sget-object v0, Lj9/c0;->g:Ln9/p0;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lj9/c0;->i:Landroid/content/Context;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lj9/c0;->h:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lj9/c0;->g:Ln9/p0;

    if-nez v1, :cond_1

    sget-object v1, Lj9/c0;->i:Landroid/content/Context;

    sget-object v2, Lcom/google/android/gms/dynamite/DynamiteModule;->f:Lcom/google/android/gms/dynamite/DynamiteModule$b;

    const-string v3, "com.google.android.gms.googlecertificates"

    invoke-static {v1, v2, v3}, Lcom/google/android/gms/dynamite/DynamiteModule;->e(Landroid/content/Context;Lcom/google/android/gms/dynamite/DynamiteModule$b;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;

    move-result-object v1

    const-string v2, "com.google.android.gms.common.GoogleCertificatesImpl"

    invoke-virtual {v1, v2}, Lcom/google/android/gms/dynamite/DynamiteModule;->d(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v1

    invoke-static {v1}, Ln9/o0;->s2(Landroid/os/IBinder;)Ln9/p0;

    move-result-object v1

    sput-object v1, Lj9/c0;->g:Ln9/p0;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static c(Lj9/h0;)Lj9/j0;
    .locals 5

    const-string v0, "Failed to get Google certificates from remote"

    const-string v1, "GoogleCertificates"

    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskReads()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v2

    :try_start_0
    const-string v3, "module init: "

    sget-object v4, Lj9/c0;->i:Landroid/content/Context;

    invoke-static {v4}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-static {}, Lj9/c0;->b()V
    :try_end_1
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$a; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    sget-object v3, Lj9/c0;->i:Landroid/content/Context;

    invoke-static {v3}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lj9/c0;->i:Landroid/content/Context;

    invoke-virtual {p0, v3}, Lj9/h0;->b(Landroid/content/Context;)Lcom/google/android/gms/common/zzp;

    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {p0}, Lj9/h0;->a()Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Lj9/c0;->g:Ln9/p0;

    invoke-interface {p0, v3}, Ln9/p0;->H1(Lcom/google/android/gms/common/zzp;)Lcom/google/android/gms/common/zzr;

    move-result-object p0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_4

    :catch_0
    move-exception p0

    goto :goto_2

    :cond_0
    sget-object p0, Lj9/c0;->g:Ln9/p0;

    invoke-interface {p0, v3}, Ln9/p0;->d2(Lcom/google/android/gms/common/zzp;)Lcom/google/android/gms/common/zzr;

    move-result-object p0
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_0
    :try_start_4
    invoke-virtual {p0}, Lcom/google/android/gms/common/zzr;->zza()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/common/zzr;->zze()I

    move-result v0

    invoke-virtual {p0}, Lcom/google/android/gms/common/zzr;->zzc()J

    move-result-wide v3

    invoke-static {v0, v3, v4}, Lj9/j0;->f(IJ)Lj9/j0;

    move-result-object p0

    goto :goto_3

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/common/zzr;->zzb()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/common/zzr;->zzd()I

    move-result v1

    const/4 v3, 0x4

    if-ne v1, v3, :cond_2

    new-instance v1, Landroid/content/pm/PackageManager$NameNotFoundException;

    invoke-direct {v1}, Landroid/content/pm/PackageManager$NameNotFoundException;-><init>()V

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    const-string v3, "error checking package certificate"

    if-nez v0, :cond_3

    move-object v0, v3

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/common/zzr;->zze()I

    move-result v3

    invoke-virtual {p0}, Lcom/google/android/gms/common/zzr;->zzd()I

    move-result p0

    invoke-static {v3, p0, v0, v1}, Lj9/j0;->g(IILjava/lang/String;Ljava/lang/Throwable;)Lj9/j0;

    move-result-object p0

    goto :goto_3

    :goto_2
    invoke-static {v1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const-string v0, "module call"

    invoke-static {v0, p0}, Lj9/j0;->d(Ljava/lang/String;Ljava/lang/Throwable;)Lj9/j0;

    move-result-object p0

    goto :goto_3

    :catch_1
    move-exception p0

    invoke-static {v1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, Lj9/j0;->d(Ljava/lang/String;Ljava/lang/Throwable;)Lj9/j0;

    move-result-object p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_3
    invoke-static {v2}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    return-object p0

    :goto_4
    invoke-static {v2}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    throw p0
.end method

.method public static d(Ljava/lang/String;Lj9/x;ZZ)Lj9/j0;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskReads()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object v0

    :try_start_0
    invoke-static {p0, p1, p2, p3}, Lj9/c0;->f(Ljava/lang/String;Lj9/x;ZZ)Lj9/j0;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    throw p0
.end method

.method public static synthetic e(ZLjava/lang/String;Lj9/x;)Ljava/lang/String;
    .locals 2

    if-nez p0, :cond_0

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, v1}, Lj9/c0;->f(Ljava/lang/String;Lj9/x;ZZ)Lj9/j0;

    move-result-object v0

    iget-boolean v0, v0, Lj9/j0;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "debug cert rejected"

    goto :goto_0

    :cond_0
    const-string v0, "not allowed"

    :goto_0
    const-string v1, "SHA-256"

    invoke-static {v1}, Lu9/a;->b(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v1

    invoke-static {v1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lj9/x;->t2()[B

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p2

    invoke-static {p2}, Lu9/k;->a([B)Ljava/lang/String;

    move-result-object p2

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    const-string v1, "12451000.false"

    filled-new-array {v0, p1, p2, p0, v1}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "%s: pkg=%s, sha256=%s, atk=%s, ver=%s"

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static f(Ljava/lang/String;Lj9/x;ZZ)Lj9/j0;
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "Failed to get Google certificates from remote"

    const-string v1, "GoogleCertificates"

    :try_start_0
    invoke-static {}, Lj9/c0;->b()V
    :try_end_0
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$a; {:try_start_0 .. :try_end_0} :catch_1

    sget-object v2, Lj9/c0;->i:Landroid/content/Context;

    invoke-static {v2}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/google/android/gms/common/zzt;

    invoke-direct {v2, p0, p1, p2, p3}, Lcom/google/android/gms/common/zzt;-><init>(Ljava/lang/String;Lj9/x;ZZ)V

    :try_start_1
    sget-object p3, Lj9/c0;->g:Ln9/p0;

    sget-object v3, Lj9/c0;->i:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    invoke-static {v3}, Ly9/b;->u2(Ljava/lang/Object;)Ly9/a;

    move-result-object v3

    invoke-interface {p3, v2, v3}, Ln9/p0;->L(Lcom/google/android/gms/common/zzt;Ly9/a;)Z

    move-result p3
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz p3, :cond_0

    invoke-static {}, Lj9/j0;->b()Lj9/j0;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p3, Lj9/z;

    invoke-direct {p3, p2, p0, p1}, Lj9/z;-><init>(ZLjava/lang/String;Lj9/x;)V

    new-instance p0, Lj9/i0;

    const/4 p1, 0x0

    invoke-direct {p0, p3, p1}, Lj9/i0;-><init>(Ljava/util/concurrent/Callable;[B)V

    return-object p0

    :catch_0
    move-exception p0

    invoke-static {v1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const-string p1, "module call"

    invoke-static {p1, p0}, Lj9/j0;->d(Ljava/lang/String;Ljava/lang/Throwable;)Lj9/j0;

    move-result-object p0

    return-object p0

    :catch_1
    move-exception p0

    invoke-static {v1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "module init: "

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p0}, Lj9/j0;->d(Ljava/lang/String;Ljava/lang/Throwable;)Lj9/j0;

    move-result-object p0

    return-object p0
.end method
