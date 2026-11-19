.class public final synthetic Lfm/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lfm/u;


# direct methods
.method public synthetic constructor <init>(Lfm/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfm/t;->a:Lfm/u;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lfm/t;->a:Lfm/u;

    invoke-static {v0}, Lfm/u;->a(Lfm/u;)V

    return-void
.end method
