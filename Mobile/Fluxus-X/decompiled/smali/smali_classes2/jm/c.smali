.class public final enum Ljm/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ljm/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u000c\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tj\u0002\u0008\u0008j\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Ljm/c;",
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
        "e",
        "f",
        "universalapp_googleProdRelease"
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
.field public static final enum b:Ljm/c;

.field public static final enum c:Ljm/c;

.field public static final enum d:Ljm/c;

.field public static final enum e:Ljm/c;

.field public static final enum f:Ljm/c;

.field public static final synthetic g:[Ljm/c;

.field public static final synthetic h:Lhu/a;


# instance fields
.field public final a:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ljm/c;

    const/4 v1, 0x0

    const-string v2, "ShowCompleted"

    const-string v3, "SHOW_COMPLETED"

    invoke-direct {v0, v3, v1, v2}, Ljm/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ljm/c;->b:Ljm/c;

    new-instance v0, Ljm/c;

    const/4 v1, 0x1

    const-string v2, "ShowInterrupted"

    const-string v3, "SHOW_INTERRUPTED"

    invoke-direct {v0, v3, v1, v2}, Ljm/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ljm/c;->c:Ljm/c;

    new-instance v0, Ljm/c;

    const/4 v1, 0x2

    const-string v2, "AdsNotReady"

    const-string v3, "ADS_NOT_READY"

    invoke-direct {v0, v3, v1, v2}, Ljm/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ljm/c;->d:Ljm/c;

    new-instance v0, Ljm/c;

    const/4 v1, 0x3

    const-string v2, "AdNotReady"

    const-string v3, "AD_NOT_READY"

    invoke-direct {v0, v3, v1, v2}, Ljm/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ljm/c;->e:Ljm/c;

    new-instance v0, Ljm/c;

    const/4 v1, 0x4

    const-string v2, "InternalError"

    const-string v3, "INTERNAL_ERROR"

    invoke-direct {v0, v3, v1, v2}, Ljm/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ljm/c;->f:Ljm/c;

    invoke-static {}, Ljm/c;->a()[Ljm/c;

    move-result-object v0

    sput-object v0, Ljm/c;->g:[Ljm/c;

    invoke-static {v0}, Lhu/b;->a([Ljava/lang/Enum;)Lhu/a;

    move-result-object v0

    sput-object v0, Ljm/c;->h:Lhu/a;

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

    iput-object p3, p0, Ljm/c;->a:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic a()[Ljm/c;
    .locals 5

    sget-object v0, Ljm/c;->b:Ljm/c;

    sget-object v1, Ljm/c;->c:Ljm/c;

    sget-object v2, Ljm/c;->d:Ljm/c;

    sget-object v3, Ljm/c;->e:Ljm/c;

    sget-object v4, Ljm/c;->f:Ljm/c;

    filled-new-array {v0, v1, v2, v3, v4}, [Ljm/c;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ljm/c;
    .locals 1

    const-class v0, Ljm/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljm/c;

    return-object p0
.end method

.method public static values()[Ljm/c;
    .locals 1

    sget-object v0, Ljm/c;->g:[Ljm/c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljm/c;

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Ljm/c;->a:Ljava/lang/String;

    return-object v0
.end method
