.class public final synthetic Lmd/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lmd/p;


# direct methods
.method public synthetic constructor <init>(Lmd/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmd/o;->a:Lmd/p;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lmd/o;->a:Lmd/p;

    invoke-static {v0}, Lmd/p;->v(Lmd/p;)V

    return-void
.end method
