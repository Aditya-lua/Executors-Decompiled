.class public final synthetic Lf1/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lf1/r0$k;

.field public final synthetic b:Lg0/v2;

.field public final synthetic c:Ln0/a4;


# direct methods
.method public synthetic constructor <init>(Lf1/r0$k;Lg0/v2;Ln0/a4;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/b1;->a:Lf1/r0$k;

    iput-object p2, p0, Lf1/b1;->b:Lg0/v2;

    iput-object p3, p0, Lf1/b1;->c:Ln0/a4;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lf1/b1;->a:Lf1/r0$k;

    iget-object v1, p0, Lf1/b1;->b:Lg0/v2;

    iget-object v2, p0, Lf1/b1;->c:Ln0/a4;

    invoke-static {v0, v1, v2}, Lf1/r0$k;->a(Lf1/r0$k;Lg0/v2;Ln0/a4;)V

    return-void
.end method
