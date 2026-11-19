.class public final synthetic Ldi/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ldi/g;

.field public final synthetic b:Lf4/v;


# direct methods
.method public synthetic constructor <init>(Ldi/g;Lf4/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldi/f;->a:Ldi/g;

    iput-object p2, p0, Ldi/f;->b:Lf4/v;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ldi/f;->a:Ldi/g;

    iget-object v1, p0, Ldi/f;->b:Lf4/v;

    invoke-static {v0, v1}, Ldi/g;->K3(Ldi/g;Lf4/v;)V

    return-void
.end method
