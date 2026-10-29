.class public final Ll9/y0;
.super Ll9/o;
.source "SourceFile"


# instance fields
.field public final synthetic e:Ll9/p$a;


# direct methods
.method public constructor <init>(Ll9/p$a;Ll9/k;[Lcom/google/android/gms/common/Feature;ZI)V
    .locals 0

    iput-object p1, p0, Ll9/y0;->e:Ll9/p$a;

    invoke-direct {p0, p2, p3, p4, p5}, Ll9/o;-><init>(Ll9/k;[Lcom/google/android/gms/common/Feature;ZI)V

    return-void
.end method


# virtual methods
.method public final d(Lk9/a$b;Lsb/k;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk9/a$b;",
            "Lsb/k<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Ll9/y0;->e:Ll9/p$a;

    invoke-static {v0}, Ll9/p$a;->h(Ll9/p$a;)Ll9/q;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ll9/q;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
