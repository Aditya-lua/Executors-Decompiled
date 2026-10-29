.class public final Lzp/k0$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnu/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzp/k0$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field public final synthetic a:Lzp/k0;


# direct methods
.method public constructor <init>(Lzp/k0;)V
    .locals 0

    iput-object p1, p0, Lzp/k0$d$a;->a:Lzp/k0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lcom/withpersona/sdk2/camera/d;Lnt/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/camera/d;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p2, Lcom/withpersona/sdk2/camera/d$b;->a:Lcom/withpersona/sdk2/camera/d$b;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-object p1, p0, Lzp/k0$d$a;->a:Lzp/k0;

    invoke-static {p1}, Lzp/k0;->q(Lzp/k0;)Lkotlin/jvm/functions/Function1;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance p2, Lfn/v0;

    invoke-direct {p2}, Lfn/v0;-><init>()V

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    instance-of p2, p1, Lcom/withpersona/sdk2/camera/d$a;

    if-eqz p2, :cond_1

    check-cast p1, Lcom/withpersona/sdk2/camera/d$a;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/camera/d$a;->a()Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lzp/k0$d$a;->a:Lzp/k0;

    invoke-static {p2}, Lzp/k0;->q(Lzp/k0;)Lkotlin/jvm/functions/Function1;

    move-result-object p2

    if-eqz p2, :cond_1

    new-instance v0, Lfn/l0;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/camera/d$a;->b()Z

    move-result p1

    invoke-direct {v0, p1}, Lfn/l0;-><init>(Z)V

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/camera/d;

    invoke-virtual {p0, p1, p2}, Lzp/k0$d$a;->b(Lcom/withpersona/sdk2/camera/d;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
