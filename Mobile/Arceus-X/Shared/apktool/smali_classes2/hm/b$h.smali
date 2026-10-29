.class public final Lhm/b$h;
.super Lgt/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhm/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "h"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Landroid/os/Vibrator;

.field public final c:[F


# direct methods
.method public constructor <init>(Ljava/lang/String;Landroid/os/Vibrator;[F)V
    .locals 0

    invoke-direct {p0}, Lgt/a;-><init>()V

    invoke-virtual {p3}, [F->clone()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [F

    iput-object p1, p0, Lhm/b$h;->a:Ljava/lang/String;

    iput-object p2, p0, Lhm/b$h;->b:Landroid/os/Vibrator;

    iput-object p3, p0, Lhm/b$h;->c:[F

    return-void
.end method

.method private synthetic a(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lhm/b$h;

    if-eqz v0, :cond_0

    check-cast p1, Lhm/b$h;

    iget-object v0, p0, Lhm/b$h;->a:Ljava/lang/String;

    iget-object v1, p1, Lhm/b$h;->a:Ljava/lang/String;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhm/b$h;->b:Landroid/os/Vibrator;

    iget-object v1, p1, Lhm/b$h;->b:Landroid/os/Vibrator;

    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhm/b$h;->c:[F

    iget-object p1, p1, Lhm/b$h;->c:[F

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private synthetic b()[Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lhm/b$h;->a:Ljava/lang/String;

    iget-object v1, p0, Lhm/b$h;->b:Landroid/os/Vibrator;

    iget-object v2, p0, Lhm/b$h;->c:[F

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v1, v3, v0

    const/4 v0, 0x2

    aput-object v2, v3, v0

    return-object v3
.end method


# virtual methods
.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lhm/b$h;->a:Ljava/lang/String;

    return-object v0
.end method

.method public d()[F
    .locals 1

    iget-object v0, p0, Lhm/b$h;->c:[F

    invoke-virtual {v0}, [F->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    return-object v0
.end method

.method public e()Landroid/os/Vibrator;
    .locals 1

    iget-object v0, p0, Lhm/b$h;->b:Landroid/os/Vibrator;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-direct {p0, p1}, Lhm/b$h;->a(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 3

    iget-object v0, p0, Lhm/b$h;->a:Ljava/lang/String;

    iget-object v1, p0, Lhm/b$h;->b:Landroid/os/Vibrator;

    iget-object v2, p0, Lhm/b$h;->c:[F

    invoke-static {v0, v1, v2}, Lhm/e;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-direct {p0}, Lhm/b$h;->b()[Ljava/lang/Object;

    move-result-object v0

    const-class v1, Lhm/b$h;

    const-string v2, "a;b;c"

    invoke-static {v0, v1, v2}, Lhm/c;->a([Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
