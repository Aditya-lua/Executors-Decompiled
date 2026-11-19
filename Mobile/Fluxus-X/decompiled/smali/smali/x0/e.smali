.class public final synthetic Lx0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg0/v2$i;


# instance fields
.field public final synthetic a:Lx0/t;

.field public final synthetic b:Lg0/v2;


# direct methods
.method public synthetic constructor <init>(Lx0/t;Lg0/v2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx0/e;->a:Lx0/t;

    iput-object p2, p0, Lx0/e;->b:Lg0/v2;

    return-void
.end method


# virtual methods
.method public final a(Lg0/v2$h;)V
    .locals 2

    iget-object v0, p0, Lx0/e;->a:Lx0/t;

    iget-object v1, p0, Lx0/e;->b:Lg0/v2;

    invoke-static {v0, v1, p1}, Lx0/t;->j(Lx0/t;Lg0/v2;Lg0/v2$h;)V

    return-void
.end method
