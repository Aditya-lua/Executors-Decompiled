.class public final synthetic Lbg/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lbg/g;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Lbg/g;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbg/e;->a:Lbg/g;

    iput-boolean p2, p0, Lbg/e;->b:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lbg/e;->a:Lbg/g;

    iget-boolean v1, p0, Lbg/e;->b:Z

    invoke-static {v0, v1}, Lbg/g;->c(Lbg/g;Z)V

    return-void
.end method
