.class public Lcom/axjava/MainActivity;
.super Landroid/app/Activity;
.source "MainActivity.java"


# instance fields
.field public GameActivity:Ljava/lang/String;

.field public hasLaunched:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 11
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    .line 13
    const-string v0, "com.roblox.client.startup.ActivitySplash"

    iput-object v0, p0, Lcom/axjava/MainActivity;->GameActivity:Ljava/lang/String;

    .line 14
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/axjava/MainActivity;->hasLaunched:Z

    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 4
    .param p1, "savedInstanceState"    # Landroid/os/Bundle;

    .prologue
    const/4 v3, 0x1

    .line 20
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 22
    iget-boolean v1, p0, Lcom/axjava/MainActivity;->hasLaunched:Z

    if-nez v1, :cond_0

    .line 24
    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lcom/axjava/MainActivity;->hasLaunched:Z

    .line 26
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/axjava/MainActivity;->GameActivity:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v1}, Lcom/axjava/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 27
    invoke-static {p0}, Lcom/axjava/Main;->Start(Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    :cond_0
    :goto_0
    return-void

    .line 29
    :catch_0
    move-exception v0

    .line 30
    .local v0, "e":Ljava/lang/ClassNotFoundException;
    const-string v1, "Failed to find Roblox\'s MainActivity."

    invoke-static {p0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method
