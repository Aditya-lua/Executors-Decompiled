.class public final Lcom/appsflyer/internal/AFb1uSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static g_(Landroid/content/Intent;)Landroid/net/Uri;
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Lcom/appsflyer/internal/AFj1sSDK;

    invoke-direct {v1, p0}, Lcom/appsflyer/internal/AFj1sSDK;-><init>(Landroid/content/Intent;)V

    const-string p0, "android.intent.extra.REFERRER"

    invoke-virtual {v1, p0}, Lcom/appsflyer/internal/AFj1sSDK;->S_(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p0

    check-cast p0, Landroid/net/Uri;

    if-eqz p0, :cond_1

    return-object p0

    :cond_1
    const-string p0, "android.intent.extra.REFERRER_NAME"

    invoke-virtual {v1, p0}, Lcom/appsflyer/internal/AFj1sSDK;->registerClient(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    return-object p0

    :cond_2
    return-object v0
.end method
