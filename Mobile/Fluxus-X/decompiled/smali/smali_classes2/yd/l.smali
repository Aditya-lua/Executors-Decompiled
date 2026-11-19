.class public final Lyd/l;
.super Lyd/k;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lyd/m;Ltb/k;Ljava/lang/String;)V
    .locals 1

    new-instance p3, Lzd/i;

    const-string v0, "OnRequestInstallCallback"

    invoke-direct {p3, v0}, Lzd/i;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1, p3, p2}, Lyd/k;-><init>(Lyd/m;Lzd/i;Ltb/k;)V

    return-void
.end method


# virtual methods
.method public final l(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Lyd/k;->l(Landroid/os/Bundle;)V

    const-string v0, "confirmation_intent"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    const-string v1, "is_review_no_op"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    new-instance v1, Lyd/e;

    invoke-direct {v1, v0, p1}, Lyd/e;-><init>(Landroid/app/PendingIntent;Z)V

    iget-object p1, p0, Lyd/k;->b:Ltb/k;

    invoke-virtual {p1, v1}, Ltb/k;->e(Ljava/lang/Object;)Z

    return-void
.end method
