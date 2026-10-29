.class public final Loo/a$e$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnu/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loo/a$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field public final synthetic a:Lnu/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnu/i<",
            "Loo/a$c;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic b:Loo/a;


# direct methods
.method public constructor <init>(Lnu/i;Loo/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu/i<",
            "-",
            "Loo/a$c;",
            ">;",
            "Loo/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Loo/a$e$a;->a:Lnu/i;

    iput-object p2, p0, Loo/a$e$a;->b:Loo/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    check-cast p1, Ljt/n;

    invoke-virtual {p1}, Ljt/n;->j()Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Loo/a$e$a;->a:Lnu/i;

    iget-object v1, p0, Loo/a$e$a;->b:Loo/a;

    invoke-static {p1}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_0

    check-cast p1, Lfn/j0;

    invoke-static {v1, p1}, Loo/a;->e(Loo/a;Lfn/j0;)Loo/a$c;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    invoke-interface {v0, p1, p2}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
