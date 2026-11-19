.class public final Ldf/i$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldf/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final b:Ldf/i$a;

.field public static final c:Ldf/i$a;

.field public static final d:Ldf/i$a;

.field public static final e:Ldf/i$a;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldf/i$a;

    const-string v1, "TINK"

    invoke-direct {v0, v1}, Ldf/i$a;-><init>(Ljava/lang/String;)V

    sput-object v0, Ldf/i$a;->b:Ldf/i$a;

    new-instance v0, Ldf/i$a;

    const-string v1, "CRUNCHY"

    invoke-direct {v0, v1}, Ldf/i$a;-><init>(Ljava/lang/String;)V

    sput-object v0, Ldf/i$a;->c:Ldf/i$a;

    new-instance v0, Ldf/i$a;

    const-string v1, "LEGACY"

    invoke-direct {v0, v1}, Ldf/i$a;-><init>(Ljava/lang/String;)V

    sput-object v0, Ldf/i$a;->d:Ldf/i$a;

    new-instance v0, Ldf/i$a;

    const-string v1, "NO_PREFIX"

    invoke-direct {v0, v1}, Ldf/i$a;-><init>(Ljava/lang/String;)V

    sput-object v0, Ldf/i$a;->e:Ldf/i$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldf/i$a;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ldf/i$a;->a:Ljava/lang/String;

    return-object v0
.end method
