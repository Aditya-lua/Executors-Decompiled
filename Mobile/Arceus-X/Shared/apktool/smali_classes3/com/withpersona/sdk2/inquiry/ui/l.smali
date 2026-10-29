.class public final Lcom/withpersona/sdk2/inquiry/ui/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/ui/k$a;


# instance fields
.field public final a:Lor/k6;


# direct methods
.method public constructor <init>(Lor/k6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/ui/l;->a:Lor/k6;

    return-void
.end method

.method public static b(Lor/k6;)Lft/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lor/k6;",
            ")",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/ui/k$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/ui/l;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/ui/l;-><init>(Lor/k6;)V

    invoke-static {v0}, Lft/e;->a(Ljava/lang/Object;)Lft/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/withpersona/sdk2/inquiry/ui/k;
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
            "Lcom/withpersona/sdk2/inquiry/ui/k;"
        }
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/ui/l;->a:Lor/k6;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lor/k6;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/withpersona/sdk2/inquiry/ui/k;

    move-result-object p1

    return-object p1
.end method
