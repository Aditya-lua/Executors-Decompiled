.class public final Ll8/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld8/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll8/c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ld8/b<",
        "Ll8/a;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Ll8/c;
    .locals 1

    invoke-static {}, Ll8/c$a;->a()Ll8/c;

    move-result-object v0

    return-object v0
.end method

.method public static b()Ll8/a;
    .locals 2

    invoke-static {}, Ll8/b;->a()Ll8/a;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {v0, v1}, Ld8/d;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll8/a;

    return-object v0
.end method


# virtual methods
.method public c()Ll8/a;
    .locals 1

    invoke-static {}, Ll8/c;->b()Ll8/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ll8/c;->c()Ll8/a;

    move-result-object v0

    return-object v0
.end method
