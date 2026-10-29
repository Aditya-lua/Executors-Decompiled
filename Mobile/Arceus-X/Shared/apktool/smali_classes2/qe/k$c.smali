.class public final Lqe/k$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqe/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final b:Lqe/k$c;

.field public static final c:Lqe/k$c;

.field public static final d:Lqe/k$c;

.field public static final e:Lqe/k$c;

.field public static final f:Lqe/k$c;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqe/k$c;

    const-string v1, "SHA1"

    invoke-direct {v0, v1}, Lqe/k$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lqe/k$c;->b:Lqe/k$c;

    new-instance v0, Lqe/k$c;

    const-string v1, "SHA224"

    invoke-direct {v0, v1}, Lqe/k$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lqe/k$c;->c:Lqe/k$c;

    new-instance v0, Lqe/k$c;

    const-string v1, "SHA256"

    invoke-direct {v0, v1}, Lqe/k$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lqe/k$c;->d:Lqe/k$c;

    new-instance v0, Lqe/k$c;

    const-string v1, "SHA384"

    invoke-direct {v0, v1}, Lqe/k$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lqe/k$c;->e:Lqe/k$c;

    new-instance v0, Lqe/k$c;

    const-string v1, "SHA512"

    invoke-direct {v0, v1}, Lqe/k$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lqe/k$c;->f:Lqe/k$c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqe/k$c;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqe/k$c;->a:Ljava/lang/String;

    return-object v0
.end method
