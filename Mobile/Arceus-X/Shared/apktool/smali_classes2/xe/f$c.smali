.class public final Lxe/f$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxe/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final b:Lxe/f$c;

.field public static final c:Lxe/f$c;

.field public static final d:Lxe/f$c;

.field public static final e:Lxe/f$c;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxe/f$c;

    const-string v1, "TINK"

    invoke-direct {v0, v1}, Lxe/f$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lxe/f$c;->b:Lxe/f$c;

    new-instance v0, Lxe/f$c;

    const-string v1, "CRUNCHY"

    invoke-direct {v0, v1}, Lxe/f$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lxe/f$c;->c:Lxe/f$c;

    new-instance v0, Lxe/f$c;

    const-string v1, "LEGACY"

    invoke-direct {v0, v1}, Lxe/f$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lxe/f$c;->d:Lxe/f$c;

    new-instance v0, Lxe/f$c;

    const-string v1, "NO_PREFIX"

    invoke-direct {v0, v1}, Lxe/f$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lxe/f$c;->e:Lxe/f$c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxe/f$c;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxe/f$c;->a:Ljava/lang/String;

    return-object v0
.end method
