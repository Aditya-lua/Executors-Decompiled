.class public final synthetic Lf1/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lf1/r0;

.field public final synthetic b:Lg0/v2;

.field public final synthetic c:Ln0/a4;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(Lf1/r0;Lg0/v2;Ln0/a4;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/p0;->a:Lf1/r0;

    iput-object p2, p0, Lf1/p0;->b:Lg0/v2;

    iput-object p3, p0, Lf1/p0;->c:Ln0/a4;

    iput-boolean p4, p0, Lf1/p0;->d:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lf1/p0;->a:Lf1/r0;

    iget-object v1, p0, Lf1/p0;->b:Lg0/v2;

    iget-object v2, p0, Lf1/p0;->c:Ln0/a4;

    iget-boolean v3, p0, Lf1/p0;->d:Z

    invoke-static {v0, v1, v2, v3}, Lf1/r0;->o(Lf1/r0;Lg0/v2;Ln0/a4;Z)V

    return-void
.end method
