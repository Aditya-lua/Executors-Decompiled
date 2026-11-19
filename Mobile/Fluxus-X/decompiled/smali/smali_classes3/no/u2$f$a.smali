.class public final enum Lno/u2$f$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lno/u2$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lno/u2$f$a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lno/u2$f$a;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "a",
        "b",
        "c",
        "d",
        "e",
        "document_release"
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
.field public static final enum a:Lno/u2$f$a;

.field public static final enum b:Lno/u2$f$a;

.field public static final enum c:Lno/u2$f$a;

.field public static final enum d:Lno/u2$f$a;

.field public static final enum e:Lno/u2$f$a;

.field public static final synthetic f:[Lno/u2$f$a;

.field public static final synthetic g:Lhu/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lno/u2$f$a;

    const-string v1, "None"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lno/u2$f$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lno/u2$f$a;->a:Lno/u2$f$a;

    new-instance v0, Lno/u2$f$a;

    const-string v1, "CheckCameraPermissions"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lno/u2$f$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lno/u2$f$a;->b:Lno/u2$f$a;

    new-instance v0, Lno/u2$f$a;

    const-string v1, "CameraRunning"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lno/u2$f$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lno/u2$f$a;->c:Lno/u2$f$a;

    new-instance v0, Lno/u2$f$a;

    const-string v1, "SelectFileFromDocuments"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lno/u2$f$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lno/u2$f$a;->d:Lno/u2$f$a;

    new-instance v0, Lno/u2$f$a;

    const-string v1, "SelectImageFromPhotoLibrary"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lno/u2$f$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lno/u2$f$a;->e:Lno/u2$f$a;

    invoke-static {}, Lno/u2$f$a;->a()[Lno/u2$f$a;

    move-result-object v0

    sput-object v0, Lno/u2$f$a;->f:[Lno/u2$f$a;

    invoke-static {v0}, Lhu/b;->a([Ljava/lang/Enum;)Lhu/a;

    move-result-object v0

    sput-object v0, Lno/u2$f$a;->g:Lhu/a;

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

.method public static final synthetic a()[Lno/u2$f$a;
    .locals 5

    sget-object v0, Lno/u2$f$a;->a:Lno/u2$f$a;

    sget-object v1, Lno/u2$f$a;->b:Lno/u2$f$a;

    sget-object v2, Lno/u2$f$a;->c:Lno/u2$f$a;

    sget-object v3, Lno/u2$f$a;->d:Lno/u2$f$a;

    sget-object v4, Lno/u2$f$a;->e:Lno/u2$f$a;

    filled-new-array {v0, v1, v2, v3, v4}, [Lno/u2$f$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lno/u2$f$a;
    .locals 1

    const-class v0, Lno/u2$f$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lno/u2$f$a;

    return-object p0
.end method

.method public static values()[Lno/u2$f$a;
    .locals 1

    sget-object v0, Lno/u2$f$a;->f:[Lno/u2$f$a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lno/u2$f$a;

    return-object v0
.end method
