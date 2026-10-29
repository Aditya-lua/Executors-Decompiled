.class public final Lvr/f$d$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnu/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvr/f$d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lnu/i;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lvr/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvr/f<",
            "TState;>;"
        }
    .end annotation
.end field

.field public final synthetic b:Lvr/f$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvr/f$b<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lvr/f;Lvr/f$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvr/f<",
            "TState;>;",
            "Lvr/f$b<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lvr/f$d$a$a;->a:Lvr/f;

    iput-object p2, p0, Lvr/f$d$a$a;->b:Lvr/f$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lvr/f$d$a$a;->a:Lvr/f;

    invoke-static {p2}, Lvr/f;->b(Lvr/f;)Lku/p0;

    move-result-object v0

    new-instance v3, Lvr/f$d$a$a$a;

    iget-object p2, p0, Lvr/f$d$a$a;->b:Lvr/f$b;

    const/4 v1, 0x0

    invoke-direct {v3, p2, p1, v1}, Lvr/f$d$a$a$a;-><init>(Lvr/f$b;Ljava/lang/Object;Lnt/b;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
