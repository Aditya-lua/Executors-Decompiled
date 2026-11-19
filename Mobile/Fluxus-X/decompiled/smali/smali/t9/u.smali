.class public final Lt9/u;
.super Lm9/g$a;
.source "SourceFile"


# instance fields
.field public final synthetic a:Ltb/k;


# direct methods
.method public constructor <init>(Lt9/v;Ltb/k;)V
    .locals 0

    iput-object p2, p0, Lt9/u;->a:Ltb/k;

    invoke-direct {p0}, Lm9/g$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final j1(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v1, p0, Lt9/u;->a:Ltb/k;

    invoke-static {p1, v0, v1}, Lm9/v;->c(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Ltb/k;)Z

    return-void
.end method
