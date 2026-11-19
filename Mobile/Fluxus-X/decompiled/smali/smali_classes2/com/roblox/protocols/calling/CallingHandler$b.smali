.class public final Lcom/roblox/protocols/calling/CallingHandler$b;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/protocols/calling/CallingHandler;
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
    c = "com.roblox.protocols.calling.CallingHandler$fetchAvatar$1$1"
    f = "CallingHandler.kt"
    l = {
        0x3d
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

.field public u:I

.field public final synthetic v:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Landroid/graphics/Bitmap;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic w:Landroid/content/Context;

.field public final synthetic x:J


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Landroid/content/Context;JLeu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/graphics/Bitmap;",
            "Lkotlin/Unit;",
            ">;",
            "Landroid/content/Context;",
            "J",
            "Leu/b<",
            "-",
            "Lcom/roblox/protocols/calling/CallingHandler$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/protocols/calling/CallingHandler$b;->v:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/roblox/protocols/calling/CallingHandler$b;->w:Landroid/content/Context;

    iput-wide p3, p0, Lcom/roblox/protocols/calling/CallingHandler$b;->x:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 6
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

    new-instance v0, Lcom/roblox/protocols/calling/CallingHandler$b;

    iget-object v1, p0, Lcom/roblox/protocols/calling/CallingHandler$b;->v:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lcom/roblox/protocols/calling/CallingHandler$b;->w:Landroid/content/Context;

    iget-wide v3, p0, Lcom/roblox/protocols/calling/CallingHandler$b;->x:J

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/roblox/protocols/calling/CallingHandler$b;-><init>(Lkotlin/jvm/functions/Function1;Landroid/content/Context;JLeu/b;)V

    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lcom/roblox/protocols/calling/CallingHandler$b;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lcom/roblox/protocols/calling/CallingHandler$b;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/roblox/protocols/calling/CallingHandler$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lcom/roblox/protocols/calling/CallingHandler$b;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/roblox/protocols/calling/CallingHandler$b;->u:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/roblox/protocols/calling/CallingHandler$b;->t:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/roblox/protocols/calling/CallingHandler$b;->v:Lkotlin/jvm/functions/Function1;

    sget-object v1, Lcom/roblox/protocols/calling/CallingHandler;->INSTANCE:Lcom/roblox/protocols/calling/CallingHandler;

    invoke-static {v1}, Lcom/roblox/protocols/calling/CallingHandler;->access$getIoScope(Lcom/roblox/protocols/calling/CallingHandler;)Lav/p0;

    move-result-object v3

    new-instance v4, Lcom/roblox/protocols/calling/CallingHandler$b$a;

    iget-object v5, p0, Lcom/roblox/protocols/calling/CallingHandler$b;->w:Landroid/content/Context;

    iget-wide v6, p0, Lcom/roblox/protocols/calling/CallingHandler$b;->x:J

    const/4 v8, 0x0

    invoke-direct {v4, v5, v6, v7, v8}, Lcom/roblox/protocols/calling/CallingHandler$b$a;-><init>(Landroid/content/Context;JLeu/b;)V

    iput-object p1, p0, Lcom/roblox/protocols/calling/CallingHandler$b;->t:Ljava/lang/Object;

    iput v2, p0, Lcom/roblox/protocols/calling/CallingHandler$b;->u:I

    invoke-virtual {v1, v3, v4, p0}, Lcom/roblox/protocols/calling/CallingHandler;->loadAvatarWithTimeout$NativeShell_googleProdRelease(Lav/p0;Lkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, p1

    move-object p1, v1

    :goto_0
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
