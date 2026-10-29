.class public final synthetic Lg0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lg0/c;

.field public final synthetic b:Ln0/j2$a;


# direct methods
.method public synthetic constructor <init>(Lg0/c;Ln0/j2$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/b;->a:Lg0/c;

    iput-object p2, p0, Lg0/b;->b:Ln0/j2$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lg0/b;->a:Lg0/c;

    iget-object v1, p0, Lg0/b;->b:Ln0/j2$a;

    invoke-static {v0, v1}, Lg0/c;->h(Lg0/c;Ln0/j2$a;)V

    return-void
.end method
