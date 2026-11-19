.class public final synthetic Ljv/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljv/l;

.field public final synthetic b:Ljv/b;


# direct methods
.method public synthetic constructor <init>(Ljv/l;Ljv/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljv/a;->a:Ljv/l;

    iput-object p2, p0, Ljv/a;->b:Ljv/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ljv/a;->a:Ljv/l;

    iget-object v1, p0, Ljv/a;->b:Ljv/b;

    invoke-static {v0, v1}, Ljv/b;->a(Ljv/l;Ljv/b;)V

    return-void
.end method
