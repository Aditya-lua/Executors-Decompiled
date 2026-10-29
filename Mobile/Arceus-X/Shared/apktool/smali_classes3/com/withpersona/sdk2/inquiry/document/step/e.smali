.class public final Lcom/withpersona/sdk2/inquiry/document/step/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/document/step/b$c;",
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
            "Lcom/withpersona/sdk2/inquiry/document/step/b$c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/step/e;->a:Lft/i;

    return-void
.end method

.method public static a(Lft/i;)Lcom/withpersona/sdk2/inquiry/document/step/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/document/step/b$c;",
            ">;)",
            "Lcom/withpersona/sdk2/inquiry/document/step/e;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/step/e;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/document/step/e;-><init>(Lft/i;)V

    return-object v0
.end method

.method public static c(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/step/b$c;)Lcom/withpersona/sdk2/inquiry/document/step/d;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/step/d;

    invoke-direct {v0, p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/step/d;-><init>(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/step/b$c;)V

    return-object v0
.end method


# virtual methods
.method public b(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/document/step/d;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/step/e;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/step/b$c;

    invoke-static {p1, p2, v0}, Lcom/withpersona/sdk2/inquiry/document/step/e;->c(Landroidx/lifecycle/l0;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/step/b$c;)Lcom/withpersona/sdk2/inquiry/document/step/d;

    move-result-object p1

    return-object p1
.end method
