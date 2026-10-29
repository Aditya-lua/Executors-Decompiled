.class public final Leb/r4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leb/q4;


# static fields
.field public static final a:Leb/q;

.field public static final b:Leb/q;

.field public static final c:Leb/q;

.field public static final d:Leb/q;

.field public static final e:Leb/q;

.field public static final f:Leb/q;

.field public static final g:Leb/q;

.field public static final h:Leb/q;

.field public static final i:Leb/q;

.field public static final j:Leb/q;

.field public static final k:Leb/q;

.field public static final l:Leb/q;

.field public static final m:Leb/q;

.field public static final n:Leb/q;

.field public static final o:Leb/q;

.field public static final p:Leb/q;

.field public static final q:Leb/q;

.field public static final r:Leb/q;

.field public static final s:Leb/q;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Leb/y;

    const-string v1, "com.google.android.gms.fido"

    invoke-direct {v0, v1}, Leb/y;-><init>(Ljava/lang/String;)V

    const-string v1, "FIDO"

    invoke-static {v1}, Leb/h1;->m(Ljava/lang/Object;)Leb/h1;

    move-result-object v1

    invoke-virtual {v0, v1}, Leb/y;->e(Ljava/util/Set;)Leb/y;

    move-result-object v0

    invoke-virtual {v0}, Leb/y;->d()Leb/y;

    move-result-object v0

    const-string v1, "Passkeys__check_all_keys"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Leb/y;->c(Ljava/lang/String;Z)Leb/q;

    move-result-object v1

    sput-object v1, Leb/r4;->a:Leb/q;

    const-string v1, "Passkeys__check_sync_status"

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3}, Leb/y;->c(Ljava/lang/String;Z)Leb/q;

    move-result-object v1

    sput-object v1, Leb/r4;->b:Leb/q;

    const-string v1, "Passkeys__client_data_hash_override_for_security_keys"

    invoke-virtual {v0, v1, v2}, Leb/y;->c(Ljava/lang/String;Z)Leb/q;

    move-result-object v1

    sput-object v1, Leb/r4;->c:Leb/q;

    const-string v1, "Passkeys__direct_assetlinks"

    invoke-virtual {v0, v1, v2}, Leb/y;->c(Ljava/lang/String;Z)Leb/q;

    move-result-object v1

    sput-object v1, Leb/r4;->d:Leb/q;

    const-string v1, "Passkeys__direct_assetlinks_cache_seconds"

    const-wide/32 v4, 0x93a80

    invoke-virtual {v0, v1, v4, v5}, Leb/y;->a(Ljava/lang/String;J)Leb/q;

    move-result-object v1

    sput-object v1, Leb/r4;->e:Leb/q;

    const-string v1, "Passkeys__direct_assetlinks_rpids"

    const-string v4, "*"

    invoke-virtual {v0, v1, v4}, Leb/y;->b(Ljava/lang/String;Ljava/lang/String;)Leb/q;

    move-result-object v1

    sput-object v1, Leb/r4;->f:Leb/q;

    const-string v1, "Passkeys__dispatch_prf_via_credman"

    invoke-virtual {v0, v1, v3}, Leb/y;->c(Ljava/lang/String;Z)Leb/q;

    move-result-object v1

    sput-object v1, Leb/r4;->g:Leb/q;

    const-string v1, "Passkeys__help_center_url"

    const-string v4, "https://support.google.com/accounts/answer/6208650"

    invoke-virtual {v0, v1, v4}, Leb/y;->b(Ljava/lang/String;Ljava/lang/String;)Leb/q;

    move-result-object v1

    sput-object v1, Leb/r4;->h:Leb/q;

    const-string v1, "Passkeys__hide_consent_page_in_registration_enabled"

    invoke-virtual {v0, v1, v2}, Leb/y;->c(Ljava/lang/String;Z)Leb/q;

    move-result-object v1

    sput-object v1, Leb/r4;->i:Leb/q;

    const-string v1, "Passkeys__ignore_stop_during_hybrid_request"

    invoke-virtual {v0, v1, v2}, Leb/y;->c(Ljava/lang/String;Z)Leb/q;

    move-result-object v1

    sput-object v1, Leb/r4;->j:Leb/q;

    const-string v1, "Passkeys__json_for_parcelables"

    invoke-virtual {v0, v1, v2}, Leb/y;->c(Ljava/lang/String;Z)Leb/q;

    move-result-object v1

    sput-object v1, Leb/r4;->k:Leb/q;

    const-string v1, "Passkeys__passkey_entries_use_gpm_icon"

    invoke-virtual {v0, v1, v2}, Leb/y;->c(Ljava/lang/String;Z)Leb/q;

    move-result-object v1

    sput-object v1, Leb/r4;->l:Leb/q;

    const-string v1, "Passkeys__reencrypt_passkey"

    invoke-virtual {v0, v1, v2}, Leb/y;->c(Ljava/lang/String;Z)Leb/q;

    move-result-object v1

    sput-object v1, Leb/r4;->m:Leb/q;

    const-string v1, "Passkeys__return_cryptauth_status"

    invoke-virtual {v0, v1, v2}, Leb/y;->c(Ljava/lang/String;Z)Leb/q;

    move-result-object v1

    sput-object v1, Leb/r4;->n:Leb/q;

    const-string v1, "Passkeys__set_key_version"

    invoke-virtual {v0, v1, v3}, Leb/y;->c(Ljava/lang/String;Z)Leb/q;

    move-result-object v1

    sput-object v1, Leb/r4;->o:Leb/q;

    const-string v1, "Passkeys__should_show_welcome_fragment"

    const-wide/16 v3, -0x1

    invoke-virtual {v0, v1, v3, v4}, Leb/y;->a(Ljava/lang/String;J)Leb/q;

    move-result-object v1

    sput-object v1, Leb/r4;->p:Leb/q;

    const-string v1, "Passkeys__skip_consent_after_retrieval"

    invoke-virtual {v0, v1, v2}, Leb/y;->c(Ljava/lang/String;Z)Leb/q;

    move-result-object v1

    sput-object v1, Leb/r4;->q:Leb/q;

    const-string v1, "Passkeys__skip_consent_screen"

    invoke-virtual {v0, v1, v2}, Leb/y;->c(Ljava/lang/String;Z)Leb/q;

    move-result-object v1

    sput-object v1, Leb/r4;->r:Leb/q;

    const-string v1, "Passkeys__use_result_receiver"

    invoke-virtual {v0, v1, v2}, Leb/y;->c(Ljava/lang/String;Z)Leb/q;

    move-result-object v0

    sput-object v0, Leb/r4;->s:Leb/q;

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

    sget-object v0, Leb/r4;->k:Leb/q;

    invoke-virtual {v0}, Leb/q;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
