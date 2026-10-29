.class public final synthetic Lnf/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lnf/b;

.field public final synthetic b:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Lnf/b;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnf/a;->a:Lnf/b;

    iput-object p2, p0, Lnf/a;->b:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lnf/a;->a:Lnf/b;

    iget-object v1, p0, Lnf/a;->b:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Lnf/b;->a(Lnf/b;Ljava/lang/Runnable;)V

    return-void
.end method
