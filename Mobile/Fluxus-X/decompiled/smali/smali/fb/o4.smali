.class public final Lfb/o4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfb/n4;


# static fields
.field public static final a:Lfb/q;

.field public static final b:Lfb/q;

.field public static final c:Lfb/q;

.field public static final d:Lfb/q;

.field public static final e:Lfb/q;

.field public static final f:Lfb/q;

.field public static final g:Lfb/q;


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

    const-string v1, "Hybrid__client_enabled"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lfb/y;->c(Ljava/lang/String;Z)Lfb/q;

    move-result-object v1

    sput-object v1, Lfb/o4;->a:Lfb/q;

    const-string v1, "Hybrid__disavow_location_permissions"

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3}, Lfb/y;->c(Ljava/lang/String;Z)Lfb/q;

    move-result-object v1

    sput-object v1, Lfb/o4;->b:Lfb/q;

    const-string v1, "Hybrid__number_of_seconds_to_wait_for_bt_scanning_radio_to_be_ready"

    const-wide/16 v4, 0x3

    invoke-virtual {v0, v1, v4, v5}, Lfb/y;->a(Ljava/lang/String;J)Lfb/q;

    move-result-object v1

    sput-object v1, Lfb/o4;->c:Lfb/q;

    const-string v1, "Hybrid__number_of_seconds_to_wait_for_bt_scanning_turning_on"

    invoke-virtual {v0, v1, v4, v5}, Lfb/y;->a(Ljava/lang/String;J)Lfb/q;

    move-result-object v1

    sput-object v1, Lfb/o4;->d:Lfb/q;

    const-string v1, "Hybrid__prf_eval_during_create"

    invoke-virtual {v0, v1, v3}, Lfb/y;->c(Ljava/lang/String;Z)Lfb/q;

    move-result-object v1

    sput-object v1, Lfb/o4;->e:Lfb/q;

    const-string v1, "Hybrid__use_hybrid_for_server_link"

    invoke-virtual {v0, v1, v2}, Lfb/y;->c(Ljava/lang/String;Z)Lfb/q;

    move-result-object v1

    sput-object v1, Lfb/o4;->f:Lfb/q;

    const-string v1, "Hybrid__websocket_close_socket"

    invoke-virtual {v0, v1, v3}, Lfb/y;->c(Ljava/lang/String;Z)Lfb/q;

    move-result-object v0

    sput-object v0, Lfb/o4;->g:Lfb/q;

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

    sget-object v0, Lfb/o4;->a:Lfb/q;

    invoke-virtual {v0}, Lfb/q;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
