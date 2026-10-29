.class public final synthetic Lim/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsb/f;


# instance fields
.field public final synthetic a:Lim/l$b;


# direct methods
.method public synthetic constructor <init>(Lim/l$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lim/i;->a:Lim/l$b;

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/Exception;)V
    .locals 1

    iget-object v0, p0, Lim/i;->a:Lim/l$b;

    invoke-static {v0, p1}, Lim/l;->d(Lim/l$b;Ljava/lang/Exception;)V

    return-void
.end method
