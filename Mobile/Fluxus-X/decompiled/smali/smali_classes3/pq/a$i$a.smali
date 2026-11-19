.class public final Lpq/a$i$a;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpq/a$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function1<",
        "Leu/b<",
        "-",
        "Lsw/x<",
        "Lcom/withpersona/sdk2/inquiry/network/upload/UploadResponse;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.withpersona.sdk2.inquiry.selfie.directFileUploader.DirectFileUploader$uploadImageInternal$2$1$1"
    f = "DirectFileUploader.kt"
    l = {
        0xb0
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lsw/x;",
        "Lcom/withpersona/sdk2/inquiry/network/upload/UploadResponse;",
        "<anonymous>",
        "()Lsw/x;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lpq/a;

.field public final synthetic v:Ljava/lang/String;

.field public final synthetic w:Ljava/io/File;

.field public final synthetic x:Lmv/g0;


# direct methods
.method public constructor <init>(Lpq/a;Ljava/lang/String;Ljava/io/File;Lmv/g0;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpq/a;",
            "Ljava/lang/String;",
            "Ljava/io/File;",
            "Lmv/g0;",
            "Leu/b<",
            "-",
            "Lpq/a$i$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lpq/a$i$a;->u:Lpq/a;

    iput-object p2, p0, Lpq/a$i$a;->v:Ljava/lang/String;

    iput-object p3, p0, Lpq/a$i$a;->w:Ljava/io/File;

    iput-object p4, p0, Lpq/a$i$a;->x:Lmv/g0;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p5}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Leu/b;)Leu/b;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "*>;)",
            "Leu/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lpq/a$i$a;

    iget-object v1, p0, Lpq/a$i$a;->u:Lpq/a;

    iget-object v2, p0, Lpq/a$i$a;->v:Ljava/lang/String;

    iget-object v3, p0, Lpq/a$i$a;->w:Ljava/io/File;

    iget-object v4, p0, Lpq/a$i$a;->x:Lmv/g0;

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lpq/a$i$a;-><init>(Lpq/a;Ljava/lang/String;Ljava/io/File;Lmv/g0;Leu/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Leu/b;

    invoke-virtual {p0, p1}, Lpq/a$i$a;->m(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lpq/a$i$a;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lpq/a$i$a;->u:Lpq/a;

    invoke-static {p1}, Lpq/a;->b(Lpq/a;)Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;

    move-result-object p1

    iget-object v1, p0, Lpq/a$i$a;->v:Ljava/lang/String;

    sget-object v3, Lmv/c0$c;->c:Lmv/c0$c$a;

    iget-object v4, p0, Lpq/a$i$a;->w:Ljava/io/File;

    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lpq/a$i$a;->x:Lmv/g0;

    const-string v6, "file"

    invoke-virtual {v3, v6, v4, v5}, Lmv/c0$c$a;->c(Ljava/lang/String;Ljava/lang/String;Lmv/g0;)Lmv/c0$c;

    move-result-object v3

    iput v2, p0, Lpq/a$i$a;->t:I

    invoke-interface {p1, v1, v3, p0}, Lcom/withpersona/sdk2/inquiry/network/upload/UploadService;->upload(Ljava/lang/String;Lmv/c0$c;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method

.method public final m(Leu/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "-",
            "Lsw/x<",
            "Lcom/withpersona/sdk2/inquiry/network/upload/UploadResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lpq/a$i$a;->create(Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lpq/a$i$a;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lpq/a$i$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
