.class public Lv0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Landroidx/camera/core/internal/compat/quirk/SurfaceOrderQuirk;

    invoke-static {v0}, Lu0/b;->b(Ljava/lang/Class;)Ln0/g3;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lv0/g;->a:Z

    return-void
.end method

.method public static synthetic a(Lv0/g;Ln0/o3$f;Ln0/o3$f;)I
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Ln0/o3$f;->f()Ln0/u1;

    move-result-object p1

    invoke-virtual {p0, p1}, Lv0/g;->b(Ln0/u1;)I

    move-result p1

    invoke-virtual {p2}, Ln0/o3$f;->f()Ln0/u1;

    move-result-object p2

    invoke-virtual {p0, p2}, Lv0/g;->b(Ln0/u1;)I

    move-result p0

    sub-int/2addr p1, p0

    return p1
.end method


# virtual methods
.method public final b(Ln0/u1;)I
    .locals 2

    invoke-virtual {p1}, Ln0/u1;->g()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Landroid/media/MediaCodec;

    if-ne v0, v1, :cond_0

    const/4 p1, 0x2

    return p1

    :cond_0
    invoke-virtual {p1}, Ln0/u1;->g()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lg0/a2;

    if-eq v0, v1, :cond_2

    invoke-virtual {p1}, Ln0/u1;->g()Ljava/lang/Class;

    move-result-object p1

    const-class v0, Lb1/g;

    if-ne p1, v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public c(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ln0/o3$f;",
            ">;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lv0/g;->a:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lv0/f;

    invoke-direct {v0, p0}, Lv0/f;-><init>(Lv0/g;)V

    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-void
.end method
