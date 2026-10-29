.class public abstract La8/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La8/l$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()La8/l$a;
    .locals 1

    new-instance v0, La8/f$b;

    invoke-direct {v0}, La8/f$b;-><init>()V

    return-object v0
.end method

.method public static i(Ljava/lang/String;)La8/l$a;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {}, La8/l;->a()La8/l$a;

    move-result-object v0

    invoke-virtual {v0, p0}, La8/l$a;->g(Ljava/lang/String;)La8/l$a;

    move-result-object p0

    return-object p0
.end method

.method public static j([B)La8/l$a;
    .locals 1
    .param p0    # [B
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {}, La8/l;->a()La8/l$a;

    move-result-object v0

    invoke-virtual {v0, p0}, La8/l$a;->f([B)La8/l$a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract b()Ljava/lang/Integer;
.end method

.method public abstract c()J
.end method

.method public abstract d()J
.end method

.method public abstract e()La8/o;
.end method

.method public abstract f()[B
.end method

.method public abstract g()Ljava/lang/String;
.end method

.method public abstract h()J
.end method
