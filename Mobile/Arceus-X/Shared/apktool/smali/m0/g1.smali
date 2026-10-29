.class public final synthetic Lm0/g1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lm0/l1;

.field public final synthetic b:Lg0/h1;


# direct methods
.method public synthetic constructor <init>(Lm0/l1;Lg0/h1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/g1;->a:Lm0/l1;

    iput-object p2, p0, Lm0/g1;->b:Lg0/h1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lm0/g1;->a:Lm0/l1;

    iget-object v1, p0, Lm0/g1;->b:Lg0/h1;

    invoke-static {v0, v1}, Lm0/l1;->a(Lm0/l1;Lg0/h1;)V

    return-void
.end method
