.class public final enum Le8/c$b;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Luf/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le8/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Le8/c$b;",
        ">;",
        "Luf/c;"
    }
.end annotation


# static fields
.field public static final enum b:Le8/c$b;

.field public static final enum c:Le8/c$b;

.field public static final enum d:Le8/c$b;

.field public static final enum e:Le8/c$b;

.field public static final enum f:Le8/c$b;

.field public static final enum g:Le8/c$b;

.field public static final enum h:Le8/c$b;

.field public static final synthetic i:[Le8/c$b;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Le8/c$b;

    const-string v1, "REASON_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Le8/c$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Le8/c$b;->b:Le8/c$b;

    new-instance v1, Le8/c$b;

    const-string v2, "MESSAGE_TOO_OLD"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Le8/c$b;-><init>(Ljava/lang/String;II)V

    sput-object v1, Le8/c$b;->c:Le8/c$b;

    new-instance v2, Le8/c$b;

    const-string v3, "CACHE_FULL"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Le8/c$b;-><init>(Ljava/lang/String;II)V

    sput-object v2, Le8/c$b;->d:Le8/c$b;

    new-instance v3, Le8/c$b;

    const-string v4, "PAYLOAD_TOO_BIG"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5}, Le8/c$b;-><init>(Ljava/lang/String;II)V

    sput-object v3, Le8/c$b;->e:Le8/c$b;

    new-instance v4, Le8/c$b;

    const-string v5, "MAX_RETRIES_REACHED"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6, v6}, Le8/c$b;-><init>(Ljava/lang/String;II)V

    sput-object v4, Le8/c$b;->f:Le8/c$b;

    new-instance v5, Le8/c$b;

    const-string v6, "INVALID_PAYLOD"

    const/4 v7, 0x5

    invoke-direct {v5, v6, v7, v7}, Le8/c$b;-><init>(Ljava/lang/String;II)V

    sput-object v5, Le8/c$b;->g:Le8/c$b;

    new-instance v6, Le8/c$b;

    const-string v7, "SERVER_ERROR"

    const/4 v8, 0x6

    invoke-direct {v6, v7, v8, v8}, Le8/c$b;-><init>(Ljava/lang/String;II)V

    sput-object v6, Le8/c$b;->h:Le8/c$b;

    filled-new-array/range {v0 .. v6}, [Le8/c$b;

    move-result-object v0

    sput-object v0, Le8/c$b;->i:[Le8/c$b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Le8/c$b;->a:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Le8/c$b;
    .locals 1

    const-class v0, Le8/c$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Le8/c$b;

    return-object p0
.end method

.method public static values()[Le8/c$b;
    .locals 1

    sget-object v0, Le8/c$b;->i:[Le8/c$b;

    invoke-virtual {v0}, [Le8/c$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Le8/c$b;

    return-object v0
.end method


# virtual methods
.method public getNumber()I
    .locals 1

    iget v0, p0, Le8/c$b;->a:I

    return v0
.end method
