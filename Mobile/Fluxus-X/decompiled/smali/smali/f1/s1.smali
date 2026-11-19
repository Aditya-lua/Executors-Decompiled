.class public final synthetic Lf1/s1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx2/a;


# instance fields
.field public final synthetic a:Lf1/z1;


# direct methods
.method public synthetic constructor <init>(Lf1/z1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/s1;->a:Lf1/z1;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lf1/s1;->a:Lf1/z1;

    check-cast p1, Lg0/v2$g;

    invoke-static {v0, p1}, Lf1/z1;->a(Lf1/z1;Lg0/v2$g;)V

    return-void
.end method
