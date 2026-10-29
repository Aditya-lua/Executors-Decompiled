.class public final Lnb/j9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:J

.field public final synthetic e:Lnb/qa;


# direct methods
.method public constructor <init>(Lnb/qa;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V
    .locals 0

    iput-object p2, p0, Lnb/j9;->a:Ljava/lang/String;

    iput-object p3, p0, Lnb/j9;->b:Ljava/lang/String;

    iput-object p4, p0, Lnb/j9;->c:Ljava/lang/Object;

    iput-wide p5, p0, Lnb/j9;->d:J

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lnb/j9;->e:Lnb/qa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lnb/j9;->e:Lnb/qa;

    iget-object v1, p0, Lnb/j9;->a:Ljava/lang/String;

    iget-object v2, p0, Lnb/j9;->b:Ljava/lang/String;

    iget-object v3, p0, Lnb/j9;->c:Ljava/lang/Object;

    iget-wide v4, p0, Lnb/j9;->d:J

    invoke-virtual/range {v0 .. v5}, Lnb/qa;->B(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;J)V

    return-void
.end method
