.class public final Lze/o$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lze/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final b:Lze/o$d;

.field public static final c:Lze/o$d;

.field public static final d:Lze/o$d;

.field public static final e:Lze/o$d;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lze/o$d;

    const-string v1, "TINK"

    invoke-direct {v0, v1}, Lze/o$d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lze/o$d;->b:Lze/o$d;

    new-instance v0, Lze/o$d;

    const-string v1, "CRUNCHY"

    invoke-direct {v0, v1}, Lze/o$d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lze/o$d;->c:Lze/o$d;

    new-instance v0, Lze/o$d;

    const-string v1, "LEGACY"

    invoke-direct {v0, v1}, Lze/o$d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lze/o$d;->d:Lze/o$d;

    new-instance v0, Lze/o$d;

    const-string v1, "NO_PREFIX"

    invoke-direct {v0, v1}, Lze/o$d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lze/o$d;->e:Lze/o$d;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lze/o$d;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lze/o$d;->a:Ljava/lang/String;

    return-object v0
.end method
