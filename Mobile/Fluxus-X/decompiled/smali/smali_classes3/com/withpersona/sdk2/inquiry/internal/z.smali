.class public final Lcom/withpersona/sdk2/inquiry/internal/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/internal/x$a;


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/internal/y;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/z;->a:Lcom/withpersona/sdk2/inquiry/internal/y;

    return-void
.end method

.method public static b(Lcom/withpersona/sdk2/inquiry/internal/y;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/internal/y;",
            ")",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/x$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/z;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/internal/z;-><init>(Lcom/withpersona/sdk2/inquiry/internal/y;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lhr/g;Lcom/withpersona/sdk2/inquiry/internal/x$c;)Lcom/withpersona/sdk2/inquiry/internal/x;
    .locals 8
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
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
            "Ljava/util/List<",
            "Lcom/withpersona/sdk2/inquiry/FieldMapping;",
            ">;",
            "Lhr/g;",
            "Lcom/withpersona/sdk2/inquiry/internal/x$c;",
            ")",
            "Lcom/withpersona/sdk2/inquiry/internal/x;"
        }
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/z;->a:Lcom/withpersona/sdk2/inquiry/internal/y;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object v7, p7

    invoke-virtual/range {v0 .. v7}, Lcom/withpersona/sdk2/inquiry/internal/y;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lhr/g;Lcom/withpersona/sdk2/inquiry/internal/x$c;)Lcom/withpersona/sdk2/inquiry/internal/x;

    move-result-object p1

    return-object p1
.end method
