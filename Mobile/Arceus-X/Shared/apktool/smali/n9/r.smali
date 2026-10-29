.class public Ln9/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk9/a$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln9/r$a;
    }
.end annotation


# static fields
.field public static final b:Ln9/r;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Ln9/r;->a()Ln9/r$a;

    move-result-object v0

    invoke-virtual {v0}, Ln9/r$a;->a()Ln9/r;

    move-result-object v0

    sput-object v0, Ln9/r;->b:Ln9/r;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ln9/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln9/r;->a:Ljava/lang/String;

    return-void
.end method

.method public static a()Ln9/r$a;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Ln9/r$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ln9/r$a;-><init>(Ln9/u;)V

    return-object v0
.end method


# virtual methods
.method public final b()Landroid/os/Bundle;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Ln9/r;->a:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v2, "api"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Ln9/r;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Ln9/r;

    iget-object v0, p0, Ln9/r;->a:Ljava/lang/String;

    iget-object p1, p1, Ln9/r;->a:Ljava/lang/String;

    invoke-static {v0, p1}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Ln9/r;->a:Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ln9/k;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
