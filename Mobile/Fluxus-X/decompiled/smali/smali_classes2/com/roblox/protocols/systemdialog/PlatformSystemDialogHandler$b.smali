.class public final Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$b;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->setActivity(Landroid/app/Activity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lav/p0;",
        "Leu/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.roblox.protocols.systemdialog.PlatformSystemDialogHandler$setActivity$1"
    f = "PlatformSystemDialogHandler.kt"
    l = {
        0x92
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lav/p0;",
        "",
        "<anonymous>",
        "(Lav/p0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:I

.field public w:I

.field public final synthetic x:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Leu/b<",
            "-",
            "Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$b;->x:Landroid/app/Activity;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Leu/b<",
            "*>;)",
            "Leu/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$b;

    iget-object v0, p0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$b;->x:Landroid/app/Activity;

    invoke-direct {p1, v0, p2}, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$b;-><init>(Landroid/app/Activity;Leu/b;)V

    return-object p1
.end method

.method public final invoke(Lav/p0;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lav/p0;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$b;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$b;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$b;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$b;->w:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$b;->u:Ljava/lang/Object;

    check-cast v0, Landroid/app/Activity;

    iget-object v1, p0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$b;->t:Ljava/lang/Object;

    check-cast v1, Lkv/a;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    invoke-static {}, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->access$getContextMutex$p()Lkv/a;

    move-result-object v1

    iget-object p1, p0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$b;->x:Landroid/app/Activity;

    iput-object v1, p0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$b;->t:Ljava/lang/Object;

    iput-object p1, p0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$b;->u:Ljava/lang/Object;

    const/4 v4, 0x0

    iput v4, p0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$b;->v:I

    iput v2, p0, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler$b;->w:I

    invoke-interface {v1, v3, p0}, Lkv/a;->d(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, p1

    :goto_0
    :try_start_0
    invoke-static {}, Lcom/roblox/protocols/systemdialog/PlatformSystemDialogHandler;->access$getCurrentActivity$p()Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1, v3}, Lkv/a;->f(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :catchall_0
    move-exception p1

    invoke-interface {v1, v3}, Lkv/a;->f(Ljava/lang/Object;)V

    throw p1
.end method
