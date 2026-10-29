.class public final Lfq/n2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfq/k2$d;


# instance fields
.field public final a:Lfq/m2;


# direct methods
.method public constructor <init>(Lfq/m2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfq/n2;->a:Lfq/m2;

    return-void
.end method

.method public static b(Lfq/m2;)Lft/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfq/m2;",
            ")",
            "Lft/i<",
            "Lfq/k2$d;",
            ">;"
        }
    .end annotation

    new-instance v0, Lfq/n2;

    invoke-direct {v0, p0}, Lfq/n2;-><init>(Lfq/m2;)V

    invoke-static {v0}, Lft/e;->a(Ljava/lang/Object;)Lft/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Landroidx/lifecycle/l0;)Lfq/k2;
    .locals 1

    iget-object v0, p0, Lfq/n2;->a:Lfq/m2;

    invoke-virtual {v0, p1, p2}, Lfq/m2;->b(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Landroidx/lifecycle/l0;)Lfq/k2;

    move-result-object p1

    return-object p1
.end method
