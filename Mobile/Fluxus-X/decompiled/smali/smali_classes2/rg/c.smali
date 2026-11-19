.class public Lrg/c;
.super Llg/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Llg/a0<",
        "Ljava/sql/Timestamp;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Llg/b0;


# instance fields
.field public final a:Llg/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llg/a0<",
            "Ljava/util/Date;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lrg/c$a;

    invoke-direct {v0}, Lrg/c$a;-><init>()V

    sput-object v0, Lrg/c;->b:Llg/b0;

    return-void
.end method

.method public constructor <init>(Llg/a0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llg/a0<",
            "Ljava/util/Date;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Llg/a0;-><init>()V

    .line 3
    iput-object p1, p0, Lrg/c;->a:Llg/a0;

    return-void
.end method

.method public synthetic constructor <init>(Llg/a0;Lrg/c$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lrg/c;-><init>(Llg/a0;)V

    return-void
.end method


# virtual methods
.method public a(Ltg/a;)Ljava/sql/Timestamp;
    .locals 3

    iget-object v0, p0, Lrg/c;->a:Llg/a0;

    invoke-virtual {v0, p1}, Llg/a0;->read(Ltg/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Date;

    if-eqz p1, :cond_0

    new-instance v0, Ljava/sql/Timestamp;

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/sql/Timestamp;-><init>(J)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public b(Ltg/c;Ljava/sql/Timestamp;)V
    .locals 1

    iget-object v0, p0, Lrg/c;->a:Llg/a0;

    invoke-virtual {v0, p1, p2}, Llg/a0;->write(Ltg/c;Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic read(Ltg/a;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lrg/c;->a(Ltg/a;)Ljava/sql/Timestamp;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic write(Ltg/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/sql/Timestamp;

    invoke-virtual {p0, p1, p2}, Lrg/c;->b(Ltg/c;Ljava/sql/Timestamp;)V

    return-void
.end method
