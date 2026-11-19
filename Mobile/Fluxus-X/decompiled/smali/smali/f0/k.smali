.class public final synthetic Lf0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/n1$b;


# instance fields
.field public final synthetic a:Lf0/l$a;

.field public final synthetic b:Ln0/n1;


# direct methods
.method public synthetic constructor <init>(Lf0/l$a;Ln0/n1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf0/k;->a:Lf0/l$a;

    iput-object p2, p0, Lf0/k;->b:Ln0/n1;

    return-void
.end method


# virtual methods
.method public final a(Ln0/n1$a;)Z
    .locals 2

    iget-object v0, p0, Lf0/k;->a:Lf0/l$a;

    iget-object v1, p0, Lf0/k;->b:Ln0/n1;

    invoke-static {v0, v1, p1}, Lf0/l$a;->b(Lf0/l$a;Ln0/n1;Ln0/n1$a;)Z

    move-result p1

    return p1
.end method
