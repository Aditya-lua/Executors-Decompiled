.class public final Lcom/withpersona/sdk2/inquiry/document/network/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lcom/withpersona/sdk2/inquiry/document/network/a$a;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lbo/c;",
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
            "Lbo/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/b;->a:Lft/i;

    return-void
.end method

.method public static a(Lft/i;)Lcom/withpersona/sdk2/inquiry/document/network/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lbo/c;",
            ">;)",
            "Lcom/withpersona/sdk2/inquiry/document/network/b;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/network/b;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/document/network/b;-><init>(Lft/i;)V

    return-object v0
.end method

.method public static c(Lbo/c;)Lcom/withpersona/sdk2/inquiry/document/network/a$a;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/network/a$a;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/document/network/a$a;-><init>(Lbo/c;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/inquiry/document/network/a$a;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/network/b;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbo/c;

    invoke-static {v0}, Lcom/withpersona/sdk2/inquiry/document/network/b;->c(Lbo/c;)Lcom/withpersona/sdk2/inquiry/document/network/a$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/document/network/b;->b()Lcom/withpersona/sdk2/inquiry/document/network/a$a;

    move-result-object v0

    return-object v0
.end method
