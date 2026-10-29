.class public final enum Lk0/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lk0/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0081\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lk0/b;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
        "c",
        "d",
        "camera-core_release"
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
.field public static final enum a:Lk0/b;

.field public static final enum b:Lk0/b;

.field public static final enum c:Lk0/b;

.field public static final enum d:Lk0/b;

.field public static final synthetic e:[Lk0/b;

.field public static final synthetic f:Lqt/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lk0/b;

    const-string v1, "DYNAMIC_RANGE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lk0/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lk0/b;->a:Lk0/b;

    new-instance v0, Lk0/b;

    const-string v1, "FPS_RANGE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lk0/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lk0/b;->b:Lk0/b;

    new-instance v0, Lk0/b;

    const-string v1, "VIDEO_STABILIZATION"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lk0/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lk0/b;->c:Lk0/b;

    new-instance v0, Lk0/b;

    const-string v1, "IMAGE_FORMAT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lk0/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lk0/b;->d:Lk0/b;

    invoke-static {}, Lk0/b;->a()[Lk0/b;

    move-result-object v0

    sput-object v0, Lk0/b;->e:[Lk0/b;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lk0/b;->f:Lqt/a;

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

.method public static final synthetic a()[Lk0/b;
    .locals 4

    sget-object v0, Lk0/b;->a:Lk0/b;

    sget-object v1, Lk0/b;->b:Lk0/b;

    sget-object v2, Lk0/b;->c:Lk0/b;

    sget-object v3, Lk0/b;->d:Lk0/b;

    filled-new-array {v0, v1, v2, v3}, [Lk0/b;

    move-result-object v0

    return-object v0
.end method

.method public static b()Lqt/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lqt/a<",
            "Lk0/b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    sget-object v0, Lk0/b;->f:Lqt/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lk0/b;
    .locals 1

    const-class v0, Lk0/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lk0/b;

    return-object p0
.end method

.method public static values()[Lk0/b;
    .locals 1

    sget-object v0, Lk0/b;->e:[Lk0/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lk0/b;

    return-object v0
.end method
