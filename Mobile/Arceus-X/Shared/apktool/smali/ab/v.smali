.class public final Lab/v;
.super Lab/o;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lsb/k;


# direct methods
.method public constructor <init>(Lab/b;Lsb/k;)V
    .locals 0

    iput-object p2, p0, Lab/v;->a:Lsb/k;

    invoke-direct {p0}, Lab/o;-><init>()V

    return-void
.end method


# virtual methods
.method public final v(Lcom/google/android/gms/common/api/Status;I)V
    .locals 1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iget-object v0, p0, Lab/v;->a:Lsb/k;

    invoke-static {p1, p2, v0}, Ll9/v;->a(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lsb/k;)V

    return-void
.end method
