.class public final Lnq/k0$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldv/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnq/k0$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field public final synthetic a:Lnq/k0;


# direct methods
.method public constructor <init>(Lnq/k0;)V
    .locals 0

    iput-object p1, p0, Lnq/k0$d$a;->a:Lnq/k0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lsn/y;Leu/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsn/y;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p2, Lsn/y$b;->a:Lsn/y$b;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p1, p0, Lnq/k0$d$a;->a:Lnq/k0;

    invoke-static {p1}, Lnq/k0;->q(Lnq/k0;)Lkotlin/jvm/functions/Function1;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance p2, Lsn/j1;

    invoke-direct {p2}, Lsn/j1;-><init>()V

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    instance-of p2, p1, Lsn/y$a;

    if-eqz p2, :cond_1

    check-cast p1, Lsn/y$a;

    invoke-virtual {p1}, Lsn/y$a;->a()Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lnq/k0$d$a;->a:Lnq/k0;

    invoke-static {p2}, Lnq/k0;->q(Lnq/k0;)Lkotlin/jvm/functions/Function1;

    move-result-object p2

    if-eqz p2, :cond_1

    new-instance v0, Lsn/z0;

    invoke-virtual {p1}, Lsn/y$a;->b()Z

    move-result p1

    invoke-direct {v0, p1}, Lsn/z0;-><init>(Z)V

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lsn/y;

    invoke-virtual {p0, p1, p2}, Lnq/k0$d$a;->b(Lsn/y;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
