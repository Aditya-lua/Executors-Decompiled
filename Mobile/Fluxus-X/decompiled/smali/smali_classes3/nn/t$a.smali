.class public final Lnn/t$a;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnn/t;->b(Lnn/s;Landroid/widget/EditText;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lav/p0;",
        "Leu/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.squareup.workflow1.ui.TextControllerControlEditTextKt$control$subscription$1"
    f = "TextControllerControlEditText.kt"
    l = {
        0x2f
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lav/p0;",
        "",
        "<anonymous>",
        "(Lav/p0;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public t:I

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lnn/s;

.field public final synthetic w:Landroid/widget/EditText;


# direct methods
.method public constructor <init>(Lnn/s;Landroid/widget/EditText;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnn/s;",
            "Landroid/widget/EditText;",
            "Leu/b<",
            "-",
            "Lnn/t$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lnn/t$a;->v:Lnn/s;

    iput-object p2, p0, Lnn/t$a;->w:Landroid/widget/EditText;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
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

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lnn/t$a;

    iget-object v1, p0, Lnn/t$a;->v:Lnn/s;

    iget-object v2, p0, Lnn/t$a;->w:Landroid/widget/EditText;

    invoke-direct {v0, v1, v2, p2}, Lnn/t$a;-><init>(Lnn/s;Landroid/widget/EditText;Leu/b;)V

    iput-object p1, v0, Lnn/t$a;->u:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lav/p0;Leu/b;)Ljava/lang/Object;
    .locals 0
    .param p1    # Lav/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Leu/b;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lav/p0;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lnn/t$a;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lnn/t$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lnn/t$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lnn/t$a;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lnn/t$a;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-eq v1, v2, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lnn/t$a;->u:Ljava/lang/Object;

    check-cast p1, Lav/p0;

    iget-object v1, p0, Lnn/t$a;->v:Lnn/s;

    invoke-interface {v1}, Lnn/s;->a()Ldv/h;

    move-result-object v1

    new-instance v3, Lnn/t$a$a;

    iget-object v4, p0, Lnn/t$a;->w:Landroid/widget/EditText;

    const/4 v5, 0x0

    invoke-direct {v3, v4, v5}, Lnn/t$a$a;-><init>(Landroid/widget/EditText;Leu/b;)V

    invoke-static {v1, v3}, Ldv/j;->E(Ldv/h;Lkotlin/jvm/functions/Function2;)Ldv/h;

    move-result-object v1

    invoke-static {v1, p1}, Ldv/j;->z(Ldv/h;Lav/p0;)Lav/d2;

    iget-object p1, p0, Lnn/t$a;->w:Landroid/widget/EditText;

    new-instance v1, Lnn/t$a$b;

    iget-object v3, p0, Lnn/t$a;->v:Lnn/s;

    invoke-direct {v1, v3}, Lnn/t$a$b;-><init>(Lnn/s;)V

    iput v2, p0, Lnn/t$a;->t:I

    invoke-static {p1, v1, p0}, Lnn/t;->a(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    new-instance p1, Lzt/d;

    invoke-direct {p1}, Lzt/d;-><init>()V

    throw p1
.end method
