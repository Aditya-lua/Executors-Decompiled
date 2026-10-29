.class public final Lrr/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrr/g1$e;


# instance fields
.field public final a:Lrr/h1;


# direct methods
.method public constructor <init>(Lrr/h1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrr/i1;->a:Lrr/h1;

    return-void
.end method

.method public static b(Lrr/h1;)Lft/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrr/h1;",
            ")",
            "Lft/i<",
            "Lrr/g1$e;",
            ">;"
        }
    .end annotation

    new-instance v0, Lrr/i1;

    invoke-direct {v0, p0}, Lrr/i1;-><init>(Lrr/h1;)V

    invoke-static {v0}, Lft/e;->a(Ljava/lang/Object;)Lft/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Landroidx/lifecycle/l0;)Lrr/g1;
    .locals 1

    iget-object v0, p0, Lrr/i1;->a:Lrr/h1;

    invoke-virtual {v0, p1, p2}, Lrr/h1;->b(Lcom/withpersona/sdk2/inquiry/ui/UiWorkflow$Input;Landroidx/lifecycle/l0;)Lrr/g1;

    move-result-object p1

    return-object p1
.end method
