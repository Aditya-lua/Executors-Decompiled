.class public Lv2/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv2/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:I

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "[",
            "Lv2/g$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "[",
            "Lv2/g$b;",
            ">;)V"
        }
    .end annotation

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput p1, p0, Lv2/g$a;->a:I

    .line 6
    iput-object p2, p0, Lv2/g$a;->b:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(I[Lv2/g$b;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lv2/g$a;->a:I

    .line 3
    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lv2/g$a;->b:Ljava/util/List;

    return-void
.end method

.method public static a(ILjava/util/List;)Lv2/g$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "[",
            "Lv2/g$b;",
            ">;)",
            "Lv2/g$a;"
        }
    .end annotation

    new-instance v0, Lv2/g$a;

    invoke-direct {v0, p0, p1}, Lv2/g$a;-><init>(ILjava/util/List;)V

    return-object v0
.end method

.method public static b(I[Lv2/g$b;)Lv2/g$a;
    .locals 1

    new-instance v0, Lv2/g$a;

    invoke-direct {v0, p0, p1}, Lv2/g$a;-><init>(I[Lv2/g$b;)V

    return-object v0
.end method


# virtual methods
.method public c()[Lv2/g$b;
    .locals 2

    iget-object v0, p0, Lv2/g$a;->b:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lv2/g$b;

    return-object v0
.end method

.method public d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "[",
            "Lv2/g$b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lv2/g$a;->b:Ljava/util/List;

    return-object v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lv2/g$a;->a:I

    return v0
.end method

.method public f()Z
    .locals 2

    iget-object v0, p0, Lv2/g$a;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
