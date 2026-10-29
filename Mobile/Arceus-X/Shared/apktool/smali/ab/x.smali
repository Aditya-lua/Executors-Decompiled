.class public final Lab/x;
.super Lab/i;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lsb/k;


# direct methods
.method public constructor <init>(Lab/b;Lsb/k;)V
    .locals 0

    iput-object p2, p0, Lab/x;->a:Lsb/k;

    invoke-direct {p0}, Lab/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final h(Lcom/google/android/gms/common/api/Status;Z)V
    .locals 1

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    iget-object v0, p0, Lab/x;->a:Lsb/k;

    invoke-static {p1, p2, v0}, Ll9/v;->a(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lsb/k;)V

    return-void
.end method
