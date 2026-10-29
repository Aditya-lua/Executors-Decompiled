.class public final Lnu/m0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnu/m0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u000b\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0006\u001a\u0004\u0008\u0005\u0010\u0008\u00a8\u0006\u000c"
    }
    d2 = {
        "Lnu/m0$a;",
        "",
        "<init>",
        "()V",
        "Lnu/m0;",
        "b",
        "Lnu/m0;",
        "a",
        "()Lnu/m0;",
        "Eagerly",
        "c",
        "Lazily",
        "kotlinx-coroutines-core"
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
.field public static final synthetic a:Lnu/m0$a;

.field public static final b:Lnu/m0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Lnu/m0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lnu/m0$a;

    invoke-direct {v0}, Lnu/m0$a;-><init>()V

    sput-object v0, Lnu/m0$a;->a:Lnu/m0$a;

    new-instance v0, Lnu/n0;

    invoke-direct {v0}, Lnu/n0;-><init>()V

    sput-object v0, Lnu/m0$a;->b:Lnu/m0;

    new-instance v0, Lnu/o0;

    invoke-direct {v0}, Lnu/o0;-><init>()V

    sput-object v0, Lnu/m0$a;->c:Lnu/m0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lnu/m0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lnu/m0$a;->b:Lnu/m0;

    return-object v0
.end method

.method public final b()Lnu/m0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lnu/m0$a;->c:Lnu/m0;

    return-object v0
.end method
