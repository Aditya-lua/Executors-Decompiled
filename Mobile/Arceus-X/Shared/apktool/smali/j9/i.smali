.class public Lj9/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static c:Lj9/i;


# instance fields
.field public final a:Landroid/content/Context;

.field public volatile b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lj9/i;->a:Landroid/content/Context;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lj9/i;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    const-class v0, Lj9/i;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lj9/i;->c:Lj9/i;

    if-nez v1, :cond_0

    invoke-static {p0}, Lj9/c0;->a(Landroid/content/Context;)V

    new-instance v1, Lj9/i;

    invoke-direct {v1, p0}, Lj9/i;-><init>(Landroid/content/Context;)V

    sput-object v1, Lj9/i;->c:Lj9/i;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object p0, Lj9/i;->c:Lj9/i;

    return-object p0

    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static final d(Landroid/content/pm/PackageInfo;Z)Z
    .locals 10
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x1

    if-eqz p1, :cond_4

    iget-object v2, p0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    const-string v3, "com.android.vending"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    const-string v3, "com.google.android.gms"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    :cond_1
    iget-object p1, p0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-nez p1, :cond_3

    :cond_2
    move p1, v0

    goto :goto_0

    :cond_3
    iget p1, p1, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit16 p1, p1, 0x81

    if-eqz p1, :cond_2

    move p1, v1

    :cond_4
    :goto_0
    if-eqz p1, :cond_5

    :try_start_0
    sget-object v2, Lj9/b0;->c:Ldb/i;

    goto :goto_1

    :cond_5
    sget-object v2, Lj9/b0;->b:Ldb/i;

    :goto_1
    sget-object v3, Lu9/a;->a:Ljava/lang/Object;

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1c

    if-ge v3, v4, :cond_8

    iget-object v3, p0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    const/4 v4, 0x0

    if-eqz v3, :cond_6

    array-length v5, v3

    if-ne v5, v1, :cond_6

    aget-object v3, v3, v0

    invoke-virtual {v3}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v4

    :cond_6
    if-eqz v4, :cond_7

    invoke-static {v4}, Ldb/i;->h(Ljava/lang/Object;)Ldb/i;

    move-result-object v3

    goto :goto_5

    :cond_7
    invoke-static {}, Ldb/i;->g()Ldb/i;

    move-result-object v3

    goto :goto_5

    :cond_8
    if-lt v3, v4, :cond_9

    move v3, v1

    goto :goto_2

    :cond_9
    move v3, v0

    :goto_2
    invoke-static {v3}, Ldb/s;->a(Z)V

    invoke-static {p0}, Lcom/appsflyer/sdk_base/util/a;->a(Landroid/content/pm/PackageInfo;)Landroid/content/pm/SigningInfo;

    move-result-object v3

    if-eqz v3, :cond_c

    invoke-virtual {v3}, Landroid/content/pm/SigningInfo;->hasMultipleSigners()Z

    move-result v4

    if-nez v4, :cond_c

    invoke-virtual {v3}, Landroid/content/pm/SigningInfo;->getSigningCertificateHistory()[Landroid/content/pm/Signature;

    move-result-object v4

    if-nez v4, :cond_a

    goto :goto_4

    :cond_a
    sget-object v4, Ldb/i;->b:Ldb/m;

    new-instance v4, Ldb/e;

    invoke-direct {v4}, Ldb/e;-><init>()V

    invoke-virtual {v3}, Landroid/content/pm/SigningInfo;->getSigningCertificateHistory()[Landroid/content/pm/Signature;

    move-result-object v3

    array-length v5, v3

    move v6, v0

    :goto_3
    if-ge v6, v5, :cond_b

    aget-object v7, v3, v6

    invoke-virtual {v7}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v7

    invoke-virtual {v4, v7}, Ldb/e;->b(Ljava/lang/Object;)Ldb/e;

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_b
    invoke-virtual {v4}, Ldb/e;->c()Ldb/i;

    move-result-object v3

    goto :goto_5

    :cond_c
    :goto_4
    invoke-static {}, Ldb/i;->g()Ldb/i;

    move-result-object v3

    :goto_5
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_10

    invoke-virtual {v3}, Ldb/i;->e()Ldb/i;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    move v5, v0

    :goto_6
    if-ge v5, v4, :cond_f

    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [B

    invoke-virtual {v2, v0}, Ldb/i;->m(I)Ldb/m;

    move-result-object v7

    :cond_d
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    add-int/lit8 v9, v5, 0x1

    if-eqz v8, :cond_e

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, [B

    invoke-static {v6, v8}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v8

    if-eqz v8, :cond_d

    return v1

    :cond_e
    move v5, v9

    goto :goto_6

    :cond_f
    return v0

    :cond_10
    const-string v2, "Unable to obtain package certificate history."

    new-instance v3, Ljava/lang/IllegalArgumentException;

    invoke-direct {v3, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v3
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const-string v2, "GoogleSignatureVerifier"

    const-string v3, "package info is not set correctly"

    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz p1, :cond_11

    sget-object p1, Lj9/b0;->a:[Lj9/x;

    invoke-static {p0, p1}, Lj9/i;->f(Landroid/content/pm/PackageInfo;[Lj9/x;)Lj9/x;

    move-result-object p0

    goto :goto_7

    :cond_11
    sget-object p1, Lj9/b0;->a:[Lj9/x;

    aget-object p1, p1, v0

    filled-new-array {p1}, [Lj9/x;

    move-result-object p1

    invoke-static {p0, p1}, Lj9/i;->f(Landroid/content/pm/PackageInfo;[Lj9/x;)Lj9/x;

    move-result-object p0

    :goto_7
    if-eqz p0, :cond_12

    return v1

    :cond_12
    return v0
.end method

.method public static varargs f(Landroid/content/pm/PackageInfo;[Lj9/x;)Lj9/x;
    .locals 3

    iget-object v0, p0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    array-length v0, v0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_1

    const-string p0, "GoogleSignatureVerifier"

    const-string p1, "Package has more than one signature."

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    :cond_1
    new-instance v0, Lj9/y;

    iget-object p0, p0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    const/4 v2, 0x0

    aget-object p0, p0, v2

    invoke-virtual {p0}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object p0

    invoke-direct {v0, p0}, Lj9/y;-><init>([B)V

    :goto_0
    array-length p0, p1

    if-ge v2, p0, :cond_3

    aget-object p0, p1, v2

    invoke-virtual {p0, v0}, Lj9/x;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_2

    aget-object p0, p1, v2

    return-object p0

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-object v1
.end method


# virtual methods
.method public b(Landroid/content/pm/PackageInfo;)Z
    .locals 3
    .param p1    # Landroid/content/pm/PackageInfo;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-static {p1, v0}, Lj9/i;->d(Landroid/content/pm/PackageInfo;Z)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    return v2

    :cond_1
    invoke-static {p1, v2}, Lj9/i;->d(Landroid/content/pm/PackageInfo;Z)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lj9/i;->a:Landroid/content/Context;

    invoke-static {p1}, Lj9/h;->e(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v2

    :cond_2
    const-string p1, "GoogleSignatureVerifier"

    const-string v1, "Test-keys aren\'t accepted on this build."

    invoke-static {p1, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    return v0
.end method

.method public c(I)Z
    .locals 5

    iget-object v0, p0, Lj9/i;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    array-length v0, p1

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    const/4 v2, 0x0

    move v3, v1

    :goto_0
    if-ge v3, v0, :cond_2

    aget-object v2, p1, v3

    invoke-virtual {p0, v2, v1, v1}, Lj9/i;->e(Ljava/lang/String;ZZ)Lj9/j0;

    move-result-object v2

    iget-boolean v4, v2, Lj9/j0;->a:Z

    if-eqz v4, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    invoke-static {v2}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    :goto_1
    const-string p1, "no pkgs"

    invoke-static {p1}, Lj9/j0;->c(Ljava/lang/String;)Lj9/j0;

    move-result-object v2

    :goto_2
    invoke-virtual {v2}, Lj9/j0;->e()V

    iget-boolean p1, v2, Lj9/j0;->a:Z

    return p1
.end method

.method public final e(Ljava/lang/String;ZZ)Lj9/j0;
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "PackageManagerGetSignatures"
        }
    .end annotation

    const-string p2, "null pkg"

    if-nez p1, :cond_0

    invoke-static {p2}, Lj9/j0;->c(Ljava/lang/String;)Lj9/j0;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object p3, p0, Lj9/i;->b:Ljava/lang/String;

    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_8

    sget-object p3, Lj9/c0;->a:Lj9/a0;

    invoke-static {}, Landroid/os/StrictMode;->allowThreadDiskReads()Landroid/os/StrictMode$ThreadPolicy;

    move-result-object p3

    const/4 v0, 0x1

    :try_start_0
    invoke-static {}, Lj9/c0;->b()V

    sget-object v1, Lj9/c0;->g:Ln9/p0;

    invoke-interface {v1}, Ln9/p0;->c()Z

    move-result v1
    :try_end_0
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$a; {:try_start_0 .. :try_end_0} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p3}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    if-eqz v1, :cond_1

    new-instance p2, Lj9/g0;

    const/4 p3, 0x0

    invoke-direct {p2, p3}, Lj9/g0;-><init>([B)V

    invoke-virtual {p2, p1}, Lj9/g0;->a(Ljava/lang/String;)Lj9/g0;

    iget-object p3, p0, Lj9/i;->a:Landroid/content/Context;

    invoke-static {p3}, Lj9/h;->e(Landroid/content/Context;)Z

    move-result p3

    invoke-virtual {p2, p3}, Lj9/g0;->b(Z)Lj9/g0;

    invoke-virtual {p2, v0}, Lj9/g0;->c(Z)Lj9/g0;

    invoke-virtual {p2}, Lj9/g0;->d()Lj9/h0;

    move-result-object p2

    invoke-static {p2}, Lj9/c0;->c(Lj9/h0;)Lj9/j0;

    move-result-object p2

    goto/16 :goto_3

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    :goto_0
    :try_start_1
    const-string v2, "GoogleCertificates"

    const-string v3, "Failed to get Google certificates from remote"

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {p3}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    :cond_1
    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt p3, v1, :cond_2

    const p3, 0x8000040

    goto :goto_1

    :cond_2
    const/16 p3, 0x40

    :goto_1
    :try_start_2
    iget-object v1, p0, Lj9/i;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v1, p1, p3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p3
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    iget-object v1, p0, Lj9/i;->a:Landroid/content/Context;

    invoke-static {v1}, Lj9/h;->e(Landroid/content/Context;)Z

    move-result v1

    if-nez p3, :cond_3

    invoke-static {p2}, Lj9/j0;->c(Ljava/lang/String;)Lj9/j0;

    move-result-object p2

    goto :goto_3

    :cond_3
    iget-object p2, p3, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    if-eqz p2, :cond_6

    array-length p2, p2

    if-eq p2, v0, :cond_4

    goto :goto_2

    :cond_4
    new-instance p2, Lj9/y;

    iget-object v2, p3, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-virtual {v2}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v2

    invoke-direct {p2, v2}, Lj9/y;-><init>([B)V

    iget-object v2, p3, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-static {v2, p2, v1, v3}, Lj9/c0;->d(Ljava/lang/String;Lj9/x;ZZ)Lj9/j0;

    move-result-object v1

    iget-boolean v4, v1, Lj9/j0;->a:Z

    if-eqz v4, :cond_5

    iget-object p3, p3, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-eqz p3, :cond_5

    iget p3, p3, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_5

    invoke-static {v2, p2, v3, v0}, Lj9/c0;->d(Ljava/lang/String;Lj9/x;ZZ)Lj9/j0;

    move-result-object p2

    iget-boolean p2, p2, Lj9/j0;->a:Z

    if-eqz p2, :cond_5

    const-string p2, "debuggable release cert app rejected"

    invoke-static {p2}, Lj9/j0;->c(Ljava/lang/String;)Lj9/j0;

    move-result-object p2

    goto :goto_3

    :cond_5
    move-object p2, v1

    goto :goto_3

    :cond_6
    :goto_2
    const-string p2, "single cert required"

    invoke-static {p2}, Lj9/j0;->c(Ljava/lang/String;)Lj9/j0;

    move-result-object p2

    :goto_3
    iget-boolean p3, p2, Lj9/j0;->a:Z

    if-eqz p3, :cond_7

    iput-object p1, p0, Lj9/i;->b:Ljava/lang/String;

    :cond_7
    return-object p2

    :catch_2
    move-exception p2

    const-string p3, "no pkg "

    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p2}, Lj9/j0;->d(Ljava/lang/String;Ljava/lang/Throwable;)Lj9/j0;

    move-result-object p1

    return-object p1

    :goto_4
    invoke-static {p3}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    throw p1

    :cond_8
    invoke-static {}, Lj9/j0;->b()Lj9/j0;

    move-result-object p1

    return-object p1
.end method
