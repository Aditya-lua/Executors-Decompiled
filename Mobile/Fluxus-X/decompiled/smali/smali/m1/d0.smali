.class public final synthetic Lm1/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt/a;


# instance fields
.field public final synthetic a:Lm1/i0;


# direct methods
.method public synthetic constructor <init>(Lm1/i0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/d0;->a:Lm1/i0;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lm1/d0;->a:Lm1/i0;

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lm1/i0;->w(Lm1/i0;J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method
