.class public final Ld1/g$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld1/g;->u(Landroid/content/Context;Lg0/g0;)Lne/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lr0/c<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "d1/g$b",
        "Lr0/c;",
        "Ljava/lang/Void;",
        "void",
        "",
        "a",
        "(Ljava/lang/Void;)V",
        "",
        "t",
        "onFailure",
        "(Ljava/lang/Throwable;)V",
        "camera-lifecycle_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Ld1/g;

.field public final synthetic b:Lg0/f0;

.field public final synthetic c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Ld1/g;Lg0/f0;Landroid/content/Context;)V
    .locals 0

    iput-object p1, p0, Ld1/g$b;->a:Ld1/g;

    iput-object p2, p0, Ld1/g$b;->b:Lg0/f0;

    iput-object p3, p0, Ld1/g$b;->c:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Void;)V
    .locals 1

    iget-object p1, p0, Ld1/g$b;->a:Ld1/g;

    iget-object v0, p0, Ld1/g$b;->b:Lg0/f0;

    invoke-static {p1, v0}, Ld1/g;->l(Ld1/g;Lg0/f0;)V

    iget-object p1, p0, Ld1/g$b;->a:Ld1/g;

    iget-object v0, p0, Ld1/g$b;->c:Landroid/content/Context;

    invoke-static {v0}, Lp0/f;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Ld1/g;->A(Landroid/content/Context;)V

    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "t"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Ld1/g$b;->a:Ld1/g;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ld1/g;->B(Z)Lne/x;

    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Ld1/g$b;->a(Ljava/lang/Void;)V

    return-void
.end method
