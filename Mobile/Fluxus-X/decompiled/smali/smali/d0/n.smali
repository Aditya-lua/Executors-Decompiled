.class public Ld0/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public b:Z


# direct methods
.method public constructor <init>(Ln0/k3;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ld0/n;->b:Z

    const-class v1, Landroidx/camera/camera2/internal/compat/quirk/AutoFlashUnderExposedQuirk;

    invoke-virtual {p1, v1}, Ln0/k3;->b(Ljava/lang/Class;)Ln0/g3;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput-boolean v0, p0, Ld0/n;->a:Z

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Ld0/n;->b:Z

    return-void
.end method

.method public b()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Ld0/n;->b:Z

    return-void
.end method

.method public c(I)Z
    .locals 1

    iget-boolean v0, p0, Ld0/n;->b:Z

    if-eqz v0, :cond_0

    if-nez p1, :cond_0

    iget-boolean p1, p0, Ld0/n;->a:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
