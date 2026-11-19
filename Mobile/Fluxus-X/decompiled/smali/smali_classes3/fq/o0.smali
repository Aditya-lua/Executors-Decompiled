.class public final Lfq/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lln/o;
.implements Lls/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfq/o0$a;,
        Lfq/o0$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lln/o<",
        "Lfq/o0$b;",
        ">;",
        "Lls/j<",
        "Lfq/o0$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u0018\u0013B1\u0008\u0007\u0012\u000e\u0008\u0001\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\u0008\u00030\u0003H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\u0008\u00030\u0001H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u001aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lfq/o0;",
        "Lln/o;",
        "Lfq/o0$b;",
        "Lls/j;",
        "Lg/d;",
        "",
        "requestPermissionsLauncher",
        "Landroid/content/Context;",
        "context",
        "Lfq/n0;",
        "permission",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
        "trackingEventsLogger",
        "<init>",
        "(Lg/d;Landroid/content/Context;Lfq/n0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V",
        "otherWorker",
        "",
        "c",
        "(Lls/j;)Z",
        "a",
        "(Lln/o;)Z",
        "Ldv/h;",
        "run",
        "()Ldv/h;",
        "b",
        "Lg/d;",
        "Landroid/content/Context;",
        "d",
        "Lfq/n0;",
        "e",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
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
.field public final b:Lg/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lg/d<",
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

.field public final d:Lfq/n0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lg/d;Landroid/content/Context;Lfq/n0;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V
    .locals 1
    .param p1    # Lg/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lfq/n0;
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
            "Lg/d<",
            "Ljava/lang/String;",
            ">;",
            "Landroid/content/Context;",
            "Lfq/n0;",
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

    iput-object p1, p0, Lfq/o0;->b:Lg/d;

    iput-object p2, p0, Lfq/o0;->c:Landroid/content/Context;

    iput-object p3, p0, Lfq/o0;->d:Lfq/n0;

    iput-object p4, p0, Lfq/o0;->e:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    return-void
.end method

.method public static final synthetic d(Lfq/o0;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lfq/o0;->c:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic e(Lfq/o0;)Lfq/n0;
    .locals 0

    iget-object p0, p0, Lfq/o0;->d:Lfq/n0;

    return-object p0
.end method

.method public static final synthetic f(Lfq/o0;)Lg/d;
    .locals 0

    iget-object p0, p0, Lfq/o0;->b:Lg/d;

    return-object p0
.end method

.method public static final synthetic g(Lfq/o0;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;
    .locals 0

    iget-object p0, p0, Lfq/o0;->e:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    return-object p0
.end method


# virtual methods
.method public a(Lln/o;)Z
    .locals 1
    .param p1    # Lln/o;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lln/o<",
            "*>;)Z"
        }
    .end annotation

    const-string v0, "otherWorker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lfq/o0;

    if-eqz v0, :cond_0

    check-cast p1, Lfq/o0;

    iget-object p1, p1, Lfq/o0;->d:Lfq/n0;

    iget-object v0, p0, Lfq/o0;->d:Lfq/n0;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public b(Lls/j;)Z
    .locals 0
    .param p1    # Lls/j;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lls/j<",
            "*>;)Z"
        }
    .end annotation

    invoke-super {p0, p1}, Lls/j;->b(Lls/j;)Z

    move-result p1

    return p1
.end method

.method public c(Lls/j;)Z
    .locals 1
    .param p1    # Lls/j;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lls/j<",
            "*>;)Z"
        }
    .end annotation

    const-string v0, "otherWorker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lfq/o0;

    if-eqz v0, :cond_0

    check-cast p1, Lfq/o0;

    iget-object p1, p1, Lfq/o0;->d:Lfq/n0;

    iget-object v0, p0, Lfq/o0;->d:Lfq/n0;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public run()Ldv/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldv/h<",
            "Lfq/o0$b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lfq/o0$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lfq/o0$c;-><init>(Lfq/o0;Leu/b;)V

    invoke-static {v0}, Ldv/j;->w(Lkotlin/jvm/functions/Function2;)Ldv/h;

    move-result-object v0

    return-object v0
.end method
