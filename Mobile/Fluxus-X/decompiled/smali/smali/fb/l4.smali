.class public final Lfb/l4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfb/k4;


# static fields
.field public static final a:Lfb/q;

.field public static final b:Lfb/q;

.field public static final c:Lfb/q;

.field public static final d:Lfb/q;

.field public static final e:Lfb/q;

.field public static final f:Lfb/q;

.field public static final g:Lfb/q;

.field public static final h:Lfb/q;


# direct methods
.method static constructor <clinit>()V
    .locals 4

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

    const-string v1, "Fido2Ctap2Support__disable_transport_comparator"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lfb/y;->c(Ljava/lang/String;Z)Lfb/q;

    move-result-object v1

    sput-object v1, Lfb/l4;->a:Lfb/q;

    const-string v1, "Fido2Ctap2Support__enable_cancelling_requests"

    invoke-virtual {v0, v1, v2}, Lfb/y;->c(Ljava/lang/String;Z)Lfb/q;

    move-result-object v1

    sput-object v1, Lfb/l4;->b:Lfb/q;

    const-string v1, "Fido2Ctap2Support__enable_flow_separation_refactor"

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3}, Lfb/y;->c(Ljava/lang/String;Z)Lfb/q;

    move-result-object v1

    sput-object v1, Lfb/l4;->c:Lfb/q;

    const-string v1, "Fido2Ctap2Support__nfc_activity_destroyed_check"

    invoke-virtual {v0, v1, v2}, Lfb/y;->c(Ljava/lang/String;Z)Lfb/q;

    move-result-object v1

    sput-object v1, Lfb/l4;->d:Lfb/q;

    const-string v1, "Fido2Ctap2Support__remove_this_device_for_assertions"

    invoke-virtual {v0, v1, v3}, Lfb/y;->c(Ljava/lang/String;Z)Lfb/q;

    move-result-object v1

    sput-object v1, Lfb/l4;->e:Lfb/q;

    const-string v1, "Fido2Ctap2Support__skip_usb_permission_dialog"

    invoke-virtual {v0, v1, v3}, Lfb/y;->c(Ljava/lang/String;Z)Lfb/q;

    move-result-object v1

    sput-object v1, Lfb/l4;->f:Lfb/q;

    const-string v1, "Fido2Ctap2Support__transport_controller_refactor"

    invoke-virtual {v0, v1, v3}, Lfb/y;->c(Ljava/lang/String;Z)Lfb/q;

    move-result-object v1

    sput-object v1, Lfb/l4;->g:Lfb/q;

    const-string v1, "Fido2Ctap2Support__update_user_cancel_response"

    invoke-virtual {v0, v1, v3}, Lfb/y;->c(Ljava/lang/String;Z)Lfb/q;

    move-result-object v0

    sput-object v0, Lfb/l4;->h:Lfb/q;

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

    sget-object v0, Lfb/l4;->c:Lfb/q;

    invoke-virtual {v0}, Lfb/q;->zza()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method
