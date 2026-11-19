.class public final synthetic Lm0/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lm0/x$a;


# direct methods
.method public synthetic constructor <init>(Lm0/x$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/w;->a:Lm0/x$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lm0/w;->a:Lm0/x$a;

    invoke-static {v0}, Lm0/x$a;->e(Lm0/x$a;)V

    return-void
.end method
