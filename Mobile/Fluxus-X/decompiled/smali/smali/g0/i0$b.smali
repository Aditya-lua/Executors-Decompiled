.class public final Lg0/i0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg0/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:F

.field public b:Lx2/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/c<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public c:Lx2/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/c<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iput v0, p0, Lg0/i0$b;->a:F

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {v0, v0}, Lx2/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Lx2/c;

    move-result-object v0

    iput-object v0, p0, Lg0/i0$b;->b:Lx2/c;

    invoke-static {v1, v1}, Lx2/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Lx2/c;

    move-result-object v0

    iput-object v0, p0, Lg0/i0$b;->c:Lx2/c;

    return-void
.end method


# virtual methods
.method public a()Lg0/i0;
    .locals 5

    new-instance v0, Lg0/i0;

    iget v1, p0, Lg0/i0$b;->a:F

    iget-object v2, p0, Lg0/i0$b;->b:Lx2/c;

    iget-object v3, p0, Lg0/i0$b;->c:Lx2/c;

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lg0/i0;-><init>(FLx2/c;Lx2/c;Lg0/i0$a;)V

    return-object v0
.end method

.method public b(F)Lg0/i0$b;
    .locals 0

    iput p1, p0, Lg0/i0$b;->a:F

    return-object p0
.end method

.method public c(FF)Lg0/i0$b;
    .locals 0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-static {p1, p2}, Lx2/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Lx2/c;

    move-result-object p1

    iput-object p1, p0, Lg0/i0$b;->b:Lx2/c;

    return-object p0
.end method

.method public d(FF)Lg0/i0$b;
    .locals 0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-static {p1, p2}, Lx2/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Lx2/c;

    move-result-object p1

    iput-object p1, p0, Lg0/i0$b;->c:Lx2/c;

    return-object p0
.end method
