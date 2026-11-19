.class public final synthetic Lnj/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnj/m$q;


# instance fields
.field public final synthetic a:Lnj/m;

.field public final synthetic b:Lnj/c;

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lnj/m;Lnj/c;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnj/l;->a:Lnj/m;

    iput-object p2, p0, Lnj/l;->b:Lnj/c;

    iput-boolean p3, p0, Lnj/l;->c:Z

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 3

    iget-object v0, p0, Lnj/l;->a:Lnj/m;

    iget-object v1, p0, Lnj/l;->b:Lnj/c;

    iget-boolean v2, p0, Lnj/l;->c:Z

    invoke-static {v0, v1, v2, p1}, Lnj/m;->q(Lnj/m;Lnj/c;ZLjava/util/List;)V

    return-void
.end method
