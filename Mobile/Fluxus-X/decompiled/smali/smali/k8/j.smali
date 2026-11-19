.class public final Lk8/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le8/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk8/j$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le8/b<",
        "Lk8/e;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lk8/j;
    .locals 1

    invoke-static {}, Lk8/j$a;->a()Lk8/j;

    move-result-object v0

    return-object v0
.end method

.method public static c()Lk8/e;
    .locals 2

    invoke-static {}, Lk8/f;->d()Lk8/e;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {v0, v1}, Le8/d;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk8/e;

    return-object v0
.end method


# virtual methods
.method public b()Lk8/e;
    .locals 1

    invoke-static {}, Lk8/j;->c()Lk8/e;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lk8/j;->b()Lk8/e;

    move-result-object v0

    return-object v0
.end method
