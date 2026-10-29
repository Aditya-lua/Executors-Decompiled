.class public final enum Lcom/google/android/gms/internal/measurement/wd;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum c:Lcom/google/android/gms/internal/measurement/wd;

.field public static final enum d:Lcom/google/android/gms/internal/measurement/wd;

.field public static final enum e:Lcom/google/android/gms/internal/measurement/wd;

.field public static final enum f:Lcom/google/android/gms/internal/measurement/wd;

.field public static final enum g:Lcom/google/android/gms/internal/measurement/wd;

.field public static final enum h:Lcom/google/android/gms/internal/measurement/wd;

.field public static final enum i:Lcom/google/android/gms/internal/measurement/wd;

.field public static final enum j:Lcom/google/android/gms/internal/measurement/wd;

.field public static final enum k:Lcom/google/android/gms/internal/measurement/wd;

.field public static final enum l:Lcom/google/android/gms/internal/measurement/wd;

.field public static final enum m:Lcom/google/android/gms/internal/measurement/wd;

.field public static final enum n:Lcom/google/android/gms/internal/measurement/wd;

.field public static final enum o:Lcom/google/android/gms/internal/measurement/wd;

.field public static final enum p:Lcom/google/android/gms/internal/measurement/wd;

.field public static final enum q:Lcom/google/android/gms/internal/measurement/wd;

.field public static final enum r:Lcom/google/android/gms/internal/measurement/wd;

.field public static final enum s:Lcom/google/android/gms/internal/measurement/wd;

.field public static final enum t:Lcom/google/android/gms/internal/measurement/wd;

.field public static final synthetic u:[Lcom/google/android/gms/internal/measurement/wd;


# instance fields
.field public final a:Lcom/google/android/gms/internal/measurement/xd;

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 23

    new-instance v1, Lcom/google/android/gms/internal/measurement/wd;

    sget-object v0, Lcom/google/android/gms/internal/measurement/xd;->d:Lcom/google/android/gms/internal/measurement/xd;

    const-string v2, "DOUBLE"

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v1, v2, v3, v0, v4}, Lcom/google/android/gms/internal/measurement/wd;-><init>(Ljava/lang/String;ILcom/google/android/gms/internal/measurement/xd;I)V

    sput-object v1, Lcom/google/android/gms/internal/measurement/wd;->c:Lcom/google/android/gms/internal/measurement/wd;

    new-instance v2, Lcom/google/android/gms/internal/measurement/wd;

    sget-object v0, Lcom/google/android/gms/internal/measurement/xd;->c:Lcom/google/android/gms/internal/measurement/xd;

    const-string v5, "FLOAT"

    const/4 v6, 0x5

    invoke-direct {v2, v5, v4, v0, v6}, Lcom/google/android/gms/internal/measurement/wd;-><init>(Ljava/lang/String;ILcom/google/android/gms/internal/measurement/xd;I)V

    sput-object v2, Lcom/google/android/gms/internal/measurement/wd;->d:Lcom/google/android/gms/internal/measurement/wd;

    new-instance v0, Lcom/google/android/gms/internal/measurement/wd;

    sget-object v5, Lcom/google/android/gms/internal/measurement/xd;->b:Lcom/google/android/gms/internal/measurement/xd;

    const-string v7, "INT64"

    const/4 v8, 0x2

    invoke-direct {v0, v7, v8, v5, v3}, Lcom/google/android/gms/internal/measurement/wd;-><init>(Ljava/lang/String;ILcom/google/android/gms/internal/measurement/xd;I)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/wd;->e:Lcom/google/android/gms/internal/measurement/wd;

    new-instance v7, Lcom/google/android/gms/internal/measurement/wd;

    const-string v9, "UINT64"

    const/4 v10, 0x3

    invoke-direct {v7, v9, v10, v5, v3}, Lcom/google/android/gms/internal/measurement/wd;-><init>(Ljava/lang/String;ILcom/google/android/gms/internal/measurement/xd;I)V

    sput-object v7, Lcom/google/android/gms/internal/measurement/wd;->f:Lcom/google/android/gms/internal/measurement/wd;

    new-instance v9, Lcom/google/android/gms/internal/measurement/wd;

    sget-object v11, Lcom/google/android/gms/internal/measurement/xd;->a:Lcom/google/android/gms/internal/measurement/xd;

    const-string v12, "INT32"

    const/4 v13, 0x4

    invoke-direct {v9, v12, v13, v11, v3}, Lcom/google/android/gms/internal/measurement/wd;-><init>(Ljava/lang/String;ILcom/google/android/gms/internal/measurement/xd;I)V

    sput-object v9, Lcom/google/android/gms/internal/measurement/wd;->g:Lcom/google/android/gms/internal/measurement/wd;

    new-instance v12, Lcom/google/android/gms/internal/measurement/wd;

    const-string v13, "FIXED64"

    invoke-direct {v12, v13, v6, v5, v4}, Lcom/google/android/gms/internal/measurement/wd;-><init>(Ljava/lang/String;ILcom/google/android/gms/internal/measurement/xd;I)V

    sput-object v12, Lcom/google/android/gms/internal/measurement/wd;->h:Lcom/google/android/gms/internal/measurement/wd;

    move-object v13, v7

    new-instance v7, Lcom/google/android/gms/internal/measurement/wd;

    const-string v14, "FIXED32"

    const/4 v15, 0x6

    invoke-direct {v7, v14, v15, v11, v6}, Lcom/google/android/gms/internal/measurement/wd;-><init>(Ljava/lang/String;ILcom/google/android/gms/internal/measurement/xd;I)V

    sput-object v7, Lcom/google/android/gms/internal/measurement/wd;->i:Lcom/google/android/gms/internal/measurement/wd;

    new-instance v14, Lcom/google/android/gms/internal/measurement/wd;

    sget-object v15, Lcom/google/android/gms/internal/measurement/xd;->e:Lcom/google/android/gms/internal/measurement/xd;

    const-string v4, "BOOL"

    const/4 v6, 0x7

    invoke-direct {v14, v4, v6, v15, v3}, Lcom/google/android/gms/internal/measurement/wd;-><init>(Ljava/lang/String;ILcom/google/android/gms/internal/measurement/xd;I)V

    sput-object v14, Lcom/google/android/gms/internal/measurement/wd;->j:Lcom/google/android/gms/internal/measurement/wd;

    move-object v4, v9

    new-instance v9, Lcom/google/android/gms/internal/measurement/wd;

    const/16 v6, 0x8

    sget-object v15, Lcom/google/android/gms/internal/measurement/xd;->f:Lcom/google/android/gms/internal/measurement/xd;

    const-string v3, "STRING"

    invoke-direct {v9, v3, v6, v15, v8}, Lcom/google/android/gms/internal/measurement/wd;-><init>(Ljava/lang/String;ILcom/google/android/gms/internal/measurement/xd;I)V

    sput-object v9, Lcom/google/android/gms/internal/measurement/wd;->k:Lcom/google/android/gms/internal/measurement/wd;

    new-instance v3, Lcom/google/android/gms/internal/measurement/wd;

    sget-object v6, Lcom/google/android/gms/internal/measurement/xd;->i:Lcom/google/android/gms/internal/measurement/xd;

    const-string v15, "GROUP"

    const/16 v8, 0x9

    invoke-direct {v3, v15, v8, v6, v10}, Lcom/google/android/gms/internal/measurement/wd;-><init>(Ljava/lang/String;ILcom/google/android/gms/internal/measurement/xd;I)V

    sput-object v3, Lcom/google/android/gms/internal/measurement/wd;->l:Lcom/google/android/gms/internal/measurement/wd;

    new-instance v8, Lcom/google/android/gms/internal/measurement/wd;

    const-string v10, "MESSAGE"

    const/16 v15, 0xa

    move-object/from16 v20, v0

    const/4 v0, 0x2

    invoke-direct {v8, v10, v15, v6, v0}, Lcom/google/android/gms/internal/measurement/wd;-><init>(Ljava/lang/String;ILcom/google/android/gms/internal/measurement/xd;I)V

    sput-object v8, Lcom/google/android/gms/internal/measurement/wd;->m:Lcom/google/android/gms/internal/measurement/wd;

    move-object v6, v12

    new-instance v12, Lcom/google/android/gms/internal/measurement/wd;

    const/16 v10, 0xb

    sget-object v15, Lcom/google/android/gms/internal/measurement/xd;->g:Lcom/google/android/gms/internal/measurement/xd;

    move-object/from16 v19, v1

    const-string v1, "BYTES"

    invoke-direct {v12, v1, v10, v15, v0}, Lcom/google/android/gms/internal/measurement/wd;-><init>(Ljava/lang/String;ILcom/google/android/gms/internal/measurement/xd;I)V

    sput-object v12, Lcom/google/android/gms/internal/measurement/wd;->n:Lcom/google/android/gms/internal/measurement/wd;

    move-object v0, v4

    move-object v4, v13

    new-instance v13, Lcom/google/android/gms/internal/measurement/wd;

    const-string v1, "UINT32"

    const/16 v10, 0xc

    const/4 v15, 0x0

    invoke-direct {v13, v1, v10, v11, v15}, Lcom/google/android/gms/internal/measurement/wd;-><init>(Ljava/lang/String;ILcom/google/android/gms/internal/measurement/xd;I)V

    sput-object v13, Lcom/google/android/gms/internal/measurement/wd;->o:Lcom/google/android/gms/internal/measurement/wd;

    move-object v1, v8

    move-object v8, v14

    new-instance v14, Lcom/google/android/gms/internal/measurement/wd;

    sget-object v10, Lcom/google/android/gms/internal/measurement/xd;->h:Lcom/google/android/gms/internal/measurement/xd;

    move-object/from16 v21, v0

    const-string v0, "ENUM"

    move-object/from16 v22, v1

    const/16 v1, 0xd

    invoke-direct {v14, v0, v1, v10, v15}, Lcom/google/android/gms/internal/measurement/wd;-><init>(Ljava/lang/String;ILcom/google/android/gms/internal/measurement/xd;I)V

    sput-object v14, Lcom/google/android/gms/internal/measurement/wd;->p:Lcom/google/android/gms/internal/measurement/wd;

    new-instance v15, Lcom/google/android/gms/internal/measurement/wd;

    const-string v0, "SFIXED32"

    const/16 v1, 0xe

    const/4 v10, 0x5

    invoke-direct {v15, v0, v1, v11, v10}, Lcom/google/android/gms/internal/measurement/wd;-><init>(Ljava/lang/String;ILcom/google/android/gms/internal/measurement/xd;I)V

    sput-object v15, Lcom/google/android/gms/internal/measurement/wd;->q:Lcom/google/android/gms/internal/measurement/wd;

    new-instance v0, Lcom/google/android/gms/internal/measurement/wd;

    const-string v1, "SFIXED64"

    const/16 v10, 0xf

    move-object/from16 v17, v2

    const/4 v2, 0x1

    invoke-direct {v0, v1, v10, v5, v2}, Lcom/google/android/gms/internal/measurement/wd;-><init>(Ljava/lang/String;ILcom/google/android/gms/internal/measurement/xd;I)V

    sput-object v0, Lcom/google/android/gms/internal/measurement/wd;->r:Lcom/google/android/gms/internal/measurement/wd;

    new-instance v1, Lcom/google/android/gms/internal/measurement/wd;

    const-string v2, "SINT32"

    const/16 v10, 0x10

    move-object/from16 v16, v0

    const/4 v0, 0x0

    invoke-direct {v1, v2, v10, v11, v0}, Lcom/google/android/gms/internal/measurement/wd;-><init>(Ljava/lang/String;ILcom/google/android/gms/internal/measurement/xd;I)V

    sput-object v1, Lcom/google/android/gms/internal/measurement/wd;->s:Lcom/google/android/gms/internal/measurement/wd;

    new-instance v2, Lcom/google/android/gms/internal/measurement/wd;

    const-string v10, "SINT64"

    const/16 v11, 0x11

    invoke-direct {v2, v10, v11, v5, v0}, Lcom/google/android/gms/internal/measurement/wd;-><init>(Ljava/lang/String;ILcom/google/android/gms/internal/measurement/xd;I)V

    sput-object v2, Lcom/google/android/gms/internal/measurement/wd;->t:Lcom/google/android/gms/internal/measurement/wd;

    move-object/from16 v18, v2

    move-object v10, v3

    move-object/from16 v2, v17

    move-object/from16 v3, v20

    move-object/from16 v5, v21

    move-object/from16 v11, v22

    move-object/from16 v17, v1

    move-object/from16 v1, v19

    filled-new-array/range {v1 .. v18}, [Lcom/google/android/gms/internal/measurement/wd;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/measurement/wd;->u:[Lcom/google/android/gms/internal/measurement/wd;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILcom/google/android/gms/internal/measurement/xd;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/google/android/gms/internal/measurement/wd;->a:Lcom/google/android/gms/internal/measurement/xd;

    iput p4, p0, Lcom/google/android/gms/internal/measurement/wd;->b:I

    return-void
.end method

.method public static values()[Lcom/google/android/gms/internal/measurement/wd;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/measurement/wd;->u:[Lcom/google/android/gms/internal/measurement/wd;

    invoke-virtual {v0}, [Lcom/google/android/gms/internal/measurement/wd;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/android/gms/internal/measurement/wd;

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/measurement/xd;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/wd;->a:Lcom/google/android/gms/internal/measurement/xd;

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/measurement/wd;->b:I

    return v0
.end method
