.class public final synthetic Lvd/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvd/c$c;


# instance fields
.field public final synthetic a:Lvd/t0;

.field public final synthetic b:J

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lvd/t0;JJI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvd/s0;->a:Lvd/t0;

    iput-wide p2, p0, Lvd/s0;->b:J

    iput-wide p4, p0, Lvd/s0;->c:J

    return-void
.end method


# virtual methods
.method public final a(Lvd/c$d;)Lcom/google/android/gms/tasks/Task;
    .locals 7

    iget-object v0, p0, Lvd/s0;->a:Lvd/t0;

    iget-wide v1, p0, Lvd/s0;->b:J

    iget-wide v3, p0, Lvd/s0;->c:J

    const/4 v5, 0x0

    move-object v6, p1

    invoke-virtual/range {v0 .. v6}, Lvd/t0;->a(JJILvd/c$d;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
