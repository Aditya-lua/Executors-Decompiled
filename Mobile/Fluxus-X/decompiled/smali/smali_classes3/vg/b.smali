.class public final enum Lvg/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lvg/b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lvg/b;

.field public static final enum b:Lvg/b;

.field public static final enum c:Lvg/b;

.field public static final enum d:Lvg/b;

.field public static final enum e:Lvg/b;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum f:Lvg/b;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final enum g:Lvg/b;

.field public static final enum h:Lvg/b;

.field public static final enum i:Lvg/b;

.field public static final enum j:Lvg/b;

.field public static final enum k:Lvg/b;

.field public static final enum l:Lvg/b;

.field public static final enum m:Lvg/b;

.field public static final enum n:Lvg/b;

.field public static final enum o:Lvg/b;

.field public static final enum p:Lvg/b;

.field public static final enum q:Lvg/b;

.field public static final enum r:Lvg/b;

.field public static final enum s:Lvg/b;

.field public static final synthetic t:[Lvg/b;


# direct methods
.method static constructor <clinit>()V
    .locals 21

    new-instance v1, Lvg/b;

    const-string v0, "ERROR_CORRECTION"

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lvg/b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lvg/b;->a:Lvg/b;

    new-instance v2, Lvg/b;

    const-string v0, "CHARACTER_SET"

    const/4 v3, 0x1

    invoke-direct {v2, v0, v3}, Lvg/b;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lvg/b;->b:Lvg/b;

    new-instance v3, Lvg/b;

    const-string v0, "DATA_MATRIX_SHAPE"

    const/4 v4, 0x2

    invoke-direct {v3, v0, v4}, Lvg/b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lvg/b;->c:Lvg/b;

    new-instance v4, Lvg/b;

    const-string v0, "DATA_MATRIX_COMPACT"

    const/4 v5, 0x3

    invoke-direct {v4, v0, v5}, Lvg/b;-><init>(Ljava/lang/String;I)V

    sput-object v4, Lvg/b;->d:Lvg/b;

    new-instance v5, Lvg/b;

    const-string v0, "MIN_SIZE"

    const/4 v6, 0x4

    invoke-direct {v5, v0, v6}, Lvg/b;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lvg/b;->e:Lvg/b;

    new-instance v6, Lvg/b;

    const-string v0, "MAX_SIZE"

    const/4 v7, 0x5

    invoke-direct {v6, v0, v7}, Lvg/b;-><init>(Ljava/lang/String;I)V

    sput-object v6, Lvg/b;->f:Lvg/b;

    new-instance v7, Lvg/b;

    const-string v0, "MARGIN"

    const/4 v8, 0x6

    invoke-direct {v7, v0, v8}, Lvg/b;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lvg/b;->g:Lvg/b;

    new-instance v8, Lvg/b;

    const-string v0, "PDF417_COMPACT"

    const/4 v9, 0x7

    invoke-direct {v8, v0, v9}, Lvg/b;-><init>(Ljava/lang/String;I)V

    sput-object v8, Lvg/b;->h:Lvg/b;

    new-instance v9, Lvg/b;

    const-string v0, "PDF417_COMPACTION"

    const/16 v10, 0x8

    invoke-direct {v9, v0, v10}, Lvg/b;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lvg/b;->i:Lvg/b;

    new-instance v10, Lvg/b;

    const-string v0, "PDF417_DIMENSIONS"

    const/16 v11, 0x9

    invoke-direct {v10, v0, v11}, Lvg/b;-><init>(Ljava/lang/String;I)V

    sput-object v10, Lvg/b;->j:Lvg/b;

    new-instance v11, Lvg/b;

    const-string v0, "PDF417_AUTO_ECI"

    const/16 v12, 0xa

    invoke-direct {v11, v0, v12}, Lvg/b;-><init>(Ljava/lang/String;I)V

    sput-object v11, Lvg/b;->k:Lvg/b;

    new-instance v12, Lvg/b;

    const-string v0, "AZTEC_LAYERS"

    const/16 v13, 0xb

    invoke-direct {v12, v0, v13}, Lvg/b;-><init>(Ljava/lang/String;I)V

    sput-object v12, Lvg/b;->l:Lvg/b;

    new-instance v13, Lvg/b;

    const-string v0, "QR_VERSION"

    const/16 v14, 0xc

    invoke-direct {v13, v0, v14}, Lvg/b;-><init>(Ljava/lang/String;I)V

    sput-object v13, Lvg/b;->m:Lvg/b;

    new-instance v14, Lvg/b;

    const-string v0, "QR_MASK_PATTERN"

    const/16 v15, 0xd

    invoke-direct {v14, v0, v15}, Lvg/b;-><init>(Ljava/lang/String;I)V

    sput-object v14, Lvg/b;->n:Lvg/b;

    new-instance v15, Lvg/b;

    const-string v0, "QR_COMPACT"

    move-object/from16 v16, v1

    const/16 v1, 0xe

    invoke-direct {v15, v0, v1}, Lvg/b;-><init>(Ljava/lang/String;I)V

    sput-object v15, Lvg/b;->o:Lvg/b;

    new-instance v0, Lvg/b;

    const-string v1, "GS1_FORMAT"

    move-object/from16 v17, v2

    const/16 v2, 0xf

    invoke-direct {v0, v1, v2}, Lvg/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvg/b;->p:Lvg/b;

    new-instance v1, Lvg/b;

    const-string v2, "FORCE_CODE_SET"

    move-object/from16 v18, v0

    const/16 v0, 0x10

    invoke-direct {v1, v2, v0}, Lvg/b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lvg/b;->q:Lvg/b;

    new-instance v0, Lvg/b;

    const-string v2, "FORCE_C40"

    move-object/from16 v19, v1

    const/16 v1, 0x11

    invoke-direct {v0, v2, v1}, Lvg/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lvg/b;->r:Lvg/b;

    new-instance v1, Lvg/b;

    const-string v2, "CODE128_COMPACT"

    move-object/from16 v20, v0

    const/16 v0, 0x12

    invoke-direct {v1, v2, v0}, Lvg/b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lvg/b;->s:Lvg/b;

    move-object/from16 v2, v17

    move-object/from16 v17, v19

    move-object/from16 v19, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v18

    move-object/from16 v18, v20

    filled-new-array/range {v1 .. v19}, [Lvg/b;

    move-result-object v0

    sput-object v0, Lvg/b;->t:[Lvg/b;

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

.method public static valueOf(Ljava/lang/String;)Lvg/b;
    .locals 1

    const-class v0, Lvg/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lvg/b;

    return-object p0
.end method

.method public static values()[Lvg/b;
    .locals 1

    sget-object v0, Lvg/b;->t:[Lvg/b;

    invoke-virtual {v0}, [Lvg/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lvg/b;

    return-object v0
.end method
