.class public final Lqq/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqq/c$a;


# instance fields
.field public final a:Lqq/d;


# direct methods
.method public constructor <init>(Lqq/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqq/e;->a:Lqq/d;

    return-void
.end method

.method public static b(Lqq/d;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqq/d;",
            ")",
            "Lwt/i<",
            "Lqq/c$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lqq/e;

    invoke-direct {v0, p0}, Lqq/e;-><init>(Lqq/d;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmq/z0;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lsn/v;JLjava/lang/String;Lrq/b;)Lqq/c;
    .locals 14
    .param p8    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p12    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lmq/z0;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lmq/b0;",
            ">;",
            "Ljava/lang/String;",
            "Lsn/v;",
            "J",
            "Ljava/lang/String;",
            "Lrq/b;",
            ")",
            "Lqq/c;"
        }
    .end annotation

    iget-object v0, p0, Lqq/e;->a:Lqq/d;

    move-object v1, p1

    move-object/from16 v2, p2

    move-object/from16 v6, p3

    move-object/from16 v5, p4

    move-object/from16 v3, p5

    move-object/from16 v7, p6

    move-object/from16 v4, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-wide/from16 v10, p10

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    invoke-virtual/range {v0 .. v13}, Lqq/d;->b(Ljava/lang/String;Ljava/lang/String;Lmq/z0;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lsn/v;JLjava/lang/String;Lrq/b;)Lqq/c;

    move-result-object p1

    return-object p1
.end method
