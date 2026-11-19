.class public final Lm8/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le8/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm8/d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Le8/b<",
        "Lm8/a;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lm8/d;
    .locals 1

    invoke-static {}, Lm8/d$a;->a()Lm8/d;

    move-result-object v0

    return-object v0
.end method

.method public static c()Lm8/a;
    .locals 2

    invoke-static {}, Lm8/b;->b()Lm8/a;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable @Provides method"

    invoke-static {v0, v1}, Le8/d;->c(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm8/a;

    return-object v0
.end method


# virtual methods
.method public b()Lm8/a;
    .locals 1

    invoke-static {}, Lm8/d;->c()Lm8/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lm8/d;->b()Lm8/a;

    move-result-object v0

    return-object v0
.end method
