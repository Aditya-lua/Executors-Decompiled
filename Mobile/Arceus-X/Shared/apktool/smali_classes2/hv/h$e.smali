.class public final enum Lhv/h$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhv/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhv/h$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lhv/h$e;

.field public static final enum b:Lhv/h$e;

.field public static final enum c:Lhv/h$e;

.field public static final enum d:Lhv/h$e;

.field public static final enum e:Lhv/h$e;

.field public static final enum f:Lhv/h$e;

.field public static final synthetic g:[Lhv/h$e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lhv/h$e;

    const-string v1, "UNINITIALIZED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lhv/h$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhv/h$e;->a:Lhv/h$e;

    new-instance v0, Lhv/h$e;

    const-string v1, "HEADSET_UNAVAILABLE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lhv/h$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhv/h$e;->b:Lhv/h$e;

    new-instance v0, Lhv/h$e;

    const-string v1, "HEADSET_AVAILABLE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lhv/h$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhv/h$e;->c:Lhv/h$e;

    new-instance v0, Lhv/h$e;

    const-string v1, "SCO_DISCONNECTING"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lhv/h$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhv/h$e;->d:Lhv/h$e;

    new-instance v0, Lhv/h$e;

    const-string v1, "SCO_CONNECTING"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lhv/h$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhv/h$e;->e:Lhv/h$e;

    new-instance v0, Lhv/h$e;

    const-string v1, "SCO_CONNECTED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lhv/h$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhv/h$e;->f:Lhv/h$e;

    invoke-static {}, Lhv/h$e;->a()[Lhv/h$e;

    move-result-object v0

    sput-object v0, Lhv/h$e;->g:[Lhv/h$e;

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

.method public static synthetic a()[Lhv/h$e;
    .locals 6

    sget-object v0, Lhv/h$e;->a:Lhv/h$e;

    sget-object v1, Lhv/h$e;->b:Lhv/h$e;

    sget-object v2, Lhv/h$e;->c:Lhv/h$e;

    sget-object v3, Lhv/h$e;->d:Lhv/h$e;

    sget-object v4, Lhv/h$e;->e:Lhv/h$e;

    sget-object v5, Lhv/h$e;->f:Lhv/h$e;

    filled-new-array/range {v0 .. v5}, [Lhv/h$e;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lhv/h$e;
    .locals 1

    const-class v0, Lhv/h$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhv/h$e;

    return-object p0
.end method

.method public static values()[Lhv/h$e;
    .locals 1

    sget-object v0, Lhv/h$e;->g:[Lhv/h$e;

    invoke-virtual {v0}, [Lhv/h$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhv/h$e;

    return-object v0
.end method
