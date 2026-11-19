.class public final enum Llj/i$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llj/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Llj/i$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Llj/i$a;

.field public static final enum b:Llj/i$a;

.field public static final synthetic c:[Llj/i$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Llj/i$a;

    const-string v1, "GET"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Llj/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llj/i$a;->a:Llj/i$a;

    new-instance v0, Llj/i$a;

    const-string v1, "POST"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Llj/i$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llj/i$a;->b:Llj/i$a;

    invoke-static {}, Llj/i$a;->a()[Llj/i$a;

    move-result-object v0

    sput-object v0, Llj/i$a;->c:[Llj/i$a;

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

.method public static synthetic a()[Llj/i$a;
    .locals 2

    sget-object v0, Llj/i$a;->a:Llj/i$a;

    sget-object v1, Llj/i$a;->b:Llj/i$a;

    filled-new-array {v0, v1}, [Llj/i$a;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Llj/i$a;
    .locals 1

    const-class v0, Llj/i$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Llj/i$a;

    return-object p0
.end method

.method public static values()[Llj/i$a;
    .locals 1

    sget-object v0, Llj/i$a;->c:[Llj/i$a;

    invoke-virtual {v0}, [Llj/i$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llj/i$a;

    return-object v0
.end method
