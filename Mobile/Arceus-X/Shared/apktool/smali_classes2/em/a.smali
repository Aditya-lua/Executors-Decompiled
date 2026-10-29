.class public Lem/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lem/a$g;,
        Lem/a$f;
    }
.end annotation


# instance fields
.field public a:Lcom/roblox/universalapp/messagebus/MessageBus;

.field public b:Lcom/roblox/universalapp/messagebus/Connection;

.field public c:Lcom/roblox/universalapp/messagebus/Connection;

.field public d:Lcom/roblox/universalapp/messagebus/Connection;

.field public e:Lcom/roblox/universalapp/messagebus/Connection;

.field public f:Lcom/roblox/universalapp/messagebus/Connection;

.field public g:Z

.field public h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/roblox/universalapp/messagebus/MessageBus;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lem/a;->b:Lcom/roblox/universalapp/messagebus/Connection;

    iput-object v0, p0, Lem/a;->c:Lcom/roblox/universalapp/messagebus/Connection;

    iput-object v0, p0, Lem/a;->d:Lcom/roblox/universalapp/messagebus/Connection;

    iput-object v0, p0, Lem/a;->e:Lcom/roblox/universalapp/messagebus/Connection;

    iput-object v0, p0, Lem/a;->f:Lcom/roblox/universalapp/messagebus/Connection;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lem/a;->g:Z

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/roblox/universalapp/messagebus/MessageBus;->f()Lcom/roblox/universalapp/messagebus/MessageBus;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lem/a;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    return-void
.end method

.method public static bridge synthetic a(Lem/a;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lem/a;->h:Ljava/lang/String;

    return-void
.end method

.method public static b(Lj/b;Ljava/lang/String;)Landroid/net/Uri;
    .locals 3

    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".fileprovider"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {p0, v0, v1}, Landroidx/core/content/FileProvider;->getUriForFile(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;)Landroid/net/Uri;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "File outside declared FileProvider paths, falling back: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "ContentSharingProtocol"

    invoke-static {v2, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-static {p0, p1}, Lem/a;->c(Lj/b;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method

.method public static c(Lj/b;Ljava/lang/String;)Landroid/net/Uri;
    .locals 2

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, v0

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p0

    goto :goto_1

    :cond_2
    const-string p0, ""

    :goto_1
    const-string v0, "/"

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :cond_3
    const-string v0, "content://"

    invoke-virtual {p1, p0, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    return-object p0
.end method

.method public static d(I)I
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    const/high16 v0, 0x2000000

    or-int/2addr p0, v0

    :cond_0
    return p0
.end method

.method public static f(Lj/b;Landroid/content/Intent;Landroid/content/Intent;I)V
    .locals 2

    const/high16 v0, 0x8000000

    invoke-static {v0}, Lem/a;->d(I)I

    move-result v0

    const/4 v1, 0x0

    invoke-static {p0, v1, p2, v0}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object p2

    invoke-static {p1, v0, p2}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;Landroid/content/IntentSender;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0, p1, p3}, Le/p;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method public static g(Lj/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;ILem/a$g;)V
    .locals 1

    if-eqz p7, :cond_0

    invoke-interface {p7, p4, p3}, Lem/a$g;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p4

    invoke-interface {p4}, Lth/i;->l()Z

    move-result p4

    if-eqz p4, :cond_1

    invoke-static {p0, p1}, Lem/a;->b(Lj/b;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {p0, p1}, Lem/a;->c(Lj/b;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    :goto_0
    new-instance p7, Landroid/content/Intent;

    const-string v0, "android.intent.action.SEND"

    invoke-direct {p7, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p7, p1, p2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    const-string p2, "android.intent.extra.STREAM"

    invoke-virtual {p7, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const/4 p2, 0x1

    invoke-virtual {p7, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_2

    const-string p2, "android.intent.extra.TEXT"

    invoke-virtual {p7, p2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    if-eqz p4, :cond_2

    const-string p2, "content"

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p2

    const-string p3, "shared"

    invoke-static {p2, p3, p1}, Landroid/content/ClipData;->newUri(Landroid/content/ContentResolver;Ljava/lang/CharSequence;Landroid/net/Uri;)Landroid/content/ClipData;

    move-result-object p1

    invoke-virtual {p7, p1}, Landroid/content/Intent;->setClipData(Landroid/content/ClipData;)V

    :cond_2
    invoke-static {p0, p7, p5, p6}, Lem/a;->f(Lj/b;Landroid/content/Intent;Landroid/content/Intent;I)V

    return-void
.end method

.method public static h(Lj/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;ILem/a$g;)V
    .locals 8

    const-string v2, "image/*"

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    move-object v7, p6

    invoke-static/range {v0 .. v7}, Lem/a;->g(Lj/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;ILem/a$g;)V

    return-void
.end method

.method public static i(Lj/b;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;ILem/a$g;)V
    .locals 1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-eqz p5, :cond_1

    const-string v0, ""

    invoke-interface {p5, p2, v0}, Lem/a$g;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    new-instance p2, Landroid/content/Intent;

    const-string p5, "android.intent.action.SEND"

    invoke-direct {p2, p5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string p5, "text/plain"

    invoke-virtual {p2, p5}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string p5, "android.intent.extra.TEXT"

    invoke-virtual {p2, p5, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-static {p0, p2, p3, p4}, Lem/a;->f(Lj/b;Landroid/content/Intent;Landroid/content/Intent;I)V

    return-void
.end method

.method public static j(Lj/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;ILem/a$g;)V
    .locals 8

    const-string v2, "video/*"

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    move-object v7, p6

    invoke-static/range {v0 .. v7}, Lem/a;->g(Lj/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;ILem/a$g;)V

    return-void
.end method

.method public static k()Lem/a;
    .locals 1

    invoke-static {}, Lem/a$f;->a()Lem/a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public e(Landroid/content/Intent;)V
    .locals 4

    const-string p1, "ContentSharingProtocol"

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->a3()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_3

    :cond_0
    iget-object v0, p0, Lem/a;->h:Ljava/lang/String;

    if-eqz v0, :cond_2

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lem/a;->h:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Deleted video file: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, " \u2014 "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lem/a;->h:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Video file not found: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lem/a;->h:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    iput-object v1, p0, Lem/a;->h:Ljava/lang/String;

    return-void

    :goto_1
    :try_start_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Error while deleting video file: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lem/a;->h:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iput-object v1, p0, Lem/a;->h:Ljava/lang/String;

    return-void

    :goto_2
    iput-object v1, p0, Lem/a;->h:Ljava/lang/String;

    throw p1

    :cond_2
    :goto_3
    return-void
.end method

.method public declared-synchronized l(Lj/b;Landroid/content/Intent;ILem/a$g;)V
    .locals 9

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lem/a;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    if-eqz v0, :cond_0

    :try_start_1
    const-string p1, "ContentSharingProtocol"

    const-string p2, "Attempted to set ExternalContentSharingProtocol callback, but one is already set."

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    move-object v4, p0

    goto/16 :goto_1

    :cond_0
    const/4 v0, 0x1

    :try_start_2
    iput-boolean v0, p0, Lem/a;->g:Z

    iget-object v0, p0, Lem/a;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    invoke-static {}, Lnm/c;->b()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lem/a$a;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move v6, p3

    move-object v7, p4

    :try_start_3
    invoke-direct/range {v2 .. v7}, Lem/a$a;-><init>(Lem/a;Lj/b;Landroid/content/Intent;ILem/a$g;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    move-object v8, v7

    move v7, v6

    move-object v6, v5

    move-object v5, v4

    move-object v4, v3

    :try_start_4
    invoke-virtual {v0, v1, v2}, Lcom/roblox/universalapp/messagebus/MessageBus;->t(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    iput-object p1, v4, Lem/a;->c:Lcom/roblox/universalapp/messagebus/Connection;

    iget-object p1, v4, Lem/a;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    invoke-static {}, Lnm/c;->c()Ljava/lang/String;

    move-result-object p2

    new-instance v3, Lem/a$b;

    invoke-direct/range {v3 .. v8}, Lem/a$b;-><init>(Lem/a;Lj/b;Landroid/content/Intent;ILem/a$g;)V

    invoke-virtual {p1, p2, v3}, Lcom/roblox/universalapp/messagebus/MessageBus;->t(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    iput-object p1, v4, Lem/a;->d:Lcom/roblox/universalapp/messagebus/Connection;

    iget-object p1, v4, Lem/a;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    invoke-static {}, Lnm/c;->a()Ljava/lang/String;

    move-result-object p2

    new-instance v3, Lem/a$c;

    invoke-direct/range {v3 .. v8}, Lem/a$c;-><init>(Lem/a;Lj/b;Landroid/content/Intent;ILem/a$g;)V

    invoke-virtual {p1, p2, v3}, Lcom/roblox/universalapp/messagebus/MessageBus;->t(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    iput-object p1, v4, Lem/a;->b:Lcom/roblox/universalapp/messagebus/Connection;

    iget-object p1, v4, Lem/a;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    invoke-static {}, Lnm/c;->d()Ljava/lang/String;

    move-result-object p2

    new-instance v3, Lem/a$d;

    invoke-direct/range {v3 .. v8}, Lem/a$d;-><init>(Lem/a;Lj/b;Landroid/content/Intent;ILem/a$g;)V

    invoke-virtual {p1, p2, v3}, Lcom/roblox/universalapp/messagebus/MessageBus;->t(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    iput-object p1, v4, Lem/a;->e:Lcom/roblox/universalapp/messagebus/Connection;

    const-string p1, "clipboard"

    invoke-virtual {v5, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/ClipboardManager;

    iget-object p2, v4, Lem/a;->a:Lcom/roblox/universalapp/messagebus/MessageBus;

    const-string p3, "ExternalContentSharing.setClipboardText"

    new-instance p4, Lem/a$e;

    invoke-direct {p4, p0, p1}, Lem/a$e;-><init>(Lem/a;Landroid/content/ClipboardManager;)V

    invoke-virtual {p2, p3, p4}, Lcom/roblox/universalapp/messagebus/MessageBus;->t(Ljava/lang/String;Lcom/roblox/universalapp/messagebus/Callback;)Lcom/roblox/universalapp/messagebus/Connection;

    move-result-object p1

    iput-object p1, v4, Lem/a;->f:Lcom/roblox/universalapp/messagebus/Connection;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    monitor-exit p0

    return-void

    :catchall_1
    move-exception v0

    :goto_0
    move-object p1, v0

    goto :goto_1

    :catchall_2
    move-exception v0

    move-object v4, v3

    goto :goto_0

    :catchall_3
    move-exception v0

    move-object v4, p0

    goto :goto_0

    :goto_1
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw p1
.end method

.method public declared-synchronized m()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lem/a;->g:Z

    if-nez v0, :cond_0

    const-string v0, "ContentSharingProtocol"

    const-string v1, "Attempted to disconnect ExternalContentSharingProtocol callback, but one is not connected."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :cond_0
    :try_start_1
    iget-object v0, p0, Lem/a;->b:Lcom/roblox/universalapp/messagebus/Connection;

    invoke-virtual {v0}, Lcom/roblox/universalapp/messagebus/Connection;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Lem/a;->b:Lcom/roblox/universalapp/messagebus/Connection;

    iget-object v1, p0, Lem/a;->c:Lcom/roblox/universalapp/messagebus/Connection;

    invoke-virtual {v1}, Lcom/roblox/universalapp/messagebus/Connection;->a()V

    iput-object v0, p0, Lem/a;->c:Lcom/roblox/universalapp/messagebus/Connection;

    iget-object v1, p0, Lem/a;->d:Lcom/roblox/universalapp/messagebus/Connection;

    invoke-virtual {v1}, Lcom/roblox/universalapp/messagebus/Connection;->a()V

    iput-object v0, p0, Lem/a;->d:Lcom/roblox/universalapp/messagebus/Connection;

    iget-object v1, p0, Lem/a;->e:Lcom/roblox/universalapp/messagebus/Connection;

    invoke-virtual {v1}, Lcom/roblox/universalapp/messagebus/Connection;->a()V

    iput-object v0, p0, Lem/a;->e:Lcom/roblox/universalapp/messagebus/Connection;

    iget-object v1, p0, Lem/a;->f:Lcom/roblox/universalapp/messagebus/Connection;

    invoke-virtual {v1}, Lcom/roblox/universalapp/messagebus/Connection;->a()V

    iput-object v0, p0, Lem/a;->f:Lcom/roblox/universalapp/messagebus/Connection;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lem/a;->g:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method
