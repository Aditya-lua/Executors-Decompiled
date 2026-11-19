.class public final synthetic Lf4/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lf4/f;

.field public final synthetic b:Lf4/c1$d;


# direct methods
.method public synthetic constructor <init>(Lf4/f;Lf4/c1$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/d;->a:Lf4/f;

    iput-object p2, p0, Lf4/d;->b:Lf4/c1$d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lf4/d;->a:Lf4/f;

    iget-object v1, p0, Lf4/d;->b:Lf4/c1$d;

    invoke-static {v0, v1}, Lf4/f;->E(Lf4/f;Lf4/c1$d;)V

    return-void
.end method
