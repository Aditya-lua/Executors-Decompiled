.class public final Lfb/r4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfb/q4;


# static fields
.field public static final a:Lfb/q;

.field public static final b:Lfb/q;

.field public static final c:Lfb/q;

.field public static final d:Lfb/q;

.field public static final e:Lfb/q;

.field public static final f:Lfb/q;

.field public static final g:Lfb/q;

.field public static final h:Lfb/q;

.field public static final i:Lfb/q;

.field public static final j:Lfb/q;

.field public static final k:Lfb/q;

.field public static final l:Lfb/q;

.field public static final m:Lfb/q;

.field public static final n:Lfb/q;

.field public static final o:Lfb/q;

.field public static final p:Lfb/q;

.field public static final q:Lfb/q;

.field public static final r:Lfb/q;

.field public static final s:Lfb/q;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lfb/y;

    const-string v1, "com.google.android.gms.fido"

    invoke-direct {v0, v1}, Lfb/y;-><init>(Ljava/lang/String;)V

    const-string v1, "FIDO"

    invoke-static {v1}, Lfb/h1;->m(Ljava/lang/Object;)Lfb/h1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lfb/y;->e(Ljava/util/Set;)Lfb/y;

    move-result-object v0

    invoke-virtual {v0}, Lfb/y;->d()Lfb/y;

    move-result-object v0

    const-string v1, "Passkeys__check_all_keys"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lfb/y;->c(Ljava/lang/String;Z)Lfb/q;

    move-result-object v1

    sput-object v1, Lfb/r4;->a:Lfb/q;

    const-string v1, "Passkeys__check_sync_status"

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3}, Lfb/y;->c(Ljava/lang/String;Z)Lfb/q;

    move-result-object v1

    sput-object v1, Lfb/r4;->b:Lfb/q;

    const-string v1, "Passkeys__client_data_hash_override_for_security_keys"

    invoke-virtual {v0, v1, v2}, Lfb/y;->c(Ljava/lang/String;Z)Lfb/q;

    move-result-object v1

    sput-object v1, Lfb/r4;->c:Lfb/q;

    const-string v1, "Passkeys__direct_assetlinks"

    invoke-virtual {v0, v1, v2}, Lfb/y;->c(Ljava/lang/String;Z)Lfb/q;

    move-result-object v1

    sput-object v1, Lfb/r4;->d:Lfb/q;

    const-string v1, "Passkeys__direct_assetlinks_cache_seconds"

    const-wide/32 v4, 0x93a80

    invoke-virtual {v0, v1, v4, v5}, Lfb/y;->a(Ljava/lang/String;J)Lfb/q;

    move-result-object v1

    sput-object v1, Lfb/r4;->e:Lfb/q;

    const-string v1, "Passkeys__direct_assetlinks_rpids"

    const-string v4, "*"

    invoke-virtual {v0, v1, v4}, Lfb/y;->b(Ljava/lang/String;Ljava/lang/String;)Lfb/q;

    move-result-object v1

    sput-object v1, Lfb/r4;->f:Lfb/q;

    const-string v1, "Passkeys__dispatch_prf_via_credman"

    invoke-virtual {v0, v1, v3}, Lfb/y;->c(Ljava/lang/String;Z)Lfb/q;

    move-result-object v1

    sput-object v1, Lfb/r4;->g:Lfb/q;

    const-string v1, "Passkeys__help_center_url"

    const-string v4, "https://support.google.com/accounts/answer/6208650"

    invoke-virtual {v0, v1, v4}, Lfb/y;->b(Ljava/lang/String;Ljava/lang/String;)Lfb/q;

    move-result-object v1

    sput-object v1, Lfb/r4;->h:Lfb/q;

    const-string v1, "Passkeys__hide_consent_page_in_registration_enabled"

    invoke-virtual {v0, v1, v2}, Lfb/y;->c(Ljava/lang/String;Z)Lfb/q;

    move-result-object v1

    sput-object v1, Lfb/r4;->i:Lfb/q;

    const-string v1, "Passkeys__ignore_stop_during_hybrid_request"

    invoke-virtual {v0, v1, v2}, Lfb/y;->c(Ljava/lang/String;Z)Lfb/q;

    move-result-object v1

    sput-object v1, Lfb/r4;->j:Lfb/q;

    const-string v1, "Passkeys__json_for_parcelables"

    invoke-virtual {v0, v1, v2}, Lfb/y;->c(Ljava/lang/String;Z)Lfb/q;

    move-result-object v1

    sput-object v1, Lfb/r4;->k:Lfb/q;

    const-string v1, "Passkeys__passkey_entries_use_gpm_icon"

    invoke-virtual {v0, v1, v2}, Lfb/y;->c(Ljava/lang/String;Z)Lfb/q;

    move-result-object v1

    sput-object v1, Lfb/r4;->l:Lfb/q;

    const-string v1, "Passkeys__reencrypt_passkey"

    invoke-virtual {v0, v1, v2}, Lfb/y;->c(Ljava/lang/String;Z)Lfb/q;

    move-result-object v1

    sput-object v1, Lfb/r4;->m:Lfb/q;

    const-string v1, "Passkeys__return_cryptauth_status"

    invoke-virtual {v0, v1, v2}, Lfb/y;->c(Ljava/lang/String;Z)Lfb/q;

    move-result-object v1

    sput-object v1, Lfb/r4;->n:Lfb/q;

    const-string v1, "Passkeys__set_key_version"

    invoke-virtual {v0, v1, v3}, Lfb/y;->c(Ljava/lang/String;Z)Lfb/q;

    move-result-object v1

    sput-object v1, Lfb/r4;->o:Lfb/q;

    const-string v1, "Passkeys__should_show_welcome_fragment"

    const-wide/16 v3, -0x1

    invoke-virtual {v0, v1, v3, v4}, Lfb/y;->a(Ljava/lang/String;J)Lfb/q;

    move-result-object v1

    sput-object v1, Lfb/r4;->p:Lfb/q;

    const-string v1, "Passkeys__skip_consent_after_retrieval"

    invoke-virtual {v0, v1, v2}, Lfb/y;->c(Ljava/lang/String;Z)Lfb/q;

    move-result-object v1

    sput-object v1, Lfb/r4;->q:Lfb/q;

    const-string v1, "Passkeys__skip_consent_screen"

    invoke-virtual {v0, v1, v2}, Lfb/y;->c(Ljava/lang/String;Z)Lfb/q;

    move-result-object v1

    sput-object v1, Lfb/r4;->r:Lfb/q;

    const-string v1, "Passkeys__use_result_receiver"

    invoke-virtual {v0, v1, v2}, Lfb/y;->c(Ljava/lang/String;Z)Lfb/q;

    move-result-object v0

    sput-object v0, Lfb/r4;->s:Lfb/q;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()Z
    .locals 1

    sget-object v0, Lfb/r4;->k:Lfb/q;

    invoke-virtual {v0}, Lfb/q;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
