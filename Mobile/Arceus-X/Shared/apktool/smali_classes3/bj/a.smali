.class public final synthetic Lbj/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg/a;


# instance fields
.field public final synthetic a:Lcom/roblox/client/personasdk/PersonaActivityResultLauncher;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/personasdk/PersonaActivityResultLauncher;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbj/a;->a:Lcom/roblox/client/personasdk/PersonaActivityResultLauncher;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lbj/a;->a:Lcom/roblox/client/personasdk/PersonaActivityResultLauncher;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/InquiryResponse;

    invoke-static {v0, p1}, Lcom/roblox/client/personasdk/PersonaActivityResultLauncher;->a(Lcom/roblox/client/personasdk/PersonaActivityResultLauncher;Lcom/withpersona/sdk2/inquiry/InquiryResponse;)V

    return-void
.end method
