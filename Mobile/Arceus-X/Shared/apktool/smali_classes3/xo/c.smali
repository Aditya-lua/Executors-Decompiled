.class public final Lxo/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lg/c<",
            "Lmp/b;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lft/i;Lft/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;",
            "Lft/i<",
            "Lg/c<",
            "Lmp/b;",
            ">;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxo/c;->a:Lft/i;

    iput-object p2, p0, Lxo/c;->b:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;)Lxo/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Landroid/content/Context;",
            ">;",
            "Lft/i<",
            "Lg/c<",
            "Lmp/b;",
            ">;>;)",
            "Lxo/c;"
        }
    .end annotation

    new-instance v0, Lxo/c;

    invoke-direct {v0, p0, p1}, Lxo/c;-><init>(Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;Lg/c;Ljava/lang/String;Ljava/lang/String;Lxo/a;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;)Lcom/withpersona/sdk2/inquiry/integration/a;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lg/c<",
            "Lmp/b;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lxo/a;",
            "Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;",
            ")",
            "Lcom/withpersona/sdk2/inquiry/integration/a;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/integration/a;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/withpersona/sdk2/inquiry/integration/a;-><init>(Landroid/content/Context;Lg/c;Ljava/lang/String;Ljava/lang/String;Lxo/a;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;)V

    return-object v0
.end method


# virtual methods
.method public b(Ljava/lang/String;Ljava/lang/String;Lxo/a;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;)Lcom/withpersona/sdk2/inquiry/integration/a;
    .locals 7

    iget-object v0, p0, Lxo/c;->a:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    iget-object v0, p0, Lxo/c;->b:Lft/i;

    invoke-interface {v0}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lg/c;

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-static/range {v1 .. v6}, Lxo/c;->c(Landroid/content/Context;Lg/c;Ljava/lang/String;Ljava/lang/String;Lxo/a;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;)Lcom/withpersona/sdk2/inquiry/integration/a;

    move-result-object p1

    return-object p1
.end method
