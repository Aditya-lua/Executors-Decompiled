.class public final Lwd/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "RestrictedApi"
    }
.end annotation


# static fields
.field public static final c:Lxd/i;


# instance fields
.field public a:Lxd/t;

.field public final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxd/i;

    const-string v1, "ReviewService"

    invoke-direct {v0, v1}, Lxd/i;-><init>(Ljava/lang/String;)V

    sput-object v0, Lwd/g;->c:Lxd/i;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lwd/g;->b:Ljava/lang/String;

    invoke-static {p1}, Lxd/w;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "com.android.vending"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v6

    new-instance v2, Lxd/t;

    sget-object v4, Lwd/g;->c:Lxd/i;

    new-instance v7, Lwd/d;

    invoke-direct {v7}, Lwd/d;-><init>()V

    const-string v5, "com.google.android.finsky.inappreviewservice.InAppReviewService"

    const/4 v8, 0x0

    move-object v3, p1

    invoke-direct/range {v2 .. v8}, Lxd/t;-><init>(Landroid/content/Context;Lxd/i;Ljava/lang/String;Landroid/content/Intent;Lwd/d;Lxd/o;)V

    iput-object v2, p0, Lwd/g;->a:Lxd/t;

    :cond_0
    return-void
.end method

.method public static bridge synthetic b()Lxd/i;
    .locals 1

    sget-object v0, Lwd/g;->c:Lxd/i;

    return-object v0
.end method

.method public static bridge synthetic c(Lwd/g;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lwd/g;->b:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/tasks/Task;
    .locals 3

    iget-object v0, p0, Lwd/g;->b:Ljava/lang/String;

    sget-object v1, Lwd/g;->c:Lxd/i;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v2, "requestInAppReview (%s)"

    invoke-virtual {v1, v2, v0}, Lxd/i;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Lwd/g;->a:Lxd/t;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v2, "Play Store app is either not installed or not the official version"

    invoke-virtual {v1, v2, v0}, Lxd/i;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    new-instance v0, Lwd/a;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Lwd/a;-><init>(I)V

    invoke-static {v0}, Lsb/m;->e(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lsb/k;

    invoke-direct {v0}, Lsb/k;-><init>()V

    iget-object v1, p0, Lwd/g;->a:Lxd/t;

    new-instance v2, Lwd/e;

    invoke-direct {v2, p0, v0, v0}, Lwd/e;-><init>(Lwd/g;Lsb/k;Lsb/k;)V

    invoke-virtual {v1, v2, v0}, Lxd/t;->s(Lxd/j;Lsb/k;)V

    invoke-virtual {v0}, Lsb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
