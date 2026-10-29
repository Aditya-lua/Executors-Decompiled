.class public Ldd/f$a;
.super Ly3/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldd/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ly3/c<",
        "Ldd/f<",
        "*>;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Ly3/c;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)F
    .locals 0

    check-cast p1, Ldd/f;

    invoke-virtual {p0, p1}, Ldd/f$a;->c(Ldd/f;)F

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;F)V
    .locals 0

    check-cast p1, Ldd/f;

    invoke-virtual {p0, p1, p2}, Ldd/f$a;->d(Ldd/f;F)V

    return-void
.end method

.method public c(Ldd/f;)F
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldd/f<",
            "*>;)F"
        }
    .end annotation

    invoke-static {p1}, Ldd/f;->t(Ldd/f;)F

    move-result p1

    const v0, 0x461c4000    # 10000.0f

    mul-float/2addr p1, v0

    return p1
.end method

.method public d(Ldd/f;F)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldd/f<",
            "*>;F)V"
        }
    .end annotation

    const v0, 0x461c4000    # 10000.0f

    div-float/2addr p2, v0

    invoke-static {p1, p2}, Ldd/f;->u(Ldd/f;F)V

    return-void
.end method
