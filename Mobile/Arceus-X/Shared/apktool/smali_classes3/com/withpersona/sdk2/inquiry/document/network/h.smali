.class public final Lcom/withpersona/sdk2/inquiry/document/network/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lcom/withpersona/sdk2/inquiry/document/network/g$a;",
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

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lfo/a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lmq/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lft/i;Lft/i;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lbo/c;",
            ">;",
            "Lft/i<",
            "Lfo/a;",
            ">;",
            "Lft/i<",
            "Lmq/a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/network/h;->a:Lft/i;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/document/network/h;->b:Lft/i;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/document/network/h;->c:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;Lft/i;)Lcom/withpersona/sdk2/inquiry/document/network/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lbo/c;",
            ">;",
            "Lft/i<",
            "Lfo/a;",
            ">;",
            "Lft/i<",
            "Lmq/a;",
            ">;)",
            "Lcom/withpersona/sdk2/inquiry/document/network/h;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/network/h;

    invoke-direct {v0, p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/network/h;-><init>(Lft/i;Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Lbo/c;Lfo/a;Lmq/a;)Lcom/withpersona/sdk2/inquiry/document/network/g$a;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/network/g$a;

    invoke-direct {v0, p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/network/g$a;-><init>(Lbo/c;Lfo/a;Lmq/a;)V

    return-object v0
.end method


# virtual methods
.method public b()Lcom/withpersona/sdk2/inquiry/document/network/g$a;
    .locals 3

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/network/h;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbo/c;

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/document/network/h;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfo/a;

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/document/network/h;->c:Lft/i;

    invoke-interface {v2}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lmq/a;

    invoke-static {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/document/network/h;->c(Lbo/c;Lfo/a;Lmq/a;)Lcom/withpersona/sdk2/inquiry/document/network/g$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/document/network/h;->b()Lcom/withpersona/sdk2/inquiry/document/network/g$a;

    move-result-object v0

    return-object v0
.end method
