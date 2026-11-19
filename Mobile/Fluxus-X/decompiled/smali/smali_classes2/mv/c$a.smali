.class public final Lmv/c$a;
.super Lmv/i0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmv/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0002\u0018\u00002\u00020\u0001B\'\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u0017R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b"
    }
    d2 = {
        "Lmv/c$a;",
        "Lmv/i0;",
        "Lpv/f$d;",
        "Lpv/f;",
        "snapshot",
        "",
        "contentType",
        "contentLength",
        "<init>",
        "(Lpv/f$d;Ljava/lang/String;Ljava/lang/String;)V",
        "Lmv/b0;",
        "f",
        "()Lmv/b0;",
        "",
        "e",
        "()J",
        "Lew/g;",
        "l3",
        "()Lew/g;",
        "d",
        "Lpv/f$d;",
        "k",
        "()Lpv/f$d;",
        "Ljava/lang/String;",
        "g",
        "Lew/g;",
        "bodySource",
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


# instance fields
.field public final d:Lpv/f$d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final f:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final g:Lew/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lpv/f$d;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1    # Lpv/f$d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string v0, "snapshot"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lmv/i0;-><init>()V

    iput-object p1, p0, Lmv/c$a;->d:Lpv/f$d;

    iput-object p2, p0, Lmv/c$a;->e:Ljava/lang/String;

    iput-object p3, p0, Lmv/c$a;->f:Ljava/lang/String;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lpv/f$d;->b(I)Lew/l0;

    move-result-object p1

    new-instance p2, Lmv/c$a$a;

    invoke-direct {p2, p1, p0}, Lmv/c$a$a;-><init>(Lew/l0;Lmv/c$a;)V

    invoke-static {p2}, Lew/v;->c(Lew/l0;)Lew/g;

    move-result-object p1

    iput-object p1, p0, Lmv/c$a;->g:Lew/g;

    return-void
.end method


# virtual methods
.method public e()J
    .locals 3

    iget-object v0, p0, Lmv/c$a;->f:Ljava/lang/String;

    const-wide/16 v1, -0x1

    if-eqz v0, :cond_0

    invoke-static {v0, v1, v2}, Lnv/n;->C(Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0

    :cond_0
    return-wide v1
.end method

.method public f()Lmv/b0;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object v0, p0, Lmv/c$a;->e:Ljava/lang/String;

    if-eqz v0, :cond_0

    sget-object v1, Lmv/b0;->e:Lmv/b0$a;

    invoke-virtual {v1, v0}, Lmv/b0$a;->b(Ljava/lang/String;)Lmv/b0;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final k()Lpv/f$d;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lmv/c$a;->d:Lpv/f$d;

    return-object v0
.end method

.method public l3()Lew/g;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lmv/c$a;->g:Lew/g;

    return-object v0
.end method
