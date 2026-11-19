.class public final Lde/c1;
.super Lde/d1;
.source "SourceFile"


# instance fields
.field public final b:[B


# direct methods
.method public constructor <init>(Ljava/security/cert/X509Certificate;[B)V
    .locals 0

    invoke-direct {p0, p1}, Lde/d1;-><init>(Ljava/security/cert/X509Certificate;)V

    iput-object p2, p0, Lde/c1;->b:[B

    return-void
.end method


# virtual methods
.method public final getEncoded()[B
    .locals 1

    iget-object v0, p0, Lde/c1;->b:[B

    return-object v0
.end method
