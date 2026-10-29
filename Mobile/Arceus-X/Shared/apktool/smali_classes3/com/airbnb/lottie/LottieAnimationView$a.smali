.class public Lcom/airbnb/lottie/LottieAnimationView$a;
.super Lt7/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/lottie/LottieAnimationView;->l(Ll7/e;Ljava/lang/Object;Lt7/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lt7/c<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic d:Lt7/e;

.field public final synthetic e:Lcom/airbnb/lottie/LottieAnimationView;


# direct methods
.method public constructor <init>(Lcom/airbnb/lottie/LottieAnimationView;Lt7/e;)V
    .locals 0

    iput-object p2, p0, Lcom/airbnb/lottie/LottieAnimationView$a;->d:Lt7/e;

    iput-object p1, p0, Lcom/airbnb/lottie/LottieAnimationView$a;->e:Lcom/airbnb/lottie/LottieAnimationView;

    invoke-direct {p0}, Lt7/c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lt7/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt7/b<",
            "TT;>;)TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView$a;->d:Lt7/e;

    invoke-interface {v0, p1}, Lt7/e;->a(Lt7/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
