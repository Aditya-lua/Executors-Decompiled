.class public final Lcom/withpersona/sdk2/inquiry/nfc/b$b;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/nfc/b;->run()Lnu/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lnu/i<",
        "-",
        "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;",
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
        "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;",
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
    c = "com.withpersona.sdk2.inquiry.nfc.ScanNfcWorker$run$1"
    f = "ScanNfcWorker.kt"
    l = {
        0x44,
        0x5e,
        0x62,
        0x67
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:I

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lcom/withpersona/sdk2/inquiry/nfc/b;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/nfc/b;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/nfc/b;",
            "Lnt/b<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/nfc/b$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->y:Lcom/withpersona/sdk2/inquiry/nfc/b;

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

    new-instance v0, Lcom/withpersona/sdk2/inquiry/nfc/b$b;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->y:Lcom/withpersona/sdk2/inquiry/nfc/b;

    invoke-direct {v0, v1, p2}, Lcom/withpersona/sdk2/inquiry/nfc/b$b;-><init>(Lcom/withpersona/sdk2/inquiry/nfc/b;Lnt/b;)V

    iput-object p1, v0, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnu/i;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->q(Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v1, p0

    iget-object v0, v1, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->x:Ljava/lang/Object;

    check-cast v0, Lnu/i;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v2

    iget v3, v1, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->w:I

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x1

    const/4 v7, 0x2

    if-eqz v3, :cond_4

    if-eq v3, v6, :cond_3

    if-eq v3, v7, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v0, v1, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->t:Ljava/lang/Object;

    check-cast v0, Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;

    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v3, v1, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->t:Ljava/lang/Object;

    check-cast v3, Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;

    :try_start_0
    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_2

    :cond_2
    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    goto/16 :goto_1

    :cond_3
    iget-object v0, v1, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->v:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    iget-object v0, v1, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->u:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    iget-object v0, v1, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->t:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_4
    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object v3, v1, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->y:Lcom/withpersona/sdk2/inquiry/nfc/b;

    invoke-static {v3}, Lcom/withpersona/sdk2/inquiry/nfc/b;->l(Lcom/withpersona/sdk2/inquiry/nfc/b;)Lwp/c;

    move-result-object v3

    invoke-virtual {v3}, Lwp/c;->b()Z

    move-result v3

    if-eqz v3, :cond_6

    iget-object v3, v1, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->y:Lcom/withpersona/sdk2/inquiry/nfc/b;

    invoke-static {v3}, Lcom/withpersona/sdk2/inquiry/nfc/b;->m(Lcom/withpersona/sdk2/inquiry/nfc/b;)Lqq/c;

    move-result-object v3

    const-string v4, ".dat"

    invoke-virtual {v3, v4}, Lqq/c;->e(Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    new-instance v5, Ljava/io/FileOutputStream;

    invoke-direct {v5, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    :try_start_1
    const-string v8, "this_is_some_fake_dg1_data"

    const/4 v9, 0x0

    invoke-static {v3, v8, v9, v7, v9}, Lut/i;->k(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)V

    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_4

    invoke-static {v5, v9}, Lut/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    iget-object v5, v1, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->y:Lcom/withpersona/sdk2/inquiry/nfc/b;

    invoke-static {v5}, Lcom/withpersona/sdk2/inquiry/nfc/b;->m(Lcom/withpersona/sdk2/inquiry/nfc/b;)Lqq/c;

    move-result-object v5

    invoke-virtual {v5, v4}, Lqq/c;->e(Ljava/lang/String;)Ljava/io/File;

    move-result-object v5

    new-instance v8, Ljava/io/FileOutputStream;

    invoke-direct {v8, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    :try_start_2
    const-string v10, "this_is_some_fake_dg2_data"

    invoke-static {v5, v10, v9, v7, v9}, Lut/i;->k(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-static {v8, v9}, Lut/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    iget-object v8, v1, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->y:Lcom/withpersona/sdk2/inquiry/nfc/b;

    invoke-static {v8}, Lcom/withpersona/sdk2/inquiry/nfc/b;->m(Lcom/withpersona/sdk2/inquiry/nfc/b;)Lqq/c;

    move-result-object v8

    invoke-virtual {v8, v4}, Lqq/c;->e(Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    new-instance v8, Ljava/io/FileOutputStream;

    invoke-direct {v8, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    :try_start_3
    const-string v10, "this_is_some_fake_sod_data"

    invoke-static {v4, v10, v9, v7, v9}, Lut/i;->k(Ljava/io/File;Ljava/lang/String;Ljava/nio/charset/Charset;ILjava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-static {v8, v9}, Lut/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    iget-object v7, v1, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->y:Lcom/withpersona/sdk2/inquiry/nfc/b;

    invoke-static {v7}, Lcom/withpersona/sdk2/inquiry/nfc/b;->f(Lcom/withpersona/sdk2/inquiry/nfc/b;)Landroid/content/Context;

    move-result-object v7

    const-string v8, "Using simulated government ID NFC data"

    const/4 v9, 0x0

    invoke-static {v7, v8, v9}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v7

    invoke-virtual {v7}, Landroid/widget/Toast;->show()V

    new-instance v8, Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$Success;

    invoke-static {v3}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v9

    invoke-static {v5}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v10

    invoke-static {v4}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v11

    sget-object v12, Lqp/a;->a:Lqp/a;

    iget-object v7, v1, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->y:Lcom/withpersona/sdk2/inquiry/nfc/b;

    invoke-static {v7}, Lcom/withpersona/sdk2/inquiry/nfc/b;->k(Lcom/withpersona/sdk2/inquiry/nfc/b;)Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;

    move-result-object v7

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;->a()Ljava/lang/String;

    move-result-object v13

    invoke-direct/range {v8 .. v13}, Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput$Success;-><init>(Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Lqp/a;Ljava/lang/String;)V

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v1, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->x:Ljava/lang/Object;

    invoke-static {v3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v1, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->t:Ljava/lang/Object;

    invoke-static {v5}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v1, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->u:Ljava/lang/Object;

    invoke-static {v4}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, v1, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->v:Ljava/lang/Object;

    iput v6, v1, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->w:I

    invoke-interface {v0, v8, v1}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_5

    goto/16 :goto_3

    :cond_5
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :catchall_0
    move-exception v0

    move-object v2, v0

    :try_start_4
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {v8, v2}, Lut/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :catchall_2
    move-exception v0

    move-object v2, v0

    :try_start_5
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :catchall_3
    move-exception v0

    invoke-static {v8, v2}, Lut/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :catchall_4
    move-exception v0

    move-object v2, v0

    :try_start_6
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    :catchall_5
    move-exception v0

    invoke-static {v5, v2}, Lut/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_6
    iget-object v3, v1, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->y:Lcom/withpersona/sdk2/inquiry/nfc/b;

    invoke-static {v3}, Lcom/withpersona/sdk2/inquiry/nfc/b;->j(Lcom/withpersona/sdk2/inquiry/nfc/b;)Lg/c;

    move-result-object v3

    iget-object v6, v1, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->y:Lcom/withpersona/sdk2/inquiry/nfc/b;

    invoke-static {v6}, Lcom/withpersona/sdk2/inquiry/nfc/b;->d(Lcom/withpersona/sdk2/inquiry/nfc/b;)Ljava/lang/String;

    move-result-object v9

    iget-object v6, v1, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->y:Lcom/withpersona/sdk2/inquiry/nfc/b;

    invoke-static {v6}, Lcom/withpersona/sdk2/inquiry/nfc/b;->i(Lcom/withpersona/sdk2/inquiry/nfc/b;)Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;

    move-result-object v10

    iget-object v6, v1, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->y:Lcom/withpersona/sdk2/inquiry/nfc/b;

    invoke-static {v6}, Lcom/withpersona/sdk2/inquiry/nfc/b;->k(Lcom/withpersona/sdk2/inquiry/nfc/b;)Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;

    move-result-object v11

    iget-object v6, v1, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->y:Lcom/withpersona/sdk2/inquiry/nfc/b;

    invoke-static {v6}, Lcom/withpersona/sdk2/inquiry/nfc/b;->g(Lcom/withpersona/sdk2/inquiry/nfc/b;)Ljava/util/List;

    move-result-object v12

    iget-object v6, v1, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->y:Lcom/withpersona/sdk2/inquiry/nfc/b;

    invoke-static {v6}, Lcom/withpersona/sdk2/inquiry/nfc/b;->n(Lcom/withpersona/sdk2/inquiry/nfc/b;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;

    move-result-object v14

    iget-object v6, v1, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->y:Lcom/withpersona/sdk2/inquiry/nfc/b;

    invoke-static {v6}, Lcom/withpersona/sdk2/inquiry/nfc/b;->o(Lcom/withpersona/sdk2/inquiry/nfc/b;)Ljava/lang/Integer;

    move-result-object v13

    iget-object v6, v1, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->y:Lcom/withpersona/sdk2/inquiry/nfc/b;

    invoke-static {v6}, Lcom/withpersona/sdk2/inquiry/nfc/b;->e(Lcom/withpersona/sdk2/inquiry/nfc/b;)Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;

    move-result-object v15

    iget-object v6, v1, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->y:Lcom/withpersona/sdk2/inquiry/nfc/b;

    invoke-static {v6}, Lcom/withpersona/sdk2/inquiry/nfc/b;->h(Lcom/withpersona/sdk2/inquiry/nfc/b;)Lgo/e;

    move-result-object v6

    sget-object v8, Lgo/v;->a:Lgo/v;

    invoke-virtual {v6, v8}, Lgo/e;->a(Lgo/d;)Z

    move-result v16

    new-instance v8, Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;

    invoke-direct/range {v8 .. v16}, Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderConfig;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcStrings;Ljava/util/List;Ljava/lang/Integer;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$UiStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/GovernmentIdNfcScan$GovernmentIdNfcScanStyles;Z)V

    invoke-virtual {v3, v8}, Lg/c;->b(Ljava/lang/Object;)V

    new-instance v3, Lqp/i;

    invoke-direct {v3}, Lqp/i;-><init>()V

    iput-object v0, v1, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->x:Ljava/lang/Object;

    iput v7, v1, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->w:I

    invoke-static {v3, v1}, Lnu/j;->u(Lnu/h;Lnt/b;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_7

    goto :goto_3

    :cond_7
    :goto_1
    check-cast v3, Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;

    :try_start_7
    iget-object v6, v1, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->y:Lcom/withpersona/sdk2/inquiry/nfc/b;

    invoke-static {v6}, Lcom/withpersona/sdk2/inquiry/nfc/b;->f(Lcom/withpersona/sdk2/inquiry/nfc/b;)Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    sget v7, Lqp/j;->a:I

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v6

    int-to-long v6, v6

    iput-object v0, v1, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->x:Ljava/lang/Object;

    iput-object v3, v1, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->t:Ljava/lang/Object;

    iput v5, v1, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->w:I

    invoke-static {v6, v7, v1}, Lku/z0;->b(JLnt/b;)Ljava/lang/Object;

    move-result-object v5
    :try_end_7
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_7 .. :try_end_7} :catch_0

    if-ne v5, v2, :cond_8

    goto :goto_3

    :catch_0
    :cond_8
    :goto_2
    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v1, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->x:Ljava/lang/Object;

    invoke-static {v3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v1, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->t:Ljava/lang/Object;

    iput v4, v1, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->w:I

    invoke-interface {v0, v3, v1}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_9

    :goto_3
    return-object v2

    :cond_9
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public final q(Lnu/i;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu/i<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderOutput;",
            ">;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/nfc/b$b;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/nfc/b$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
