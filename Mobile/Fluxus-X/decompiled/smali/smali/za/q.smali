.class public final Lza/q;
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

.field public static final i:[Lk9/d;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lk9/d;

    const-string v1, "auth_api_credentials_begin_sign_in"

    const-wide/16 v2, 0x9

    invoke-direct {v0, v1, v2, v3}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v0, Lza/q;->a:Lk9/d;

    new-instance v1, Lk9/d;

    const-string v2, "auth_api_credentials_sign_out"

    const-wide/16 v3, 0x2

    invoke-direct {v1, v2, v3, v4}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v1, Lza/q;->b:Lk9/d;

    new-instance v2, Lk9/d;

    const-string v3, "auth_api_credentials_authorize"

    const-wide/16 v4, 0x1

    invoke-direct {v2, v3, v4, v5}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v2, Lza/q;->c:Lk9/d;

    new-instance v3, Lk9/d;

    const-string v6, "auth_api_credentials_revoke_access"

    invoke-direct {v3, v6, v4, v5}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v3, Lza/q;->d:Lk9/d;

    new-instance v4, Lk9/d;

    const-string v5, "auth_api_credentials_save_password"

    const-wide/16 v6, 0x4

    invoke-direct {v4, v5, v6, v7}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v4, Lza/q;->e:Lk9/d;

    new-instance v5, Lk9/d;

    const-string v6, "auth_api_credentials_get_sign_in_intent"

    const-wide/16 v7, 0x6

    invoke-direct {v5, v6, v7, v8}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v5, Lza/q;->f:Lk9/d;

    new-instance v6, Lk9/d;

    const-string v7, "auth_api_credentials_save_account_linking_token"

    const-wide/16 v8, 0x3

    invoke-direct {v6, v7, v8, v9}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v6, Lza/q;->g:Lk9/d;

    new-instance v7, Lk9/d;

    const-string v10, "auth_api_credentials_get_phone_number_hint_intent"

    invoke-direct {v7, v10, v8, v9}, Lk9/d;-><init>(Ljava/lang/String;J)V

    sput-object v7, Lza/q;->h:Lk9/d;

    filled-new-array/range {v0 .. v7}, [Lk9/d;

    move-result-object v0

    sput-object v0, Lza/q;->i:[Lk9/d;

    return-void
.end method
