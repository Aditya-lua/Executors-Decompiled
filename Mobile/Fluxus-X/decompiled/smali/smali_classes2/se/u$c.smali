.class public final Lse/u$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lse/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final b:Lse/u$c;

.field public static final c:Lse/u$c;

.field public static final d:Lse/u$c;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lse/u$c;

    const-string v1, "TINK"

    invoke-direct {v0, v1}, Lse/u$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lse/u$c;->b:Lse/u$c;

    new-instance v0, Lse/u$c;

    const-string v1, "CRUNCHY"

    invoke-direct {v0, v1}, Lse/u$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lse/u$c;->c:Lse/u$c;

    new-instance v0, Lse/u$c;

    const-string v1, "NO_PREFIX"

    invoke-direct {v0, v1}, Lse/u$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lse/u$c;->d:Lse/u$c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lse/u$c;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lse/u$c;->a:Ljava/lang/String;

    return-object v0
.end method
