.class public final enum Ltg/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ltg/b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Ltg/b;

.field public static final enum b:Ltg/b;

.field public static final enum c:Ltg/b;

.field public static final enum d:Ltg/b;

.field public static final enum e:Ltg/b;

.field public static final enum f:Ltg/b;

.field public static final enum g:Ltg/b;

.field public static final enum h:Ltg/b;

.field public static final enum i:Ltg/b;

.field public static final enum j:Ltg/b;

.field public static final synthetic k:[Ltg/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ltg/b;

    const-string v1, "BEGIN_ARRAY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ltg/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltg/b;->a:Ltg/b;

    new-instance v0, Ltg/b;

    const-string v1, "END_ARRAY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ltg/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltg/b;->b:Ltg/b;

    new-instance v0, Ltg/b;

    const-string v1, "BEGIN_OBJECT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ltg/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltg/b;->c:Ltg/b;

    new-instance v0, Ltg/b;

    const-string v1, "END_OBJECT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ltg/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltg/b;->d:Ltg/b;

    new-instance v0, Ltg/b;

    const-string v1, "NAME"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ltg/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltg/b;->e:Ltg/b;

    new-instance v0, Ltg/b;

    const-string v1, "STRING"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Ltg/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltg/b;->f:Ltg/b;

    new-instance v0, Ltg/b;

    const-string v1, "NUMBER"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Ltg/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltg/b;->g:Ltg/b;

    new-instance v0, Ltg/b;

    const-string v1, "BOOLEAN"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Ltg/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltg/b;->h:Ltg/b;

    new-instance v0, Ltg/b;

    const-string v1, "NULL"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Ltg/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltg/b;->i:Ltg/b;

    new-instance v0, Ltg/b;

    const-string v1, "END_DOCUMENT"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Ltg/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltg/b;->j:Ltg/b;

    invoke-static {}, Ltg/b;->a()[Ltg/b;

    move-result-object v0

    sput-object v0, Ltg/b;->k:[Ltg/b;

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

.method public static synthetic a()[Ltg/b;
    .locals 10

    sget-object v0, Ltg/b;->a:Ltg/b;

    sget-object v1, Ltg/b;->b:Ltg/b;

    sget-object v2, Ltg/b;->c:Ltg/b;

    sget-object v3, Ltg/b;->d:Ltg/b;

    sget-object v4, Ltg/b;->e:Ltg/b;

    sget-object v5, Ltg/b;->f:Ltg/b;

    sget-object v6, Ltg/b;->g:Ltg/b;

    sget-object v7, Ltg/b;->h:Ltg/b;

    sget-object v8, Ltg/b;->i:Ltg/b;

    sget-object v9, Ltg/b;->j:Ltg/b;

    filled-new-array/range {v0 .. v9}, [Ltg/b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ltg/b;
    .locals 1

    const-class v0, Ltg/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ltg/b;

    return-object p0
.end method

.method public static values()[Ltg/b;
    .locals 1

    sget-object v0, Ltg/b;->k:[Ltg/b;

    invoke-virtual {v0}, [Ltg/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ltg/b;

    return-object v0
.end method
