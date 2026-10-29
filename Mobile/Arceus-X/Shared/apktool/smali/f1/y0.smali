.class public final synthetic Lf1/y0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lf1/r0$j;

.field public final synthetic b:Lf1/b2;


# direct methods
.method public synthetic constructor <init>(Lf1/r0$j;Lf1/b2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/y0;->a:Lf1/r0$j;

    iput-object p2, p0, Lf1/y0;->b:Lf1/b2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lf1/y0;->a:Lf1/r0$j;

    iget-object v1, p0, Lf1/y0;->b:Lf1/b2;

    invoke-static {v0, v1}, Lf1/r0$j;->e(Lf1/r0$j;Lf1/b2;)V

    return-void
.end method
