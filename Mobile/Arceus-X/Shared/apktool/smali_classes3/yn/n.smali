.class public final enum Lyn/n;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lyn/n;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tj\u0002\u0008\u0008j\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lyn/n;",
        "",
        "",
        "serializedValue",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "a",
        "Ljava/lang/String;",
        "b",
        "()Ljava/lang/String;",
        "c",
        "d",
        "device_release"
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
.field public static final enum b:Lyn/n;

.field public static final enum c:Lyn/n;

.field public static final enum d:Lyn/n;

.field public static final synthetic e:[Lyn/n;

.field public static final synthetic f:Lqt/a;


# instance fields
.field public final a:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lyn/n;

    const/4 v1, 0x0

    const-string v2, "on_call"

    const-string v3, "ON_CALL"

    invoke-direct {v0, v3, v1, v2}, Lyn/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lyn/n;->b:Lyn/n;

    new-instance v0, Lyn/n;

    const/4 v1, 0x1

    const-string v2, "none_detected"

    const-string v3, "NONE_DETECTED"

    invoke-direct {v0, v3, v1, v2}, Lyn/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lyn/n;->c:Lyn/n;

    new-instance v0, Lyn/n;

    const/4 v1, 0x2

    const-string v2, "unavailable"

    const-string v3, "UNAVAILABLE"

    invoke-direct {v0, v3, v1, v2}, Lyn/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lyn/n;->d:Lyn/n;

    invoke-static {}, Lyn/n;->a()[Lyn/n;

    move-result-object v0

    sput-object v0, Lyn/n;->e:[Lyn/n;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lyn/n;->f:Lqt/a;

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

    iput-object p3, p0, Lyn/n;->a:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic a()[Lyn/n;
    .locals 3

    sget-object v0, Lyn/n;->b:Lyn/n;

    sget-object v1, Lyn/n;->c:Lyn/n;

    sget-object v2, Lyn/n;->d:Lyn/n;

    filled-new-array {v0, v1, v2}, [Lyn/n;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lyn/n;
    .locals 1

    const-class v0, Lyn/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lyn/n;

    return-object p0
.end method

.method public static values()[Lyn/n;
    .locals 1

    sget-object v0, Lyn/n;->e:[Lyn/n;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lyn/n;

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lyn/n;->a:Ljava/lang/String;

    return-object v0
.end method
