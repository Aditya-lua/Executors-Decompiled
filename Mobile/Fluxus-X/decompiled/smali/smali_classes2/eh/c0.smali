.class public final Leh/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\t\n\u0002\u0008\u0008\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J5\u0010\u000b\u001a\u00020\n2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000eJC\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00042\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014JI\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0015H\u0007\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Leh/c0;",
        "",
        "<init>",
        "()V",
        "",
        "consentRequired",
        "Leh/b0;",
        "cache",
        "trackingOptedOut",
        "attributionBlocked",
        "Leh/d0;",
        "b",
        "(Ljava/lang/Boolean;Leh/b0;ZZ)Leh/d0;",
        "e",
        "(Leh/b0;)Z",
        "applySharingFilter",
        "dmaConsented",
        "d",
        "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ZZ)Leh/d0;",
        "c",
        "(ZLjava/lang/Boolean;)Leh/d0;",
        "",
        "timestampMs",
        "hasApplySharingFilter",
        "dmaMalformed",
        "nowMs",
        "ttlMs",
        "a",
        "(JZZLjava/lang/Boolean;ZJJ)Leh/b0;",
        "NativeShell_googleProdRelease"
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
.field public static final a:Leh/c0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Leh/c0;

    invoke-direct {v0}, Leh/c0;-><init>()V

    sput-object v0, Leh/c0;->a:Leh/c0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(JZZLjava/lang/Boolean;ZJJ)Leh/b0;
    .locals 2
    .param p4    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    if-nez p2, :cond_1

    sget-object p0, Leh/b0$a;->a:Leh/b0$a;

    return-object p0

    :cond_1
    if-eqz v0, :cond_4

    if-eqz p2, :cond_4

    if-eqz p5, :cond_2

    goto :goto_1

    :cond_2
    sub-long/2addr p6, p0

    cmp-long p0, p6, p8

    if-lez p0, :cond_3

    sget-object p0, Leh/b0$d;->a:Leh/b0$d;

    return-object p0

    :cond_3
    new-instance p0, Leh/b0$b;

    invoke-direct {p0, p3, p4}, Leh/b0$b;-><init>(ZLjava/lang/Boolean;)V

    return-object p0

    :cond_4
    :goto_1
    sget-object p0, Leh/b0$c;->a:Leh/b0$c;

    return-object p0
.end method

.method public static final b(Ljava/lang/Boolean;Leh/b0;ZZ)Leh/d0;
    .locals 1
    .param p0    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p1    # Leh/b0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "cache"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    sget-object p0, Leh/d0;->b:Leh/d0;

    return-object p0

    :cond_0
    if-eqz p3, :cond_1

    sget-object p0, Leh/d0;->c:Leh/d0;

    return-object p0

    :cond_1
    instance-of p2, p1, Leh/b0$b;

    const/4 p3, 0x0

    if-eqz p2, :cond_2

    move-object p2, p1

    check-cast p2, Leh/b0$b;

    goto :goto_0

    :cond_2
    move-object p2, p3

    :goto_0
    if-eqz p2, :cond_3

    invoke-virtual {p2}, Leh/b0$b;->a()Z

    move-result p3

    invoke-virtual {p2}, Leh/b0$b;->b()Ljava/lang/Boolean;

    move-result-object p2

    invoke-static {p3, p2}, Leh/c0;->c(ZLjava/lang/Boolean;)Leh/d0;

    move-result-object p3

    :cond_3
    if-eqz p3, :cond_4

    invoke-virtual {p3}, Leh/d0;->b()Z

    move-result p2

    if-nez p2, :cond_4

    goto :goto_1

    :cond_4
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_5

    sget-object p0, Leh/d0;->e:Leh/d0;

    return-object p0

    :cond_5
    if-nez p3, :cond_7

    sget-object p0, Leh/b0$a;->a:Leh/b0$a;

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_6

    sget-object p0, Leh/d0;->h:Leh/d0;

    return-object p0

    :cond_6
    sget-object p0, Leh/d0;->i:Leh/d0;

    return-object p0

    :cond_7
    :goto_1
    return-object p3
.end method

.method public static final c(ZLjava/lang/Boolean;)Leh/d0;
    .locals 0
    .param p1    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    if-eqz p0, :cond_0

    sget-object p0, Leh/d0;->f:Leh/d0;

    return-object p0

    :cond_0
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, p0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Leh/d0;->g:Leh/d0;

    return-object p0

    :cond_1
    sget-object p0, Leh/d0;->d:Leh/d0;

    return-object p0
.end method

.method public static final d(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;ZZ)Leh/d0;
    .locals 0
    .param p0    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Boolean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    if-eqz p3, :cond_0

    sget-object p0, Leh/d0;->b:Leh/d0;

    return-object p0

    :cond_0
    if-eqz p4, :cond_1

    sget-object p0, Leh/d0;->c:Leh/d0;

    return-object p0

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-static {p0, p2}, Leh/c0;->c(ZLjava/lang/Boolean;)Leh/d0;

    move-result-object p0

    return-object p0

    :cond_2
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_3

    const/4 p0, 0x1

    invoke-static {p0, p2}, Leh/c0;->c(ZLjava/lang/Boolean;)Leh/d0;

    move-result-object p0

    return-object p0

    :cond_3
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4

    sget-object p0, Leh/d0;->g:Leh/d0;

    return-object p0

    :cond_4
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final e(Leh/b0;)Z
    .locals 2
    .param p0    # Leh/b0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "cache"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Leh/b0$b;

    if-eqz v0, :cond_0

    check-cast p0, Leh/b0$b;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    const/4 v0, 0x0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Leh/b0$b;->a()Z

    move-result v1

    invoke-virtual {p0}, Leh/b0$b;->b()Ljava/lang/Boolean;

    move-result-object p0

    invoke-static {v1, p0}, Leh/c0;->c(ZLjava/lang/Boolean;)Leh/d0;

    move-result-object p0

    invoke-virtual {p0}, Leh/d0;->b()Z

    move-result p0

    const/4 v1, 0x1

    xor-int/2addr p0, v1

    if-ne p0, v1, :cond_1

    return v1

    :cond_1
    return v0
.end method
