.class public final Lil/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lil/b;",
        "",
        "<init>",
        "()V",
        "Landroidx/lifecycle/f;",
        "a",
        "()Landroidx/lifecycle/f;",
        "Lil/d;",
        "b",
        "Lil/d;",
        "handler",
        "Lil/c;",
        "c",
        "Lil/c;",
        "tokens",
        "universalapp_googleProdRelease"
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
.field public static final a:Lil/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lil/d;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final c:Lil/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lil/b;

    invoke-direct {v0}, Lil/b;-><init>()V

    sput-object v0, Lil/b;->a:Lil/b;

    new-instance v0, Lil/d;

    invoke-direct {v0}, Lil/d;-><init>()V

    sput-object v0, Lil/b;->b:Lil/d;

    sput-object v0, Lil/b;->c:Lil/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a()Landroidx/lifecycle/f;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Lcom/roblox/protocols/designfoundations/DesignFoundationsJniAdapter;

    sget-object v1, Lil/b;->b:Lil/d;

    invoke-direct {v0, v1}, Lcom/roblox/protocols/designfoundations/DesignFoundationsJniAdapter;-><init>(Lil/d;)V

    return-object v0
.end method
