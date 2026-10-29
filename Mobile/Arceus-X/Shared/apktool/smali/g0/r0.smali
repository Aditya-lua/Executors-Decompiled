.class public final synthetic Lg0/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln0/o3$d;


# instance fields
.field public final synthetic a:Lg0/u0;

.field public final synthetic b:Lg0/x0;


# direct methods
.method public synthetic constructor <init>(Lg0/u0;Lg0/x0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/r0;->a:Lg0/u0;

    iput-object p2, p0, Lg0/r0;->b:Lg0/x0;

    return-void
.end method


# virtual methods
.method public final a(Ln0/o3;Ln0/o3$g;)V
    .locals 2

    iget-object v0, p0, Lg0/r0;->a:Lg0/u0;

    iget-object v1, p0, Lg0/r0;->b:Lg0/x0;

    invoke-static {v0, v1, p1, p2}, Lg0/u0;->h0(Lg0/u0;Lg0/x0;Ln0/o3;Ln0/o3$g;)V

    return-void
.end method
