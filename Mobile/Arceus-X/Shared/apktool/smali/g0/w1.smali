.class public final synthetic Lg0/w1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lg0/a2;


# direct methods
.method public synthetic constructor <init>(Lg0/a2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/w1;->a:Lg0/a2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lg0/w1;->a:Lg0/a2;

    invoke-virtual {v0}, Lg0/w2;->L()V

    return-void
.end method
