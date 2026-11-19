.class public final Lc1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc1/d;


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc1/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lc1/d;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc1/a;->a:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(Landroid/hardware/camera2/params/SessionConfiguration;)Lc1/d$a;
    .locals 3

    iget-object v0, p0, Lc1/a;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc1/d;

    invoke-interface {v1, p1}, Lc1/d;->a(Landroid/hardware/camera2/params/SessionConfiguration;)Lc1/d$a;

    move-result-object v1

    invoke-virtual {v1}, Lc1/d$a;->a()I

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_1
    new-instance p1, Lc1/d$a;

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    invoke-direct {p1, v2, v2, v0, v1}, Lc1/d$a;-><init>(IIJ)V

    return-object p1
.end method
