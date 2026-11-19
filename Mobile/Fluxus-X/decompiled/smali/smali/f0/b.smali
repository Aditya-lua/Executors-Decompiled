.class public final synthetic Lf0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lf0/g;

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(Lf0/g;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf0/b;->a:Lf0/g;

    iput-boolean p2, p0, Lf0/b;->b:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lf0/b;->a:Lf0/g;

    iget-boolean v1, p0, Lf0/b;->b:Z

    invoke-static {v0, v1}, Lf0/g;->e(Lf0/g;Z)V

    return-void
.end method
