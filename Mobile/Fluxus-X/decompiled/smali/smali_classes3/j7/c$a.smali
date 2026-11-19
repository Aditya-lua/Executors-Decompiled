.class public Lj7/c$a;
.super Lu7/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj7/c;->f(Lu7/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lu7/c<",
        "Ljava/lang/Float;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic d:Lu7/c;

.field public final synthetic e:Lj7/c;


# direct methods
.method public constructor <init>(Lj7/c;Lu7/c;)V
    .locals 0

    iput-object p2, p0, Lj7/c$a;->d:Lu7/c;

    iput-object p1, p0, Lj7/c$a;->e:Lj7/c;

    invoke-direct {p0}, Lu7/c;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lu7/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lj7/c$a;->d(Lu7/b;)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public d(Lu7/b;)Ljava/lang/Float;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu7/b<",
            "Ljava/lang/Float;",
            ">;)",
            "Ljava/lang/Float;"
        }
    .end annotation

    iget-object v0, p0, Lj7/c$a;->d:Lu7/c;

    invoke-virtual {v0, p1}, Lu7/c;->a(Lu7/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    const v0, 0x40233333    # 2.55f

    mul-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method
