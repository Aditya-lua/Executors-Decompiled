.class public final synthetic Lsw/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lsw/i$b$a;

.field public final synthetic b:Lsw/f;

.field public final synthetic c:Lsw/x;


# direct methods
.method public synthetic constructor <init>(Lsw/i$b$a;Lsw/f;Lsw/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsw/j;->a:Lsw/i$b$a;

    iput-object p2, p0, Lsw/j;->b:Lsw/f;

    iput-object p3, p0, Lsw/j;->c:Lsw/x;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lsw/j;->a:Lsw/i$b$a;

    iget-object v1, p0, Lsw/j;->b:Lsw/f;

    iget-object v2, p0, Lsw/j;->c:Lsw/x;

    invoke-static {v0, v1, v2}, Lsw/i$b$a;->d(Lsw/i$b$a;Lsw/f;Lsw/x;)V

    return-void
.end method
