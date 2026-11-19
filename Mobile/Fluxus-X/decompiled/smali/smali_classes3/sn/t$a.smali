.class public final enum Lsn/t$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsn/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lsn/t$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lsn/t$a;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
        "c",
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
.field public static final enum a:Lsn/t$a;

.field public static final enum b:Lsn/t$a;

.field public static final enum c:Lsn/t$a;

.field public static final synthetic d:[Lsn/t$a;

.field public static final synthetic e:Lhu/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lsn/t$a;

    const-string v1, "FRONT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lsn/t$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lsn/t$a;->a:Lsn/t$a;

    new-instance v0, Lsn/t$a;

    const-string v1, "BACK"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lsn/t$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lsn/t$a;->b:Lsn/t$a;

    new-instance v0, Lsn/t$a;

    const-string v1, "EXTERNAL"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lsn/t$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lsn/t$a;->c:Lsn/t$a;

    invoke-static {}, Lsn/t$a;->a()[Lsn/t$a;

    move-result-object v0

    sput-object v0, Lsn/t$a;->d:[Lsn/t$a;

    invoke-static {v0}, Lhu/b;->a([Ljava/lang/Enum;)Lhu/a;

    move-result-object v0

    sput-object v0, Lsn/t$a;->e:Lhu/a;

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

.method public static final synthetic a()[Lsn/t$a;
    .locals 3

    sget-object v0, Lsn/t$a;->a:Lsn/t$a;

    sget-object v1, Lsn/t$a;->b:Lsn/t$a;

    sget-object v2, Lsn/t$a;->c:Lsn/t$a;

    filled-new-array {v0, v1, v2}, [Lsn/t$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lsn/t$a;
    .locals 1

    const-class v0, Lsn/t$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lsn/t$a;

    return-object p0
.end method

.method public static values()[Lsn/t$a;
    .locals 1

    sget-object v0, Lsn/t$a;->d:[Lsn/t$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lsn/t$a;

    return-object v0
.end method
