.class public final Ly8/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk9/a$d;


# static fields
.field public static final b:Ly8/c;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# instance fields
.field public final a:Landroid/os/Bundle;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    new-instance v1, Ly8/c;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Ly8/c;-><init>(Landroid/os/Bundle;Ly8/i;)V

    sput-object v1, Ly8/c;->b:Ly8/c;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Bundle;Ly8/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly8/c;->a:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Landroid/os/Bundle;

    iget-object v1, p0, Ly8/c;->a:Landroid/os/Bundle;

    invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Ly8/c;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Ly8/c;

    iget-object v0, p0, Ly8/c;->a:Landroid/os/Bundle;

    iget-object p1, p1, Ly8/c;->a:Landroid/os/Bundle;

    invoke-static {v0, p1}, Ln9/k;->a(Landroid/os/Bundle;Landroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Ly8/c;->a:Landroid/os/Bundle;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ln9/k;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
