.class public final synthetic Ll3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Le3/p;

.field public final synthetic b:Lkotlin/jvm/internal/c0;


# direct methods
.method public synthetic constructor <init>(Le3/p;Lkotlin/jvm/internal/c0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll3/b;->a:Le3/p;

    iput-object p2, p0, Ll3/b;->b:Lkotlin/jvm/internal/c0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ll3/b;->a:Le3/p;

    iget-object v1, p0, Ll3/b;->b:Lkotlin/jvm/internal/c0;

    invoke-static {v0, v1}, Landroidx/credentials/playservices/controllers/blockstore/createrestorecredential/CredentialProviderCreateRestoreCredentialController;->$r8$lambda$wq1I2mlMy1ji3E6RLG1CoN3lW2Y(Le3/p;Lkotlin/jvm/internal/c0;)V

    return-void
.end method
