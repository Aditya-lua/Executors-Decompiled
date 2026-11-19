.class public final Lqq/c$f;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqq/c;->run()Ldv/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqq/c$f$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Ldv/i<",
        "-",
        "Lqq/c$d;",
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
    c = "com.withpersona.sdk2.inquiry.selfie.network.SubmitVerificationWorker$run$1"
    f = "SubmitVerificationWorker.kt"
    l = {
        0x55,
        0x57,
        0xa7,
        0xac,
        0xae,
        0xc5,
        0xca,
        0xcc,
        0x144,
        0x15a,
        0x15b,
        0x15d,
        0x15e
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Ldv/i;",
        "Lqq/c$d;",
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
.field public A:Ljava/lang/Object;

.field public B:Ljava/lang/Object;

.field public C:Ljava/lang/Object;

.field public D:Ljava/lang/Object;

.field public E:Ljava/lang/Object;

.field public F:I

.field public G:I

.field public H:I

.field public I:I

.field public J:I

.field public synthetic K:Ljava/lang/Object;

.field public final synthetic L:Lqq/c;

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lqq/c;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqq/c;",
            "Leu/b<",
            "-",
            "Lqq/c$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqq/c$f;->L:Lqq/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 2
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

    new-instance v0, Lqq/c$f;

    iget-object v1, p0, Lqq/c$f;->L:Lqq/c;

    invoke-direct {v0, v1, p2}, Lqq/c$f;-><init>(Lqq/c;Leu/b;)V

    iput-object p1, v0, Lqq/c$f;->K:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ldv/i;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lqq/c$f;->m(Ldv/i;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 40

    move-object/from16 v0, p0

    iget-object v1, v0, Lqq/c$f;->K:Ljava/lang/Object;

    check-cast v1, Ldv/i;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v2

    iget v3, v0, Lqq/c$f;->J:I

    const-string v4, "][files][][type]"

    const-string v5, "][files][][capture-method]"

    const-string v6, "][files][][name]"

    const-string v11, ""

    const-string v14, "data[attributes][fields]["

    packed-switch v3, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    iget-object v1, v0, Lqq/c$f;->v:Ljava/lang/Object;

    check-cast v1, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    iget-object v1, v0, Lqq/c$f;->u:Ljava/lang/Object;

    check-cast v1, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;

    iget-object v1, v0, Lqq/c$f;->t:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_21

    :pswitch_1
    iget v12, v0, Lqq/c$f;->G:I

    iget v3, v0, Lqq/c$f;->F:I

    iget-object v4, v0, Lqq/c$f;->v:Ljava/lang/Object;

    check-cast v4, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    iget-object v5, v0, Lqq/c$f;->u:Ljava/lang/Object;

    check-cast v5, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;

    iget-object v6, v0, Lqq/c$f;->t:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    move v11, v12

    move v12, v3

    move-object v3, v6

    move-object v6, v2

    goto/16 :goto_1f

    :pswitch_2
    iget-object v3, v0, Lqq/c$f;->u:Ljava/lang/Object;

    check-cast v3, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;

    iget-object v4, v0, Lqq/c$f;->t:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    move-object v6, v2

    goto/16 :goto_1d

    :pswitch_3
    iget v3, v0, Lqq/c$f;->G:I

    iget v4, v0, Lqq/c$f;->F:I

    iget-object v5, v0, Lqq/c$f;->v:Ljava/lang/Object;

    iget-object v6, v0, Lqq/c$f;->u:Ljava/lang/Object;

    check-cast v6, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;

    iget-object v7, v0, Lqq/c$f;->t:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    move-object/from16 v39, v6

    move-object v6, v2

    move v2, v3

    move-object/from16 v3, v39

    move-object/from16 v39, v5

    move v5, v4

    move-object v4, v7

    move-object/from16 v7, v39

    goto/16 :goto_1c

    :pswitch_4
    iget-object v3, v0, Lqq/c$f;->t:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    move-object v6, v2

    move-object/from16 v2, p1

    goto/16 :goto_1a

    :pswitch_5
    iget v3, v0, Lqq/c$f;->F:I

    iget-object v15, v0, Lqq/c$f;->B:Ljava/lang/Object;

    check-cast v15, Ljava/lang/Throwable;

    iget-object v15, v0, Lqq/c$f;->z:Ljava/lang/Object;

    check-cast v15, Ljava/io/File;

    iget-object v15, v0, Lqq/c$f;->y:Ljava/lang/Object;

    check-cast v15, Lmq/b0;

    iget-object v15, v0, Lqq/c$f;->w:Ljava/lang/Object;

    check-cast v15, Ljava/util/Iterator;

    iget-object v7, v0, Lqq/c$f;->v:Ljava/lang/Object;

    check-cast v7, Lqq/c;

    iget-object v8, v0, Lqq/c$f;->u:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Iterable;

    iget-object v9, v0, Lqq/c$f;->t:Ljava/lang/Object;

    check-cast v9, Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    move-object/from16 v21, v5

    move-object/from16 v27, v6

    move-object/from16 v19, v11

    const/16 v16, 0x4

    const/16 v17, 0x2

    move-object v6, v2

    goto/16 :goto_13

    :pswitch_6
    iget v3, v0, Lqq/c$f;->F:I

    iget-object v7, v0, Lqq/c$f;->B:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Throwable;

    iget-object v7, v0, Lqq/c$f;->z:Ljava/lang/Object;

    check-cast v7, Ljava/io/File;

    iget-object v7, v0, Lqq/c$f;->y:Ljava/lang/Object;

    check-cast v7, Lmq/b0;

    iget-object v7, v0, Lqq/c$f;->w:Ljava/lang/Object;

    check-cast v7, Ljava/util/Iterator;

    iget-object v8, v0, Lqq/c$f;->v:Ljava/lang/Object;

    check-cast v8, Lqq/c;

    iget-object v9, v0, Lqq/c$f;->u:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Iterable;

    iget-object v15, v0, Lqq/c$f;->t:Ljava/lang/Object;

    check-cast v15, Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    move-object/from16 v21, v5

    move-object/from16 v27, v6

    move-object/from16 v19, v11

    const/16 v16, 0x4

    const/16 v17, 0x2

    move-object v6, v2

    goto/16 :goto_11

    :pswitch_7
    iget v3, v0, Lqq/c$f;->H:I

    iget v7, v0, Lqq/c$f;->G:I

    iget v8, v0, Lqq/c$f;->F:I

    iget-object v9, v0, Lqq/c$f;->z:Ljava/lang/Object;

    check-cast v9, Ljava/io/File;

    iget-object v15, v0, Lqq/c$f;->y:Ljava/lang/Object;

    check-cast v15, Lmq/b0;

    iget-object v10, v0, Lqq/c$f;->x:Ljava/lang/Object;

    iget-object v12, v0, Lqq/c$f;->w:Ljava/lang/Object;

    check-cast v12, Ljava/util/Iterator;

    iget-object v13, v0, Lqq/c$f;->v:Ljava/lang/Object;

    check-cast v13, Lqq/c;

    move-object/from16 v18, v1

    iget-object v1, v0, Lqq/c$f;->u:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Iterable;

    move-object/from16 v19, v1

    iget-object v1, v0, Lqq/c$f;->t:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    move-object/from16 v20, p1

    check-cast v20, Lzt/n;

    invoke-virtual/range {v20 .. v20}, Lzt/n;->j()Ljava/lang/Object;

    move-result-object v20

    move/from16 v16, v8

    move v8, v3

    move/from16 v3, v16

    move-object/from16 v21, v5

    move-object/from16 v27, v6

    move-object/from16 v5, v20

    const/16 v16, 0x4

    const/16 v17, 0x2

    move-object v6, v2

    move v2, v7

    move-object/from16 v20, v15

    move-object v15, v9

    move-object v9, v1

    move-object/from16 v1, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v11

    :goto_0
    move-object v7, v13

    goto/16 :goto_10

    :pswitch_8
    move-object/from16 v18, v1

    iget v1, v0, Lqq/c$f;->F:I

    iget-object v3, v0, Lqq/c$f;->E:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Throwable;

    iget-object v3, v0, Lqq/c$f;->C:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v3, v0, Lqq/c$f;->B:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v3, v0, Lqq/c$f;->A:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v3, v0, Lqq/c$f;->z:Ljava/lang/Object;

    check-cast v3, Ljava/io/File;

    iget-object v3, v0, Lqq/c$f;->y:Ljava/lang/Object;

    check-cast v3, Lmq/b0;

    iget-object v3, v0, Lqq/c$f;->w:Ljava/lang/Object;

    check-cast v3, Ljava/util/Iterator;

    iget-object v7, v0, Lqq/c$f;->v:Ljava/lang/Object;

    check-cast v7, Lqq/c;

    iget-object v8, v0, Lqq/c$f;->u:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Iterable;

    iget-object v9, v0, Lqq/c$f;->t:Ljava/lang/Object;

    check-cast v9, Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    move-object v12, v2

    move-object/from16 v27, v6

    move-object v10, v7

    move-object/from16 v19, v11

    const/4 v2, 0x5

    const/16 v16, 0x4

    move v7, v1

    move-object/from16 v1, v18

    goto/16 :goto_e

    :pswitch_9
    move-object/from16 v18, v1

    iget v1, v0, Lqq/c$f;->F:I

    iget-object v3, v0, Lqq/c$f;->E:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Throwable;

    iget-object v3, v0, Lqq/c$f;->C:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v3, v0, Lqq/c$f;->B:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v3, v0, Lqq/c$f;->A:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v3, v0, Lqq/c$f;->z:Ljava/lang/Object;

    check-cast v3, Ljava/io/File;

    iget-object v3, v0, Lqq/c$f;->y:Ljava/lang/Object;

    check-cast v3, Lmq/b0;

    iget-object v3, v0, Lqq/c$f;->w:Ljava/lang/Object;

    check-cast v3, Ljava/util/Iterator;

    iget-object v7, v0, Lqq/c$f;->v:Ljava/lang/Object;

    check-cast v7, Lqq/c;

    iget-object v8, v0, Lqq/c$f;->u:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Iterable;

    iget-object v9, v0, Lqq/c$f;->t:Ljava/lang/Object;

    check-cast v9, Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    move-object v12, v2

    move-object/from16 v27, v6

    move-object v10, v7

    move-object/from16 v19, v11

    const/4 v2, 0x4

    move v7, v1

    move-object/from16 v1, v18

    goto/16 :goto_c

    :pswitch_a
    move-object/from16 v18, v1

    iget v1, v0, Lqq/c$f;->H:I

    iget v3, v0, Lqq/c$f;->G:I

    iget v7, v0, Lqq/c$f;->F:I

    iget-object v8, v0, Lqq/c$f;->C:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    iget-object v9, v0, Lqq/c$f;->B:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v10, v0, Lqq/c$f;->A:Ljava/lang/Object;

    check-cast v10, Ljava/lang/String;

    iget-object v12, v0, Lqq/c$f;->z:Ljava/lang/Object;

    check-cast v12, Ljava/io/File;

    iget-object v13, v0, Lqq/c$f;->y:Ljava/lang/Object;

    check-cast v13, Lmq/b0;

    iget-object v15, v0, Lqq/c$f;->x:Ljava/lang/Object;

    move/from16 v19, v1

    iget-object v1, v0, Lqq/c$f;->w:Ljava/lang/Object;

    check-cast v1, Ljava/util/Iterator;

    move-object/from16 v20, v1

    iget-object v1, v0, Lqq/c$f;->v:Ljava/lang/Object;

    check-cast v1, Lqq/c;

    move-object/from16 v21, v1

    iget-object v1, v0, Lqq/c$f;->u:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Iterable;

    move-object/from16 v22, v1

    iget-object v1, v0, Lqq/c$f;->t:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    move-object/from16 v23, p1

    check-cast v23, Lzt/n;

    invoke-virtual/range {v23 .. v23}, Lzt/n;->j()Ljava/lang/Object;

    move-result-object v23

    move-object/from16 p1, v21

    move-object/from16 v21, v10

    move-object/from16 v10, p1

    move-object/from16 v27, v6

    move/from16 v6, v19

    move-object/from16 p1, v23

    move-object/from16 v19, v11

    move v11, v3

    move-object/from16 v3, v20

    move-object/from16 v20, v8

    move-object/from16 v8, v22

    move-object/from16 v22, v13

    move-object v13, v9

    move-object v9, v1

    move-object/from16 v1, v18

    move-object/from16 v18, v15

    move-object v15, v12

    move-object v12, v2

    goto/16 :goto_a

    :pswitch_b
    iget-object v1, v0, Lqq/c$f;->y:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    iget-object v1, v0, Lqq/c$f;->x:Ljava/lang/Object;

    check-cast v1, Ljava/io/File;

    iget-object v1, v0, Lqq/c$f;->w:Ljava/lang/Object;

    check-cast v1, Lmq/b0;

    iget-object v1, v0, Lqq/c$f;->u:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Iterable;

    iget-object v1, v0, Lqq/c$f;->t:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_c
    move-object/from16 v18, v1

    iget v1, v0, Lqq/c$f;->H:I

    iget v3, v0, Lqq/c$f;->G:I

    iget v7, v0, Lqq/c$f;->F:I

    iget-object v8, v0, Lqq/c$f;->z:Ljava/lang/Object;

    check-cast v8, Ljava/io/File;

    iget-object v9, v0, Lqq/c$f;->y:Ljava/lang/Object;

    check-cast v9, Lmq/b0;

    iget-object v10, v0, Lqq/c$f;->x:Ljava/lang/Object;

    iget-object v12, v0, Lqq/c$f;->w:Ljava/lang/Object;

    check-cast v12, Ljava/util/Iterator;

    iget-object v13, v0, Lqq/c$f;->v:Ljava/lang/Object;

    check-cast v13, Lqq/c;

    iget-object v15, v0, Lqq/c$f;->u:Ljava/lang/Object;

    check-cast v15, Ljava/lang/Iterable;

    move/from16 v19, v1

    iget-object v1, v0, Lqq/c$f;->t:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    move-object/from16 v20, p1

    check-cast v20, Lzt/n;

    invoke-virtual/range {v20 .. v20}, Lzt/n;->j()Ljava/lang/Object;

    move-result-object v20

    move-object/from16 p1, v10

    move-object v10, v13

    move-object v13, v9

    move-object v9, v12

    move-object v12, v8

    move/from16 v8, v19

    move-object/from16 v19, v11

    move v11, v3

    move-object v3, v1

    move-object/from16 v1, v18

    goto/16 :goto_3

    :pswitch_d
    move-object/from16 v18, v1

    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object v1, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v1}, Lqq/c;->t(Lqq/c;)Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-result-object v1

    new-instance v19, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventData;

    sget-object v20, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureState;->SUBMITTING:Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureState;

    const/16 v24, 0x8

    const/16 v25, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v19 .. v25}, Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventData;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureState;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/tracking/model/SelfiePoseType;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v3, v19

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static {v1, v3, v8, v7, v9}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logSelfieCaptureStateEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/tracking/model/SelfieCaptureStateEventData;ZILjava/lang/Object;)V

    iget-object v1, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v1}, Lqq/c;->g(Lqq/c;)Lar/a;

    move-result-object v3

    iget-object v7, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v7}, Lqq/c;->p(Lqq/c;)Ljava/util/List;

    move-result-object v7

    invoke-static {v1, v3, v7}, Lqq/c;->v(Lqq/c;Lar/a;Ljava/util/List;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v3, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v3}, Lqq/c;->p(Lqq/c;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->S0(Ljava/lang/Iterable;)Ljava/lang/Iterable;

    move-result-object v3

    iget-object v7, v0, Lqq/c$f;->L:Lqq/c;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move-object v15, v3

    move-object v13, v7

    move-object v12, v8

    const/4 v7, 0x0

    move-object v3, v1

    move-object/from16 v1, v18

    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    const-string v9, "video"

    if-eqz v8, :cond_1f

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v8, v10

    check-cast v8, Lkotlin/collections/IndexedValue;

    move-object/from16 p1, v8

    invoke-virtual/range {p1 .. p1}, Lkotlin/collections/IndexedValue;->a()I

    move-result v8

    invoke-virtual/range {p1 .. p1}, Lkotlin/collections/IndexedValue;->b()Ljava/lang/Object;

    move-result-object v18

    move-object/from16 p1, v10

    move-object/from16 v10, v18

    check-cast v10, Lmq/b0;

    move-object/from16 v18, v15

    new-instance v15, Ljava/io/File;

    move-object/from16 v19, v11

    invoke-virtual {v10}, Lmq/b0;->a()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v15, v11}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    instance-of v11, v10, Lmq/b0$b;

    if-eqz v11, :cond_17

    invoke-static {v13}, Lqq/c;->l(Lqq/c;)Lfr/a;

    move-result-object v9

    iput-object v1, v0, Lqq/c$f;->K:Ljava/lang/Object;

    iput-object v3, v0, Lqq/c$f;->t:Ljava/lang/Object;

    invoke-static/range {v18 .. v18}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v0, Lqq/c$f;->u:Ljava/lang/Object;

    iput-object v13, v0, Lqq/c$f;->v:Ljava/lang/Object;

    iput-object v12, v0, Lqq/c$f;->w:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v0, Lqq/c$f;->x:Ljava/lang/Object;

    iput-object v10, v0, Lqq/c$f;->y:Ljava/lang/Object;

    iput-object v15, v0, Lqq/c$f;->z:Ljava/lang/Object;

    const/4 v11, 0x0

    iput-object v11, v0, Lqq/c$f;->A:Ljava/lang/Object;

    iput-object v11, v0, Lqq/c$f;->B:Ljava/lang/Object;

    iput-object v11, v0, Lqq/c$f;->C:Ljava/lang/Object;

    iput-object v11, v0, Lqq/c$f;->D:Ljava/lang/Object;

    iput-object v11, v0, Lqq/c$f;->E:Ljava/lang/Object;

    iput v7, v0, Lqq/c$f;->F:I

    const/4 v11, 0x0

    iput v11, v0, Lqq/c$f;->G:I

    iput v8, v0, Lqq/c$f;->H:I

    const/4 v11, 0x1

    iput v11, v0, Lqq/c$f;->J:I

    invoke-interface {v9, v15, v0}, Lfr/a;->a(Ljava/io/File;Leu/b;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v2, :cond_0

    :goto_2
    move-object v6, v2

    goto/16 :goto_20

    :cond_0
    move-object v11, v13

    move-object v13, v10

    move-object v10, v11

    move-object/from16 v20, v9

    move-object v9, v12

    move-object v12, v15

    move-object/from16 v15, v18

    const/4 v11, 0x0

    :goto_3
    invoke-static/range {v20 .. v20}, Lzt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v18

    if-eqz v18, :cond_2

    new-instance v4, Lqq/c$d$a;

    new-instance v5, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;

    const-string v6, "Error processing image file in SubmitVerificationWorker."

    invoke-direct {v5, v6}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;-><init>(Ljava/lang/String;)V

    invoke-direct {v4, v5}, Lqq/c$d$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-static {v1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lqq/c$f;->K:Ljava/lang/Object;

    invoke-static {v3}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v0, Lqq/c$f;->t:Ljava/lang/Object;

    invoke-static {v15}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v0, Lqq/c$f;->u:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v0, Lqq/c$f;->v:Ljava/lang/Object;

    invoke-static {v13}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v0, Lqq/c$f;->w:Ljava/lang/Object;

    invoke-static {v12}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v0, Lqq/c$f;->x:Ljava/lang/Object;

    invoke-static/range {v18 .. v18}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v0, Lqq/c$f;->y:Ljava/lang/Object;

    const/4 v9, 0x0

    iput-object v9, v0, Lqq/c$f;->z:Ljava/lang/Object;

    iput v7, v0, Lqq/c$f;->F:I

    iput v11, v0, Lqq/c$f;->G:I

    iput v8, v0, Lqq/c$f;->H:I

    const/4 v8, 0x0

    iput v8, v0, Lqq/c$f;->I:I

    const/4 v7, 0x2

    iput v7, v0, Lqq/c$f;->J:I

    invoke-interface {v1, v4, v0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_1

    goto :goto_2

    :cond_1
    :goto_4
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v1

    :cond_2
    move-object/from16 v18, v13

    check-cast v18, Lmq/b0$b;

    invoke-virtual/range {v18 .. v18}, Lmq/b0$b;->i()Lxn/a;

    move-result-object v20

    sget-object v21, Lqq/c$f$b;->a:[I

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Enum;->ordinal()I

    move-result v20

    move-object/from16 v22, v13

    aget v13, v21, v20

    move-object/from16 v20, v15

    const/4 v15, 0x1

    if-eq v13, v15, :cond_7

    const/4 v15, 0x2

    if-eq v13, v15, :cond_6

    const/4 v15, 0x3

    if-eq v13, v15, :cond_5

    const/4 v15, 0x4

    if-eq v13, v15, :cond_4

    const/4 v15, 0x5

    if-ne v13, v15, :cond_3

    const-string v13, "down_photo"

    goto :goto_5

    :cond_3
    new-instance v1, Lzt/l;

    invoke-direct {v1}, Lzt/l;-><init>()V

    throw v1

    :cond_4
    const-string v13, "up_photo"

    goto :goto_5

    :cond_5
    const-string v13, "right_photo"

    goto :goto_5

    :cond_6
    const-string v13, "left_photo"

    goto :goto_5

    :cond_7
    const-string v13, "center_photo"

    :goto_5
    invoke-virtual/range {v18 .. v18}, Lmq/b0$b;->i()Lxn/a;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aget v15, v21, v15

    move-object/from16 v21, v13

    const/4 v13, 0x1

    if-eq v15, v13, :cond_c

    const/4 v13, 0x2

    if-eq v15, v13, :cond_b

    const/4 v13, 0x3

    if-eq v15, v13, :cond_a

    const/4 v13, 0x4

    if-eq v15, v13, :cond_9

    const/4 v13, 0x5

    if-ne v15, v13, :cond_8

    const-string v13, "down"

    goto :goto_6

    :cond_8
    new-instance v1, Lzt/l;

    invoke-direct {v1}, Lzt/l;-><init>()V

    throw v1

    :cond_9
    const-string v13, "up"

    goto :goto_6

    :cond_a
    const-string v13, "right"

    goto :goto_6

    :cond_b
    const-string v13, "left"

    goto :goto_6

    :cond_c
    const-string v13, "center"

    :goto_6
    invoke-static {}, Lkotlin/collections/o;->c()Ljava/util/List;

    move-result-object v15

    move-object/from16 v24, v2

    sget-object v2, Lmv/c0$c;->c:Lmv/c0$c$a;

    move-object/from16 v25, v12

    invoke-static {v10}, Lqq/c;->i(Lqq/c;)Ljava/lang/String;

    move-result-object v12

    move/from16 v26, v8

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v10}, Lqq/c;->o(Lqq/c;)Lmq/z0;

    move-result-object v12

    move-object/from16 v27, v6

    sget-object v6, Lmq/z0$a;->a:Lmq/z0$a;

    invoke-static {v12, v6}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d

    const-string v6, "photo"

    goto :goto_8

    :cond_d
    sget-object v6, Lmq/z0$c;->a:Lmq/z0$c;

    invoke-static {v12, v6}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e

    goto :goto_7

    :cond_e
    sget-object v6, Lmq/z0$b;->a:Lmq/z0$b;

    invoke-static {v12, v6}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_16

    :goto_7
    move-object/from16 v6, v21

    :goto_8
    invoke-virtual {v2, v8, v6}, Lmv/c0$c$a;->b(Ljava/lang/String;Ljava/lang/String;)Lmv/c0$c;

    move-result-object v6

    invoke-interface {v15, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v10}, Lqq/c;->i(Lqq/c;)Ljava/lang/String;

    move-result-object v6

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {v18 .. v18}, Lmq/b0$b;->f()Lmq/b0$a;

    move-result-object v8

    invoke-virtual {v8}, Lmq/b0$a;->b()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v6, v8}, Lmv/c0$c$a;->b(Ljava/lang/String;Ljava/lang/String;)Lmv/c0$c;

    move-result-object v6

    invoke-interface {v15, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v10}, Lqq/c;->i(Lqq/c;)Ljava/lang/String;

    move-result-object v6

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "][files][][captured-at]"

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {v18 .. v18}, Lmq/b0$b;->g()J

    move-result-wide v28

    invoke-static/range {v28 .. v29}, Lxq/h;->a(J)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v6, v8}, Lmv/c0$c$a;->b(Ljava/lang/String;Ljava/lang/String;)Lmv/c0$c;

    move-result-object v6

    invoke-interface {v15, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v10}, Lqq/c;->i(Lqq/c;)Ljava/lang/String;

    move-result-object v6

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v8, "image"

    invoke-virtual {v2, v6, v8}, Lmv/c0$c$a;->b(Ljava/lang/String;Ljava/lang/String;)Lmv/c0$c;

    move-result-object v6

    invoke-interface {v15, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual/range {v18 .. v18}, Lmq/b0$b;->j()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_f

    invoke-static {v10}, Lqq/c;->i(Lqq/c;)Ljava/lang/String;

    move-result-object v8

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "][files][][pose]"

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8, v13}, Lmv/c0$c$a;->b(Ljava/lang/String;Ljava/lang/String;)Lmv/c0$c;

    move-result-object v8

    invoke-interface {v15, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v10}, Lqq/c;->i(Lqq/c;)Ljava/lang/String;

    move-result-object v8

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "][files][][token]"

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8, v6}, Lmv/c0$c$a;->b(Ljava/lang/String;Ljava/lang/String;)Lmv/c0$c;

    move-result-object v6

    invoke-interface {v15, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v10}, Lqq/c;->i(Lqq/c;)Ljava/lang/String;

    move-result-object v6

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "][files][][index]"

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static/range {v26 .. v26}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v6, v8}, Lmv/c0$c$a;->b(Ljava/lang/String;Ljava/lang/String;)Lmv/c0$c;

    move-result-object v2

    invoke-interface {v15, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    :cond_f
    invoke-static {v15}, Lkotlin/collections/o;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    move-object v2, v8

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v3, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    sget-object v2, Lqq/c$b;->a:Lqq/c$b;

    iput-object v1, v0, Lqq/c$f;->K:Ljava/lang/Object;

    iput-object v3, v0, Lqq/c$f;->t:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v0, Lqq/c$f;->u:Ljava/lang/Object;

    iput-object v10, v0, Lqq/c$f;->v:Ljava/lang/Object;

    iput-object v9, v0, Lqq/c$f;->w:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v0, Lqq/c$f;->x:Ljava/lang/Object;

    invoke-static/range {v22 .. v22}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v0, Lqq/c$f;->y:Ljava/lang/Object;

    invoke-static/range {v25 .. v25}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v0, Lqq/c$f;->z:Ljava/lang/Object;

    invoke-static/range {v21 .. v21}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v0, Lqq/c$f;->A:Ljava/lang/Object;

    invoke-static {v13}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v0, Lqq/c$f;->B:Ljava/lang/Object;

    invoke-static {v8}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v0, Lqq/c$f;->C:Ljava/lang/Object;

    iput v7, v0, Lqq/c$f;->F:I

    iput v11, v0, Lqq/c$f;->G:I

    move/from16 v6, v26

    iput v6, v0, Lqq/c$f;->H:I

    const/4 v15, 0x3

    iput v15, v0, Lqq/c$f;->J:I

    move-object/from16 v15, v25

    invoke-static {v10, v15, v2, v3, v0}, Lqq/c;->w(Lqq/c;Ljava/io/File;Lqq/c$b;Ljava/util/List;Leu/b;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v12, v24

    if-ne v2, v12, :cond_10

    :goto_9
    move-object v6, v12

    goto/16 :goto_20

    :cond_10
    move-object/from16 v18, v9

    move-object v9, v3

    move-object/from16 v3, v18

    move-object/from16 v18, v20

    move-object/from16 v20, v8

    move-object/from16 v8, v18

    move-object/from16 v18, p1

    move-object/from16 p1, v2

    :goto_a
    invoke-static/range {p1 .. p1}, Lzt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    move-object/from16 v23, v8

    if-eqz v2, :cond_15

    instance-of v8, v2, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorException;

    if-eqz v8, :cond_12

    new-instance v8, Lqq/c$d$a;

    move-object/from16 v24, v2

    check-cast v24, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorException;

    move-object/from16 v25, v2

    invoke-virtual/range {v24 .. v24}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorException;->getErrorInfo()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    move-result-object v2

    invoke-direct {v8, v2}, Lqq/c$d$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    iput-object v1, v0, Lqq/c$f;->K:Ljava/lang/Object;

    iput-object v9, v0, Lqq/c$f;->t:Ljava/lang/Object;

    invoke-static/range {v23 .. v23}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lqq/c$f;->u:Ljava/lang/Object;

    iput-object v10, v0, Lqq/c$f;->v:Ljava/lang/Object;

    iput-object v3, v0, Lqq/c$f;->w:Ljava/lang/Object;

    invoke-static/range {v18 .. v18}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lqq/c$f;->x:Ljava/lang/Object;

    invoke-static/range {v22 .. v22}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lqq/c$f;->y:Ljava/lang/Object;

    invoke-static {v15}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lqq/c$f;->z:Ljava/lang/Object;

    invoke-static/range {v21 .. v21}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lqq/c$f;->A:Ljava/lang/Object;

    invoke-static {v13}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lqq/c$f;->B:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lqq/c$f;->C:Ljava/lang/Object;

    move-object/from16 v2, p1

    iput-object v2, v0, Lqq/c$f;->D:Ljava/lang/Object;

    invoke-static/range {v25 .. v25}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lqq/c$f;->E:Ljava/lang/Object;

    iput v7, v0, Lqq/c$f;->F:I

    iput v11, v0, Lqq/c$f;->G:I

    iput v6, v0, Lqq/c$f;->H:I

    const/4 v11, 0x0

    iput v11, v0, Lqq/c$f;->I:I

    const/4 v2, 0x4

    iput v2, v0, Lqq/c$f;->J:I

    invoke-interface {v1, v8, v0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v12, :cond_11

    :goto_b
    goto :goto_9

    :cond_11
    move-object/from16 v8, v23

    :goto_c
    move/from16 v16, v2

    const/4 v2, 0x5

    goto/16 :goto_e

    :cond_12
    move-object/from16 v25, v2

    const/16 v16, 0x4

    move-object/from16 v2, p1

    new-instance v8, Lqq/c$d$a;

    move-object/from16 p1, v13

    new-instance v13, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;

    invoke-virtual/range {v25 .. v25}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v24

    move-object/from16 v26, v15

    if-nez v24, :cond_13

    move-object/from16 v15, v19

    goto :goto_d

    :cond_13
    move-object/from16 v15, v24

    :goto_d
    invoke-direct {v13, v15}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;-><init>(Ljava/lang/String;)V

    invoke-direct {v8, v13}, Lqq/c$d$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    iput-object v1, v0, Lqq/c$f;->K:Ljava/lang/Object;

    iput-object v9, v0, Lqq/c$f;->t:Ljava/lang/Object;

    invoke-static/range {v23 .. v23}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    iput-object v13, v0, Lqq/c$f;->u:Ljava/lang/Object;

    iput-object v10, v0, Lqq/c$f;->v:Ljava/lang/Object;

    iput-object v3, v0, Lqq/c$f;->w:Ljava/lang/Object;

    invoke-static/range {v18 .. v18}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    iput-object v13, v0, Lqq/c$f;->x:Ljava/lang/Object;

    invoke-static/range {v22 .. v22}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    iput-object v13, v0, Lqq/c$f;->y:Ljava/lang/Object;

    invoke-static/range {v26 .. v26}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    iput-object v13, v0, Lqq/c$f;->z:Ljava/lang/Object;

    invoke-static/range {v21 .. v21}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    iput-object v13, v0, Lqq/c$f;->A:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    iput-object v13, v0, Lqq/c$f;->B:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    iput-object v13, v0, Lqq/c$f;->C:Ljava/lang/Object;

    iput-object v2, v0, Lqq/c$f;->D:Ljava/lang/Object;

    invoke-static/range {v25 .. v25}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lqq/c$f;->E:Ljava/lang/Object;

    iput v7, v0, Lqq/c$f;->F:I

    iput v11, v0, Lqq/c$f;->G:I

    iput v6, v0, Lqq/c$f;->H:I

    const/4 v11, 0x0

    iput v11, v0, Lqq/c$f;->I:I

    const/4 v2, 0x5

    iput v2, v0, Lqq/c$f;->J:I

    invoke-interface {v1, v8, v0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v12, :cond_14

    goto :goto_b

    :cond_14
    move-object/from16 v8, v23

    goto :goto_e

    :cond_15
    const/4 v2, 0x5

    const/16 v16, 0x4

    :goto_e
    move-object/from16 v21, v5

    move-object v15, v8

    move-object v13, v10

    move-object v6, v12

    const/16 v17, 0x2

    move-object v12, v3

    :goto_f
    move-object v3, v9

    goto/16 :goto_15

    :cond_16
    new-instance v1, Lzt/l;

    invoke-direct {v1}, Lzt/l;-><init>()V

    throw v1

    :cond_17
    move-object/from16 v27, v6

    const/16 v16, 0x4

    const/16 v17, 0x2

    move-object v6, v2

    const/4 v2, 0x5

    instance-of v11, v10, Lmq/b0$c;

    if-eqz v11, :cond_1e

    sget-object v11, Lmv/c0$c;->c:Lmv/c0$c$a;

    invoke-static {v13}, Lqq/c;->i(Lqq/c;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v20, v10

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v2, v27

    invoke-virtual {v10, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v11, v10, v9}, Lmv/c0$c$a;->b(Ljava/lang/String;Ljava/lang/String;)Lmv/c0$c;

    move-result-object v10

    invoke-static {v13}, Lqq/c;->i(Lqq/c;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v24, v6

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v6, v20

    check-cast v6, Lmq/b0$c;

    invoke-virtual {v6}, Lmq/b0$c;->f()Lmq/b0$a;

    move-result-object v6

    invoke-virtual {v6}, Lmq/b0$a;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v11, v2, v6}, Lmv/c0$c$a;->b(Ljava/lang/String;Ljava/lang/String;)Lmv/c0$c;

    move-result-object v2

    invoke-static {v13}, Lqq/c;->i(Lqq/c;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v21, v5

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v11, v5, v9}, Lmv/c0$c$a;->b(Ljava/lang/String;Ljava/lang/String;)Lmv/c0$c;

    move-result-object v5

    filled-new-array {v10, v2, v5}, [Lmv/c0$c;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v3, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    sget-object v2, Lqq/c$b;->b:Lqq/c$b;

    iput-object v1, v0, Lqq/c$f;->K:Ljava/lang/Object;

    iput-object v3, v0, Lqq/c$f;->t:Ljava/lang/Object;

    invoke-static/range {v18 .. v18}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lqq/c$f;->u:Ljava/lang/Object;

    iput-object v13, v0, Lqq/c$f;->v:Ljava/lang/Object;

    iput-object v12, v0, Lqq/c$f;->w:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lqq/c$f;->x:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lqq/c$f;->y:Ljava/lang/Object;

    invoke-static {v15}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lqq/c$f;->z:Ljava/lang/Object;

    const/4 v9, 0x0

    iput-object v9, v0, Lqq/c$f;->A:Ljava/lang/Object;

    iput-object v9, v0, Lqq/c$f;->B:Ljava/lang/Object;

    iput-object v9, v0, Lqq/c$f;->C:Ljava/lang/Object;

    iput-object v9, v0, Lqq/c$f;->D:Ljava/lang/Object;

    iput-object v9, v0, Lqq/c$f;->E:Ljava/lang/Object;

    iput v7, v0, Lqq/c$f;->F:I

    const/4 v11, 0x0

    iput v11, v0, Lqq/c$f;->G:I

    iput v8, v0, Lqq/c$f;->H:I

    const/4 v5, 0x6

    iput v5, v0, Lqq/c$f;->J:I

    invoke-static {v13, v15, v2, v3, v0}, Lqq/c;->w(Lqq/c;Ljava/io/File;Lqq/c$b;Ljava/util/List;Leu/b;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v6, v24

    if-ne v2, v6, :cond_18

    goto/16 :goto_20

    :cond_18
    move-object/from16 v10, p1

    move-object v5, v2

    move-object v9, v3

    move v3, v7

    const/4 v2, 0x0

    goto/16 :goto_0

    :goto_10
    invoke-static {v5}, Lzt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v11

    if-eqz v11, :cond_1d

    instance-of v13, v11, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorException;

    if-eqz v13, :cond_1a

    new-instance v13, Lqq/c$d$a;

    move-object/from16 v22, v11

    check-cast v22, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorException;

    move-object/from16 p1, v10

    invoke-virtual/range {v22 .. v22}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorException;->getErrorInfo()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    move-result-object v10

    invoke-direct {v13, v10}, Lqq/c$d$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    iput-object v1, v0, Lqq/c$f;->K:Ljava/lang/Object;

    iput-object v9, v0, Lqq/c$f;->t:Ljava/lang/Object;

    invoke-static/range {v18 .. v18}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v0, Lqq/c$f;->u:Ljava/lang/Object;

    iput-object v7, v0, Lqq/c$f;->v:Ljava/lang/Object;

    iput-object v12, v0, Lqq/c$f;->w:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v0, Lqq/c$f;->x:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v0, Lqq/c$f;->y:Ljava/lang/Object;

    invoke-static {v15}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v0, Lqq/c$f;->z:Ljava/lang/Object;

    iput-object v5, v0, Lqq/c$f;->A:Ljava/lang/Object;

    invoke-static {v11}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lqq/c$f;->B:Ljava/lang/Object;

    iput v3, v0, Lqq/c$f;->F:I

    iput v2, v0, Lqq/c$f;->G:I

    iput v8, v0, Lqq/c$f;->H:I

    const/4 v11, 0x0

    iput v11, v0, Lqq/c$f;->I:I

    const/4 v2, 0x7

    iput v2, v0, Lqq/c$f;->J:I

    invoke-interface {v1, v13, v0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v6, :cond_19

    goto/16 :goto_20

    :cond_19
    move-object v8, v7

    move-object v15, v9

    move-object v7, v12

    move-object/from16 v9, v18

    :goto_11
    move-object v12, v7

    move-object v7, v8

    move-object/from16 v18, v9

    move-object v9, v15

    goto :goto_14

    :cond_1a
    move-object/from16 p1, v10

    new-instance v10, Lqq/c$d$a;

    new-instance v13, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;

    invoke-virtual {v11}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v22

    move-object/from16 v23, v11

    if-nez v22, :cond_1b

    move-object/from16 v11, v19

    goto :goto_12

    :cond_1b
    move-object/from16 v11, v22

    :goto_12
    invoke-direct {v13, v11}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;-><init>(Ljava/lang/String;)V

    invoke-direct {v10, v13}, Lqq/c$d$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    iput-object v1, v0, Lqq/c$f;->K:Ljava/lang/Object;

    iput-object v9, v0, Lqq/c$f;->t:Ljava/lang/Object;

    invoke-static/range {v18 .. v18}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v0, Lqq/c$f;->u:Ljava/lang/Object;

    iput-object v7, v0, Lqq/c$f;->v:Ljava/lang/Object;

    iput-object v12, v0, Lqq/c$f;->w:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v0, Lqq/c$f;->x:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v0, Lqq/c$f;->y:Ljava/lang/Object;

    invoke-static {v15}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    iput-object v11, v0, Lqq/c$f;->z:Ljava/lang/Object;

    iput-object v5, v0, Lqq/c$f;->A:Ljava/lang/Object;

    invoke-static/range {v23 .. v23}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lqq/c$f;->B:Ljava/lang/Object;

    iput v3, v0, Lqq/c$f;->F:I

    iput v2, v0, Lqq/c$f;->G:I

    iput v8, v0, Lqq/c$f;->H:I

    const/4 v11, 0x0

    iput v11, v0, Lqq/c$f;->I:I

    const/16 v2, 0x8

    iput v2, v0, Lqq/c$f;->J:I

    invoke-interface {v1, v10, v0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v6, :cond_1c

    goto/16 :goto_20

    :cond_1c
    move-object v15, v12

    move-object/from16 v8, v18

    :goto_13
    move-object/from16 v18, v8

    move-object v12, v15

    :cond_1d
    :goto_14
    move-object v13, v7

    move-object/from16 v15, v18

    move v7, v3

    goto/16 :goto_f

    :goto_15
    move-object v2, v6

    move-object/from16 v11, v19

    move-object/from16 v5, v21

    move-object/from16 v6, v27

    goto/16 :goto_1

    :cond_1e
    new-instance v1, Lzt/l;

    invoke-direct {v1}, Lzt/l;-><init>()V

    throw v1

    :cond_1f
    move-object/from16 v21, v5

    move-object/from16 v27, v6

    move-object/from16 v19, v11

    move-object v6, v2

    iget-object v2, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v2}, Lqq/c;->u(Lqq/c;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_20

    sget-object v2, Lmv/c0$c;->c:Lmv/c0$c$a;

    iget-object v5, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v5}, Lqq/c;->i(Lqq/c;)Ljava/lang/String;

    move-result-object v5

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v5, v27

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5, v9}, Lmv/c0$c$a;->b(Ljava/lang/String;Ljava/lang/String;)Lmv/c0$c;

    move-result-object v5

    iget-object v7, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v7}, Lqq/c;->i(Lqq/c;)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v7, v21

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    sget-object v8, Lmq/b0$a;->b:Lmq/b0$a;

    invoke-virtual {v8}, Lmq/b0$a;->b()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v7, v8}, Lmv/c0$c$a;->b(Ljava/lang/String;Ljava/lang/String;)Lmv/c0$c;

    move-result-object v7

    iget-object v8, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v8}, Lqq/c;->i(Lqq/c;)Ljava/lang/String;

    move-result-object v8

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4, v9}, Lmv/c0$c$a;->b(Ljava/lang/String;Ljava/lang/String;)Lmv/c0$c;

    move-result-object v4

    iget-object v8, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v8}, Lqq/c;->i(Lqq/c;)Ljava/lang/String;

    move-result-object v8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "][files][][objectId]"

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    iget-object v9, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v9}, Lqq/c;->u(Lqq/c;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2, v8, v9}, Lmv/c0$c$a;->b(Ljava/lang/String;Ljava/lang/String;)Lmv/c0$c;

    move-result-object v2

    filled-new-array {v5, v7, v4, v2}, [Lmv/c0$c;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v3, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_20
    sget-object v2, Lmv/c0$c;->c:Lmv/c0$c$a;

    iget-object v4, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v4}, Lqq/c;->m(Lqq/c;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "data[id]"

    invoke-virtual {v2, v5, v4}, Lmv/c0$c$a;->b(Ljava/lang/String;Ljava/lang/String;)Lmv/c0$c;

    move-result-object v20

    const-string v4, "data[type]"

    const-string v5, "inquiry"

    invoke-virtual {v2, v4, v5}, Lmv/c0$c$a;->b(Ljava/lang/String;Ljava/lang/String;)Lmv/c0$c;

    move-result-object v21

    iget-object v4, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v4}, Lqq/c;->i(Lqq/c;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "][type]"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v5, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v5}, Lqq/c;->o(Lqq/c;)Lmq/z0;

    move-result-object v5

    sget-object v7, Lmq/z0$a;->a:Lmq/z0$a;

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_21

    const-string v5, "only_center"

    goto :goto_16

    :cond_21
    sget-object v7, Lmq/z0$c;->a:Lmq/z0$c;

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_22

    const-string v5, "profile_and_center"

    goto :goto_16

    :cond_22
    sget-object v7, Lmq/z0$b;->a:Lmq/z0$b;

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2e

    const-string v5, "configurable_poses"

    :goto_16
    invoke-virtual {v2, v4, v5}, Lmv/c0$c$a;->b(Ljava/lang/String;Ljava/lang/String;)Lmv/c0$c;

    move-result-object v22

    iget-object v4, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v4}, Lqq/c;->i(Lqq/c;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "][capture-started-at]"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v5, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v5}, Lqq/c;->s(Lqq/c;)J

    move-result-wide v7

    invoke-static {v7, v8}, Lxq/h;->a(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Lmv/c0$c$a;->b(Ljava/lang/String;Ljava/lang/String;)Lmv/c0$c;

    move-result-object v23

    iget-object v4, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v4}, Lqq/c;->j(Lqq/c;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "meta[from_component]"

    invoke-virtual {v2, v5, v4}, Lmv/c0$c$a;->b(Ljava/lang/String;Ljava/lang/String;)Lmv/c0$c;

    move-result-object v24

    iget-object v4, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v4}, Lqq/c;->k(Lqq/c;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "meta[from_step]"

    invoke-virtual {v2, v5, v4}, Lmv/c0$c$a;->b(Ljava/lang/String;Ljava/lang/String;)Lmv/c0$c;

    move-result-object v25

    iget-object v4, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v4}, Lqq/c;->i(Lqq/c;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "][cameraProperties][label]"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v5, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v5}, Lqq/c;->d(Lqq/c;)Lsn/v;

    move-result-object v5

    invoke-virtual {v5}, Lsn/v;->i()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Lmv/c0$c$a;->b(Ljava/lang/String;Ljava/lang/String;)Lmv/c0$c;

    move-result-object v26

    iget-object v4, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v4}, Lqq/c;->i(Lqq/c;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "][cameraProperties][facing_mode]"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v5, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v5}, Lqq/c;->d(Lqq/c;)Lsn/v;

    move-result-object v5

    invoke-virtual {v5}, Lsn/v;->f()Lsn/v$b;

    move-result-object v5

    sget-object v7, Lqq/c$f$b;->b:[I

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v5, v7, v5

    const/4 v15, 0x1

    if-ne v5, v15, :cond_23

    move-object/from16 v5, v19

    goto :goto_17

    :cond_23
    iget-object v5, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v5}, Lqq/c;->d(Lqq/c;)Lsn/v;

    move-result-object v5

    invoke-virtual {v5}, Lsn/v;->f()Lsn/v$b;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v5, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    const-string v7, "toLowerCase(...)"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_17
    invoke-virtual {v2, v4, v5}, Lmv/c0$c$a;->b(Ljava/lang/String;Ljava/lang/String;)Lmv/c0$c;

    move-result-object v27

    iget-object v4, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v4}, Lqq/c;->i(Lqq/c;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "][cameraProperties][width]"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v5, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v5}, Lqq/c;->d(Lqq/c;)Lsn/v;

    move-result-object v5

    invoke-virtual {v5}, Lsn/v;->k()Landroid/util/Size;

    move-result-object v5

    invoke-virtual {v5}, Landroid/util/Size;->getWidth()I

    move-result v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Lmv/c0$c$a;->b(Ljava/lang/String;Ljava/lang/String;)Lmv/c0$c;

    move-result-object v28

    iget-object v4, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v4}, Lqq/c;->i(Lqq/c;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "][cameraProperties][height]"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v5, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v5}, Lqq/c;->d(Lqq/c;)Lsn/v;

    move-result-object v5

    invoke-virtual {v5}, Lsn/v;->k()Landroid/util/Size;

    move-result-object v5

    invoke-virtual {v5}, Landroid/util/Size;->getHeight()I

    move-result v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Lmv/c0$c$a;->b(Ljava/lang/String;Ljava/lang/String;)Lmv/c0$c;

    move-result-object v29

    iget-object v4, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v4}, Lqq/c;->i(Lqq/c;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "][cameraProperties][aspectRatio]"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v5, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v5}, Lqq/c;->d(Lqq/c;)Lsn/v;

    move-result-object v5

    invoke-virtual {v5}, Lsn/v;->a()D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Lmv/c0$c$a;->b(Ljava/lang/String;Ljava/lang/String;)Lmv/c0$c;

    move-result-object v30

    iget-object v4, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v4}, Lqq/c;->i(Lqq/c;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "][cameraProperties][frameRate]"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v5, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v5}, Lqq/c;->d(Lqq/c;)Lsn/v;

    move-result-object v5

    invoke-virtual {v5}, Lsn/v;->g()I

    move-result v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Lmv/c0$c$a;->b(Ljava/lang/String;Ljava/lang/String;)Lmv/c0$c;

    move-result-object v31

    iget-object v4, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v4}, Lqq/c;->i(Lqq/c;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "][cameraProperties][kind]"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v5, v19

    invoke-virtual {v2, v4, v5}, Lmv/c0$c$a;->b(Ljava/lang/String;Ljava/lang/String;)Lmv/c0$c;

    move-result-object v32

    iget-object v4, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v4}, Lqq/c;->i(Lqq/c;)Ljava/lang/String;

    move-result-object v4

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "][cameraProperties][selectedCameraIndex]"

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4, v5}, Lmv/c0$c$a;->b(Ljava/lang/String;Ljava/lang/String;)Lmv/c0$c;

    move-result-object v33

    iget-object v4, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v4}, Lqq/c;->i(Lqq/c;)Ljava/lang/String;

    move-result-object v4

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "][cameraProperties][streamStability]"

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4, v5}, Lmv/c0$c$a;->b(Ljava/lang/String;Ljava/lang/String;)Lmv/c0$c;

    move-result-object v34

    iget-object v4, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v4}, Lqq/c;->i(Lqq/c;)Ljava/lang/String;

    move-result-object v4

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "][cameraProperties][allCameraLabels]"

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4, v5}, Lmv/c0$c$a;->b(Ljava/lang/String;Ljava/lang/String;)Lmv/c0$c;

    move-result-object v35

    iget-object v4, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v4}, Lqq/c;->i(Lqq/c;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "][cameraProperties][client]"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v5, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v5}, Lqq/c;->f(Lqq/c;)Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Lmo/d0;->j(Landroid/content/Context;)Z

    move-result v5

    if-eqz v5, :cond_24

    const-string v5, "mobile"

    goto :goto_18

    :cond_24
    const-string v5, "mobile_sdk"

    :goto_18
    invoke-virtual {v2, v4, v5}, Lmv/c0$c$a;->b(Ljava/lang/String;Ljava/lang/String;)Lmv/c0$c;

    move-result-object v36

    iget-object v4, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v4}, Lqq/c;->i(Lqq/c;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "][cameraProperties][platform]"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {}, Lmo/l;->a()Z

    move-result v5

    if-eqz v5, :cond_25

    const-string v5, "android"

    goto :goto_19

    :cond_25
    const-string v5, "android_sdk"

    :goto_19
    invoke-virtual {v2, v4, v5}, Lmv/c0$c$a;->b(Ljava/lang/String;Ljava/lang/String;)Lmv/c0$c;

    move-result-object v37

    iget-object v4, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v4}, Lqq/c;->i(Lqq/c;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "][cameraProperties][factor]"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object v5, v0, Lqq/c$f;->L:Lqq/c;

    invoke-static {v5}, Lqq/c;->e(Lqq/c;)Lyn/a;

    move-result-object v5

    invoke-interface {v5}, Lyn/a;->b()Lyn/a$a;

    move-result-object v5

    invoke-virtual {v5}, Lyn/a$a;->a()D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Lmv/c0$c$a;->b(Ljava/lang/String;Ljava/lang/String;)Lmv/c0$c;

    move-result-object v38

    filled-new-array/range {v20 .. v38}, [Lmv/c0$c;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/p;->n([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v3, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    new-instance v2, Lqq/c$f$a;

    iget-object v4, v0, Lqq/c$f;->L:Lqq/c;

    const/4 v9, 0x0

    invoke-direct {v2, v4, v3, v9}, Lqq/c$f$a;-><init>(Lqq/c;Ljava/util/List;Leu/b;)V

    iput-object v1, v0, Lqq/c$f;->K:Ljava/lang/Object;

    invoke-static {v3}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v0, Lqq/c$f;->t:Ljava/lang/Object;

    iput-object v9, v0, Lqq/c$f;->u:Ljava/lang/Object;

    iput-object v9, v0, Lqq/c$f;->v:Ljava/lang/Object;

    iput-object v9, v0, Lqq/c$f;->w:Ljava/lang/Object;

    iput-object v9, v0, Lqq/c$f;->x:Ljava/lang/Object;

    iput-object v9, v0, Lqq/c$f;->y:Ljava/lang/Object;

    iput-object v9, v0, Lqq/c$f;->z:Ljava/lang/Object;

    iput-object v9, v0, Lqq/c$f;->A:Ljava/lang/Object;

    iput-object v9, v0, Lqq/c$f;->B:Ljava/lang/Object;

    iput-object v9, v0, Lqq/c$f;->C:Ljava/lang/Object;

    iput-object v9, v0, Lqq/c$f;->D:Ljava/lang/Object;

    iput-object v9, v0, Lqq/c$f;->E:Ljava/lang/Object;

    const/16 v4, 0x9

    iput v4, v0, Lqq/c$f;->J:I

    invoke-static {v2, v0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->enqueueVerificationRequestWithRetry(Lkotlin/jvm/functions/Function1;Leu/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v6, :cond_26

    goto/16 :goto_20

    :cond_26
    :goto_1a
    check-cast v2, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult;

    iget-object v4, v0, Lqq/c$f;->L:Lqq/c;

    instance-of v5, v2, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;

    if-eqz v5, :cond_2b

    move-object v5, v2

    check-cast v5, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Success;->getResponse()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Lqq/c;->g(Lqq/c;)Lar/a;

    move-result-object v7

    invoke-interface {v7}, Lar/a;->b()Z

    move-result v7

    if-nez v7, :cond_28

    invoke-static {v4}, Lqq/c;->p(Lqq/c;)Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_27
    :goto_1b
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_28

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lmq/b0;

    instance-of v9, v8, Lmq/b0$b;

    if-eqz v9, :cond_27

    new-instance v9, Ljava/io/File;

    check-cast v8, Lmq/b0$b;

    invoke-virtual {v8}, Lmq/b0$b;->a()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v9, v8}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9}, Ljava/io/File;->delete()Z

    goto :goto_1b

    :cond_28
    invoke-static {v4}, Lqq/c;->n(Lqq/c;)Lrq/b;

    move-result-object v4

    iput-object v1, v0, Lqq/c$f;->K:Ljava/lang/Object;

    invoke-static {v3}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v0, Lqq/c$f;->t:Ljava/lang/Object;

    iput-object v2, v0, Lqq/c$f;->u:Ljava/lang/Object;

    invoke-static {v5}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v0, Lqq/c$f;->v:Ljava/lang/Object;

    const/4 v11, 0x0

    iput v11, v0, Lqq/c$f;->F:I

    iput v11, v0, Lqq/c$f;->G:I

    const/16 v7, 0xa

    iput v7, v0, Lqq/c$f;->J:I

    invoke-virtual {v4, v0}, Lrq/b;->o(Leu/b;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v6, :cond_29

    goto/16 :goto_20

    :cond_29
    move-object v4, v3

    move-object v7, v5

    const/4 v5, 0x0

    move-object v3, v2

    const/4 v2, 0x0

    :goto_1c
    sget-object v8, Lqq/c$d$b;->a:Lqq/c$d$b;

    iput-object v1, v0, Lqq/c$f;->K:Ljava/lang/Object;

    invoke-static {v4}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v0, Lqq/c$f;->t:Ljava/lang/Object;

    iput-object v3, v0, Lqq/c$f;->u:Ljava/lang/Object;

    invoke-static {v7}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v0, Lqq/c$f;->v:Ljava/lang/Object;

    iput v5, v0, Lqq/c$f;->F:I

    iput v2, v0, Lqq/c$f;->G:I

    const/16 v2, 0xb

    iput v2, v0, Lqq/c$f;->J:I

    invoke-interface {v1, v8, v0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v6, :cond_2a

    goto :goto_20

    :cond_2a
    :goto_1d
    move-object v5, v3

    move-object v3, v4

    goto :goto_1e

    :cond_2b
    move-object v5, v2

    :goto_1e
    iget-object v2, v0, Lqq/c$f;->L:Lqq/c;

    instance-of v4, v5, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Failure;

    if-eqz v4, :cond_2d

    move-object v4, v5

    check-cast v4, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Failure;

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkCallResult$Failure;->getNetworkErrorInfo()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    move-result-object v4

    invoke-static {v2}, Lqq/c;->n(Lqq/c;)Lrq/b;

    move-result-object v2

    iput-object v1, v0, Lqq/c$f;->K:Ljava/lang/Object;

    invoke-static {v3}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v0, Lqq/c$f;->t:Ljava/lang/Object;

    iput-object v5, v0, Lqq/c$f;->u:Ljava/lang/Object;

    iput-object v4, v0, Lqq/c$f;->v:Ljava/lang/Object;

    const/4 v11, 0x0

    iput v11, v0, Lqq/c$f;->F:I

    iput v11, v0, Lqq/c$f;->G:I

    const/16 v7, 0xc

    iput v7, v0, Lqq/c$f;->J:I

    invoke-virtual {v2, v0}, Lrq/b;->o(Leu/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v6, :cond_2c

    goto :goto_20

    :cond_2c
    move v12, v11

    :goto_1f
    new-instance v2, Lqq/c$d$a;

    invoke-direct {v2, v4}, Lqq/c$d$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-static {v1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v0, Lqq/c$f;->K:Ljava/lang/Object;

    invoke-static {v3}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v0, Lqq/c$f;->t:Ljava/lang/Object;

    iput-object v5, v0, Lqq/c$f;->u:Ljava/lang/Object;

    invoke-static {v4}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v0, Lqq/c$f;->v:Ljava/lang/Object;

    iput v12, v0, Lqq/c$f;->F:I

    iput v11, v0, Lqq/c$f;->G:I

    const/16 v3, 0xd

    iput v3, v0, Lqq/c$f;->J:I

    invoke-interface {v1, v2, v0}, Ldv/i;->emit(Ljava/lang/Object;Leu/b;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_2d

    :goto_20
    return-object v6

    :cond_2d
    :goto_21
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v1

    :cond_2e
    new-instance v1, Lzt/l;

    invoke-direct {v1}, Lzt/l;-><init>()V

    throw v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final m(Ldv/i;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldv/i<",
            "-",
            "Lqq/c$d;",
            ">;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lqq/c$f;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lqq/c$f;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lqq/c$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
