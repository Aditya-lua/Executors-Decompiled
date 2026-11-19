.class public final Lvo/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwt/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvo/b0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lwt/d<",
        "Ljava/util/Set<",
        "Lhn/h$e;",
        ">;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lvo/b0;
    .locals 1

    sget-object v0, Lvo/b0$a;->a:Lvo/b0;

    return-object v0
.end method

.method public static c()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lhn/h$e;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lvo/a0;->a()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Lwt/h;->e(Ljava/lang/Object;)Ljava/lang/Object;

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
            "Lhn/h$e;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lvo/b0;->c()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lvo/b0;->b()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
