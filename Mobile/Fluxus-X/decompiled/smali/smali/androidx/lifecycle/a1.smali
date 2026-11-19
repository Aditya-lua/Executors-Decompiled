.class public Landroidx/lifecycle/a1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/a1$a;,
        Landroidx/lifecycle/a1$b;,
        Landroidx/lifecycle/a1$c;,
        Landroidx/lifecycle/a1$d;,
        Landroidx/lifecycle/a1$e;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0016\u0018\u0000 \u00182\u00020\u0001:\u0005\u0011\u001b\u001c\u0014\u0018B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B#\u0008\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0004\u0010\u000cJ(\u0010\u0011\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\u000e*\u00020\r2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000fH\u0087\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J(\u0010\u0014\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\u000e*\u00020\r2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J0\u0010\u0018\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\u000e*\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000fH\u0087\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u001a\u00a8\u0006\u001d"
    }
    d2 = {
        "Landroidx/lifecycle/a1;",
        "",
        "Lm4/h;",
        "impl",
        "<init>",
        "(Lm4/h;)V",
        "Landroidx/lifecycle/b1;",
        "store",
        "Landroidx/lifecycle/a1$c;",
        "factory",
        "Ll4/a;",
        "defaultCreationExtras",
        "(Landroidx/lifecycle/b1;Landroidx/lifecycle/a1$c;Ll4/a;)V",
        "Landroidx/lifecycle/x0;",
        "T",
        "Lxu/c;",
        "modelClass",
        "c",
        "(Lxu/c;)Landroidx/lifecycle/x0;",
        "Ljava/lang/Class;",
        "a",
        "(Ljava/lang/Class;)Landroidx/lifecycle/x0;",
        "",
        "key",
        "b",
        "(Ljava/lang/String;Lxu/c;)Landroidx/lifecycle/x0;",
        "Lm4/h;",
        "e",
        "d",
        "lifecycle-viewmodel"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:Landroidx/lifecycle/a1$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Ll4/a$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll4/a$c<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lm4/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/lifecycle/a1$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/lifecycle/a1$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Landroidx/lifecycle/a1;->b:Landroidx/lifecycle/a1$b;

    sget-object v0, Ll4/a;->b:Ll4/a$a;

    new-instance v0, Landroidx/lifecycle/a1$f;

    invoke-direct {v0}, Landroidx/lifecycle/a1$f;-><init>()V

    sput-object v0, Landroidx/lifecycle/a1;->c:Ll4/a$c;

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/b1;Landroidx/lifecycle/a1$c;)V
    .locals 7
    .param p1    # Landroidx/lifecycle/b1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/lifecycle/a1$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "store"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Landroidx/lifecycle/a1;-><init>(Landroidx/lifecycle/b1;Landroidx/lifecycle/a1$c;Ll4/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroidx/lifecycle/b1;Landroidx/lifecycle/a1$c;Ll4/a;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/b1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/lifecycle/a1$c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ll4/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "store"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "factory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultCreationExtras"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    new-instance v0, Lm4/h;

    invoke-direct {v0, p1, p2, p3}, Lm4/h;-><init>(Landroidx/lifecycle/b1;Landroidx/lifecycle/a1$c;Ll4/a;)V

    invoke-direct {p0, v0}, Landroidx/lifecycle/a1;-><init>(Lm4/h;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/lifecycle/b1;Landroidx/lifecycle/a1$c;Ll4/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 4
    sget-object p3, Ll4/a$b;->c:Ll4/a$b;

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Landroidx/lifecycle/a1;-><init>(Landroidx/lifecycle/b1;Landroidx/lifecycle/a1$c;Ll4/a;)V

    return-void
.end method

.method public constructor <init>(Lm4/h;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Landroidx/lifecycle/a1;->a:Lm4/h;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Landroidx/lifecycle/x0;
    .locals 1
    .param p1    # Ljava/lang/Class;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/x0;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lou/a;->c(Ljava/lang/Class;)Lxu/c;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/lifecycle/a1;->c(Lxu/c;)Landroidx/lifecycle/x0;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/String;Lxu/c;)Landroidx/lifecycle/x0;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lxu/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/x0;",
            ">(",
            "Ljava/lang/String;",
            "Lxu/c<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modelClass"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/a1;->a:Lm4/h;

    invoke-virtual {v0, p2, p1}, Lm4/h;->d(Lxu/c;Ljava/lang/String;)Landroidx/lifecycle/x0;

    move-result-object p1

    return-object p1
.end method

.method public final c(Lxu/c;)Landroidx/lifecycle/x0;
    .locals 3
    .param p1    # Lxu/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/x0;",
            ">(",
            "Lxu/c<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "modelClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/lifecycle/a1;->a:Lm4/h;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Lm4/h;->e(Lm4/h;Lxu/c;Ljava/lang/String;ILjava/lang/Object;)Landroidx/lifecycle/x0;

    move-result-object p1

    return-object p1
.end method
