.class public final synthetic Lf1/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lf1/r0;

.field public final synthetic b:Lf1/r0$j;

.field public final synthetic c:J

.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Throwable;


# direct methods
.method public synthetic constructor <init>(Lf1/r0;Lf1/r0$j;JILjava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/c0;->a:Lf1/r0;

    iput-object p2, p0, Lf1/c0;->b:Lf1/r0$j;

    iput-wide p3, p0, Lf1/c0;->c:J

    iput p5, p0, Lf1/c0;->d:I

    iput-object p6, p0, Lf1/c0;->e:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lf1/c0;->a:Lf1/r0;

    iget-object v1, p0, Lf1/c0;->b:Lf1/r0$j;

    iget-wide v2, p0, Lf1/c0;->c:J

    iget v4, p0, Lf1/c0;->d:I

    iget-object v5, p0, Lf1/c0;->e:Ljava/lang/Throwable;

    invoke-static/range {v0 .. v5}, Lf1/r0;->h(Lf1/r0;Lf1/r0$j;JILjava/lang/Throwable;)V

    return-void
.end method
