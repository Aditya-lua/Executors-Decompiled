.class public Lgk/x;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/app/Activity;I)V
    .locals 2

    new-instance v0, Lk2/k$f;

    const-string v1, "channel_urgent"

    invoke-direct {v0, p0, v1}, Lk2/k$f;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    sget v1, Lsg/l0;->j:I

    invoke-virtual {v0, v1}, Lk2/k$f;->z(I)Lk2/k$f;

    move-result-object v0

    sget v1, Lsg/q0;->O:I

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lk2/k$f;->l(Ljava/lang/CharSequence;)Lk2/k$f;

    move-result-object v0

    new-instance v1, Lk2/k$d;

    invoke-direct {v1}, Lk2/k$d;-><init>()V

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lk2/k$d;->h(Ljava/lang/CharSequence;)Lk2/k$d;

    move-result-object p1

    invoke-virtual {v0, p1}, Lk2/k$f;->B(Lk2/k$i;)Lk2/k$f;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lk2/k$f;->x(I)Lk2/k$f;

    move-result-object p1

    invoke-static {p0}, Lk2/n;->e(Landroid/content/Context;)Lk2/n;

    move-result-object p0

    invoke-virtual {p1}, Lk2/k$f;->c()Landroid/app/Notification;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lk2/n;->h(ILandroid/app/Notification;)V

    return-void
.end method
