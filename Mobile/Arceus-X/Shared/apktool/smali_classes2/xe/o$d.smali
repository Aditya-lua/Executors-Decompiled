.class public final Lxe/o$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxe/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final b:Lxe/o$d;

.field public static final c:Lxe/o$d;

.field public static final d:Lxe/o$d;

.field public static final e:Lxe/o$d;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxe/o$d;

    const-string v1, "TINK"

    invoke-direct {v0, v1}, Lxe/o$d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lxe/o$d;->b:Lxe/o$d;

    new-instance v0, Lxe/o$d;

    const-string v1, "CRUNCHY"

    invoke-direct {v0, v1}, Lxe/o$d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lxe/o$d;->c:Lxe/o$d;

    new-instance v0, Lxe/o$d;

    const-string v1, "LEGACY"

    invoke-direct {v0, v1}, Lxe/o$d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lxe/o$d;->d:Lxe/o$d;

    new-instance v0, Lxe/o$d;

    const-string v1, "NO_PREFIX"

    invoke-direct {v0, v1}, Lxe/o$d;-><init>(Ljava/lang/String;)V

    sput-object v0, Lxe/o$d;->e:Lxe/o$d;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxe/o$d;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxe/o$d;->a:Ljava/lang/String;

    return-object v0
.end method
