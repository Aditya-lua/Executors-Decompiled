.class public final Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$e;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;->j(Ljava/lang/String;Ljava/lang/String;)V
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
    c = "com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$uploadImageAsync$1"
    f = "DirectFileUploader.kt"
    l = {
        0x87
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;

.field public final synthetic v:Ljava/lang/String;

.field public final synthetic w:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;Ljava/lang/String;Ljava/lang/String;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$e;->u:Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$e;->v:Ljava/lang/String;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$e;->w:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 3
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

    new-instance p1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$e;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$e;->u:Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$e;->v:Ljava/lang/String;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$e;->w:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$e;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;Ljava/lang/String;Ljava/lang/String;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$e;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$e;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$e;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$e;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$e;->u:Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$e;->v:Ljava/lang/String;

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$FilePath;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$e;->w:Ljava/lang/String;

    iput v2, p0, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader$e;->t:I

    const/4 v2, 0x0

    invoke-static {p1, v1, v3, v2, p0}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;->e(Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;Ljava/lang/String;Ljava/lang/String;ZLnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
