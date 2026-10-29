.class public abstract Ljj/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljj/j;
.implements Lmj/v$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Lmj/j0;",
        ">",
        "Ljava/lang/Object;",
        "Ljj/j<",
        "TT;>;",
        "Lmj/v$a<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public a:Lmj/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmj/v<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lmj/v;

    invoke-direct {v0, p0}, Lmj/v;-><init>(Lmj/v$a;)V

    iput-object v0, p0, Ljj/b;->a:Lmj/v;

    return-void
.end method

.method public static synthetic e(Ljj/b;Landroid/content/Context;ZLandroid/graphics/Bitmap;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Ljj/b;->s(Landroid/content/Context;ZLandroid/graphics/Bitmap;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Ljj/b;->a:Lmj/v;

    invoke-virtual {v0, p2}, Lmj/v;->g(Ljava/lang/String;)Lmj/j0;

    iget-object p2, p0, Ljj/b;->a:Lmj/v;

    invoke-virtual {p2}, Lmj/v;->e()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Ljj/b;->o()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Ljj/b;->g(Landroid/content/Context;I)V

    return-void

    :cond_0
    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Ljj/b;->f(Landroid/content/Context;Z)V

    return-void
.end method

.method public c(Landroid/content/Context;J)V
    .locals 1

    iget-object v0, p0, Ljj/b;->a:Lmj/v;

    invoke-virtual {v0, p2, p3}, Lmj/v;->h(J)V

    iget-object p2, p0, Ljj/b;->a:Lmj/v;

    invoke-virtual {p2}, Lmj/v;->e()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Ljj/b;->o()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Ljj/b;->g(Landroid/content/Context;I)V

    return-void

    :cond_0
    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Ljj/b;->f(Landroid/content/Context;Z)V

    return-void
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, Ljj/b;->a:Lmj/v;

    invoke-virtual {v0}, Lmj/v;->a()V

    return-void
.end method

.method public d(Landroid/content/Context;Lmj/j0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "TT;)V"
        }
    .end annotation

    iget-object v0, p0, Ljj/b;->a:Lmj/v;

    invoke-virtual {v0, p2}, Lmj/v;->f(Lmj/j0;)V

    invoke-virtual {p0}, Ljj/b;->t()Z

    move-result p2

    invoke-virtual {p0, p1, p2}, Ljj/b;->f(Landroid/content/Context;Z)V

    return-void
.end method

.method public f(Landroid/content/Context;Z)V
    .locals 4

    if-eqz p1, :cond_1

    iget-object v0, p0, Ljj/b;->a:Lmj/v;

    invoke-virtual {v0}, Lmj/v;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Ljj/b0;->a:Ljj/b0;

    invoke-virtual {p0}, Ljj/b;->r()J

    move-result-wide v1

    new-instance v3, Ljj/a;

    invoke-direct {v3, p0, p1, p2}, Ljj/a;-><init>(Ljj/b;Landroid/content/Context;Z)V

    invoke-virtual {v0, p1, v1, v2, v3}, Ljj/b0;->c(Landroid/content/Context;JLjava/util/function/Consumer;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public g(Landroid/content/Context;I)V
    .locals 1

    const-string v0, "notification"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/NotificationManager;

    if-eqz p1, :cond_0

    invoke-virtual {p1, p2}, Landroid/app/NotificationManager;->cancel(I)V

    :cond_0
    return-void
.end method

.method public h(Landroid/content/Context;ZLandroid/graphics/Bitmap;)Lk2/k$f;
    .locals 2

    new-instance v0, Lk2/k$f;

    const-string v1, "channel_general"

    invoke-direct {v0, p1, v1}, Lk2/k$f;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljj/b;->m()Lmj/j0;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Ljj/b;->i(Landroid/content/Context;Lmj/j0;)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lk2/k$f;->j(Landroid/app/PendingIntent;)Lk2/k$f;

    invoke-virtual {p0}, Ljj/b;->m()Lmj/j0;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Ljj/b;->j(Landroid/content/Context;Lmj/j0;)Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v1}, Lk2/k$f;->n(Landroid/app/PendingIntent;)Lk2/k$f;

    sget v1, Lsg/l0;->j:I

    invoke-virtual {v0, v1}, Lk2/k$f;->z(I)Lk2/k$f;

    invoke-virtual {p0, p1}, Ljj/b;->n(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lk2/k$f;->k(Ljava/lang/CharSequence;)Lk2/k$f;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lk2/k$f;->f(Z)Lk2/k$f;

    invoke-virtual {p0, p1}, Ljj/b;->p(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lk2/k$f;->l(Ljava/lang/CharSequence;)Lk2/k$f;

    iget-object v1, p0, Ljj/b;->a:Lmj/v;

    invoke-virtual {v1}, Lmj/v;->i()I

    move-result v1

    invoke-virtual {v0, v1}, Lk2/k$f;->v(I)Lk2/k$f;

    invoke-virtual {v0, p3}, Lk2/k$f;->s(Landroid/graphics/Bitmap;)Lk2/k$f;

    if-eqz p2, :cond_0

    const/4 p2, 0x2

    invoke-static {p2}, Landroid/media/RingtoneManager;->getDefaultUri(I)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {v0, p2}, Lk2/k$f;->A(Landroid/net/Uri;)Lk2/k$f;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    invoke-virtual {v0, p2}, Lk2/k$f;->A(Landroid/net/Uri;)Lk2/k$f;

    :goto_0
    new-instance p2, Lk2/k$d;

    invoke-direct {p2}, Lk2/k$d;-><init>()V

    invoke-virtual {p0, p1}, Ljj/b;->n(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lk2/k$d;->h(Ljava/lang/CharSequence;)Lk2/k$d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lk2/k$f;->B(Lk2/k$i;)Lk2/k$f;

    return-object v0
.end method

.method public final i(Landroid/content/Context;Lmj/j0;)Landroid/app/PendingIntent;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "TT;)",
            "Landroid/app/PendingIntent;"
        }
    .end annotation

    new-instance v0, Landroid/content/Intent;

    const/4 v1, 0x2

    invoke-virtual {p0, v1}, Ljj/b;->k(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-class v2, Lcom/roblox/client/startup/ActivitySplash;

    invoke-virtual {v0, p1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    const-string v2, "STARTED_FOR_INTENT_KEY"

    sget-object v3, Lcom/roblox/client/startup/StartedForEnum;->LOADED_FROM_PUSH_NOTIFICATION:Lcom/roblox/client/startup/StartedForEnum;

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    invoke-virtual {p0, v0, p2}, Ljj/b;->u(Landroid/content/Intent;Lmj/j0;)Landroid/content/Intent;

    move-result-object v0

    const-string v2, "EXTRA_NOTIFICATION_ID"

    invoke-interface {p2}, Lmj/j0;->b()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p2, "EXTRA_INTENT_ACTION_TYPE_CODE"

    invoke-virtual {v0, p2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p2, "EXTRA_NOTIFICATION_TYPE"

    invoke-virtual {p0}, Ljj/b;->q()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Ljj/b;->o()I

    move-result p2

    const/high16 v1, 0x12000000

    invoke-static {p1, p2, v0, v1}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method

.method public j(Landroid/content/Context;Lmj/j0;)Landroid/app/PendingIntent;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "TT;)",
            "Landroid/app/PendingIntent;"
        }
    .end annotation

    new-instance v0, Landroid/content/Intent;

    const/4 v1, 0x1

    invoke-virtual {p0, v1}, Ljj/b;->k(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljj/b;->l()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, p1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    invoke-virtual {p0, v0, p2}, Ljj/b;->v(Landroid/content/Intent;Lmj/j0;)Landroid/content/Intent;

    move-result-object v0

    const-string v2, "EXTRA_NOTIFICATION_TYPE"

    invoke-virtual {p0}, Ljj/b;->q()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "EXTRA_INTENT_ACTION_TYPE_CODE"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v1, "EXTRA_NOTIFICATION_ID"

    invoke-interface {p2}, Lmj/j0;->b()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Ljj/b;->o()I

    move-result p2

    const/high16 v1, 0x12000000

    invoke-static {p1, p2, v0, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    return-object p1
.end method

.method public abstract k(I)Ljava/lang/String;
.end method

.method public abstract l()Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end method

.method public m()Lmj/j0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Ljj/b;->a:Lmj/v;

    invoke-virtual {v0}, Lmj/v;->e()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ljj/b;->a:Lmj/v;

    invoke-virtual {v0}, Lmj/v;->i()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Lmj/v;->b(I)Lmj/j0;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract n(Landroid/content/Context;)Ljava/lang/String;
.end method

.method public abstract o()I
.end method

.method public p(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    sget v0, Lsg/q0;->O:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public abstract q()Ljava/lang/String;
.end method

.method public abstract r()J
.end method

.method public final synthetic s(Landroid/content/Context;ZLandroid/graphics/Bitmap;)V
    .locals 1

    iget-object v0, p0, Ljj/b;->a:Lmj/v;

    invoke-virtual {v0}, Lmj/v;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Ljj/b;->h(Landroid/content/Context;ZLandroid/graphics/Bitmap;)Lk2/k$f;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ljj/b;->w(Landroid/content/Context;Lk2/k$f;)V

    return-void
.end method

.method public t()Z
    .locals 3

    iget-object v0, p0, Ljj/b;->a:Lmj/v;

    invoke-virtual {v0}, Lmj/v;->i()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ljj/b;->a:Lmj/v;

    invoke-virtual {v0}, Lmj/v;->i()I

    move-result v0

    const/4 v2, 0x2

    if-gt v0, v2, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method

.method public abstract u(Landroid/content/Intent;Lmj/j0;)Landroid/content/Intent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            "TT;)",
            "Landroid/content/Intent;"
        }
    .end annotation
.end method

.method public abstract v(Landroid/content/Intent;Lmj/j0;)Landroid/content/Intent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            "TT;)",
            "Landroid/content/Intent;"
        }
    .end annotation
.end method

.method public w(Landroid/content/Context;Lk2/k$f;)V
    .locals 1

    invoke-virtual {p2}, Lk2/k$f;->c()Landroid/app/Notification;

    move-result-object p2

    const-string v0, "notification"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/NotificationManager;

    invoke-virtual {p0}, Ljj/b;->o()I

    move-result v0

    invoke-virtual {p1, v0, p2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    return-void
.end method
