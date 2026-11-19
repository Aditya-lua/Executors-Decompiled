.class public final synthetic Lm0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/a;


# instance fields
.field public final synthetic a:Lm0/x;


# direct methods
.method public synthetic constructor <init>(Lm0/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/r;->a:Lm0/x;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lm0/r;->a:Lm0/x;

    check-cast p1, Lm0/b1$a;

    invoke-virtual {v0, p1}, Lm0/x;->p(Lm0/b1$a;)V

    return-void
.end method
