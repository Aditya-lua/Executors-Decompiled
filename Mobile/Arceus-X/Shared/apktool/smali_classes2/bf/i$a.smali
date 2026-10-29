.class public final Lbf/i$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbf/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final b:Lbf/i$a;

.field public static final c:Lbf/i$a;

.field public static final d:Lbf/i$a;

.field public static final e:Lbf/i$a;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbf/i$a;

    const-string v1, "TINK"

    invoke-direct {v0, v1}, Lbf/i$a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbf/i$a;->b:Lbf/i$a;

    new-instance v0, Lbf/i$a;

    const-string v1, "CRUNCHY"

    invoke-direct {v0, v1}, Lbf/i$a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbf/i$a;->c:Lbf/i$a;

    new-instance v0, Lbf/i$a;

    const-string v1, "LEGACY"

    invoke-direct {v0, v1}, Lbf/i$a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbf/i$a;->d:Lbf/i$a;

    new-instance v0, Lbf/i$a;

    const-string v1, "NO_PREFIX"

    invoke-direct {v0, v1}, Lbf/i$a;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbf/i$a;->e:Lbf/i$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbf/i$a;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbf/i$a;->a:Ljava/lang/String;

    return-object v0
.end method
