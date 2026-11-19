.class public final enum Lm1/i0$f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm1/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lm1/i0$f;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lm1/i0$f;

.field public static final enum b:Lm1/i0$f;

.field public static final enum c:Lm1/i0$f;

.field public static final enum d:Lm1/i0$f;

.field public static final enum e:Lm1/i0$f;

.field public static final enum f:Lm1/i0$f;

.field public static final enum g:Lm1/i0$f;

.field public static final enum h:Lm1/i0$f;

.field public static final enum i:Lm1/i0$f;

.field public static final synthetic j:[Lm1/i0$f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lm1/i0$f;

    const-string v1, "CONFIGURED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lm1/i0$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm1/i0$f;->a:Lm1/i0$f;

    new-instance v0, Lm1/i0$f;

    const-string v1, "STARTED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lm1/i0$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm1/i0$f;->b:Lm1/i0$f;

    new-instance v0, Lm1/i0$f;

    const-string v1, "PAUSED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lm1/i0$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm1/i0$f;->c:Lm1/i0$f;

    new-instance v0, Lm1/i0$f;

    const-string v1, "STOPPING"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lm1/i0$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm1/i0$f;->d:Lm1/i0$f;

    new-instance v0, Lm1/i0$f;

    const-string v1, "PENDING_START"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lm1/i0$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm1/i0$f;->e:Lm1/i0$f;

    new-instance v0, Lm1/i0$f;

    const-string v1, "PENDING_START_PAUSED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lm1/i0$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm1/i0$f;->f:Lm1/i0$f;

    new-instance v0, Lm1/i0$f;

    const-string v1, "PENDING_RELEASE"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lm1/i0$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm1/i0$f;->g:Lm1/i0$f;

    new-instance v0, Lm1/i0$f;

    const-string v1, "ERROR"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lm1/i0$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm1/i0$f;->h:Lm1/i0$f;

    new-instance v0, Lm1/i0$f;

    const-string v1, "RELEASED"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lm1/i0$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lm1/i0$f;->i:Lm1/i0$f;

    invoke-static {}, Lm1/i0$f;->a()[Lm1/i0$f;

    move-result-object v0

    sput-object v0, Lm1/i0$f;->j:[Lm1/i0$f;

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

.method public static synthetic a()[Lm1/i0$f;
    .locals 9

    sget-object v0, Lm1/i0$f;->a:Lm1/i0$f;

    sget-object v1, Lm1/i0$f;->b:Lm1/i0$f;

    sget-object v2, Lm1/i0$f;->c:Lm1/i0$f;

    sget-object v3, Lm1/i0$f;->d:Lm1/i0$f;

    sget-object v4, Lm1/i0$f;->e:Lm1/i0$f;

    sget-object v5, Lm1/i0$f;->f:Lm1/i0$f;

    sget-object v6, Lm1/i0$f;->g:Lm1/i0$f;

    sget-object v7, Lm1/i0$f;->h:Lm1/i0$f;

    sget-object v8, Lm1/i0$f;->i:Lm1/i0$f;

    filled-new-array/range {v0 .. v8}, [Lm1/i0$f;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lm1/i0$f;
    .locals 1

    const-class v0, Lm1/i0$f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lm1/i0$f;

    return-object p0
.end method

.method public static values()[Lm1/i0$f;
    .locals 1

    sget-object v0, Lm1/i0$f;->j:[Lm1/i0$f;

    invoke-virtual {v0}, [Lm1/i0$f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lm1/i0$f;

    return-object v0
.end method
