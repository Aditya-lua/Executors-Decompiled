.class public final synthetic Lokhttp3/internal/connection/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:Lokhttp3/CertificatePinner;

.field public final synthetic b:Lokhttp3/Handshake;

.field public final synthetic c:Lokhttp3/Address;


# direct methods
.method public synthetic constructor <init>(Lokhttp3/CertificatePinner;Lokhttp3/Handshake;Lokhttp3/Address;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lokhttp3/internal/connection/a;->a:Lokhttp3/CertificatePinner;

    iput-object p2, p0, Lokhttp3/internal/connection/a;->b:Lokhttp3/Handshake;

    iput-object p3, p0, Lokhttp3/internal/connection/a;->c:Lokhttp3/Address;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lokhttp3/internal/connection/a;->a:Lokhttp3/CertificatePinner;

    iget-object v1, p0, Lokhttp3/internal/connection/a;->b:Lokhttp3/Handshake;

    iget-object v2, p0, Lokhttp3/internal/connection/a;->c:Lokhttp3/Address;

    invoke-static {v0, v1, v2}, Lokhttp3/internal/connection/ConnectPlan;->a(Lokhttp3/CertificatePinner;Lokhttp3/Handshake;Lokhttp3/Address;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
