.class public final Lhp/e0$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnu/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhp/e0$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field public final synthetic a:Lhp/e0;


# direct methods
.method public constructor <init>(Lhp/e0;)V
    .locals 0

    iput-object p1, p0, Lhp/e0$d$a;->a:Lhp/e0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lpq/a;Lnt/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpq/a;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p2, p1, Lpq/a$a;

    if-eqz p2, :cond_0

    iget-object p2, p0, Lhp/e0$d$a;->a:Lhp/e0;

    check-cast p1, Lpq/a$a;

    invoke-virtual {p1}, Lpq/a$a;->a()Z

    move-result v0

    invoke-virtual {p1}, Lpq/a$a;->b()Z

    move-result p1

    invoke-static {p2, v0, p1}, Lhp/e0;->D(Lhp/e0;ZZ)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_0
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lpq/a;

    invoke-virtual {p0, p1, p2}, Lhp/e0$d$a;->b(Lpq/a;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
