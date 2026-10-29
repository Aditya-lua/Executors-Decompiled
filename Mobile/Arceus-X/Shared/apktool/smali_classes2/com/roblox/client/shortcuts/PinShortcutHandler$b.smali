.class public final Lcom/roblox/client/shortcuts/PinShortcutHandler$b;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/shortcuts/PinShortcutHandler;->requestPinShortcut(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)V
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
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lku/p0;",
        "",
        "<anonymous>",
        "(Lku/p0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.roblox.client.shortcuts.PinShortcutHandler$requestPinShortcut$1"
    f = "PinShortcutHandler.kt"
    l = {
        0x7a,
        0x9d
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public synthetic A:Ljava/lang/Object;

.field public final synthetic B:Ljava/lang/String;

.field public final synthetic C:Landroid/net/Uri;

.field public final synthetic D:J

.field public final synthetic E:Ljava/lang/String;

.field public final synthetic F:Ljava/lang/String;

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public y:Z

.field public z:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/net/Uri;JLjava/lang/String;Ljava/lang/String;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroid/net/Uri;",
            "J",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lnt/b<",
            "-",
            "Lcom/roblox/client/shortcuts/PinShortcutHandler$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->B:Ljava/lang/String;

    iput-object p2, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->C:Landroid/net/Uri;

    iput-wide p3, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->D:J

    iput-object p5, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->E:Ljava/lang/String;

    iput-object p6, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->F:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 8
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

    new-instance v0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;

    iget-object v1, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->B:Ljava/lang/String;

    iget-object v2, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->C:Landroid/net/Uri;

    iget-wide v3, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->D:J

    iget-object v5, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->E:Ljava/lang/String;

    iget-object v6, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->F:Ljava/lang/String;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;-><init>(Ljava/lang/String;Landroid/net/Uri;JLjava/lang/String;Ljava/lang/String;Lnt/b;)V

    iput-object p1, v0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->A:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->A:Ljava/lang/Object;

    check-cast v0, Lku/p0;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->z:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->x:Ljava/lang/Object;

    check-cast v0, Lm2/c;

    iget-object v0, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->w:Ljava/lang/Object;

    check-cast v0, Landroid/app/PendingIntent;

    iget-object v0, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->v:Ljava/lang/Object;

    check-cast v0, Landroid/content/Intent;

    iget-object v0, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->u:Ljava/lang/Object;

    check-cast v0, Landroidx/core/graphics/drawable/IconCompat;

    iget-object v0, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->t:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v2, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->t:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    invoke-static {}, Lcom/roblox/client/RobloxApplication;->f()Landroid/content/Context;

    move-result-object v2

    sget-object p1, Lcom/roblox/client/shortcuts/PinShortcutHandler;->INSTANCE:Lcom/roblox/client/shortcuts/PinShortcutHandler;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v5, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->B:Ljava/lang/String;

    iput-object v0, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->A:Ljava/lang/Object;

    iput-object v2, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->t:Ljava/lang/Object;

    iput v4, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->z:I

    invoke-static {p1, v2, v5, p0}, Lcom/roblox/client/shortcuts/PinShortcutHandler;->access$loadIcon(Lcom/roblox/client/shortcuts/PinShortcutHandler;Landroid/content/Context;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto/16 :goto_2

    :cond_3
    :goto_0
    check-cast p1, Landroidx/core/graphics/drawable/IconCompat;

    new-instance v4, Landroid/content/Intent;

    const-string v5, "android.intent.action.VIEW"

    iget-object v6, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->C:Landroid/net/Uri;

    invoke-direct {v4, v5, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v4

    const-string v5, "setPackage(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v5, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->D:J

    long-to-int v5, v5

    new-instance v6, Landroid/content/Intent;

    const-class v7, Lcom/roblox/client/shortcuts/PinShortcutConfirmationReceiver;

    invoke-direct {v6, v2, v7}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v7, "placeId"

    iget-wide v8, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->D:J

    invoke-virtual {v6, v7, v8, v9}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    move-result-object v6

    const/high16 v7, 0xc000000

    invoke-static {v2, v5, v6, v7}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v5

    new-instance v6, Lm2/c$b;

    iget-object v7, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->E:Ljava/lang/String;

    invoke-direct {v6, v2, v7}, Lm2/c$b;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iget-object v7, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->F:Ljava/lang/String;

    invoke-virtual {v6, v7}, Lm2/c$b;->h(Ljava/lang/CharSequence;)Lm2/c$b;

    move-result-object v6

    invoke-virtual {v6, p1}, Lm2/c$b;->c(Landroidx/core/graphics/drawable/IconCompat;)Lm2/c$b;

    move-result-object v6

    invoke-virtual {v6, v4}, Lm2/c$b;->d(Landroid/content/Intent;)Lm2/c$b;

    move-result-object v6

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v7

    invoke-interface {v7}, Lth/i;->G1()Z

    move-result v7

    if-eqz v7, :cond_4

    sget-object v7, Lyj/f;->a:Lyj/f;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v7, v2}, Lyj/f;->b(Landroid/content/Context;)Landroid/content/ComponentName;

    move-result-object v7

    invoke-virtual {v6, v7}, Lm2/c$b;->b(Landroid/content/ComponentName;)Lm2/c$b;

    :cond_4
    invoke-virtual {v6}, Lm2/c$b;->a()Lm2/c;

    move-result-object v6

    const-string v7, "build(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    sget-object v7, Ljt/n;->b:Ljt/n$a;

    invoke-virtual {v5}, Landroid/app/PendingIntent;->getIntentSender()Landroid/content/IntentSender;

    move-result-object v7

    invoke-static {v2, v6, v7}, Lm2/e;->l(Landroid/content/Context;Lm2/c;Landroid/content/IntentSender;)Z

    move-result v7

    invoke-static {v7}, Lpt/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-static {v7}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v7

    sget-object v8, Ljt/n;->b:Ljt/n$a;

    invoke-static {v7}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v7

    invoke-static {v7}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    :goto_1
    iget-wide v8, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->D:J

    invoke-static {v7}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v10

    if-nez v10, :cond_6

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    sget-object v8, Lyj/b;->a:Lyj/b;

    iget-wide v9, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->D:J

    invoke-virtual {v8, v9, v10}, Lyj/b;->d(J)V

    if-eqz v7, :cond_5

    sget-object v8, Lcom/roblox/client/shortcuts/PinShortcutHandler;->INSTANCE:Lcom/roblox/client/shortcuts/PinShortcutHandler;

    invoke-static {v8}, Lcom/roblox/client/shortcuts/PinShortcutHandler;->access$getSilentManufacturers(Lcom/roblox/client/shortcuts/PinShortcutHandler;)Ljava/util/Set;

    move-result-object v9

    invoke-virtual {v8}, Lcom/roblox/client/shortcuts/PinShortcutHandler;->getManufacturerProvider$NativeShell_googleProdRelease()Lkotlin/jvm/functions/Function0;

    move-result-object v10

    invoke-interface {v10}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    sget-object v11, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v10, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v10

    const-string v11, "toLowerCase(...)"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v9, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    iget-wide v9, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->D:J

    invoke-virtual {v8, v9, v10}, Lcom/roblox/client/shortcuts/PinShortcutHandler;->onPinConfirmed$NativeShell_googleProdRelease(J)V

    invoke-static {}, Lku/g1;->c()Lku/n2;

    move-result-object v8

    new-instance v9, Lcom/roblox/client/shortcuts/PinShortcutHandler$b$a;

    iget-object v10, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->F:Ljava/lang/String;

    const/4 v11, 0x0

    invoke-direct {v9, v2, v10, v11}, Lcom/roblox/client/shortcuts/PinShortcutHandler$b$a;-><init>(Landroid/content/Context;Ljava/lang/String;Lnt/b;)V

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->A:Ljava/lang/Object;

    invoke-static {v2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->t:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->u:Ljava/lang/Object;

    invoke-static {v4}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->v:Ljava/lang/Object;

    invoke-static {v5}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->w:Ljava/lang/Object;

    invoke-static {v6}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->x:Ljava/lang/Object;

    iput-boolean v7, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->y:Z

    iput v3, p0, Lcom/roblox/client/shortcuts/PinShortcutHandler$b;->z:I

    invoke-static {v8, v9, p0}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Pin request rejected for placeId="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ": "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "PinShortcutHandler"

    invoke-static {v0, p1}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
