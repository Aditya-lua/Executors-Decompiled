.class public final Lep/f1$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldv/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lep/f1$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field public final synthetic a:Lep/f1;


# direct methods
.method public constructor <init>(Lep/f1;)V
    .locals 0

    iput-object p1, p0, Lep/f1$b$a;->a:Lep/f1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lvo/d2$a;Leu/b;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvo/d2$a;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lep/f1$b$a;->a:Lep/f1;

    invoke-virtual {v0}, Lls/d;->d()Lls/g;

    move-result-object v1

    invoke-virtual {v1}, Lls/g;->i()Lls/h;

    move-result-object v1

    check-cast v1, Lvo/j0;

    if-nez v1, :cond_0

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_0
    invoke-static {v0, p1, v1, p2}, Lep/f1;->W(Lep/f1;Lvo/d2$a;Lvo/j0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lvo/d2$a;

    invoke-virtual {p0, p1, p2}, Lep/f1$b$a;->b(Lvo/d2$a;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
