.class public final enum Lkn/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lkn/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000c\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lkn/b;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
        "c",
        "d",
        "e",
        "f",
        "g",
        "h",
        "i",
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
.field public static final enum a:Lkn/b;

.field public static final enum b:Lkn/b;

.field public static final enum c:Lkn/b;

.field public static final enum d:Lkn/b;

.field public static final enum e:Lkn/b;

.field public static final enum f:Lkn/b;

.field public static final enum g:Lkn/b;

.field public static final enum h:Lkn/b;

.field public static final enum i:Lkn/b;

.field public static final synthetic j:[Lkn/b;

.field public static final synthetic k:Lqt/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lkn/b;

    const-string v1, "FaceNotCentered"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lkn/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkn/b;->a:Lkn/b;

    new-instance v0, Lkn/b;

    const-string v1, "FaceTooClose"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkn/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkn/b;->b:Lkn/b;

    new-instance v0, Lkn/b;

    const-string v1, "FaceTooFar"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lkn/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkn/b;->c:Lkn/b;

    new-instance v0, Lkn/b;

    const-string v1, "MultipleFaces"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lkn/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkn/b;->d:Lkn/b;

    new-instance v0, Lkn/b;

    const-string v1, "IncompleteFace"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lkn/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkn/b;->e:Lkn/b;

    new-instance v0, Lkn/b;

    const-string v1, "FaceNotFound"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lkn/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkn/b;->f:Lkn/b;

    new-instance v0, Lkn/b;

    const-string v1, "IncorrectPose"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lkn/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkn/b;->g:Lkn/b;

    new-instance v0, Lkn/b;

    const-string v1, "FaceDetectionUnsupported"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lkn/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkn/b;->h:Lkn/b;

    new-instance v0, Lkn/b;

    const-string v1, "Other"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lkn/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkn/b;->i:Lkn/b;

    invoke-static {}, Lkn/b;->a()[Lkn/b;

    move-result-object v0

    sput-object v0, Lkn/b;->j:[Lkn/b;

    invoke-static {v0}, Lqt/b;->a([Ljava/lang/Enum;)Lqt/a;

    move-result-object v0

    sput-object v0, Lkn/b;->k:Lqt/a;

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

.method public static final synthetic a()[Lkn/b;
    .locals 9

    sget-object v0, Lkn/b;->a:Lkn/b;

    sget-object v1, Lkn/b;->b:Lkn/b;

    sget-object v2, Lkn/b;->c:Lkn/b;

    sget-object v3, Lkn/b;->d:Lkn/b;

    sget-object v4, Lkn/b;->e:Lkn/b;

    sget-object v5, Lkn/b;->f:Lkn/b;

    sget-object v6, Lkn/b;->g:Lkn/b;

    sget-object v7, Lkn/b;->h:Lkn/b;

    sget-object v8, Lkn/b;->i:Lkn/b;

    filled-new-array/range {v0 .. v8}, [Lkn/b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lkn/b;
    .locals 1

    const-class v0, Lkn/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lkn/b;

    return-object p0
.end method

.method public static values()[Lkn/b;
    .locals 1

    sget-object v0, Lkn/b;->j:[Lkn/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkn/b;

    return-object v0
.end method
