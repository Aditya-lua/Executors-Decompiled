.class public final Lzo/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lgp/w;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lyn/a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lwp/c;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Ldp/i;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lkr/a;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lgp/w;",
            ">;",
            "Lft/i<",
            "Lyn/a;",
            ">;",
            "Lft/i<",
            "Lwp/c;",
            ">;",
            "Lft/i<",
            "Ldp/i;",
            ">;",
            "Lft/i<",
            "Lkr/a;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzo/c0;->a:Lft/i;

    iput-object p2, p0, Lzo/c0;->b:Lft/i;

    iput-object p3, p0, Lzo/c0;->c:Lft/i;

    iput-object p4, p0, Lzo/c0;->d:Lft/i;

    iput-object p5, p0, Lzo/c0;->e:Lft/i;

    iput-object p6, p0, Lzo/c0;->f:Lft/i;

    iput-object p7, p0, Lzo/c0;->g:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;)Lzo/c0;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lgp/w;",
            ">;",
            "Lft/i<",
            "Lyn/a;",
            ">;",
            "Lft/i<",
            "Lwp/c;",
            ">;",
            "Lft/i<",
            "Ldp/i;",
            ">;",
            "Lft/i<",
            "Lkr/a;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;",
            ">;",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
            ">;)",
            "Lzo/c0;"
        }
    .end annotation

    new-instance v0, Lzo/c0;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lzo/c0;-><init>(Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzo/a0;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;ZLgp/w;Lyn/a;Lwp/c;Ldp/i;Lkr/a;Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;Lcom/withpersona/sdk2/inquiry/internal/network/e;)Lcom/withpersona/sdk2/inquiry/internal/k;
    .locals 14
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/k;

    move-object v1, p0

    move-object v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    invoke-direct/range {v0 .. v13}, Lcom/withpersona/sdk2/inquiry/internal/k;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzo/a0;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;ZLgp/w;Lyn/a;Lwp/c;Ldp/i;Lkr/a;Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;Lcom/withpersona/sdk2/inquiry/internal/network/e;)V

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzo/a0;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;Z)Lcom/withpersona/sdk2/inquiry/internal/k;
    .locals 14
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lzo/c0;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lgp/w;

    iget-object v0, p0, Lzo/c0;->b:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lyn/a;

    iget-object v0, p0, Lzo/c0;->c:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lwp/c;

    iget-object v0, p0, Lzo/c0;->d:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ldp/i;

    iget-object v0, p0, Lzo/c0;->e:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lkr/a;

    iget-object v0, p0, Lzo/c0;->f:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;

    iget-object v0, p0, Lzo/c0;->g:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/withpersona/sdk2/inquiry/internal/network/e;

    move-object v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move/from16 v6, p6

    invoke-static/range {v1 .. v13}, Lzo/c0;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lzo/a0;Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/InquirySessionConfig;ZLgp/w;Lyn/a;Lwp/c;Ldp/i;Lkr/a;Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;Lcom/withpersona/sdk2/inquiry/internal/network/e;)Lcom/withpersona/sdk2/inquiry/internal/k;

    move-result-object p1

    return-object p1
.end method
