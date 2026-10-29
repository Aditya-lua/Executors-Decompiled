.class public final Lnb/k5;
.super Lnb/b5;
.source "SourceFile"


# instance fields
.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:I

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:J

.field public final i:J

.field public final j:J

.field public k:Ljava/util/List;

.field public l:Ljava/lang/String;

.field public m:I

.field public n:Ljava/lang/String;

.field public o:Ljava/lang/String;

.field public p:J

.field public q:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lnb/g7;JJ)V
    .locals 2

    invoke-direct {p0, p1}, Lnb/b5;-><init>(Lnb/g7;)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lnb/k5;->p:J

    const/4 p1, 0x0

    iput-object p1, p0, Lnb/k5;->q:Ljava/lang/String;

    iput-wide p2, p0, Lnb/k5;->i:J

    iput-wide p4, p0, Lnb/k5;->j:J

    return-void
.end method


# virtual methods
.method public final m()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final n()V
    .locals 11

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->w()Lnb/u5;

    move-result-object v1

    iget-wide v2, p0, Lnb/k5;->j:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iget-wide v3, p0, Lnb/k5;->i:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "sdkVersion bundled with app, dynamiteVersion"

    invoke-virtual {v1, v4, v2, v3}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const/4 v3, 0x0

    const-string v4, ""

    const/high16 v5, -0x80000000

    const-string v6, "Unknown"

    const-string v7, "unknown"

    if-nez v2, :cond_1

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    invoke-static {v1}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    const-string v9, "PackageManager is null, app identity information might be inaccurate. appId"

    invoke-virtual {v0, v9, v8}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    move-object v8, v6

    goto/16 :goto_4

    :cond_1
    :try_start_0
    invoke-virtual {v2, v1}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    invoke-static {v1}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    const-string v9, "Error retrieving app installer package name. appId"

    invoke-virtual {v0, v9, v8}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    if-nez v7, :cond_2

    const-string v0, "manual_install"

    move-object v7, v0

    goto :goto_1

    :cond_2
    const-string v0, "com.android.vending"

    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    move-object v7, v4

    :cond_3
    :goto_1
    :try_start_1
    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v8, v0, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    invoke-virtual {v2, v8}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v8

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_4

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_2

    :cond_4
    move-object v8, v6

    :goto_2
    :try_start_2
    iget-object v6, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    iget v5, v0, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_4

    :catch_1
    move-object v0, v6

    move-object v6, v8

    goto :goto_3

    :catch_2
    move-object v0, v6

    :goto_3
    iget-object v8, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v8}, Lnb/g7;->a()Lnb/w5;

    move-result-object v8

    invoke-virtual {v8}, Lnb/w5;->o()Lnb/u5;

    move-result-object v8

    invoke-static {v1}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v9

    const-string v10, "Error retrieving package info. appId, appName"

    invoke-virtual {v8, v10, v9, v6}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v8, v6

    move-object v6, v0

    :goto_4
    iput-object v1, p0, Lnb/k5;->c:Ljava/lang/String;

    iput-object v7, p0, Lnb/k5;->f:Ljava/lang/String;

    iput-object v6, p0, Lnb/k5;->d:Ljava/lang/String;

    iput v5, p0, Lnb/k5;->e:I

    iput-object v8, p0, Lnb/k5;->g:Ljava/lang/String;

    const-wide/16 v5, 0x0

    iput-wide v5, p0, Lnb/k5;->h:J

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->h()I

    move-result v5

    if-eqz v5, :cond_b

    const/4 v6, 0x1

    if-eq v5, v6, :cond_a

    const/4 v6, 0x3

    if-eq v5, v6, :cond_9

    const/4 v6, 0x4

    if-eq v5, v6, :cond_8

    const/4 v6, 0x6

    if-eq v5, v6, :cond_7

    const/4 v6, 0x7

    if-eq v5, v6, :cond_6

    const/16 v6, 0x8

    if-eq v5, v6, :cond_5

    iget-object v6, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v6}, Lnb/g7;->a()Lnb/w5;

    move-result-object v7

    invoke-virtual {v7}, Lnb/w5;->u()Lnb/u5;

    move-result-object v7

    const-string v8, "App measurement disabled"

    invoke-virtual {v7, v8}, Lnb/u5;->a(Ljava/lang/String;)V

    invoke-virtual {v6}, Lnb/g7;->a()Lnb/w5;

    move-result-object v6

    invoke-virtual {v6}, Lnb/w5;->p()Lnb/u5;

    move-result-object v6

    const-string v7, "Invalid scion state in identity"

    invoke-virtual {v6, v7}, Lnb/u5;->a(Ljava/lang/String;)V

    goto :goto_5

    :cond_5
    iget-object v6, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v6}, Lnb/g7;->a()Lnb/w5;

    move-result-object v6

    invoke-virtual {v6}, Lnb/w5;->u()Lnb/u5;

    move-result-object v6

    const-string v7, "App measurement disabled due to denied storage consent"

    invoke-virtual {v6, v7}, Lnb/u5;->a(Ljava/lang/String;)V

    goto :goto_5

    :cond_6
    iget-object v6, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v6}, Lnb/g7;->a()Lnb/w5;

    move-result-object v6

    invoke-virtual {v6}, Lnb/w5;->u()Lnb/u5;

    move-result-object v6

    const-string v7, "App measurement disabled via the global data collection setting"

    invoke-virtual {v6, v7}, Lnb/u5;->a(Ljava/lang/String;)V

    goto :goto_5

    :cond_7
    iget-object v6, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v6}, Lnb/g7;->a()Lnb/w5;

    move-result-object v6

    invoke-virtual {v6}, Lnb/w5;->t()Lnb/u5;

    move-result-object v6

    const-string v7, "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"

    invoke-virtual {v6, v7}, Lnb/u5;->a(Ljava/lang/String;)V

    goto :goto_5

    :cond_8
    iget-object v6, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v6}, Lnb/g7;->a()Lnb/w5;

    move-result-object v6

    invoke-virtual {v6}, Lnb/w5;->u()Lnb/u5;

    move-result-object v6

    const-string v7, "App measurement disabled via the manifest"

    invoke-virtual {v6, v7}, Lnb/u5;->a(Ljava/lang/String;)V

    goto :goto_5

    :cond_9
    iget-object v6, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v6}, Lnb/g7;->a()Lnb/w5;

    move-result-object v6

    invoke-virtual {v6}, Lnb/w5;->u()Lnb/u5;

    move-result-object v6

    const-string v7, "App measurement disabled by setAnalyticsCollectionEnabled(false)"

    invoke-virtual {v6, v7}, Lnb/u5;->a(Ljava/lang/String;)V

    goto :goto_5

    :cond_a
    iget-object v6, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v6}, Lnb/g7;->a()Lnb/w5;

    move-result-object v6

    invoke-virtual {v6}, Lnb/w5;->u()Lnb/u5;

    move-result-object v6

    const-string v7, "App measurement deactivated via the manifest"

    invoke-virtual {v6, v7}, Lnb/u5;->a(Ljava/lang/String;)V

    goto :goto_5

    :cond_b
    iget-object v6, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v6}, Lnb/g7;->a()Lnb/w5;

    move-result-object v6

    invoke-virtual {v6}, Lnb/w5;->w()Lnb/u5;

    move-result-object v6

    const-string v7, "App measurement collection enabled"

    invoke-virtual {v6, v7}, Lnb/u5;->a(Ljava/lang/String;)V

    :goto_5
    iput-object v4, p0, Lnb/k5;->n:Ljava/lang/String;

    iget-object v6, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v6}, Lnb/g7;->c()Lnb/f;

    :try_start_3
    invoke-virtual {v6}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {v0}, Lnb/g7;->H()Ljava/lang/String;

    move-result-object v0

    const-string v8, "google_app_id"

    invoke-static {v7, v8, v0}, Lnb/ab;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_c

    goto :goto_6

    :cond_c
    move-object v4, v0

    :goto_6
    iput-object v4, p0, Lnb/k5;->n:Ljava/lang/String;

    if-nez v5, :cond_d

    invoke-virtual {v6}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    const-string v4, "App measurement enabled for app package, google app id"

    iget-object v5, p0, Lnb/k5;->c:Ljava/lang/String;

    iget-object v6, p0, Lnb/k5;->n:Ljava/lang/String;

    invoke-virtual {v0, v4, v5, v6}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_7

    :catch_3
    move-exception v0

    iget-object v4, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v4}, Lnb/g7;->a()Lnb/w5;

    move-result-object v4

    invoke-virtual {v4}, Lnb/w5;->o()Lnb/u5;

    move-result-object v4

    invoke-static {v1}, Lnb/w5;->x(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    const-string v5, "Fetching Google App Id failed with exception. appId"

    invoke-virtual {v4, v5, v1, v0}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_d
    :goto_7
    const/4 v0, 0x0

    iput-object v0, p0, Lnb/k5;->k:Ljava/util/List;

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->c()Lnb/f;

    invoke-virtual {v0}, Lnb/g7;->w()Lnb/k;

    move-result-object v1

    const-string v4, "analytics.safelisted_events"

    invoke-virtual {v1, v4}, Lnb/k;->K(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_e

    goto :goto_8

    :cond_e
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_f

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->t()Lnb/u5;

    move-result-object v1

    const-string v4, "Safelisted event list is empty. Ignoring"

    invoke-virtual {v1, v4}, Lnb/u5;->a(Ljava/lang/String;)V

    goto :goto_9

    :cond_f
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_10
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v0}, Lnb/g7;->C()Lnb/ve;

    move-result-object v6

    const-string v7, "safelisted event"

    invoke-virtual {v6, v7, v5}, Lnb/ve;->u0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_10

    goto :goto_9

    :cond_11
    :goto_8
    iput-object v1, p0, Lnb/k5;->k:Ljava/util/List;

    :goto_9
    if-eqz v2, :cond_12

    invoke-virtual {v0}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lw9/a;->a(Landroid/content/Context;)Z

    move-result v0

    iput v0, p0, Lnb/k5;->m:I

    return-void

    :cond_12
    iput v3, p0, Lnb/k5;->m:I

    return-void
.end method

.method public final o(Ljava/lang/String;)Lcom/google/android/gms/measurement/internal/zzr;
    .locals 44

    move-object/from16 v1, p0

    invoke-virtual {v1}, Lnb/j8;->h()V

    new-instance v2, Lcom/google/android/gms/measurement/internal/zzr;

    invoke-virtual {v1}, Lnb/k5;->q()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lnb/k5;->r()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lnb/b5;->j()V

    iget-object v5, v1, Lnb/k5;->d:Ljava/lang/String;

    invoke-virtual {v1}, Lnb/b5;->j()V

    iget v0, v1, Lnb/k5;->e:I

    int-to-long v6, v0

    invoke-virtual {v1}, Lnb/b5;->j()V

    iget-object v0, v1, Lnb/k5;->f:Ljava/lang/String;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v8, v1, Lnb/k5;->f:Ljava/lang/String;

    iget-object v0, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->w()Lnb/k;

    move-result-object v9

    invoke-virtual {v9}, Lnb/k;->A()J

    invoke-virtual {v1}, Lnb/b5;->j()V

    invoke-virtual {v1}, Lnb/j8;->h()V

    iget-wide v9, v1, Lnb/k5;->h:J

    const-wide/16 v11, 0x0

    cmp-long v13, v9, v11

    const/4 v14, 0x0

    if-nez v13, :cond_4

    iget-object v9, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v9}, Lnb/g7;->C()Lnb/ve;

    move-result-object v9

    invoke-virtual {v0}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v10

    invoke-virtual {v0}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9}, Lnb/j8;->h()V

    invoke-static {v10}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ln9/m;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {v10}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v13

    invoke-static {}, Lnb/ve;->C()Ljava/security/MessageDigest;

    move-result-object v15

    const-wide/16 v16, -0x1

    if-nez v15, :cond_0

    iget-object v0, v9, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->o()Lnb/u5;

    move-result-object v0

    const-string v9, "Could not get MD5 instance"

    invoke-virtual {v0, v9}, Lnb/u5;->a(Ljava/lang/String;)V

    move-wide/from16 v18, v11

    :goto_0
    move-wide/from16 v9, v16

    goto :goto_3

    :cond_0
    if-eqz v13, :cond_3

    :try_start_0
    invoke-virtual {v9, v10, v0}, Lnb/ve;->S(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {v10}, Lw9/c;->a(Landroid/content/Context;)Lw9/b;

    move-result-object v0

    iget-object v10, v9, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v10}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v13

    invoke-virtual {v13}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v13
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    move-wide/from16 v18, v11

    const/16 v11, 0x40

    :try_start_1
    invoke-virtual {v0, v13, v11}, Lw9/b;->e(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    if-eqz v0, :cond_1

    array-length v11, v0

    if-lez v11, :cond_1

    aget-object v0, v0, v14

    invoke-virtual {v0}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v0

    invoke-virtual {v15, v0}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v0

    invoke-static {v0}, Lnb/ve;->D([B)J

    move-result-wide v16

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_1
    invoke-virtual {v10}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->r()Lnb/u5;

    move-result-object v0

    const-string v10, "Could not get signatures"

    invoke-virtual {v0, v10}, Lnb/u5;->a(Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_1
    move-exception v0

    move-wide/from16 v18, v11

    goto :goto_1

    :cond_2
    move-wide/from16 v18, v11

    move-wide/from16 v16, v18

    goto :goto_0

    :goto_1
    iget-object v9, v9, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v9}, Lnb/g7;->a()Lnb/w5;

    move-result-object v9

    invoke-virtual {v9}, Lnb/w5;->o()Lnb/u5;

    move-result-object v9

    const-string v10, "Package name not found"

    invoke-virtual {v9, v10, v0}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_2
    move-wide/from16 v9, v18

    goto :goto_3

    :cond_3
    move-wide/from16 v18, v11

    goto :goto_2

    :goto_3
    iput-wide v9, v1, Lnb/k5;->h:J

    :goto_4
    move-wide v11, v9

    goto :goto_5

    :cond_4
    move-wide/from16 v18, v11

    goto :goto_4

    :goto_5
    iget-object v0, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->g()Z

    move-result v9

    invoke-virtual {v0}, Lnb/g7;->x()Lnb/k6;

    move-result-object v10

    iget-boolean v10, v10, Lnb/k6;->s:Z

    const/4 v13, 0x1

    xor-int/lit8 v15, v10, 0x1

    invoke-virtual {v1}, Lnb/j8;->h()V

    invoke-virtual {v0}, Lnb/g7;->g()Z

    move-result v10

    const/4 v13, 0x0

    if-nez v10, :cond_5

    :catch_2
    :goto_6
    move-object v0, v13

    goto/16 :goto_7

    :cond_5
    invoke-static {}, Lcom/google/android/gms/internal/measurement/ug;->a()Z

    invoke-virtual {v0}, Lnb/g7;->w()Lnb/k;

    move-result-object v10

    sget-object v14, Lnb/z4;->I0:Lnb/y4;

    invoke-virtual {v10, v13, v14}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v10

    if-eqz v10, :cond_6

    iget-object v0, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->w()Lnb/u5;

    move-result-object v0

    const-string v10, "Disabled IID for tests."

    invoke-virtual {v0, v10}, Lnb/u5;->a(Ljava/lang/String;)V

    goto :goto_6

    :cond_6
    :try_start_2
    invoke-virtual {v0}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const-string v10, "com.google.firebase.analytics.FirebaseAnalytics"

    invoke-virtual {v0, v10}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    if-nez v0, :cond_7

    goto :goto_6

    :cond_7
    :try_start_3
    const-string v10, "getInstance"

    const-class v14, Landroid/content/Context;

    filled-new-array {v14}, [Ljava/lang/Class;

    move-result-object v14

    invoke-virtual {v0, v10, v14}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    iget-object v14, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v14}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v14

    filled-new-array {v14}, [Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v10, v13, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4

    if-nez v10, :cond_8

    goto :goto_6

    :cond_8
    :try_start_4
    const-string v14, "getFirebaseInstanceId"

    invoke-virtual {v0, v14, v13}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v10, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_7

    :catch_3
    iget-object v0, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->t()Lnb/u5;

    move-result-object v0

    const-string v10, "Failed to retrieve Firebase Instance Id"

    invoke-virtual {v0, v10}, Lnb/u5;->a(Ljava/lang/String;)V

    goto :goto_6

    :catch_4
    iget-object v0, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->s()Lnb/u5;

    move-result-object v0

    const-string v10, "Failed to obtain Firebase Analytics instance"

    invoke-virtual {v0, v10}, Lnb/u5;->a(Ljava/lang/String;)V

    goto :goto_6

    :goto_7
    iget-object v10, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v10}, Lnb/g7;->x()Lnb/k6;

    move-result-object v14

    iget-object v14, v14, Lnb/k6;->f:Lnb/h6;

    invoke-virtual {v14}, Lnb/h6;->a()J

    move-result-wide v13

    cmp-long v21, v13, v18

    if-nez v21, :cond_9

    iget-wide v13, v10, Lnb/g7;->D:J

    move-object/from16 v21, v2

    move-object/from16 v22, v3

    goto :goto_8

    :cond_9
    move-object/from16 v21, v2

    move-object/from16 v22, v3

    iget-wide v2, v10, Lnb/g7;->D:J

    invoke-static {v2, v3, v13, v14}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v13

    :goto_8
    invoke-virtual {v1}, Lnb/b5;->j()V

    iget v2, v1, Lnb/k5;->m:I

    iget-object v3, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v3}, Lnb/g7;->w()Lnb/k;

    move-result-object v10

    invoke-virtual {v10}, Lnb/k;->M()Z

    move-result v10

    invoke-virtual {v3}, Lnb/g7;->x()Lnb/k6;

    move-result-object v23

    invoke-virtual/range {v23 .. v23}, Lnb/j8;->h()V

    move-object/from16 v24, v0

    invoke-virtual/range {v23 .. v23}, Lnb/k6;->p()Landroid/content/SharedPreferences;

    move-result-object v0

    move/from16 v23, v2

    const-string v2, "deferred_analytics_collection"

    move-object/from16 v25, v3

    const/4 v3, 0x0

    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual/range {v25 .. v25}, Lnb/g7;->w()Lnb/k;

    move-result-object v2

    const-string v3, "google_analytics_default_allow_ad_personalization_signals"

    move/from16 v26, v0

    const/4 v0, 0x1

    invoke-virtual {v2, v3, v0}, Lnb/k;->O(Ljava/lang/String;Z)Lnb/n8;

    move-result-object v2

    sget-object v0, Lnb/n8;->e:Lnb/n8;

    if-eq v2, v0, :cond_a

    const/4 v0, 0x1

    :goto_9
    move-object v2, v4

    move-object/from16 v27, v5

    goto :goto_a

    :cond_a
    const/4 v0, 0x0

    goto :goto_9

    :goto_a
    iget-wide v4, v1, Lnb/k5;->i:J

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    move-object/from16 v28, v0

    iget-object v0, v1, Lnb/k5;->k:Ljava/util/List;

    invoke-virtual/range {v25 .. v25}, Lnb/g7;->x()Lnb/k6;

    move-result-object v29

    invoke-virtual/range {v29 .. v29}, Lnb/k6;->w()Lnb/q8;

    move-result-object v29

    invoke-virtual/range {v29 .. v29}, Lnb/q8;->l()Ljava/lang/String;

    move-result-object v29

    move-object/from16 v30, v0

    iget-object v0, v1, Lnb/k5;->l:Ljava/lang/String;

    if-nez v0, :cond_b

    invoke-virtual/range {v25 .. v25}, Lnb/g7;->C()Lnb/ve;

    move-result-object v0

    invoke-virtual {v0}, Lnb/ve;->l0()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lnb/k5;->l:Ljava/lang/String;

    :cond_b
    iget-object v0, v1, Lnb/k5;->l:Ljava/lang/String;

    invoke-virtual/range {v25 .. v25}, Lnb/g7;->x()Lnb/k6;

    move-result-object v31

    move-object/from16 v32, v0

    invoke-virtual/range {v31 .. v31}, Lnb/k6;->w()Lnb/q8;

    move-result-object v0

    move-object/from16 v31, v2

    sget-object v2, Lnb/p8;->c:Lnb/p8;

    invoke-virtual {v0, v2}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v0

    if-nez v0, :cond_c

    move-wide/from16 v33, v4

    const/4 v0, 0x0

    goto :goto_c

    :cond_c
    invoke-virtual {v1}, Lnb/j8;->h()V

    move-wide/from16 v33, v4

    iget-wide v4, v1, Lnb/k5;->p:J

    cmp-long v0, v4, v18

    if-nez v0, :cond_d

    goto :goto_b

    :cond_d
    invoke-virtual/range {v25 .. v25}, Lnb/g7;->e()Lu9/e;

    move-result-object v0

    invoke-interface {v0}, Lu9/e;->a()J

    move-result-wide v4

    move-wide/from16 v35, v4

    iget-wide v4, v1, Lnb/k5;->p:J

    sub-long v4, v35, v4

    iget-object v0, v1, Lnb/k5;->o:Ljava/lang/String;

    if-eqz v0, :cond_e

    const-wide/32 v35, 0x5265c00

    cmp-long v0, v4, v35

    if-lez v0, :cond_e

    iget-object v0, v1, Lnb/k5;->q:Ljava/lang/String;

    if-nez v0, :cond_e

    invoke-virtual {v1}, Lnb/k5;->p()V

    :cond_e
    :goto_b
    iget-object v0, v1, Lnb/k5;->o:Ljava/lang/String;

    if-nez v0, :cond_f

    invoke-virtual {v1}, Lnb/k5;->p()V

    :cond_f
    iget-object v0, v1, Lnb/k5;->o:Ljava/lang/String;

    :goto_c
    invoke-virtual/range {v25 .. v25}, Lnb/g7;->w()Lnb/k;

    move-result-object v2

    invoke-virtual {v2}, Lnb/k;->P()Z

    move-result v2

    invoke-virtual/range {v25 .. v25}, Lnb/g7;->C()Lnb/ve;

    move-result-object v4

    invoke-virtual {v1}, Lnb/k5;->q()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v25, v0

    iget-object v0, v4, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v35

    invoke-virtual/range {v35 .. v35}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v35

    if-nez v35, :cond_10

    move/from16 v35, v2

    move-wide/from16 v4, v18

    const/4 v2, 0x0

    goto :goto_f

    :cond_10
    :try_start_5
    invoke-virtual {v0}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lw9/c;->a(Landroid/content/Context;)Lw9/b;

    move-result-object v0
    :try_end_5
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_5 .. :try_end_5} :catch_5

    move/from16 v35, v2

    const/4 v2, 0x0

    :try_start_6
    invoke-virtual {v0, v5, v2}, Lw9/b;->c(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    if-eqz v0, :cond_11

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I
    :try_end_6
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_6 .. :try_end_6} :catch_6

    goto :goto_e

    :cond_11
    :goto_d
    move v0, v2

    goto :goto_e

    :catch_5
    move/from16 v35, v2

    const/4 v2, 0x0

    :catch_6
    iget-object v0, v4, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->c()Lnb/f;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v0

    invoke-virtual {v0}, Lnb/w5;->u()Lnb/u5;

    move-result-object v0

    const-string v4, "PackageManager failed to find running app: app_id"

    invoke-virtual {v0, v4, v5}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_d

    :goto_e
    int-to-long v4, v0

    :goto_f
    iget-object v0, v1, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->x()Lnb/k6;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lnb/k6;->w()Lnb/q8;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lnb/q8;->b()I

    move-result v17

    invoke-virtual {v0}, Lnb/g7;->x()Lnb/k6;

    move-result-object v36

    invoke-virtual/range {v36 .. v36}, Lnb/k6;->u()Lnb/x;

    move-result-object v36

    invoke-virtual/range {v36 .. v36}, Lnb/x;->e()Ljava/lang/String;

    move-result-object v36

    invoke-static {}, Lcom/google/android/gms/internal/measurement/vf;->a()Z

    invoke-virtual {v0}, Lnb/g7;->w()Lnb/k;

    move-result-object v2

    move-object/from16 v38, v0

    sget-object v0, Lnb/z4;->R0:Lnb/y4;

    move-wide/from16 v39, v4

    const/4 v4, 0x0

    invoke-virtual {v2, v4, v0}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v2

    if-eqz v2, :cond_12

    invoke-virtual/range {v38 .. v38}, Lnb/g7;->C()Lnb/ve;

    move-result-object v2

    invoke-virtual {v2}, Lnb/ve;->I()I

    move-result v2

    goto :goto_10

    :cond_12
    const/4 v2, 0x0

    :goto_10
    invoke-static {}, Lcom/google/android/gms/internal/measurement/vf;->a()Z

    invoke-virtual/range {v38 .. v38}, Lnb/g7;->w()Lnb/k;

    move-result-object v5

    invoke-virtual {v5, v4, v0}, Lnb/k;->H(Ljava/lang/String;Lnb/y4;)Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-virtual/range {v38 .. v38}, Lnb/g7;->C()Lnb/ve;

    move-result-object v0

    invoke-virtual {v0}, Lnb/ve;->J()J

    move-result-wide v4

    move-wide/from16 v18, v4

    :cond_13
    invoke-virtual/range {v38 .. v38}, Lnb/g7;->w()Lnb/k;

    move-result-object v0

    invoke-virtual {v0}, Lnb/k;->R()Ljava/lang/String;

    move-result-object v37

    invoke-virtual/range {v38 .. v38}, Lnb/g7;->w()Lnb/k;

    move-result-object v0

    const/4 v4, 0x1

    invoke-virtual {v0, v3, v4}, Lnb/k;->O(Ljava/lang/String;Z)Lnb/n8;

    move-result-object v0

    new-instance v3, Lnb/z2;

    invoke-direct {v3, v0}, Lnb/z2;-><init>(Lnb/n8;)V

    invoke-virtual {v3}, Lnb/z2;->b()Ljava/lang/String;

    move-result-object v38

    iget-object v0, v1, Lnb/j8;->a:Lnb/g7;

    iget-wide v3, v0, Lnb/g7;->D:J

    invoke-virtual {v0}, Lnb/g7;->N()Lnb/xa;

    move-result-object v0

    invoke-virtual {v0}, Lnb/xa;->q()Lcom/google/android/gms/internal/measurement/k7;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/k7;->zza()I

    move-result v41

    move/from16 v20, v10

    move-object/from16 v16, v24

    move-object/from16 v5, v27

    move-object/from16 v27, v32

    move/from16 v32, v17

    move-wide/from16 v42, v33

    move/from16 v34, v2

    move-object/from16 v2, v21

    move/from16 v21, v26

    move-object/from16 v26, v29

    move/from16 v29, v35

    move-object/from16 v33, v36

    move-wide/from16 v35, v18

    move/from16 v19, v23

    move-wide/from16 v23, v42

    move-wide/from16 v17, v13

    move v14, v9

    const-wide/32 v9, 0x2078d

    move-object/from16 v13, p1

    move-wide/from16 v42, v3

    move-object/from16 v3, v22

    move-object/from16 v22, v28

    move-object/from16 v4, v31

    move-object/from16 v28, v25

    move-object/from16 v25, v30

    move-wide/from16 v30, v39

    move-wide/from16 v39, v42

    invoke-direct/range {v2 .. v41}, Lcom/google/android/gms/measurement/internal/zzr;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;JIZZLjava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJILjava/lang/String;IJLjava/lang/String;Ljava/lang/String;JI)V

    return-object v2
.end method

.method public final p()V
    .locals 5

    invoke-virtual {p0}, Lnb/j8;->h()V

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->x()Lnb/k6;

    move-result-object v1

    invoke-virtual {v1}, Lnb/k6;->w()Lnb/q8;

    move-result-object v1

    sget-object v2, Lnb/p8;->c:Lnb/p8;

    invoke-virtual {v1, v2}, Lnb/q8;->o(Lnb/p8;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->v()Lnb/u5;

    move-result-object v1

    const-string v2, "Analytics Storage consent is not granted"

    invoke-virtual {v1, v2}, Lnb/u5;->a(Ljava/lang/String;)V

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x10

    new-array v1, v1, [B

    invoke-virtual {v0}, Lnb/g7;->C()Lnb/ve;

    move-result-object v2

    invoke-virtual {v2}, Lnb/ve;->q0()Ljava/security/SecureRandom;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/security/SecureRandom;->nextBytes([B)V

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-instance v3, Ljava/math/BigInteger;

    const/4 v4, 0x1

    invoke-direct {v3, v4, v1}, Ljava/math/BigInteger;-><init>(I[B)V

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v1

    const-string v3, "%032x"

    invoke-static {v2, v3, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/w5;->v()Lnb/u5;

    move-result-object v2

    if-nez v1, :cond_1

    const-string v3, "null"

    goto :goto_1

    :cond_1
    const-string v3, "not null"

    :goto_1
    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "Resetting session stitching token to %s"

    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lnb/u5;->a(Ljava/lang/String;)V

    iput-object v1, p0, Lnb/k5;->o:Ljava/lang/String;

    invoke-virtual {v0}, Lnb/g7;->e()Lu9/e;

    move-result-object v0

    invoke-interface {v0}, Lu9/e;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lnb/k5;->p:J

    return-void
.end method

.method public final q()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lnb/b5;->j()V

    iget-object v0, p0, Lnb/k5;->c:Ljava/lang/String;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lnb/k5;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final r()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lnb/j8;->h()V

    invoke-virtual {p0}, Lnb/b5;->j()V

    iget-object v0, p0, Lnb/k5;->n:Ljava/lang/String;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lnb/k5;->n:Ljava/lang/String;

    return-object v0
.end method

.method public final s()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lnb/b5;->j()V

    iget-object v0, p0, Lnb/k5;->g:Ljava/lang/String;

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lnb/k5;->g:Ljava/lang/String;

    return-object v0
.end method

.method public final t()I
    .locals 1

    invoke-virtual {p0}, Lnb/b5;->j()V

    iget v0, p0, Lnb/k5;->e:I

    return v0
.end method

.method public final u()J
    .locals 2

    iget-wide v0, p0, Lnb/k5;->j:J

    return-wide v0
.end method

.method public final v()I
    .locals 1

    invoke-virtual {p0}, Lnb/b5;->j()V

    iget v0, p0, Lnb/k5;->m:I

    return v0
.end method

.method public final w()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lnb/k5;->k:Ljava/util/List;

    return-object v0
.end method

.method public final x(Ljava/lang/String;)Z
    .locals 2

    iget-object v0, p0, Lnb/k5;->q:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    iput-object p1, p0, Lnb/k5;->q:Ljava/lang/String;

    return v1
.end method
