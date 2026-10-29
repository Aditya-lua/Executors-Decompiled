.class public final Lcom/withpersona/sdk2/inquiry/integration/fragment/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/integration/fragment/b$c;


# instance fields
.field public final a:Lyo/h;


# direct methods
.method public constructor <init>(Lyo/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/integration/fragment/c;->a:Lyo/h;

    return-void
.end method

.method public static b(Lyo/h;)Lft/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyo/h;",
            ")",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/integration/fragment/b$c;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/integration/fragment/c;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/integration/fragment/c;-><init>(Lyo/h;)V

    invoke-static {v0}, Lft/e;->a(Ljava/lang/Object;)Lft/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/integration/fragment/b;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/integration/fragment/c;->a:Lyo/h;

    invoke-virtual {v0, p1, p2}, Lyo/h;->b(Lcom/withpersona/sdk2/inquiry/integration/IntegrationWorkflow$Input;Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/integration/fragment/b;

    move-result-object p1

    return-object p1
.end method
