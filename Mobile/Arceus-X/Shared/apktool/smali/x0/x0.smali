.class public final synthetic Lx0/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lx0/y0;

.field public final synthetic b:Lg0/j2;


# direct methods
.method public synthetic constructor <init>(Lx0/y0;Lg0/j2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx0/x0;->a:Lx0/y0;

    iput-object p2, p0, Lx0/x0;->b:Lg0/j2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lx0/x0;->a:Lx0/y0;

    iget-object v1, p0, Lx0/x0;->b:Lg0/j2;

    invoke-static {v0, v1}, Lx0/y0;->e(Lx0/y0;Lg0/j2;)V

    return-void
.end method
