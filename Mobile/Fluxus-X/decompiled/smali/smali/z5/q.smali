.class public final synthetic Lz5/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lz5/s;

.field public final synthetic b:Lpe/x;

.field public final synthetic c:Lz5/q1;


# direct methods
.method public synthetic constructor <init>(Lz5/s;Lpe/x;Lz5/q1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz5/q;->a:Lz5/s;

    iput-object p2, p0, Lz5/q;->b:Lpe/x;

    iput-object p3, p0, Lz5/q;->c:Lz5/q1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lz5/q;->a:Lz5/s;

    iget-object v1, p0, Lz5/q;->b:Lpe/x;

    iget-object v2, p0, Lz5/q;->c:Lz5/q1;

    invoke-static {v0, v1, v2}, Lz5/s;->d(Lz5/s;Lpe/x;Lz5/q1;)V

    return-void
.end method
