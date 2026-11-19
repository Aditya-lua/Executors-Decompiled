.class public final Lyp/d$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldv/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyp/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field public final synthetic a:Lyp/d;


# direct methods
.method public constructor <init>(Lyp/d;)V
    .locals 0

    iput-object p1, p0, Lyp/d$c$a;->a:Lyp/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lvp/s0;Leu/b;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvp/s0;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lyp/d$c$a;->a:Lyp/d;

    invoke-virtual {p2}, Lyp/d;->k2()Lvp/n0;

    move-result-object p2

    iget-object v0, p0, Lyp/d$c$a;->a:Lyp/d;

    invoke-virtual {v0}, Lyq/a;->b2()Ls5/a;

    move-result-object v0

    check-cast v0, Lpp/c;

    iget-object v1, p0, Lyp/d$c$a;->a:Lyp/d;

    invoke-virtual {v1}, Lf4/q;->u()Lf4/k0;

    move-result-object v1

    const-string v2, "getChildFragmentManager(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p1, v0, v1}, Lvp/n0;->h(Lvp/s0;Lpp/c;Lf4/k0;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lvp/s0;

    invoke-virtual {p0, p1, p2}, Lyp/d$c$a;->b(Lvp/s0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
