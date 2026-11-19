.class public final Lbb/c;
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

.field public static final l:[Lk9/d;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, Lk9/d;

    const-string v1, "auth_blockstore"

    const-wide/16 v2, 0x3

    invoke-direct {v0, v1, v2, v3}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v0, Lbb/c;->a:Lk9/d;

    new-instance v1, Lk9/d;

    const-string v4, "blockstore_data_transfer"

    const-wide/16 v5, 0x1

    invoke-direct {v1, v4, v5, v6}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v1, Lbb/c;->b:Lk9/d;

    move-wide v3, v2

    new-instance v2, Lk9/d;

    const-string v7, "blockstore_notify_app_restore"

    invoke-direct {v2, v7, v5, v6}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v2, Lbb/c;->c:Lk9/d;

    move-wide v7, v3

    new-instance v3, Lk9/d;

    const-string v4, "blockstore_store_bytes_with_options"

    const-wide/16 v9, 0x2

    invoke-direct {v3, v4, v9, v10}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v3, Lbb/c;->d:Lk9/d;

    new-instance v4, Lk9/d;

    const-string v11, "blockstore_is_end_to_end_encryption_available"

    invoke-direct {v4, v11, v5, v6}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v4, Lbb/c;->e:Lk9/d;

    move-wide v11, v5

    new-instance v5, Lk9/d;

    const-string v6, "blockstore_enable_cloud_backup"

    invoke-direct {v5, v6, v11, v12}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v5, Lbb/c;->f:Lk9/d;

    new-instance v6, Lk9/d;

    const-string v13, "blockstore_delete_bytes"

    invoke-direct {v6, v13, v9, v10}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v6, Lbb/c;->g:Lk9/d;

    move-wide v8, v7

    new-instance v7, Lk9/d;

    const-string v10, "blockstore_retrieve_bytes_with_options"

    invoke-direct {v7, v10, v8, v9}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v7, Lbb/c;->h:Lk9/d;

    new-instance v8, Lk9/d;

    const-string v9, "auth_clear_restore_credential"

    invoke-direct {v8, v9, v11, v12}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v8, Lbb/c;->i:Lk9/d;

    new-instance v9, Lk9/d;

    const-string v10, "auth_create_restore_credential"

    invoke-direct {v9, v10, v11, v12}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v9, Lbb/c;->j:Lk9/d;

    new-instance v10, Lk9/d;

    const-string v13, "auth_get_restore_credential"

    invoke-direct {v10, v13, v11, v12}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v10, Lbb/c;->k:Lk9/d;

    filled-new-array/range {v0 .. v10}, [Lk9/d;

    move-result-object v0

    sput-object v0, Lbb/c;->l:[Lk9/d;

    return-void
.end method
