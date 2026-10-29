.class public final enum Lcg/d$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcg/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcg/d$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcg/d$b;

.field public static final enum b:Lcg/d$b;

.field public static final synthetic c:[Lcg/d$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcg/d$b;

    const-string v1, "OK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcg/d$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcg/d$b;->a:Lcg/d$b;

    new-instance v0, Lcg/d$b;

    const-string v1, "BAD_CONFIG"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcg/d$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcg/d$b;->b:Lcg/d$b;

    invoke-static {}, Lcg/d$b;->a()[Lcg/d$b;

    move-result-object v0

    sput-object v0, Lcg/d$b;->c:[Lcg/d$b;

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

.method public static synthetic a()[Lcg/d$b;
    .locals 2

    sget-object v0, Lcg/d$b;->a:Lcg/d$b;

    sget-object v1, Lcg/d$b;->b:Lcg/d$b;

    filled-new-array {v0, v1}, [Lcg/d$b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcg/d$b;
    .locals 1

    const-class v0, Lcg/d$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcg/d$b;

    return-object p0
.end method

.method public static values()[Lcg/d$b;
    .locals 1

    sget-object v0, Lcg/d$b;->c:[Lcg/d$b;

    invoke-virtual {v0}, [Lcg/d$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcg/d$b;

    return-object v0
.end method
