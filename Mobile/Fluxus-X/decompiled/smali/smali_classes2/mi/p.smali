.class public Lmi/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Lrj/r;->k()Lrj/r;

    move-result-object v0

    invoke-virtual {v0, p0}, Lrj/r;->n(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lrj/x;

    invoke-direct {v1}, Lrj/x;-><init>()V

    invoke-virtual {v1, p0, v0}, Lrj/x;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {}, Lcl/g;->d()Lcl/d;

    move-result-object v0

    invoke-interface {v0}, Lcl/d;->g()Lcom/roblox/platform/http/interfaces/NotificationsInterface;

    move-result-object v0

    new-instance v1, Lkl/a;

    invoke-direct {v1, p0, p1}, Lkl/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/roblox/platform/http/interfaces/NotificationsInterface;->pushMarkAsRead(Lkl/a;)Lsw/d;

    move-result-object p0

    new-instance p1, Lmi/p$a;

    invoke-direct {p1}, Lmi/p$a;-><init>()V

    invoke-interface {p0, p1}, Lsw/d;->L(Lsw/f;)V

    return-void
.end method
