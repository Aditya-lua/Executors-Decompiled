.class public final Lav/k2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a\u0017\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0081\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0006\"\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0006\"\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0006\"\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0006\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0001\u0010\u0012\u00a8\u0006\u0015"
    }
    d2 = {
        "",
        "g",
        "(Ljava/lang/Object;)Ljava/lang/Object;",
        "h",
        "Lgv/e0;",
        "a",
        "Lgv/e0;",
        "COMPLETING_ALREADY",
        "b",
        "COMPLETING_WAITING_CHILDREN",
        "c",
        "COMPLETING_RETRY",
        "d",
        "TOO_LATE_TO_CANCEL",
        "e",
        "SEALED",
        "Lav/l1;",
        "f",
        "Lav/l1;",
        "EMPTY_NEW",
        "EMPTY_ACTIVE",
        "kotlinx-coroutines-core"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lgv/e0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lgv/e0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Lgv/e0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final d:Lgv/e0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final e:Lgv/e0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final f:Lav/l1;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final g:Lav/l1;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgv/e0;

    const-string v1, "COMPLETING_ALREADY"

    invoke-direct {v0, v1}, Lgv/e0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lav/k2;->a:Lgv/e0;

    new-instance v0, Lgv/e0;

    const-string v1, "COMPLETING_WAITING_CHILDREN"

    invoke-direct {v0, v1}, Lgv/e0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lav/k2;->b:Lgv/e0;

    new-instance v0, Lgv/e0;

    const-string v1, "COMPLETING_RETRY"

    invoke-direct {v0, v1}, Lgv/e0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lav/k2;->c:Lgv/e0;

    new-instance v0, Lgv/e0;

    const-string v1, "TOO_LATE_TO_CANCEL"

    invoke-direct {v0, v1}, Lgv/e0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lav/k2;->d:Lgv/e0;

    new-instance v0, Lgv/e0;

    const-string v1, "SEALED"

    invoke-direct {v0, v1}, Lgv/e0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lav/k2;->e:Lgv/e0;

    new-instance v0, Lav/l1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lav/l1;-><init>(Z)V

    sput-object v0, Lav/k2;->f:Lav/l1;

    new-instance v0, Lav/l1;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lav/l1;-><init>(Z)V

    sput-object v0, Lav/k2;->g:Lav/l1;

    return-void
.end method

.method public static final synthetic a()Lgv/e0;
    .locals 1

    sget-object v0, Lav/k2;->a:Lgv/e0;

    return-object v0
.end method

.method public static final synthetic b()Lgv/e0;
    .locals 1

    sget-object v0, Lav/k2;->c:Lgv/e0;

    return-object v0
.end method

.method public static final synthetic c()Lav/l1;
    .locals 1

    sget-object v0, Lav/k2;->g:Lav/l1;

    return-object v0
.end method

.method public static final synthetic d()Lav/l1;
    .locals 1

    sget-object v0, Lav/k2;->f:Lav/l1;

    return-object v0
.end method

.method public static final synthetic e()Lgv/e0;
    .locals 1

    sget-object v0, Lav/k2;->e:Lgv/e0;

    return-object v0
.end method

.method public static final synthetic f()Lgv/e0;
    .locals 1

    sget-object v0, Lav/k2;->d:Lgv/e0;

    return-object v0
.end method

.method public static final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p0    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p0, Lav/y1;

    if-eqz v0, :cond_0

    new-instance v0, Lav/z1;

    check-cast p0, Lav/y1;

    invoke-direct {v0, p0}, Lav/z1;-><init>(Lav/y1;)V

    return-object v0

    :cond_0
    return-object p0
.end method

.method public static final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p0    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p0, Lav/z1;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lav/z1;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    iget-object v0, v0, Lav/z1;->a:Lav/y1;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    return-object v0

    :cond_2
    :goto_1
    return-object p0
.end method
