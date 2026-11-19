.class public final enum Ln0/b0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ln0/b0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Ln0/b0;

.field public static final enum b:Ln0/b0;

.field public static final enum c:Ln0/b0;

.field public static final enum d:Ln0/b0;

.field public static final enum e:Ln0/b0;

.field public static final enum f:Ln0/b0;

.field public static final enum g:Ln0/b0;

.field public static final enum h:Ln0/b0;

.field public static final enum i:Ln0/b0;

.field public static final enum j:Ln0/b0;

.field public static final synthetic k:[Ln0/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ln0/b0;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ln0/b0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/b0;->a:Ln0/b0;

    new-instance v0, Ln0/b0;

    const-string v1, "OFF"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ln0/b0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/b0;->b:Ln0/b0;

    new-instance v0, Ln0/b0;

    const-string v1, "AUTO"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ln0/b0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/b0;->c:Ln0/b0;

    new-instance v0, Ln0/b0;

    const-string v1, "INCANDESCENT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ln0/b0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/b0;->d:Ln0/b0;

    new-instance v0, Ln0/b0;

    const-string v1, "FLUORESCENT"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ln0/b0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/b0;->e:Ln0/b0;

    new-instance v0, Ln0/b0;

    const-string v1, "WARM_FLUORESCENT"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Ln0/b0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/b0;->f:Ln0/b0;

    new-instance v0, Ln0/b0;

    const-string v1, "DAYLIGHT"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Ln0/b0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/b0;->g:Ln0/b0;

    new-instance v0, Ln0/b0;

    const-string v1, "CLOUDY_DAYLIGHT"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Ln0/b0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/b0;->h:Ln0/b0;

    new-instance v0, Ln0/b0;

    const-string v1, "TWILIGHT"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Ln0/b0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/b0;->i:Ln0/b0;

    new-instance v0, Ln0/b0;

    const-string v1, "SHADE"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Ln0/b0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/b0;->j:Ln0/b0;

    invoke-static {}, Ln0/b0;->a()[Ln0/b0;

    move-result-object v0

    sput-object v0, Ln0/b0;->k:[Ln0/b0;

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

.method public static synthetic a()[Ln0/b0;
    .locals 10

    sget-object v0, Ln0/b0;->a:Ln0/b0;

    sget-object v1, Ln0/b0;->b:Ln0/b0;

    sget-object v2, Ln0/b0;->c:Ln0/b0;

    sget-object v3, Ln0/b0;->d:Ln0/b0;

    sget-object v4, Ln0/b0;->e:Ln0/b0;

    sget-object v5, Ln0/b0;->f:Ln0/b0;

    sget-object v6, Ln0/b0;->g:Ln0/b0;

    sget-object v7, Ln0/b0;->h:Ln0/b0;

    sget-object v8, Ln0/b0;->i:Ln0/b0;

    sget-object v9, Ln0/b0;->j:Ln0/b0;

    filled-new-array/range {v0 .. v9}, [Ln0/b0;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ln0/b0;
    .locals 1

    const-class v0, Ln0/b0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln0/b0;

    return-object p0
.end method

.method public static values()[Ln0/b0;
    .locals 1

    sget-object v0, Ln0/b0;->k:[Ln0/b0;

    invoke-virtual {v0}, [Ln0/b0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln0/b0;

    return-object v0
.end method
