.class public final synthetic Lza/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm9/q;


# instance fields
.field public final synthetic a:Lza/o;

.field public final synthetic b:La9/d;


# direct methods
.method public synthetic constructor <init>(Lza/o;La9/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lza/f;->a:Lza/o;

    iput-object p2, p0, Lza/f;->b:La9/d;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lza/f;->a:Lza/o;

    iget-object v1, p0, Lza/f;->b:La9/d;

    check-cast p1, Lza/p;

    check-cast p2, Ltb/k;

    invoke-virtual {v0, v1, p1, p2}, Lza/o;->P(La9/d;Lza/p;Ltb/k;)V

    return-void
.end method
