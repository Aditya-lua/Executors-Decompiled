.class public final synthetic Ld1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lj0/b;

.field public final synthetic b:Lg0/g2;


# direct methods
.method public synthetic constructor <init>(Lj0/b;Lg0/g2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld1/b;->a:Lj0/b;

    iput-object p2, p0, Ld1/b;->b:Lg0/g2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ld1/b;->a:Lj0/b;

    iget-object v1, p0, Ld1/b;->b:Lg0/g2;

    invoke-static {v0, v1}, Ld1/c;->m(Lj0/b;Lg0/g2;)V

    return-void
.end method
