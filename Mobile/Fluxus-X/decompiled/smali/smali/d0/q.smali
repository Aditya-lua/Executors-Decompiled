.class public final synthetic Ld0/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ld0/s;

.field public final synthetic b:Ld0/s$a;

.field public final synthetic c:Lpe/x;


# direct methods
.method public synthetic constructor <init>(Ld0/s;Ld0/s$a;Lpe/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld0/q;->a:Ld0/s;

    iput-object p2, p0, Ld0/q;->b:Ld0/s$a;

    iput-object p3, p0, Ld0/q;->c:Lpe/x;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Ld0/q;->a:Ld0/s;

    iget-object v1, p0, Ld0/q;->b:Ld0/s$a;

    iget-object v2, p0, Ld0/q;->c:Lpe/x;

    invoke-static {v0, v1, v2}, Ld0/s;->a(Ld0/s;Ld0/s$a;Lpe/x;)V

    return-void
.end method
