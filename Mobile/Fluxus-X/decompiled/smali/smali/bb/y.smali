.class public final Lbb/y;
.super Lbb/k;
.source "SourceFile"


# instance fields
.field public final synthetic a:Ltb/k;


# direct methods
.method public constructor <init>(Lbb/b;Ltb/k;)V
    .locals 0

    iput-object p2, p0, Lbb/y;->a:Ltb/k;

    invoke-direct {p0}, Lbb/k;-><init>()V

    return-void
.end method


# virtual methods
.method public final h(Lcom/google/android/gms/common/api/Status;Z)V
    .locals 1

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    iget-object v0, p0, Lbb/y;->a:Ltb/k;

    invoke-static {p1, p2, v0}, Lm9/v;->a(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Ltb/k;)V

    return-void
.end method
