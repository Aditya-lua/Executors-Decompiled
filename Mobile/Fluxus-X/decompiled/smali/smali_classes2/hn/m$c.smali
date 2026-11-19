.class public final enum Lhn/m$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhn/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhn/m$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lhn/m$c;

.field public static final enum b:Lhn/m$c;

.field public static final enum c:Lhn/m$c;

.field public static final enum d:Lhn/m$c;

.field public static final enum e:Lhn/m$c;

.field public static final enum f:Lhn/m$c;

.field public static final enum g:Lhn/m$c;

.field public static final enum h:Lhn/m$c;

.field public static final enum i:Lhn/m$c;

.field public static final enum j:Lhn/m$c;

.field public static final synthetic k:[Lhn/m$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lhn/m$c;

    const-string v1, "BEGIN_ARRAY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lhn/m$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhn/m$c;->a:Lhn/m$c;

    new-instance v0, Lhn/m$c;

    const-string v1, "END_ARRAY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lhn/m$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhn/m$c;->b:Lhn/m$c;

    new-instance v0, Lhn/m$c;

    const-string v1, "BEGIN_OBJECT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lhn/m$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhn/m$c;->c:Lhn/m$c;

    new-instance v0, Lhn/m$c;

    const-string v1, "END_OBJECT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lhn/m$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhn/m$c;->d:Lhn/m$c;

    new-instance v0, Lhn/m$c;

    const-string v1, "NAME"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lhn/m$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhn/m$c;->e:Lhn/m$c;

    new-instance v0, Lhn/m$c;

    const-string v1, "STRING"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lhn/m$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhn/m$c;->f:Lhn/m$c;

    new-instance v0, Lhn/m$c;

    const-string v1, "NUMBER"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lhn/m$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhn/m$c;->g:Lhn/m$c;

    new-instance v0, Lhn/m$c;

    const-string v1, "BOOLEAN"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lhn/m$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhn/m$c;->h:Lhn/m$c;

    new-instance v0, Lhn/m$c;

    const-string v1, "NULL"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lhn/m$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhn/m$c;->i:Lhn/m$c;

    new-instance v0, Lhn/m$c;

    const-string v1, "END_DOCUMENT"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lhn/m$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lhn/m$c;->j:Lhn/m$c;

    invoke-static {}, Lhn/m$c;->a()[Lhn/m$c;

    move-result-object v0

    sput-object v0, Lhn/m$c;->k:[Lhn/m$c;

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

.method public static synthetic a()[Lhn/m$c;
    .locals 10

    sget-object v0, Lhn/m$c;->a:Lhn/m$c;

    sget-object v1, Lhn/m$c;->b:Lhn/m$c;

    sget-object v2, Lhn/m$c;->c:Lhn/m$c;

    sget-object v3, Lhn/m$c;->d:Lhn/m$c;

    sget-object v4, Lhn/m$c;->e:Lhn/m$c;

    sget-object v5, Lhn/m$c;->f:Lhn/m$c;

    sget-object v6, Lhn/m$c;->g:Lhn/m$c;

    sget-object v7, Lhn/m$c;->h:Lhn/m$c;

    sget-object v8, Lhn/m$c;->i:Lhn/m$c;

    sget-object v9, Lhn/m$c;->j:Lhn/m$c;

    filled-new-array/range {v0 .. v9}, [Lhn/m$c;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lhn/m$c;
    .locals 1

    const-class v0, Lhn/m$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhn/m$c;

    return-object p0
.end method

.method public static values()[Lhn/m$c;
    .locals 1

    sget-object v0, Lhn/m$c;->k:[Lhn/m$c;

    invoke-virtual {v0}, [Lhn/m$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhn/m$c;

    return-object v0
.end method
