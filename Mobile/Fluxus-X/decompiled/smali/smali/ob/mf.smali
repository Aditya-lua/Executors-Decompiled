.class public final synthetic Lob/mf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lob/va;


# direct methods
.method public synthetic constructor <init>(Lob/va;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lob/mf;->a:Lob/va;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 1

    iget-object v0, p0, Lob/mf;->a:Lob/va;

    invoke-virtual {v0}, Lob/va;->u0()V

    return-void
.end method
