.class public final synthetic Lhn/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lhn/s;


# direct methods
.method public synthetic constructor <init>(Lhn/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhn/v;->a:Lhn/s;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lhn/v;->a:Lhn/s;

    invoke-static {v0}, Lhn/s$m;->a(Lhn/s;)V

    return-void
.end method
