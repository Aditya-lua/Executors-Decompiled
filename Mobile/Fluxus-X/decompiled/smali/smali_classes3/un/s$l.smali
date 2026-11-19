.class public final Lun/s$l;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lun/s;->o0(Leu/b;)Ljava/lang/Object;
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
        "Lzt/n<",
        "+",
        "Ljava/io/File;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$requestImageCapture$2"
    f = "Camera2Manager.kt"
    l = {
        0x1d7
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lav/p0;",
        "Lzt/n;",
        "Ljava/io/File;",
        "<anonymous>",
        "(Lav/p0;)Lzt/n;"
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

.field public final synthetic u:Lun/s;


# direct methods
.method public constructor <init>(Lun/s;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lun/s;",
            "Leu/b<",
            "-",
            "Lun/s$l;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lun/s$l;->u:Lun/s;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 1
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

    new-instance p1, Lun/s$l;

    iget-object v0, p0, Lun/s$l;->u:Lun/s;

    invoke-direct {p1, v0, p2}, Lun/s$l;-><init>(Lun/s;Leu/b;)V

    return-object p1
.end method

.method public final invoke(Lav/p0;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lav/p0;",
            "Leu/b<",
            "-",
            "Lzt/n<",
            "+",
            "Ljava/io/File;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lun/s$l;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lun/s$l;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lun/s$l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lun/s$l;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lun/s$l;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lun/s$l;->u:Lun/s;

    invoke-static {p1}, Lun/s;->H(Lun/s;)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lun/s$l;->u:Lun/s;

    invoke-static {p1}, Lun/s;->u(Lun/s;)Ldv/c0;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ldv/c0;->setValue(Ljava/lang/Object;)V

    iget-object p1, p0, Lun/s$l;->u:Lun/s;

    invoke-static {p1, v2}, Lun/s;->P(Lun/s;Z)V

    iget-object p1, p0, Lun/s$l;->u:Lun/s;

    invoke-static {p1}, Lun/s;->u(Lun/s;)Ldv/c0;

    move-result-object p1

    invoke-static {p1}, Ldv/j;->s(Ldv/h;)Ldv/h;

    move-result-object p1

    iput v2, p0, Lun/s$l;->t:I

    invoke-static {p1, p0}, Ldv/j;->t(Ldv/h;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lzt/n;

    invoke-virtual {p1}, Lzt/n;->j()Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lun/s$l;->u:Lun/s;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lun/s;->P(Lun/s;Z)V

    invoke-static {p1}, Lzt/n;->a(Ljava/lang/Object;)Lzt/n;

    move-result-object p1

    return-object p1

    :cond_3
    sget-object p1, Lzt/n;->b:Lzt/n$a;

    new-instance p1, Lun/o0;

    invoke-direct {p1}, Lun/o0;-><init>()V

    invoke-static {p1}, Lzt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lzt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lzt/n;->a(Ljava/lang/Object;)Lzt/n;

    move-result-object p1

    return-object p1
.end method
