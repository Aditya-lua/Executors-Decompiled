.class public Lz/q3;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Landroid/util/Size;

.field public static final f:Landroid/util/Size;

.field public static final g:Landroid/util/Size;

.field public static final h:Ljava/lang/Object;

.field public static volatile i:Lz/q3;


# instance fields
.field public final a:Landroid/hardware/display/DisplayManager;

.field public volatile b:Landroid/util/Size;

.field public final c:Ld0/k;

.field public final d:Ld0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroid/util/Size;

    const/16 v1, 0x780

    const/16 v2, 0x438

    invoke-direct {v0, v1, v2}, Landroid/util/Size;-><init>(II)V

    sput-object v0, Lz/q3;->e:Landroid/util/Size;

    new-instance v0, Landroid/util/Size;

    const/16 v1, 0x140

    const/16 v2, 0xf0

    invoke-direct {v0, v1, v2}, Landroid/util/Size;-><init>(II)V

    sput-object v0, Lz/q3;->f:Landroid/util/Size;

    new-instance v0, Landroid/util/Size;

    const/16 v1, 0x280

    const/16 v2, 0x1e0

    invoke-direct {v0, v1, v2}, Landroid/util/Size;-><init>(II)V

    sput-object v0, Lz/q3;->g:Landroid/util/Size;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lz/q3;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lz/q3;->b:Landroid/util/Size;

    new-instance v0, Ld0/k;

    invoke-direct {v0}, Ld0/k;-><init>()V

    iput-object v0, p0, Lz/q3;->c:Ld0/k;

    new-instance v0, Ld0/d;

    invoke-direct {v0}, Ld0/d;-><init>()V

    iput-object v0, p0, Lz/q3;->d:Ld0/d;

    const-string v0, "display"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/hardware/display/DisplayManager;

    iput-object p1, p0, Lz/q3;->a:Landroid/hardware/display/DisplayManager;

    return-void
.end method

.method public static c(Landroid/content/Context;)Lz/q3;
    .locals 2

    sget-object v0, Lz/q3;->i:Lz/q3;

    if-nez v0, :cond_1

    sget-object v0, Lz/q3;->h:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lz/q3;->i:Lz/q3;

    if-nez v1, :cond_0

    new-instance v1, Lz/q3;

    invoke-direct {v1, p0}, Lz/q3;-><init>(Landroid/content/Context;)V

    sput-object v1, Lz/q3;->i:Lz/q3;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_2
    sget-object p0, Lz/q3;->i:Lz/q3;

    return-object p0
.end method


# virtual methods
.method public final a()Landroid/util/Size;
    .locals 5

    invoke-virtual {p0}, Lz/q3;->b()Landroid/util/Size;

    move-result-object v0

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v2

    mul-int/2addr v1, v2

    sget-object v2, Lz/q3;->e:Landroid/util/Size;

    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    move-result v3

    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v4

    mul-int/2addr v3, v4

    if-le v1, v3, :cond_0

    move-object v0, v2

    :cond_0
    iget-object v1, p0, Lz/q3;->c:Ld0/k;

    invoke-virtual {v1, v0}, Ld0/k;->a(Landroid/util/Size;)Landroid/util/Size;

    move-result-object v0

    return-object v0
.end method

.method public final b()Landroid/util/Size;
    .locals 3

    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lz/q3;->d(Z)Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    new-instance v1, Landroid/util/Size;

    iget v2, v0, Landroid/graphics/Point;->x:I

    iget v0, v0, Landroid/graphics/Point;->y:I

    invoke-direct {v1, v2, v0}, Landroid/util/Size;-><init>(II)V

    sget-object v0, Lz/q3;->f:Landroid/util/Size;

    invoke-static {v1, v0}, Lw0/d;->d(Landroid/util/Size;Landroid/util/Size;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz/q3;->d:Ld0/d;

    invoke-virtual {v0}, Ld0/d;->a()Landroid/util/Size;

    move-result-object v1

    if-nez v1, :cond_0

    sget-object v1, Lz/q3;->g:Landroid/util/Size;

    :cond_0
    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    move-result v0

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v2

    if-le v0, v2, :cond_1

    new-instance v0, Landroid/util/Size;

    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    move-result v2

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-direct {v0, v2, v1}, Landroid/util/Size;-><init>(II)V

    return-object v0

    :cond_1
    return-object v1
.end method

.method public d(Z)Landroid/view/Display;
    .locals 4

    iget-object v0, p0, Lz/q3;->a:Landroid/hardware/display/DisplayManager;

    invoke-virtual {v0}, Landroid/hardware/display/DisplayManager;->getDisplays()[Landroid/view/Display;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    aget-object p1, v0, v3

    return-object p1

    :cond_0
    invoke-virtual {p0, v0, p1}, Lz/q3;->e([Landroid/view/Display;Z)Landroid/view/Display;

    move-result-object v1

    if-nez v1, :cond_1

    if-eqz p1, :cond_1

    invoke-virtual {p0, v0, v3}, Lz/q3;->e([Landroid/view/Display;Z)Landroid/view/Display;

    move-result-object v1

    :cond_1
    if-eqz v1, :cond_2

    return-object v1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "No display can be found from the input display manager!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e([Landroid/view/Display;Z)Landroid/view/Display;
    .locals 8

    array-length v0, p1

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    aget-object v4, p1, v3

    if-eqz p2, :cond_0

    invoke-virtual {v4}, Landroid/view/Display;->getState()I

    move-result v5

    const/4 v6, 0x1

    if-ne v5, v6, :cond_0

    goto :goto_1

    :cond_0
    new-instance v5, Landroid/graphics/Point;

    invoke-direct {v5}, Landroid/graphics/Point;-><init>()V

    invoke-virtual {v4, v5}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    iget v6, v5, Landroid/graphics/Point;->x:I

    iget v5, v5, Landroid/graphics/Point;->y:I

    mul-int v7, v6, v5

    if-le v7, v2, :cond_1

    mul-int/2addr v6, v5

    move-object v1, v4

    move v2, v6

    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-object v1
.end method

.method public f()Landroid/util/Size;
    .locals 1

    iget-object v0, p0, Lz/q3;->b:Landroid/util/Size;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lz/q3;->b:Landroid/util/Size;

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lz/q3;->a()Landroid/util/Size;

    move-result-object v0

    iput-object v0, p0, Lz/q3;->b:Landroid/util/Size;

    iget-object v0, p0, Lz/q3;->b:Landroid/util/Size;

    return-object v0
.end method

.method public g()V
    .locals 1

    invoke-virtual {p0}, Lz/q3;->a()Landroid/util/Size;

    move-result-object v0

    iput-object v0, p0, Lz/q3;->b:Landroid/util/Size;

    return-void
.end method
