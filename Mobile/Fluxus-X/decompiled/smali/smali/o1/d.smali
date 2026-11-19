.class public Lo1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/z1;


# instance fields
.field public final c:Ln0/z1;

.field public d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ln0/a2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ln0/z1;Ln0/k3;Ln0/o0;Lm1/r1$a;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo1/d;->c:Ln0/z1;

    const-class v0, Landroidx/camera/video/internal/compat/quirk/ExtraSupportedQualityQuirk;

    invoke-virtual {p2, v0}, Ln0/k3;->c(Ljava/lang/Class;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    invoke-static {v2}, Lx2/g;->i(Z)V

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/camera/video/internal/compat/quirk/ExtraSupportedQualityQuirk;

    invoke-virtual {p2, p3, p1, p4}, Landroidx/camera/video/internal/compat/quirk/ExtraSupportedQualityQuirk;->g(Ln0/o0;Ln0/z1;Lm1/r1$a;)Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object p2, p0, Lo1/d;->d:Ljava/util/Map;

    :cond_1
    return-void
.end method

.method private c(I)Ln0/a2;
    .locals 2

    iget-object v0, p0, Lo1/d;->d:Ljava/util/Map;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo1/d;->d:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln0/a2;

    return-object p1

    :cond_0
    iget-object v0, p0, Lo1/d;->c:Ln0/z1;

    invoke-interface {v0, p1}, Ln0/z1;->b(I)Ln0/a2;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a(I)Z
    .locals 0

    invoke-direct {p0, p1}, Lo1/d;->c(I)Ln0/a2;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public b(I)Ln0/a2;
    .locals 0

    invoke-direct {p0, p1}, Lo1/d;->c(I)Ln0/a2;

    move-result-object p1

    return-object p1
.end method
