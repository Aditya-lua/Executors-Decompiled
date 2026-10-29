.class public final Lcom/roblox/client/startup/NativeHelper$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/client/startup/NativeHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/startup/NativeHelper$a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/roblox/client/startup/NativeHelper$a;",
        "",
        "<init>",
        "()V",
        "Landroid/app/Activity;",
        "activity",
        "Landroidx/lifecycle/l$a;",
        "event",
        "",
        "c",
        "(Landroid/app/Activity;Landroidx/lifecycle/l$a;)V",
        "",
        "orientation",
        "d",
        "(I)I",
        "",
        "TAG",
        "Ljava/lang/String;",
        "Lwk/h$d;",
        "securityCookieObserver",
        "Lwk/h$d;",
        "NativeShell_googleProdRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/roblox/client/startup/NativeHelper$a;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lcom/roblox/client/startup/NativeHelper$a;Landroid/app/Activity;Landroidx/lifecycle/l$a;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/startup/NativeHelper$a;->c(Landroid/app/Activity;Landroidx/lifecycle/l$a;)V

    return-void
.end method

.method public static final synthetic b(Lcom/roblox/client/startup/NativeHelper$a;I)I
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/startup/NativeHelper$a;->d(I)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final c(Landroid/app/Activity;Landroidx/lifecycle/l$a;)V
    .locals 5

    invoke-static {}, Lsg/y;->h()Lsg/y;

    move-result-object v0

    invoke-virtual {v0}, Lsg/y;->k()Lom/k;

    move-result-object v0

    sget-object v1, Lcom/roblox/client/startup/NativeHelper$a$a;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    const-string v3, "MEDIA_PICKER"

    const-string v4, "POST_NOTIFICATIONS"

    if-eq v1, v2, :cond_1

    const/4 p1, 0x2

    if-ne v1, p1, :cond_0

    invoke-virtual {v0, v4}, Lom/k;->Y(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Lom/k;->Y(Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unhandled lifecycle event: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {v0, p1}, Lom/k;->d0(Landroid/app/Activity;)V

    invoke-virtual {v0}, Lom/k;->c0()V

    invoke-static {}, Ljj/t;->g()Ljj/t;

    move-result-object p1

    invoke-virtual {v0, v4, p1}, Lom/k;->k(Ljava/lang/String;Lom/k$b;)V

    invoke-static {}, Lwi/a;->e()Lwi/a;

    move-result-object p1

    invoke-virtual {v0, v3, p1}, Lom/k;->k(Ljava/lang/String;Lom/k$b;)V

    return-void
.end method

.method public final d(I)I
    .locals 2

    if-eqz p1, :cond_4

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v1, 0x3

    if-eq p1, v1, :cond_1

    const/4 v1, 0x4

    if-eq p1, v1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "orientationFromEngineToNative: Unsupported orientation = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "NativeHelper"

    invoke-static {v0, p1}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, -0x1

    return p1

    :cond_0
    return v0

    :cond_1
    const/4 p1, 0x7

    return p1

    :cond_2
    const/4 p1, 0x6

    return p1

    :cond_3
    const/4 p1, 0x0

    return p1

    :cond_4
    const/16 p1, 0x8

    return p1
.end method
