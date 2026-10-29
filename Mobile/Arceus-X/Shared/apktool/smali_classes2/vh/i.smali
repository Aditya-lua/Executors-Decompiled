.class public final synthetic Lvh/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lvh/k;

.field public final synthetic b:Le4/q;


# direct methods
.method public synthetic constructor <init>(Lvh/k;Le4/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvh/i;->a:Lvh/k;

    iput-object p2, p0, Lvh/i;->b:Le4/q;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lvh/i;->a:Lvh/k;

    iget-object v1, p0, Lvh/i;->b:Le4/q;

    invoke-static {v0, v1}, Lvh/k;->h3(Lvh/k;Le4/q;)V

    return-void
.end method
