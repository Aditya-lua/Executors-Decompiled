.class public final synthetic Lz/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lz/y;

.field public final synthetic b:Lz/g1$f;


# direct methods
.method public synthetic constructor <init>(Lz/y;Lz/g1$f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz/c1;->a:Lz/y;

    iput-object p2, p0, Lz/c1;->b:Lz/g1$f;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lz/c1;->a:Lz/y;

    iget-object v1, p0, Lz/c1;->b:Lz/g1$f;

    invoke-static {v0, v1}, Lz/g1;->a(Lz/y;Lz/g1$f;)V

    return-void
.end method
