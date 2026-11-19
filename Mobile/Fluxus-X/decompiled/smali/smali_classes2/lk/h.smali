.class public final synthetic Llk/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcm/a;


# direct methods
.method public synthetic constructor <init>(Lcm/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llk/h;->a:Lcm/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Llk/h;->a:Lcm/a;

    invoke-static {v0}, Llk/i;->a(Lcm/a;)V

    return-void
.end method
