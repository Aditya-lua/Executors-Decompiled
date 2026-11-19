.class public final synthetic Lm0/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lm0/l1;

.field public final synthetic b:Lg0/f1$i;


# direct methods
.method public synthetic constructor <init>(Lm0/l1;Lg0/f1$i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/j1;->a:Lm0/l1;

    iput-object p2, p0, Lm0/j1;->b:Lg0/f1$i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lm0/j1;->a:Lm0/l1;

    iget-object v1, p0, Lm0/j1;->b:Lg0/f1$i;

    invoke-static {v0, v1}, Lm0/l1;->b(Lm0/l1;Lg0/f1$i;)V

    return-void
.end method
