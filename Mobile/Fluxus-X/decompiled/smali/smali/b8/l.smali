.class public abstract Lb8/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb8/l$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lb8/l$a;
    .locals 1

    new-instance v0, Lb8/f$b;

    invoke-direct {v0}, Lb8/f$b;-><init>()V

    return-object v0
.end method

.method public static i(Ljava/lang/String;)Lb8/l$a;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {}, Lb8/l;->a()Lb8/l$a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lb8/l$a;->g(Ljava/lang/String;)Lb8/l$a;

    move-result-object p0

    return-object p0
.end method

.method public static j([B)Lb8/l$a;
    .locals 1
    .param p0    # [B
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {}, Lb8/l;->a()Lb8/l$a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lb8/l$a;->f([B)Lb8/l$a;

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

.method public abstract e()Lb8/o;
.end method

.method public abstract f()[B
.end method

.method public abstract g()Ljava/lang/String;
.end method

.method public abstract h()J
.end method
