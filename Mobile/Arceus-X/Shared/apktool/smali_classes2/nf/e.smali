.class public final synthetic Lnf/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/lang/Runnable;

.field public final synthetic b:Lnf/p$b;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Runnable;Lnf/p$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnf/e;->a:Ljava/lang/Runnable;

    iput-object p2, p0, Lnf/e;->b:Lnf/p$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lnf/e;->a:Ljava/lang/Runnable;

    iget-object v1, p0, Lnf/e;->b:Lnf/p$b;

    invoke-static {v0, v1}, Lnf/o;->l(Ljava/lang/Runnable;Lnf/p$b;)V

    return-void
.end method
