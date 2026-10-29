.class public final Lzo/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzo/h0;->a:Lft/i;

    return-void
.end method

.method public static a(Lft/i;)Lzo/h0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/internal/network/e;",
            ">;)",
            "Lzo/h0;"
        }
    .end annotation

    new-instance v0, Lzo/h0;

    invoke-direct {v0, p0}, Lzo/h0;-><init>(Lft/i;)V

    return-object v0
.end method

.method public static c(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/e;)Lcom/withpersona/sdk2/inquiry/internal/m;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/m;

    invoke-direct {v0, p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/m;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/e;)V

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/internal/m;
    .locals 1

    iget-object v0, p0, Lzo/h0;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/internal/network/e;

    invoke-static {p1, v0}, Lzo/h0;->c(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/internal/network/e;)Lcom/withpersona/sdk2/inquiry/internal/m;

    move-result-object p1

    return-object p1
.end method
