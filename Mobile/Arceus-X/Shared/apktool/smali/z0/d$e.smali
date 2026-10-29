.class public final enum Lz0/d$e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz0/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lz0/d$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lz0/d$e;

.field public static final enum b:Lz0/d$e;

.field public static final enum c:Lz0/d$e;

.field public static final synthetic d:[Lz0/d$e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lz0/d$e;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lz0/d$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz0/d$e;->a:Lz0/d$e;

    new-instance v0, Lz0/d$e;

    const-string v1, "DEFAULT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lz0/d$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz0/d$e;->b:Lz0/d$e;

    new-instance v0, Lz0/d$e;

    const-string v1, "YUV"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lz0/d$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lz0/d$e;->c:Lz0/d$e;

    invoke-static {}, Lz0/d$e;->a()[Lz0/d$e;

    move-result-object v0

    sput-object v0, Lz0/d$e;->d:[Lz0/d$e;

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

.method public static synthetic a()[Lz0/d$e;
    .locals 3

    sget-object v0, Lz0/d$e;->a:Lz0/d$e;

    sget-object v1, Lz0/d$e;->b:Lz0/d$e;

    sget-object v2, Lz0/d$e;->c:Lz0/d$e;

    filled-new-array {v0, v1, v2}, [Lz0/d$e;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lz0/d$e;
    .locals 1

    const-class v0, Lz0/d$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lz0/d$e;

    return-object p0
.end method

.method public static values()[Lz0/d$e;
    .locals 1

    sget-object v0, Lz0/d$e;->d:[Lz0/d$e;

    invoke-virtual {v0}, [Lz0/d$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lz0/d$e;

    return-object v0
.end method
