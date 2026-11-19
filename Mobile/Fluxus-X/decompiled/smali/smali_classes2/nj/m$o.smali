.class public final enum Lnj/m$o;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnj/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "o"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnj/m$o;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lnj/m$o;

.field public static final enum b:Lnj/m$o;

.field public static final enum c:Lnj/m$o;

.field public static final synthetic d:[Lnj/m$o;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lnj/m$o;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lnj/m$o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnj/m$o;->a:Lnj/m$o;

    new-instance v0, Lnj/m$o;

    const-string v1, "CONNECTING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lnj/m$o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnj/m$o;->b:Lnj/m$o;

    new-instance v0, Lnj/m$o;

    const-string v1, "READY"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lnj/m$o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lnj/m$o;->c:Lnj/m$o;

    invoke-static {}, Lnj/m$o;->a()[Lnj/m$o;

    move-result-object v0

    sput-object v0, Lnj/m$o;->d:[Lnj/m$o;

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

.method public static synthetic a()[Lnj/m$o;
    .locals 3

    sget-object v0, Lnj/m$o;->a:Lnj/m$o;

    sget-object v1, Lnj/m$o;->b:Lnj/m$o;

    sget-object v2, Lnj/m$o;->c:Lnj/m$o;

    filled-new-array {v0, v1, v2}, [Lnj/m$o;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lnj/m$o;
    .locals 1

    const-class v0, Lnj/m$o;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnj/m$o;

    return-object p0
.end method

.method public static values()[Lnj/m$o;
    .locals 1

    sget-object v0, Lnj/m$o;->d:[Lnj/m$o;

    invoke-virtual {v0}, [Lnj/m$o;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnj/m$o;

    return-object v0
.end method
