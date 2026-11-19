.class public final Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;


# instance fields
.field public final a:Lrp/k;


# direct methods
.method public constructor <init>(Lrp/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/j;->a:Lrp/k;

    return-void
.end method

.method public static b(Lrp/k;)Lwt/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrp/k;",
            ")",
            "Lwt/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/j;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/j;-><init>(Lrp/k;)V

    invoke-static {v0}, Lwt/e;->a(Ljava/lang/Object;)Lwt/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/util/List;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;"
        }
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/j;->a:Lrp/k;

    invoke-virtual {v0, p1, p2}, Lrp/k;->b(Ljava/util/List;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/i;

    move-result-object p1

    return-object p1
.end method
