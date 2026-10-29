.class public final Lhp/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhp/e0$b;


# instance fields
.field public final a:Lhp/f0;


# direct methods
.method public constructor <init>(Lhp/f0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhp/g0;->a:Lhp/f0;

    return-void
.end method

.method public static b(Lhp/f0;)Lft/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhp/f0;",
            ")",
            "Lft/i<",
            "Lhp/e0$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lhp/g0;

    invoke-direct {v0, p0}, Lhp/g0;-><init>(Lhp/f0;)V

    invoke-static {v0}, Lft/e;->a(Ljava/lang/Object;)Lft/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Landroidx/lifecycle/l0;)Lhp/e0;
    .locals 1

    iget-object v0, p0, Lhp/g0;->a:Lhp/f0;

    invoke-virtual {v0, p1, p2}, Lhp/f0;->b(Lcom/withpersona/sdk2/inquiry/internal/InquiryWorkflow$Props;Landroidx/lifecycle/l0;)Lhp/e0;

    move-result-object p1

    return-object p1
.end method
