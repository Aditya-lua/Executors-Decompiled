.class public final Lcom/withpersona/sdk2/inquiry/integration/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/integration/a$a;


# instance fields
.field public final a:Lxo/c;


# direct methods
.method public constructor <init>(Lxo/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/integration/b;->a:Lxo/c;

    return-void
.end method

.method public static b(Lxo/c;)Lft/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lxo/c;",
            ")",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/integration/a$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/integration/b;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/integration/b;-><init>(Lxo/c;)V

    invoke-static {v0}, Lft/e;->a(Ljava/lang/Object;)Lft/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Lxo/a;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;)Lcom/withpersona/sdk2/inquiry/integration/a;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/integration/b;->a:Lxo/c;

    invoke-virtual {v0, p1, p2, p3, p4}, Lxo/c;->b(Ljava/lang/String;Ljava/lang/String;Lxo/a;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Integration$IntegrationStepBrowserType;)Lcom/withpersona/sdk2/inquiry/integration/a;

    move-result-object p1

    return-object p1
.end method
