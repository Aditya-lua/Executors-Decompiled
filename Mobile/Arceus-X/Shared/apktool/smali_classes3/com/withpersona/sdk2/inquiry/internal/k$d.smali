.class public final Lcom/withpersona/sdk2/inquiry/internal/k$d;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/internal/k;->run()Lnu/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/internal/k$d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lnu/i<",
        "-",
        "Lcom/withpersona/sdk2/inquiry/internal/k$c;",
        ">;",
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lnu/i;",
        "Lcom/withpersona/sdk2/inquiry/internal/k$c;",
        "",
        "<anonymous>",
        "(Lnu/i;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.withpersona.sdk2.inquiry.internal.PollingWorker$run$1"
    f = "PollingWorker.kt"
    l = {
        0x34,
        0x3f,
        0x8e,
        0x99,
        0xa0,
        0xa4,
        0xaa,
        0xae
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public A:Ljava/lang/Object;

.field public B:Ljava/lang/Object;

.field public C:Ljava/lang/Object;

.field public D:I

.field public E:J

.field public F:I

.field public synthetic G:Ljava/lang/Object;

.field public final synthetic H:Lcom/withpersona/sdk2/inquiry/internal/k;

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/k;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/internal/k;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/internal/k$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/k$d;->H:Lcom/withpersona/sdk2/inquiry/internal/k;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lpt/m;-><init>(ILnt/b;)V

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

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/k$d;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/internal/k$d;->H:Lcom/withpersona/sdk2/inquiry/internal/k;

    invoke-direct {v0, v1, p2}, Lcom/withpersona/sdk2/inquiry/internal/k$d;-><init>(Lcom/withpersona/sdk2/inquiry/internal/k;Lnt/b;)V

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/internal/k$d;->G:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnu/i;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/k$d;->q(Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    move-object/from16 v5, p0

    iget-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lnu/i;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v7

    iget v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->F:I

    const/4 v10, 0x0

    const/4 v11, 0x1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->v:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/b0;

    iget-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->u:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/b0;

    iget-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->t:Ljava/lang/Object;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;

    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_17

    :pswitch_1
    iget-wide v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->E:J

    iget v2, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->D:I

    iget-object v3, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->w:Ljava/lang/Object;

    check-cast v3, Ljv/x;

    iget-object v3, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->v:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/b0;

    iget-object v4, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->u:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/internal/b0;

    iget-object v12, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->t:Ljava/lang/Object;

    check-cast v12, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;

    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    move-object/from16 v16, v12

    const/4 v9, 0x2

    move v14, v2

    move-object v15, v3

    move-wide v12, v0

    :goto_0
    move-object v0, v4

    goto/16 :goto_14

    :pswitch_2
    iget-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->x:Ljava/lang/Object;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    iget-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->w:Ljava/lang/Object;

    check-cast v0, Ljv/x;

    iget-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->v:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/b0;

    iget-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->u:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/b0;

    iget-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->t:Ljava/lang/Object;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;

    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_12

    :pswitch_3
    iget-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->x:Ljava/lang/Object;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    iget-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->w:Ljava/lang/Object;

    check-cast v0, Ljv/x;

    iget-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->v:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/b0;

    iget-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->u:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/b0;

    iget-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->t:Ljava/lang/Object;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;

    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_11

    :pswitch_4
    iget-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->B:Ljava/lang/Object;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/internal/InquiryState;

    iget-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->A:Ljava/lang/Object;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;

    iget-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->z:Ljava/lang/Object;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$WaitForTransitionConfig;

    iget-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->x:Ljava/lang/Object;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;

    iget-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->w:Ljava/lang/Object;

    check-cast v0, Ljv/x;

    iget-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->v:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/b0;

    iget-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->u:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/b0;

    iget-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->t:Ljava/lang/Object;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;

    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_e

    :pswitch_5
    iget-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->C:Ljava/lang/Object;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/internal/InquiryState;

    iget-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->B:Ljava/lang/Object;

    check-cast v0, Lzo/a0;

    iget-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->A:Ljava/lang/Object;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;

    iget-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->z:Ljava/lang/Object;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$WaitForTransitionConfig;

    iget-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->x:Ljava/lang/Object;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;

    iget-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->w:Ljava/lang/Object;

    check-cast v0, Ljv/x;

    iget-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->v:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/b0;

    iget-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->u:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/b0;

    iget-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->t:Ljava/lang/Object;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;

    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_10

    :pswitch_6
    iget-wide v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->E:J

    iget v2, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->D:I

    iget-object v3, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->v:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/b0;

    iget-object v4, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->u:Ljava/lang/Object;

    check-cast v4, Lkotlin/jvm/internal/b0;

    iget-object v12, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->t:Ljava/lang/Object;

    check-cast v12, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;

    :try_start_0
    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v16, v12

    move-wide v12, v0

    move-object/from16 v0, p1

    goto/16 :goto_6

    :catch_0
    move v14, v2

    move-object v15, v3

    move/from16 v17, v11

    move-object/from16 v16, v12

    const/4 v9, 0x2

    move-wide v12, v0

    move-object v0, v4

    goto/16 :goto_15

    :pswitch_7
    iget-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->t:Ljava/lang/Object;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;

    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_8
    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->H:Lcom/withpersona/sdk2/inquiry/internal/k;

    invoke-static {v0}, Lcom/withpersona/sdk2/inquiry/internal/k;->e(Lcom/withpersona/sdk2/inquiry/internal/k;)Ldp/i;

    move-result-object v0

    invoke-virtual {v0}, Ldp/i;->d()Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v1, Lcom/withpersona/sdk2/inquiry/internal/k$c$b;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;->a()Lcom/withpersona/sdk2/inquiry/internal/InquiryState;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/withpersona/sdk2/inquiry/internal/k$c$b;-><init>(Lcom/withpersona/sdk2/inquiry/internal/InquiryState;)V

    invoke-static {v6}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->G:Ljava/lang/Object;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->t:Ljava/lang/Object;

    iput v11, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->F:I

    invoke-interface {v6, v1, v5}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_0

    goto/16 :goto_16

    :cond_0
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_1
    new-instance v1, Lkotlin/jvm/internal/b0;

    invoke-direct {v1}, Lkotlin/jvm/internal/b0;-><init>()V

    const-wide/16 v2, 0x3e8

    iput-wide v2, v1, Lkotlin/jvm/internal/b0;->a:J

    new-instance v2, Lkotlin/jvm/internal/b0;

    invoke-direct {v2}, Lkotlin/jvm/internal/b0;-><init>()V

    const-wide/32 v3, 0x15f90

    iput-wide v3, v2, Lkotlin/jvm/internal/b0;->a:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    move-object/from16 v16, v0

    move-object v0, v1

    move-object v15, v2

    move-wide v12, v3

    const/4 v14, 0x0

    :goto_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sub-long/2addr v1, v12

    iget-wide v3, v15, Lkotlin/jvm/internal/b0;->a:J

    cmp-long v1, v1, v3

    if-gez v1, :cond_20

    :try_start_1
    iget-object v1, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->H:Lcom/withpersona/sdk2/inquiry/internal/k;

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/internal/k;->k(Lcom/withpersona/sdk2/inquiry/internal/k;)Lgp/w;

    move-result-object v1

    iget-object v2, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->H:Lcom/withpersona/sdk2/inquiry/internal/k;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/internal/k;->p()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->H:Lcom/withpersona/sdk2/inquiry/internal/k;

    invoke-static {v3}, Lcom/withpersona/sdk2/inquiry/internal/k;->d(Lcom/withpersona/sdk2/inquiry/internal/k;)Lyn/a;

    move-result-object v3

    invoke-interface {v3}, Lyn/a;->b()Ljava/lang/String;

    move-result-object v3

    iget-object v4, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->H:Lcom/withpersona/sdk2/inquiry/internal/k;

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/internal/k;->o()Ljava/lang/String;

    move-result-object v4

    iget-object v8, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->H:Lcom/withpersona/sdk2/inquiry/internal/k;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_6

    :try_start_2
    invoke-static {}, Lkotlin/collections/o;->c()Ljava/util/List;

    move-result-object v11

    const-string v9, "theme-variable-fonts"

    invoke-interface {v11, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {v8}, Lcom/withpersona/sdk2/inquiry/internal/k;->h(Lcom/withpersona/sdk2/inquiry/internal/k;)Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;

    move-result-object v9

    invoke-virtual {v9}, Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;->j()Z

    move-result v9
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_5

    if-eqz v9, :cond_2

    :try_start_3
    const-string v9, "current-inquiry-session"

    invoke-interface {v11, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_5

    :catch_1
    :goto_3
    const/4 v9, 0x2

    :goto_4
    const/16 v17, 0x1

    goto/16 :goto_15

    :cond_2
    :goto_5
    :try_start_4
    invoke-static {v8}, Lcom/withpersona/sdk2/inquiry/internal/k;->l(Lcom/withpersona/sdk2/inquiry/internal/k;)Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;

    move-result-object v8

    invoke-virtual {v8}, Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;->a()Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme;

    move-result-object v8

    invoke-virtual {v8}, Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme;->g()Z

    move-result v8
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_5

    if-eqz v8, :cond_3

    :try_start_5
    const-string v8, "inquiry-template-version"

    invoke-interface {v11, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    :cond_3
    :try_start_6
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-static {v11}, Lkotlin/collections/o;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    move-object/from16 v18, v8

    check-cast v18, Ljava/lang/Iterable;

    const-string v19, ","

    const/16 v25, 0x3e

    const/16 v26, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-static/range {v18 .. v26}, Lkotlin/collections/CollectionsKt;->m0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    iput-object v6, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->G:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    iput-object v9, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->t:Ljava/lang/Object;

    iput-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->u:Ljava/lang/Object;

    iput-object v15, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->v:Ljava/lang/Object;

    iput-object v10, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->w:Ljava/lang/Object;

    iput v14, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->D:I

    iput-wide v12, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->E:J
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    const/4 v9, 0x2

    :try_start_7
    iput v9, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->F:I
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4

    move-object/from16 v27, v8

    move-object v8, v0

    move-object v0, v1

    move-object v1, v2

    move-object v2, v3

    move-object v3, v4

    move-object/from16 v4, v27

    :try_start_8
    invoke-interface/range {v0 .. v5}, Lgp/w;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;

    move-result-object v0
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_3

    if-ne v0, v7, :cond_4

    goto/16 :goto_16

    :cond_4
    move-object v4, v8

    move v2, v14

    move-object v3, v15

    :goto_6
    :try_start_9
    check-cast v0, Ljv/x;
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_2

    invoke-virtual {v0}, Ljv/x;->g()Z

    move-result v1

    if-eqz v1, :cond_1a

    invoke-virtual {v0}, Ljv/x;->f()Lokhttp3/Headers;

    move-result-object v1

    const-string v8, "persona-device-id"

    invoke-virtual {v1, v8}, Lokhttp3/Headers;->get(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_5

    iget-object v8, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->H:Lcom/withpersona/sdk2/inquiry/internal/k;

    invoke-static {v8}, Lcom/withpersona/sdk2/inquiry/internal/k;->d(Lcom/withpersona/sdk2/inquiry/internal/k;)Lyn/a;

    move-result-object v8

    invoke-interface {v8, v1}, Lyn/a;->a(Ljava/lang/String;)V

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    :cond_5
    invoke-virtual {v0}, Ljv/x;->a()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_19

    check-cast v1, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;->getData()Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Data;

    move-result-object v8

    invoke-virtual {v8}, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Data;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Attributes;

    move-result-object v8

    invoke-virtual {v8}, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Attributes;->getEnvironment()Ljava/lang/String;

    move-result-object v8

    const-string v9, "SANDBOX"

    sget-object v11, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v9, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    const-string v11, "toLowerCase(...)"

    invoke-static {v9, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v8, v9}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    iget-object v8, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->H:Lcom/withpersona/sdk2/inquiry/internal/k;

    invoke-static {v8}, Lcom/withpersona/sdk2/inquiry/internal/k;->j(Lcom/withpersona/sdk2/inquiry/internal/k;)Lwp/c;

    move-result-object v8

    const/4 v9, 0x1

    invoke-virtual {v8, v9}, Lwp/c;->e(Z)V

    :cond_6
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;->getIncluded()Ljava/util/List;

    move-result-object v8

    if-eqz v8, :cond_a

    check-cast v8, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_7
    :goto_7
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_8

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    instance-of v14, v11, Lcom/withpersona/sdk2/inquiry/network/dto/Included$Font;

    if-eqz v14, :cond_7

    invoke-interface {v9, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_8
    new-instance v8, Ljava/util/ArrayList;

    const/16 v11, 0xa

    invoke-static {v9, v11}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v8, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v11

    const/4 v14, 0x0

    :goto_8
    if-ge v14, v11, :cond_9

    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    add-int/lit8 v14, v14, 0x1

    check-cast v15, Lcom/withpersona/sdk2/inquiry/network/dto/Included$Font;

    new-instance v10, Lkr/f;

    invoke-virtual {v15}, Lcom/withpersona/sdk2/inquiry/network/dto/Included$Font;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/Included$Font$FontAttributes;

    move-result-object v19

    move-object/from16 p1, v0

    invoke-virtual/range {v19 .. v19}, Lcom/withpersona/sdk2/inquiry/network/dto/Included$Font$FontAttributes;->getFontFamilyName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v15}, Lcom/withpersona/sdk2/inquiry/network/dto/Included$Font;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/Included$Font$FontAttributes;

    move-result-object v19

    move-object/from16 v20, v9

    invoke-virtual/range {v19 .. v19}, Lcom/withpersona/sdk2/inquiry/network/dto/Included$Font$FontAttributes;->getUrl()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v15}, Lcom/withpersona/sdk2/inquiry/network/dto/Included$Font;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/Included$Font$FontAttributes;

    move-result-object v19

    move/from16 v21, v11

    invoke-virtual/range {v19 .. v19}, Lcom/withpersona/sdk2/inquiry/network/dto/Included$Font$FontAttributes;->getFontWeight()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;

    move-result-object v11

    invoke-virtual {v15}, Lcom/withpersona/sdk2/inquiry/network/dto/Included$Font;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/Included$Font$FontAttributes;

    move-result-object v15

    invoke-virtual {v15}, Lcom/withpersona/sdk2/inquiry/network/dto/Included$Font$FontAttributes;->getFontStyle()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontStyle;

    move-result-object v15

    invoke-direct {v10, v0, v9, v11, v15}, Lkr/f;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontWeight;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$FontStyle;)V

    invoke-interface {v8, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p1

    move-object/from16 v9, v20

    move/from16 v11, v21

    const/4 v10, 0x0

    goto :goto_8

    :cond_9
    :goto_9
    move-object/from16 p1, v0

    goto :goto_a

    :cond_a
    const/4 v8, 0x0

    goto :goto_9

    :goto_a
    iget-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->H:Lcom/withpersona/sdk2/inquiry/internal/k;

    invoke-static {v0}, Lcom/withpersona/sdk2/inquiry/internal/k;->f(Lcom/withpersona/sdk2/inquiry/internal/k;)Lkr/a;

    move-result-object v0

    invoke-interface {v0, v8}, Lkr/a;->c(Ljava/util/List;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;->getIncluded()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_d

    check-cast v0, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_b
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    instance-of v11, v10, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryTemplateVersion;

    if-eqz v11, :cond_b

    invoke-interface {v9, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_c
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryTemplateVersion;

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryTemplateVersion;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/InquiryTemplateVersion$Attributes;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/InquiryTemplateVersion$Attributes;->getTheme()Lcom/withpersona/sdk2/inquiry/network/dto/InquiryTemplateVersion$InquiryTheme;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-static {v0}, Lgp/a;->R(Lcom/withpersona/sdk2/inquiry/network/dto/InquiryTemplateVersion$InquiryTheme;)Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme;

    move-result-object v0

    if-eqz v0, :cond_d

    iget-object v9, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->H:Lcom/withpersona/sdk2/inquiry/internal/k;

    invoke-static {v9}, Lcom/withpersona/sdk2/inquiry/internal/k;->l(Lcom/withpersona/sdk2/inquiry/internal/k;)Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;

    move-result-object v9

    invoke-virtual {v9, v0}, Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;->b(Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    :cond_d
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;->getData()Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Data;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Data;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Attributes;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$Attributes;->getWaitForTransitionConfig()Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$WaitForTransitionConfig;

    move-result-object v0

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;->getIncluded()Ljava/util/List;

    move-result-object v9

    if-eqz v9, :cond_10

    check-cast v9, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_e
    :goto_c
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_f

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    instance-of v14, v11, Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;

    if-eqz v14, :cond_e

    invoke-interface {v10, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_f
    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;

    goto :goto_d

    :cond_10
    const/4 v9, 0x0

    :goto_d
    if-eqz v9, :cond_11

    iget-object v10, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->H:Lcom/withpersona/sdk2/inquiry/internal/k;

    invoke-static {v10}, Lcom/withpersona/sdk2/inquiry/internal/k;->g(Lcom/withpersona/sdk2/inquiry/internal/k;)Lcom/withpersona/sdk2/inquiry/internal/network/e;

    move-result-object v10

    invoke-virtual {v10, v9}, Lcom/withpersona/sdk2/inquiry/internal/network/e;->q(Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;)V

    iget-object v10, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->H:Lcom/withpersona/sdk2/inquiry/internal/k;

    invoke-virtual {v9}, Lcom/withpersona/sdk2/inquiry/network/dto/InquirySessionData;->getAttributes()Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;

    move-result-object v11

    invoke-static {v11}, Lgp/c;->a(Lcom/withpersona/sdk2/inquiry/network/dto/Attributes;)Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;

    move-result-object v11

    invoke-static {v10, v11}, Lcom/withpersona/sdk2/inquiry/internal/k;->n(Lcom/withpersona/sdk2/inquiry/internal/k;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;)V

    :cond_11
    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$WaitForTransitionConfig;->getPollingMode()Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$PollingMode;

    move-result-object v10

    sget-object v11, Lcom/withpersona/sdk2/inquiry/internal/k$d$a;->a:[I

    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    aget v10, v11, v10

    const/4 v11, 0x3

    const/4 v14, 0x1

    if-eq v10, v14, :cond_14

    const/4 v15, 0x2

    if-eq v10, v15, :cond_14

    if-ne v10, v11, :cond_13

    iget-object v10, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->H:Lcom/withpersona/sdk2/inquiry/internal/k;

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/internal/k;->p()Ljava/lang/String;

    move-result-object v10

    iget-object v11, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->H:Lcom/withpersona/sdk2/inquiry/internal/k;

    invoke-static {v11}, Lcom/withpersona/sdk2/inquiry/internal/k;->h(Lcom/withpersona/sdk2/inquiry/internal/k;)Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;

    move-result-object v11

    iget-object v14, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->H:Lcom/withpersona/sdk2/inquiry/internal/k;

    invoke-static {v14}, Lcom/withpersona/sdk2/inquiry/internal/k;->m(Lcom/withpersona/sdk2/inquiry/internal/k;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v1, v10, v11, v14}, Lgp/a;->w(Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;

    move-result-object v10

    new-instance v11, Lcom/withpersona/sdk2/inquiry/internal/k$c$b;

    invoke-direct {v11, v10}, Lcom/withpersona/sdk2/inquiry/internal/k$c$b;-><init>(Lcom/withpersona/sdk2/inquiry/internal/InquiryState;)V

    invoke-static {v6}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->G:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->t:Ljava/lang/Object;

    invoke-static {v4}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->u:Ljava/lang/Object;

    invoke-static {v3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->v:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->w:Ljava/lang/Object;

    invoke-static {v1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->x:Ljava/lang/Object;

    invoke-static {v8}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->y:Ljava/lang/Object;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->z:Ljava/lang/Object;

    invoke-static {v9}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->A:Ljava/lang/Object;

    invoke-static {v10}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->B:Ljava/lang/Object;

    iput v2, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->D:I

    iput-wide v12, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->E:J

    const/4 v0, 0x4

    iput v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->F:I

    invoke-interface {v6, v11, v5}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_12

    goto/16 :goto_16

    :cond_12
    :goto_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_13
    new-instance v0, Ljt/l;

    invoke-direct {v0}, Ljt/l;-><init>()V

    throw v0

    :cond_14
    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$WaitForTransitionConfig;->getIntervalMs()Ljava/lang/Long;

    move-result-object v10

    if-eqz v10, :cond_15

    invoke-virtual {v10}, Ljava/lang/Number;->longValue()J

    move-result-wide v14

    iput-wide v14, v4, Lkotlin/jvm/internal/b0;->a:J

    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    :cond_15
    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$WaitForTransitionConfig;->getMaxAttempts()Ljava/lang/Long;

    move-result-object v10

    if-eqz v10, :cond_16

    invoke-virtual {v10}, Ljava/lang/Number;->longValue()J

    move-result-wide v14

    move-wide/from16 v19, v12

    iget-wide v11, v4, Lkotlin/jvm/internal/b0;->a:J

    mul-long/2addr v14, v11

    iput-wide v14, v3, Lkotlin/jvm/internal/b0;->a:J

    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    goto :goto_f

    :cond_16
    move-wide/from16 v19, v12

    :goto_f
    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$WaitForTransitionConfig;->getPollingMode()Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$PollingMode;

    move-result-object v11

    invoke-static {v11}, Lzo/b0;->a(Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse$PollingMode;)Lzo/a0;

    move-result-object v11

    iget-object v12, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->H:Lcom/withpersona/sdk2/inquiry/internal/k;

    invoke-static {v12}, Lcom/withpersona/sdk2/inquiry/internal/k;->i(Lcom/withpersona/sdk2/inquiry/internal/k;)Lzo/a0;

    move-result-object v12

    if-eq v12, v11, :cond_18

    iget-object v12, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->H:Lcom/withpersona/sdk2/inquiry/internal/k;

    invoke-virtual {v12}, Lcom/withpersona/sdk2/inquiry/internal/k;->p()Ljava/lang/String;

    move-result-object v12

    iget-object v13, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->H:Lcom/withpersona/sdk2/inquiry/internal/k;

    invoke-static {v13}, Lcom/withpersona/sdk2/inquiry/internal/k;->h(Lcom/withpersona/sdk2/inquiry/internal/k;)Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;

    move-result-object v13

    iget-object v14, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->H:Lcom/withpersona/sdk2/inquiry/internal/k;

    invoke-static {v14}, Lcom/withpersona/sdk2/inquiry/internal/k;->m(Lcom/withpersona/sdk2/inquiry/internal/k;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v1, v12, v13, v14}, Lgp/a;->w(Lcom/withpersona/sdk2/inquiry/network/dto/CheckInquiryResponse;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;

    move-result-object v12

    new-instance v13, Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus$CheckingForNextState;

    iget-object v14, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->H:Lcom/withpersona/sdk2/inquiry/internal/k;

    invoke-static {v14}, Lcom/withpersona/sdk2/inquiry/internal/k;->b(Lcom/withpersona/sdk2/inquiry/internal/k;)Z

    move-result v14

    invoke-direct {v13, v11, v14}, Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus$CheckingForNextState;-><init>(Lzo/a0;Z)V

    invoke-virtual {v12, v13}, Lcom/withpersona/sdk2/inquiry/internal/InquiryState;->p(Lcom/withpersona/sdk2/inquiry/internal/TransitionStatus;)Lcom/withpersona/sdk2/inquiry/internal/InquiryState;

    move-result-object v12

    new-instance v13, Lcom/withpersona/sdk2/inquiry/internal/k$c$b;

    invoke-direct {v13, v12}, Lcom/withpersona/sdk2/inquiry/internal/k$c$b;-><init>(Lcom/withpersona/sdk2/inquiry/internal/InquiryState;)V

    invoke-static {v6}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->G:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    iput-object v14, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->t:Ljava/lang/Object;

    invoke-static {v4}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->u:Ljava/lang/Object;

    invoke-static {v3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->v:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->w:Ljava/lang/Object;

    invoke-static {v1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->x:Ljava/lang/Object;

    invoke-static {v8}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->y:Ljava/lang/Object;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->z:Ljava/lang/Object;

    invoke-static {v9}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->A:Ljava/lang/Object;

    invoke-static {v11}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->B:Ljava/lang/Object;

    invoke-static {v12}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->C:Ljava/lang/Object;

    iput v2, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->D:I

    move-wide/from16 v0, v19

    iput-wide v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->E:J

    const/4 v10, 0x3

    iput v10, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->F:I

    invoke-interface {v6, v13, v5}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_17

    goto/16 :goto_16

    :cond_17
    :goto_10
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_18
    move-wide/from16 v0, v19

    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    const/4 v9, 0x2

    goto/16 :goto_13

    :cond_19
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Required value was null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1a
    move-object/from16 p1, v0

    move-wide v0, v12

    invoke-static/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkUtilsKt;->toErrorInfo(Ljv/x;)Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    move-result-object v8

    invoke-virtual {v8}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;->isRecoverable()Z

    move-result v9

    if-nez v9, :cond_1c

    new-instance v9, Lcom/withpersona/sdk2/inquiry/internal/k$c$a;

    invoke-direct {v9, v8}, Lcom/withpersona/sdk2/inquiry/internal/k$c$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-static {v6}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->G:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->t:Ljava/lang/Object;

    invoke-static {v4}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->u:Ljava/lang/Object;

    invoke-static {v3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->v:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->w:Ljava/lang/Object;

    invoke-static {v8}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->x:Ljava/lang/Object;

    iput v2, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->D:I

    iput-wide v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->E:J

    const/4 v0, 0x5

    iput v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->F:I

    invoke-interface {v6, v9, v5}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_1b

    goto/16 :goto_16

    :cond_1b
    :goto_11
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_1c
    const/4 v9, 0x2

    if-lt v2, v9, :cond_1e

    new-instance v9, Lcom/withpersona/sdk2/inquiry/internal/k$c$a;

    invoke-direct {v9, v8}, Lcom/withpersona/sdk2/inquiry/internal/k$c$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-static {v6}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->G:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->t:Ljava/lang/Object;

    invoke-static {v4}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->u:Ljava/lang/Object;

    invoke-static {v3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->v:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->w:Ljava/lang/Object;

    invoke-static {v8}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->x:Ljava/lang/Object;

    iput v2, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->D:I

    iput-wide v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->E:J

    const/4 v0, 0x6

    iput v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->F:I

    invoke-interface {v6, v9, v5}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_1d

    goto/16 :goto_16

    :cond_1d
    :goto_12
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_1e
    add-int/lit8 v8, v2, 0x1

    invoke-static {v2}, Lpt/b;->d(I)Ljava/lang/Integer;

    move v2, v8

    :goto_13
    iget-wide v10, v4, Lkotlin/jvm/internal/b0;->a:J

    iput-object v6, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->G:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->t:Ljava/lang/Object;

    iput-object v4, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->u:Ljava/lang/Object;

    iput-object v3, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->v:Ljava/lang/Object;

    invoke-static/range {p1 .. p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->w:Ljava/lang/Object;

    iput v2, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->D:I

    iput-wide v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->E:J

    const/4 v8, 0x7

    iput v8, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->F:I

    invoke-static {v10, v11, v5}, Lku/z0;->b(JLnt/b;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v7, :cond_1f

    goto/16 :goto_16

    :cond_1f
    move-wide v12, v0

    move v14, v2

    move-object v15, v3

    goto/16 :goto_0

    :goto_14
    const/4 v10, 0x0

    const/4 v11, 0x1

    goto/16 :goto_2

    :catch_2
    move-wide v0, v12

    const/4 v9, 0x2

    move v14, v2

    move-object v15, v3

    move-object v0, v4

    goto/16 :goto_4

    :catch_3
    const/4 v9, 0x2

    const/16 v17, 0x1

    move-object v0, v8

    goto :goto_15

    :catch_4
    move-object v8, v0

    goto/16 :goto_4

    :catch_5
    move-object v8, v0

    goto/16 :goto_3

    :catch_6
    move-object v8, v0

    move/from16 v17, v11

    const/4 v9, 0x2

    :goto_15
    move/from16 v11, v17

    const/4 v10, 0x0

    goto/16 :goto_2

    :cond_20
    move-object v8, v0

    iget-object v0, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->H:Lcom/withpersona/sdk2/inquiry/internal/k;

    invoke-static {v0}, Lcom/withpersona/sdk2/inquiry/internal/k;->i(Lcom/withpersona/sdk2/inquiry/internal/k;)Lzo/a0;

    move-result-object v0

    sget-object v1, Lzo/a0;->b:Lzo/a0;

    if-ne v0, v1, :cond_21

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/k$c$a;

    new-instance v19, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    const/16 v24, 0x8

    const/16 v25, 0x0

    const/16 v20, 0x0

    const-string v21, "Timeout error. Wait for transition exceeded 90000ms."

    const/16 v22, 0x1

    const/16 v23, 0x0

    invoke-direct/range {v19 .. v25}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;-><init>(ILjava/lang/String;ZLcom/withpersona/sdk2/inquiry/network/core/ErrorResponse$Error;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v19

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/internal/k$c$a;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-static {v6}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->G:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->t:Ljava/lang/Object;

    invoke-static {v8}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->u:Ljava/lang/Object;

    invoke-static {v15}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->v:Ljava/lang/Object;

    const/4 v1, 0x0

    iput-object v1, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->w:Ljava/lang/Object;

    iput v14, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->D:I

    iput-wide v12, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->E:J

    const/16 v1, 0x8

    iput v1, v5, Lcom/withpersona/sdk2/inquiry/internal/k$d;->F:I

    invoke-interface {v6, v0, v5}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_21

    :goto_16
    return-object v7

    :cond_21
    :goto_17
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
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

.method public final q(Lnu/i;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu/i<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/internal/k$c;",
            ">;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/k$d;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/internal/k$d;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/internal/k$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
