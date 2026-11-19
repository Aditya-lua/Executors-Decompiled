.class public final Lls/g$d$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldv/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lls/g$d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Ldv/i;"
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
.field public final synthetic a:Lls/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lls/g<",
            "TState;>;"
        }
    .end annotation
.end field

.field public final synthetic b:Lls/g$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lls/g$b<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lls/g;Lls/g$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lls/g<",
            "TState;>;",
            "Lls/g$b<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lls/g$d$a$a;->a:Lls/g;

    iput-object p2, p0, Lls/g$d$a$a;->b:Lls/g$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lls/g$d$a$a;->a:Lls/g;

    invoke-static {p2}, Lls/g;->b(Lls/g;)Lav/p0;

    move-result-object v0

    new-instance v3, Lls/g$d$a$a$a;

    iget-object p2, p0, Lls/g$d$a$a;->b:Lls/g$b;

    const/4 v1, 0x0

    invoke-direct {v3, p2, p1, v1}, Lls/g$d$a$a$a;-><init>(Lls/g$b;Ljava/lang/Object;Leu/b;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lav/i;->d(Lav/p0;Lkotlin/coroutines/CoroutineContext;Lav/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lav/d2;

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
