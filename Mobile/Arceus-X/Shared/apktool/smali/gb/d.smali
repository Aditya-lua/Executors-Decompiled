.class public final Lgb/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/google/android/gms/common/Feature;

.field public static final b:Lcom/google/android/gms/common/Feature;

.field public static final c:Lcom/google/android/gms/common/Feature;

.field public static final d:Lcom/google/android/gms/common/Feature;

.field public static final e:Lcom/google/android/gms/common/Feature;

.field public static final f:Lcom/google/android/gms/common/Feature;

.field public static final g:Lcom/google/android/gms/common/Feature;

.field public static final h:Lcom/google/android/gms/common/Feature;

.field public static final i:Lcom/google/android/gms/common/Feature;

.field public static final j:Lcom/google/android/gms/common/Feature;

.field public static final k:Lcom/google/android/gms/common/Feature;

.field public static final l:Lcom/google/android/gms/common/Feature;

.field public static final m:Lcom/google/android/gms/common/Feature;

.field public static final n:Lcom/google/android/gms/common/Feature;

.field public static final o:[Lcom/google/android/gms/common/Feature;


# direct methods
.method static constructor <clinit>()V
    .locals 17

    new-instance v0, Lcom/google/android/gms/common/Feature;

    const-string v1, "GET_CREDENTIAL"

    const-wide/16 v2, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v0, Lgb/d;->a:Lcom/google/android/gms/common/Feature;

    new-instance v1, Lcom/google/android/gms/common/Feature;

    const-string v4, "CREDENTIAL_REGISTRY"

    invoke-direct {v1, v4, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v1, Lgb/d;->b:Lcom/google/android/gms/common/Feature;

    new-instance v4, Lcom/google/android/gms/common/Feature;

    const-string v5, "CLEAR_REGISTRY"

    const-wide/16 v6, 0x2

    invoke-direct {v4, v5, v6, v7}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v4, Lgb/d;->c:Lcom/google/android/gms/common/Feature;

    new-instance v5, Lcom/google/android/gms/common/Feature;

    const-string v6, "CLEAR_CREATION_OPTIONS"

    invoke-direct {v5, v6, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v5, Lgb/d;->d:Lcom/google/android/gms/common/Feature;

    move-object v6, v4

    new-instance v4, Lcom/google/android/gms/common/Feature;

    const-string v7, "CLEAR_CREDENTIAL_STATE"

    invoke-direct {v4, v7, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v4, Lgb/d;->e:Lcom/google/android/gms/common/Feature;

    move-object v7, v5

    new-instance v5, Lcom/google/android/gms/common/Feature;

    const-string v8, "CREATE_CREDENTIAL"

    const-wide/16 v9, 0x3

    invoke-direct {v5, v8, v9, v10}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v5, Lgb/d;->f:Lcom/google/android/gms/common/Feature;

    move-object v8, v6

    new-instance v6, Lcom/google/android/gms/common/Feature;

    const-string v11, "REGISTER_CREATION_OPTIONS"

    invoke-direct {v6, v11, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v6, Lgb/d;->g:Lcom/google/android/gms/common/Feature;

    move-object v11, v7

    new-instance v7, Lcom/google/android/gms/common/Feature;

    const-string v12, "REGISTER_EXPORT"

    invoke-direct {v7, v12, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v7, Lgb/d;->h:Lcom/google/android/gms/common/Feature;

    move-object v12, v8

    new-instance v8, Lcom/google/android/gms/common/Feature;

    const-string v13, "IMPORT_CREDENTIALS"

    invoke-direct {v8, v13, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v8, Lgb/d;->i:Lcom/google/android/gms/common/Feature;

    new-instance v13, Lcom/google/android/gms/common/Feature;

    const-string v14, "SIGNAL_CREDENTIAL_STATE"

    invoke-direct {v13, v14, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v13, Lgb/d;->j:Lcom/google/android/gms/common/Feature;

    new-instance v14, Lcom/google/android/gms/common/Feature;

    const-string v15, "CLEAR_EXPORT"

    invoke-direct {v14, v15, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v14, Lgb/d;->k:Lcom/google/android/gms/common/Feature;

    move-object v3, v11

    new-instance v11, Lcom/google/android/gms/common/Feature;

    const-string v2, "IMPORT_CREDENTIALS_FOR_DEVICE_SETUP"

    invoke-direct {v11, v2, v9, v10}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v11, Lgb/d;->l:Lcom/google/android/gms/common/Feature;

    move-object v2, v12

    new-instance v12, Lcom/google/android/gms/common/Feature;

    const-string v15, "EXPORT_CREDENTIALS_TO_DEVICE_SETUP"

    invoke-direct {v12, v15, v9, v10}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v12, Lgb/d;->m:Lcom/google/android/gms/common/Feature;

    move-object v15, v13

    new-instance v13, Lcom/google/android/gms/common/Feature;

    move-object/from16 v16, v0

    const-string v0, "GET_CREDENTIAL_TRANSFER_CAPABILITIES"

    invoke-direct {v13, v0, v9, v10}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v13, Lgb/d;->n:Lcom/google/android/gms/common/Feature;

    move-object v10, v14

    move-object v9, v15

    move-object/from16 v0, v16

    filled-new-array/range {v0 .. v13}, [Lcom/google/android/gms/common/Feature;

    move-result-object v0

    sput-object v0, Lgb/d;->o:[Lcom/google/android/gms/common/Feature;

    return-void
.end method
