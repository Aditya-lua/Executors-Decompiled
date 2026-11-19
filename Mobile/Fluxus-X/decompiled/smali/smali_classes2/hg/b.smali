.class public final Lhg/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhg/b$a;
    }
.end annotation


# static fields
.field public static final b:Lhg/b;


# instance fields
.field public final a:Lhg/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhg/b$a;

    invoke-direct {v0}, Lhg/b$a;-><init>()V

    invoke-virtual {v0}, Lhg/b$a;->a()Lhg/b;

    move-result-object v0

    sput-object v0, Lhg/b;->b:Lhg/b;

    return-void
.end method

.method public constructor <init>(Lhg/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhg/b;->a:Lhg/a;

    return-void
.end method

.method public static b()Lhg/b$a;
    .locals 1

    new-instance v0, Lhg/b$a;

    invoke-direct {v0}, Lhg/b$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Lhg/a;
    .locals 1
    .annotation build Lwf/d;
        tag = 0x1
    .end annotation

    iget-object v0, p0, Lhg/b;->a:Lhg/a;

    return-object v0
.end method

.method public c()[B
    .locals 1

    invoke-static {p0}, Lcom/google/firebase/messaging/i0;->a(Ljava/lang/Object;)[B

    move-result-object v0

    return-object v0
.end method
