.class public final Lf0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lz/z0;

.field public b:Lz/n2;

.field public c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Landroid/hardware/camera2/CameraCharacteristics$Key;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lz/z0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lf0/h;->a:Lz/z0;

    return-void
.end method

.method public constructor <init>(Lz/z0;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz/z0;",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Landroid/hardware/camera2/CameraCharacteristics$Key;",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lf0/h;->a:Lz/z0;

    .line 5
    iput-object p2, p0, Lf0/h;->c:Ljava/util/List;

    return-void
.end method

.method public static a(Lg0/t;)Lf0/h;
    .locals 3

    instance-of v0, p0, Lz/n2;

    if-eqz v0, :cond_0

    check-cast p0, Lz/n2;

    invoke-virtual {p0}, Lz/n2;->B()Lf0/h;

    move-result-object p0

    return-object p0

    :cond_0
    move-object v0, p0

    check-cast v0, Ln0/o0;

    invoke-interface {v0}, Ln0/o0;->q()Ln0/o0;

    move-result-object v0

    instance-of v1, v0, Lz/z0;

    const-string v2, "CameraInfo doesn\'t contain Camera2 implementation."

    invoke-static {v1, v2}, Lx2/g;->b(ZLjava/lang/Object;)V

    check-cast v0, Lz/z0;

    invoke-virtual {v0}, Lz/z0;->B()Lf0/h;

    move-result-object v0

    instance-of v1, p0, Ln0/e;

    if-eqz v1, :cond_1

    check-cast p0, Ln0/e;

    invoke-virtual {p0}, Ln0/e;->E()Ln0/q3;

    move-result-object p0

    if-eqz p0, :cond_1

    new-instance v1, Lf0/h;

    iget-object v0, v0, Lf0/h;->a:Lz/z0;

    invoke-interface {p0}, Ln0/q3;->h()Ljava/util/List;

    move-result-object p0

    invoke-direct {v1, v0, p0}, Lf0/h;-><init>(Lz/z0;Ljava/util/List;)V

    return-object v1

    :cond_1
    return-object v0
.end method


# virtual methods
.method public b(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/hardware/camera2/CameraCharacteristics$Key<",
            "TT;>;)TT;"
        }
    .end annotation

    iget-object v0, p0, Lf0/h;->c:Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Pair;

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v2, p1}, Landroid/hardware/camera2/CameraCharacteristics$Key;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object p1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    return-object p1

    :cond_1
    iget-object v0, p0, Lf0/h;->a:Lz/z0;

    invoke-virtual {v0}, Lz/z0;->C()La0/c0;

    move-result-object v0

    invoke-virtual {v0, p1}, La0/c0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lf0/h;->a:Lz/z0;

    invoke-virtual {v0}, Lz/z0;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
