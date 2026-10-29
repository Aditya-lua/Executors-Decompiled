.class public final enum Lf1/r0$l;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf1/r0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "l"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lf1/r0$l;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lf1/r0$l;

.field public static final enum b:Lf1/r0$l;

.field public static final enum c:Lf1/r0$l;

.field public static final enum d:Lf1/r0$l;

.field public static final enum e:Lf1/r0$l;

.field public static final enum f:Lf1/r0$l;

.field public static final enum g:Lf1/r0$l;

.field public static final enum h:Lf1/r0$l;

.field public static final enum i:Lf1/r0$l;

.field public static final synthetic j:[Lf1/r0$l;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lf1/r0$l;

    const-string v1, "CONFIGURING"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lf1/r0$l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf1/r0$l;->a:Lf1/r0$l;

    new-instance v0, Lf1/r0$l;

    const-string v1, "PENDING_RECORDING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lf1/r0$l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf1/r0$l;->b:Lf1/r0$l;

    new-instance v0, Lf1/r0$l;

    const-string v1, "PENDING_PAUSED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lf1/r0$l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf1/r0$l;->c:Lf1/r0$l;

    new-instance v0, Lf1/r0$l;

    const-string v1, "IDLING"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lf1/r0$l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf1/r0$l;->d:Lf1/r0$l;

    new-instance v0, Lf1/r0$l;

    const-string v1, "RECORDING"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lf1/r0$l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf1/r0$l;->e:Lf1/r0$l;

    new-instance v0, Lf1/r0$l;

    const-string v1, "PAUSED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lf1/r0$l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf1/r0$l;->f:Lf1/r0$l;

    new-instance v0, Lf1/r0$l;

    const-string v1, "STOPPING"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lf1/r0$l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf1/r0$l;->g:Lf1/r0$l;

    new-instance v0, Lf1/r0$l;

    const-string v1, "RESETTING"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lf1/r0$l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf1/r0$l;->h:Lf1/r0$l;

    new-instance v0, Lf1/r0$l;

    const-string v1, "ERROR"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lf1/r0$l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf1/r0$l;->i:Lf1/r0$l;

    invoke-static {}, Lf1/r0$l;->a()[Lf1/r0$l;

    move-result-object v0

    sput-object v0, Lf1/r0$l;->j:[Lf1/r0$l;

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

.method public static synthetic a()[Lf1/r0$l;
    .locals 9

    sget-object v0, Lf1/r0$l;->a:Lf1/r0$l;

    sget-object v1, Lf1/r0$l;->b:Lf1/r0$l;

    sget-object v2, Lf1/r0$l;->c:Lf1/r0$l;

    sget-object v3, Lf1/r0$l;->d:Lf1/r0$l;

    sget-object v4, Lf1/r0$l;->e:Lf1/r0$l;

    sget-object v5, Lf1/r0$l;->f:Lf1/r0$l;

    sget-object v6, Lf1/r0$l;->g:Lf1/r0$l;

    sget-object v7, Lf1/r0$l;->h:Lf1/r0$l;

    sget-object v8, Lf1/r0$l;->i:Lf1/r0$l;

    filled-new-array/range {v0 .. v8}, [Lf1/r0$l;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lf1/r0$l;
    .locals 1

    const-class v0, Lf1/r0$l;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lf1/r0$l;

    return-object p0
.end method

.method public static values()[Lf1/r0$l;
    .locals 1

    sget-object v0, Lf1/r0$l;->j:[Lf1/r0$l;

    invoke-virtual {v0}, [Lf1/r0$l;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lf1/r0$l;

    return-object v0
.end method
