.class public final synthetic Lx0/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lx0/t;

.field public final synthetic b:Lg0/v2;


# direct methods
.method public synthetic constructor <init>(Lx0/t;Lg0/v2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx0/o;->a:Lx0/t;

    iput-object p2, p0, Lx0/o;->b:Lg0/v2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lx0/o;->a:Lx0/t;

    iget-object v1, p0, Lx0/o;->b:Lg0/v2;

    invoke-static {v0, v1}, Lx0/t;->p(Lx0/t;Lg0/v2;)V

    return-void
.end method
