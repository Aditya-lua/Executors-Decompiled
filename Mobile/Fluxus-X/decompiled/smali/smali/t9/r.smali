.class public final Lt9/r;
.super Lt9/b;
.source "SourceFile"


# instance fields
.field public final synthetic a:Ltb/k;


# direct methods
.method public constructor <init>(Lt9/v;Ltb/k;)V
    .locals 0

    iput-object p2, p0, Lt9/r;->a:Ltb/k;

    invoke-direct {p0}, Lt9/b;-><init>()V

    return-void
.end method


# virtual methods
.method public final A1(Lcom/google/android/gms/common/api/Status;Ls9/b;)V
    .locals 1

    iget-object v0, p0, Lt9/r;->a:Ltb/k;

    invoke-static {p1, p2, v0}, Lm9/v;->c(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Ltb/k;)Z

    return-void
.end method
