.class public final synthetic Ly0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/a;


# instance fields
.field public final synthetic a:Ly0/o;

.field public final synthetic b:Lg0/j2;


# direct methods
.method public synthetic constructor <init>(Ly0/o;Lg0/j2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly0/j;->a:Ly0/o;

    iput-object p2, p0, Ly0/j;->b:Lg0/j2;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Ly0/j;->a:Ly0/o;

    iget-object v1, p0, Ly0/j;->b:Lg0/j2;

    check-cast p1, Lg0/j2$b;

    invoke-static {v0, v1, p1}, Ly0/o;->i(Ly0/o;Lg0/j2;Lg0/j2$b;)V

    return-void
.end method
