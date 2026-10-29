.class public final Landroidx/lifecycle/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/s;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/h0$a;,
        Landroidx/lifecycle/h0$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u0000 \r2\u00020\u0001:\u0002\u0013\u0010B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0003J\u000f\u0010\u0008\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000bH\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0011R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u0017R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010%R\u0014\u0010)\u001a\u00020\'8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010(\u00a8\u0006*"
    }
    d2 = {
        "Landroidx/lifecycle/h0;",
        "Landroidx/lifecycle/s;",
        "<init>",
        "()V",
        "",
        "g",
        "f",
        "e",
        "h",
        "k",
        "l",
        "Landroid/content/Context;",
        "context",
        "i",
        "(Landroid/content/Context;)V",
        "",
        "a",
        "I",
        "startedCounter",
        "b",
        "resumedCounter",
        "",
        "c",
        "Z",
        "pauseSent",
        "d",
        "stopSent",
        "Landroid/os/Handler;",
        "Landroid/os/Handler;",
        "handler",
        "Landroidx/lifecycle/u;",
        "Landroidx/lifecycle/u;",
        "registry",
        "Ljava/lang/Runnable;",
        "Ljava/lang/Runnable;",
        "delayedPauseRunnable",
        "Landroidx/lifecycle/k0$a;",
        "Landroidx/lifecycle/k0$a;",
        "initializationListener",
        "Landroidx/lifecycle/l;",
        "()Landroidx/lifecycle/l;",
        "lifecycle",
        "lifecycle-process"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final i:Landroidx/lifecycle/h0$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final j:Landroidx/lifecycle/h0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public a:I

.field public b:I

.field public c:Z

.field public d:Z

.field public e:Landroid/os/Handler;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final f:Landroidx/lifecycle/u;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Ljava/lang/Runnable;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final h:Landroidx/lifecycle/k0$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/lifecycle/h0$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/lifecycle/h0$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/lifecycle/h0;->i:Landroidx/lifecycle/h0$b;

    new-instance v0, Landroidx/lifecycle/h0;

    invoke-direct {v0}, Landroidx/lifecycle/h0;-><init>()V

    sput-object v0, Landroidx/lifecycle/h0;->j:Landroidx/lifecycle/h0;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/h0;->c:Z

    iput-boolean v0, p0, Landroidx/lifecycle/h0;->d:Z

    new-instance v0, Landroidx/lifecycle/u;

    invoke-direct {v0, p0}, Landroidx/lifecycle/u;-><init>(Landroidx/lifecycle/s;)V

    iput-object v0, p0, Landroidx/lifecycle/h0;->f:Landroidx/lifecycle/u;

    new-instance v0, Landroidx/lifecycle/g0;

    invoke-direct {v0, p0}, Landroidx/lifecycle/g0;-><init>(Landroidx/lifecycle/h0;)V

    iput-object v0, p0, Landroidx/lifecycle/h0;->g:Ljava/lang/Runnable;

    new-instance v0, Landroidx/lifecycle/h0$d;

    invoke-direct {v0, p0}, Landroidx/lifecycle/h0$d;-><init>(Landroidx/lifecycle/h0;)V

    iput-object v0, p0, Landroidx/lifecycle/h0;->h:Landroidx/lifecycle/k0$a;

    return-void
.end method

.method public static synthetic b(Landroidx/lifecycle/h0;)V
    .locals 0

    invoke-static {p0}, Landroidx/lifecycle/h0;->j(Landroidx/lifecycle/h0;)V

    return-void
.end method

.method public static final synthetic c(Landroidx/lifecycle/h0;)Landroidx/lifecycle/k0$a;
    .locals 0

    iget-object p0, p0, Landroidx/lifecycle/h0;->h:Landroidx/lifecycle/k0$a;

    return-object p0
.end method

.method public static final synthetic d()Landroidx/lifecycle/h0;
    .locals 1

    sget-object v0, Landroidx/lifecycle/h0;->j:Landroidx/lifecycle/h0;

    return-object v0
.end method

.method public static final j(Landroidx/lifecycle/h0;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/lifecycle/h0;->k()V

    invoke-virtual {p0}, Landroidx/lifecycle/h0;->l()V

    return-void
.end method

.method public static final m()Landroidx/lifecycle/s;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Landroidx/lifecycle/h0;->i:Landroidx/lifecycle/h0$b;

    invoke-virtual {v0}, Landroidx/lifecycle/h0$b;->a()Landroidx/lifecycle/s;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()Landroidx/lifecycle/l;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Landroidx/lifecycle/h0;->f:Landroidx/lifecycle/u;

    return-object v0
.end method

.method public final e()V
    .locals 4

    iget v0, p0, Landroidx/lifecycle/h0;->b:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Landroidx/lifecycle/h0;->b:I

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/h0;->e:Landroid/os/Handler;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v1, p0, Landroidx/lifecycle/h0;->g:Ljava/lang/Runnable;

    const-wide/16 v2, 0x2bc

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public final f()V
    .locals 2

    iget v0, p0, Landroidx/lifecycle/h0;->b:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Landroidx/lifecycle/h0;->b:I

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Landroidx/lifecycle/h0;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/h0;->f:Landroidx/lifecycle/u;

    sget-object v1, Landroidx/lifecycle/l$a;->ON_RESUME:Landroidx/lifecycle/l$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/u;->j(Landroidx/lifecycle/l$a;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/lifecycle/h0;->c:Z

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/lifecycle/h0;->e:Landroid/os/Handler;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v1, p0, Landroidx/lifecycle/h0;->g:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method public final g()V
    .locals 2

    iget v0, p0, Landroidx/lifecycle/h0;->a:I

    const/4 v1, 0x1

    add-int/2addr v0, v1

    iput v0, p0, Landroidx/lifecycle/h0;->a:I

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Landroidx/lifecycle/h0;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/h0;->f:Landroidx/lifecycle/u;

    sget-object v1, Landroidx/lifecycle/l$a;->ON_START:Landroidx/lifecycle/l$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/u;->j(Landroidx/lifecycle/l$a;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/lifecycle/h0;->d:Z

    :cond_0
    return-void
.end method

.method public final h()V
    .locals 1

    iget v0, p0, Landroidx/lifecycle/h0;->a:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Landroidx/lifecycle/h0;->a:I

    invoke-virtual {p0}, Landroidx/lifecycle/h0;->l()V

    return-void
.end method

.method public final i(Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/h0;->e:Landroid/os/Handler;

    iget-object v0, p0, Landroidx/lifecycle/h0;->f:Landroidx/lifecycle/u;

    sget-object v1, Landroidx/lifecycle/l$a;->ON_CREATE:Landroidx/lifecycle/l$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/u;->j(Landroidx/lifecycle/l$a;)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.app.Application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/app/Application;

    new-instance v0, Landroidx/lifecycle/h0$c;

    invoke-direct {v0, p0}, Landroidx/lifecycle/h0$c;-><init>(Landroidx/lifecycle/h0;)V

    invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method

.method public final k()V
    .locals 2

    iget v0, p0, Landroidx/lifecycle/h0;->b:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/h0;->c:Z

    iget-object v0, p0, Landroidx/lifecycle/h0;->f:Landroidx/lifecycle/u;

    sget-object v1, Landroidx/lifecycle/l$a;->ON_PAUSE:Landroidx/lifecycle/l$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/u;->j(Landroidx/lifecycle/l$a;)V

    :cond_0
    return-void
.end method

.method public final l()V
    .locals 2

    iget v0, p0, Landroidx/lifecycle/h0;->a:I

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroidx/lifecycle/h0;->c:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/lifecycle/h0;->f:Landroidx/lifecycle/u;

    sget-object v1, Landroidx/lifecycle/l$a;->ON_STOP:Landroidx/lifecycle/l$a;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/u;->j(Landroidx/lifecycle/l$a;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/lifecycle/h0;->d:Z

    :cond_0
    return-void
.end method
