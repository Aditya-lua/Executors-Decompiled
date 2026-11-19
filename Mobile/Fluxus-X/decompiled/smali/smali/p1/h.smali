.class public final synthetic Lp1/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp1/b0$b;


# instance fields
.field public final synthetic a:Lp1/i;


# direct methods
.method public synthetic constructor <init>(Lp1/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/h;->a:Lp1/i;

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 1

    iget-object v0, p0, Lp1/h;->a:Lp1/i;

    invoke-static {v0, p1}, Lp1/i;->b(Lp1/i;I)V

    return-void
.end method
