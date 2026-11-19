.class public final synthetic Lxa/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lxa/l;

.field public final synthetic b:Ltb/k;


# direct methods
.method public synthetic constructor <init>(Lxa/l;Ltb/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxa/h;->a:Lxa/l;

    iput-object p2, p0, Lxa/h;->b:Ltb/k;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lxa/h;->a:Lxa/l;

    iget-object v1, p0, Lxa/h;->b:Ltb/k;

    invoke-virtual {v0, v1}, Lxa/l;->d(Ltb/k;)V

    return-void
.end method
