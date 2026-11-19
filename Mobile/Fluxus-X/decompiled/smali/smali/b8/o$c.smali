.class public final enum Lb8/o$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb8/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lb8/o$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum b:Lb8/o$c;

.field public static final enum c:Lb8/o$c;

.field public static final enum d:Lb8/o$c;

.field public static final enum e:Lb8/o$c;

.field public static final enum f:Lb8/o$c;

.field public static final enum g:Lb8/o$c;

.field public static final enum h:Lb8/o$c;

.field public static final enum i:Lb8/o$c;

.field public static final enum j:Lb8/o$c;

.field public static final enum k:Lb8/o$c;

.field public static final enum l:Lb8/o$c;

.field public static final enum m:Lb8/o$c;

.field public static final enum n:Lb8/o$c;

.field public static final enum o:Lb8/o$c;

.field public static final enum p:Lb8/o$c;

.field public static final enum q:Lb8/o$c;

.field public static final enum r:Lb8/o$c;

.field public static final enum s:Lb8/o$c;

.field public static final enum t:Lb8/o$c;

.field public static final u:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lb8/o$c;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic v:[Lb8/o$c;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 31

    new-instance v1, Lb8/o$c;

    const-string v0, "MOBILE"

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2, v2}, Lb8/o$c;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lb8/o$c;->b:Lb8/o$c;

    move v0, v2

    new-instance v2, Lb8/o$c;

    const-string v3, "WIFI"

    const/4 v4, 0x1

    invoke-direct {v2, v3, v4, v4}, Lb8/o$c;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lb8/o$c;->c:Lb8/o$c;

    new-instance v3, Lb8/o$c;

    const-string v5, "MOBILE_MMS"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lb8/o$c;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lb8/o$c;->d:Lb8/o$c;

    move v5, v4

    new-instance v4, Lb8/o$c;

    const-string v7, "MOBILE_SUPL"

    const/4 v8, 0x3

    invoke-direct {v4, v7, v8, v8}, Lb8/o$c;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lb8/o$c;->e:Lb8/o$c;

    move v7, v5

    new-instance v5, Lb8/o$c;

    const-string v9, "MOBILE_DUN"

    const/4 v10, 0x4

    invoke-direct {v5, v9, v10, v10}, Lb8/o$c;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lb8/o$c;->f:Lb8/o$c;

    move v9, v6

    new-instance v6, Lb8/o$c;

    const-string v11, "MOBILE_HIPRI"

    const/4 v12, 0x5

    invoke-direct {v6, v11, v12, v12}, Lb8/o$c;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lb8/o$c;->g:Lb8/o$c;

    move v11, v7

    new-instance v7, Lb8/o$c;

    const-string v13, "WIMAX"

    const/4 v14, 0x6

    invoke-direct {v7, v13, v14, v14}, Lb8/o$c;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lb8/o$c;->h:Lb8/o$c;

    move v13, v8

    new-instance v8, Lb8/o$c;

    const-string v15, "BLUETOOTH"

    const/4 v0, 0x7

    invoke-direct {v8, v15, v0, v0}, Lb8/o$c;-><init>(Ljava/lang/String;II)V

    sput-object v8, Lb8/o$c;->i:Lb8/o$c;

    move v15, v9

    new-instance v9, Lb8/o$c;

    const-string v10, "DUMMY"

    const/16 v0, 0x8

    invoke-direct {v9, v10, v0, v0}, Lb8/o$c;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lb8/o$c;->j:Lb8/o$c;

    new-instance v10, Lb8/o$c;

    const-string v11, "ETHERNET"

    const/16 v0, 0x9

    invoke-direct {v10, v11, v0, v0}, Lb8/o$c;-><init>(Ljava/lang/String;II)V

    sput-object v10, Lb8/o$c;->k:Lb8/o$c;

    new-instance v11, Lb8/o$c;

    const-string v12, "MOBILE_FOTA"

    const/16 v0, 0xa

    invoke-direct {v11, v12, v0, v0}, Lb8/o$c;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lb8/o$c;->l:Lb8/o$c;

    new-instance v12, Lb8/o$c;

    const-string v13, "MOBILE_IMS"

    const/16 v0, 0xb

    invoke-direct {v12, v13, v0, v0}, Lb8/o$c;-><init>(Ljava/lang/String;II)V

    sput-object v12, Lb8/o$c;->m:Lb8/o$c;

    new-instance v13, Lb8/o$c;

    const-string v14, "MOBILE_CBS"

    const/16 v0, 0xc

    invoke-direct {v13, v14, v0, v0}, Lb8/o$c;-><init>(Ljava/lang/String;II)V

    sput-object v13, Lb8/o$c;->n:Lb8/o$c;

    new-instance v14, Lb8/o$c;

    const-string v15, "WIFI_P2P"

    const/16 v0, 0xd

    invoke-direct {v14, v15, v0, v0}, Lb8/o$c;-><init>(Ljava/lang/String;II)V

    sput-object v14, Lb8/o$c;->o:Lb8/o$c;

    new-instance v15, Lb8/o$c;

    const-string v0, "MOBILE_IA"

    move-object/from16 v21, v1

    const/16 v1, 0xe

    invoke-direct {v15, v0, v1, v1}, Lb8/o$c;-><init>(Ljava/lang/String;II)V

    sput-object v15, Lb8/o$c;->p:Lb8/o$c;

    new-instance v0, Lb8/o$c;

    const-string v1, "MOBILE_EMERGENCY"

    move-object/from16 v22, v2

    const/16 v2, 0xf

    invoke-direct {v0, v1, v2, v2}, Lb8/o$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lb8/o$c;->q:Lb8/o$c;

    new-instance v1, Lb8/o$c;

    const-string v2, "PROXY"

    move-object/from16 v23, v0

    const/16 v0, 0x10

    invoke-direct {v1, v2, v0, v0}, Lb8/o$c;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lb8/o$c;->r:Lb8/o$c;

    new-instance v2, Lb8/o$c;

    const-string v0, "VPN"

    move-object/from16 v24, v1

    const/16 v1, 0x11

    invoke-direct {v2, v0, v1, v1}, Lb8/o$c;-><init>(Ljava/lang/String;II)V

    sput-object v2, Lb8/o$c;->s:Lb8/o$c;

    new-instance v0, Lb8/o$c;

    const-string v1, "NONE"

    move-object/from16 v25, v2

    const/16 v2, 0x12

    move-object/from16 v26, v3

    const/4 v3, -0x1

    invoke-direct {v0, v1, v2, v3}, Lb8/o$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lb8/o$c;->t:Lb8/o$c;

    move-object/from16 v19, v0

    move-object/from16 v1, v21

    move-object/from16 v2, v22

    move-object/from16 v16, v23

    move-object/from16 v17, v24

    move-object/from16 v18, v25

    move-object/from16 v3, v26

    const/4 v0, 0x0

    filled-new-array/range {v1 .. v19}, [Lb8/o$c;

    move-result-object v20

    move-object/from16 v27, v16

    move-object/from16 v28, v17

    move-object/from16 v29, v18

    move-object/from16 v30, v19

    sput-object v20, Lb8/o$c;->v:[Lb8/o$c;

    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    sput-object v0, Lb8/o$c;->u:Landroid/util/SparseArray;

    move-object/from16 v17, v15

    const/4 v15, 0x0

    invoke-virtual {v0, v15, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/4 v15, 0x2

    invoke-virtual {v0, v15, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/4 v1, 0x3

    invoke-virtual {v0, v1, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/4 v1, 0x4

    invoke-virtual {v0, v1, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/4 v1, 0x5

    invoke-virtual {v0, v1, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/4 v1, 0x6

    invoke-virtual {v0, v1, v7}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/4 v1, 0x7

    invoke-virtual {v0, v1, v8}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/16 v1, 0x8

    invoke-virtual {v0, v1, v9}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/16 v1, 0x9

    invoke-virtual {v0, v1, v10}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/16 v1, 0xa

    invoke-virtual {v0, v1, v11}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/16 v1, 0xb

    invoke-virtual {v0, v1, v12}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/16 v1, 0xc

    invoke-virtual {v0, v1, v13}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/16 v1, 0xd

    invoke-virtual {v0, v1, v14}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v15, v17

    const/16 v1, 0xe

    invoke-virtual {v0, v1, v15}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v27

    const/16 v2, 0xf

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v28

    const/16 v2, 0x10

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v29

    const/16 v2, 0x11

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    move-object/from16 v1, v30

    const/4 v2, -0x1

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lb8/o$c;->a:I

    return-void
.end method

.method public static a(I)Lb8/o$c;
    .locals 1

    sget-object v0, Lb8/o$c;->u:Landroid/util/SparseArray;

    invoke-virtual {v0, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lb8/o$c;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lb8/o$c;
    .locals 1

    const-class v0, Lb8/o$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb8/o$c;

    return-object p0
.end method

.method public static values()[Lb8/o$c;
    .locals 1

    sget-object v0, Lb8/o$c;->v:[Lb8/o$c;

    invoke-virtual {v0}, [Lb8/o$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb8/o$c;

    return-object v0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lb8/o$c;->a:I

    return v0
.end method
