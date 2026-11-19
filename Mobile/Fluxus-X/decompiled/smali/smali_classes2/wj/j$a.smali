.class public Lwj/j$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lik/e0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwj/j;->a(Landroid/content/Context;Lxj/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Lk2/k$f;

.field public final synthetic c:Lxj/f;

.field public final synthetic d:Lik/k0;

.field public final synthetic e:Lwj/j;


# direct methods
.method public constructor <init>(Lwj/j;Landroid/content/Context;Lk2/k$f;Lxj/f;Lik/k0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lwj/j$a;->e:Lwj/j;

    iput-object p2, p0, Lwj/j$a;->a:Landroid/content/Context;

    iput-object p3, p0, Lwj/j$a;->b:Lk2/k$f;

    iput-object p4, p0, Lwj/j$a;->c:Lxj/f;

    iput-object p5, p0, Lwj/j$a;->d:Lik/k0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    iget-object v0, p0, Lwj/j$a;->e:Lwj/j;

    iget-object v1, p0, Lwj/j$a;->a:Landroid/content/Context;

    iget-object v2, p0, Lwj/j$a;->b:Lk2/k$f;

    iget-object v3, p0, Lwj/j$a;->c:Lxj/f;

    invoke-static {v0, v1, v2, v3}, Lwj/j;->i(Lwj/j;Landroid/content/Context;Lk2/k$f;Lxj/f;)V

    iget-object v0, p0, Lwj/j$a;->d:Lik/k0;

    invoke-virtual {v0, p0}, Lik/k0;->R(Lik/e0;)V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lwj/j$a;->d:Lik/k0;

    invoke-virtual {v0, p0}, Lik/k0;->R(Lik/e0;)V

    return-void
.end method
