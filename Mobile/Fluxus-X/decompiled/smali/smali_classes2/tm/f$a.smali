.class public final Ltm/f$a;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltm/f;->c(Ljava/lang/String;)Ldv/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Ldv/i<",
        "-",
        "Ltm/g;",
        ">;",
        "Leu/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.roblox.universalapp.externalidentity.GoogleSignInManager$acquireGoogleCredentials$1"
    f = "GoogleSignInManager.kt"
    l = {
        0x18,
        0x21,
        0x35
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Ldv/i;",
        "Ltm/g;",
        "",
        "<anonymous>",
        "(Ldv/i;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic A:Ltm/f;

.field public final synthetic B:Ljava/lang/String;

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:I

.field public y:I

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ltm/f;Ljava/lang/String;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltm/f;",
            "Ljava/lang/String;",
            "Leu/b<",
            "-",
            "Ltm/f$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ltm/f$a;->A:Ltm/f;

    iput-object p2, p0, Ltm/f$a;->B:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Leu/b<",
            "*>;)",
            "Leu/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Ltm/f$a;

    iget-object v1, p0, Ltm/f$a;->A:Ltm/f;

    iget-object v2, p0, Ltm/f$a;->B:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p2}, Ltm/f$a;-><init>(Ltm/f;Ljava/lang/String;Leu/b;)V

    iput-object p1, v0, Ltm/f$a;->z:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldv/i;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Ltm/f$a;->m(Ldv/i;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Ltm/f$a;->z:Ljava/lang/Object;

    check-cast v0, Ldv/i;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Ltm/f$a;->y:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Ltm/f$a;->t:Ljava/lang/Object;

    check-cast v0, Ltm/g;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v2, p0, Ltm/f$a;->w:Ljava/lang/Object;

    check-cast v2, Le3/k0;

    iget-object v2, p0, Ltm/f$a;->v:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v2, p0, Ltm/f$a;->u:Ljava/lang/Object;

    check-cast v2, Lic/c;

    iget-object v2, p0, Ltm/f$a;->t:Ljava/lang/Object;

    check-cast v2, Ldv/i;

    :try_start_0
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    :cond_2
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    sget-object p1, Ltm/g$c;->a:Ltm/g$c;

    iput-object v0, p0, Ltm/f$a;->z:Ljava/lang/Object;

    iput v5, p0, Ltm/f$a;->y:I

    invoke-interface {v0, p1, p0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto/16 :goto_6

    :cond_4
    :goto_0
    iget-object p1, p0, Ltm/f$a;->A:Ltm/f;

    iget-object v2, p0, Ltm/f$a;->B:Ljava/lang/String;

    :try_start_1
    sget-object v5, Lzt/n;->b:Lzt/n$a;

    invoke-virtual {p1}, Ltm/f;->e()Lj/b;

    move-result-object v5

    sget v6, Ldm/a;->a:I

    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "getString(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lic/c$a;

    invoke-direct {v6, v5}, Lic/c$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v2}, Lic/c$a;->b(Ljava/lang/String;)Lic/c$a;

    move-result-object v2

    invoke-virtual {v2}, Lic/c$a;->a()Lic/c;

    move-result-object v2

    new-instance v6, Le3/k0$a;

    invoke-direct {v6}, Le3/k0$a;-><init>()V

    invoke-virtual {v6, v2}, Le3/k0$a;->a(Le3/r;)Le3/k0$a;

    move-result-object v6

    invoke-virtual {v6}, Le3/k0$a;->b()Le3/k0;

    move-result-object v6

    invoke-static {p1}, Ltm/f;->b(Ltm/f;)Le3/o;

    move-result-object v7

    invoke-virtual {p1}, Ltm/f;->e()Lj/b;

    move-result-object p1

    iput-object v0, p0, Ltm/f$a;->z:Ljava/lang/Object;

    invoke-static {v0}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, p0, Ltm/f$a;->t:Ljava/lang/Object;

    invoke-static {v2}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Ltm/f$a;->u:Ljava/lang/Object;

    invoke-static {v5}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Ltm/f$a;->v:Ljava/lang/Object;

    invoke-static {v6}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Ltm/f$a;->w:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, p0, Ltm/f$a;->x:I

    iput v4, p0, Ltm/f$a;->y:I

    invoke-interface {v7, p1, v6, p0}, Le3/o;->c(Landroid/content/Context;Le3/k0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto/16 :goto_6

    :cond_5
    :goto_1
    check-cast p1, Le3/l0;

    invoke-virtual {p1}, Le3/l0;->a()Le3/m;

    move-result-object p1

    instance-of v2, p1, Le3/i0;

    if-eqz v2, :cond_6

    invoke-virtual {p1}, Le3/m;->b()Ljava/lang/String;

    move-result-object v2

    const-string v4, "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    sget-object v2, Lic/d;->m:Lic/d$b;

    invoke-virtual {p1}, Le3/m;->a()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v2, p1}, Lic/d$b;->a(Landroid/os/Bundle;)Lic/d;

    move-result-object p1

    new-instance v2, Ltm/g$d;

    invoke-virtual {p1}, Lic/d;->c()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Ltm/g$d;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :cond_6
    new-instance v2, Ltm/g$b;

    const-string p1, "UnexpectedCredentialType"

    invoke-direct {v2, p1}, Ltm/g$b;-><init>(Ljava/lang/String;)V

    :goto_2
    invoke-static {v2}, Lzt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_4

    :goto_3
    sget-object v2, Lzt/n;->b:Lzt/n$a;

    invoke-static {p1}, Lzt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lzt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_4
    invoke-static {p1}, Lzt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_7

    goto :goto_5

    :cond_7
    instance-of p1, v2, Lf3/l;

    if-eqz p1, :cond_8

    sget-object p1, Ltm/g$a;->a:Ltm/g$a;

    goto :goto_5

    :cond_8
    new-instance p1, Ltm/g$b;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    const-string v4, "getSimpleName(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, v2}, Ltm/g$b;-><init>(Ljava/lang/String;)V

    :goto_5
    check-cast p1, Ltm/g;

    invoke-static {v0}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Ltm/f$a;->z:Ljava/lang/Object;

    invoke-static {p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Ltm/f$a;->t:Ljava/lang/Object;

    const/4 v2, 0x0

    iput-object v2, p0, Ltm/f$a;->u:Ljava/lang/Object;

    iput-object v2, p0, Ltm/f$a;->v:Ljava/lang/Object;

    iput-object v2, p0, Ltm/f$a;->w:Ljava/lang/Object;

    iput v3, p0, Ltm/f$a;->y:I

    invoke-interface {v0, p1, p0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_6
    return-object v1

    :cond_9
    :goto_7
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final m(Ldv/i;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldv/i<",
            "-",
            "Ltm/g;",
            ">;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Ltm/f$a;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Ltm/f$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Ltm/f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
