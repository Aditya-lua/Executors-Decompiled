.class public final enum Lj8/f$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lj8/f$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lj8/f$c;

.field public static final enum b:Lj8/f$c;

.field public static final enum c:Lj8/f$c;

.field public static final synthetic d:[Lj8/f$c;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lj8/f$c;

    const-string v1, "NETWORK_UNMETERED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lj8/f$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lj8/f$c;->a:Lj8/f$c;

    new-instance v1, Lj8/f$c;

    const-string v2, "DEVICE_IDLE"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lj8/f$c;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lj8/f$c;->b:Lj8/f$c;

    new-instance v2, Lj8/f$c;

    const-string v3, "DEVICE_CHARGING"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lj8/f$c;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lj8/f$c;->c:Lj8/f$c;

    filled-new-array {v0, v1, v2}, [Lj8/f$c;

    move-result-object v0

    sput-object v0, Lj8/f$c;->d:[Lj8/f$c;

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

.method public static valueOf(Ljava/lang/String;)Lj8/f$c;
    .locals 1

    const-class v0, Lj8/f$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lj8/f$c;

    return-object p0
.end method

.method public static values()[Lj8/f$c;
    .locals 1

    sget-object v0, Lj8/f$c;->d:[Lj8/f$c;

    invoke-virtual {v0}, [Lj8/f$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lj8/f$c;

    return-object v0
.end method
