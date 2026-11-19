.class public final Lrq/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrq/b$b;


# instance fields
.field public final a:Lrq/c;


# direct methods
.method public constructor <init>(Lrq/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrq/d;->a:Lrq/c;

    return-void
.end method

.method public static b(Lrq/c;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrq/c;",
            ")",
            "Lwt/i<",
            "Lrq/b$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lrq/d;

    invoke-direct {v0, p0}, Lrq/d;-><init>(Lrq/c;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)Lrq/b;
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
            "Lrq/a;",
            ">;",
            "Ljava/lang/Long;",
            ")",
            "Lrq/b;"
        }
    .end annotation

    iget-object v0, p0, Lrq/d;->a:Lrq/c;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lrq/c;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)Lrq/b;

    move-result-object p1

    return-object p1
.end method
