.class public final enum Lpw/h$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpw/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lpw/h$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lpw/h$e;

.field public static final enum b:Lpw/h$e;

.field public static final enum c:Lpw/h$e;

.field public static final enum d:Lpw/h$e;

.field public static final enum e:Lpw/h$e;

.field public static final enum f:Lpw/h$e;

.field public static final synthetic g:[Lpw/h$e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lpw/h$e;

    const-string v1, "UNINITIALIZED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lpw/h$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpw/h$e;->a:Lpw/h$e;

    new-instance v0, Lpw/h$e;

    const-string v1, "HEADSET_UNAVAILABLE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lpw/h$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpw/h$e;->b:Lpw/h$e;

    new-instance v0, Lpw/h$e;

    const-string v1, "HEADSET_AVAILABLE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lpw/h$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpw/h$e;->c:Lpw/h$e;

    new-instance v0, Lpw/h$e;

    const-string v1, "SCO_DISCONNECTING"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lpw/h$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpw/h$e;->d:Lpw/h$e;

    new-instance v0, Lpw/h$e;

    const-string v1, "SCO_CONNECTING"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lpw/h$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpw/h$e;->e:Lpw/h$e;

    new-instance v0, Lpw/h$e;

    const-string v1, "SCO_CONNECTED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lpw/h$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lpw/h$e;->f:Lpw/h$e;

    invoke-static {}, Lpw/h$e;->a()[Lpw/h$e;

    move-result-object v0

    sput-object v0, Lpw/h$e;->g:[Lpw/h$e;

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

.method public static synthetic a()[Lpw/h$e;
    .locals 6

    sget-object v0, Lpw/h$e;->a:Lpw/h$e;

    sget-object v1, Lpw/h$e;->b:Lpw/h$e;

    sget-object v2, Lpw/h$e;->c:Lpw/h$e;

    sget-object v3, Lpw/h$e;->d:Lpw/h$e;

    sget-object v4, Lpw/h$e;->e:Lpw/h$e;

    sget-object v5, Lpw/h$e;->f:Lpw/h$e;

    filled-new-array/range {v0 .. v5}, [Lpw/h$e;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lpw/h$e;
    .locals 1

    const-class v0, Lpw/h$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lpw/h$e;

    return-object p0
.end method

.method public static values()[Lpw/h$e;
    .locals 1

    sget-object v0, Lpw/h$e;->g:[Lpw/h$e;

    invoke-virtual {v0}, [Lpw/h$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lpw/h$e;

    return-object v0
.end method
