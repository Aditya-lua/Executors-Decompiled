.class public final Lhq/c$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldv/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhq/c$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field public final synthetic a:Liq/l;

.field public final synthetic b:Lhq/c;


# direct methods
.method public constructor <init>(Liq/l;Lhq/c;)V
    .locals 0

    iput-object p1, p0, Lhq/c$f$a;->a:Liq/l;

    iput-object p2, p0, Lhq/c$f$a;->b:Lhq/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Lfq/n1$a;Leu/b;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfq/n1$a;",
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
    iget-object p2, p0, Lhq/c$f$a;->a:Liq/l;

    invoke-virtual {p2}, Lls/d;->a()Ldv/c0;

    move-result-object p2

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ldv/c0;->setValue(Ljava/lang/Object;)V

    iget-object p2, p0, Lhq/c$f$a;->b:Lhq/c;

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lhq/c$f$a;->b:Lhq/c;

    new-instance v2, Lhq/c$d;

    invoke-static {v1}, Lhq/c;->k2(Lhq/c;)Lhq/c$c;

    move-result-object v1

    invoke-virtual {v1}, Lhq/c$c;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lfq/n1$a;->a()Lfq/t1;

    move-result-object p1

    invoke-direct {v2, v1, p1}, Lhq/c$d;-><init>(Ljava/lang/String;Lfq/t1;)V

    const-string p1, "pi2_result"

    invoke-virtual {v0, p1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    const-string p1, "pi2_permission_request_request"

    invoke-static {p2, p1, v0}, Lf4/b0;->a(Lf4/q;Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object p1, p0, Lhq/c$f$a;->b:Lhq/c;

    invoke-virtual {p1}, Lf4/q;->L()Lf4/k0;

    move-result-object p1

    const-string p2, "getParentFragmentManager(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lhq/c$f$a;->b:Lhq/c;

    invoke-virtual {p1}, Lf4/k0;->r()Lf4/t0;

    move-result-object p1

    invoke-virtual {p1, p2}, Lf4/t0;->m(Lf4/q;)Lf4/t0;

    invoke-virtual {p1}, Lf4/t0;->g()I

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lfq/n1$a;

    invoke-virtual {p0, p1, p2}, Lhq/c$f$a;->b(Lfq/n1$a;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
