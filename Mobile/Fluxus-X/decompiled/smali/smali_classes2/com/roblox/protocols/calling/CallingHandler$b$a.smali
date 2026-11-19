.class public final Lcom/roblox/protocols/calling/CallingHandler$b$a;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/protocols/calling/CallingHandler$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function1<",
        "Leu/b<",
        "-",
        "Landroid/graphics/Bitmap;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.roblox.protocols.calling.CallingHandler$fetchAvatar$1$1$1"
    f = "CallingHandler.kt"
    l = {
        0x3d
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Landroid/graphics/Bitmap;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Landroid/content/Context;

.field public final synthetic v:J


# direct methods
.method public constructor <init>(Landroid/content/Context;JLeu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "J",
            "Leu/b<",
            "-",
            "Lcom/roblox/protocols/calling/CallingHandler$b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/protocols/calling/CallingHandler$b$a;->u:Landroid/content/Context;

    iput-wide p2, p0, Lcom/roblox/protocols/calling/CallingHandler$b$a;->v:J

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Leu/b;)Leu/b;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "*>;)",
            "Leu/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/roblox/protocols/calling/CallingHandler$b$a;

    iget-object v1, p0, Lcom/roblox/protocols/calling/CallingHandler$b$a;->u:Landroid/content/Context;

    iget-wide v2, p0, Lcom/roblox/protocols/calling/CallingHandler$b$a;->v:J

    invoke-direct {v0, v1, v2, v3, p1}, Lcom/roblox/protocols/calling/CallingHandler$b$a;-><init>(Landroid/content/Context;JLeu/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Leu/b;

    invoke-virtual {p0, p1}, Lcom/roblox/protocols/calling/CallingHandler$b$a;->m(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/roblox/protocols/calling/CallingHandler$b$a;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    sget-object p1, Lrj/b0;->a:Lrj/b0;

    iget-object v1, p0, Lcom/roblox/protocols/calling/CallingHandler$b$a;->u:Landroid/content/Context;

    iget-wide v3, p0, Lcom/roblox/protocols/calling/CallingHandler$b$a;->v:J

    iput v2, p0, Lcom/roblox/protocols/calling/CallingHandler$b$a;->t:I

    invoke-virtual {p1, v1, v3, v4, p0}, Lrj/b0;->d(Landroid/content/Context;JLeu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method

.method public final m(Leu/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "-",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/roblox/protocols/calling/CallingHandler$b$a;->create(Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lcom/roblox/protocols/calling/CallingHandler$b$a;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lcom/roblox/protocols/calling/CallingHandler$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
