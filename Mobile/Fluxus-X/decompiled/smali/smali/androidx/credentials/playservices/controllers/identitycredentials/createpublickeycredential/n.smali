.class public final synthetic Landroidx/credentials/playservices/controllers/identitycredentials/createpublickeycredential/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Le3/p;

.field public final synthetic b:Le3/c;


# direct methods
.method public synthetic constructor <init>(Le3/p;Le3/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/credentials/playservices/controllers/identitycredentials/createpublickeycredential/n;->a:Le3/p;

    iput-object p2, p0, Landroidx/credentials/playservices/controllers/identitycredentials/createpublickeycredential/n;->b:Le3/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/credentials/playservices/controllers/identitycredentials/createpublickeycredential/n;->a:Le3/p;

    iget-object v1, p0, Landroidx/credentials/playservices/controllers/identitycredentials/createpublickeycredential/n;->b:Le3/c;

    invoke-static {v0, v1}, Landroidx/credentials/playservices/controllers/identitycredentials/createpublickeycredential/CreatePublicKeyCredentialController;->$r8$lambda$ZxA4XUaVneeT9O9flSi4-X8CIcU(Le3/p;Le3/c;)V

    return-void
.end method
