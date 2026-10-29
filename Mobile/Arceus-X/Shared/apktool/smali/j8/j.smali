.class public final Lj8/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld8/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj8/j$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ld8/b<",
        "Lj8/e;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lj8/j;
    .locals 1

    invoke-static {}, Lj8/j$a;->a()Lj8/j;

    move-result-object v0

    return-object v0
.end method

.method public static c()Lj8/e;
    .locals 2

    invoke-static {}, Lj8/f;->d()Lj8/e;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {v0, v1}, Ld8/d;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj8/e;

    return-object v0
.end method


# virtual methods
.method public b()Lj8/e;
    .locals 1

    invoke-static {}, Lj8/j;->c()Lj8/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lj8/j;->b()Lj8/e;

    move-result-object v0

    return-object v0
.end method
