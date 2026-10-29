.class public final Lgp/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lho/a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/internal/network/f;

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Ljv/y;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/network/f;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/internal/network/f;",
            "Lft/i<",
            "Ljv/y;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgp/h;->a:Lcom/withpersona/sdk2/inquiry/internal/network/f;

    iput-object p2, p0, Lgp/h;->b:Lft/i;

    return-void
.end method

.method public static a(Lcom/withpersona/sdk2/inquiry/internal/network/f;Lft/i;)Lgp/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/internal/network/f;",
            "Lft/i<",
            "Ljv/y;",
            ">;)",
            "Lgp/h;"
        }
    .end annotation

    new-instance v0, Lgp/h;

    invoke-direct {v0, p0, p1}, Lgp/h;-><init>(Lcom/withpersona/sdk2/inquiry/internal/network/f;Lft/i;)V

    return-object v0
.end method

.method public static b(Lcom/withpersona/sdk2/inquiry/internal/network/f;Ljv/y;)Lho/a;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/internal/network/f;->c(Ljv/y;)Lho/a;

    move-result-object p0

    invoke-static {p0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lho/a;

    return-object p0
.end method


# virtual methods
.method public c()Lho/a;
    .locals 2

    iget-object v0, p0, Lgp/h;->a:Lcom/withpersona/sdk2/inquiry/internal/network/f;

    iget-object v1, p0, Lgp/h;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljv/y;

    invoke-static {v0, v1}, Lgp/h;->b(Lcom/withpersona/sdk2/inquiry/internal/network/f;Ljv/y;)Lho/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lgp/h;->c()Lho/a;

    move-result-object v0

    return-object v0
.end method
