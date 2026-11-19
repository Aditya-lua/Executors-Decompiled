.class public final Lse/u0$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lse/u0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final b:Lse/u0$c;

.field public static final c:Lse/u0$c;

.field public static final d:Lse/u0$c;

.field public static final e:Lse/u0$c;

.field public static final f:Lse/u0$c;

.field public static final g:Lse/u0$c;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lse/u0$c;

    const-string v1, "ASSUME_AES_GCM"

    invoke-direct {v0, v1}, Lse/u0$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lse/u0$c;->b:Lse/u0$c;

    new-instance v0, Lse/u0$c;

    const-string v1, "ASSUME_XCHACHA20POLY1305"

    invoke-direct {v0, v1}, Lse/u0$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lse/u0$c;->c:Lse/u0$c;

    new-instance v0, Lse/u0$c;

    const-string v1, "ASSUME_CHACHA20POLY1305"

    invoke-direct {v0, v1}, Lse/u0$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lse/u0$c;->d:Lse/u0$c;

    new-instance v0, Lse/u0$c;

    const-string v1, "ASSUME_AES_CTR_HMAC"

    invoke-direct {v0, v1}, Lse/u0$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lse/u0$c;->e:Lse/u0$c;

    new-instance v0, Lse/u0$c;

    const-string v1, "ASSUME_AES_EAX"

    invoke-direct {v0, v1}, Lse/u0$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lse/u0$c;->f:Lse/u0$c;

    new-instance v0, Lse/u0$c;

    const-string v1, "ASSUME_AES_GCM_SIV"

    invoke-direct {v0, v1}, Lse/u0$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lse/u0$c;->g:Lse/u0$c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lse/u0$c;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lse/u0$c;->a:Ljava/lang/String;

    return-object v0
.end method
