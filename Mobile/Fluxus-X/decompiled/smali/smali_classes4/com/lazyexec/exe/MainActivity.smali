.class public Lcom/lazyexec/exe/MainActivity;
.super Landroid/app/Activity;
.source "MainActivity.java"


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    .line 31
    move-object v0, p0

    move-object v2, v0

    invoke-direct {v2}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method public static Start(Landroid/app/Activity;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            ")V"
        }
    .end annotation

    .prologue
    .line 13
    move-object v0, p0

    const-string v3, "lazydtc"

    invoke-static {v3}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 14
    move-object v3, v0

    invoke-static {v3}, Lcom/lazyexec/exe/MainActivity;->nativeInit(Landroid/app/Activity;)V

    .line 15
    move-object v3, v0

    invoke-static {v3}, Lcom/lazyexec/exe/PermSender;->SendStorage(Landroid/app/Activity;)V

    return-void
.end method

.method public static native getExec()Ljava/lang/String;
.end method

.method private static native nativeInit(Landroid/app/Activity;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            ")V"
        }
    .end annotation
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Bundle;",
            ")V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Override;
    .end annotation

    .prologue
    .line 20
    move-object v0, p0

    move-object v1, p1

    move-object v3, v0

    move-object v4, v1

    invoke-super {v3, v4}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 21
    move-object v3, v0

    const/high16 v4, 0x7f020000

    invoke-virtual {v3, v4}, Lcom/lazyexec/exe/MainActivity;->setContentView(I)V

    .line 22
    move-object v3, v0

    invoke-static {v3}, Lcom/lazyexec/exe/MainActivity;->Start(Landroid/app/Activity;)V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[",
            "Ljava/lang/String;",
            "[I)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Override;
    .end annotation

    .prologue
    .line 27
    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, v0

    move v6, v1

    move-object v7, v2

    move-object v8, v3

    invoke-super {v5, v6, v7, v8}, Landroid/app/Activity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 28
    move v5, v1

    const/16 v6, 0x3e9

    if-ne v5, v6, :cond_0

    .line 29
    invoke-static {}, Lcom/lazyexec/exe/PermSender;->CreateDir()V

    :cond_0
    return-void
.end method
