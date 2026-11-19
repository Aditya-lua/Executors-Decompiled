.class public final Ljb/l;
.super Ljb/e;
.source "SourceFile"


# instance fields
.field public final synthetic b:Ljb/m;


# direct methods
.method public constructor <init>(Ljb/m;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Ljb/l;->b:Ljb/m;

    invoke-direct {p0}, Ljb/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    iget-object v0, p0, Ljb/l;->b:Ljb/m;

    iget-object v0, v0, Ljb/m;->a:Ljb/o;

    invoke-static {v0}, Ljb/o;->s(Ljb/o;)V

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljb/o;->n(Ljb/o;Landroid/os/IInterface;)V

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljb/o;->m(Ljb/o;Z)V

    return-void
.end method
