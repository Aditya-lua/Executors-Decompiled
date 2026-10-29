.class public final Lcom/withpersona/sdk2/inquiry/document/step/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/document/step/b$c;


# instance fields
.field public final a:Lco/c1;


# direct methods
.method public constructor <init>(Lco/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/step/c;->a:Lco/c1;

    return-void
.end method

.method public static b(Lco/c1;)Lft/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/c1;",
            ")",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/document/step/b$c;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/step/c;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/document/step/c;-><init>(Lco/c1;)V

    invoke-static {v0}, Lft/e;->a(Ljava/lang/Object;)Lft/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/document/step/b;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/step/c;->a:Lco/c1;

    invoke-virtual {v0, p1, p2}, Lco/c1;->b(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/document/step/b;

    move-result-object p1

    return-object p1
.end method
