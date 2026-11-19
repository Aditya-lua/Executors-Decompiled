.class public final synthetic Lsn/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/a;


# instance fields
.field public final synthetic a:Lsn/y0;


# direct methods
.method public synthetic constructor <init>(Lsn/y0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsn/x0;->a:Lsn/y0;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lsn/x0;->a:Lsn/y0;

    check-cast p1, Lf1/b2;

    invoke-static {v0, p1}, Lsn/y0;->a(Lsn/y0;Lf1/b2;)V

    return-void
.end method
