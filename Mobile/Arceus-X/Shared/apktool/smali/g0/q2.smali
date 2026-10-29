.class public final synthetic Lg0/q2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lg0/v2$i;

.field public final synthetic b:Lg0/v2$h;


# direct methods
.method public synthetic constructor <init>(Lg0/v2$i;Lg0/v2$h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/q2;->a:Lg0/v2$i;

    iput-object p2, p0, Lg0/q2;->b:Lg0/v2$h;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lg0/q2;->a:Lg0/v2$i;

    iget-object v1, p0, Lg0/q2;->b:Lg0/v2$h;

    invoke-static {v0, v1}, Lg0/v2;->b(Lg0/v2$i;Lg0/v2$h;)V

    return-void
.end method
