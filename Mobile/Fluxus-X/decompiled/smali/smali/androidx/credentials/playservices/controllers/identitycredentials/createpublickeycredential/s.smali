.class public final synthetic Landroidx/credentials/playservices/controllers/identitycredentials/createpublickeycredential/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Le3/p;


# direct methods
.method public synthetic constructor <init>(Le3/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/credentials/playservices/controllers/identitycredentials/createpublickeycredential/s;->a:Le3/p;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Landroidx/credentials/playservices/controllers/identitycredentials/createpublickeycredential/s;->a:Le3/p;

    invoke-static {v0}, Landroidx/credentials/playservices/controllers/identitycredentials/createpublickeycredential/CreatePublicKeyCredentialController;->$r8$lambda$6M0KRaoH119jhRKh3psRrc4csUI(Le3/p;)V

    return-void
.end method
