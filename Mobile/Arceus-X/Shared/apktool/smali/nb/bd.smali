.class public final Lnb/bd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/bd;->a:Landroid/content/Context;

    return-void
.end method

.method public static final i(Landroid/content/Intent;)V
    .locals 2

    const-string v0, "FA"

    if-nez p0, :cond_0

    const-string p0, "onRebind called with null intent"

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "onRebind called. action: "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static final j(Landroid/content/Intent;)Z
    .locals 3

    const/4 v0, 0x1

    const-string v1, "FA"

    if-nez p0, :cond_0

    const-string p0, "onUnbind called with null intent"

    invoke-static {v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v0

    :cond_0
    invoke-virtual {p0}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v2, "onUnbind called for intent. action: "

    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return v0
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, Lnb/bd;->a:Landroid/content/Context;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FA"

    const-string v2, " is starting up."

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final b()V
    .locals 3

    iget-object v0, p0, Lnb/bd;->a:Landroid/content/Context;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "FA"

    const-string v2, " is shutting down."

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final c(Landroid/content/Intent;II)I
    .locals 6

    const/4 p2, 0x2

    if-nez p1, :cond_0

    const-string p1, "FA"

    const-string p3, "AppMeasurementService started with null intent"

    invoke-static {p1, p3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return p2

    :cond_0
    iget-object v0, p0, Lnb/bd;->a:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, Lnb/g7;->O(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzdd;Ljava/lang/Long;)Lnb/g7;

    move-result-object v1

    invoke-virtual {v1}, Lnb/g7;->a()Lnb/w5;

    move-result-object v2

    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lnb/g7;->c()Lnb/f;

    invoke-virtual {v2}, Lnb/w5;->w()Lnb/u5;

    move-result-object v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const-string v5, "Local AppMeasurementService called. startId, action"

    invoke-virtual {v1, v5, v4, v3}, Lnb/u5;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "com.google.android.gms.measurement.UPLOAD"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Lnb/ad;

    invoke-direct {v1, p0, p3, v2, p1}, Lnb/ad;-><init>(Lnb/bd;ILnb/w5;Landroid/content/Intent;)V

    invoke-static {v0}, Lnb/me;->F(Landroid/content/Context;)Lnb/me;

    move-result-object p1

    invoke-virtual {p0, p1, v1}, Lnb/bd;->k(Lnb/me;Ljava/lang/Runnable;)V

    :cond_1
    return p2
.end method

.method public final d(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 3

    const-string v0, "FA"

    const/4 v1, 0x0

    if-nez p1, :cond_0

    const-string p1, "onBind called with null intent"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1

    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const-string v2, "com.google.android.gms.measurement.START"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object p1, p0, Lnb/bd;->a:Landroid/content/Context;

    new-instance v0, Lnb/i8;

    invoke-static {p1}, Lnb/me;->F(Landroid/content/Context;)Lnb/me;

    move-result-object p1

    invoke-direct {v0, p1, v1}, Lnb/i8;-><init>(Lnb/me;Ljava/lang/String;)V

    return-object v0

    :cond_1
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "onBind received unknown action: "

    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-object v1
.end method

.method public final e(Landroid/app/job/JobParameters;)Z
    .locals 6
    .annotation build Landroid/annotation/TargetApi;
        value = 0x18
    .end annotation

    invoke-virtual {p1}, Landroid/app/job/JobParameters;->getExtras()Landroid/os/PersistableBundle;

    move-result-object v0

    const-string v1, "action"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "FA"

    const-string v3, "onStartJob received action: "

    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    const-string v1, "com.google.android.gms.measurement.UPLOAD"

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lnb/bd;->a:Landroid/content/Context;

    invoke-static {v2}, Lnb/me;->F(Landroid/content/Context;)Lnb/me;

    move-result-object v2

    invoke-virtual {v2}, Lnb/me;->a()Lnb/w5;

    move-result-object v3

    invoke-virtual {v2}, Lnb/me;->c()Lnb/f;

    invoke-virtual {v3}, Lnb/w5;->w()Lnb/u5;

    move-result-object v4

    const-string v5, "Local AppMeasurementJobService called. action"

    invoke-virtual {v4, v5, v1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v1, Lnb/yc;

    invoke-direct {v1, p0, v3, p1}, Lnb/yc;-><init>(Lnb/bd;Lnb/w5;Landroid/app/job/JobParameters;)V

    invoke-virtual {p0, v2, v1}, Lnb/bd;->k(Lnb/me;Ljava/lang/Runnable;)V

    :cond_0
    const-string v1, "com.google.android.gms.measurement.SCION_UPLOAD"

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v0, p0, Lnb/bd;->a:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/measurement/v3;->r(Landroid/content/Context;Landroid/os/Bundle;)Lcom/google/android/gms/internal/measurement/v3;

    move-result-object v0

    new-instance v1, Lnb/zc;

    invoke-direct {v1, p0, p1}, Lnb/zc;-><init>(Lnb/bd;Landroid/app/job/JobParameters;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/measurement/v3;->G(Ljava/lang/Runnable;)V

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final synthetic f(ILnb/w5;Landroid/content/Intent;)V
    .locals 3

    iget-object v0, p0, Lnb/bd;->a:Landroid/content/Context;

    move-object v1, v0

    check-cast v1, Lnb/xc;

    invoke-interface {v1, p1}, Lnb/xc;->a(I)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p2}, Lnb/w5;->w()Lnb/u5;

    move-result-object p2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string v2, "Local AppMeasurementService processed last upload request. StartId"

    invoke-virtual {p2, v2, p1}, Lnb/u5;->b(Ljava/lang/String;Ljava/lang/Object;)V

    const/4 p1, 0x0

    invoke-static {v0, p1, p1}, Lnb/g7;->O(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzdd;Ljava/lang/Long;)Lnb/g7;

    move-result-object p1

    invoke-virtual {p1}, Lnb/g7;->a()Lnb/w5;

    move-result-object p1

    invoke-virtual {p1}, Lnb/w5;->w()Lnb/u5;

    move-result-object p1

    const-string p2, "Completed wakeful intent."

    invoke-virtual {p1, p2}, Lnb/u5;->a(Ljava/lang/String;)V

    invoke-interface {v1, p3}, Lnb/xc;->g(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method public final synthetic g(Lnb/w5;Landroid/app/job/JobParameters;)V
    .locals 1

    invoke-virtual {p1}, Lnb/w5;->w()Lnb/u5;

    move-result-object p1

    const-string v0, "AppMeasurementJobService processed last upload request."

    invoke-virtual {p1, v0}, Lnb/u5;->a(Ljava/lang/String;)V

    iget-object p1, p0, Lnb/bd;->a:Landroid/content/Context;

    check-cast p1, Lnb/xc;

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lnb/xc;->b(Landroid/app/job/JobParameters;Z)V

    return-void
.end method

.method public final synthetic h(Landroid/app/job/JobParameters;)V
    .locals 2

    const-string v0, "FA"

    const-string v1, "[sgtm] AppMeasurementJobService processed last Scion upload request."

    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lnb/bd;->a:Landroid/content/Context;

    check-cast v0, Lnb/xc;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lnb/xc;->b(Landroid/app/job/JobParameters;Z)V

    return-void
.end method

.method public final k(Lnb/me;Ljava/lang/Runnable;)V
    .locals 2

    invoke-virtual {p1}, Lnb/me;->b()Lnb/c7;

    move-result-object v0

    new-instance v1, Lnb/wc;

    invoke-direct {v1, p0, p1, p2}, Lnb/wc;-><init>(Lnb/bd;Lnb/me;Ljava/lang/Runnable;)V

    invoke-virtual {v0, v1}, Lnb/c7;->t(Ljava/lang/Runnable;)V

    return-void
.end method
