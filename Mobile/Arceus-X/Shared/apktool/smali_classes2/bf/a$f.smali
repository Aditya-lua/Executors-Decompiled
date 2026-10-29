.class public final Lbf/a$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbf/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


# static fields
.field public static final b:Lbf/a$f;

.field public static final c:Lbf/a$f;

.field public static final d:Lbf/a$f;

.field public static final e:Lbf/a$f;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbf/a$f;

    const-string v1, "TINK"

    invoke-direct {v0, v1}, Lbf/a$f;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbf/a$f;->b:Lbf/a$f;

    new-instance v0, Lbf/a$f;

    const-string v1, "CRUNCHY"

    invoke-direct {v0, v1}, Lbf/a$f;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbf/a$f;->c:Lbf/a$f;

    new-instance v0, Lbf/a$f;

    const-string v1, "LEGACY"

    invoke-direct {v0, v1}, Lbf/a$f;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbf/a$f;->d:Lbf/a$f;

    new-instance v0, Lbf/a$f;

    const-string v1, "NO_PREFIX"

    invoke-direct {v0, v1}, Lbf/a$f;-><init>(Ljava/lang/String;)V

    sput-object v0, Lbf/a$f;->e:Lbf/a$f;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbf/a$f;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbf/a$f;->a:Ljava/lang/String;

    return-object v0
.end method
