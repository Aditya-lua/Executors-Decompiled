.class public final Lyd/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "RestrictedApi"
    }
.end annotation


# static fields
.field public static final c:Lzd/i;


# instance fields
.field public a:Lzd/t;

.field public final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lzd/i;

    const-string v1, "ReviewService"

    invoke-direct {v0, v1}, Lzd/i;-><init>(Ljava/lang/String;)V

    sput-object v0, Lyd/m;->c:Lzd/i;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lyd/m;->b:Ljava/lang/String;

    invoke-static {p1}, Lzd/w;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "com.android.vending"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v6

    new-instance v2, Lzd/t;

    sget-object v4, Lyd/m;->c:Lzd/i;

    new-instance v7, Lyd/i;

    invoke-direct {v7}, Lyd/i;-><init>()V

    const-string v5, "com.google.android.finsky.inappreviewservice.InAppReviewService"

    const/4 v8, 0x0

    move-object v3, p1

    invoke-direct/range {v2 .. v8}, Lzd/t;-><init>(Landroid/content/Context;Lzd/i;Ljava/lang/String;Landroid/content/Intent;Lyd/i;Lzd/o;)V

    iput-object v2, p0, Lyd/m;->a:Lzd/t;

    :cond_0
    return-void
.end method

.method public static bridge synthetic b()Lzd/i;
    .locals 1

    sget-object v0, Lyd/m;->c:Lzd/i;

    return-object v0
.end method

.method public static bridge synthetic c(Lyd/m;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lyd/m;->b:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/tasks/Task;
    .locals 3

    iget-object v0, p0, Lyd/m;->b:Ljava/lang/String;

    sget-object v1, Lyd/m;->c:Lzd/i;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v2, "requestInAppReview (%s)"

    invoke-virtual {v1, v2, v0}, Lzd/i;->c(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Lyd/m;->a:Lzd/t;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v2, "Play Store app is either not installed or not the official version"

    invoke-virtual {v1, v2, v0}, Lzd/i;->a(Ljava/lang/String;[Ljava/lang/Object;)I

    new-instance v0, Lyd/a;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Lyd/a;-><init>(I)V

    invoke-static {v0}, Ltb/m;->e(Ljava/lang/Exception;)Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ltb/k;

    invoke-direct {v0}, Ltb/k;-><init>()V

    iget-object v1, p0, Lyd/m;->a:Lzd/t;

    new-instance v2, Lyd/j;

    invoke-direct {v2, p0, v0, v0}, Lyd/j;-><init>(Lyd/m;Ltb/k;Ltb/k;)V

    invoke-virtual {v1, v2, v0}, Lzd/t;->s(Lzd/j;Ltb/k;)V

    invoke-virtual {v0}, Ltb/k;->a()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    return-object v0
.end method
