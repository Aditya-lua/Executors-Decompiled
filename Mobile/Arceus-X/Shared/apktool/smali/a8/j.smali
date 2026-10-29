.class public abstract La8/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/List;)La8/j;
    .locals 1
    .param p0    # Ljava/util/List;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "La8/m;",
            ">;)",
            "La8/j;"
        }
    .end annotation

    new-instance v0, La8/d;

    invoke-direct {v0, p0}, La8/d;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static b()Lrf/a;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Ltf/d;

    invoke-direct {v0}, Ltf/d;-><init>()V

    sget-object v1, La8/b;->a:Lsf/a;

    invoke-virtual {v0, v1}, Ltf/d;->i(Lsf/a;)Ltf/d;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ltf/d;->j(Z)Ltf/d;

    move-result-object v0

    invoke-virtual {v0}, Ltf/d;->h()Lrf/a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract c()Ljava/util/List;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "La8/m;",
            ">;"
        }
    .end annotation
.end method
