.class public final Lyp/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lfn/n0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lft/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lft/i<",
            "Lqq/c;",
            ">;"
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
            "Lfn/n0;",
            ">;",
            "Lft/i<",
            "Lqq/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyp/v;->a:Lft/i;

    iput-object p2, p0, Lyp/v;->b:Lft/i;

    return-void
.end method

.method public static a(Lft/i;Lft/i;)Lyp/v;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lft/i<",
            "Lfn/n0;",
            ">;",
            "Lft/i<",
            "Lqq/c;",
            ">;)",
            "Lyp/v;"
        }
    .end annotation

    new-instance v0, Lyp/v;

    invoke-direct {v0, p0, p1}, Lyp/v;-><init>(Lft/i;Lft/i;)V

    return-object v0
.end method

.method public static c(Lct/a;Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;ZLcom/withpersona/sdk2/inquiry/selfie/g;Lqq/c;)Lcom/withpersona/sdk2/inquiry/selfie/e;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lct/a<",
            "Lfn/n0;",
            ">;",
            "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;",
            "Z",
            "Lcom/withpersona/sdk2/inquiry/selfie/g;",
            "Lqq/c;",
            ")",
            "Lcom/withpersona/sdk2/inquiry/selfie/e;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/e;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/selfie/e;-><init>(Lct/a;Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;ZLcom/withpersona/sdk2/inquiry/selfie/g;Lqq/c;)V

    return-object v0
.end method


# virtual methods
.method public b(Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;ZLcom/withpersona/sdk2/inquiry/selfie/g;)Lcom/withpersona/sdk2/inquiry/selfie/e;
    .locals 2

    iget-object v0, p0, Lyp/v;->a:Lft/i;

    invoke-static {v0}, Lft/c;->b(Lft/i;)Lct/a;

    move-result-object v0

    iget-object v1, p0, Lyp/v;->b:Lft/i;

    invoke-interface {v1}, Lht/a;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lqq/c;

    invoke-static {v0, p1, p2, p3, v1}, Lyp/v;->c(Lct/a;Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;ZLcom/withpersona/sdk2/inquiry/selfie/g;Lqq/c;)Lcom/withpersona/sdk2/inquiry/selfie/e;

    move-result-object p1

    return-object p1
.end method
