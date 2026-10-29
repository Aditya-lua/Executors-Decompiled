.class public final Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$c;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->unsetActivityIfMatches(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lku/p0;",
        "Lnt/b<",
        "-",
        "Landroid/app/Activity;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lku/p0;",
        "Landroid/app/Activity;",
        "<anonymous>",
        "(Lku/p0;)Landroid/app/Activity;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.roblox.protocols.systemdialog.PlatformSystemDialogHandler$unsetActivityIfMatches$1"
    f = "PlatformSystemDialogHandler.kt"
    l = {
        0x92
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:I

.field public w:I

.field public final synthetic x:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lnt/b<",
            "-",
            "Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$c;->x:Landroid/app/Activity;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method

.method public static synthetic q(Landroid/app/Activity;Landroid/app/Activity;)Landroid/app/Activity;
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$c;->r(Landroid/app/Activity;Landroid/app/Activity;)Landroid/app/Activity;

    move-result-object p0

    return-object p0
.end method

.method public static final r(Landroid/app/Activity;Landroid/app/Activity;)Landroid/app/Activity;
    .locals 0

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    return-object p1

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lnt/b<",
            "*>;)",
            "Lnt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$c;

    iget-object v0, p0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$c;->x:Landroid/app/Activity;

    invoke-direct {p1, v0, p2}, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$c;-><init>(Landroid/app/Activity;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$c;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lku/p0;",
            "Lnt/b<",
            "-",
            "Landroid/app/Activity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$c;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$c;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$c;->w:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$c;->u:Ljava/lang/Object;

    check-cast v0, Landroid/app/Activity;

    iget-object v1, p0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$c;->t:Ljava/lang/Object;

    check-cast v1, Luu/a;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    invoke-static {}, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->access$getContextMutex$p()Luu/a;

    move-result-object v1

    iget-object p1, p0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$c;->x:Landroid/app/Activity;

    iput-object v1, p0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$c;->t:Ljava/lang/Object;

    iput-object p1, p0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$c;->u:Ljava/lang/Object;

    const/4 v4, 0x0

    iput v4, p0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$c;->v:I

    iput v2, p0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$c;->w:I

    invoke-interface {v1, v3, p0}, Luu/a;->f(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, p1

    :goto_0
    :try_start_0
    invoke-static {}, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->access$getCurrentActivity$p()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object p1

    new-instance v2, Lml/g;

    invoke-direct {v2, v0}, Lml/g;-><init>(Landroid/app/Activity;)V

    invoke-virtual {p1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndUpdate(Ljava/util/function/UnaryOperator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/Activity;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1, v3}, Luu/a;->e(Ljava/lang/Object;)V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-interface {v1, v3}, Luu/a;->e(Ljava/lang/Object;)V

    throw p1
.end method
