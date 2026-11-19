.class public final Lff/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lff/m$b;,
        Lff/m$d;,
        Lff/m$c;,
        Lff/m$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T_WRAPPER::",
        "Lff/n<",
        "TJcePrimitiveT;>;JcePrimitiveT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final b:Lff/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lff/m<",
            "Lff/n$a;",
            "Ljavax/crypto/Cipher;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lff/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lff/m<",
            "Lff/n$e;",
            "Ljavax/crypto/Mac;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lff/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lff/m<",
            "Lff/n$g;",
            "Ljava/security/Signature;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Lff/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lff/m<",
            "Lff/n$f;",
            "Ljava/security/MessageDigest;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Lff/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lff/m<",
            "Lff/n$b;",
            "Ljavax/crypto/KeyAgreement;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:Lff/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lff/m<",
            "Lff/n$d;",
            "Ljava/security/KeyPairGenerator;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:Lff/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lff/m<",
            "Lff/n$c;",
            "Ljava/security/KeyFactory;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Lff/m$e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lff/m$e<",
            "TJcePrimitiveT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lff/m;

    new-instance v1, Lff/n$a;

    invoke-direct {v1}, Lff/n$a;-><init>()V

    invoke-direct {v0, v1}, Lff/m;-><init>(Lff/n;)V

    sput-object v0, Lff/m;->b:Lff/m;

    new-instance v0, Lff/m;

    new-instance v1, Lff/n$e;

    invoke-direct {v1}, Lff/n$e;-><init>()V

    invoke-direct {v0, v1}, Lff/m;-><init>(Lff/n;)V

    sput-object v0, Lff/m;->c:Lff/m;

    new-instance v0, Lff/m;

    new-instance v1, Lff/n$g;

    invoke-direct {v1}, Lff/n$g;-><init>()V

    invoke-direct {v0, v1}, Lff/m;-><init>(Lff/n;)V

    sput-object v0, Lff/m;->d:Lff/m;

    new-instance v0, Lff/m;

    new-instance v1, Lff/n$f;

    invoke-direct {v1}, Lff/n$f;-><init>()V

    invoke-direct {v0, v1}, Lff/m;-><init>(Lff/n;)V

    sput-object v0, Lff/m;->e:Lff/m;

    new-instance v0, Lff/m;

    new-instance v1, Lff/n$b;

    invoke-direct {v1}, Lff/n$b;-><init>()V

    invoke-direct {v0, v1}, Lff/m;-><init>(Lff/n;)V

    sput-object v0, Lff/m;->f:Lff/m;

    new-instance v0, Lff/m;

    new-instance v1, Lff/n$d;

    invoke-direct {v1}, Lff/n$d;-><init>()V

    invoke-direct {v0, v1}, Lff/m;-><init>(Lff/n;)V

    sput-object v0, Lff/m;->g:Lff/m;

    new-instance v0, Lff/m;

    new-instance v1, Lff/n$c;

    invoke-direct {v1}, Lff/n$c;-><init>()V

    invoke-direct {v0, v1}, Lff/m;-><init>(Lff/n;)V

    sput-object v0, Lff/m;->h:Lff/m;

    return-void
.end method

.method public constructor <init>(Lff/n;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT_WRAPPER;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lwe/b;->c()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v0, Lff/m$d;

    invoke-direct {v0, p1, v1}, Lff/m$d;-><init>(Lff/n;Lff/m$a;)V

    iput-object v0, p0, Lff/m;->a:Lff/m$e;

    return-void

    :cond_0
    invoke-static {}, Lff/z;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lff/m$b;

    invoke-direct {v0, p1, v1}, Lff/m$b;-><init>(Lff/n;Lff/m$a;)V

    iput-object v0, p0, Lff/m;->a:Lff/m$e;

    return-void

    :cond_1
    new-instance v0, Lff/m$c;

    invoke-direct {v0, p1, v1}, Lff/m$c;-><init>(Lff/n;Lff/m$a;)V

    iput-object v0, p0, Lff/m;->a:Lff/m$e;

    return-void
.end method

.method public static varargs b([Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/security/Provider;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p0, v2

    invoke-static {v3}, Ljava/security/Security;->getProvider(Ljava/lang/String;)Ljava/security/Provider;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")TJcePrimitiveT;"
        }
    .end annotation

    iget-object v0, p0, Lff/m;->a:Lff/m$e;

    invoke-interface {v0, p1}, Lff/m$e;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
