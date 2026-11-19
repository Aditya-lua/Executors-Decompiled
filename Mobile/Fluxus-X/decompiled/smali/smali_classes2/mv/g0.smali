.class public abstract Lmv/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmv/g0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008&\u0018\u0000 \u00082\u00020\u0001:\u0001\u0008B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH&\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Lmv/g0;",
        "",
        "<init>",
        "()V",
        "Lmv/b0;",
        "b",
        "()Lmv/b0;",
        "",
        "a",
        "()J",
        "Lew/f;",
        "sink",
        "",
        "h",
        "(Lew/f;)V",
        "",
        "f",
        "()Z",
        "g",
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
.field public static final a:Lmv/g0$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lmv/g0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lmv/g0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lmv/g0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lmv/g0;->a:Lmv/g0$a;

    sget-object v2, Lew/h;->e:Lew/h;

    const/4 v3, 0x1

    invoke-static {v0, v2, v1, v3, v1}, Lmv/g0$a;->i(Lmv/g0$a;Lew/h;Lmv/b0;ILjava/lang/Object;)Lmv/g0;

    move-result-object v0

    sput-object v0, Lmv/g0;->b:Lmv/g0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final c(Lmv/b0;Lew/h;)Lmv/g0;
    .locals 1
    .param p0    # Lmv/b0;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p1    # Lew/h;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lmv/g0;->a:Lmv/g0$a;

    invoke-virtual {v0, p0, p1}, Lmv/g0$a;->d(Lmv/b0;Lew/h;)Lmv/g0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lmv/b0;Ljava/lang/String;)Lmv/g0;
    .locals 1
    .param p0    # Lmv/b0;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lmv/g0;->a:Lmv/g0$a;

    invoke-virtual {v0, p0, p1}, Lmv/g0$a;->e(Lmv/b0;Ljava/lang/String;)Lmv/g0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lmv/b0;[B)Lmv/g0;
    .locals 1
    .param p0    # Lmv/b0;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lmv/g0;->a:Lmv/g0$a;

    invoke-virtual {v0, p0, p1}, Lmv/g0$a;->f(Lmv/b0;[B)Lmv/g0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()J
    .locals 2

    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public abstract b()Lmv/b0;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public g()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract h(Lew/f;)V
    .param p1    # Lew/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method
