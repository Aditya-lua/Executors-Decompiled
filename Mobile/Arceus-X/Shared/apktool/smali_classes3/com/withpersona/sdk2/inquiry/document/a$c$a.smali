.class public final Lcom/withpersona/sdk2/inquiry/document/a$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnu/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/document/a$c;->collect(Lnu/i;Lnt/b;)Ljava/lang/Object;
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
        "Lnu/i;"
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
.field public final synthetic a:Lnu/i;

.field public final synthetic b:Lcom/withpersona/sdk2/inquiry/document/a;


# direct methods
.method public constructor <init>(Lnu/i;Lcom/withpersona/sdk2/inquiry/document/a;)V
    .locals 0

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/a$c$a;->a:Lnu/i;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/document/a$c$a;->b:Lcom/withpersona/sdk2/inquiry/document/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lcom/withpersona/sdk2/inquiry/document/a$c$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/a$c$a$a;

    iget v1, v0, Lcom/withpersona/sdk2/inquiry/document/a$c$a$a;->u:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/withpersona/sdk2/inquiry/document/a$c$a$a;->u:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/a$c$a$a;

    invoke-direct {v0, p0, p2}, Lcom/withpersona/sdk2/inquiry/document/a$c$a$a;-><init>(Lcom/withpersona/sdk2/inquiry/document/a$c$a;Lnt/b;)V

    :goto_0
    iget-object p2, v0, Lcom/withpersona/sdk2/inquiry/document/a$c$a$a;->t:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/withpersona/sdk2/inquiry/document/a$c$a$a;->u:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/document/a$c$a$a;->z:Ljava/lang/Object;

    check-cast p1, Lnu/i;

    iget-object p1, v0, Lcom/withpersona/sdk2/inquiry/document/a$c$a$a;->x:Ljava/lang/Object;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/a$c$a$a;

    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/document/a$c$a;->a:Lnu/i;

    move-object v2, p1

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/document/a$c$a;->b:Lcom/withpersona/sdk2/inquiry/document/a;

    invoke-static {v2}, Lcom/withpersona/sdk2/inquiry/document/a;->d(Lcom/withpersona/sdk2/inquiry/document/a;)Lqq/c;

    move-result-object v2

    const-string v4, "document_camera_photo.jpg"

    invoke-virtual {v2, v4}, Lqq/c;->f(Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    iget-object v4, p0, Lcom/withpersona/sdk2/inquiry/document/a$c$a;->b:Lcom/withpersona/sdk2/inquiry/document/a;

    invoke-static {v4}, Lcom/withpersona/sdk2/inquiry/document/a;->d(Lcom/withpersona/sdk2/inquiry/document/a;)Lqq/c;

    move-result-object v4

    const-string v5, "jpg"

    invoke-virtual {v4, v5}, Lqq/c;->e(Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v2

    if-eqz v2, :cond_3

    new-instance v2, Lcom/withpersona/sdk2/inquiry/document/a$b$b;

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    const-string v5, "getAbsolutePath(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v2, v4}, Lcom/withpersona/sdk2/inquiry/document/a$b$b;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    sget-object v2, Lcom/withpersona/sdk2/inquiry/document/a$b$a;->a:Lcom/withpersona/sdk2/inquiry/document/a$b$a;

    goto :goto_1

    :cond_4
    sget-object v2, Lcom/withpersona/sdk2/inquiry/document/a$b$a;->a:Lcom/withpersona/sdk2/inquiry/document/a$b$a;

    :goto_1
    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v0, Lcom/withpersona/sdk2/inquiry/document/a$c$a$a;->v:Ljava/lang/Object;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v0, Lcom/withpersona/sdk2/inquiry/document/a$c$a$a;->x:Ljava/lang/Object;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/document/a$c$a$a;->y:Ljava/lang/Object;

    invoke-static {p2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/document/a$c$a$a;->z:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, v0, Lcom/withpersona/sdk2/inquiry/document/a$c$a$a;->A:I

    iput v3, v0, Lcom/withpersona/sdk2/inquiry/document/a$c$a$a;->u:I

    invoke-interface {p2, v2, v0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
