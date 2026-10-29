.class public final enum Lr7/c$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr7/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lr7/c$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lr7/c$b;

.field public static final enum b:Lr7/c$b;

.field public static final enum c:Lr7/c$b;

.field public static final enum d:Lr7/c$b;

.field public static final enum e:Lr7/c$b;

.field public static final enum f:Lr7/c$b;

.field public static final enum g:Lr7/c$b;

.field public static final enum h:Lr7/c$b;

.field public static final enum i:Lr7/c$b;

.field public static final enum j:Lr7/c$b;

.field public static final synthetic k:[Lr7/c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lr7/c$b;

    const-string v1, "BEGIN_ARRAY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lr7/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr7/c$b;->a:Lr7/c$b;

    new-instance v0, Lr7/c$b;

    const-string v1, "END_ARRAY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lr7/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr7/c$b;->b:Lr7/c$b;

    new-instance v0, Lr7/c$b;

    const-string v1, "BEGIN_OBJECT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lr7/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr7/c$b;->c:Lr7/c$b;

    new-instance v0, Lr7/c$b;

    const-string v1, "END_OBJECT"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lr7/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr7/c$b;->d:Lr7/c$b;

    new-instance v0, Lr7/c$b;

    const-string v1, "NAME"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lr7/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr7/c$b;->e:Lr7/c$b;

    new-instance v0, Lr7/c$b;

    const-string v1, "STRING"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lr7/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr7/c$b;->f:Lr7/c$b;

    new-instance v0, Lr7/c$b;

    const-string v1, "NUMBER"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lr7/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr7/c$b;->g:Lr7/c$b;

    new-instance v0, Lr7/c$b;

    const-string v1, "BOOLEAN"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lr7/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr7/c$b;->h:Lr7/c$b;

    new-instance v0, Lr7/c$b;

    const-string v1, "NULL"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lr7/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr7/c$b;->i:Lr7/c$b;

    new-instance v0, Lr7/c$b;

    const-string v1, "END_DOCUMENT"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lr7/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr7/c$b;->j:Lr7/c$b;

    invoke-static {}, Lr7/c$b;->a()[Lr7/c$b;

    move-result-object v0

    sput-object v0, Lr7/c$b;->k:[Lr7/c$b;

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

.method public static synthetic a()[Lr7/c$b;
    .locals 10

    sget-object v0, Lr7/c$b;->a:Lr7/c$b;

    sget-object v1, Lr7/c$b;->b:Lr7/c$b;

    sget-object v2, Lr7/c$b;->c:Lr7/c$b;

    sget-object v3, Lr7/c$b;->d:Lr7/c$b;

    sget-object v4, Lr7/c$b;->e:Lr7/c$b;

    sget-object v5, Lr7/c$b;->f:Lr7/c$b;

    sget-object v6, Lr7/c$b;->g:Lr7/c$b;

    sget-object v7, Lr7/c$b;->h:Lr7/c$b;

    sget-object v8, Lr7/c$b;->i:Lr7/c$b;

    sget-object v9, Lr7/c$b;->j:Lr7/c$b;

    filled-new-array/range {v0 .. v9}, [Lr7/c$b;

    move-result-object v0

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lr7/c$b;
    .locals 1

    const-class v0, Lr7/c$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lr7/c$b;

    return-object p0
.end method

.method public static values()[Lr7/c$b;
    .locals 1

    sget-object v0, Lr7/c$b;->k:[Lr7/c$b;

    invoke-virtual {v0}, [Lr7/c$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lr7/c$b;

    return-object v0
.end method
