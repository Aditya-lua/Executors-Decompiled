.class public final Lba/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final A:Lk9/d;

.field public static final B:Lk9/d;

.field public static final C:Lk9/d;

.field public static final D:[Lk9/d;

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

.field public static final o:Lk9/d;

.field public static final p:Lk9/d;

.field public static final q:Lk9/d;

.field public static final r:Lk9/d;

.field public static final s:Lk9/d;

.field public static final t:Lk9/d;

.field public static final u:Lk9/d;

.field public static final v:Lk9/d;

.field public static final w:Lk9/d;

.field public static final x:Lk9/d;

.field public static final y:Lk9/d;

.field public static final z:Lk9/d;


# direct methods
.method static constructor <clinit>()V
    .locals 32

    new-instance v1, Lk9/d;

    const-string v0, "cancel_target_direct_transfer"

    const-wide/16 v2, 0x1

    invoke-direct {v1, v0, v2, v3}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v1, Lba/b;->a:Lk9/d;

    new-instance v0, Lk9/d;

    const-string v4, "delete_credential"

    invoke-direct {v0, v4, v2, v3}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v0, Lba/b;->b:Lk9/d;

    new-instance v4, Lk9/d;

    const-string v5, "delete_device_public_key"

    invoke-direct {v4, v5, v2, v3}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v4, Lba/b;->c:Lk9/d;

    move-object v5, v4

    new-instance v4, Lk9/d;

    const-string v6, "get_or_generate_device_public_key"

    invoke-direct {v4, v6, v2, v3}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v4, Lba/b;->d:Lk9/d;

    move-object v6, v5

    new-instance v5, Lk9/d;

    const-string v7, "get_passkeys"

    invoke-direct {v5, v7, v2, v3}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v5, Lba/b;->e:Lk9/d;

    move-object v7, v6

    new-instance v6, Lk9/d;

    const-string v8, "update_passkey"

    invoke-direct {v6, v8, v2, v3}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v6, Lba/b;->f:Lk9/d;

    move-object v8, v7

    new-instance v7, Lk9/d;

    const-string v9, "is_user_verifying_platform_authenticator_available_for_credential"

    invoke-direct {v7, v9, v2, v3}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v7, Lba/b;->g:Lk9/d;

    move-object v9, v8

    new-instance v8, Lk9/d;

    const-string v10, "is_user_verifying_platform_authenticator_available"

    invoke-direct {v8, v10, v2, v3}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v8, Lba/b;->h:Lk9/d;

    move-object v10, v9

    new-instance v9, Lk9/d;

    const-string v11, "privileged_api_list_credentials"

    const-wide/16 v12, 0x2

    invoke-direct {v9, v11, v12, v13}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v9, Lba/b;->i:Lk9/d;

    move-object v11, v10

    new-instance v10, Lk9/d;

    const-string v14, "start_target_direct_transfer"

    invoke-direct {v10, v14, v2, v3}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v10, Lba/b;->j:Lk9/d;

    move-object v14, v11

    new-instance v11, Lk9/d;

    const-string v15, "first_party_api_get_link_info"

    invoke-direct {v11, v15, v2, v3}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v11, Lba/b;->k:Lk9/d;

    new-instance v15, Lk9/d;

    const-string v2, "zero_party_api_register"

    const-wide/16 v12, 0x3

    invoke-direct {v15, v2, v12, v13}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v15, Lba/b;->l:Lk9/d;

    new-instance v2, Lk9/d;

    const-string v3, "zero_party_api_sign"

    invoke-direct {v2, v3, v12, v13}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v2, Lba/b;->m:Lk9/d;

    move-object v3, v14

    new-instance v14, Lk9/d;

    const-string v12, "zero_party_api_list_discoverable_credentials"

    move-object/from16 v22, v0

    move-object v13, v1

    const-wide/16 v0, 0x2

    invoke-direct {v14, v12, v0, v1}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v14, Lba/b;->n:Lk9/d;

    move-object v12, v15

    new-instance v15, Lk9/d;

    const-string v0, "zero_party_api_authenticate_passkey"

    move-object/from16 v23, v2

    const-wide/16 v1, 0x3

    invoke-direct {v15, v0, v1, v2}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v15, Lba/b;->o:Lk9/d;

    new-instance v0, Lk9/d;

    const-string v1, "zero_party_api_register_passkey"

    move-object/from16 v20, v3

    const-wide/16 v2, 0x1

    invoke-direct {v0, v1, v2, v3}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v0, Lba/b;->p:Lk9/d;

    new-instance v1, Lk9/d;

    move-object/from16 v16, v0

    const-string v0, "zero_party_api_register_passkey_with_sync_account"

    invoke-direct {v1, v0, v2, v3}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v1, Lba/b;->q:Lk9/d;

    new-instance v0, Lk9/d;

    move-object/from16 v17, v1

    const-string v1, "zero_party_api_get_hybrid_client_registration_pending_intent"

    invoke-direct {v0, v1, v2, v3}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v0, Lba/b;->r:Lk9/d;

    new-instance v1, Lk9/d;

    move-object/from16 v21, v0

    const-string v0, "zero_party_api_get_hybrid_client_sign_pending_intent"

    invoke-direct {v1, v0, v2, v3}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v1, Lba/b;->s:Lk9/d;

    new-instance v0, Lk9/d;

    move-object/from16 v24, v1

    const-string v1, "get_browser_hybrid_client_sign_pending_intent"

    invoke-direct {v0, v1, v2, v3}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v0, Lba/b;->t:Lk9/d;

    new-instance v1, Lk9/d;

    move-object/from16 v25, v0

    const-string v0, "get_browser_hybrid_client_registration_pending_intent"

    invoke-direct {v1, v0, v2, v3}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v1, Lba/b;->u:Lk9/d;

    new-instance v0, Lk9/d;

    const-string v2, "privileged_authenticate_passkey"

    move-object/from16 v28, v4

    const-wide/16 v3, 0x2

    invoke-direct {v0, v2, v3, v4}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v0, Lba/b;->v:Lk9/d;

    new-instance v2, Lk9/d;

    const-string v3, "privileged_register_passkey_with_sync_account"

    move-object/from16 v18, v0

    move-object v4, v1

    const-wide/16 v0, 0x1

    invoke-direct {v2, v3, v0, v1}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v2, Lba/b;->w:Lk9/d;

    new-instance v3, Lk9/d;

    move-object/from16 v19, v2

    const-string v2, "zero_party_api_get_privileged_hybrid_client_registration_pending_intent"

    invoke-direct {v3, v2, v0, v1}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v3, Lba/b;->x:Lk9/d;

    new-instance v2, Lk9/d;

    move-object/from16 v26, v3

    const-string v3, "zero_party_api_get_privileged_hybrid_client_sign_pending_intent"

    invoke-direct {v2, v3, v0, v1}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v2, Lba/b;->y:Lk9/d;

    new-instance v3, Lk9/d;

    move-object/from16 v27, v2

    const-string v2, "zero_party_api_get_fido_security_key_only_sign_pending_intent"

    invoke-direct {v3, v2, v0, v1}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v3, Lba/b;->z:Lk9/d;

    new-instance v2, Lk9/d;

    move-object/from16 v29, v3

    const-string v3, "zero_party_api_get_fido_security_key_only_registration_pending_intent"

    invoke-direct {v2, v3, v0, v1}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v2, Lba/b;->A:Lk9/d;

    new-instance v3, Lk9/d;

    move-object/from16 v30, v2

    const-string v2, "zero_party_api_get_privileged_fido_security_key_only_sign_pending_intent"

    invoke-direct {v3, v2, v0, v1}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v3, Lba/b;->B:Lk9/d;

    new-instance v2, Lk9/d;

    move-object/from16 v31, v3

    const-string v3, "zero_party_api_get_privileged_fido_security_key_only_registration_pending_intent"

    invoke-direct {v2, v3, v0, v1}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v2, Lba/b;->C:Lk9/d;

    move-object v1, v13

    move-object/from16 v3, v20

    move-object/from16 v13, v23

    move-object/from16 v20, v25

    move-object/from16 v25, v27

    move-object/from16 v27, v30

    move-object/from16 v23, v19

    move-object/from16 v19, v24

    move-object/from16 v24, v26

    move-object/from16 v26, v29

    move-object/from16 v29, v2

    move-object/from16 v2, v22

    move-object/from16 v22, v18

    move-object/from16 v18, v21

    move-object/from16 v21, v4

    move-object/from16 v4, v28

    move-object/from16 v28, v31

    filled-new-array/range {v1 .. v29}, [Lk9/d;

    move-result-object v0

    sput-object v0, Lba/b;->D:[Lk9/d;

    return-void
.end method
