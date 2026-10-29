.class public final Ldq/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldq/a$b;


# instance fields
.field public final a:Ldq/b;


# direct methods
.method public constructor <init>(Ldq/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldq/c;->a:Ldq/b;

    return-void
.end method

.method public static b(Ldq/b;)Lft/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldq/b;",
            ")",
            "Lft/i<",
            "Ldq/a$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Ldq/c;

    invoke-direct {v0, p0}, Ldq/c;-><init>(Ldq/b;)V

    invoke-static {v0}, Lft/e;->a(Ljava/lang/Object;)Lft/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)Ldq/a;
    .locals 6
    .param p4    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/Long;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;",
            ">;",
            "Ljava/lang/Long;",
            ")",
            "Ldq/a;"
        }
    .end annotation

    iget-object v0, p0, Ldq/c;->a:Ldq/b;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Ldq/b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)Ldq/a;

    move-result-object p1

    return-object p1
.end method
