.class public final Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$a;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;-><init>(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;Lku/p0;)V
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
    c = "com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$1"
    f = "DirectFileUploader.kt"
    l = {
        0x77,
        0xdc
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public final synthetic A:Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:I

.field public y:I

.field public final synthetic z:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;",
            "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/HashMap;Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;",
            "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;",
            ">;",
            "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$a;->z:Ljava/util/HashMap;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$a;->A:Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;

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

    new-instance p1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$a;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$a;->z:Ljava/util/HashMap;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$a;->A:Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;

    invoke-direct {p1, v0, v1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$a;-><init>(Ljava/util/HashMap;Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$a;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$a;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$a;->y:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$a;->w:Ljava/lang/Object;

    check-cast v1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;

    iget-object v5, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$a;->v:Ljava/lang/Object;

    check-cast v5, Luu/a;

    iget-object v6, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$a;->u:Ljava/lang/Object;

    check-cast v6, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;

    iget-object v7, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$a;->t:Ljava/lang/Object;

    check-cast v7, Ljava/util/Iterator;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$a;->u:Ljava/lang/Object;

    check-cast v1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$a;->t:Ljava/lang/Object;

    check-cast v1, Ljava/util/Iterator;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$a;->z:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v7, p1

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    const-string v1, "next(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, p1

    check-cast v6, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;->i()Ljt/n;

    move-result-object p1

    const/4 v1, 0x0

    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$a;->A:Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;->f()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;->g()Ljava/lang/String;

    move-result-object v8

    iput-object v7, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$a;->t:Ljava/lang/Object;

    invoke-static {v6}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$a;->u:Ljava/lang/Object;

    iput-object v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$a;->v:Ljava/lang/Object;

    iput-object v4, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$a;->w:Ljava/lang/Object;

    iput v3, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$a;->y:I

    invoke-static {p1, v5, v8, v1, p0}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;->e(Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;Ljava/lang/String;Ljava/lang/String;ZLnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_2

    :cond_3
    move-object v1, v7

    :goto_1
    move-object v7, v1

    goto :goto_0

    :cond_4
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$a;->A:Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;->a(Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;)Luu/a;

    move-result-object v5

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$a;->A:Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;

    iput-object v7, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$a;->t:Ljava/lang/Object;

    iput-object v6, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$a;->u:Ljava/lang/Object;

    iput-object v5, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$a;->v:Ljava/lang/Object;

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$a;->w:Ljava/lang/Object;

    iput v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$a;->x:I

    iput v2, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$a;->y:I

    invoke-interface {v5, v4, p0}, Luu/a;->f(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_5

    :goto_2
    return-object v0

    :cond_5
    move-object v1, p1

    :goto_3
    :try_start_0
    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;->c(Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;)Lnu/c0;

    move-result-object p1

    invoke-interface {p1}, Lnu/c0;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$UploadTask;->f()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;->a(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;

    move-result-object v1

    invoke-interface {p1, v1, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v5, v4}, Luu/a;->e(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-interface {v5, v4}, Luu/a;->e(Ljava/lang/Object;)V

    throw p1

    :cond_6
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
