.class public final enum Lej/m$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lej/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lej/m$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lej/m$b;

.field public static final enum b:Lej/m$b;

.field public static final enum c:Lej/m$b;

.field public static final enum d:Lej/m$b;

.field public static final enum e:Lej/m$b;

.field public static final synthetic f:[Lej/m$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lej/m$b;

    const-string v1, "OK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lej/m$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lej/m$b;->a:Lej/m$b;

    new-instance v0, Lej/m$b;

    const-string v1, "ERROR"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lej/m$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lej/m$b;->b:Lej/m$b;

    new-instance v0, Lej/m$b;

    const-string v1, "BOGUS"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lej/m$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lej/m$b;->c:Lej/m$b;

    new-instance v0, Lej/m$b;

    const-string v1, "EMPTY_RESPONSE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lej/m$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lej/m$b;->d:Lej/m$b;

    new-instance v0, Lej/m$b;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lej/m$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lej/m$b;->e:Lej/m$b;

    invoke-static {}, Lej/m$b;->a()[Lej/m$b;

    move-result-object v0

    sput-object v0, Lej/m$b;->f:[Lej/m$b;

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

.method public static synthetic a()[Lej/m$b;
    .locals 5

    sget-object v0, Lej/m$b;->a:Lej/m$b;

    sget-object v1, Lej/m$b;->b:Lej/m$b;

    sget-object v2, Lej/m$b;->c:Lej/m$b;

    sget-object v3, Lej/m$b;->d:Lej/m$b;

    sget-object v4, Lej/m$b;->e:Lej/m$b;

    filled-new-array {v0, v1, v2, v3, v4}, [Lej/m$b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lej/m$b;
    .locals 1

    const-class v0, Lej/m$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lej/m$b;

    return-object p0
.end method

.method public static values()[Lej/m$b;
    .locals 1

    sget-object v0, Lej/m$b;->f:[Lej/m$b;

    invoke-virtual {v0}, [Lej/m$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lej/m$b;

    return-object v0
.end method
