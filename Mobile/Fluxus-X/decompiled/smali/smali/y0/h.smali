.class public final synthetic Ly0/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ly0/o;

.field public final synthetic b:Lg0/j2;


# direct methods
.method public synthetic constructor <init>(Ly0/o;Lg0/j2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly0/h;->a:Ly0/o;

    iput-object p2, p0, Ly0/h;->b:Lg0/j2;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ly0/h;->a:Ly0/o;

    iget-object v1, p0, Ly0/h;->b:Lg0/j2;

    invoke-static {v0, v1}, Ly0/o;->j(Ly0/o;Lg0/j2;)V

    return-void
.end method
