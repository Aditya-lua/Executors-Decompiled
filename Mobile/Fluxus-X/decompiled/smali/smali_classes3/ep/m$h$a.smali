.class public final Lep/m$h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldv/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lep/m$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field public final synthetic a:Lep/m;

.field public final synthetic b:Lep/f1;


# direct methods
.method public constructor <init>(Lep/m;Lep/f1;)V
    .locals 0

    iput-object p1, p0, Lep/m$h$a;->a:Lep/m;

    iput-object p2, p0, Lep/m$h$a;->b:Lep/f1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lvo/d2$b;Leu/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvo/d2$b;",
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
    iget-object p2, p0, Lep/m$h$a;->a:Lep/m;

    invoke-static {p2}, Lep/m;->t2(Lep/m;)Lkotlin/jvm/functions/Function1;

    move-result-object p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lep/m$h$a;->b:Lep/f1;

    invoke-virtual {p2}, Lls/d;->a()Ldv/c0;

    move-result-object p2

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ldv/c0;->setValue(Ljava/lang/Object;)V

    iget-object p2, p0, Lep/m$h$a;->a:Lep/m;

    invoke-static {p2}, Lep/m;->t2(Lep/m;)Lkotlin/jvm/functions/Function1;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lvo/d2$b;

    invoke-virtual {p0, p1, p2}, Lep/m$h$a;->b(Lvo/d2$b;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
