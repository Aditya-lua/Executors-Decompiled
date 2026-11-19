.class public final Lis/c$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldv/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lis/c$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field public final synthetic a:Lis/c;

.field public final synthetic b:Lhs/g1;


# direct methods
.method public constructor <init>(Lis/c;Lhs/g1;)V
    .locals 0

    iput-object p1, p0, Lis/c$d$a;->a:Lis/c;

    iput-object p2, p0, Lis/c$d$a;->b:Lhs/g1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Les/s6$c;Leu/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Les/s6$c;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-nez p1, :cond_0

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_0
    iget-object p2, p0, Lis/c$d$a;->a:Lis/c;

    invoke-static {p2}, Lis/c;->k2(Lis/c;)Lkotlin/jvm/functions/Function1;

    move-result-object p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lis/c$d$a;->b:Lhs/g1;

    invoke-virtual {p2}, Lls/d;->a()Ldv/c0;

    move-result-object p2

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ldv/c0;->setValue(Ljava/lang/Object;)V

    iget-object p2, p0, Lis/c$d$a;->a:Lis/c;

    invoke-static {p2}, Lis/c;->k2(Lis/c;)Lkotlin/jvm/functions/Function1;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Les/s6$c;

    invoke-virtual {p0, p1, p2}, Lis/c$d$a;->b(Les/s6$c;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
