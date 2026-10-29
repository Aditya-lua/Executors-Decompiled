.class public final Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$d;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lku/p0;",
        "Lnt/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lku/p0;",
        "",
        "<anonymous>",
        "(Lku/p0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.withpersona.sdk2.inquiry.internal.UiStepSavedStateHelper$saveComponentConfigs$2"
    f = "UiStepSavedStateHelper.kt"
    l = {
        0x60
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:I

.field public final synthetic v:Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;

.field public final synthetic w:Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$UiStepUiComponentConfig;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$UiStepUiComponentConfig;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;",
            "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$UiStepUiComponentConfig;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$d;->v:Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$d;->w:Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$UiStepUiComponentConfig;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lnt/b<",
            "*>;)",
            "Lnt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$d;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$d;->v:Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$d;->w:Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$UiStepUiComponentConfig;

    invoke-direct {p1, v0, v1, p2}, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$d;-><init>(Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$UiStepUiComponentConfig;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$d;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lku/p0;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$d;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$d;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$d;->u:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$d;->t:Ljava/lang/Object;

    check-cast v0, Landroid/os/Bundle;

    :try_start_0
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$d;->v:Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;->a(Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    move-result p1

    invoke-static {p1}, Lpt/b;->a(Z)Ljava/lang/Boolean;

    :cond_2
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$d;->w:Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$UiStepUiComponentConfig;

    const-string v3, "data"

    invoke-virtual {p1, v3, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    invoke-static {}, Lku/g1;->b()Lku/l0;

    move-result-object v1

    new-instance v3, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$d$a;

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$d;->v:Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;

    const/4 v5, 0x0

    invoke-direct {v3, v4, p1, v5}, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$d$a;-><init>(Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper;Landroid/os/Bundle;Lnt/b;)V

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$d;->t:Ljava/lang/Object;

    iput v2, p0, Lcom/withpersona/sdk2/inquiry/internal/UiStepSavedStateHelper$d;->u:I

    invoke-static {v1, v3, p0}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v0, :cond_3

    return-object v0

    :catch_0
    :cond_3
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
