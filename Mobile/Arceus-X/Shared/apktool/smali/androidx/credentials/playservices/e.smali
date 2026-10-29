.class public final synthetic Landroidx/credentials/playservices/e;
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

    iput-object p1, p0, Landroidx/credentials/playservices/e;->a:Le3/p;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Landroidx/credentials/playservices/e;->a:Le3/p;

    invoke-static {v0}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->$r8$lambda$4jXvrTRoERmCISXRfwXYkLdVeEA(Le3/p;)V

    return-void
.end method
