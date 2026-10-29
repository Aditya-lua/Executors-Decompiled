.class public final Lwp/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwp/c$a;,
        Lwp/c$b;,
        Lwp/c$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0002\u0010\u0007B\t\u0008\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0003R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\"\u0004\u0008\u000b\u0010\u000cR$\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0007\u0010\u0012R\"\u0010\u0016\u001a\u00020\u00068F@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010\u0008\u001a\u0004\u0008\u0010\u0010\n\"\u0004\u0008\u0015\u0010\u000cR\"\u0010\u0018\u001a\u00020\u00068F@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\t\u0010\u0008\u001a\u0004\u0008\u0014\u0010\n\"\u0004\u0008\u0017\u0010\u000c\u00a8\u0006\u0019"
    }
    d2 = {
        "Lwp/c;",
        "",
        "<init>",
        "()V",
        "",
        "g",
        "",
        "a",
        "Z",
        "d",
        "()Z",
        "e",
        "(Z)V",
        "isSandboxModeEnabled",
        "Lwp/c$b;",
        "value",
        "b",
        "Lwp/c$b;",
        "()Lwp/c$b;",
        "debugForcedStatus",
        "c",
        "f",
        "simulateGovIdNfc",
        "setSimulateJpMyNumberNfc",
        "simulateJpMyNumberNfc",
        "sandbox_release"
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
.field public static final e:Lwp/c$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public a:Z

.field public b:Lwp/c$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public c:Z

.field public d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lwp/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lwp/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lwp/c;->e:Lwp/c$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lwp/c$b;->b:Lwp/c$b;

    iput-object v0, p0, Lwp/c;->b:Lwp/c$b;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lwp/c;->c:Z

    iput-boolean v0, p0, Lwp/c;->d:Z

    return-void
.end method


# virtual methods
.method public final a()Lwp/c$b;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lwp/c;->b:Lwp/c$b;

    return-object v0
.end method

.method public final b()Z
    .locals 1

    iget-boolean v0, p0, Lwp/c;->a:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lwp/c;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lwp/c;->a:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lwp/c;->d:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, Lwp/c;->a:Z

    return v0
.end method

.method public final e(Z)V
    .locals 0

    iput-boolean p1, p0, Lwp/c;->a:Z

    return-void
.end method

.method public final f(Z)V
    .locals 0

    iput-boolean p1, p0, Lwp/c;->c:Z

    return-void
.end method

.method public final g()V
    .locals 2

    iget-object v0, p0, Lwp/c;->b:Lwp/c$b;

    sget-object v1, Lwp/c$c;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    sget-object v0, Lwp/c$b;->a:Lwp/c$b;

    goto :goto_0

    :cond_0
    new-instance v0, Ljt/l;

    invoke-direct {v0}, Ljt/l;-><init>()V

    throw v0

    :cond_1
    sget-object v0, Lwp/c$b;->b:Lwp/c$b;

    :goto_0
    iput-object v0, p0, Lwp/c;->b:Lwp/c$b;

    return-void
.end method
