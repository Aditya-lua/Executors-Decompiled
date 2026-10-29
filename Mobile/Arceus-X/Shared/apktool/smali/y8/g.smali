.class public final Ly8/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk9/a$d;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final d:Ly8/g;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z

.field public final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ly8/f;

    invoke-direct {v0}, Ly8/f;-><init>()V

    new-instance v1, Ly8/g;

    invoke-direct {v1, v0}, Ly8/g;-><init>(Ly8/f;)V

    sput-object v1, Ly8/g;->d:Ly8/g;

    return-void
.end method

.method public constructor <init>(Ly8/f;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Ly8/g;->a:Ljava/lang/String;

    iget-object v0, p1, Ly8/f;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Ly8/g;->b:Z

    iget-object p1, p1, Ly8/f;->b:Ljava/lang/String;

    iput-object p1, p0, Ly8/g;->c:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic b(Ly8/g;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ly8/g;->a:Ljava/lang/String;

    const/4 p0, 0x0

    return-object p0
.end method

.method public static bridge synthetic c(Ly8/g;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ly8/g;->c:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic d(Ly8/g;)Z
    .locals 0

    iget-boolean p0, p0, Ly8/g;->b:Z

    return p0
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "consumer_package"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "force_save_dialog"

    iget-boolean v2, p0, Ly8/g;->b:Z

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "log_session_id"

    iget-object v2, p0, Ly8/g;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ly8/g;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ly8/g;

    const/4 v1, 0x0

    invoke-static {v1, v1}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Ly8/g;->b:Z

    iget-boolean v3, p1, Ly8/g;->b:Z

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Ly8/g;->c:Ljava/lang/String;

    iget-object p1, p1, Ly8/g;->c:Ljava/lang/String;

    invoke-static {v1, p1}, Ln9/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 3

    iget-boolean v0, p0, Ly8/g;->b:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget-object v1, p0, Ly8/g;->c:Ljava/lang/String;

    const/4 v2, 0x0

    filled-new-array {v2, v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ln9/k;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
