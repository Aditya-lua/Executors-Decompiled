.class public final enum Lnb/ya;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum b:Lnb/ya;

.field public static final enum c:Lnb/ya;

.field public static final enum d:Lnb/ya;

.field public static final enum e:Lnb/ya;

.field public static final synthetic f:[Lnb/ya;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lnb/ya;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lnb/ya;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lnb/ya;->b:Lnb/ya;

    new-instance v1, Lnb/ya;

    const-string v2, "SUCCESS"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lnb/ya;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lnb/ya;->c:Lnb/ya;

    new-instance v2, Lnb/ya;

    const-string v3, "FAILURE"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Lnb/ya;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lnb/ya;->d:Lnb/ya;

    new-instance v3, Lnb/ya;

    const-string v4, "BACKOFF"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5}, Lnb/ya;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lnb/ya;->e:Lnb/ya;

    filled-new-array {v0, v1, v2, v3}, [Lnb/ya;

    move-result-object v0

    sput-object v0, Lnb/ya;->f:[Lnb/ya;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lnb/ya;->a:I

    return-void
.end method

.method public static values()[Lnb/ya;
    .locals 1

    sget-object v0, Lnb/ya;->f:[Lnb/ya;

    invoke-virtual {v0}, [Lnb/ya;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnb/ya;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, Lnb/ya;->a:I

    return v0
.end method
