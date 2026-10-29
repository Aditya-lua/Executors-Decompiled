.class public abstract Lz0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz0/e$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lz0/e$a;
    .locals 2

    new-instance v0, Lz0/a$b;

    invoke-direct {v0}, Lz0/a$b;-><init>()V

    const-string v1, "0.0"

    invoke-virtual {v0, v1}, Lz0/a$b;->e(Ljava/lang/String;)Lz0/e$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lz0/e$a;->c(Ljava/lang/String;)Lz0/e$a;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Lz0/e$a;->d(Ljava/lang/String;)Lz0/e$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lz0/e$a;->b(Ljava/lang/String;)Lz0/e$a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract b()Ljava/lang/String;
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e()Ljava/lang/String;
.end method
