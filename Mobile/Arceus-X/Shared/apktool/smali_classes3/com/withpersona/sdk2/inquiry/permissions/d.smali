.class public final Lcom/withpersona/sdk2/inquiry/permissions/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lym/o;
.implements Lvr/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/permissions/d$a;,
        Lcom/withpersona/sdk2/inquiry/permissions/d$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lym/o<",
        "Lcom/withpersona/sdk2/inquiry/permissions/d$b;",
        ">;",
        "Lvr/h<",
        "Lcom/withpersona/sdk2/inquiry/permissions/d$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0013\u001eB1\u0008\u0007\u0012\u000e\u0008\u0001\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\u0008\u00030\u0003H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\u0008\u00030\u0001H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0018R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0019R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/permissions/d;",
        "Lym/o;",
        "Lcom/withpersona/sdk2/inquiry/permissions/d$b;",
        "Lvr/h;",
        "Lg/c;",
        "",
        "requestPermissionsLauncher",
        "Landroid/content/Context;",
        "context",
        "Lrp/i0;",
        "permission",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
        "trackingEventsLogger",
        "<init>",
        "(Lg/c;Landroid/content/Context;Lrp/i0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V",
        "otherWorker",
        "",
        "c",
        "(Lvr/h;)Z",
        "b",
        "(Lym/o;)Z",
        "Lnu/h;",
        "run",
        "()Lnu/h;",
        "Lg/c;",
        "Landroid/content/Context;",
        "d",
        "Lrp/i0;",
        "e",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
        "a",
        "permissions_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final b:Lg/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg/c<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lrp/i0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lg/c;Landroid/content/Context;Lrp/i0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V
    .locals 1
    .param p1    # Lg/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lrp/i0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg/c<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/content/Context;",
            "Lrp/i0;",
            "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
            ")V"
        }
    .end annotation

    const-string v0, "requestPermissionsLauncher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "permission"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackingEventsLogger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/permissions/d;->b:Lg/c;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/permissions/d;->c:Landroid/content/Context;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/permissions/d;->d:Lrp/i0;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/permissions/d;->e:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    return-void
.end method

.method public static final synthetic d(Lcom/withpersona/sdk2/inquiry/permissions/d;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/permissions/d;->c:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic e(Lcom/withpersona/sdk2/inquiry/permissions/d;)Lrp/i0;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/permissions/d;->d:Lrp/i0;

    return-object p0
.end method

.method public static final synthetic f(Lcom/withpersona/sdk2/inquiry/permissions/d;)Lg/c;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/permissions/d;->b:Lg/c;

    return-object p0
.end method

.method public static final synthetic g(Lcom/withpersona/sdk2/inquiry/permissions/d;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/permissions/d;->e:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    return-object p0
.end method


# virtual methods
.method public a(Lvr/h;)Z
    .locals 0
    .param p1    # Lvr/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvr/h<",
            "*>;)Z"
        }
    .end annotation

    invoke-super {p0, p1}, Lvr/h;->a(Lvr/h;)Z

    move-result p1

    return p1
.end method

.method public b(Lym/o;)Z
    .locals 1
    .param p1    # Lym/o;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lym/o<",
            "*>;)Z"
        }
    .end annotation

    const-string v0, "otherWorker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/permissions/d;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/permissions/d;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/permissions/d;->d:Lrp/i0;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/d;->d:Lrp/i0;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public c(Lvr/h;)Z
    .locals 1
    .param p1    # Lvr/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvr/h<",
            "*>;)Z"
        }
    .end annotation

    const-string v0, "otherWorker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/permissions/d;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/permissions/d;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/permissions/d;->d:Lrp/i0;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/permissions/d;->d:Lrp/i0;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public run()Lnu/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnu/h<",
            "Lcom/withpersona/sdk2/inquiry/permissions/d$b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/permissions/d$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/withpersona/sdk2/inquiry/permissions/d$c;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/d;Lnt/b;)V

    invoke-static {v0}, Lnu/j;->w(Lkotlin/jvm/functions/Function2;)Lnu/h;

    move-result-object v0

    return-object v0
.end method
