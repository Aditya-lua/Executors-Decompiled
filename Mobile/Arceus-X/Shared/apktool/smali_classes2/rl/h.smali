.class public final synthetic Lrl/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsb/g;


# instance fields
.field public final synthetic a:Lrl/j;


# direct methods
.method public synthetic constructor <init>(Lrl/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrl/h;->a:Lrl/j;

    return-void
.end method


# virtual methods
.method public final onSuccess(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lrl/h;->a:Lrl/j;

    check-cast p1, Ltd/c$c;

    invoke-static {v0, p1}, Lrl/j;->a(Lrl/j;Ltd/c$c;)V

    return-void
.end method
