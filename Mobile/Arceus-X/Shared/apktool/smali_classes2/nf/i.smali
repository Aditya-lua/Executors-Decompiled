.class public final synthetic Lnf/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnf/o;

.field public final synthetic b:Ljava/lang/Runnable;

.field public final synthetic c:Lnf/p$b;


# direct methods
.method public synthetic constructor <init>(Lnf/o;Ljava/lang/Runnable;Lnf/p$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnf/i;->a:Lnf/o;

    iput-object p2, p0, Lnf/i;->b:Ljava/lang/Runnable;

    iput-object p3, p0, Lnf/i;->c:Lnf/p$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lnf/i;->a:Lnf/o;

    iget-object v1, p0, Lnf/i;->b:Ljava/lang/Runnable;

    iget-object v2, p0, Lnf/i;->c:Lnf/p$b;

    invoke-static {v0, v1, v2}, Lnf/o;->g(Lnf/o;Ljava/lang/Runnable;Lnf/p$b;)V

    return-void
.end method
