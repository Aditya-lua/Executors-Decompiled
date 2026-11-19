.class public Lmi/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    invoke-static {}, Lcl/g;->d()Lcl/d;

    move-result-object v0

    invoke-interface {v0}, Lcl/d;->g()Lcom/roblox/platform/http/interfaces/NotificationsInterface;

    move-result-object v0

    new-instance v1, Lkl/b;

    invoke-direct {v1, p0, p1, p2}, Lkl/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/roblox/platform/http/interfaces/NotificationsInterface;->pushMarkCategoryAsRead(Lkl/b;)Lsw/d;

    move-result-object p0

    new-instance p1, Lmi/o$a;

    invoke-direct {p1}, Lmi/o$a;-><init>()V

    invoke-interface {p0, p1}, Lsw/d;->L(Lsw/f;)V

    return-void
.end method
