.class public final synthetic Lmd/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/c$a;


# instance fields
.field public final synthetic a:Lmd/p;


# direct methods
.method public synthetic constructor <init>(Lmd/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmd/n;->a:Lmd/p;

    return-void
.end method


# virtual methods
.method public final onTouchExplorationStateChanged(Z)V
    .locals 1

    iget-object v0, p0, Lmd/n;->a:Lmd/p;

    invoke-static {v0, p1}, Lmd/p;->w(Lmd/p;Z)V

    return-void
.end method
