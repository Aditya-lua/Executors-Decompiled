.class public final synthetic Lb3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lb3/g;


# direct methods
.method public synthetic constructor <init>(Lb3/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb3/f;->a:Lb3/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lb3/f;->a:Lb3/g;

    invoke-static {v0}, Lb3/g;->a(Lb3/g;)V

    return-void
.end method
