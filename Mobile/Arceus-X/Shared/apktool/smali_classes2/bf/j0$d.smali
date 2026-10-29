.class public final Lbf/j0$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbf/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final b:Lbf/j0$d;

.field public static final c:Lbf/j0$d;

.field public static final d:Lbf/j0$d;

.field public static final e:Lbf/j0$d;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbf/j0$d;

    const-string v1, "TINK"

    invoke-direct {v0, v1}, Lbf/j0$d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbf/j0$d;->b:Lbf/j0$d;

    new-instance v0, Lbf/j0$d;

    const-string v1, "CRUNCHY"

    invoke-direct {v0, v1}, Lbf/j0$d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbf/j0$d;->c:Lbf/j0$d;

    new-instance v0, Lbf/j0$d;

    const-string v1, "LEGACY"

    invoke-direct {v0, v1}, Lbf/j0$d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbf/j0$d;->d:Lbf/j0$d;

    new-instance v0, Lbf/j0$d;

    const-string v1, "NO_PREFIX"

    invoke-direct {v0, v1}, Lbf/j0$d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbf/j0$d;->e:Lbf/j0$d;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbf/j0$d;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbf/j0$d;->a:Ljava/lang/String;

    return-object v0
.end method
