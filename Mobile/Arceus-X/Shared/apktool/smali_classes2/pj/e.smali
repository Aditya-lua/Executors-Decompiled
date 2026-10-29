.class public final enum Lpj/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lpj/e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lpj/e;

.field public static final enum b:Lpj/e;

.field public static final enum c:Lpj/e;

.field public static final synthetic d:[Lpj/e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lpj/e;

    const-string v1, "none"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lpj/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpj/e;->a:Lpj/e;

    new-instance v0, Lpj/e;

    const-string v1, "user"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lpj/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpj/e;->b:Lpj/e;

    new-instance v0, Lpj/e;

    const-string v1, "game"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lpj/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpj/e;->c:Lpj/e;

    invoke-static {}, Lpj/e;->a()[Lpj/e;

    move-result-object v0

    sput-object v0, Lpj/e;->d:[Lpj/e;

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

.method public static synthetic a()[Lpj/e;
    .locals 3

    sget-object v0, Lpj/e;->a:Lpj/e;

    sget-object v1, Lpj/e;->b:Lpj/e;

    sget-object v2, Lpj/e;->c:Lpj/e;

    filled-new-array {v0, v1, v2}, [Lpj/e;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lpj/e;
    .locals 1

    const-class v0, Lpj/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lpj/e;

    return-object p0
.end method

.method public static values()[Lpj/e;
    .locals 1

    sget-object v0, Lpj/e;->d:[Lpj/e;

    invoke-virtual {v0}, [Lpj/e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lpj/e;

    return-object v0
.end method
