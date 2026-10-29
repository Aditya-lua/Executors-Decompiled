.class public final Lcom/withpersona/sdk2/inquiry/integration/fragment/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/integration/fragment/d$a;


# instance fields
.field public final a:Lcom/withpersona/sdk2/inquiry/integration/fragment/e;


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/integration/fragment/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/integration/fragment/f;->a:Lcom/withpersona/sdk2/inquiry/integration/fragment/e;

    return-void
.end method

.method public static b(Lcom/withpersona/sdk2/inquiry/integration/fragment/e;)Lft/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/integration/fragment/e;",
            ")",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/integration/fragment/d$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/integration/fragment/f;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/integration/fragment/f;-><init>(Lcom/withpersona/sdk2/inquiry/integration/fragment/e;)V

    invoke-static {v0}, Lft/e;->a(Ljava/lang/Object;)Lft/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/integration/fragment/d;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/integration/fragment/f;->a:Lcom/withpersona/sdk2/inquiry/integration/fragment/e;

    invoke-virtual {v0, p1}, Lcom/withpersona/sdk2/inquiry/integration/fragment/e;->b(Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/integration/fragment/d;

    move-result-object p1

    return-object p1
.end method
