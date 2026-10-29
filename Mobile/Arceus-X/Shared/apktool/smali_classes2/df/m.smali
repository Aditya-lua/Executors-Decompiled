.class public final Ldf/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldf/m$b;,
        Ldf/m$d;,
        Ldf/m$c;,
        Ldf/m$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T_WRAPPER::",
        "Ldf/n<",
        "TJcePrimitiveT;>;JcePrimitiveT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final b:Ldf/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/m<",
            "Ldf/n$a;",
            "Ljavax/crypto/Cipher;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Ldf/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/m<",
            "Ldf/n$e;",
            "Ljavax/crypto/Mac;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Ldf/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/m<",
            "Ldf/n$g;",
            "Ljava/security/Signature;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Ldf/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/m<",
            "Ldf/n$f;",
            "Ljava/security/MessageDigest;",
            ">;"
        }
    .end annotation
.end field

.field public static final f:Ldf/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/m<",
            "Ldf/n$b;",
            "Ljavax/crypto/KeyAgreement;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:Ldf/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/m<",
            "Ldf/n$d;",
            "Ljava/security/KeyPairGenerator;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:Ldf/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/m<",
            "Ldf/n$c;",
            "Ljava/security/KeyFactory;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ldf/m$e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldf/m$e<",
            "TJcePrimitiveT;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldf/m;

    new-instance v1, Ldf/n$a;

    invoke-direct {v1}, Ldf/n$a;-><init>()V

    invoke-direct {v0, v1}, Ldf/m;-><init>(Ldf/n;)V

    sput-object v0, Ldf/m;->b:Ldf/m;

    new-instance v0, Ldf/m;

    new-instance v1, Ldf/n$e;

    invoke-direct {v1}, Ldf/n$e;-><init>()V

    invoke-direct {v0, v1}, Ldf/m;-><init>(Ldf/n;)V

    sput-object v0, Ldf/m;->c:Ldf/m;

    new-instance v0, Ldf/m;

    new-instance v1, Ldf/n$g;

    invoke-direct {v1}, Ldf/n$g;-><init>()V

    invoke-direct {v0, v1}, Ldf/m;-><init>(Ldf/n;)V

    sput-object v0, Ldf/m;->d:Ldf/m;

    new-instance v0, Ldf/m;

    new-instance v1, Ldf/n$f;

    invoke-direct {v1}, Ldf/n$f;-><init>()V

    invoke-direct {v0, v1}, Ldf/m;-><init>(Ldf/n;)V

    sput-object v0, Ldf/m;->e:Ldf/m;

    new-instance v0, Ldf/m;

    new-instance v1, Ldf/n$b;

    invoke-direct {v1}, Ldf/n$b;-><init>()V

    invoke-direct {v0, v1}, Ldf/m;-><init>(Ldf/n;)V

    sput-object v0, Ldf/m;->f:Ldf/m;

    new-instance v0, Ldf/m;

    new-instance v1, Ldf/n$d;

    invoke-direct {v1}, Ldf/n$d;-><init>()V

    invoke-direct {v0, v1}, Ldf/m;-><init>(Ldf/n;)V

    sput-object v0, Ldf/m;->g:Ldf/m;

    new-instance v0, Ldf/m;

    new-instance v1, Ldf/n$c;

    invoke-direct {v1}, Ldf/n$c;-><init>()V

    invoke-direct {v0, v1}, Ldf/m;-><init>(Ldf/n;)V

    sput-object v0, Ldf/m;->h:Ldf/m;

    return-void
.end method

.method public constructor <init>(Ldf/n;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT_WRAPPER;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lue/b;->c()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v0, Ldf/m$d;

    invoke-direct {v0, p1, v1}, Ldf/m$d;-><init>(Ldf/n;Ldf/m$a;)V

    iput-object v0, p0, Ldf/m;->a:Ldf/m$e;

    return-void

    :cond_0
    invoke-static {}, Ldf/z;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ldf/m$b;

    invoke-direct {v0, p1, v1}, Ldf/m$b;-><init>(Ldf/n;Ldf/m$a;)V

    iput-object v0, p0, Ldf/m;->a:Ldf/m$e;

    return-void

    :cond_1
    new-instance v0, Ldf/m$c;

    invoke-direct {v0, p1, v1}, Ldf/m$c;-><init>(Ldf/n;Ldf/m$a;)V

    iput-object v0, p0, Ldf/m;->a:Ldf/m$e;

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

    iget-object v0, p0, Ldf/m;->a:Ldf/m$e;

    invoke-interface {v0, p1}, Ldf/m$e;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
