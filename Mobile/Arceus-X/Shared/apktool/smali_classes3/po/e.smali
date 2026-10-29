.class public final Lpo/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpo/c$a;


# instance fields
.field public final a:Lpo/d;


# direct methods
.method public constructor <init>(Lpo/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpo/e;->a:Lpo/d;

    return-void
.end method

.method public static b(Lpo/d;)Lft/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpo/d;",
            ")",
            "Lft/i<",
            "Lpo/c$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lpo/e;

    invoke-direct {v0, p0}, Lpo/e;-><init>(Lpo/d;)V

    invoke-static {v0}, Lft/e;->a(Ljava/lang/Object;)Lft/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;)Lpo/c;
    .locals 8
    .param p5    # Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    iget-object v0, p0, Lpo/e;->a:Lpo/d;

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v3, p4

    move-object v5, p5

    move-object v6, p6

    move-object v7, p7

    invoke-virtual/range {v0 .. v7}, Lpo/d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;)Lpo/c;

    move-result-object p1

    return-object p1
.end method
