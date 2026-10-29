.class public final enum Ln0/a0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ln0/a0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Ln0/a0;

.field public static final enum b:Ln0/a0;

.field public static final enum c:Ln0/a0;

.field public static final enum d:Ln0/a0;

.field public static final enum e:Ln0/a0;

.field public static final enum f:Ln0/a0;

.field public static final enum g:Ln0/a0;

.field public static final synthetic h:[Ln0/a0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ln0/a0;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ln0/a0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/a0;->a:Ln0/a0;

    new-instance v0, Ln0/a0;

    const-string v1, "INACTIVE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ln0/a0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/a0;->b:Ln0/a0;

    new-instance v0, Ln0/a0;

    const-string v1, "SCANNING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ln0/a0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/a0;->c:Ln0/a0;

    new-instance v0, Ln0/a0;

    const-string v1, "PASSIVE_FOCUSED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ln0/a0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/a0;->d:Ln0/a0;

    new-instance v0, Ln0/a0;

    const-string v1, "PASSIVE_NOT_FOCUSED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ln0/a0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/a0;->e:Ln0/a0;

    new-instance v0, Ln0/a0;

    const-string v1, "LOCKED_FOCUSED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Ln0/a0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/a0;->f:Ln0/a0;

    new-instance v0, Ln0/a0;

    const-string v1, "LOCKED_NOT_FOCUSED"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Ln0/a0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/a0;->g:Ln0/a0;

    invoke-static {}, Ln0/a0;->a()[Ln0/a0;

    move-result-object v0

    sput-object v0, Ln0/a0;->h:[Ln0/a0;

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

.method public static synthetic a()[Ln0/a0;
    .locals 7

    sget-object v0, Ln0/a0;->a:Ln0/a0;

    sget-object v1, Ln0/a0;->b:Ln0/a0;

    sget-object v2, Ln0/a0;->c:Ln0/a0;

    sget-object v3, Ln0/a0;->d:Ln0/a0;

    sget-object v4, Ln0/a0;->e:Ln0/a0;

    sget-object v5, Ln0/a0;->f:Ln0/a0;

    sget-object v6, Ln0/a0;->g:Ln0/a0;

    filled-new-array/range {v0 .. v6}, [Ln0/a0;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ln0/a0;
    .locals 1

    const-class v0, Ln0/a0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln0/a0;

    return-object p0
.end method

.method public static values()[Ln0/a0;
    .locals 1

    sget-object v0, Ln0/a0;->h:[Ln0/a0;

    invoke-virtual {v0}, [Ln0/a0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln0/a0;

    return-object v0
.end method
