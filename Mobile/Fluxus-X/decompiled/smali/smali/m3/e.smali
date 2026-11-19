.class public final synthetic Lm3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Le3/p;

.field public final synthetic b:Le3/l0;


# direct methods
.method public synthetic constructor <init>(Le3/p;Le3/l0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm3/e;->a:Le3/p;

    iput-object p2, p0, Lm3/e;->b:Le3/l0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lm3/e;->a:Le3/p;

    iget-object v1, p0, Lm3/e;->b:Le3/l0;

    invoke-static {v0, v1}, Landroidx/credentials/playservices/controllers/blockstore/getrestorecredential/CredentialProviderGetRestoreCredentialController;->$r8$lambda$AM0-r91zNK9J3atNxuPjVWW8vJ8(Le3/p;Le3/l0;)V

    return-void
.end method
