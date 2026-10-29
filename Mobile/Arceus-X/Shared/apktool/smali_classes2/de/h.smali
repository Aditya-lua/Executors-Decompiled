.class public final synthetic Lde/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lde/a;

.field public final synthetic b:Lae/e;


# direct methods
.method public synthetic constructor <init>(Lde/a;Lae/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lde/h;->a:Lde/a;

    iput-object p2, p0, Lde/h;->b:Lae/e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lde/h;->a:Lde/a;

    iget-object v1, p0, Lde/h;->b:Lae/e;

    invoke-virtual {v0, v1}, Lde/a;->k(Lae/e;)V

    return-void
.end method
