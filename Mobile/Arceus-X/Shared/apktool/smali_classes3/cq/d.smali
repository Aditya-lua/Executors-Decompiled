.class public final Lcq/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcq/b$a;


# instance fields
.field public final a:Lcq/c;


# direct methods
.method public constructor <init>(Lcq/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcq/d;->a:Lcq/c;

    return-void
.end method

.method public static b(Lcq/c;)Lft/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcq/c;",
            ")",
            "Lft/i<",
            "Lcq/b$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcq/d;

    invoke-direct {v0, p0}, Lcq/d;-><init>(Lcq/c;)V

    invoke-static {v0}, Lft/e;->a(Ljava/lang/Object;)Lft/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;JLjava/lang/String;Ldq/a;)Lcq/b;
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
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/withpersona/sdk2/camera/CameraProperties;",
            "J",
            "Ljava/lang/String;",
            "Ldq/a;",
            ")",
            "Lcq/b;"
        }
    .end annotation

    iget-object v0, p0, Lcq/d;->a:Lcq/c;

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

    invoke-virtual/range {v0 .. v13}, Lcq/c;->b(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;JLjava/lang/String;Ldq/a;)Lcq/b;

    move-result-object p1

    return-object p1
.end method
