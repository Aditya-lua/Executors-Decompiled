.class public final enum Lfj/m$o;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfj/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "o"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lfj/m$o;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lfj/m$o;

.field public static final enum b:Lfj/m$o;

.field public static final enum c:Lfj/m$o;

.field public static final synthetic d:[Lfj/m$o;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lfj/m$o;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lfj/m$o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfj/m$o;->a:Lfj/m$o;

    new-instance v0, Lfj/m$o;

    const-string v1, "CONNECTING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lfj/m$o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfj/m$o;->b:Lfj/m$o;

    new-instance v0, Lfj/m$o;

    const-string v1, "READY"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lfj/m$o;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfj/m$o;->c:Lfj/m$o;

    invoke-static {}, Lfj/m$o;->a()[Lfj/m$o;

    move-result-object v0

    sput-object v0, Lfj/m$o;->d:[Lfj/m$o;

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

.method public static synthetic a()[Lfj/m$o;
    .locals 3

    sget-object v0, Lfj/m$o;->a:Lfj/m$o;

    sget-object v1, Lfj/m$o;->b:Lfj/m$o;

    sget-object v2, Lfj/m$o;->c:Lfj/m$o;

    filled-new-array {v0, v1, v2}, [Lfj/m$o;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lfj/m$o;
    .locals 1

    const-class v0, Lfj/m$o;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lfj/m$o;

    return-object p0
.end method

.method public static values()[Lfj/m$o;
    .locals 1

    sget-object v0, Lfj/m$o;->d:[Lfj/m$o;

    invoke-virtual {v0}, [Lfj/m$o;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lfj/m$o;

    return-object v0
.end method
