.class public Loj/i$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lak/e0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loj/i;->a(Landroid/content/Context;Lpj/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Lk2/k$f;

.field public final synthetic c:Lpj/f;

.field public final synthetic d:Lak/k0;

.field public final synthetic e:Loj/i;


# direct methods
.method public constructor <init>(Loj/i;Landroid/content/Context;Lk2/k$f;Lpj/f;Lak/k0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Loj/i$a;->e:Loj/i;

    iput-object p2, p0, Loj/i$a;->a:Landroid/content/Context;

    iput-object p3, p0, Loj/i$a;->b:Lk2/k$f;

    iput-object p4, p0, Loj/i$a;->c:Lpj/f;

    iput-object p5, p0, Loj/i$a;->d:Lak/k0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    iget-object v0, p0, Loj/i$a;->e:Loj/i;

    iget-object v1, p0, Loj/i$a;->a:Landroid/content/Context;

    iget-object v2, p0, Loj/i$a;->b:Lk2/k$f;

    iget-object v3, p0, Loj/i$a;->c:Lpj/f;

    invoke-static {v0, v1, v2, v3}, Loj/i;->i(Loj/i;Landroid/content/Context;Lk2/k$f;Lpj/f;)V

    iget-object v0, p0, Loj/i$a;->d:Lak/k0;

    invoke-virtual {v0, p0}, Lak/k0;->R(Lak/e0;)V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Loj/i$a;->d:Lak/k0;

    invoke-virtual {v0, p0}, Lak/k0;->R(Lak/e0;)V

    return-void
.end method
