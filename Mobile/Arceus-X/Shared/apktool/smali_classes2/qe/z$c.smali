.class public final Lqe/z$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqe/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final b:Lqe/z$c;

.field public static final c:Lqe/z$c;

.field public static final d:Lqe/z$c;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqe/z$c;

    const-string v1, "TINK"

    invoke-direct {v0, v1}, Lqe/z$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lqe/z$c;->b:Lqe/z$c;

    new-instance v0, Lqe/z$c;

    const-string v1, "CRUNCHY"

    invoke-direct {v0, v1}, Lqe/z$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lqe/z$c;->c:Lqe/z$c;

    new-instance v0, Lqe/z$c;

    const-string v1, "NO_PREFIX"

    invoke-direct {v0, v1}, Lqe/z$c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lqe/z$c;->d:Lqe/z$c;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqe/z$c;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lqe/z$c;->a:Ljava/lang/String;

    return-object v0
.end method
