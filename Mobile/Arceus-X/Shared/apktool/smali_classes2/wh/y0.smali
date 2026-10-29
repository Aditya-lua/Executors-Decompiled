.class public abstract Lwh/y0;
.super Leh/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Leh/a<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "rbx.game.orientation"

    invoke-direct {p0, v0}, Leh/a;-><init>(Ljava/lang/String;)V

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

    invoke-virtual {p0, p1}, Lwh/y0;->i(Ljava/lang/Integer;)V

    return-void
.end method

.method public f()J
    .locals 2

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v0

    invoke-interface {v0}, Lth/i;->o()J

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

    invoke-virtual {p0, p1}, Lwh/y0;->h(I)V

    return-void
.end method
