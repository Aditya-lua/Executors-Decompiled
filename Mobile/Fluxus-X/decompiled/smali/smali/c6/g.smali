.class public final Lc6/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld6/e;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001d\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lc6/g;",
        "Ld6/e;",
        "Landroid/net/ConnectivityManager;",
        "connManager",
        "",
        "timeoutMs",
        "<init>",
        "(Landroid/net/ConnectivityManager;J)V",
        "Ly5/d;",
        "constraints",
        "Ldv/h;",
        "Lc6/b;",
        "a",
        "(Ly5/d;)Ldv/h;",
        "Lg6/j0;",
        "workSpec",
        "",
        "b",
        "(Lg6/j0;)Z",
        "Landroid/net/ConnectivityManager;",
        "J",
        "work-runtime_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Landroid/net/ConnectivityManager;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:J


# direct methods
.method public constructor <init>(Landroid/net/ConnectivityManager;J)V
    .locals 1
    .param p1    # Landroid/net/ConnectivityManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "connManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc6/g;->a:Landroid/net/ConnectivityManager;

    .line 3
    iput-wide p2, p0, Lc6/g;->b:J

    return-void
.end method

.method public synthetic constructor <init>(Landroid/net/ConnectivityManager;JILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const-wide/16 p2, 0x3e8

    .line 4
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lc6/g;-><init>(Landroid/net/ConnectivityManager;J)V

    return-void
.end method

.method public static final synthetic c(Lc6/g;)Landroid/net/ConnectivityManager;
    .locals 0

    iget-object p0, p0, Lc6/g;->a:Landroid/net/ConnectivityManager;

    return-object p0
.end method

.method public static final synthetic d(Lc6/g;)J
    .locals 2

    iget-wide v0, p0, Lc6/g;->b:J

    return-wide v0
.end method


# virtual methods
.method public a(Ly5/d;)Ldv/h;
    .locals 2
    .param p1    # Ly5/d;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly5/d;",
            ")",
            "Ldv/h<",
            "Lc6/b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "constraints"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lc6/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lc6/g$a;-><init>(Ly5/d;Lc6/g;Leu/b;)V

    invoke-static {v0}, Ldv/j;->d(Lkotlin/jvm/functions/Function2;)Ldv/h;

    move-result-object p1

    return-object p1
.end method

.method public b(Lg6/j0;)Z
    .locals 1
    .param p1    # Lg6/j0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "workSpec"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lg6/j0;->j:Ly5/d;

    invoke-virtual {v0}, Ly5/d;->d()Landroid/net/NetworkRequest;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object p1, p1, Lg6/j0;->j:Ly5/d;

    invoke-virtual {p1}, Ly5/d;->f()Ly5/x;

    move-result-object p1

    sget-object v0, Ly5/x;->a:Ly5/x;

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
