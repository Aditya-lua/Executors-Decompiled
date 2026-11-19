.class public final Lm9/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lm9/i0;


# direct methods
.method public constructor <init>(Lm9/i0;)V
    .locals 0

    iput-object p1, p0, Lm9/h0;->a:Lm9/i0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lm9/h0;->a:Lm9/i0;

    iget-object v0, v0, Lm9/i0;->a:Lm9/j0;

    invoke-static {v0}, Lm9/j0;->s(Lm9/j0;)Ll9/a$f;

    move-result-object v1

    invoke-static {v0}, Lm9/j0;->s(Lm9/j0;)Ll9/a$f;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v2, " disconnecting because it was signed out."

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ll9/a$f;->disconnect(Ljava/lang/String;)V

    return-void
.end method
