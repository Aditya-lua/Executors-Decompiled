.class public Lcom/roblox/client/startup/c;
.super Le4/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/startup/c$b;
    }
.end annotation


# instance fields
.field public v0:Lcom/roblox/client/startup/c$b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Le4/k;-><init>()V

    return-void
.end method

.method public static bridge synthetic u2(Lcom/roblox/client/startup/c;)Lcom/roblox/client/startup/c$b;
    .locals 0

    iget-object p0, p0, Lcom/roblox/client/startup/c;->v0:Lcom/roblox/client/startup/c$b;

    return-object p0
.end method

.method public static v2(Lj/b;)V
    .locals 2
    .param p0    # Lj/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-static {p0}, Lcom/roblox/client/startup/c;->w2(Lj/b;)Lcom/roblox/client/startup/c;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string v0, "FragmentRetry"

    const-string v1, "Dismiss the existing Retry UI..."

    invoke-static {v0, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Le4/k;->f2()V

    :cond_0
    return-void
.end method

.method public static w2(Lj/b;)Lcom/roblox/client/startup/c;
    .locals 1
    .param p0    # Lj/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object p0

    const-string v0, "FragmentRetry"

    invoke-virtual {p0, v0}, Landroidx/fragment/app/FragmentManager;->n0(Ljava/lang/String;)Landroidx/fragment/app/c;

    move-result-object p0

    instance-of v0, p0, Lcom/roblox/client/startup/c;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/roblox/client/startup/c;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static y2(Lj/b;I)V
    .locals 4
    .param p0    # Lj/b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "showRetryFragment: "

    const-string v1, "FragmentRetry"

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lcom/roblox/client/startup/FlagCacheUtils;->recordRetryDialogShown()V

    invoke-static {p0}, Lcom/roblox/client/startup/c;->w2(Lj/b;)Lcom/roblox/client/startup/c;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v2, "showRetryFragment: Found an existing Retry fragment."

    invoke-static {v1, v2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/roblox/client/startup/c;->x2(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    const-string v0, "showRetryFragment: Create a new FragmentRetry..."

    invoke-static {v1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Lcom/roblox/client/startup/c;

    invoke-direct {v0}, Lcom/roblox/client/startup/c;-><init>()V

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "message"

    invoke-virtual {v2, v3, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {v0, v2}, Landroidx/fragment/app/c;->O1(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Le4/q;->l1()Landroidx/fragment/app/FragmentManager;

    move-result-object p0

    invoke-virtual {v0, p0, v1}, Le4/k;->t2(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public C0(Landroid/content/Context;)V
    .locals 2

    invoke-super {p0, p1}, Le4/k;->C0(Landroid/content/Context;)V

    instance-of v0, p1, Lcom/roblox/client/startup/c$b;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/roblox/client/startup/c$b;

    iput-object p1, p0, Lcom/roblox/client/startup/c;->v0:Lcom/roblox/client/startup/c$b;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " must implement OnFragmentInteractionListener."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public N0()V
    .locals 1

    invoke-super {p0}, Le4/k;->N0()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roblox/client/startup/c;->v0:Lcom/roblox/client/startup/c$b;

    return-void
.end method

.method public k2(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string p1, "FragmentRetry"

    const-string v0, "onCreateDialog:"

    invoke-static {p1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Landroidx/fragment/app/c;->t()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "message"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p1

    new-instance v0, Landroidx/appcompat/app/a$a;

    invoke-virtual {p0}, Landroidx/fragment/app/c;->p()Le4/q;

    move-result-object v1

    invoke-direct {v0, v1}, Landroidx/appcompat/app/a$a;-><init>(Landroid/content/Context;)V

    sget v1, Lsg/q0;->B:I

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/a$a;->p(I)Landroidx/appcompat/app/a$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/a$a;->g(I)Landroidx/appcompat/app/a$a;

    move-result-object p1

    sget v0, Lsg/q0;->t:I

    new-instance v1, Lcom/roblox/client/startup/c$a;

    invoke-direct {v1, p0}, Lcom/roblox/client/startup/c$a;-><init>(Lcom/roblox/client/startup/c;)V

    invoke-virtual {p1, v0, v1}, Landroidx/appcompat/app/a$a;->m(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/a$a;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroidx/appcompat/app/a$a;->d(Z)Landroidx/appcompat/app/a$a;

    invoke-virtual {p1}, Landroidx/appcompat/app/a$a;->a()Landroidx/appcompat/app/a;

    move-result-object p1

    return-object p1
.end method

.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 1

    invoke-super {p0, p1}, Le4/k;->onCancel(Landroid/content/DialogInterface;)V

    const-string p1, "FragmentRetry"

    const-string v0, "onCancel:"

    invoke-static {p1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/startup/c;->v0:Lcom/roblox/client/startup/c$b;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/roblox/client/startup/c$b;->i()V

    :cond_0
    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    invoke-super {p0, p1}, Le4/k;->onDismiss(Landroid/content/DialogInterface;)V

    const-string p1, "FragmentRetry"

    const-string v0, "onDismiss: Do nothing."

    invoke-static {p1, v0}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public x2(Ljava/lang/CharSequence;)V
    .locals 2

    invoke-virtual {p0}, Le4/k;->h2()Landroid/app/Dialog;

    move-result-object v0

    instance-of v1, v0, Landroidx/appcompat/app/a;

    if-eqz v1, :cond_0

    check-cast v0, Landroidx/appcompat/app/a;

    invoke-virtual {v0, p1}, Landroidx/appcompat/app/a;->u(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method
