.class public final synthetic Lun/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lun/s;


# direct methods
.method public synthetic constructor <init>(Lun/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lun/v;->a:Lun/s;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lun/v;->a:Lun/s;

    invoke-static {v0}, Lun/s$m;->a(Lun/s;)V

    return-void
.end method
