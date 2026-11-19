.class public Lcom/lazyexec/exe/PermSender;
.super Ljava/lang/Object;
.source "PermSender.java"


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    .line 58
    move-object v0, p0

    move-object v2, v0

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static CreateDir()V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 47
    new-instance v4, Ljava/io/File;

    move-object v8, v4

    move-object v4, v8

    move-object v5, v8

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v6

    invoke-static {}, Lcom/lazyexec/exe/PermSender;->getDir()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v5, v6, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v1, v4

    .line 49
    move-object v4, v1

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v4

    if-nez v4, :cond_0

    .line 50
    move-object v4, v1

    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    move-result v4

    .line 53
    :cond_0
    new-instance v4, Ljava/io/File;

    move-object v8, v4

    move-object v4, v8

    move-object v5, v8

    move-object v6, v1

    const-string v7, "Workspace"

    invoke-direct {v5, v6, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v2, v4

    .line 55
    move-object v4, v2

    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v4

    if-nez v4, :cond_1

    .line 56
    move-object v4, v2

    invoke-virtual {v4}, Ljava/io/File;->mkdirs()Z

    move-result v4

    :cond_1
    return-void
.end method

.method public static SendStorage(Landroid/app/Activity;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            ")V"
        }
    .end annotation

    .prologue
    .line 21
    move-object v0, p0

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1e

    if-lt v5, v6, :cond_1

    .line 22
    invoke-static {}, Landroid/os/Environment;->isExternalStorageManager()Z

    move-result v5

    if-nez v5, :cond_0

    .line 23
    new-instance v5, Landroid/content/Intent;

    move-object v10, v5

    move-object v5, v10

    move-object v6, v10

    const-string v7, "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION"

    invoke-direct {v6, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    move-object v2, v5

    .line 24
    move-object v5, v2

    new-instance v6, Ljava/lang/StringBuffer;

    move-object v10, v6

    move-object v6, v10

    move-object v7, v10

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    const-string v7, "package:"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v6

    move-object v7, v0

    invoke-virtual {v7}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object v5

    .line 25
    move-object v5, v2

    const/high16 v6, 0x10000000

    invoke-virtual {v5, v6}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    move-result-object v5

    .line 26
    move-object v5, v0

    move-object v6, v2

    invoke-virtual {v5, v6}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 41
    :goto_0
    return-void

    .line 28
    :cond_0
    invoke-static {}, Lcom/lazyexec/exe/PermSender;->CreateDir()V

    goto :goto_0

    .line 31
    :cond_1
    move-object v5, v0

    const-string v6, "android.permission.READ_EXTERNAL_STORAGE"

    invoke-virtual {v5, v6}, Landroid/app/Activity;->checkSelfPermission(Ljava/lang/String;)I

    move-result v5

    move v2, v5

    .line 32
    move-object v5, v0

    const-string v6, "android.permission.WRITE_EXTERNAL_STORAGE"

    invoke-virtual {v5, v6}, Landroid/app/Activity;->checkSelfPermission(Ljava/lang/String;)I

    move-result v5

    move v3, v5

    .line 34
    move v5, v2

    const/4 v6, 0x0

    if-ne v5, v6, :cond_2

    move v5, v3

    const/4 v6, 0x0

    if-eq v5, v6, :cond_3

    .line 36
    :cond_2
    move-object v5, v0

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/String;

    move-object v10, v6

    move-object v6, v10

    move-object v7, v10

    const/4 v8, 0x0

    const-string v9, "android.permission.READ_EXTERNAL_STORAGE"

    aput-object v9, v7, v8

    move-object v10, v6

    move-object v6, v10

    move-object v7, v10

    const/4 v8, 0x1

    const-string v9, "android.permission.WRITE_EXTERNAL_STORAGE"

    aput-object v9, v7, v8

    const/16 v7, 0x3e9

    invoke-virtual {v5, v6, v7}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    goto :goto_0

    .line 41
    :cond_3
    invoke-static {}, Lcom/lazyexec/exe/PermSender;->CreateDir()V

    goto :goto_0
.end method

.method private static getDir()Ljava/lang/String;
    .locals 3

    .prologue
    .line 17
    invoke-static {}, Lcom/lazyexec/exe/MainActivity;->getExec()Ljava/lang/String;

    move-result-object v2

    move-object v0, v2

    return-object v0
.end method
