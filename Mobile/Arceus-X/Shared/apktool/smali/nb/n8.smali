.class public final enum Lnb/n8;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum b:Lnb/n8;

.field public static final enum c:Lnb/n8;

.field public static final enum d:Lnb/n8;

.field public static final enum e:Lnb/n8;

.field public static final synthetic f:[Lnb/n8;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lnb/n8;

    const-string v1, "UNINITIALIZED"

    const/4 v2, 0x0

    const-string v3, "uninitialized"

    invoke-direct {v0, v1, v2, v3}, Lnb/n8;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lnb/n8;->b:Lnb/n8;

    new-instance v1, Lnb/n8;

    const-string v2, "POLICY"

    const/4 v3, 0x1

    const-string v4, "eu_consent_policy"

    invoke-direct {v1, v2, v3, v4}, Lnb/n8;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lnb/n8;->c:Lnb/n8;

    new-instance v2, Lnb/n8;

    const-string v3, "DENIED"

    const/4 v4, 0x2

    const-string v5, "denied"

    invoke-direct {v2, v3, v4, v5}, Lnb/n8;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lnb/n8;->d:Lnb/n8;

    new-instance v3, Lnb/n8;

    const-string v4, "GRANTED"

    const/4 v5, 0x3

    const-string v6, "granted"

    invoke-direct {v3, v4, v5, v6}, Lnb/n8;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v3, Lnb/n8;->e:Lnb/n8;

    filled-new-array {v0, v1, v2, v3}, [Lnb/n8;

    move-result-object v0

    sput-object v0, Lnb/n8;->f:[Lnb/n8;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lnb/n8;->a:Ljava/lang/String;

    return-void
.end method

.method public static values()[Lnb/n8;
    .locals 1

    sget-object v0, Lnb/n8;->f:[Lnb/n8;

    invoke-virtual {v0}, [Lnb/n8;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnb/n8;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnb/n8;->a:Ljava/lang/String;

    return-object v0
.end method
