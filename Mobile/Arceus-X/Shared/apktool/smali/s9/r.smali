.class public final Ls9/r;
.super Ls9/a;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lsb/k;


# direct methods
.method public constructor <init>(Ls9/u;Lsb/k;)V
    .locals 0

    iput-object p2, p0, Ls9/r;->a:Lsb/k;

    invoke-direct {p0}, Ls9/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final s1(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/common/moduleinstall/ModuleInstallResponse;)V
    .locals 1

    iget-object v0, p0, Ls9/r;->a:Lsb/k;

    invoke-static {p1, p2, v0}, Ll9/v;->c(Lcom/google/android/gms/common/api/Status;Ljava/lang/Object;Lsb/k;)Z

    return-void
.end method
