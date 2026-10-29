.class public final synthetic Lk3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Le3/p;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Le3/p;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk3/a;->a:Le3/p;

    iput-object p2, p0, Lk3/a;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lk3/a;->a:Le3/p;

    iget-object v1, p0, Lk3/a;->b:Ljava/lang/Object;

    invoke-static {v0, v1}, Landroidx/credentials/playservices/controllers/CredentialProviderController;->$r8$lambda$9zxgFzrHZX-0_0TZgSZasQ7Fc_U(Le3/p;Ljava/lang/Object;)V

    return-void
.end method
