.class public final synthetic Lx0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/a;


# instance fields
.field public final synthetic a:Lx0/t;

.field public final synthetic b:Lg0/j2;


# direct methods
.method public synthetic constructor <init>(Lx0/t;Lg0/j2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx0/r;->a:Lx0/t;

    iput-object p2, p0, Lx0/r;->b:Lg0/j2;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lx0/r;->a:Lx0/t;

    iget-object v1, p0, Lx0/r;->b:Lg0/j2;

    check-cast p1, Lg0/j2$b;

    invoke-static {v0, v1, p1}, Lx0/t;->l(Lx0/t;Lg0/j2;Lg0/j2$b;)V

    return-void
.end method
