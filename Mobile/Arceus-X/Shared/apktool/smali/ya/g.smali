.class public final synthetic Lya/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll9/q;


# instance fields
.field public final synthetic a:Lya/o;


# direct methods
.method public synthetic constructor <init>(Lya/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lya/g;->a:Lya/o;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lya/g;->a:Lya/o;

    check-cast p1, Lya/p;

    check-cast p2, Lsb/k;

    invoke-virtual {v0, p1, p2}, Lya/o;->Q(Lya/p;Lsb/k;)V

    return-void
.end method
