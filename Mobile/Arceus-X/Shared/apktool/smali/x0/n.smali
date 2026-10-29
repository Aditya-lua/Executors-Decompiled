.class public final synthetic Lx0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lg0/j2;


# direct methods
.method public synthetic constructor <init>(Lg0/j2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx0/n;->a:Lg0/j2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lx0/n;->a:Lg0/j2;

    invoke-interface {v0}, Lg0/j2;->close()V

    return-void
.end method
