.class public Lcom/roblox/client/fcm/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljj/s;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lmj/h0;
    .locals 1

    sget-object v0, Lmj/h0;->b:Lmj/h0;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    const-string v0, "GcmPlatform"

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    const-string v0, "GcmToken"

    return-object v0
.end method

.method public d(Landroid/content/Context;Z)V
    .locals 1

    invoke-virtual {p0, p1}, Lcom/roblox/client/fcm/a;->e(Landroid/content/Context;)Z

    move-result v0

    invoke-virtual {p0, p1, p2, v0}, Lcom/roblox/client/fcm/a;->f(Landroid/content/Context;ZZ)V

    return-void
.end method

.method public e(Landroid/content/Context;)Z
    .locals 0

    invoke-static {p1}, Lgk/t;->b(Landroid/content/Context;)Z

    move-result p1

    return p1
.end method

.method public f(Landroid/content/Context;ZZ)V
    .locals 1

    if-eqz p3, :cond_0

    sget p3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x21

    if-lt p3, v0, :cond_0

    invoke-static {p1}, Lk2/n;->e(Landroid/content/Context;)Lk2/n;

    move-result-object p3

    invoke-virtual {p3}, Lk2/n;->a()Z

    move-result p3

    if-nez p3, :cond_0

    const-string p1, "rbx.push"

    const-string p2, "New token but notifications disabled. Not registering."

    invoke-static {p1, p2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    sget-object p3, Lcom/roblox/client/fcm/FCMRegistrationWorker;->a:Lcom/roblox/client/fcm/FCMRegistrationWorker$a;

    invoke-virtual {p3, p1, p2}, Lcom/roblox/client/fcm/FCMRegistrationWorker$a;->b(Landroid/content/Context;Z)V

    return-void
.end method
