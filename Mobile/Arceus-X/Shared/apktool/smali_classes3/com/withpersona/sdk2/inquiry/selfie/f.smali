.class public final Lcom/withpersona/sdk2/inquiry/selfie/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/withpersona/sdk2/inquiry/selfie/e$b;


# instance fields
.field public final a:Lyp/v;


# direct methods
.method public constructor <init>(Lyp/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/f;->a:Lyp/v;

    return-void
.end method

.method public static b(Lyp/v;)Lft/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyp/v;",
            ")",
            "Lft/i<",
            "Lcom/withpersona/sdk2/inquiry/selfie/e$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/f;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/selfie/f;-><init>(Lyp/v;)V

    invoke-static {v0}, Lft/e;->a(Ljava/lang/Object;)Lft/d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/withpersona/sdk2/inquiry/selfie/g;Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;Z)Lcom/withpersona/sdk2/inquiry/selfie/e;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/f;->a:Lyp/v;

    invoke-virtual {v0, p2, p3, p1}, Lyp/v;->b(Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;ZLcom/withpersona/sdk2/inquiry/selfie/g;)Lcom/withpersona/sdk2/inquiry/selfie/e;

    move-result-object p1

    return-object p1
.end method
