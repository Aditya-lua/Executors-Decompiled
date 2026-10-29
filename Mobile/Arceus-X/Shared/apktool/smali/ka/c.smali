.class public final synthetic Lka/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lka/d;


# direct methods
.method public synthetic constructor <init>(Lka/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lka/c;->a:Lka/d;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 1

    iget-object v0, p0, Lka/c;->a:Lka/d;

    invoke-virtual {v0}, Lka/d;->c()V

    return-void
.end method
