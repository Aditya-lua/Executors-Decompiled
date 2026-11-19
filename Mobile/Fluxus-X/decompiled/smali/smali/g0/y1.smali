.class public final synthetic Lg0/y1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lg0/a2$c;

.field public final synthetic b:Lg0/v2;


# direct methods
.method public synthetic constructor <init>(Lg0/a2$c;Lg0/v2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/y1;->a:Lg0/a2$c;

    iput-object p2, p0, Lg0/y1;->b:Lg0/v2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lg0/y1;->a:Lg0/a2$c;

    iget-object v1, p0, Lg0/y1;->b:Lg0/v2;

    invoke-static {v0, v1}, Lg0/a2;->i0(Lg0/a2$c;Lg0/v2;)V

    return-void
.end method
