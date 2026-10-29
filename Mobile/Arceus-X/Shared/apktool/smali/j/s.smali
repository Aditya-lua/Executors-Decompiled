.class public Lj/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj/s$a;
    }
.end annotation


# static fields
.field public static d:Lj/s;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/location/LocationManager;

.field public final c:Lj/s$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/location/LocationManager;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/location/LocationManager;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lj/s$a;

    invoke-direct {v0}, Lj/s$a;-><init>()V

    iput-object v0, p0, Lj/s;->c:Lj/s$a;

    iput-object p1, p0, Lj/s;->a:Landroid/content/Context;

    iput-object p2, p0, Lj/s;->b:Landroid/location/LocationManager;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lj/s;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    sget-object v0, Lj/s;->d:Lj/s;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    new-instance v0, Lj/s;

    const-string v1, "location"

    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/location/LocationManager;

    invoke-direct {v0, p0, v1}, Lj/s;-><init>(Landroid/content/Context;Landroid/location/LocationManager;)V

    sput-object v0, Lj/s;->d:Lj/s;

    :cond_0
    sget-object p0, Lj/s;->d:Lj/s;

    return-object p0
.end method


# virtual methods
.method public final b()Landroid/location/Location;
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    iget-object v0, p0, Lj/s;->a:Landroid/content/Context;

    const-string v1, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {v0, v1}, Ll2/g;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    const-string v0, "network"

    invoke-virtual {p0, v0}, Lj/s;->c(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iget-object v2, p0, Lj/s;->a:Landroid/content/Context;

    const-string v3, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {v2, v3}, Ll2/g;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v2

    if-nez v2, :cond_1

    const-string v1, "gps"

    invoke-virtual {p0, v1}, Lj/s;->c(Ljava/lang/String;)Landroid/location/Location;

    move-result-object v1

    :cond_1
    if-eqz v1, :cond_3

    if-eqz v0, :cond_3

    invoke-virtual {v1}, Landroid/location/Location;->getTime()J

    move-result-wide v2

    invoke-virtual {v0}, Landroid/location/Location;->getTime()J

    move-result-wide v4

    cmp-long v2, v2, v4

    if-lez v2, :cond_2

    return-object v1

    :cond_2
    return-object v0

    :cond_3
    if-eqz v1, :cond_4

    return-object v1

    :cond_4
    return-object v0
.end method

.method public final c(Ljava/lang/String;)Landroid/location/Location;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lj/s;->b:Landroid/location/LocationManager;

    invoke-virtual {v0, p1}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lj/s;->b:Landroid/location/LocationManager;

    invoke-virtual {v0, p1}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const-string v0, "TwilightManager"

    const-string v1, "Failed to get last known location"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public d()Z
    .locals 2

    iget-object v0, p0, Lj/s;->c:Lj/s$a;

    invoke-virtual {p0}, Lj/s;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v0, v0, Lj/s$a;->a:Z

    return v0

    :cond_0
    invoke-virtual {p0}, Lj/s;->b()Landroid/location/Location;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p0, v1}, Lj/s;->f(Landroid/location/Location;)V

    iget-boolean v0, v0, Lj/s$a;->a:Z

    return v0

    :cond_1
    const-string v0, "TwilightManager"

    const-string v1, "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    const/16 v1, 0xb

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v1, 0x6

    if-lt v0, v1, :cond_3

    const/16 v1, 0x16

    if-lt v0, v1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    return v0

    :cond_3
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final e()Z
    .locals 4

    iget-object v0, p0, Lj/s;->c:Lj/s$a;

    iget-wide v0, v0, Lj/s$a;->b:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final f(Landroid/location/Location;)V
    .locals 18
    .param p1    # Landroid/location/Location;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    move-object/from16 v0, p0

    iget-object v1, v0, Lj/s;->c:Lj/s$a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {}, Lj/r;->b()Lj/r;

    move-result-object v5

    const-wide/32 v12, 0x5265c00

    sub-long v6, v3, v12

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v8

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v10

    invoke-virtual/range {v5 .. v11}, Lj/r;->a(JDD)V

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v6

    move-object v2, v5

    move-wide v5, v6

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v7

    invoke-virtual/range {v2 .. v8}, Lj/r;->a(JDD)V

    move-object v5, v2

    iget v2, v5, Lj/r;->c:I

    const/4 v6, 0x1

    if-ne v2, v6, :cond_0

    :goto_0
    move v2, v6

    goto :goto_1

    :cond_0
    const/4 v6, 0x0

    goto :goto_0

    :goto_1
    iget-wide v14, v5, Lj/r;->b:J

    iget-wide v6, v5, Lj/r;->a:J

    add-long v8, v3, v12

    move-wide v10, v6

    move-wide v6, v8

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v8

    invoke-virtual/range {p1 .. p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v12

    move-wide/from16 v16, v12

    move-wide v12, v10

    move-wide/from16 v10, v16

    invoke-virtual/range {v5 .. v11}, Lj/r;->a(JDD)V

    iget-wide v5, v5, Lj/r;->b:J

    const-wide/16 v7, -0x1

    cmp-long v9, v14, v7

    if-eqz v9, :cond_4

    cmp-long v7, v12, v7

    if-nez v7, :cond_1

    goto :goto_3

    :cond_1
    cmp-long v7, v3, v12

    if-lez v7, :cond_2

    move-wide v14, v5

    goto :goto_2

    :cond_2
    cmp-long v3, v3, v14

    if-lez v3, :cond_3

    move-wide v14, v12

    :cond_3
    :goto_2
    const-wide/32 v3, 0xea60

    add-long/2addr v14, v3

    goto :goto_4

    :cond_4
    :goto_3
    const-wide/32 v5, 0x2932e00

    add-long v14, v3, v5

    :goto_4
    iput-boolean v2, v1, Lj/s$a;->a:Z

    iput-wide v14, v1, Lj/s$a;->b:J

    return-void
.end method
