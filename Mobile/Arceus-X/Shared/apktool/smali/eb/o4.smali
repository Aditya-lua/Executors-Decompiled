.class public final Leb/o4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leb/n4;


# static fields
.field public static final a:Leb/q;

.field public static final b:Leb/q;

.field public static final c:Leb/q;

.field public static final d:Leb/q;

.field public static final e:Leb/q;

.field public static final f:Leb/q;

.field public static final g:Leb/q;


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

    const-string v1, "Hybrid__client_enabled"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Leb/y;->c(Ljava/lang/String;Z)Leb/q;

    move-result-object v1

    sput-object v1, Leb/o4;->a:Leb/q;

    const-string v1, "Hybrid__disavow_location_permissions"

    const/4 v3, 0x1

    invoke-virtual {v0, v1, v3}, Leb/y;->c(Ljava/lang/String;Z)Leb/q;

    move-result-object v1

    sput-object v1, Leb/o4;->b:Leb/q;

    const-string v1, "Hybrid__number_of_seconds_to_wait_for_bt_scanning_radio_to_be_ready"

    const-wide/16 v4, 0x3

    invoke-virtual {v0, v1, v4, v5}, Leb/y;->a(Ljava/lang/String;J)Leb/q;

    move-result-object v1

    sput-object v1, Leb/o4;->c:Leb/q;

    const-string v1, "Hybrid__number_of_seconds_to_wait_for_bt_scanning_turning_on"

    invoke-virtual {v0, v1, v4, v5}, Leb/y;->a(Ljava/lang/String;J)Leb/q;

    move-result-object v1

    sput-object v1, Leb/o4;->d:Leb/q;

    const-string v1, "Hybrid__prf_eval_during_create"

    invoke-virtual {v0, v1, v3}, Leb/y;->c(Ljava/lang/String;Z)Leb/q;

    move-result-object v1

    sput-object v1, Leb/o4;->e:Leb/q;

    const-string v1, "Hybrid__use_hybrid_for_server_link"

    invoke-virtual {v0, v1, v2}, Leb/y;->c(Ljava/lang/String;Z)Leb/q;

    move-result-object v1

    sput-object v1, Leb/o4;->f:Leb/q;

    const-string v1, "Hybrid__websocket_close_socket"

    invoke-virtual {v0, v1, v3}, Leb/y;->c(Ljava/lang/String;Z)Leb/q;

    move-result-object v0

    sput-object v0, Leb/o4;->g:Leb/q;

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

    sget-object v0, Leb/o4;->a:Leb/q;

    invoke-virtual {v0}, Leb/q;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
