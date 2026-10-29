.class public Lv8/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/os/Bundle;

.field public final b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lv8/a$a;->a:Landroid/os/Bundle;

    iput-object p1, p0, Lv8/a$a;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Lv8/a;
    .locals 9
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lv8/a$a;->c:Ljava/lang/String;

    const-string v1, "setObject is required before calling build()."

    invoke-static {v0, v1}, Ln9/m;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lv8/a$a;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Ln9/m;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/google/android/gms/internal/appindex/zzk;

    iget-object v3, p0, Lv8/a$a;->b:Ljava/lang/String;

    iget-object v4, p0, Lv8/a$a;->c:Ljava/lang/String;

    iget-object v5, p0, Lv8/a$a;->d:Ljava/lang/String;

    iget-object v6, p0, Lv8/a$a;->e:Ljava/lang/String;

    iget-object v7, p0, Lv8/a$a;->f:Ljava/lang/String;

    iget-object v8, p0, Lv8/a$a;->a:Landroid/os/Bundle;

    invoke-direct/range {v2 .. v8}, Lcom/google/android/gms/internal/appindex/zzk;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-object v2
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)Lv8/a$a;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    invoke-static {p1}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Ln9/m;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lv8/a$a;->c:Ljava/lang/String;

    iput-object p2, p0, Lv8/a$a;->d:Ljava/lang/String;

    return-object p0
.end method
