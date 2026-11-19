.class public final synthetic Lf4/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lf4/f$g;


# direct methods
.method public synthetic constructor <init>(Lf4/f$g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf4/n;->a:Lf4/f$g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lf4/n;->a:Lf4/f$g;

    invoke-static {v0}, Lf4/f$g$b$a;->b(Lf4/f$g;)V

    return-void
.end method
