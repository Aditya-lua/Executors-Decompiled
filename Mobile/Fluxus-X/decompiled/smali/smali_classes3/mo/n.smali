.class public final enum Lmo/n;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lmo/n;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tj\u0002\u0008\u0008j\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lmo/n;",
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
.field public static final enum b:Lmo/n;

.field public static final enum c:Lmo/n;

.field public static final enum d:Lmo/n;

.field public static final synthetic e:[Lmo/n;

.field public static final synthetic f:Lhu/a;


# instance fields
.field public final a:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lmo/n;

    const/4 v1, 0x0

    const-string v2, "on_call"

    const-string v3, "ON_CALL"

    invoke-direct {v0, v3, v1, v2}, Lmo/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmo/n;->b:Lmo/n;

    new-instance v0, Lmo/n;

    const/4 v1, 0x1

    const-string v2, "none_detected"

    const-string v3, "NONE_DETECTED"

    invoke-direct {v0, v3, v1, v2}, Lmo/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmo/n;->c:Lmo/n;

    new-instance v0, Lmo/n;

    const/4 v1, 0x2

    const-string v2, "unavailable"

    const-string v3, "UNAVAILABLE"

    invoke-direct {v0, v3, v1, v2}, Lmo/n;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lmo/n;->d:Lmo/n;

    invoke-static {}, Lmo/n;->a()[Lmo/n;

    move-result-object v0

    sput-object v0, Lmo/n;->e:[Lmo/n;

    invoke-static {v0}, Lhu/b;->a([Ljava/lang/Enum;)Lhu/a;

    move-result-object v0

    sput-object v0, Lmo/n;->f:Lhu/a;

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

    iput-object p3, p0, Lmo/n;->a:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic a()[Lmo/n;
    .locals 3

    sget-object v0, Lmo/n;->b:Lmo/n;

    sget-object v1, Lmo/n;->c:Lmo/n;

    sget-object v2, Lmo/n;->d:Lmo/n;

    filled-new-array {v0, v1, v2}, [Lmo/n;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lmo/n;
    .locals 1

    const-class v0, Lmo/n;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lmo/n;

    return-object p0
.end method

.method public static values()[Lmo/n;
    .locals 1

    sget-object v0, Lmo/n;->e:[Lmo/n;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lmo/n;

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lmo/n;->a:Ljava/lang/String;

    return-object v0
.end method
