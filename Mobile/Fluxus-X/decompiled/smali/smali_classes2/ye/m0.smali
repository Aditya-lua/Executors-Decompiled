.class public final Lye/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lye/p0;


# instance fields
.field public final a:Lgf/a;

.field public final b:Lcf/h0;


# direct methods
.method public constructor <init>(Lcf/h0;Lgf/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lye/m0;->b:Lcf/h0;

    iput-object p2, p0, Lye/m0;->a:Lgf/a;

    return-void
.end method

.method public static b(Lcf/h0;)Lye/m0;
    .locals 2

    new-instance v0, Lye/m0;

    invoke-virtual {p0}, Lcf/h0;->f0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lye/s0;->b(Ljava/lang/String;)Lgf/a;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lye/m0;-><init>(Lcf/h0;Lgf/a;)V

    return-object v0
.end method

.method public static c(Lcf/h0;)Lye/m0;
    .locals 2

    new-instance v0, Lye/m0;

    invoke-virtual {p0}, Lcf/h0;->f0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lye/s0;->h(Ljava/lang/String;)Lgf/a;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lye/m0;-><init>(Lcf/h0;Lgf/a;)V

    return-object v0
.end method


# virtual methods
.method public a()Lgf/a;
    .locals 1

    iget-object v0, p0, Lye/m0;->a:Lgf/a;

    return-object v0
.end method

.method public d()Lcf/h0;
    .locals 1

    iget-object v0, p0, Lye/m0;->b:Lcf/h0;

    return-object v0
.end method
