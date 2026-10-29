.class public final synthetic Lwa/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lwa/l;

.field public final synthetic b:Lsb/k;


# direct methods
.method public synthetic constructor <init>(Lwa/l;Lsb/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwa/h;->a:Lwa/l;

    iput-object p2, p0, Lwa/h;->b:Lsb/k;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lwa/h;->a:Lwa/l;

    iget-object v1, p0, Lwa/h;->b:Lsb/k;

    invoke-virtual {v0, v1}, Lwa/l;->d(Lsb/k;)V

    return-void
.end method
