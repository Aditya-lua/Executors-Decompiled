.class public final enum Lob/db;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum b:Lob/db;

.field public static final enum c:Lob/db;

.field public static final enum d:Lob/db;

.field public static final enum e:Lob/db;

.field public static final synthetic f:[Lob/db;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lob/db;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lob/db;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lob/db;->b:Lob/db;

    new-instance v1, Lob/db;

    const-string v2, "SUCCESS"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lob/db;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lob/db;->c:Lob/db;

    new-instance v2, Lob/db;

    const-string v3, "FAILURE"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Lob/db;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lob/db;->d:Lob/db;

    new-instance v3, Lob/db;

    const-string v4, "BACKOFF"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5}, Lob/db;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lob/db;->e:Lob/db;

    filled-new-array {v0, v1, v2, v3}, [Lob/db;

    move-result-object v0

    sput-object v0, Lob/db;->f:[Lob/db;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lob/db;->a:I

    return-void
.end method

.method public static values()[Lob/db;
    .locals 1

    sget-object v0, Lob/db;->f:[Lob/db;

    invoke-virtual {v0}, [Lob/db;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lob/db;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, Lob/db;->a:I

    return v0
.end method
