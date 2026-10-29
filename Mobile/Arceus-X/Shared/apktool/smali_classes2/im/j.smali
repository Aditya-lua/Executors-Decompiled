.class public final synthetic Lim/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsb/g;


# instance fields
.field public final synthetic a:Lim/l$b;


# direct methods
.method public synthetic constructor <init>(Lim/l$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lim/j;->a:Lim/l$b;

    return-void
.end method


# virtual methods
.method public final onSuccess(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lim/j;->a:Lim/l$b;

    check-cast p1, Ljava/lang/Void;

    invoke-static {v0, p1}, Lim/l;->c(Lim/l$b;Ljava/lang/Void;)V

    return-void
.end method
