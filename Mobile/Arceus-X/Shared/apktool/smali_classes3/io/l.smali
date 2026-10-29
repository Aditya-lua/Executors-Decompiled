.class public final Lio/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/l$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Ljava/util/Set<",
        "Lum/h$e;",
        ">;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lio/l;
    .locals 1

    sget-object v0, Lio/l$a;->a:Lio/l;

    return-object v0
.end method

.method public static c()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lum/h$e;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/governmentid/k;->a()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Lft/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Set;

    return-object v0
.end method


# virtual methods
.method public b()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lum/h$e;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lio/l;->c()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lio/l;->b()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
