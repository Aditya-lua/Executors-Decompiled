.class public final Leb/l4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leb/k4;


# static fields
.field public static final a:Leb/q;

.field public static final b:Leb/q;

.field public static final c:Leb/q;

.field public static final d:Leb/q;

.field public static final e:Leb/q;

.field public static final f:Leb/q;

.field public static final g:Leb/q;

.field public static final h:Leb/q;


# direct methods
.method static constructor <clinit>()V
    .locals 4

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

    const-string v1, "Fido2Ctap2Support__disable_transport_comparator"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Leb/y;->c(Ljava/lang/String;Z)Leb/q;

    move-result-object v1

    sput-object v1, Leb/l4;->a:Leb/q;

    const-string v1, "Fido2Ctap2Support__enable_cancelling_requests"

    invoke-virtual {v0, v1, v2}, Leb/y;->c(Ljava/lang/String;Z)Leb/q;

    move-result-object v1

    sput-object v1, Leb/l4;->b:Leb/q;

    const-string v1, "Fido2Ctap2Support__enable_flow_separation_refactor"

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Leb/y;->c(Ljava/lang/String;Z)Leb/q;

    move-result-object v1

    sput-object v1, Leb/l4;->c:Leb/q;

    const-string v1, "Fido2Ctap2Support__nfc_activity_destroyed_check"

    invoke-virtual {v0, v1, v2}, Leb/y;->c(Ljava/lang/String;Z)Leb/q;

    move-result-object v1

    sput-object v1, Leb/l4;->d:Leb/q;

    const-string v1, "Fido2Ctap2Support__remove_this_device_for_assertions"

    invoke-virtual {v0, v1, v3}, Leb/y;->c(Ljava/lang/String;Z)Leb/q;

    move-result-object v1

    sput-object v1, Leb/l4;->e:Leb/q;

    const-string v1, "Fido2Ctap2Support__skip_usb_permission_dialog"

    invoke-virtual {v0, v1, v3}, Leb/y;->c(Ljava/lang/String;Z)Leb/q;

    move-result-object v1

    sput-object v1, Leb/l4;->f:Leb/q;

    const-string v1, "Fido2Ctap2Support__transport_controller_refactor"

    invoke-virtual {v0, v1, v3}, Leb/y;->c(Ljava/lang/String;Z)Leb/q;

    move-result-object v1

    sput-object v1, Leb/l4;->g:Leb/q;

    const-string v1, "Fido2Ctap2Support__update_user_cancel_response"

    invoke-virtual {v0, v1, v3}, Leb/y;->c(Ljava/lang/String;Z)Leb/q;

    move-result-object v0

    sput-object v0, Leb/l4;->h:Leb/q;

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

    sget-object v0, Leb/l4;->c:Leb/q;

    invoke-virtual {v0}, Leb/q;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
