.class public final synthetic Lza/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm9/q;


# instance fields
.field public final synthetic a:Lza/o;


# direct methods
.method public synthetic constructor <init>(Lza/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lza/g;->a:Lza/o;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lza/g;->a:Lza/o;

    check-cast p1, Lza/p;

    check-cast p2, Ltb/k;

    invoke-virtual {v0, p1, p2}, Lza/o;->Q(Lza/p;Ltb/k;)V

    return-void
.end method
