.class public Lik/k0$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lei/f$h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lik/k0;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lik/k0;


# direct methods
.method public constructor <init>(Lik/k0;)V
    .locals 0

    iput-object p1, p0, Lik/k0$a;->a:Lik/k0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    const-string v0, "load_setting_end"

    invoke-static {v0}, Lcom/roblox/universalapp/logging/LoggingProtocol;->g(Ljava/lang/String;)V

    invoke-static {}, Leh/f;->h()Leh/f;

    move-result-object v0

    iget-object v1, p0, Lik/k0$a;->a:Lik/k0;

    invoke-static {v1}, Lik/k0;->d(Lik/k0;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Leh/f;->i(Landroid/content/Context;)V

    if-nez p1, :cond_8

    const-string p1, "InitHelper"

    const-string v0, "getAllAppSettings: ... Settings loaded."

    invoke-static {p1, v0}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lik/k0$a;->a:Lik/k0;

    sget-object v0, Lik/k0$g;->c:Lik/k0$g;

    invoke-static {p1, v0}, Lik/k0;->g(Lik/k0;Lik/k0$g;)V

    iget-object p1, p0, Lik/k0$a;->a:Lik/k0;

    invoke-static {p1}, Lik/k0;->d(Lik/k0;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lik/k0;->w(Landroid/content/Context;)V

    invoke-static {}, Lfm/j;->j()Lfm/j;

    move-result-object p1

    invoke-virtual {p1}, Lfm/j;->f()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lfm/j;->j()Lfm/j;

    move-result-object p1

    iget-object v0, p0, Lik/k0$a;->a:Lik/k0;

    invoke-static {v0}, Lik/k0;->d(Lik/k0;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Lfm/j;->i(Landroid/content/Context;)V

    :cond_0
    invoke-static {}, Lym/g;->G()Lym/g;

    move-result-object p1

    invoke-virtual {p1}, Lym/g;->w()V

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->C5()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lik/k0$a;->a:Lik/k0;

    invoke-virtual {p1}, Lik/k0;->y()V

    :cond_1
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->w2()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object p1

    const-string v1, "mounted"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lik/k0$a;->a:Lik/k0;

    invoke-static {p1}, Lik/k0;->d(Lik/k0;)Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v1

    invoke-interface {v1}, Lbi/i;->d0()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-static {p1}, Ljk/d;->d(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeSetExternalDirectory(Ljava/lang/String;)V

    :cond_3
    :goto_0
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->u4()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lik/k0$a;->a:Lik/k0;

    invoke-static {p1}, Lik/k0;->d(Lik/k0;)Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_4
    const-string p1, ""

    :goto_1
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->d0()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lik/k0$a;->a:Lik/k0;

    invoke-static {v0}, Lik/k0;->d(Lik/k0;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getDataDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Ljk/d;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lik/k0$a;->a:Lik/k0;

    invoke-static {v0}, Lik/k0;->d(Lik/k0;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getDataDir()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeSetBaseDataDirectories(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    :goto_2
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object p1

    invoke-interface {p1}, Lbi/i;->d0()Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Lik/k0$a;->a:Lik/k0;

    invoke-static {p1}, Lik/k0;->d(Lik/k0;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lok/z;->e(Landroid/content/Context;)Lok/z;

    move-result-object p1

    invoke-virtual {p1}, Lok/z;->f()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljk/d;->e(Ljava/lang/String;)V

    goto :goto_3

    :cond_7
    iget-object p1, p0, Lik/k0$a;->a:Lik/k0;

    invoke-static {p1}, Lik/k0;->d(Lik/k0;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lok/z;->e(Landroid/content/Context;)Lok/z;

    move-result-object p1

    invoke-virtual {p1}, Lok/z;->f()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/roblox/engine/jni/NativeSettingsInterface;->nativeSetPreferencesFile(Ljava/lang/String;)V

    :goto_3
    iget-object p1, p0, Lik/k0$a;->a:Lik/k0;

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->C5()Z

    move-result v0

    invoke-static {p1, v0}, Lik/k0;->m(Lik/k0;Z)V

    return-void

    :cond_8
    iget-object p1, p0, Lik/k0$a;->a:Lik/k0;

    invoke-static {p1}, Lik/k0;->l(Lik/k0;)V

    return-void
.end method
