.class public final Ltq/k2$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldv/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltq/k2$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field public final synthetic a:Ltq/k2;


# direct methods
.method public constructor <init>(Ltq/k2;)V
    .locals 0

    iput-object p1, p0, Ltq/k2$b$a;->a:Ltq/k2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lmq/q5$b;Leu/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmq/q5$b;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Ltq/k2$b$a;->a:Ltq/k2;

    invoke-virtual {p2}, Lls/d;->d()Lls/g;

    move-result-object v0

    invoke-virtual {v0}, Lls/g;->i()Lls/h;

    move-result-object v0

    check-cast v0, Lmq/y0;

    if-nez v0, :cond_0

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_0
    invoke-virtual {p2, p1, v0}, Ltq/k2;->d1(Lmq/q5$b;Lmq/y0;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmq/q5$b;

    invoke-virtual {p0, p1, p2}, Ltq/k2$b$a;->b(Lmq/q5$b;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
