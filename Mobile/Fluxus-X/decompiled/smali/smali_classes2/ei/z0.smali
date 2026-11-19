.class public abstract Lei/z0;
.super Lnh/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnh/a<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "rbx.game.orientation"

    invoke-direct {p0, v0}, Lnh/a;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static j()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p0, p1}, Lei/z0;->i(Ljava/lang/Integer;)V

    return-void
.end method

.method public f()J
    .locals 2

    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v0

    invoke-interface {v0}, Lbi/i;->n()J

    move-result-wide v0

    return-wide v0
.end method

.method public g()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public abstract h(I)V
.end method

.method public i(Ljava/lang/Integer;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lei/z0;->h(I)V

    return-void
.end method
