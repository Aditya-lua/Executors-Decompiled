.class public final synthetic Ldi/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ldi/j;

.field public final synthetic b:Lf4/v;


# direct methods
.method public synthetic constructor <init>(Ldi/j;Lf4/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldi/h;->a:Ldi/j;

    iput-object p2, p0, Ldi/h;->b:Lf4/v;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ldi/h;->a:Ldi/j;

    iget-object v1, p0, Ldi/h;->b:Lf4/v;

    invoke-static {v0, v1}, Ldi/j;->h3(Ldi/j;Lf4/v;)V

    return-void
.end method
