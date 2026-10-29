.class public final Ls9/c;
.super Ls9/i;
.source "SourceFile"


# instance fields
.field public final a:Ll9/k;


# direct methods
.method public constructor <init>(Ll9/k;)V
    .locals 0

    invoke-direct {p0}, Ls9/i;-><init>()V

    iput-object p1, p0, Ls9/c;->a:Ll9/k;

    return-void
.end method


# virtual methods
.method public final P1(Lcom/google/android/gms/common/moduleinstall/ModuleInstallStatusUpdate;)V
    .locals 1

    new-instance v0, Ls9/b;

    invoke-direct {v0, p0, p1}, Ls9/b;-><init>(Ls9/c;Lcom/google/android/gms/common/moduleinstall/ModuleInstallStatusUpdate;)V

    iget-object p1, p0, Ls9/c;->a:Ll9/k;

    invoke-virtual {p1, v0}, Ll9/k;->c(Ll9/k$b;)V

    return-void
.end method
