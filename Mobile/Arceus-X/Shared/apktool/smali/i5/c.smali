.class public abstract Li5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf5/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li5/c$a;,
        Li5/c$b;,
        Li5/c$c;,
        Li5/c$d;,
        Li5/c$e;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00080\u0018\u0000 \t2\u00020\u0001:\u0005\u000b\u0017\u000e\t\u0012B\u0019\u0008\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0004\u00a2\u0006\u0004\u0008\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\u000b\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u000e\u0010\u0010R\"\u0010\u0014\u001a\u00020\u00118\u0004@\u0004X\u0084\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0012\u0010\u0016\u0082\u0001\u0004\u0018\u0019\u001a\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Li5/c;",
        "Lf5/d;",
        "Lg5/c;",
        "db",
        "",
        "sql",
        "<init>",
        "(Lg5/c;Ljava/lang/String;)V",
        "",
        "d",
        "()V",
        "a",
        "Lg5/c;",
        "()Lg5/c;",
        "b",
        "Ljava/lang/String;",
        "()Ljava/lang/String;",
        "",
        "c",
        "Z",
        "isClosed",
        "()Z",
        "(Z)V",
        "e",
        "Li5/c$b;",
        "Li5/c$c;",
        "Li5/c$d;",
        "Li5/c$e;",
        "sqlite-framework"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final d:Li5/c$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lg5/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li5/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li5/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Li5/c;->d:Li5/c$a;

    return-void
.end method

.method public constructor <init>(Lg5/c;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Li5/c;->a:Lg5/c;

    .line 4
    iput-object p2, p0, Li5/c;->b:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lg5/c;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Li5/c;-><init>(Lg5/c;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()Lg5/c;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Li5/c;->a:Lg5/c;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Li5/c;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final c(Z)V
    .locals 0

    iput-boolean p1, p0, Li5/c;->c:Z

    return-void
.end method

.method public final d()V
    .locals 2

    iget-boolean v0, p0, Li5/c;->c:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/16 v0, 0x15

    const-string v1, "statement is closed"

    invoke-static {v0, v1}, Lf5/a;->b(ILjava/lang/String;)Ljava/lang/Void;

    new-instance v0, Ljt/d;

    invoke-direct {v0}, Ljt/d;-><init>()V

    throw v0
.end method

.method public final isClosed()Z
    .locals 1

    iget-boolean v0, p0, Li5/c;->c:Z

    return v0
.end method
