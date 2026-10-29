.class public final enum Ln0/w3$d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln0/w3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ln0/w3$d;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Ln0/w3$d;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
        "c",
        "d",
        "e",
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
.field public static final enum a:Ln0/w3$d;

.field public static final enum b:Ln0/w3$d;

.field public static final enum c:Ln0/w3$d;

.field public static final enum d:Ln0/w3$d;

.field public static final enum e:Ln0/w3$d;

.field public static final synthetic f:[Ln0/w3$d;

.field public static final synthetic g:Lqt/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ln0/w3$d;

    const-string v1, "PRIV"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ln0/w3$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/w3$d;->a:Ln0/w3$d;

    new-instance v0, Ln0/w3$d;

    const-string v1, "YUV"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ln0/w3$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/w3$d;->b:Ln0/w3$d;

    new-instance v0, Ln0/w3$d;

    const-string v1, "JPEG"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ln0/w3$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/w3$d;->c:Ln0/w3$d;

    new-instance v0, Ln0/w3$d;

    const-string v1, "JPEG_R"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ln0/w3$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/w3$d;->d:Ln0/w3$d;

    new-instance v0, Ln0/w3$d;

    const-string v1, "RAW"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ln0/w3$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/w3$d;->e:Ln0/w3$d;

    invoke-static {}, Ln0/w3$d;->a()[Ln0/w3$d;

    move-result-object v0

    sput-object v0, Ln0/w3$d;->f:[Ln0/w3$d;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Ln0/w3$d;->g:Lqt/a;

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

.method public static final synthetic a()[Ln0/w3$d;
    .locals 5

    sget-object v0, Ln0/w3$d;->a:Ln0/w3$d;

    sget-object v1, Ln0/w3$d;->b:Ln0/w3$d;

    sget-object v2, Ln0/w3$d;->c:Ln0/w3$d;

    sget-object v3, Ln0/w3$d;->d:Ln0/w3$d;

    sget-object v4, Ln0/w3$d;->e:Ln0/w3$d;

    filled-new-array {v0, v1, v2, v3, v4}, [Ln0/w3$d;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ln0/w3$d;
    .locals 1

    const-class v0, Ln0/w3$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln0/w3$d;

    return-object p0
.end method

.method public static values()[Ln0/w3$d;
    .locals 1

    sget-object v0, Ln0/w3$d;->f:[Ln0/w3$d;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln0/w3$d;

    return-object v0
.end method
