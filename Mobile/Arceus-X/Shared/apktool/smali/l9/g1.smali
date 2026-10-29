.class public final Ll9/g1;
.super Ll9/u;
.source "SourceFile"


# instance fields
.field public final synthetic d:Ll9/u$a;


# direct methods
.method public constructor <init>(Ll9/u$a;[Lcom/google/android/gms/common/Feature;ZI)V
    .locals 0

    iput-object p1, p0, Ll9/g1;->d:Ll9/u$a;

    invoke-direct {p0, p2, p3, p4}, Ll9/u;-><init>([Lcom/google/android/gms/common/Feature;ZI)V

    return-void
.end method


# virtual methods
.method public final d(Lk9/a$b;Lsb/k;)V
    .locals 1

    iget-object v0, p0, Ll9/g1;->d:Ll9/u$a;

    invoke-static {v0}, Ll9/u$a;->f(Ll9/u$a;)Ll9/q;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ll9/q;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
