.class public final Lnb/xa;
.super Lnb/b5;
.source "SourceFile"


# instance fields
.field public c:Landroid/app/job/JobScheduler;


# direct methods
.method public constructor <init>(Lnb/g7;)V
    .locals 0

    invoke-direct {p0, p1}, Lnb/b5;-><init>(Lnb/g7;)V

    return-void
.end method


# virtual methods
.method public final m()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final n()V
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x18
    .end annotation

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v0

    const-string v1, "jobscheduler"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/job/JobScheduler;

    iput-object v0, p0, Lnb/xa;->c:Landroid/app/job/JobScheduler;

    return-void
.end method

.method public final o(J)V
    .locals 7
    .annotation build Landroid/annotation/TargetApi;
        value = 0x18
    .end annotation

    invoke-virtual {p0}, Lnb/b5;->j()V

    invoke-virtual {p0}, Lnb/j8;->h()V

    iget-object v0, p0, Lnb/xa;->c:Landroid/app/job/JobScheduler;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lnb/xa;->p()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/app/job/JobScheduler;->getPendingJob(I)Landroid/app/job/JobInfo;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->w()Lnb/u5;

    move-result-object p1

    const-string p2, "[sgtm] There\'s an existing pending job, skip this schedule."

    invoke-virtual {p1, p2}, Lnb/u5;->a(Ljava/lang/String;)V

    return-void

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lnb/xa;->q()Lcom/google/android/gms/internal/measurement/k7;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/measurement/k7;->c:Lcom/google/android/gms/internal/measurement/k7;

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object v1

    invoke-virtual {v1}, Lnb/w5;->w()Lnb/u5;

    move-result-object v1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v3, "[sgtm] Scheduling Scion upload, millis"

    invoke-virtual {v1, v3, v2}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v1, Landroid/os/PersistableBundle;

    invoke-direct {v1}, Landroid/os/PersistableBundle;-><init>()V

    const-string v2, "action"

    const-string v3, "com.google.android.gms.measurement.SCION_UPLOAD"

    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Landroid/app/job/JobInfo$Builder;

    invoke-virtual {p0}, Lnb/xa;->p()I

    move-result v3

    new-instance v4, Landroid/content/ComponentName;

    invoke-virtual {v0}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v5

    const-string v6, "com.google.android.gms.measurement.AppMeasurementJobService"

    invoke-direct {v4, v5, v6}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-direct {v2, v3, v4}, Landroid/app/job/JobInfo$Builder;-><init>(ILandroid/content/ComponentName;)V

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/app/job/JobInfo$Builder;->setRequiredNetworkType(I)Landroid/app/job/JobInfo$Builder;

    move-result-object v2

    invoke-virtual {v2, p1, p2}, Landroid/app/job/JobInfo$Builder;->setMinimumLatency(J)Landroid/app/job/JobInfo$Builder;

    move-result-object v2

    add-long/2addr p1, p1

    invoke-virtual {v2, p1, p2}, Landroid/app/job/JobInfo$Builder;->setOverrideDeadline(J)Landroid/app/job/JobInfo$Builder;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/app/job/JobInfo$Builder;->setExtras(Landroid/os/PersistableBundle;)Landroid/app/job/JobInfo$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/job/JobInfo$Builder;->build()Landroid/app/job/JobInfo;

    move-result-object p1

    iget-object p2, p0, Lnb/xa;->c:Landroid/app/job/JobScheduler;

    invoke-static {p2}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/app/job/JobScheduler;

    invoke-virtual {p2, p1}, Landroid/app/job/JobScheduler;->schedule(Landroid/app/job/JobInfo;)I

    move-result p1

    invoke-virtual {v0}, Lnb/g7;->a()Lnb/w5;

    move-result-object p2

    invoke-virtual {p2}, Lnb/w5;->w()Lnb/u5;

    move-result-object p2

    if-ne p1, v3, :cond_2

    const-string p1, "SUCCESS"

    goto :goto_1

    :cond_2
    const-string p1, "FAILURE"

    :goto_1
    const-string v0, "[sgtm] Scion upload job scheduled with result"

    invoke-virtual {p2, v0, p1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_3
    iget-object p1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {p1}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->w()Lnb/u5;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    const-string v0, "[sgtm] Not eligible for Scion upload"

    invoke-virtual {p1, v0, p2}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final p()I
    .locals 2

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "measurement-client"

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final q()Lcom/google/android/gms/internal/measurement/k7;
    .locals 6

    invoke-virtual {p0}, Lnb/b5;->j()V

    invoke-virtual {p0}, Lnb/j8;->h()V

    iget-object v0, p0, Lnb/xa;->c:Landroid/app/job/JobScheduler;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v0}, Lnb/g7;->w()Lnb/k;

    move-result-object v1

    invoke-virtual {v1}, Lnb/k;->P()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lnb/j8;->a:Lnb/g7;

    invoke-virtual {v1}, Lnb/g7;->L()Lnb/k5;

    move-result-object v2

    invoke-virtual {v2}, Lnb/k5;->u()J

    move-result-wide v2

    const-wide/32 v4, 0x1d0d8

    cmp-long v2, v2, v4

    if-ltz v2, :cond_2

    invoke-virtual {v0}, Lnb/g7;->d()Landroid/content/Context;

    move-result-object v0

    const-string v2, "com.google.android.gms.measurement.AppMeasurementJobService"

    invoke-static {v0, v2}, Lnb/ve;->F(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/measurement/k7;->d:Lcom/google/android/gms/internal/measurement/k7;

    return-object v0

    :cond_0
    invoke-virtual {v1}, Lnb/g7;->J()Lnb/tc;

    move-result-object v0

    invoke-virtual {v0}, Lnb/tc;->y()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/measurement/k7;->f:Lcom/google/android/gms/internal/measurement/k7;

    return-object v0

    :cond_1
    sget-object v0, Lcom/google/android/gms/internal/measurement/k7;->c:Lcom/google/android/gms/internal/measurement/k7;

    return-object v0

    :cond_2
    sget-object v0, Lcom/google/android/gms/internal/measurement/k7;->g:Lcom/google/android/gms/internal/measurement/k7;

    return-object v0

    :cond_3
    sget-object v0, Lcom/google/android/gms/internal/measurement/k7;->i:Lcom/google/android/gms/internal/measurement/k7;

    return-object v0

    :cond_4
    sget-object v0, Lcom/google/android/gms/internal/measurement/k7;->h:Lcom/google/android/gms/internal/measurement/k7;

    return-object v0
.end method
