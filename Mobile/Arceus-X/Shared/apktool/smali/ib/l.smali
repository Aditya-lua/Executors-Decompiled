.class public final Lib/l;
.super Lib/e;
.source "SourceFile"


# instance fields
.field public final synthetic b:Lib/m;


# direct methods
.method public constructor <init>(Lib/m;)V
    .locals 0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lib/l;->b:Lib/m;

    invoke-direct {p0}, Lib/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    iget-object v0, p0, Lib/l;->b:Lib/m;

    iget-object v0, v0, Lib/m;->a:Lib/o;

    invoke-static {v0}, Lib/o;->s(Lib/o;)V

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lib/o;->n(Lib/o;Landroid/os/IInterface;)V

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lib/o;->m(Lib/o;Z)V

    return-void
.end method
