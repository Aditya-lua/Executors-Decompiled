.class public final enum Lwh/u0$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwh/u0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lwh/u0$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0082\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lwh/u0$a;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
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
.field public static final enum a:Lwh/u0$a;

.field public static final enum b:Lwh/u0$a;

.field public static final enum c:Lwh/u0$a;

.field public static final enum d:Lwh/u0$a;

.field public static final synthetic e:[Lwh/u0$a;

.field public static final synthetic f:Lqt/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lwh/u0$a;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lwh/u0$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lwh/u0$a;->a:Lwh/u0$a;

    new-instance v0, Lwh/u0$a;

    const-string v1, "WIFI"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lwh/u0$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lwh/u0$a;->b:Lwh/u0$a;

    new-instance v0, Lwh/u0$a;

    const-string v1, "CELLULAR"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lwh/u0$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lwh/u0$a;->c:Lwh/u0$a;

    new-instance v0, Lwh/u0$a;

    const-string v1, "OTHER"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lwh/u0$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lwh/u0$a;->d:Lwh/u0$a;

    invoke-static {}, Lwh/u0$a;->a()[Lwh/u0$a;

    move-result-object v0

    sput-object v0, Lwh/u0$a;->e:[Lwh/u0$a;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lwh/u0$a;->f:Lqt/a;

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

.method public static final synthetic a()[Lwh/u0$a;
    .locals 4

    sget-object v0, Lwh/u0$a;->a:Lwh/u0$a;

    sget-object v1, Lwh/u0$a;->b:Lwh/u0$a;

    sget-object v2, Lwh/u0$a;->c:Lwh/u0$a;

    sget-object v3, Lwh/u0$a;->d:Lwh/u0$a;

    filled-new-array {v0, v1, v2, v3}, [Lwh/u0$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lwh/u0$a;
    .locals 1

    const-class v0, Lwh/u0$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lwh/u0$a;

    return-object p0
.end method

.method public static values()[Lwh/u0$a;
    .locals 1

    sget-object v0, Lwh/u0$a;->e:[Lwh/u0$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lwh/u0$a;

    return-object v0
.end method
