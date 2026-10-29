.class public final Ls9/t;
.super Ll9/g$a;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lsb/k;


# direct methods
.method public constructor <init>(Ls9/u;Lsb/k;)V
    .locals 0

    iput-object p2, p0, Ls9/t;->a:Lsb/k;

    invoke-direct {p0}, Ll9/g$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final Z0(Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v1, p0, Ls9/t;->a:Lsb/k;

    invoke-static {p1, v0, v1}, Ll9/v;->c(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lsb/k;)Z

    return-void
.end method
