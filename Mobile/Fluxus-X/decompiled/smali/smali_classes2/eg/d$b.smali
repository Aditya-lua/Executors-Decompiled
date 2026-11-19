.class public final enum Leg/d$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Leg/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Leg/d$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Leg/d$b;

.field public static final enum b:Leg/d$b;

.field public static final synthetic c:[Leg/d$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Leg/d$b;

    const-string v1, "OK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Leg/d$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Leg/d$b;->a:Leg/d$b;

    new-instance v0, Leg/d$b;

    const-string v1, "BAD_CONFIG"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Leg/d$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Leg/d$b;->b:Leg/d$b;

    invoke-static {}, Leg/d$b;->a()[Leg/d$b;

    move-result-object v0

    sput-object v0, Leg/d$b;->c:[Leg/d$b;

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

.method public static synthetic a()[Leg/d$b;
    .locals 2

    sget-object v0, Leg/d$b;->a:Leg/d$b;

    sget-object v1, Leg/d$b;->b:Leg/d$b;

    filled-new-array {v0, v1}, [Leg/d$b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Leg/d$b;
    .locals 1

    const-class v0, Leg/d$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Leg/d$b;

    return-object p0
.end method

.method public static values()[Leg/d$b;
    .locals 1

    sget-object v0, Leg/d$b;->c:[Leg/d$b;

    invoke-virtual {v0}, [Leg/d$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Leg/d$b;

    return-object v0
.end method
