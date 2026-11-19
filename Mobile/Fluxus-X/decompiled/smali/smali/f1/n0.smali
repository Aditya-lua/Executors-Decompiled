.class public final synthetic Lf1/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lf1/r0;

.field public final synthetic b:Lf1/a2$a;


# direct methods
.method public synthetic constructor <init>(Lf1/r0;Lf1/a2$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/n0;->a:Lf1/r0;

    iput-object p2, p0, Lf1/n0;->b:Lf1/a2$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lf1/n0;->a:Lf1/r0;

    iget-object v1, p0, Lf1/n0;->b:Lf1/a2$a;

    invoke-static {v0, v1}, Lf1/r0;->m(Lf1/r0;Lf1/a2$a;)V

    return-void
.end method
