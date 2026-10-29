.class public final enum Lnb/l;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum b:Lnb/l;

.field public static final enum c:Lnb/l;

.field public static final enum d:Lnb/l;

.field public static final enum e:Lnb/l;

.field public static final enum f:Lnb/l;

.field public static final enum g:Lnb/l;

.field public static final enum h:Lnb/l;

.field public static final enum i:Lnb/l;

.field public static final enum j:Lnb/l;

.field public static final enum k:Lnb/l;

.field public static final synthetic l:[Lnb/l;


# instance fields
.field public final a:C


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Lnb/l;

    const/4 v1, 0x0

    const/16 v2, 0x30

    const-string v3, "UNSET"

    invoke-direct {v0, v3, v1, v2}, Lnb/l;-><init>(Ljava/lang/String;IC)V

    sput-object v0, Lnb/l;->b:Lnb/l;

    new-instance v1, Lnb/l;

    const/4 v2, 0x1

    const/16 v3, 0x31

    const-string v4, "REMOTE_DEFAULT"

    invoke-direct {v1, v4, v2, v3}, Lnb/l;-><init>(Ljava/lang/String;IC)V

    sput-object v1, Lnb/l;->c:Lnb/l;

    new-instance v2, Lnb/l;

    const/4 v3, 0x2

    const/16 v4, 0x32

    const-string v5, "REMOTE_DELEGATION"

    invoke-direct {v2, v5, v3, v4}, Lnb/l;-><init>(Ljava/lang/String;IC)V

    sput-object v2, Lnb/l;->d:Lnb/l;

    new-instance v3, Lnb/l;

    const/4 v4, 0x3

    const/16 v5, 0x33

    const-string v6, "MANIFEST"

    invoke-direct {v3, v6, v4, v5}, Lnb/l;-><init>(Ljava/lang/String;IC)V

    sput-object v3, Lnb/l;->e:Lnb/l;

    new-instance v4, Lnb/l;

    const/4 v5, 0x4

    const/16 v6, 0x34

    const-string v7, "INITIALIZATION"

    invoke-direct {v4, v7, v5, v6}, Lnb/l;-><init>(Ljava/lang/String;IC)V

    sput-object v4, Lnb/l;->f:Lnb/l;

    new-instance v5, Lnb/l;

    const/4 v6, 0x5

    const/16 v7, 0x35

    const-string v8, "API"

    invoke-direct {v5, v8, v6, v7}, Lnb/l;-><init>(Ljava/lang/String;IC)V

    sput-object v5, Lnb/l;->g:Lnb/l;

    new-instance v6, Lnb/l;

    const/4 v7, 0x6

    const/16 v8, 0x36

    const-string v9, "CHILD_ACCOUNT"

    invoke-direct {v6, v9, v7, v8}, Lnb/l;-><init>(Ljava/lang/String;IC)V

    sput-object v6, Lnb/l;->h:Lnb/l;

    new-instance v7, Lnb/l;

    const/4 v8, 0x7

    const/16 v9, 0x37

    const-string v10, "TCF"

    invoke-direct {v7, v10, v8, v9}, Lnb/l;-><init>(Ljava/lang/String;IC)V

    sput-object v7, Lnb/l;->i:Lnb/l;

    new-instance v8, Lnb/l;

    const/16 v9, 0x8

    const/16 v10, 0x38

    const-string v11, "REMOTE_ENFORCED_DEFAULT"

    invoke-direct {v8, v11, v9, v10}, Lnb/l;-><init>(Ljava/lang/String;IC)V

    sput-object v8, Lnb/l;->j:Lnb/l;

    new-instance v9, Lnb/l;

    const/16 v10, 0x9

    const/16 v11, 0x39

    const-string v12, "FAILSAFE"

    invoke-direct {v9, v12, v10, v11}, Lnb/l;-><init>(Ljava/lang/String;IC)V

    sput-object v9, Lnb/l;->k:Lnb/l;

    filled-new-array/range {v0 .. v9}, [Lnb/l;

    move-result-object v0

    sput-object v0, Lnb/l;->l:[Lnb/l;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IC)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-char p3, p0, Lnb/l;->a:C

    return-void
.end method

.method public static a(C)Lnb/l;
    .locals 5

    invoke-static {}, Lnb/l;->values()[Lnb/l;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    iget-char v4, v3, Lnb/l;->a:C

    if-ne v4, p0, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    sget-object p0, Lnb/l;->b:Lnb/l;

    return-object p0
.end method

.method public static values()[Lnb/l;
    .locals 1

    sget-object v0, Lnb/l;->l:[Lnb/l;

    invoke-virtual {v0}, [Lnb/l;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnb/l;

    return-object v0
.end method


# virtual methods
.method public final synthetic b()C
    .locals 1

    iget-char v0, p0, Lnb/l;->a:C

    return v0
.end method
