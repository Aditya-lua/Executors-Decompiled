.class public Lg0/i0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg0/i0$b;
    }
.end annotation


# static fields
.field public static final d:Lg0/i0;


# instance fields
.field public final a:F

.field public final b:Lx2/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/c<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lx2/c;
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
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lg0/i0$b;

    invoke-direct {v0}, Lg0/i0$b;-><init>()V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lg0/i0$b;->b(F)Lg0/i0$b;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v2}, Lg0/i0$b;->c(FF)Lg0/i0$b;

    move-result-object v0

    invoke-virtual {v0, v1, v1}, Lg0/i0$b;->d(FF)Lg0/i0$b;

    move-result-object v0

    invoke-virtual {v0}, Lg0/i0$b;->a()Lg0/i0;

    move-result-object v0

    sput-object v0, Lg0/i0;->d:Lg0/i0;

    return-void
.end method

.method public constructor <init>(FLx2/c;Lx2/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F",
            "Lx2/c<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;",
            "Lx2/c<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lg0/i0;->a:F

    .line 4
    iput-object p2, p0, Lg0/i0;->b:Lx2/c;

    .line 5
    iput-object p3, p0, Lg0/i0;->c:Lx2/c;

    return-void
.end method

.method public synthetic constructor <init>(FLx2/c;Lx2/c;Lg0/i0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lg0/i0;-><init>(FLx2/c;Lx2/c;)V

    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    iget v0, p0, Lg0/i0;->a:F

    return v0
.end method

.method public b()Lx2/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx2/c<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lg0/i0;->b:Lx2/c;

    return-object v0
.end method

.method public c()Lx2/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lx2/c<",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lg0/i0;->c:Lx2/c;

    return-object v0
.end method
