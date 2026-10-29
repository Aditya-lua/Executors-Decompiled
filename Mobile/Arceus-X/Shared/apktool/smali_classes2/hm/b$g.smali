.class public final Lhm/b$g;
.super Lgt/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhm/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation


# instance fields
.field public final a:[F

.field public final b:F


# direct methods
.method public constructor <init>([FF)V
    .locals 0

    invoke-direct {p0}, Lgt/a;-><init>()V

    invoke-virtual {p1}, [F->clone()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [F

    iput-object p1, p0, Lhm/b$g;->a:[F

    iput p2, p0, Lhm/b$g;->b:F

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lhm/b$g;

    if-eqz v0, :cond_0

    check-cast p1, Lhm/b$g;

    iget v0, p0, Lhm/b$g;->b:F

    iget v1, p1, Lhm/b$g;->b:F

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    iget-object v0, p0, Lhm/b$g;->a:[F

    iget-object p1, p1, Lhm/b$g;->a:[F

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final synthetic b()[Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lhm/b$g;->a:[F

    iget v1, p0, Lhm/b$g;->b:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    return-object v2
.end method

.method public c()[F
    .locals 1

    iget-object v0, p0, Lhm/b$g;->a:[F

    invoke-virtual {v0}, [F->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    return-object v0
.end method

.method public d()F
    .locals 1

    iget v0, p0, Lhm/b$g;->b:F

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lhm/b$g;->a(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Lhm/b$g;->b:F

    iget-object v1, p0, Lhm/b$g;->a:[F

    invoke-static {v0, v1}, Lhm/d;->a(FLjava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lhm/b$g;->b()[Ljava/lang/Object;

    move-result-object v0

    const-class v1, Lhm/b$g;

    const-string v2, "a;b"

    invoke-static {v0, v1, v2}, Lhm/c;->a([Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
