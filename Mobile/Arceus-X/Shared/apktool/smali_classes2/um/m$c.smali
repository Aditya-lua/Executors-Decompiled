.class public final enum Lum/m$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lum/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lum/m$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lum/m$c;

.field public static final enum b:Lum/m$c;

.field public static final enum c:Lum/m$c;

.field public static final enum d:Lum/m$c;

.field public static final enum e:Lum/m$c;

.field public static final enum f:Lum/m$c;

.field public static final enum g:Lum/m$c;

.field public static final enum h:Lum/m$c;

.field public static final enum i:Lum/m$c;

.field public static final enum j:Lum/m$c;

.field public static final synthetic k:[Lum/m$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lum/m$c;

    const-string v1, "BEGIN_ARRAY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lum/m$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lum/m$c;->a:Lum/m$c;

    new-instance v0, Lum/m$c;

    const-string v1, "END_ARRAY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lum/m$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lum/m$c;->b:Lum/m$c;

    new-instance v0, Lum/m$c;

    const-string v1, "BEGIN_OBJECT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lum/m$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lum/m$c;->c:Lum/m$c;

    new-instance v0, Lum/m$c;

    const-string v1, "END_OBJECT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lum/m$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lum/m$c;->d:Lum/m$c;

    new-instance v0, Lum/m$c;

    const-string v1, "NAME"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lum/m$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lum/m$c;->e:Lum/m$c;

    new-instance v0, Lum/m$c;

    const-string v1, "STRING"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lum/m$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lum/m$c;->f:Lum/m$c;

    new-instance v0, Lum/m$c;

    const-string v1, "NUMBER"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lum/m$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lum/m$c;->g:Lum/m$c;

    new-instance v0, Lum/m$c;

    const-string v1, "BOOLEAN"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lum/m$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lum/m$c;->h:Lum/m$c;

    new-instance v0, Lum/m$c;

    const-string v1, "NULL"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lum/m$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lum/m$c;->i:Lum/m$c;

    new-instance v0, Lum/m$c;

    const-string v1, "END_DOCUMENT"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lum/m$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lum/m$c;->j:Lum/m$c;

    invoke-static {}, Lum/m$c;->a()[Lum/m$c;

    move-result-object v0

    sput-object v0, Lum/m$c;->k:[Lum/m$c;

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

.method public static synthetic a()[Lum/m$c;
    .locals 10

    sget-object v0, Lum/m$c;->a:Lum/m$c;

    sget-object v1, Lum/m$c;->b:Lum/m$c;

    sget-object v2, Lum/m$c;->c:Lum/m$c;

    sget-object v3, Lum/m$c;->d:Lum/m$c;

    sget-object v4, Lum/m$c;->e:Lum/m$c;

    sget-object v5, Lum/m$c;->f:Lum/m$c;

    sget-object v6, Lum/m$c;->g:Lum/m$c;

    sget-object v7, Lum/m$c;->h:Lum/m$c;

    sget-object v8, Lum/m$c;->i:Lum/m$c;

    sget-object v9, Lum/m$c;->j:Lum/m$c;

    filled-new-array/range {v0 .. v9}, [Lum/m$c;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lum/m$c;
    .locals 1

    const-class v0, Lum/m$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lum/m$c;

    return-object p0
.end method

.method public static values()[Lum/m$c;
    .locals 1

    sget-object v0, Lum/m$c;->k:[Lum/m$c;

    invoke-virtual {v0}, [Lum/m$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lum/m$c;

    return-object v0
.end method
