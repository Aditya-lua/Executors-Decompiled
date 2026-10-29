.class public final synthetic Ltu/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ltu/l;

.field public final synthetic b:Ltu/b;


# direct methods
.method public synthetic constructor <init>(Ltu/l;Ltu/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltu/a;->a:Ltu/l;

    iput-object p2, p0, Ltu/a;->b:Ltu/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ltu/a;->a:Ltu/l;

    iget-object v1, p0, Ltu/a;->b:Ltu/b;

    invoke-static {v0, v1}, Ltu/b;->a(Ltu/l;Ltu/b;)V

    return-void
.end method
