.class public final synthetic Lmd/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lmd/f;


# direct methods
.method public synthetic constructor <init>(Lmd/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmd/d;->a:Lmd/f;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lmd/d;->a:Lmd/f;

    invoke-static {v0}, Lmd/f;->z(Lmd/f;)V

    return-void
.end method
