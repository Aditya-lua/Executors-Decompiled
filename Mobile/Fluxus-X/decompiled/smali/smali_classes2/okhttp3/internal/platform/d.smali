.class public final Lokhttp3/internal/platform/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\n\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR(\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0012"
    }
    d2 = {
        "Lokhttp3/internal/platform/d;",
        "",
        "<init>",
        "()V",
        "Lokhttp3/internal/platform/c;",
        "a",
        "()Lokhttp3/internal/platform/c;",
        "",
        "c",
        "()Z",
        "isAndroid",
        "Landroid/content/Context;",
        "value",
        "b",
        "()Landroid/content/Context;",
        "d",
        "(Landroid/content/Context;)V",
        "applicationContext",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final a:Lokhttp3/internal/platform/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lokhttp3/internal/platform/d;

    invoke-direct {v0}, Lokhttp3/internal/platform/d;-><init>()V

    sput-object v0, Lokhttp3/internal/platform/d;->a:Lokhttp3/internal/platform/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lokhttp3/internal/platform/c;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lyv/c;->a:Lyv/c;

    invoke-virtual {v0}, Lyv/c;->b()V

    sget-object v0, Lokhttp3/internal/platform/a;->f:Lokhttp3/internal/platform/a$a;

    invoke-virtual {v0}, Lokhttp3/internal/platform/a$a;->a()Lokhttp3/internal/platform/c;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lokhttp3/internal/platform/b;->f:Lokhttp3/internal/platform/b$a;

    invoke-virtual {v0}, Lokhttp3/internal/platform/b$a;->a()Lokhttp3/internal/platform/c;

    move-result-object v0

    :cond_0
    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Expected Android API level 21+ but was "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final b()Landroid/content/Context;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    sget-object v0, Lokhttp3/internal/platform/c;->a:Lokhttp3/internal/platform/c$a;

    invoke-virtual {v0}, Lokhttp3/internal/platform/c$a;->e()Lokhttp3/internal/platform/c;

    move-result-object v0

    instance-of v1, v0, Lxv/c;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lxv/c;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, Lxv/c;->b()Landroid/content/Context;

    move-result-object v0

    return-object v0

    :cond_1
    return-object v2
.end method

.method public final c()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final d(Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    sget-object v0, Lokhttp3/internal/platform/c;->a:Lokhttp3/internal/platform/c$a;

    invoke-virtual {v0}, Lokhttp3/internal/platform/c$a;->e()Lokhttp3/internal/platform/c;

    move-result-object v0

    instance-of v1, v0, Lxv/c;

    if-eqz v1, :cond_0

    check-cast v0, Lxv/c;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lxv/c;->a(Landroid/content/Context;)V

    :cond_1
    return-void
.end method
