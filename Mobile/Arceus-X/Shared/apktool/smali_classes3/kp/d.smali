.class public final Lkp/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkp/d$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lkp/d;
    .locals 1

    sget-object v0, Lkp/d$a;->a:Lkp/d;

    return-object v0
.end method

.method public static c(Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/internal/workflows/e;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/internal/workflows/e;

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/internal/workflows/e;-><init>(Landroidx/lifecycle/l0;)V

    return-object v0
.end method


# virtual methods
.method public b(Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/internal/workflows/e;
    .locals 0

    invoke-static {p1}, Lkp/d;->c(Landroidx/lifecycle/l0;)Lcom/withpersona/sdk2/inquiry/internal/workflows/e;

    move-result-object p1

    return-object p1
.end method
