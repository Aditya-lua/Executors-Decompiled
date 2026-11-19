.class public final Lcom/withpersona/sdk2/inquiry/internal/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldr/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/withpersona/sdk2/inquiry/internal/i;->i2(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001R \u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007R \u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\u000b\u0010\rR \u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0011\u001a\u0004\u0008\u0004\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0015\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00148\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0016\u001a\u0004\u0008\u0019\u0010\u0017\u00a8\u0006\u001b"
    }
    d2 = {
        "com/withpersona/sdk2/inquiry/internal/i$a",
        "Ldr/e;",
        "Ldv/h;",
        "Ldr/a;",
        "a",
        "Ldv/h;",
        "c",
        "()Ldv/h;",
        "controllerRequestFlow",
        "Ldv/c0;",
        "Lkp/e;",
        "b",
        "Ldv/c0;",
        "()Ldv/c0;",
        "screenStateFlow",
        "Ldv/b0;",
        "Lkp/d;",
        "Ldv/b0;",
        "()Ldv/b0;",
        "eventFlow",
        "",
        "d",
        "Z",
        "()Z",
        "isNavBarEnabled",
        "e",
        "handleBackPress",
        "inquiry-internal_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:Ldv/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldv/h<",
            "Ldr/a;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ldv/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldv/c0<",
            "Lkp/e;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ldv/b0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldv/b0<",
            "Lkp/d;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Z

.field public final e:Z


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/internal/i;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/internal/i;->e2(Lcom/withpersona/sdk2/inquiry/internal/i;)Lnp/z;

    move-result-object v0

    invoke-virtual {v0}, Lnp/z;->g()Ldv/b0;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/i$a;->a:Ldv/h;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/internal/i;->e2(Lcom/withpersona/sdk2/inquiry/internal/i;)Lnp/z;

    move-result-object v0

    invoke-virtual {v0}, Lnp/z;->x()Ldv/c0;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/i$a;->b:Ldv/c0;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/internal/i;->e2(Lcom/withpersona/sdk2/inquiry/internal/i;)Lnp/z;

    move-result-object v0

    invoke-virtual {v0}, Lnp/z;->l()Ldv/b0;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/i$a;->c:Ldv/b0;

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/internal/i;->d2(Lcom/withpersona/sdk2/inquiry/internal/i;)Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/internal/h;->H()Z

    move-result v0

    iput-boolean v0, p0, Lcom/withpersona/sdk2/inquiry/internal/i$a;->d:Z

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/internal/i;->d2(Lcom/withpersona/sdk2/inquiry/internal/i;)Lcom/withpersona/sdk2/inquiry/internal/h;

    move-result-object p1

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/internal/h;->l()Z

    move-result p1

    iput-boolean p1, p0, Lcom/withpersona/sdk2/inquiry/internal/i$a;->e:Z

    return-void
.end method


# virtual methods
.method public a()Ldv/b0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldv/b0<",
            "Lkp/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/i$a;->c:Ldv/b0;

    return-object v0
.end method

.method public b()Ldv/c0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldv/c0<",
            "Lkp/e;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/i$a;->b:Ldv/c0;

    return-object v0
.end method

.method public c()Ldv/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldv/h<",
            "Ldr/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/internal/i$a;->a:Ldv/h;

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/withpersona/sdk2/inquiry/internal/i$a;->d:Z

    return v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/withpersona/sdk2/inquiry/internal/i$a;->e:Z

    return v0
.end method
