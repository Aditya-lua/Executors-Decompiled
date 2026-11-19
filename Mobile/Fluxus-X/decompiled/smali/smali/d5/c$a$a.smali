.class public final Ld5/c$a$a;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld5/c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "-TR;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1"
    f = "DBUtil.android.kt"
    l = {
        0x104
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\u0008\u0000\u0010\u0000*\u00020\u0001H\n"
    }
    d2 = {
        "R",
        "Lav/p0;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Ly4/u;

.field public final synthetic v:Z

.field public final synthetic w:Z

.field public final synthetic x:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lg5/b;",
            "TR;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ly4/u;ZZLkotlin/jvm/functions/Function1;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly4/u;",
            "ZZ",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lg5/b;",
            "+TR;>;",
            "Leu/b<",
            "-",
            "Ld5/c$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ld5/c$a$a;->u:Ly4/u;

    iput-boolean p2, p0, Ld5/c$a$a;->v:Z

    iput-boolean p3, p0, Ld5/c$a$a;->w:Z

    iput-object p4, p0, Ld5/c$a$a;->x:Lkotlin/jvm/functions/Function1;

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

    new-instance v0, Ld5/c$a$a;

    iget-object v1, p0, Ld5/c$a$a;->u:Ly4/u;

    iget-boolean v2, p0, Ld5/c$a$a;->v:Z

    iget-boolean v3, p0, Ld5/c$a$a;->w:Z

    iget-object v4, p0, Ld5/c$a$a;->x:Lkotlin/jvm/functions/Function1;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Ld5/c$a$a;-><init>(Ly4/u;ZZLkotlin/jvm/functions/Function1;Leu/b;)V

    return-object v0
.end method

.method public final invoke(Lav/p0;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lav/p0;",
            "Leu/b<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Ld5/c$a$a;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Ld5/c$a$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Ld5/c$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Ld5/c$a$a;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ld5/c$a$a;->t:I

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

    iget-object p1, p0, Ld5/c$a$a;->u:Ly4/u;

    invoke-virtual {p1}, Ly4/u;->F()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Ld5/c$a$a;->u:Ly4/u;

    invoke-virtual {p1}, Ly4/u;->G()Z

    move-result p1

    if-nez p1, :cond_3

    :cond_2
    iget-boolean p1, p0, Ld5/c$a$a;->v:Z

    if-eqz p1, :cond_3

    move v4, v2

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    move v4, p1

    :goto_0
    iget-object v6, p0, Ld5/c$a$a;->u:Ly4/u;

    iget-boolean v5, p0, Ld5/c$a$a;->w:Z

    iget-object v8, p0, Ld5/c$a$a;->x:Lkotlin/jvm/functions/Function1;

    new-instance v3, Ld5/c$a$a$a;

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v8}, Ld5/c$a$a$a;-><init>(ZZLy4/u;Leu/b;Lkotlin/jvm/functions/Function1;)V

    iput v2, p0, Ld5/c$a$a;->t:I

    invoke-virtual {v6, v5, v3, p0}, Ly4/u;->W(ZLkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    return-object p1
.end method
