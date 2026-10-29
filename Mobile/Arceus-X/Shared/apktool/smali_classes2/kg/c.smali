.class public abstract enum Lkg/c;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lkg/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lkg/c;",
        ">;",
        "Lkg/d;"
    }
.end annotation


# static fields
.field public static final enum a:Lkg/c;

.field public static final enum b:Lkg/c;

.field public static final enum c:Lkg/c;

.field public static final enum d:Lkg/c;

.field public static final enum e:Lkg/c;

.field public static final enum f:Lkg/c;

.field public static final enum g:Lkg/c;

.field public static final synthetic h:[Lkg/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lkg/c$a;

    const-string v1, "IDENTITY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lkg/c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkg/c;->a:Lkg/c;

    new-instance v0, Lkg/c$b;

    const-string v1, "UPPER_CAMEL_CASE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lkg/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkg/c;->b:Lkg/c;

    new-instance v0, Lkg/c$c;

    const-string v1, "UPPER_CAMEL_CASE_WITH_SPACES"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lkg/c$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkg/c;->c:Lkg/c;

    new-instance v0, Lkg/c$d;

    const-string v1, "UPPER_CASE_WITH_UNDERSCORES"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lkg/c$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkg/c;->d:Lkg/c;

    new-instance v0, Lkg/c$e;

    const-string v1, "LOWER_CASE_WITH_UNDERSCORES"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lkg/c$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkg/c;->e:Lkg/c;

    new-instance v0, Lkg/c$f;

    const-string v1, "LOWER_CASE_WITH_DASHES"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lkg/c$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkg/c;->f:Lkg/c;

    new-instance v0, Lkg/c$g;

    const-string v1, "LOWER_CASE_WITH_DOTS"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lkg/c$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lkg/c;->g:Lkg/c;

    invoke-static {}, Lkg/c;->c()[Lkg/c;

    move-result-object v0

    sput-object v0, Lkg/c;->h:[Lkg/c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkg/c$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lkg/c;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic c()[Lkg/c;
    .locals 7

    sget-object v0, Lkg/c;->a:Lkg/c;

    sget-object v1, Lkg/c;->b:Lkg/c;

    sget-object v2, Lkg/c;->c:Lkg/c;

    sget-object v3, Lkg/c;->d:Lkg/c;

    sget-object v4, Lkg/c;->e:Lkg/c;

    sget-object v5, Lkg/c;->f:Lkg/c;

    sget-object v6, Lkg/c;->g:Lkg/c;

    filled-new-array/range {v0 .. v6}, [Lkg/c;

    move-result-object v0

    return-object v0
.end method

.method public static d(Ljava/lang/String;C)Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_3

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isLetter(C)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-static {v3}, Ljava/lang/Character;->isUpperCase(C)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {v3}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v0

    const/4 v3, 0x1

    if-nez v2, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/2addr v2, v3

    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lkg/c;
    .locals 1

    const-class v0, Lkg/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lkg/c;

    return-object p0
.end method

.method public static values()[Lkg/c;
    .locals 1

    sget-object v0, Lkg/c;->h:[Lkg/c;

    invoke-virtual {v0}, [Lkg/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lkg/c;

    return-object v0
.end method
