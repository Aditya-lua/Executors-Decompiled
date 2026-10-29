.class public final Lcom/android/billingclient/api/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/billingclient/api/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public volatile a:Lv7/i;

.field public final b:Landroid/content/Context;

.field public volatile c:Lv7/m;

.field public volatile d:Z

.field public volatile e:Z

.field public volatile f:Z

.field public volatile g:Z

.field public volatile h:Z

.field public volatile i:Z

.field public volatile j:Z


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lv7/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/android/billingclient/api/a$a;->b:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a()Lcom/android/billingclient/api/a;
    .locals 9
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v3, p0, Lcom/android/billingclient/api/a$a;->b:Landroid/content/Context;

    if-eqz v3, :cond_9

    iget-object v0, p0, Lcom/android/billingclient/api/a$a;->c:Lv7/m;

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lcom/android/billingclient/api/a$a;->i:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lcom/android/billingclient/api/a$a;->d:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/android/billingclient/api/a$a;->e:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/android/billingclient/api/a$a;->f:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/android/billingclient/api/a$a;->g:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/android/billingclient/api/a$a;->h:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Please provide a valid listener for purchases updates."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/android/billingclient/api/a$a;->d()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Lcom/android/billingclient/api/g;

    move-object v2, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lcom/android/billingclient/api/g;-><init>(Ljava/lang/String;Landroid/content/Context;Lv7/i1;Ljava/util/concurrent/ExecutorService;Lcom/android/billingclient/api/a$a;)V

    return-object v0

    :cond_2
    new-instance v0, Lcom/android/billingclient/api/b;

    move-object v2, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x0

    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lcom/android/billingclient/api/b;-><init>(Ljava/lang/String;Landroid/content/Context;Lv7/i1;Ljava/util/concurrent/ExecutorService;Lcom/android/billingclient/api/a$a;)V

    return-object v0

    :cond_3
    move-object v5, p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Please provide a valid listener for Google Play Billing purchases updates when enabling User Choice Billing or Side by side Billing."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    move-object v5, p0

    iget-object v0, v5, Lcom/android/billingclient/api/a$a;->a:Lv7/i;

    if-eqz v0, :cond_8

    iget-object v0, v5, Lcom/android/billingclient/api/a$a;->a:Lv7/i;

    invoke-virtual {v0}, Lv7/i;->a()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object v0, v5, Lcom/android/billingclient/api/a$a;->c:Lv7/m;

    if-eqz v0, :cond_6

    iget-object v2, v5, Lcom/android/billingclient/api/a$a;->a:Lv7/i;

    iget-object v4, v5, Lcom/android/billingclient/api/a$a;->c:Lv7/m;

    invoke-virtual {p0}, Lcom/android/billingclient/api/a$a;->d()Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Lcom/android/billingclient/api/g;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v5, 0x0

    move-object v8, p0

    invoke-direct/range {v0 .. v8}, Lcom/android/billingclient/api/g;-><init>(Ljava/lang/String;Lv7/i;Landroid/content/Context;Lv7/m;Lv7/c0;Lv7/i1;Ljava/util/concurrent/ExecutorService;Lcom/android/billingclient/api/a$a;)V

    return-object v0

    :cond_5
    new-instance v0, Lcom/android/billingclient/api/b;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v5, 0x0

    move-object v8, p0

    invoke-direct/range {v0 .. v8}, Lcom/android/billingclient/api/b;-><init>(Ljava/lang/String;Lv7/i;Landroid/content/Context;Lv7/m;Lv7/c0;Lv7/i1;Ljava/util/concurrent/ExecutorService;Lcom/android/billingclient/api/a$a;)V

    move-object v5, v8

    return-object v0

    :cond_6
    iget-object v2, v5, Lcom/android/billingclient/api/a$a;->a:Lv7/i;

    invoke-virtual {p0}, Lcom/android/billingclient/api/a$a;->d()Z

    move-result v0

    if-eqz v0, :cond_7

    new-instance v0, Lcom/android/billingclient/api/g;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v4, 0x0

    move-object v7, p0

    invoke-direct/range {v0 .. v7}, Lcom/android/billingclient/api/g;-><init>(Ljava/lang/String;Lv7/i;Landroid/content/Context;Lv7/p1;Lv7/i1;Ljava/util/concurrent/ExecutorService;Lcom/android/billingclient/api/a$a;)V

    return-object v0

    :cond_7
    new-instance v0, Lcom/android/billingclient/api/b;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v4, 0x0

    move-object v7, p0

    invoke-direct/range {v0 .. v7}, Lcom/android/billingclient/api/b;-><init>(Ljava/lang/String;Lv7/i;Landroid/content/Context;Lv7/p1;Lv7/i1;Ljava/util/concurrent/ExecutorService;Lcom/android/billingclient/api/a$a;)V

    return-object v0

    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Pending purchases for one-time products must be supported."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Please provide a valid Context."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(Lv7/i;)Lcom/android/billingclient/api/a$a;
    .locals 0
    .param p1    # Lv7/i;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lcom/android/billingclient/api/a$a;->a:Lv7/i;

    return-object p0
.end method

.method public c(Lv7/m;)Lcom/android/billingclient/api/a$a;
    .locals 0
    .param p1    # Lv7/m;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iput-object p1, p0, Lcom/android/billingclient/api/a$a;->c:Lv7/m;

    return-object p0
.end method

.method public final d()Z
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/android/billingclient/api/a$a;->b:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/16 v3, 0x80

    invoke-virtual {v2, v1, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v2, "com.google.android.play.billingclient.enableBillingOverridesTesting"

    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v1

    const-string v2, "BillingClient"

    const-string v3, "Unable to retrieve metadata value for enableBillingOverridesTesting."

    invoke-static {v2, v3, v1}, Lcom/google/android/gms/internal/play_billing/m0;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return v0
.end method
