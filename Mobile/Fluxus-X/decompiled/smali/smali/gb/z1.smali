.class public final Lgb/z1;
.super Lgb/f1;
.source "SourceFile"


# instance fields
.field public final synthetic a:Ltb/k;


# direct methods
.method public constructor <init>(Lgb/b2;Ltb/k;)V
    .locals 0

    iput-object p2, p0, Lgb/z1;->a:Ltb/k;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0}, Lgb/f1;-><init>()V

    return-void
.end method


# virtual methods
.method public final k1(Lcom/google/android/gms/common/api/Status;Lgb/f2;)V
    .locals 1

    if-nez p2, :cond_0

    iget-object p2, p0, Lgb/z1;->a:Ltb/k;

    new-instance v0, Ll9/b;

    invoke-direct {v0, p1}, Ll9/b;-><init>(Lcom/google/android/gms/common/api/Status;)V

    invoke-virtual {p2, v0}, Ltb/k;->b(Ljava/lang/Exception;)V

    return-void

    :cond_0
    iget-object p1, p0, Lgb/z1;->a:Ltb/k;

    invoke-virtual {p1, p2}, Ltb/k;->c(Ljava/lang/Object;)V

    return-void
.end method
