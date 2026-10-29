.class public final enum Lnb/za;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum b:Lnb/za;

.field public static final enum c:Lnb/za;

.field public static final enum d:Lnb/za;

.field public static final enum e:Lnb/za;

.field public static final enum f:Lnb/za;

.field public static final enum g:Lnb/za;

.field public static final synthetic h:[Lnb/za;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lnb/za;

    const-string v1, "GOOGLE_ANALYTICS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lnb/za;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lnb/za;->b:Lnb/za;

    new-instance v1, Lnb/za;

    const-string v2, "GOOGLE_SIGNAL"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3, v3}, Lnb/za;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lnb/za;->c:Lnb/za;

    new-instance v2, Lnb/za;

    const-string v3, "SGTM"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4, v4}, Lnb/za;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lnb/za;->d:Lnb/za;

    new-instance v3, Lnb/za;

    const-string v4, "SGTM_CLIENT"

    const/4 v5, 0x3

    invoke-direct {v3, v4, v5, v5}, Lnb/za;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lnb/za;->e:Lnb/za;

    new-instance v4, Lnb/za;

    const-string v5, "GOOGLE_SIGNAL_PENDING"

    const/4 v6, 0x4

    invoke-direct {v4, v5, v6, v6}, Lnb/za;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lnb/za;->f:Lnb/za;

    new-instance v5, Lnb/za;

    const/4 v6, 0x5

    const/16 v7, 0x63

    const-string v8, "UNKNOWN"

    invoke-direct {v5, v8, v6, v7}, Lnb/za;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lnb/za;->g:Lnb/za;

    filled-new-array/range {v0 .. v5}, [Lnb/za;

    move-result-object v0

    sput-object v0, Lnb/za;->h:[Lnb/za;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lnb/za;->a:I

    return-void
.end method

.method public static a(I)Lnb/za;
    .locals 5

    invoke-static {}, Lnb/za;->values()[Lnb/za;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget v4, v3, Lnb/za;->a:I

    if-ne v4, p0, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    sget-object p0, Lnb/za;->g:Lnb/za;

    return-object p0
.end method

.method public static values()[Lnb/za;
    .locals 1

    sget-object v0, Lnb/za;->h:[Lnb/za;

    invoke-virtual {v0}, [Lnb/za;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnb/za;

    return-object v0
.end method


# virtual methods
.method public final zza()I
    .locals 1

    iget v0, p0, Lnb/za;->a:I

    return v0
.end method
