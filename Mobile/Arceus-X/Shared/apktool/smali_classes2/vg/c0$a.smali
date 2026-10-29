.class public final enum Lvg/c0$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvg/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lvg/c0$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tj\u0002\u0008\u0008j\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lvg/c0$a;",
        "",
        "",
        "value",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "a",
        "Ljava/lang/String;",
        "b",
        "()Ljava/lang/String;",
        "c",
        "d",
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
.field public static final enum b:Lvg/c0$a;

.field public static final enum c:Lvg/c0$a;

.field public static final enum d:Lvg/c0$a;

.field public static final synthetic e:[Lvg/c0$a;

.field public static final synthetic f:Lqt/a;


# instance fields
.field public final a:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lvg/c0$a;

    const/4 v1, 0x0

    const-string v2, "close_button"

    const-string v3, "CLOSE_BUTTON"

    invoke-direct {v0, v3, v1, v2}, Lvg/c0$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lvg/c0$a;->b:Lvg/c0$a;

    new-instance v0, Lvg/c0$a;

    const/4 v1, 0x1

    const-string v2, "back_button"

    const-string v3, "BACK_BUTTON"

    invoke-direct {v0, v3, v1, v2}, Lvg/c0$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lvg/c0$a;->c:Lvg/c0$a;

    new-instance v0, Lvg/c0$a;

    const/4 v1, 0x2

    const-string v2, "programmatic"

    const-string v3, "PROGRAMMATIC"

    invoke-direct {v0, v3, v1, v2}, Lvg/c0$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lvg/c0$a;->d:Lvg/c0$a;

    invoke-static {}, Lvg/c0$a;->a()[Lvg/c0$a;

    move-result-object v0

    sput-object v0, Lvg/c0$a;->e:[Lvg/c0$a;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lvg/c0$a;->f:Lqt/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lvg/c0$a;->a:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic a()[Lvg/c0$a;
    .locals 3

    sget-object v0, Lvg/c0$a;->b:Lvg/c0$a;

    sget-object v1, Lvg/c0$a;->c:Lvg/c0$a;

    sget-object v2, Lvg/c0$a;->d:Lvg/c0$a;

    filled-new-array {v0, v1, v2}, [Lvg/c0$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lvg/c0$a;
    .locals 1

    const-class v0, Lvg/c0$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lvg/c0$a;

    return-object p0
.end method

.method public static values()[Lvg/c0$a;
    .locals 1

    sget-object v0, Lvg/c0$a;->e:[Lvg/c0$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lvg/c0$a;

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lvg/c0$a;->a:Ljava/lang/String;

    return-object v0
.end method
