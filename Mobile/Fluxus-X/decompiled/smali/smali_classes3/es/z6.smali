.class public final Les/z6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Les/x6$a;


# instance fields
.field public final a:Les/y6;


# direct methods
.method public constructor <init>(Les/y6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Les/z6;->a:Les/y6;

    return-void
.end method

.method public static b(Les/y6;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Les/y6;",
            ")",
            "Lwt/i<",
            "Les/x6$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Les/z6;

    invoke-direct {v0, p0}, Les/z6;-><init>(Les/y6;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Les/x6;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/ui/network/ComponentParam;",
            ">;)",
            "Les/x6;"
        }
    .end annotation

    iget-object v0, p0, Les/z6;->a:Les/y6;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Les/y6;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Les/x6;

    move-result-object p1

    return-object p1
.end method
