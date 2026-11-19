.class public final synthetic Lf4/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lf4/c1;

.field public final synthetic b:Lf4/c1$c;


# direct methods
.method public synthetic constructor <init>(Lf4/c1;Lf4/c1$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/a1;->a:Lf4/c1;

    iput-object p2, p0, Lf4/a1;->b:Lf4/c1$c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lf4/a1;->a:Lf4/c1;

    iget-object v1, p0, Lf4/a1;->b:Lf4/c1$c;

    invoke-static {v0, v1}, Lf4/c1;->a(Lf4/c1;Lf4/c1$c;)V

    return-void
.end method
