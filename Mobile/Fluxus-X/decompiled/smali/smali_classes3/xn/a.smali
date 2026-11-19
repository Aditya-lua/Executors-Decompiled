.class public final enum Lxn/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lxn/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lxn/a;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
        "c",
        "d",
        "e",
        "camera_release"
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
.field public static final enum a:Lxn/a;

.field public static final enum b:Lxn/a;

.field public static final enum c:Lxn/a;

.field public static final enum d:Lxn/a;

.field public static final enum e:Lxn/a;

.field public static final synthetic f:[Lxn/a;

.field public static final synthetic g:Lhu/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lxn/a;

    const-string v1, "Center"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lxn/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxn/a;->a:Lxn/a;

    new-instance v0, Lxn/a;

    const-string v1, "Left"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lxn/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxn/a;->b:Lxn/a;

    new-instance v0, Lxn/a;

    const-string v1, "Right"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lxn/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxn/a;->c:Lxn/a;

    new-instance v0, Lxn/a;

    const-string v1, "Up"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lxn/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxn/a;->d:Lxn/a;

    new-instance v0, Lxn/a;

    const-string v1, "Down"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lxn/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxn/a;->e:Lxn/a;

    invoke-static {}, Lxn/a;->a()[Lxn/a;

    move-result-object v0

    sput-object v0, Lxn/a;->f:[Lxn/a;

    invoke-static {v0}, Lhu/b;->a([Ljava/lang/Enum;)Lhu/a;

    move-result-object v0

    sput-object v0, Lxn/a;->g:Lhu/a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static final synthetic a()[Lxn/a;
    .locals 5

    sget-object v0, Lxn/a;->a:Lxn/a;

    sget-object v1, Lxn/a;->b:Lxn/a;

    sget-object v2, Lxn/a;->c:Lxn/a;

    sget-object v3, Lxn/a;->d:Lxn/a;

    sget-object v4, Lxn/a;->e:Lxn/a;

    filled-new-array {v0, v1, v2, v3, v4}, [Lxn/a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lxn/a;
    .locals 1

    const-class v0, Lxn/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lxn/a;

    return-object p0
.end method

.method public static values()[Lxn/a;
    .locals 1

    sget-object v0, Lxn/a;->f:[Lxn/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lxn/a;

    return-object v0
.end method
