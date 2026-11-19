.class public final Lhb/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lk9/d;

.field public static final b:Lk9/d;

.field public static final c:Lk9/d;

.field public static final d:Lk9/d;

.field public static final e:Lk9/d;

.field public static final f:Lk9/d;

.field public static final g:Lk9/d;

.field public static final h:Lk9/d;

.field public static final i:Lk9/d;

.field public static final j:Lk9/d;

.field public static final k:Lk9/d;

.field public static final l:Lk9/d;

.field public static final m:Lk9/d;

.field public static final n:Lk9/d;

.field public static final o:[Lk9/d;


# direct methods
.method static constructor <clinit>()V
    .locals 17

    new-instance v0, Lk9/d;

    const-string v1, "GET_CREDENTIAL"

    const-wide/16 v2, 0x1

    invoke-direct {v0, v1, v2, v3}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v0, Lhb/d;->a:Lk9/d;

    new-instance v1, Lk9/d;

    const-string v4, "CREDENTIAL_REGISTRY"

    invoke-direct {v1, v4, v2, v3}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v1, Lhb/d;->b:Lk9/d;

    new-instance v4, Lk9/d;

    const-string v5, "CLEAR_REGISTRY"

    const-wide/16 v6, 0x2

    invoke-direct {v4, v5, v6, v7}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v4, Lhb/d;->c:Lk9/d;

    new-instance v5, Lk9/d;

    const-string v6, "CLEAR_CREATION_OPTIONS"

    invoke-direct {v5, v6, v2, v3}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v5, Lhb/d;->d:Lk9/d;

    move-object v6, v4

    new-instance v4, Lk9/d;

    const-string v7, "CLEAR_CREDENTIAL_STATE"

    invoke-direct {v4, v7, v2, v3}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v4, Lhb/d;->e:Lk9/d;

    move-object v7, v5

    new-instance v5, Lk9/d;

    const-string v8, "CREATE_CREDENTIAL"

    const-wide/16 v9, 0x3

    invoke-direct {v5, v8, v9, v10}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v5, Lhb/d;->f:Lk9/d;

    move-object v8, v6

    new-instance v6, Lk9/d;

    const-string v11, "REGISTER_CREATION_OPTIONS"

    invoke-direct {v6, v11, v2, v3}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v6, Lhb/d;->g:Lk9/d;

    move-object v11, v7

    new-instance v7, Lk9/d;

    const-string v12, "REGISTER_EXPORT"

    invoke-direct {v7, v12, v2, v3}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v7, Lhb/d;->h:Lk9/d;

    move-object v12, v8

    new-instance v8, Lk9/d;

    const-string v13, "IMPORT_CREDENTIALS"

    invoke-direct {v8, v13, v2, v3}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v8, Lhb/d;->i:Lk9/d;

    new-instance v13, Lk9/d;

    const-string v14, "SIGNAL_CREDENTIAL_STATE"

    invoke-direct {v13, v14, v2, v3}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v13, Lhb/d;->j:Lk9/d;

    new-instance v14, Lk9/d;

    const-string v15, "CLEAR_EXPORT"

    invoke-direct {v14, v15, v2, v3}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v14, Lhb/d;->k:Lk9/d;

    move-object v3, v11

    new-instance v11, Lk9/d;

    const-string v2, "IMPORT_CREDENTIALS_FOR_DEVICE_SETUP"

    invoke-direct {v11, v2, v9, v10}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v11, Lhb/d;->l:Lk9/d;

    move-object v2, v12

    new-instance v12, Lk9/d;

    const-string v15, "EXPORT_CREDENTIALS_TO_DEVICE_SETUP"

    invoke-direct {v12, v15, v9, v10}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v12, Lhb/d;->m:Lk9/d;

    move-object v15, v13

    new-instance v13, Lk9/d;

    move-object/from16 v16, v0

    const-string v0, "GET_CREDENTIAL_TRANSFER_CAPABILITIES"

    invoke-direct {v13, v0, v9, v10}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v13, Lhb/d;->n:Lk9/d;

    move-object v10, v14

    move-object v9, v15

    move-object/from16 v0, v16

    filled-new-array/range {v0 .. v13}, [Lk9/d;

    move-result-object v0

    sput-object v0, Lhb/d;->o:[Lk9/d;

    return-void
.end method
