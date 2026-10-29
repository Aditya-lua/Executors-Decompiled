.class public final synthetic Ln0/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/e0;


# instance fields
.field public final synthetic a:Ln0/y0;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ln0/y0;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/v0;->a:Ln0/y0;

    iput-object p2, p0, Ln0/v0;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Ln0/v0;->a:Ln0/y0;

    iget-object v1, p0, Ln0/v0;->b:Ljava/lang/String;

    check-cast p1, Lg0/w;

    invoke-static {v0, v1, p1}, Ln0/y0;->a(Ln0/y0;Ljava/lang/String;Lg0/w;)V

    return-void
.end method
