.class public final Lhs/g1$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldv/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhs/g1$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field public final synthetic a:Lhs/g1;


# direct methods
.method public constructor <init>(Lhs/g1;)V
    .locals 0

    iput-object p1, p0, Lhs/g1$c$a;->a:Lhs/g1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;Leu/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p1, p0, Lhs/g1$c$a;->a:Lhs/g1;

    invoke-virtual {p1}, Lls/d;->d()Lls/g;

    move-result-object p1

    invoke-virtual {p1}, Lls/g;->i()Lls/h;

    move-result-object p1

    check-cast p1, Les/i4;

    if-nez p1, :cond_0

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_0
    iget-object p2, p0, Lhs/g1$c$a;->a:Lhs/g1;

    invoke-virtual {p2}, Lls/d;->b()Ldv/c0;

    move-result-object v0

    invoke-interface {v0}, Ldv/c0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Les/s6$b;

    invoke-static {p2, v0, p1}, Lhs/g1;->J(Lhs/g1;Les/s6$b;Les/i4;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lhs/g1$c$a;->b(Ljava/lang/String;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
