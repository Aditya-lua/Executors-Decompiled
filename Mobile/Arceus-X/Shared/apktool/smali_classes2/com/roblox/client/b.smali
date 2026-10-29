.class public abstract Lcom/roblox/client/b;
.super Lj/b;
.source "SourceFile"


# static fields
.field public static G:I

.field public static H:I


# instance fields
.field public E:Lmi/a;

.field public F:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lj/b;-><init>()V

    new-instance v0, Lmi/a;

    invoke-direct {v0}, Lmi/a;-><init>()V

    iput-object v0, p0, Lcom/roblox/client/b;->E:Lmi/a;

    return-void
.end method


# virtual methods
.method public E1()V
    .locals 1

    invoke-static {}, Lsg/a1;->k0()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lsg/a1;->o0()Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0xd

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    return-void

    :cond_1
    invoke-static {}, Lsg/a1;->p0()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x7

    goto :goto_0

    :cond_2
    const/4 v0, 0x6

    :goto_0
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setRequestedOrientation(I)V

    return-void
.end method

.method public F1(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/roblox/client/b;->I1(Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public G1()Lmi/a;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/b;->E:Lmi/a;

    return-object v0
.end method

.method public final H1(Ljava/lang/String;Landroid/content/DialogInterface$OnDismissListener;)V
    .locals 3

    invoke-virtual {p0}, Lcom/roblox/client/b;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroidx/appcompat/app/a$a;

    invoke-direct {v0, p0}, Landroidx/appcompat/app/a$a;-><init>(Landroid/content/Context;)V

    sget v1, Lsg/q0;->u:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/a$a;->j(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/a$a;

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/a$a;->h(Ljava/lang/CharSequence;)Landroidx/appcompat/app/a$a;

    if-eqz p2, :cond_1

    invoke-virtual {v0, p2}, Landroidx/appcompat/app/a$a;->k(Landroid/content/DialogInterface$OnDismissListener;)Landroidx/appcompat/app/a$a;

    :cond_1
    invoke-virtual {v0}, Landroidx/appcompat/app/a$a;->a()Landroidx/appcompat/app/a;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public final I1(Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnDismissListener;)V
    .locals 3

    invoke-virtual {p0}, Lcom/roblox/client/b;->isDestroyed()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroidx/appcompat/app/a$a;

    invoke-direct {v0, p0}, Landroidx/appcompat/app/a$a;-><init>(Landroid/content/Context;)V

    sget v1, Lsg/q0;->u:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/appcompat/app/a$a;->j(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/a$a;

    invoke-virtual {v0, p2}, Landroidx/appcompat/app/a$a;->q(Ljava/lang/CharSequence;)Landroidx/appcompat/app/a$a;

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/a$a;->h(Ljava/lang/CharSequence;)Landroidx/appcompat/app/a$a;

    if-eqz p3, :cond_1

    invoke-virtual {v0, p3}, Landroidx/appcompat/app/a$a;->k(Landroid/content/DialogInterface$OnDismissListener;)Landroidx/appcompat/app/a$a;

    :cond_1
    invoke-virtual {v0}, Landroidx/appcompat/app/a$a;->a()Landroidx/appcompat/app/a;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method public J1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/roblox/client/b;->F:Z

    return v0
.end method

.method public K1(II)V
    .locals 0

    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public L1(Ljava/lang/String;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method public U(I)V
    .locals 1

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/roblox/client/b;->H1(Ljava/lang/String;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public W(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/roblox/client/b;->H1(Ljava/lang/String;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public attachBaseContext(Landroid/content/Context;)V
    .locals 5

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    invoke-static {}, Lqi/b;->f()Lqi/b;

    move-result-object v1

    invoke-virtual {v1, p1}, Lqi/b;->d(Landroid/content/Context;)Lqi/f;

    move-result-object v1

    invoke-static {}, Lqi/b;->f()Lqi/b;

    move-result-object v2

    invoke-virtual {v2}, Lqi/b;->j()Lqi/f;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " -> Locale: base = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, "; default = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lqi/f;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "; user = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lqi/f;->c()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_0
    const-string v4, "null"

    :goto_0
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "rbx.locale"

    invoke-static {v4, v3}, Lgk/q;->b(Ljava/lang/String;Ljava/lang/String;)I

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lqi/f;->c()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lqi/f;->c()Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-static {v1}, Lqi/b;->b(Ljava/lang/String;)Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/res/Configuration;->setLocale(Ljava/util/Locale;)V

    invoke-virtual {v0, v1}, Landroid/content/res/Configuration;->setLayoutDirection(Ljava/util/Locale;)V

    invoke-virtual {p1, v0}, Landroid/content/Context;->createConfigurationContext(Landroid/content/res/Configuration;)Landroid/content/Context;

    move-result-object p1

    invoke-super {p0, p1}, Lj/b;->attachBaseContext(Landroid/content/Context;)V

    invoke-static {p0}, Lsh/i;->b(Landroid/content/Context;)V

    return-void
.end method

.method public isDestroyed()Z
    .locals 2

    sget-object v0, Landroidx/lifecycle/l$b;->a:Landroidx/lifecycle/l$b;

    invoke-virtual {p0}, Le/p;->a()Landroidx/lifecycle/l;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/lifecycle/l;->b()Landroidx/lifecycle/l$b;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    invoke-static {}, Lak/k0;->B()Z

    move-result v0

    const-string v1, "RobloxBaseActivity"

    if-eqz v0, :cond_0

    const-string v0, "onCreate: App was previously destroyed due to process death"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-super {p0, p1}, Le4/q;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :cond_0
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->M1()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "GameActivity = ON. Return!"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-super {p0, p1}, Le4/q;->onCreate(Landroid/os/Bundle;)V

    return-void

    :cond_1
    invoke-static {p0}, Lsg/a1;->R0(Landroid/content/Context;)V

    invoke-static {p0}, Lei/c;->e(Landroid/content/Context;)V

    invoke-super {p0, p1}, Le4/q;->onCreate(Landroid/os/Bundle;)V

    sget p1, Lcom/roblox/client/b;->G:I

    add-int/lit8 v0, p1, 0x1

    sput v0, Lcom/roblox/client/b;->G:I

    if-nez p1, :cond_2

    new-instance p1, Lni/a;

    invoke-direct {p1}, Lni/a;-><init>()V

    invoke-static {p1}, Lcom/roblox/engine/jni/locale/NativeLocaleJavaInterface;->setImplementation(Lpk/a;)V

    new-instance p1, Lni/b;

    invoke-direct {p1, p0}, Lni/b;-><init>(Landroid/content/Context;)V

    invoke-static {p1}, Lcom/roblox/engine/jni/reporter/SessionReporterJavaInterface;->setImplementation(Lrk/a;)V

    :cond_2
    invoke-static {}, Lfk/c;->c()Lfk/c;

    move-result-object p1

    invoke-virtual {p1}, Lfk/c;->m()V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    invoke-static {}, Lak/k0;->B()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "RobloxBaseActivity"

    const-string v1, "onDestroy: App was previously destroyed due to process death"

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-super {p0}, Lj/b;->onDestroy()V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lei/c;->a()V

    :cond_0
    invoke-static {p0}, Lgk/w;->c(Landroid/content/Context;)V

    return-void

    :cond_1
    invoke-super {p0}, Lj/b;->onDestroy()V

    sget v0, Lcom/roblox/client/b;->G:I

    add-int/lit8 v0, v0, -0x1

    sput v0, Lcom/roblox/client/b;->G:I

    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 0

    invoke-super {p0, p1}, Le/p;->onNewIntent(Landroid/content/Intent;)V

    return-void
.end method

.method public onPause()V
    .locals 3

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roblox/client/b;->F:Z

    sget-object v0, Lsg/a1;->s:Landroid/content/SharedPreferences;

    const-string v1, "webview_url"

    const-string v2, ""

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v1

    invoke-static {v1, v0}, Lei/c;->f(Ljava/io/File;Ljava/lang/String;)V

    invoke-super {p0}, Le4/q;->onPause()V

    return-void
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Le4/q;->onResume()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roblox/client/b;->F:Z

    invoke-static {}, Lei/c;->g()V

    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "RESTART_AFTER_PROCESS_DEATH"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    invoke-super {p0, p1}, Le/p;->onSaveInstanceState(Landroid/os/Bundle;)V

    return-void
.end method

.method public onStart()V
    .locals 1

    invoke-super {p0}, Lj/b;->onStart()V

    sget v0, Lcom/roblox/client/b;->H:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/roblox/client/b;->H:I

    return-void
.end method

.method public onStop()V
    .locals 1

    invoke-static {}, Lei/c;->h()V

    invoke-super {p0}, Lj/b;->onStop()V

    sget v0, Lcom/roblox/client/b;->H:I

    add-int/lit8 v0, v0, -0x1

    sput v0, Lcom/roblox/client/b;->H:I

    return-void
.end method

.method public onTrimMemory(I)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onTrimMemory: in "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", level = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "RobloxBaseActivity"

    invoke-static {v1, v0}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    invoke-super {p0, p1}, Le/p;->onTrimMemory(I)V

    sget-object v0, Lwh/t0;->a:Lwh/t0;

    invoke-static {v1, v0, p1}, Lcom/roblox/client/RobloxApplication;->g(Ljava/lang/String;Lwh/t0;I)V

    return-void
.end method
