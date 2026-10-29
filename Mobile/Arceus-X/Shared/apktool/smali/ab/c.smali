.class public final Lab/c;
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

.field public static final l:[Lcom/google/android/gms/common/Feature;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, Lcom/google/android/gms/common/Feature;

    const-string v1, "auth_blockstore"

    const-wide/16 v2, 0x3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v0, Lab/c;->a:Lcom/google/android/gms/common/Feature;

    new-instance v1, Lcom/google/android/gms/common/Feature;

    const-string v4, "blockstore_data_transfer"

    const-wide/16 v5, 0x1

    invoke-direct {v1, v4, v5, v6}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v1, Lab/c;->b:Lcom/google/android/gms/common/Feature;

    move-wide v3, v2

    new-instance v2, Lcom/google/android/gms/common/Feature;

    const-string v7, "blockstore_notify_app_restore"

    invoke-direct {v2, v7, v5, v6}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v2, Lab/c;->c:Lcom/google/android/gms/common/Feature;

    move-wide v7, v3

    new-instance v3, Lcom/google/android/gms/common/Feature;

    const-string v4, "blockstore_store_bytes_with_options"

    const-wide/16 v9, 0x2

    invoke-direct {v3, v4, v9, v10}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v3, Lab/c;->d:Lcom/google/android/gms/common/Feature;

    new-instance v4, Lcom/google/android/gms/common/Feature;

    const-string v11, "blockstore_is_end_to_end_encryption_available"

    invoke-direct {v4, v11, v5, v6}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v4, Lab/c;->e:Lcom/google/android/gms/common/Feature;

    move-wide v11, v5

    new-instance v5, Lcom/google/android/gms/common/Feature;

    const-string v6, "blockstore_enable_cloud_backup"

    invoke-direct {v5, v6, v11, v12}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v5, Lab/c;->f:Lcom/google/android/gms/common/Feature;

    new-instance v6, Lcom/google/android/gms/common/Feature;

    const-string v13, "blockstore_delete_bytes"

    invoke-direct {v6, v13, v9, v10}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v6, Lab/c;->g:Lcom/google/android/gms/common/Feature;

    move-wide v8, v7

    new-instance v7, Lcom/google/android/gms/common/Feature;

    const-string v10, "blockstore_retrieve_bytes_with_options"

    invoke-direct {v7, v10, v8, v9}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v7, Lab/c;->h:Lcom/google/android/gms/common/Feature;

    new-instance v8, Lcom/google/android/gms/common/Feature;

    const-string v9, "auth_clear_restore_credential"

    invoke-direct {v8, v9, v11, v12}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v8, Lab/c;->i:Lcom/google/android/gms/common/Feature;

    new-instance v9, Lcom/google/android/gms/common/Feature;

    const-string v10, "auth_create_restore_credential"

    invoke-direct {v9, v10, v11, v12}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v9, Lab/c;->j:Lcom/google/android/gms/common/Feature;

    new-instance v10, Lcom/google/android/gms/common/Feature;

    const-string v13, "auth_get_restore_credential"

    invoke-direct {v10, v13, v11, v12}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v10, Lab/c;->k:Lcom/google/android/gms/common/Feature;

    filled-new-array/range {v0 .. v10}, [Lcom/google/android/gms/common/Feature;

    move-result-object v0

    sput-object v0, Lab/c;->l:[Lcom/google/android/gms/common/Feature;

    return-void
.end method
