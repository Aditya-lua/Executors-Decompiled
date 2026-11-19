.class public abstract enum Llg/c;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Llg/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Llg/c;",
        ">;",
        "Llg/d;"
    }
.end annotation


# static fields
.field public static final enum a:Llg/c;

.field public static final enum b:Llg/c;

.field public static final enum c:Llg/c;

.field public static final enum d:Llg/c;

.field public static final enum e:Llg/c;

.field public static final enum f:Llg/c;

.field public static final enum g:Llg/c;

.field public static final synthetic h:[Llg/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Llg/c$a;

    const-string v1, "IDENTITY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Llg/c$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llg/c;->a:Llg/c;

    new-instance v0, Llg/c$b;

    const-string v1, "UPPER_CAMEL_CASE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Llg/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llg/c;->b:Llg/c;

    new-instance v0, Llg/c$c;

    const-string v1, "UPPER_CAMEL_CASE_WITH_SPACES"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Llg/c$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llg/c;->c:Llg/c;

    new-instance v0, Llg/c$d;

    const-string v1, "UPPER_CASE_WITH_UNDERSCORES"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Llg/c$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llg/c;->d:Llg/c;

    new-instance v0, Llg/c$e;

    const-string v1, "LOWER_CASE_WITH_UNDERSCORES"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Llg/c$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llg/c;->e:Llg/c;

    new-instance v0, Llg/c$f;

    const-string v1, "LOWER_CASE_WITH_DASHES"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Llg/c$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llg/c;->f:Llg/c;

    new-instance v0, Llg/c$g;

    const-string v1, "LOWER_CASE_WITH_DOTS"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Llg/c$g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llg/c;->g:Llg/c;

    invoke-static {}, Llg/c;->c()[Llg/c;

    move-result-object v0

    sput-object v0, Llg/c;->h:[Llg/c;

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

.method public synthetic constructor <init>(Ljava/lang/String;ILlg/c$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Llg/c;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static synthetic c()[Llg/c;
    .locals 7

    sget-object v0, Llg/c;->a:Llg/c;

    sget-object v1, Llg/c;->b:Llg/c;

    sget-object v2, Llg/c;->c:Llg/c;

    sget-object v3, Llg/c;->d:Llg/c;

    sget-object v4, Llg/c;->e:Llg/c;

    sget-object v5, Llg/c;->f:Llg/c;

    sget-object v6, Llg/c;->g:Llg/c;

    filled-new-array/range {v0 .. v6}, [Llg/c;

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

.method public static valueOf(Ljava/lang/String;)Llg/c;
    .locals 1

    const-class v0, Llg/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Llg/c;

    return-object p0
.end method

.method public static values()[Llg/c;
    .locals 1

    sget-object v0, Llg/c;->h:[Llg/c;

    invoke-virtual {v0}, [Llg/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llg/c;

    return-object v0
.end method
