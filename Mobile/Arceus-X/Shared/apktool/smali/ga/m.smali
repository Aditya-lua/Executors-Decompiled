.class public final synthetic Lga/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lga/o;

.field public final synthetic b:Lga/l;


# direct methods
.method public synthetic constructor <init>(Lga/o;Lga/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lga/m;->a:Lga/o;

    iput-object p2, p0, Lga/m;->b:Lga/l;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 2

    iget-object v0, p0, Lga/m;->a:Lga/o;

    iget-object v1, p0, Lga/m;->b:Lga/l;

    invoke-virtual {v0, v1}, Lga/o;->e(Lga/l;)V

    return-void
.end method
