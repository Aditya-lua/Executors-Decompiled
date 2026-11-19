.class public final synthetic Lha/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lha/o;

.field public final synthetic b:Lha/l;


# direct methods
.method public synthetic constructor <init>(Lha/o;Lha/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lha/m;->a:Lha/o;

    iput-object p2, p0, Lha/m;->b:Lha/l;

    return-void
.end method


# virtual methods
.method public final synthetic run()V
    .locals 2

    iget-object v0, p0, Lha/m;->a:Lha/o;

    iget-object v1, p0, Lha/m;->b:Lha/l;

    invoke-virtual {v0, v1}, Lha/o;->e(Lha/l;)V

    return-void
.end method
