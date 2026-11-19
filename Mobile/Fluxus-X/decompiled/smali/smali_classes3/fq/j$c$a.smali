.class public final Lfq/j$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldv/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfq/j$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field public final synthetic a:Ldv/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldv/i<",
            "Lfq/j$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldv/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldv/i<",
            "-",
            "Lfq/j$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfq/j$c$a;->a:Ldv/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lg/a;Leu/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg/a;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lg/a;->f()I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lfq/j$c$a;->a:Ldv/i;

    sget-object v0, Lfq/j$b$c;->a:Lfq/j$b$c;

    invoke-interface {p1, v0, p2}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_1
    iget-object p1, p0, Lfq/j$c$a;->a:Ldv/i;

    sget-object v0, Lfq/j$b$a;->a:Lfq/j$b$a;

    invoke-interface {p1, v0, p2}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lg/a;

    invoke-virtual {p0, p1, p2}, Lfq/j$c$a;->b(Lg/a;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
