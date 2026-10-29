.class public final synthetic Landroidx/credentials/playservices/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Le3/p;

.field public final synthetic b:Ljava/lang/Exception;


# direct methods
.method public synthetic constructor <init>(Le3/p;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/credentials/playservices/q;->a:Le3/p;

    iput-object p2, p0, Landroidx/credentials/playservices/q;->b:Ljava/lang/Exception;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Landroidx/credentials/playservices/q;->a:Le3/p;

    iget-object v1, p0, Landroidx/credentials/playservices/q;->b:Ljava/lang/Exception;

    invoke-static {v0, v1}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->$r8$lambda$YStfLpvTYNV4aBlhmDn-sDCQbtg(Le3/p;Ljava/lang/Exception;)V

    return-void
.end method
