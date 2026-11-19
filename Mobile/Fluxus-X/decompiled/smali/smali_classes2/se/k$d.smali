.class public final Lse/k$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lse/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final b:Lse/k$d;

.field public static final c:Lse/k$d;

.field public static final d:Lse/k$d;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lse/k$d;

    const-string v1, "TINK"

    invoke-direct {v0, v1}, Lse/k$d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lse/k$d;->b:Lse/k$d;

    new-instance v0, Lse/k$d;

    const-string v1, "CRUNCHY"

    invoke-direct {v0, v1}, Lse/k$d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lse/k$d;->c:Lse/k$d;

    new-instance v0, Lse/k$d;

    const-string v1, "NO_PREFIX"

    invoke-direct {v0, v1}, Lse/k$d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lse/k$d;->d:Lse/k$d;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lse/k$d;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lse/k$d;->a:Ljava/lang/String;

    return-object v0
.end method
