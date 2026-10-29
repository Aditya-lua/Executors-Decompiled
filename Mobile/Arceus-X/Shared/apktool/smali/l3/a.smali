.class public final synthetic Ll3/a;
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

    iput-object p1, p0, Ll3/a;->a:Le3/p;

    iput-object p2, p0, Ll3/a;->b:Le3/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ll3/a;->a:Le3/p;

    iget-object v1, p0, Ll3/a;->b:Le3/c;

    invoke-static {v0, v1}, Landroidx/credentials/playservices/controllers/blockstore/createrestorecredential/CredentialProviderCreateRestoreCredentialController;->$r8$lambda$NExOG-t2uBwhqjdU2JbtsRitZMU(Le3/p;Le3/c;)V

    return-void
.end method
