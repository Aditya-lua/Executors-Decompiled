.class public final Laa/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final A:Lcom/google/android/gms/common/Feature;

.field public static final B:Lcom/google/android/gms/common/Feature;

.field public static final C:Lcom/google/android/gms/common/Feature;

.field public static final D:[Lcom/google/android/gms/common/Feature;

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

.field public static final o:Lcom/google/android/gms/common/Feature;

.field public static final p:Lcom/google/android/gms/common/Feature;

.field public static final q:Lcom/google/android/gms/common/Feature;

.field public static final r:Lcom/google/android/gms/common/Feature;

.field public static final s:Lcom/google/android/gms/common/Feature;

.field public static final t:Lcom/google/android/gms/common/Feature;

.field public static final u:Lcom/google/android/gms/common/Feature;

.field public static final v:Lcom/google/android/gms/common/Feature;

.field public static final w:Lcom/google/android/gms/common/Feature;

.field public static final x:Lcom/google/android/gms/common/Feature;

.field public static final y:Lcom/google/android/gms/common/Feature;

.field public static final z:Lcom/google/android/gms/common/Feature;


# direct methods
.method static constructor <clinit>()V
    .locals 32

    new-instance v1, Lcom/google/android/gms/common/Feature;

    const-string v0, "cancel_target_direct_transfer"

    const-wide/16 v2, 0x1

    invoke-direct {v1, v0, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v1, Laa/b;->a:Lcom/google/android/gms/common/Feature;

    new-instance v0, Lcom/google/android/gms/common/Feature;

    const-string v4, "delete_credential"

    invoke-direct {v0, v4, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v0, Laa/b;->b:Lcom/google/android/gms/common/Feature;

    new-instance v4, Lcom/google/android/gms/common/Feature;

    const-string v5, "delete_device_public_key"

    invoke-direct {v4, v5, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v4, Laa/b;->c:Lcom/google/android/gms/common/Feature;

    move-object v5, v4

    new-instance v4, Lcom/google/android/gms/common/Feature;

    const-string v6, "get_or_generate_device_public_key"

    invoke-direct {v4, v6, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v4, Laa/b;->d:Lcom/google/android/gms/common/Feature;

    move-object v6, v5

    new-instance v5, Lcom/google/android/gms/common/Feature;

    const-string v7, "get_passkeys"

    invoke-direct {v5, v7, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v5, Laa/b;->e:Lcom/google/android/gms/common/Feature;

    move-object v7, v6

    new-instance v6, Lcom/google/android/gms/common/Feature;

    const-string v8, "update_passkey"

    invoke-direct {v6, v8, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v6, Laa/b;->f:Lcom/google/android/gms/common/Feature;

    move-object v8, v7

    new-instance v7, Lcom/google/android/gms/common/Feature;

    const-string v9, "is_user_verifying_platform_authenticator_available_for_credential"

    invoke-direct {v7, v9, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v7, Laa/b;->g:Lcom/google/android/gms/common/Feature;

    move-object v9, v8

    new-instance v8, Lcom/google/android/gms/common/Feature;

    const-string v10, "is_user_verifying_platform_authenticator_available"

    invoke-direct {v8, v10, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v8, Laa/b;->h:Lcom/google/android/gms/common/Feature;

    move-object v10, v9

    new-instance v9, Lcom/google/android/gms/common/Feature;

    const-string v11, "privileged_api_list_credentials"

    const-wide/16 v12, 0x2

    invoke-direct {v9, v11, v12, v13}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v9, Laa/b;->i:Lcom/google/android/gms/common/Feature;

    move-object v11, v10

    new-instance v10, Lcom/google/android/gms/common/Feature;

    const-string v14, "start_target_direct_transfer"

    invoke-direct {v10, v14, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v10, Laa/b;->j:Lcom/google/android/gms/common/Feature;

    move-object v14, v11

    new-instance v11, Lcom/google/android/gms/common/Feature;

    const-string v15, "first_party_api_get_link_info"

    invoke-direct {v11, v15, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v11, Laa/b;->k:Lcom/google/android/gms/common/Feature;

    new-instance v15, Lcom/google/android/gms/common/Feature;

    const-string v2, "zero_party_api_register"

    const-wide/16 v12, 0x3

    invoke-direct {v15, v2, v12, v13}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v15, Laa/b;->l:Lcom/google/android/gms/common/Feature;

    new-instance v2, Lcom/google/android/gms/common/Feature;

    const-string v3, "zero_party_api_sign"

    invoke-direct {v2, v3, v12, v13}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v2, Laa/b;->m:Lcom/google/android/gms/common/Feature;

    move-object v3, v14

    new-instance v14, Lcom/google/android/gms/common/Feature;

    const-string v12, "zero_party_api_list_discoverable_credentials"

    move-object/from16 v22, v0

    move-object v13, v1

    const-wide/16 v0, 0x2

    invoke-direct {v14, v12, v0, v1}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v14, Laa/b;->n:Lcom/google/android/gms/common/Feature;

    move-object v12, v15

    new-instance v15, Lcom/google/android/gms/common/Feature;

    const-string v0, "zero_party_api_authenticate_passkey"

    move-object/from16 v23, v2

    const-wide/16 v1, 0x3

    invoke-direct {v15, v0, v1, v2}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v15, Laa/b;->o:Lcom/google/android/gms/common/Feature;

    new-instance v0, Lcom/google/android/gms/common/Feature;

    const-string v1, "zero_party_api_register_passkey"

    move-object/from16 v20, v3

    const-wide/16 v2, 0x1

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v0, Laa/b;->p:Lcom/google/android/gms/common/Feature;

    new-instance v1, Lcom/google/android/gms/common/Feature;

    move-object/from16 v16, v0

    const-string v0, "zero_party_api_register_passkey_with_sync_account"

    invoke-direct {v1, v0, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v1, Laa/b;->q:Lcom/google/android/gms/common/Feature;

    new-instance v0, Lcom/google/android/gms/common/Feature;

    move-object/from16 v17, v1

    const-string v1, "zero_party_api_get_hybrid_client_registration_pending_intent"

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v0, Laa/b;->r:Lcom/google/android/gms/common/Feature;

    new-instance v1, Lcom/google/android/gms/common/Feature;

    move-object/from16 v21, v0

    const-string v0, "zero_party_api_get_hybrid_client_sign_pending_intent"

    invoke-direct {v1, v0, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v1, Laa/b;->s:Lcom/google/android/gms/common/Feature;

    new-instance v0, Lcom/google/android/gms/common/Feature;

    move-object/from16 v24, v1

    const-string v1, "get_browser_hybrid_client_sign_pending_intent"

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v0, Laa/b;->t:Lcom/google/android/gms/common/Feature;

    new-instance v1, Lcom/google/android/gms/common/Feature;

    move-object/from16 v25, v0

    const-string v0, "get_browser_hybrid_client_registration_pending_intent"

    invoke-direct {v1, v0, v2, v3}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v1, Laa/b;->u:Lcom/google/android/gms/common/Feature;

    new-instance v0, Lcom/google/android/gms/common/Feature;

    const-string v2, "privileged_authenticate_passkey"

    move-object/from16 v28, v4

    const-wide/16 v3, 0x2

    invoke-direct {v0, v2, v3, v4}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v0, Laa/b;->v:Lcom/google/android/gms/common/Feature;

    new-instance v2, Lcom/google/android/gms/common/Feature;

    const-string v3, "privileged_register_passkey_with_sync_account"

    move-object/from16 v18, v0

    move-object v4, v1

    const-wide/16 v0, 0x1

    invoke-direct {v2, v3, v0, v1}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v2, Laa/b;->w:Lcom/google/android/gms/common/Feature;

    new-instance v3, Lcom/google/android/gms/common/Feature;

    move-object/from16 v19, v2

    const-string v2, "zero_party_api_get_privileged_hybrid_client_registration_pending_intent"

    invoke-direct {v3, v2, v0, v1}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v3, Laa/b;->x:Lcom/google/android/gms/common/Feature;

    new-instance v2, Lcom/google/android/gms/common/Feature;

    move-object/from16 v26, v3

    const-string v3, "zero_party_api_get_privileged_hybrid_client_sign_pending_intent"

    invoke-direct {v2, v3, v0, v1}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v2, Laa/b;->y:Lcom/google/android/gms/common/Feature;

    new-instance v3, Lcom/google/android/gms/common/Feature;

    move-object/from16 v27, v2

    const-string v2, "zero_party_api_get_fido_security_key_only_sign_pending_intent"

    invoke-direct {v3, v2, v0, v1}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v3, Laa/b;->z:Lcom/google/android/gms/common/Feature;

    new-instance v2, Lcom/google/android/gms/common/Feature;

    move-object/from16 v29, v3

    const-string v3, "zero_party_api_get_fido_security_key_only_registration_pending_intent"

    invoke-direct {v2, v3, v0, v1}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v2, Laa/b;->A:Lcom/google/android/gms/common/Feature;

    new-instance v3, Lcom/google/android/gms/common/Feature;

    move-object/from16 v30, v2

    const-string v2, "zero_party_api_get_privileged_fido_security_key_only_sign_pending_intent"

    invoke-direct {v3, v2, v0, v1}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v3, Laa/b;->B:Lcom/google/android/gms/common/Feature;

    new-instance v2, Lcom/google/android/gms/common/Feature;

    move-object/from16 v31, v3

    const-string v3, "zero_party_api_get_privileged_fido_security_key_only_registration_pending_intent"

    invoke-direct {v2, v3, v0, v1}, Lcom/google/android/gms/common/Feature;-><init>(Ljava/lang/String;J)V

    sput-object v2, Laa/b;->C:Lcom/google/android/gms/common/Feature;

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

    filled-new-array/range {v1 .. v29}, [Lcom/google/android/gms/common/Feature;

    move-result-object v0

    sput-object v0, Laa/b;->D:[Lcom/google/android/gms/common/Feature;

    return-void
.end method
