.class public final Lze/f$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lze/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final b:Lze/f$c;

.field public static final c:Lze/f$c;

.field public static final d:Lze/f$c;

.field public static final e:Lze/f$c;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lze/f$c;

    const-string v1, "TINK"

    invoke-direct {v0, v1}, Lze/f$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lze/f$c;->b:Lze/f$c;

    new-instance v0, Lze/f$c;

    const-string v1, "CRUNCHY"

    invoke-direct {v0, v1}, Lze/f$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lze/f$c;->c:Lze/f$c;

    new-instance v0, Lze/f$c;

    const-string v1, "LEGACY"

    invoke-direct {v0, v1}, Lze/f$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lze/f$c;->d:Lze/f$c;

    new-instance v0, Lze/f$c;

    const-string v1, "NO_PREFIX"

    invoke-direct {v0, v1}, Lze/f$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lze/f$c;->e:Lze/f$c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lze/f$c;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lze/f$c;->a:Ljava/lang/String;

    return-object v0
.end method
