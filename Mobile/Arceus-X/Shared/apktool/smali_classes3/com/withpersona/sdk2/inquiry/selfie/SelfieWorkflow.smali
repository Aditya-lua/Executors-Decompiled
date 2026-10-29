.class public final Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;
.super Lym/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$a;,
        Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;,
        Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;,
        Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;,
        Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lym/k<",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00dc\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0003\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008(\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 \u00ad\u00012\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0005:\u0008\u0085\u0001\u00ae\u0001\u0087\u0001\u0089\u0001B\u0089\u0001\u0008\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u00a2\u0006\u0004\u0008&\u0010\'JC\u0010.\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002\u00a2\u0006\u0004\u0008.\u0010/JC\u00101\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u0002002\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002\u00a2\u0006\u0004\u00081\u00102JC\u00105\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u0002032\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002\u00a2\u0006\u0004\u00085\u00106JC\u00108\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u0002072\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002\u00a2\u0006\u0004\u00088\u00109JC\u0010;\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020:2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002\u00a2\u0006\u0004\u0008;\u0010<JC\u0010>\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020=2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002\u00a2\u0006\u0004\u0008>\u0010?JC\u0010A\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020@2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002\u00a2\u0006\u0004\u0008A\u0010BJC\u0010D\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020C2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002\u00a2\u0006\u0004\u0008D\u0010EJC\u0010G\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020F2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002\u00a2\u0006\u0004\u0008G\u0010HJC\u0010J\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020I2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002\u00a2\u0006\u0004\u0008J\u0010KJC\u0010M\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020L2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002\u00a2\u0006\u0004\u0008M\u0010NJC\u0010P\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020O2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002\u00a2\u0006\u0004\u0008P\u0010QJC\u0010S\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020R2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002\u00a2\u0006\u0004\u0008S\u0010TJC\u0010V\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020U2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002\u00a2\u0006\u0004\u0008V\u0010WJ\u0017\u0010Y\u001a\u00020X2\u0006\u0010(\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008Y\u0010ZJ\u0017\u0010[\u001a\u00020X2\u0006\u0010(\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008[\u0010ZJ\u0017\u0010]\u001a\u00020\\2\u0006\u0010(\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008]\u0010^J-\u0010c\u001a\u00020b2\u001c\u0010a\u001a\u00180_R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040`H\u0002\u00a2\u0006\u0004\u0008c\u0010dJC\u0010f\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020e2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002\u00a2\u0006\u0004\u0008f\u0010gJC\u0010i\u001a\u0002042\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020h2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002\u00a2\u0006\u0004\u0008i\u0010jJG\u0010p\u001a\u00020\u0003\"\u000c\u0008\u0000\u0010l*\u00020\u0003*\u00020k*\u00160_R\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0002\u0008\u00030`2\u0006\u0010m\u001a\u00028\u00002\u0008\u0010o\u001a\u0004\u0018\u00010nH\u0002\u00a2\u0006\u0004\u0008p\u0010qJ3\u0010r\u001a\u00020b2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002\u00a2\u0006\u0004\u0008r\u0010sJ;\u0010u\u001a\u00020b2\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010t\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008u\u0010vJ7\u0010y\u001a\u00020b*\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010x\u001a\u00020wH\u0002\u00a2\u0006\u0004\u0008y\u0010zJ!\u0010~\u001a\u00020\u00032\u0006\u0010{\u001a\u00020\u00022\u0008\u0010}\u001a\u0004\u0018\u00010|H\u0016\u00a2\u0006\u0004\u0008~\u0010\u007fJF\u0010\u0080\u0001\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00032\"\u0010,\u001a\u001e0+R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0016\u00a2\u0006\u0006\u0008\u0080\u0001\u0010\u0081\u0001J\u001b\u0010\u0083\u0001\u001a\u00020|2\u0007\u0010\u0082\u0001\u001a\u00020\u0003H\u0016\u00a2\u0006\u0006\u0008\u0083\u0001\u0010\u0084\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0085\u0001\u0010\u0086\u0001R\u0016\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0087\u0001\u0010\u0088\u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0089\u0001\u0010\u008a\u0001R\u0016\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008b\u0001\u0010\u008c\u0001R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008d\u0001\u0010\u008e\u0001R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008f\u0001\u0010\u0090\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0091\u0001\u0010\u0092\u0001R\u0016\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0093\u0001\u0010\u0094\u0001R\u0016\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0095\u0001\u0010\u0096\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0097\u0001\u0010\u0098\u0001R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0099\u0001\u0010\u009a\u0001R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u009b\u0001\u0010\u009c\u0001R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u009d\u0001\u0010\u009e\u0001R\u0016\u0010!\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u009f\u0001\u0010\u00a0\u0001R\u0016\u0010#\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00a1\u0001\u0010\u00a2\u0001R\u0016\u0010%\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00a3\u0001\u0010\u00a4\u0001R\u001a\u0010\u00a8\u0001\u001a\u0005\u0018\u00010\u00a5\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00a6\u0001\u0010\u00a7\u0001R\u001a\u0010\u00ac\u0001\u001a\u00030\u00a9\u00018\u0002@\u0002X\u0082.\u00a2\u0006\u0008\n\u0006\u0008\u00aa\u0001\u0010\u00ab\u0001\u00a8\u0006\u00af\u0001"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;",
        "Lym/k;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;",
        "",
        "Landroid/content/Context;",
        "applicationContext",
        "Lcq/b$a;",
        "submitVerificationWorker",
        "Ltr/b$a;",
        "webRtcWorkerFactory",
        "Lcom/withpersona/sdk2/inquiry/selfie/e$b;",
        "selfieAnalyzeWorker",
        "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;",
        "permissionRequestWorkflow",
        "Lhq/j;",
        "localVideoCaptureRenderer",
        "Lcom/withpersona/sdk2/camera/e$a;",
        "cameraXControllerFactory",
        "Lhn/c$a;",
        "camera2ControllerFactory",
        "Lln/a;",
        "cameraStatsManager",
        "Luq/a;",
        "navigationStateManager",
        "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;",
        "directFileUploader",
        "Ldq/a$b;",
        "selfiePoseManagerFactory",
        "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;",
        "inquiryThemeManager",
        "Lcom/withpersona/sdk2/inquiry/selfie/g;",
        "selfieEventLogger",
        "Lqq/c;",
        "sdkFilesManager",
        "Lgo/e;",
        "featureFlagManager",
        "<init>",
        "(Landroid/content/Context;Lcq/b$a;Ltr/b$a;Lcom/withpersona/sdk2/inquiry/selfie/e$b;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lhq/j;Lcom/withpersona/sdk2/camera/e$a;Lhn/c$a;Lln/a;Luq/a;Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;Ldq/a$b;Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;Lcom/withpersona/sdk2/inquiry/selfie/g;Lqq/c;Lgo/e;)V",
        "renderProps",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;",
        "renderState",
        "Lym/k$a;",
        "context",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;",
        "D2",
        "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;",
        "q3",
        "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;Lym/k$a;)Ljava/lang/Object;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;",
        "z1",
        "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;",
        "t2",
        "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;",
        "B3",
        "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;",
        "J2",
        "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;",
        "P2",
        "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;",
        "a3",
        "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;",
        "Z1",
        "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;",
        "f2",
        "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;",
        "K1",
        "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;",
        "T1",
        "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;",
        "m2",
        "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;",
        "P3",
        "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;",
        "",
        "c4",
        "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Z",
        "w1",
        "Lmn/a;",
        "b4",
        "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lmn/a;",
        "Lym/r$c;",
        "Lym/r;",
        "updater",
        "",
        "Z3",
        "(Lym/r$c;)V",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;",
        "w2",
        "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;",
        "i3",
        "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;",
        "Lcom/withpersona/sdk2/inquiry/selfie/a;",
        "T",
        "currentState",
        "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;",
        "capturedSelfie",
        "x1",
        "(Lym/r$c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;",
        "V3",
        "(Lym/k$a;)V",
        "output",
        "X3",
        "(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;)V",
        "",
        "error",
        "W3",
        "(Lym/k$a;Ljava/lang/Throwable;)V",
        "props",
        "Lym/i;",
        "snapshot",
        "v1",
        "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/i;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;",
        "y1",
        "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lym/k$a;)Ljava/lang/Object;",
        "state",
        "a4",
        "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;)Lym/i;",
        "a",
        "Landroid/content/Context;",
        "b",
        "Lcq/b$a;",
        "c",
        "Ltr/b$a;",
        "d",
        "Lcom/withpersona/sdk2/inquiry/selfie/e$b;",
        "e",
        "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;",
        "f",
        "Lhq/j;",
        "g",
        "Lcom/withpersona/sdk2/camera/e$a;",
        "h",
        "Lhn/c$a;",
        "i",
        "Lln/a;",
        "j",
        "Luq/a;",
        "k",
        "Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;",
        "l",
        "Ldq/a$b;",
        "m",
        "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;",
        "n",
        "Lcom/withpersona/sdk2/inquiry/selfie/g;",
        "o",
        "Lqq/c;",
        "p",
        "Lgo/e;",
        "Lur/a;",
        "q",
        "Lur/a;",
        "webRtcManager",
        "Ldq/a;",
        "r",
        "Ldq/a;",
        "selfiePoseManager",
        "s",
        "Input",
        "selfie_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final s:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lcq/b$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Ltr/b$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lcom/withpersona/sdk2/inquiry/selfie/e$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Lhq/j;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Lcom/withpersona/sdk2/camera/e$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final h:Lhn/c$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final i:Lln/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final j:Luq/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final k:Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final l:Ldq/a$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final m:Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final n:Lcom/withpersona/sdk2/inquiry/selfie/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final o:Lqq/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final p:Lgo/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final q:Lur/a;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public r:Ldq/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->s:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcq/b$a;Ltr/b$a;Lcom/withpersona/sdk2/inquiry/selfie/e$b;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lhq/j;Lcom/withpersona/sdk2/camera/e$a;Lhn/c$a;Lln/a;Luq/a;Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;Ldq/a$b;Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;Lcom/withpersona/sdk2/inquiry/selfie/g;Lqq/c;Lgo/e;)V
    .locals 16
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcq/b$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ltr/b$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/withpersona/sdk2/inquiry/selfie/e$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lhq/j;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lcom/withpersona/sdk2/camera/e$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lhn/c$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Lln/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p10    # Luq/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p12    # Ldq/a$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p13    # Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p14    # Lcom/withpersona/sdk2/inquiry/selfie/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p15    # Lqq/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p16    # Lgo/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    const-string v0, "applicationContext"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "submitVerificationWorker"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "webRtcWorkerFactory"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selfieAnalyzeWorker"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "permissionRequestWorkflow"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "localVideoCaptureRenderer"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraXControllerFactory"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "camera2ControllerFactory"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraStatsManager"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationStateManager"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "directFileUploader"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selfiePoseManagerFactory"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inquiryThemeManager"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selfieEventLogger"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sdkFilesManager"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagManager"

    move-object/from16 v15, p16

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Lym/k;-><init>()V

    move-object/from16 v0, p0

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a:Landroid/content/Context;

    iput-object v2, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->b:Lcq/b$a;

    iput-object v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->c:Ltr/b$a;

    iput-object v4, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->d:Lcom/withpersona/sdk2/inquiry/selfie/e$b;

    iput-object v5, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->e:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;

    iput-object v6, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->f:Lhq/j;

    iput-object v7, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->g:Lcom/withpersona/sdk2/camera/e$a;

    iput-object v8, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->h:Lhn/c$a;

    iput-object v9, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->i:Lln/a;

    iput-object v10, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->j:Luq/a;

    iput-object v11, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->k:Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;

    iput-object v12, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->l:Ldq/a$b;

    iput-object v13, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->m:Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;

    iput-object v14, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->n:Lcom/withpersona/sdk2/inquiry/selfie/g;

    move-object/from16 v1, p15

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->o:Lqq/c;

    iput-object v15, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->p:Lgo/e;

    invoke-static {}, Lur/c;->b()Lur/a;

    move-result-object v1

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    return-void
.end method

.method public static synthetic A(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->I3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic A0(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieImage;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->O1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieImage;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final A1(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lkn/a;Z)Lkotlin/Unit;
    .locals 1

    const-string p3, "<unused var>"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lym/k$a;->d()Lym/h;

    move-result-object p0

    new-instance p2, Lyp/q0;

    invoke-direct {p2, p1}, Lyp/q0;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)V

    const/4 p3, 0x1

    const/4 v0, 0x0

    invoke-static {p1, v0, p2, p3, v0}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final A2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;Lym/r$c;)Lkotlin/Unit;
    .locals 12

    const-string v0, "$this$action"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;

    const/4 v0, 0x0

    invoke-static {p2, v0}, Lcom/withpersona/sdk2/inquiry/selfie/p;->k(Lym/r$c;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v4

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->A()Ljava/util/List;

    move-result-object v5

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->E()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;

    move-result-object v6

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v8

    const/16 v10, 0xa3

    const/4 v11, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v11}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;-><init>(ZZLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;ZLcom/withpersona/sdk2/camera/CameraProperties$b;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p2, v1}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final A3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;
    .locals 0

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/p;->x(Lym/k$a;Lur/a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic B(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->O2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B0(Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->p3(Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final B1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/r$c;)Lkotlin/Unit;
    .locals 3

    const-string v0, "$this$action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-nez v0, :cond_1

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_1
    invoke-virtual {p0, p1, v0, v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->x1(Lym/r$c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object p0

    invoke-virtual {p1, p0}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final B2(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;
    .locals 0

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/p;->x(Lym/k$a;Lur/a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic C(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->e2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C0(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->r2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final C1(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 2

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lym/k$a;->d()Lym/h;

    move-result-object p0

    new-instance p2, Lyp/q4;

    invoke-direct {p2}, Lyp/q4;-><init>()V

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, p2, v0, v1}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final C2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->X3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final C3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/k$a;Ltr/b$b;)Lym/r;
    .locals 9

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p4, Ltr/b$b$b;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    new-instance v3, Lyp/g4;

    move-object v5, p0

    move-object v4, p1

    move-object v7, p2

    move-object v8, p3

    move-object v6, p4

    invoke-direct/range {v3 .. v8}, Lyp/g4;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Ltr/b$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/k$a;)V

    invoke-static {v5, v2, v3, v1, v2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0

    :cond_0
    move-object v5, p0

    move-object v4, p1

    move-object v8, p3

    move-object v6, p4

    instance-of p0, v6, Ltr/b$b$a;

    if-eqz p0, :cond_1

    new-instance p0, Lyp/h4;

    invoke-direct {p0, v8, v5, v4}, Lyp/h4;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;)V

    invoke-static {v5, v2, p0, v1, v2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0
.end method

.method public static synthetic D(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->d2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D0(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->g3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final D1(Lym/r$c;)Lkotlin/Unit;
    .locals 11

    const-string v0, "$this$action"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_1
    invoke-static {v0}, Lfq/l2;->c(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;)V

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v1

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;->t()J

    move-result-wide v2

    const/4 v5, 0x0

    invoke-static {p0, v5}, Lcom/withpersona/sdk2/inquiry/selfie/p;->k(Lym/r$c;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v5

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v6

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;->s()Z

    move-result v7

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;->g()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;->i()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;

    move-result-object v9

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;->f()Z

    move-result v10

    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;

    invoke-direct/range {v0 .. v10}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;-><init>(Lcom/withpersona/sdk2/camera/CameraProperties;JLjava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZLjava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Z)V

    invoke-virtual {p0, v0}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final D3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Ltr/b$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/k$a;Lym/r$c;)Lkotlin/Unit;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    const-string v4, "$this$action"

    move-object/from16 v5, p5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v4

    iget-object v5, v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    if-eqz v5, :cond_0

    iget-object v6, v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->c:Ltr/b$a;

    invoke-virtual {v6}, Ltr/b$a;->b()Ltr/a;

    move-result-object v6

    invoke-interface {v5, v6}, Lur/a;->h(Ltr/a;)V

    :cond_0
    iget-object v5, v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    if-eqz v5, :cond_1

    iget-object v6, v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a:Landroid/content/Context;

    invoke-interface {v5, v6}, Lur/a;->i(Landroid/content/Context;)V

    :cond_1
    invoke-virtual {v4}, Lcom/withpersona/sdk2/camera/CameraProperties;->k()Landroid/util/Size;

    move-result-object v5

    invoke-virtual {v5}, Landroid/util/Size;->getWidth()I

    move-result v5

    invoke-virtual {v4}, Lcom/withpersona/sdk2/camera/CameraProperties;->k()Landroid/util/Size;

    move-result-object v6

    invoke-virtual {v6}, Landroid/util/Size;->getHeight()I

    move-result v6

    invoke-virtual {v4}, Lcom/withpersona/sdk2/camera/CameraProperties;->j()I

    move-result v7

    const/16 v8, 0x5a

    if-eq v7, v8, :cond_3

    invoke-virtual {v4}, Lcom/withpersona/sdk2/camera/CameraProperties;->j()I

    move-result v4

    const/16 v7, 0x10e

    if-ne v4, v7, :cond_2

    goto :goto_0

    :cond_2
    move v13, v5

    move v14, v6

    goto :goto_1

    :cond_3
    :goto_0
    move v14, v5

    move v13, v6

    :goto_1
    iget-object v8, v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    if-eqz v8, :cond_4

    move-object/from16 v4, p2

    check-cast v4, Ltr/b$b$b;

    invoke-virtual {v4}, Ltr/b$b$b;->a()Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;

    move-result-object v5

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;->c()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4}, Ltr/b$b$b;->a()Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;

    move-result-object v5

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;->a()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4}, Ltr/b$b$b;->a()Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;

    move-result-object v4

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/webrtc/networking/AuthorizeWebRtcResponse;->b()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;->C()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->P()Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;

    move-result-object v4

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;->f()Z

    move-result v15

    new-instance v4, Lyp/u0;

    invoke-direct {v4, v3, v1, v2, v0}, Lyp/u0;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;)V

    new-instance v5, Lyp/v0;

    invoke-direct {v5, v3, v1, v0}, Lyp/v0;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;)V

    new-instance v0, Lyp/w0;

    invoke-direct {v0, v1, v2}, Lyp/w0;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)V

    new-instance v2, Lyp/x0;

    invoke-direct {v2, v1}, Lyp/x0;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)V

    move-object/from16 v18, v0

    move-object/from16 v19, v2

    move-object/from16 v16, v4

    move-object/from16 v17, v5

    invoke-interface/range {v8 .. v19}, Lur/a;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V

    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static synthetic E(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->S3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic E0()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->p2()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static final E1(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;
    .locals 0

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/p;->x(Lym/k$a;Lur/a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final E2(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;)Lkotlin/Unit;
    .locals 1

    invoke-virtual {p0}, Lym/k$a;->d()Lym/h;

    move-result-object p0

    new-instance v0, Lyp/f4;

    invoke-direct {v0, p1, p2, p3}, Lyp/f4;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;)V

    const/4 p2, 0x1

    const/4 p3, 0x0

    invoke-static {p1, p3, v0, p2, p3}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final E3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;)Lkotlin/Unit;
    .locals 1

    invoke-virtual {p0}, Lym/k$a;->d()Lym/h;

    move-result-object p0

    new-instance v0, Lyp/z0;

    invoke-direct {v0, p1, p2, p3}, Lyp/z0;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;)V

    const/4 p2, 0x1

    const/4 p3, 0x0

    invoke-static {p1, p3, v0, p2, p3}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic F(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->B1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->M2(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final F1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->X3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final F2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;Lym/r$c;)Lkotlin/Unit;
    .locals 11

    const-string v0, "$this$action"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->n:Lcom/withpersona/sdk2/inquiry/selfie/g;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/g;->c()V

    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;

    const/4 p0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p3, v2, p0, v1}, Lcom/withpersona/sdk2/inquiry/selfie/p;->l(Lym/r$c;ZILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v3

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->A()Ljava/util/List;

    move-result-object v4

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->E()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;

    move-result-object v5

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v7

    const/16 v9, 0xa3

    const/4 v10, 0x0

    const/4 v1, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v10}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;-><init>(ZZLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;ZLcom/withpersona/sdk2/camera/CameraProperties$b;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p3, v0}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final F3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;Lym/r$c;)Lkotlin/Unit;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    const-string v2, "$this$action"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->n:Lcom/withpersona/sdk2/inquiry/selfie/g;

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->t()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/withpersona/sdk2/inquiry/selfie/g;->l(Ljava/lang/String;)V

    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->n:Lcom/withpersona/sdk2/inquiry/selfie/g;

    invoke-virtual {v1}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    invoke-virtual {v0, v2}, Lcom/withpersona/sdk2/inquiry/selfie/g;->b(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;)V

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;->g()Ljava/util/List;

    move-result-object v8

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v15

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;->t()J

    move-result-wide v13

    const/4 v0, 0x0

    invoke-static {v1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/p;->k(Lym/r$c;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v16

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->E()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;

    move-result-object v17

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v18

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;->s()Z

    move-result v19

    new-instance v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;

    const/16 v21, 0xa3

    const/16 v22, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v3 .. v22}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;-><init>(ZLkn/b;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Ljava/util/List;Ljava/util/List;JZJLcom/withpersona/sdk2/camera/CameraProperties;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v3}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static synthetic G(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->e3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G0(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->U3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final G1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a:Landroid/content/Context;

    invoke-virtual {p0, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->w1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Z

    move-result p0

    invoke-static {v0, p1, p2, p0}, Lcom/withpersona/sdk2/inquiry/selfie/p;->z(Landroid/content/Context;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Z)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final G2(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;
    .locals 0

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/p;->x(Lym/k$a;Lur/a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final G3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lym/k$a;->d()Lym/h;

    move-result-object p0

    new-instance v0, Lyp/b1;

    invoke-direct {v0, p1, p2}, Lyp/b1;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;)V

    const/4 p2, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, p2, v1}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic H(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/e$c;)Lym/r;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/e$c;)Lym/r;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H0(Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->D1(Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final H1(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/camera/CameraProperties$b;)Lkotlin/Unit;
    .locals 2

    const-string v0, "facingMode"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lym/k$a;->d()Lym/h;

    move-result-object p0

    new-instance v0, Lyp/p4;

    invoke-direct {v0, p2}, Lyp/p4;-><init>(Lcom/withpersona/sdk2/camera/CameraProperties$b;)V

    const/4 p2, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, p2, v1}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final H2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->X3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final H3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;Lym/r$c;)Lkotlin/Unit;
    .locals 7

    const-string v0, "$this$action"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    invoke-interface {p0}, Lur/a;->a()V

    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;

    const/4 p0, 0x0

    invoke-static {p2, p0}, Lcom/withpersona/sdk2/inquiry/selfie/p;->k(Lym/r$c;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v3

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v4

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;-><init>(ZZLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p2, v0}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic I(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->x2(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I0(Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;Lkn/a;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->g2(Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;Lkn/a;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final I1(Lcom/withpersona/sdk2/camera/CameraProperties$b;Lym/r$c;)Lkotlin/Unit;
    .locals 8

    const-string v0, "$this$action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/p;->k(Lym/r$c;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v4

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v5, p0

    invoke-direct/range {v1 .. v7}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;-><init>(ZZLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v1}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final I2()Lkotlin/Unit;
    .locals 1

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static final I3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->n:Lcom/withpersona/sdk2/inquiry/selfie/g;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->t()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/g;->j(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic J(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->J3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic J0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->Q1(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final J1(Z)Lkotlin/Unit;
    .locals 0

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final J3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    const-string v0, "step"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->n:Lcom/withpersona/sdk2/inquiry/selfie/g;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/g;->i(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic K(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->c2(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic K0(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->S1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final K2(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;
    .locals 1

    invoke-virtual {p0}, Lym/k$a;->d()Lym/h;

    move-result-object p0

    new-instance v0, Lyp/y3;

    invoke-direct {v0, p2, p3, p1}, Lyp/y3;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)V

    const/4 p2, 0x1

    const/4 p3, 0x0

    invoke-static {p1, p3, v0, p2, p3}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final K3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;Lym/r$c;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$action"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lym/k$a;->d()Lym/h;

    move-result-object p0

    new-instance p3, Lyp/y0;

    invoke-direct {p3, p1, p2}, Lyp/y0;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;)V

    const/4 p2, 0x1

    const/4 v0, 0x0

    invoke-static {p1, v0, p3, p2, v0}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic L(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lkotlin/Unit;)Lym/r;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->d3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lkotlin/Unit;)Lym/r;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic L0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->K2(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final L1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/e$c;)Lym/r;
    .locals 1

    const-string v0, "output"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lyp/a4;

    invoke-direct {v0, p3, p0, p1, p2}, Lyp/a4;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/e$c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lym/k$a;)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {p0, p2, v0, p1, p2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0
.end method

.method public static final L2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/r$c;)Lkotlin/Unit;
    .locals 23

    move-object/from16 v0, p3

    const-string v1, "$this$action"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;->g()Ljava/util/List;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;->w()Ljava/util/List;

    move-result-object v6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    invoke-virtual/range {p0 .. p0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;->f()Z

    move-result v10

    invoke-virtual/range {p0 .. p0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;->t()J

    move-result-wide v11

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/withpersona/sdk2/inquiry/selfie/p;->k(Lym/r$c;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->E()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;

    move-result-object v15

    invoke-virtual/range {p0 .. p0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v16

    invoke-virtual/range {p0 .. p0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;->s()Z

    move-result v17

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->O()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    move-object/from16 v1, p2

    iget-object v1, v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->r:Ldq/a;

    if-nez v1, :cond_0

    const-string v1, "selfiePoseManager"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->u(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {v2}, Ldq/a;->j()J

    move-result-wide v1

    add-long/2addr v3, v1

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    :cond_1
    move-object/from16 v19, v2

    new-instance v2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;

    const/16 v21, 0x2001

    const/16 v22, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v2 .. v22}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;-><init>(Lkn/b;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Ljava/util/List;Ljava/util/List;JZJLcom/withpersona/sdk2/camera/CameraProperties;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;Ljava/lang/Long;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v2}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static final L3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;Lym/r$c;)Lkotlin/Unit;
    .locals 7

    const-string v0, "$this$action"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lur/a;->a()V

    :cond_0
    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;

    const/4 p0, 0x0

    invoke-static {p2, p0}, Lcom/withpersona/sdk2/inquiry/selfie/p;->k(Lym/r$c;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v3

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v4

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v6}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;-><init>(ZZLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p2, v0}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic M(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->C2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic M0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->n2(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final M1(Lcom/withpersona/sdk2/inquiry/selfie/e$c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lym/k$a;Lym/r$c;)Lkotlin/Unit;
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p4

    const-string v3, "$this$action"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;

    if-eqz v4, :cond_0

    check-cast v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;

    :goto_0
    move-object v4, v3

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    goto :goto_0

    :goto_1
    if-nez v4, :cond_1

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_1
    instance-of v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/e$c$a;

    if-eqz v3, :cond_4

    check-cast v0, Lcom/withpersona/sdk2/inquiry/selfie/e$c$a;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/e$c$a;->c()Lcom/withpersona/sdk2/inquiry/selfie/Selfie;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/e$c$a;->c()Lcom/withpersona/sdk2/inquiry/selfie/Selfie;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v3, v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->n:Lcom/withpersona/sdk2/inquiry/selfie/g;

    invoke-virtual {v3, v4, v0}, Lcom/withpersona/sdk2/inquiry/selfie/g;->g(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;)V

    move-object/from16 v3, p2

    invoke-virtual {v1, v2, v3, v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->x1(Lym/r$c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v0

    invoke-virtual {v2, v0}, Lym/r$c;->e(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Required value was null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    sget-object v20, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;->c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;

    const v23, 0xdfff

    const/16 v24, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v4 .. v24}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;->A(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lkn/b;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Ljava/util/List;Ljava/util/List;JZJLcom/withpersona/sdk2/camera/CameraProperties;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;Ljava/lang/Long;ZILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;

    move-result-object v0

    invoke-virtual {v2, v0}, Lym/r$c;->e(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_4
    instance-of v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/e$c$c;

    if-eqz v3, :cond_6

    check-cast v0, Lcom/withpersona/sdk2/inquiry/selfie/e$c$c;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/e$c$c;->b()Lkn/b;

    move-result-object v1

    sget-object v3, Lkn/b;->h:Lkn/b;

    if-ne v1, v3, :cond_5

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/e$c$c;->c()F

    move-result v6

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/e$c$c;->a()Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;

    move-result-object v7

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/e$c$c;->d()Z

    move-result v22

    const/16 v23, 0x7fb9

    const/16 v24, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v4 .. v24}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;->A(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lkn/b;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Ljava/util/List;Ljava/util/List;JZJLcom/withpersona/sdk2/camera/CameraProperties;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;Ljava/lang/Long;ZILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;

    move-result-object v0

    invoke-virtual {v2, v0}, Lym/r$c;->e(Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/e$c$c;->b()Lkn/b;

    move-result-object v5

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/e$c$c;->c()F

    move-result v6

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/e$c$c;->a()Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;

    move-result-object v7

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/e$c$c;->d()Z

    move-result v22

    const/16 v23, 0x7ff8

    const/16 v24, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v4 .. v24}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;->A(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lkn/b;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Ljava/util/List;Ljava/util/List;JZJLcom/withpersona/sdk2/camera/CameraProperties;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;Ljava/lang/Long;ZILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;

    move-result-object v0

    invoke-virtual {v2, v0}, Lym/r$c;->e(Ljava/lang/Object;)V

    goto :goto_2

    :cond_6
    instance-of v2, v0, Lcom/withpersona/sdk2/inquiry/selfie/e$c$b;

    if-eqz v2, :cond_7

    check-cast v0, Lcom/withpersona/sdk2/inquiry/selfie/e$c$b;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/e$c$b;->a()Ljava/lang/Throwable;

    move-result-object v0

    move-object/from16 v2, p3

    invoke-virtual {v1, v2, v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->W3(Lym/k$a;Ljava/lang/Throwable;)V

    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_7
    new-instance v0, Ljt/l;

    invoke-direct {v0}, Ljt/l;-><init>()V

    throw v0
.end method

.method public static final M2(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;
    .locals 0

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/p;->x(Lym/k$a;Lur/a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final M3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;
    .locals 0

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/p;->x(Lym/k$a;Lur/a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic N(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->Y2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic N0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->U1(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final N1(Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;Lkn/a;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Ljava/lang/String;)Lkotlin/Unit;
    .locals 8

    const-string v0, "absolutePath"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;->c:Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;->g()Ljava/lang/String;

    move-result-object v7

    new-instance v1, Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieImage;

    move-object v4, p1

    move-object v2, p5

    invoke-direct/range {v1 .. v7}, Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieImage;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;Lkn/a;JLjava/lang/String;)V

    invoke-virtual {p2}, Lym/k$a;->d()Lym/h;

    move-result-object p0

    new-instance p1, Lyp/u3;

    invoke-direct {p1, p3, p4, v1}, Lyp/u3;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieImage;)V

    const/4 p2, 0x1

    const/4 p4, 0x0

    invoke-static {p3, p4, p1, p2, p4}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final N2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->X3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final N3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->X3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic O(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->w3(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O0(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->n3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final O1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieImage;Lym/r$c;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$action"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p3, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->x1(Lym/r$c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object p0

    invoke-virtual {p3, p0}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final O2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a:Landroid/content/Context;

    invoke-virtual {p0, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->w1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Z

    move-result p0

    invoke-static {v0, p1, p2, p0}, Lcom/withpersona/sdk2/inquiry/selfie/p;->z(Landroid/content/Context;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Z)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final O3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a:Landroid/content/Context;

    invoke-virtual {p0, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->w1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Z

    move-result p0

    invoke-static {v0, p1, p2, p0}, Lcom/withpersona/sdk2/inquiry/selfie/p;->z(Landroid/content/Context;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Z)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic P(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/camera/CameraProperties$b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->H1(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/camera/CameraProperties$b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic P0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->K3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final P1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->W3(Lym/k$a;Ljava/lang/Throwable;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic Q(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->m3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Q0(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->v2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final Q1(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;
    .locals 0

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/p;->x(Lym/k$a;Lur/a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final Q2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/e$c;)Lym/r;
    .locals 7

    const-string v0, "output"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lyp/j4;

    move-object v5, p0

    move-object v3, p1

    move-object v4, p2

    move-object v6, p3

    move-object v2, p4

    invoke-direct/range {v1 .. v6}, Lyp/j4;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/e$c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)V

    const/4 p0, 0x1

    const/4 p1, 0x0

    invoke-static {v5, p1, v1, p0, p1}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0
.end method

.method public static final Q3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lym/k$a;->d()Lym/h;

    move-result-object p0

    new-instance v0, Lyp/m4;

    invoke-direct {v0, p2}, Lyp/m4;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;)V

    const/4 p2, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, p2, v1}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic R(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/e$c;)Lym/r;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->b3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/e$c;)Lym/r;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic R0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->u2(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final R1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->X3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final R2(Lcom/withpersona/sdk2/inquiry/selfie/e$c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lym/r$c;)Lkotlin/Unit;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p5

    const-string v2, "$this$action"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;

    if-eqz v3, :cond_0

    check-cast v2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;

    :goto_0
    move-object v3, v2

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    goto :goto_0

    :goto_1
    if-nez v3, :cond_1

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_1
    instance-of v2, v0, Lcom/withpersona/sdk2/inquiry/selfie/e$c$a;

    if-eqz v2, :cond_2

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;->g()Ljava/util/List;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;->w()Ljava/util/List;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;->n()J

    move-result-wide v5

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;->t()J

    move-result-wide v8

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/withpersona/sdk2/inquiry/selfie/p;->k(Lym/r$c;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v14

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->E()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;

    move-result-object v15

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;->f()Z

    move-result v16

    check-cast v0, Lcom/withpersona/sdk2/inquiry/selfie/e$c$a;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/e$c$a;->b()F

    move-result v10

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/e$c$a;->a()Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v17

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;->s()Z

    move-result v18

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/e$c$a;->d()Z

    move-result v19

    new-instance v4, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;

    invoke-direct/range {v4 .. v19}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;-><init>(JLcom/withpersona/sdk2/camera/CameraProperties;JFLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;ZLcom/withpersona/sdk2/camera/CameraProperties$b;ZZ)V

    invoke-virtual {v1, v4}, Lym/r$c;->e(Ljava/lang/Object;)V

    goto :goto_3

    :cond_2
    instance-of v2, v0, Lcom/withpersona/sdk2/inquiry/selfie/e$c$b;

    if-eqz v2, :cond_3

    check-cast v0, Lcom/withpersona/sdk2/inquiry/selfie/e$c$b;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/e$c$b;->a()Ljava/lang/Throwable;

    move-result-object v0

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    invoke-virtual {v1, v2, v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->W3(Lym/k$a;Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_3
    instance-of v2, v0, Lcom/withpersona/sdk2/inquiry/selfie/e$c$c;

    if-eqz v2, :cond_5

    check-cast v0, Lcom/withpersona/sdk2/inquiry/selfie/e$c$c;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/e$c$c;->b()Lkn/b;

    move-result-object v2

    sget-object v4, Lkn/b;->h:Lkn/b;

    if-ne v2, v4, :cond_4

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/e$c$c;->c()F

    move-result v6

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/e$c$c;->a()Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;

    move-result-object v7

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/e$c$c;->d()Z

    move-result v20

    const/16 v21, 0x3f72

    const/16 v22, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v3 .. v22}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;->A(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;ZLkn/b;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Ljava/util/List;Ljava/util/List;JZJLcom/withpersona/sdk2/camera/CameraProperties;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZZILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;

    move-result-object v0

    goto :goto_2

    :cond_4
    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/e$c$c;->b()Lkn/b;

    move-result-object v5

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/e$c$c;->c()F

    move-result v6

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/e$c$c;->a()Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;

    move-result-object v7

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/e$c$c;->d()Z

    move-result v20

    const/16 v21, 0x3ff0

    const/16 v22, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v3 .. v22}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;->A(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;ZLkn/b;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Ljava/util/List;Ljava/util/List;JZJLcom/withpersona/sdk2/camera/CameraProperties;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZZILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;

    move-result-object v0

    :goto_2
    invoke-virtual {v1, v0}, Lym/r$c;->e(Ljava/lang/Object;)V

    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_5
    new-instance v0, Ljt/l;

    invoke-direct {v0}, Ljt/l;-><init>()V

    throw v0
.end method

.method public static final R3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;Lym/r$c;)Lkotlin/Unit;
    .locals 8

    const-string v0, "$this$action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;->w()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;->z()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v4

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;->t()J

    move-result-wide v5

    const/4 p0, 0x0

    invoke-static {p1, p0}, Lcom/withpersona/sdk2/inquiry/selfie/p;->k(Lym/r$c;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/withpersona/sdk2/inquiry/selfie/p;->D(Lym/r$c;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object p0

    invoke-virtual {v1, p0}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic S(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->O3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic S0(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->k3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final S1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a:Landroid/content/Context;

    invoke-virtual {p0, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->w1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Z

    move-result p0

    invoke-static {v0, p1, p2, p0}, Lcom/withpersona/sdk2/inquiry/selfie/p;->z(Landroid/content/Context;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Z)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final S2(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;
    .locals 1

    invoke-virtual {p0}, Lym/k$a;->d()Lym/h;

    move-result-object p0

    new-instance v0, Lyp/r0;

    invoke-direct {v0, p2, p3, p1}, Lyp/r0;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)V

    const/4 p2, 0x1

    const/4 p3, 0x0

    invoke-static {p1, p3, v0, p2, p3}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final S3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;
    .locals 0

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/p;->x(Lym/k$a;Lur/a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic T(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->f3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic T0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->Q3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final T2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/r$c;)Lkotlin/Unit;
    .locals 19

    move-object/from16 v0, p3

    const-string v1, "$this$action"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;

    if-eqz v2, :cond_0

    check-cast v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_1
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;->g()Ljava/util/List;

    move-result-object v6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;->f()Z

    move-result v9

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;->t()J

    move-result-wide v10

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/withpersona/sdk2/inquiry/selfie/p;->k(Lym/r$c;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->E()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v14

    invoke-virtual/range {p0 .. p0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;->s()Z

    move-result v15

    invoke-virtual/range {p0 .. p0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;->G()Z

    move-result v16

    new-instance v2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;

    const/16 v17, 0x2

    const/16 v18, 0x0

    const/4 v3, 0x3

    const/4 v4, 0x0

    invoke-direct/range {v2 .. v18}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;-><init>(ILkn/b;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/util/List;JZJLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v2}, Lym/r$c;->e(Ljava/lang/Object;)V

    move-object/from16 v0, p2

    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->n:Lcom/withpersona/sdk2/inquiry/selfie/g;

    invoke-virtual {v0, v1}, Lcom/withpersona/sdk2/inquiry/selfie/g;->d(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static final T3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->X3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic U(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;)Lym/r;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->t3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;)Lym/r;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic U0(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->X1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final U1(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;
    .locals 3

    invoke-virtual {p0}, Lym/k$a;->d()Lym/h;

    move-result-object p0

    new-instance v0, Lyp/w3;

    invoke-direct {v0}, Lyp/w3;-><init>()V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1, v2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final U2(Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;Lkn/a;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;Ljava/lang/String;)Lkotlin/Unit;
    .locals 8

    const-string v0, "absolutePath"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;->c:Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;->g()Ljava/lang/String;

    move-result-object v7

    new-instance v1, Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieImage;

    move-object v4, p1

    move-object v2, p5

    invoke-direct/range {v1 .. v7}, Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieImage;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;Lkn/a;JLjava/lang/String;)V

    invoke-virtual {p2}, Lym/k$a;->d()Lym/h;

    move-result-object p0

    new-instance p1, Lyp/s0;

    invoke-direct {p1, p3, p4, v1}, Lyp/s0;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieImage;)V

    const/4 p2, 0x1

    const/4 p4, 0x0

    invoke-static {p3, p4, p1, p2, p4}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final U3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a:Landroid/content/Context;

    invoke-virtual {p0, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->w1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Z

    move-result p0

    invoke-static {v0, p1, p2, p0}, Lcom/withpersona/sdk2/inquiry/selfie/p;->z(Landroid/content/Context;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Z)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic V(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;Lcom/withpersona/sdk2/camera/CameraProperties;JLym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->y3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;Lcom/withpersona/sdk2/camera/CameraProperties;JLym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic V0(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->h3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final V1(Lym/r$c;)Lkotlin/Unit;
    .locals 3

    const-string v0, "$this$action"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;->A()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v2

    :cond_1
    if-eqz v2, :cond_2

    invoke-virtual {p0, v2}, Lym/r$c;->e(Ljava/lang/Object;)V

    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final V2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieImage;Lym/r$c;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$action"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p3, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->x1(Lym/r$c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object p0

    invoke-virtual {p3, p0}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic W(Lcom/withpersona/sdk2/camera/CameraProperties$b;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->I1(Lcom/withpersona/sdk2/camera/CameraProperties$b;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic W0(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->Y3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final W1(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;
    .locals 0

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/p;->x(Lym/k$a;Lur/a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final W2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->W3(Lym/k$a;Ljava/lang/Throwable;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic X(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->R3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->G1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final X1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->X3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final X2(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;
    .locals 0

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/p;->x(Lym/k$a;Lur/a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic Y(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->o3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Y0(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/k$a;Ltr/b$b;)Lym/r;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->C3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/k$a;Ltr/b$b;)Lym/r;

    move-result-object p0

    return-object p0
.end method

.method public static final Y1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a:Landroid/content/Context;

    invoke-virtual {p0, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->w1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Z

    move-result p0

    invoke-static {v0, p1, p2, p0}, Lcom/withpersona/sdk2/inquiry/selfie/p;->z(Landroid/content/Context;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Z)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final Y2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->X3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final Y3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;Lym/r$c;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Lym/r$c;->d(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic Z(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->s2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Z0(Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;Lkn/a;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->U2(Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;Lkn/a;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final Z2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a:Landroid/content/Context;

    invoke-virtual {p0, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->w1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Z

    move-result p0

    invoke-static {v0, p1, p2, p0}, Lcom/withpersona/sdk2/inquiry/selfie/p;->z(Landroid/content/Context;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Z)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic a0(Lcom/withpersona/sdk2/inquiry/selfie/e$c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->c3(Lcom/withpersona/sdk2/inquiry/selfie/e$c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;Ljava/lang/String;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->o2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;Ljava/lang/String;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final a2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/e$c;)Lym/r;
    .locals 7

    const-string v0, "output"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lyp/u4;

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v2, p4

    invoke-direct/range {v1 .. v6}, Lyp/u4;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/e$c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)V

    const/4 p0, 0x1

    const/4 p1, 0x0

    invoke-static {v3, p1, v1, p0, p1}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b0(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;ZLcq/b$d;)Lym/r;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->j3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;ZLcq/b$d;)Lym/r;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->H2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final b2(Lcom/withpersona/sdk2/inquiry/selfie/e$c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/r$c;)Lkotlin/Unit;
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p5

    const-string v2, "$this$action"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;

    if-eqz v3, :cond_0

    check-cast v2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_1

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_1
    instance-of v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/e$c$a;

    if-nez v3, :cond_4

    instance-of v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/e$c$b;

    if-eqz v3, :cond_2

    check-cast v0, Lcom/withpersona/sdk2/inquiry/selfie/e$c$b;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/e$c$b;->a()Ljava/lang/Throwable;

    move-result-object v0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-virtual {v1, v2, v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->W3(Lym/k$a;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_2
    instance-of v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/e$c$c;

    if-eqz v3, :cond_3

    invoke-virtual/range {p3 .. p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->g()Ljava/util/List;

    move-result-object v9

    invoke-virtual/range {p3 .. p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->w()Ljava/util/List;

    move-result-object v10

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->n()J

    move-result-wide v11

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v16

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->t()J

    move-result-wide v14

    const/4 v3, 0x0

    invoke-static {v1, v3}, Lcom/withpersona/sdk2/inquiry/selfie/p;->k(Lym/r$c;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v17

    invoke-virtual/range {p4 .. p4}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->E()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;

    move-result-object v18

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->E()F

    move-result v7

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->C()Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;

    move-result-object v8

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v19

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->s()Z

    move-result v20

    check-cast v0, Lcom/withpersona/sdk2/inquiry/selfie/e$c$c;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/e$c$c;->d()Z

    move-result v21

    new-instance v4, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;

    const/16 v22, 0x83

    const/16 v23, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v4 .. v23}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;-><init>(ZLkn/b;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Ljava/util/List;Ljava/util/List;JZJLcom/withpersona/sdk2/camera/CameraProperties;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v4}, Lym/r$c;->e(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    new-instance v0, Ljt/l;

    invoke-direct {v0}, Ljt/l;-><init>()V

    throw v0

    :cond_4
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static final b3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/e$c;)Lym/r;
    .locals 7

    const-string v0, "output"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lyp/c4;

    move-object v3, p0

    move-object v4, p1

    move-object v5, p2

    move-object v6, p3

    move-object v2, p4

    invoke-direct/range {v1 .. v6}, Lyp/c4;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/e$c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)V

    const/4 p0, 0x1

    const/4 p1, 0x0

    invoke-static {v3, p1, v1, p0, p1}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->A3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->s3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final c2(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;
    .locals 0

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/p;->x(Lym/k$a;Lur/a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final c3(Lcom/withpersona/sdk2/inquiry/selfie/e$c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/r$c;)Lkotlin/Unit;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p5

    const-string v2, "$this$action"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v0, Lcom/withpersona/sdk2/inquiry/selfie/e$c$a;

    if-nez v2, :cond_2

    instance-of v2, v0, Lcom/withpersona/sdk2/inquiry/selfie/e$c$b;

    if-eqz v2, :cond_0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/selfie/e$c$b;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/e$c$b;->a()Ljava/lang/Throwable;

    move-result-object v0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-virtual {v1, v2, v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->W3(Lym/k$a;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    instance-of v2, v0, Lcom/withpersona/sdk2/inquiry/selfie/e$c$c;

    if-eqz v2, :cond_1

    check-cast v0, Lcom/withpersona/sdk2/inquiry/selfie/e$c$c;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/e$c$c;->b()Lkn/b;

    move-result-object v4

    invoke-virtual/range {p3 .. p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->g()Ljava/util/List;

    move-result-object v7

    invoke-virtual/range {p3 .. p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->w()Ljava/util/List;

    move-result-object v8

    invoke-virtual/range {p3 .. p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->n()J

    move-result-wide v9

    invoke-virtual/range {p3 .. p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v14

    invoke-virtual/range {p3 .. p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->t()J

    move-result-wide v12

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lcom/withpersona/sdk2/inquiry/selfie/p;->k(Lym/r$c;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v15

    invoke-virtual/range {p4 .. p4}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->E()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;

    move-result-object v16

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/e$c$c;->c()F

    move-result v5

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/e$c$c;->a()Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;

    move-result-object v6

    invoke-virtual/range {p3 .. p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v17

    invoke-virtual/range {p3 .. p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->s()Z

    move-result v18

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/e$c$c;->d()Z

    move-result v19

    new-instance v2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;

    const/16 v20, 0x81

    const/16 v21, 0x0

    const/4 v3, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v2 .. v21}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;-><init>(ZLkn/b;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Ljava/util/List;Ljava/util/List;JZJLcom/withpersona/sdk2/camera/CameraProperties;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v2}, Lym/r$c;->e(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    new-instance v0, Ljt/l;

    invoke-direct {v0}, Ljt/l;-><init>()V

    throw v0

    :cond_2
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static synthetic d0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->S2(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d1(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->G2(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final d2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->X3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final d3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lkotlin/Unit;)Lym/r;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lyp/o4;

    invoke-direct {p2, p0, p1}, Lyp/o4;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)V

    const/4 p1, 0x1

    const/4 v0, 0x0

    invoke-static {p0, v0, p2, p1, v0}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q2(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->A2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final e2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a:Landroid/content/Context;

    invoke-virtual {p0, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->w1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Z

    move-result p0

    invoke-static {v0, p1, p2, p0}, Lcom/withpersona/sdk2/inquiry/selfie/p;->z(Landroid/content/Context;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Z)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final e3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/r$c;)Lkotlin/Unit;
    .locals 26

    move-object/from16 v0, p2

    const-string v1, "$this$action"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;

    if-eqz v2, :cond_0

    check-cast v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_1
    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->n:Lcom/withpersona/sdk2/inquiry/selfie/g;

    invoke-virtual {v2, v1}, Lcom/withpersona/sdk2/inquiry/selfie/g;->a(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;)V

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->o()Lyp/a;

    move-result-object v2

    sget-object v3, Lyp/a;->c:Lyp/a;

    const/4 v4, 0x0

    if-ne v2, v3, :cond_2

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->j()Lkn/a;

    move-result-object v2

    sget-object v3, Lkn/a;->a:Lkn/a;

    if-ne v2, v3, :cond_2

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->g()Ljava/util/List;

    move-result-object v10

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->w()Ljava/util/List;

    move-result-object v9

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->n()J

    move-result-wide v11

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v16

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->t()J

    move-result-wide v14

    invoke-static {v0, v4}, Lcom/withpersona/sdk2/inquiry/selfie/p;->k(Lym/r$c;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v17

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->E()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;

    move-result-object v18

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->f()Z

    move-result v13

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->D()F

    move-result v7

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->C()Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;

    move-result-object v8

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v19

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->s()Z

    move-result v20

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->E()Z

    move-result v23

    new-instance v5, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;

    const/16 v24, 0x6001

    const/16 v25, 0x0

    const/4 v6, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v5 .. v25}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;-><init>(Lkn/b;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Ljava/util/List;Ljava/util/List;JZJLcom/withpersona/sdk2/camera/CameraProperties;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;Ljava/lang/Long;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->g()Ljava/util/List;

    move-result-object v16

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->w()Ljava/util/List;

    move-result-object v17

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->n()J

    move-result-wide v9

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v11

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->t()J

    move-result-wide v12

    invoke-static {v0, v4}, Lcom/withpersona/sdk2/inquiry/selfie/p;->k(Lym/r$c;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v18

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->E()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;

    move-result-object v19

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->f()Z

    move-result v20

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->D()F

    move-result v14

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->C()Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;

    move-result-object v15

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v21

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->s()Z

    move-result v22

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->E()Z

    move-result v23

    new-instance v6, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;

    const/16 v24, 0x2

    const/16 v25, 0x0

    const/4 v7, 0x3

    const/4 v8, 0x0

    invoke-direct/range {v6 .. v25}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;-><init>(ILkn/b;JLcom/withpersona/sdk2/camera/CameraProperties;JFLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;ZLcom/withpersona/sdk2/camera/CameraProperties$b;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v5, v6

    :goto_1
    invoke-virtual {v0, v5}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static synthetic f0(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->T3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f1(Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->J1(Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final f3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;
    .locals 0

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/p;->x(Lym/k$a;Lur/a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic g0(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->N2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g1(ZLcq/b$d;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->l3(ZLcq/b$d;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final g2(Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;Lkn/a;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;Ljava/lang/String;)Lkotlin/Unit;
    .locals 8

    const-string v0, "absolutePath"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;->c:Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;->g()Ljava/lang/String;

    move-result-object v7

    new-instance v1, Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieImage;

    move-object v4, p1

    move-object v2, p5

    invoke-direct/range {v1 .. v7}, Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieImage;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;Lkn/a;JLjava/lang/String;)V

    invoke-virtual {p2}, Lym/k$a;->d()Lym/h;

    move-result-object p0

    new-instance p1, Lyp/t0;

    invoke-direct {p1, p3, p4, v1}, Lyp/t0;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieImage;)V

    const/4 p2, 0x1

    const/4 p4, 0x0

    invoke-static {p3, p4, p1, p2, p4}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final g3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->X3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic h(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->W1(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->E1(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h1(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->u3(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final h2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieImage;Lym/r$c;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$action"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p3, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->x1(Lym/r$c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object p0

    invoke-virtual {p3, p0}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final h3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a:Landroid/content/Context;

    invoke-virtual {p0, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->w1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Z

    move-result p0

    invoke-static {v0, p1, p2, p0}, Lcom/withpersona/sdk2/inquiry/selfie/p;->z(Landroid/content/Context;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Z)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic i(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->P1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Ljava/lang/Throwable;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i0(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->Z2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i1(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->X2(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final i2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->W3(Lym/k$a;Ljava/lang/Throwable;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic j(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->W2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Ljava/lang/Throwable;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j0(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->Y1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->i2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Ljava/lang/Throwable;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final j2(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;
    .locals 0

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/p;->x(Lym/k$a;Lur/a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final j3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;ZLcq/b$d;)Lym/r;
    .locals 3

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p3, Lcq/b$d$b;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    new-instance p2, Lyp/r4;

    invoke-direct {p2, p0, p1}, Lyp/r4;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)V

    invoke-static {p0, v2, p2, v1, v2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p3, Lcq/b$d$a;

    if-eqz v0, :cond_1

    new-instance v0, Lyp/s4;

    invoke-direct {v0, p2, p3, p0, p1}, Lyp/s4;-><init>(ZLcq/b$d;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)V

    invoke-static {p0, v2, v0, v1, v2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0
.end method

.method public static synthetic k(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->E3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k0(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->H3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k1(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->z2(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final k2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->X3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final k3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lym/r$c;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$action"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$d;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$d;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->X3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic l(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->F2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lkn/a;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->A1(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lkn/a;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieImage;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->h2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieImage;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final l2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a:Landroid/content/Context;

    invoke-virtual {p0, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->w1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Z

    move-result p0

    invoke-static {v0, p1, p2, p0}, Lcom/withpersona/sdk2/inquiry/selfie/p;->z(Landroid/content/Context;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Z)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final l3(ZLcq/b$d;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lym/r$c;)Lkotlin/Unit;
    .locals 14

    move-object/from16 v0, p4

    const-string v1, "$this$action"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;

    if-eqz v2, :cond_0

    check-cast v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;

    :goto_0
    move-object v2, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    if-nez v2, :cond_1

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_1
    if-eqz p0, :cond_2

    move-object p0, p1

    check-cast p0, Lcq/b$d$a;

    invoke-virtual {p0}, Lcq/b$d$a;->a()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    move-result-object v1

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/selfie/p;->B(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lcq/b$d$a;->a()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    move-result-object v11

    const/16 v12, 0x7f

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v2 .. v13}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;->A(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$b;ILcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;

    move-result-object p0

    invoke-virtual {v0, p0}, Lym/r$c;->e(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    new-instance p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$c;

    check-cast p1, Lcq/b$d$a;

    invoke-virtual {p1}, Lcq/b$d$a;->a()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$c;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    move-object/from16 p1, p2

    move-object/from16 v0, p3

    invoke-virtual {p1, v0, p0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->X3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;)V

    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic m(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/e$c;)Lym/r;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->Q2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/e$c;)Lym/r;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->B2(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->F3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final m3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->X3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic n(Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;Lkn/a;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->N1(Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;Lkn/a;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Ljava/lang/String;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n0(Lym/k$a;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->z3(Lym/k$a;Ljava/lang/Throwable;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->F1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final n2(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lym/k$a;->d()Lym/h;

    move-result-object p0

    new-instance v0, Lyp/l4;

    invoke-direct {v0, p1, p2, p3, p4}, Lyp/l4;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;Ljava/lang/String;)V

    const/4 p2, 0x1

    const/4 p3, 0x0

    invoke-static {p1, p3, v0, p2, p3}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final n3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->X3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic o(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->L2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o0(Lcom/withpersona/sdk2/inquiry/selfie/e$c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->b2(Lcom/withpersona/sdk2/inquiry/selfie/e$c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic o1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static final o2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;Ljava/lang/String;Lym/r$c;)Lkotlin/Unit;
    .locals 9

    const-string v0, "$this$action"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->n:Lcom/withpersona/sdk2/inquiry/selfie/g;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->t()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/g;->m(Ljava/lang/String;)V

    new-instance v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;->w()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v4

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;->t()J

    move-result-wide v5

    const/4 p1, 0x0

    invoke-static {p4, p1}, Lcom/withpersona/sdk2/inquiry/selfie/p;->k(Lym/r$c;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v7

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v8

    move-object v3, p3

    invoke-direct/range {v1 .. v8}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;-><init>(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$b;)V

    invoke-virtual {p4, v1}, Lym/r$c;->e(Ljava/lang/Object;)V

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    invoke-interface {p0}, Lur/a;->d()V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final o3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;
    .locals 3

    invoke-virtual {p0}, Lym/k$a;->d()Lym/h;

    move-result-object p0

    new-instance v0, Lyp/n4;

    invoke-direct {v0}, Lyp/n4;-><init>()V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1, v2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic p(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->M3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p0(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;)Lym/r;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->v3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;)Lym/r;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic p1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lcom/withpersona/sdk2/inquiry/selfie/g;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->n:Lcom/withpersona/sdk2/inquiry/selfie/g;

    return-object p0
.end method

.method public static final p2()Lkotlin/Unit;
    .locals 1

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static final p3(Lym/r$c;)Lkotlin/Unit;
    .locals 13

    const-string v0, "$this$action"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;

    :goto_0
    move-object v1, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    if-nez v1, :cond_1

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_1
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;->D()I

    move-result v0

    add-int/lit8 v9, v0, 0x1

    const/16 v11, 0x3f

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-static/range {v1 .. v12}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;->A(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$b;ILcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;

    move-result-object v0

    invoke-virtual {p0, v0}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic q(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->E2(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q0(Lcom/withpersona/sdk2/inquiry/selfie/e$c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->R2(Lcom/withpersona/sdk2/inquiry/selfie/e$c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic q1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Ldq/a;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->r:Ldq/a;

    return-object p0
.end method

.method public static final q2(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;
    .locals 0

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/p;->x(Lym/k$a;Lur/a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic r(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/e$c;)Lym/r;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->L1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/e$c;)Lym/r;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r0(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->N3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic r1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lur/a;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    return-object p0
.end method

.method public static final r2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->X3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final r3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->X3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic s()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->I2()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic s0(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;JLcom/withpersona/sdk2/camera/CameraProperties;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->x3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;JLcom/withpersona/sdk2/camera/CameraProperties;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic s1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/r$c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->x1(Lym/r$c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object p0

    return-object p0
.end method

.method public static final s2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a:Landroid/content/Context;

    invoke-virtual {p0, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->w1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Z

    move-result p0

    invoke-static {v0, p1, p2, p0}, Lcom/withpersona/sdk2/inquiry/selfie/p;->z(Landroid/content/Context;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Z)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final s3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a:Landroid/content/Context;

    invoke-virtual {p0, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->w1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Z

    move-result p0

    invoke-static {v0, p1, p2, p0}, Lcom/withpersona/sdk2/inquiry/selfie/p;->z(Landroid/content/Context;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Z)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic t(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->k2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t0(Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->V1(Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic t1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Ljava/lang/Throwable;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->W3(Lym/k$a;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final t3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;)Lym/r;
    .locals 7

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lyp/x3;

    move-object v5, p0

    move-object v3, p1

    move-object v4, p2

    move-object v6, p3

    move-object v2, p4

    invoke-direct/range {v1 .. v6}, Lyp/x3;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)V

    const/4 p0, 0x1

    const/4 p1, 0x0

    invoke-static {v5, p1, v1, p0, p1}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Ltr/b$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/k$a;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->D3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Ltr/b$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/k$a;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u0(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->y2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic u1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/r$c;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->Z3(Lym/r$c;)V

    return-void
.end method

.method public static final u2(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;)Lkotlin/Unit;
    .locals 1

    invoke-virtual {p0}, Lym/k$a;->d()Lym/h;

    move-result-object p0

    new-instance v0, Lyp/i4;

    invoke-direct {v0, p2, p3}, Lyp/i4;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;)V

    const/4 p2, 0x1

    const/4 p3, 0x0

    invoke-static {p1, p3, v0, p2, p3}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final u3(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lym/r$c;)Lkotlin/Unit;
    .locals 16

    move-object/from16 v0, p3

    move-object/from16 v1, p4

    move-object/from16 v2, p5

    const-string v3, "$this$action"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;->a()Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;->f()Lrp/j1;

    move-result-object v3

    sget-object v4, Lrp/j1;->a:Lrp/j1;

    if-ne v3, v4, :cond_0

    const/16 v14, 0xfe

    const/4 v15, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v5, p1

    invoke-static/range {v5 .. v15}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;->A(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;ZZLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;ZLcom/withpersona/sdk2/camera/CameraProperties$b;ZILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;

    move-result-object v0

    invoke-virtual {v2, v0}, Lym/r$c;->e(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->K()Z

    move-result v3

    if-nez v3, :cond_1

    new-instance v4, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$b;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v4}, Lym/r$c;->e(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->f()Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$a;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$a;

    invoke-virtual {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->X3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;)V

    goto :goto_0

    :cond_2
    new-instance v2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$c;

    new-instance v3, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$PermissionErrorInfo;

    const-string v4, "User rejected camera permissions for the selfie flow."

    invoke-direct {v3, v4}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$PermissionErrorInfo;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$c;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-virtual {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->X3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;)V

    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static synthetic v(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->T2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v0(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->r3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final v2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;Lym/r$c;)Lkotlin/Unit;
    .locals 12

    const-string v0, "$this$action"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;

    const/4 v0, 0x0

    invoke-static {p2, v0}, Lcom/withpersona/sdk2/inquiry/selfie/p;->k(Lym/r$c;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v4

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->A()Ljava/util/List;

    move-result-object v5

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->E()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;

    move-result-object v6

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v8

    const/16 v10, 0xa3

    const/4 v11, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v11}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;-><init>(ZZLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;ZLcom/withpersona/sdk2/camera/CameraProperties$b;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p2, v1}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final v3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/k$a;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;)Lym/r;
    .locals 7

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lyp/t4;

    move-object v5, p0

    move-object v3, p1

    move-object v4, p2

    move-object v6, p3

    move-object v2, p4

    invoke-direct/range {v1 .. v6}, Lyp/t4;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)V

    const/4 p0, 0x1

    const/4 p1, 0x0

    invoke-static {v5, p1, v1, p0, p1}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->j2(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w0(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->R1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final w3(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lym/r$c;)Lkotlin/Unit;
    .locals 16

    move-object/from16 v0, p3

    move-object/from16 v1, p4

    move-object/from16 v2, p5

    const-string v3, "$this$action"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;->a()Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;->f()Lrp/j1;

    move-result-object v3

    sget-object v4, Lrp/j1;->a:Lrp/j1;

    if-ne v3, v4, :cond_0

    const/16 v14, 0xfd

    const/4 v15, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v5, p1

    invoke-static/range {v5 .. v15}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;->A(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;ZZLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;ZLcom/withpersona/sdk2/camera/CameraProperties$b;ZILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;

    move-result-object v0

    invoke-virtual {v2, v0}, Lym/r$c;->e(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->K()Z

    move-result v3

    if-nez v3, :cond_1

    new-instance v4, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$b;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2, v4}, Lym/r$c;->e(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->f()Z

    move-result v2

    if-eqz v2, :cond_2

    sget-object v2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$a;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$a;

    invoke-virtual {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->X3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;)V

    goto :goto_0

    :cond_2
    new-instance v2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$c;

    new-instance v3, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$PermissionErrorInfo;

    const-string v4, "User rejected camera permissions for the selfie flow."

    invoke-direct {v3, v4}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$PermissionErrorInfo;-><init>(Ljava/lang/String;)V

    invoke-direct {v2, v3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$c;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-virtual {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->X3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;)V

    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static synthetic x(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->G3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x0(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieImage;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->V2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieImage;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final x2(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lym/k$a;->d()Lym/h;

    move-result-object p0

    new-instance v0, Lyp/v3;

    invoke-direct {v0, p2}, Lyp/v3;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;)V

    const/4 p2, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, p2, v1}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final x3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;JLcom/withpersona/sdk2/camera/CameraProperties;)Lkotlin/Unit;
    .locals 7

    const-string v0, "cameraProperties"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->n:Lcom/withpersona/sdk2/inquiry/selfie/g;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/g;->n()V

    invoke-virtual {p1}, Lym/k$a;->d()Lym/h;

    move-result-object p1

    new-instance v0, Lyp/b4;

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move-wide v5, p4

    move-object v4, p6

    invoke-direct/range {v0 .. v6}, Lyp/b4;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;Lcom/withpersona/sdk2/camera/CameraProperties;J)V

    const/4 p0, 0x1

    const/4 p2, 0x0

    invoke-static {v1, p2, v0, p0, p2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    invoke-interface {p1, p0}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic y(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->C1(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Ljava/lang/Throwable;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y0(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->L3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final y2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;Lym/r$c;)Lkotlin/Unit;
    .locals 12

    const-string v0, "$this$action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_1
    move-object v1, v0

    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;

    move-object v2, v1

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;->w()Ljava/util/List;

    move-result-object v1

    move-object v3, v2

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;->A()Ljava/lang/String;

    move-result-object v2

    move-object v4, v3

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v3

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;->t()J

    move-result-wide v4

    const/4 v6, 0x1

    invoke-static {p1, v6}, Lcom/withpersona/sdk2/inquiry/selfie/p;->k(Lym/r$c;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v6

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v7

    const/16 v10, 0xc0

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v0 .. v11}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;-><init>(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$b;ILcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v0}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final y3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;Lcom/withpersona/sdk2/camera/CameraProperties;JLym/r$c;)Lkotlin/Unit;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p6

    const-string v2, "$this$action"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->b4(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lmn/a;

    move-result-object v2

    sget-object v3, Lmn/a;->a:Lmn/a;

    const/4 v4, 0x0

    if-ne v2, v3, :cond_0

    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->n:Lcom/withpersona/sdk2/inquiry/selfie/g;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/g;->k()V

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;->g()Ljava/util/List;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->P()Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;->g()Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v4}, Lcom/withpersona/sdk2/inquiry/selfie/p;->k(Lym/r$c;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->E()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;

    move-result-object v12

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v14

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;->s()Z

    move-result v15

    new-instance v5, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;

    const/4 v13, 0x1

    move-object/from16 v7, p3

    move-wide/from16 v8, p4

    invoke-direct/range {v5 .. v15}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;ZLcom/withpersona/sdk2/camera/CameraProperties$b;Z)V

    invoke-virtual {v1, v5}, Lym/r$c;->e(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    iget-object v0, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->n:Lcom/withpersona/sdk2/inquiry/selfie/g;

    invoke-virtual {v1}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    invoke-virtual {v0, v2}, Lcom/withpersona/sdk2/inquiry/selfie/g;->b(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;)V

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;->g()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;->f()Lkn/a;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->O()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v10

    invoke-static {v1, v4}, Lcom/withpersona/sdk2/inquiry/selfie/p;->k(Lym/r$c;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v11

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v12

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;->s()Z

    move-result v13

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;->g()Ljava/util/List;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->E()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;

    move-result-object v15

    new-instance v6, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;

    const/16 v16, 0x1

    move-object/from16 v7, p3

    move-wide/from16 v8, p4

    invoke-direct/range {v6 .. v16}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;-><init>(Lcom/withpersona/sdk2/camera/CameraProperties;JLjava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZLjava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Z)V

    goto :goto_0

    :cond_1
    sget-object v2, Lkn/a;->a:Lkn/a;

    if-ne v0, v2, :cond_2

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;->g()Ljava/util/List;

    move-result-object v11

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v13

    invoke-static {v1, v4}, Lcom/withpersona/sdk2/inquiry/selfie/p;->k(Lym/r$c;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v19

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->E()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;

    move-result-object v20

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v21

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;->s()Z

    move-result v22

    new-instance v6, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;

    const/16 v24, 0xa3

    const/16 v25, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v23, 0x0

    move-object/from16 v18, p3

    move-wide/from16 v16, p4

    invoke-direct/range {v6 .. v25}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;-><init>(ZLkn/b;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Ljava/util/List;Ljava/util/List;JZJLcom/withpersona/sdk2/camera/CameraProperties;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_2
    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;->g()Ljava/util/List;

    move-result-object v8

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v7

    invoke-static {v1, v4}, Lcom/withpersona/sdk2/inquiry/selfie/p;->k(Lym/r$c;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->E()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;

    move-result-object v14

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v15

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;->s()Z

    move-result v16

    new-instance v6, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;

    const/4 v9, 0x1

    move-object/from16 v10, p3

    move-wide/from16 v11, p4

    invoke-direct/range {v6 .. v16}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;-><init>(Ljava/util/List;Ljava/util/List;ZLcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lcom/withpersona/sdk2/camera/CameraProperties$b;Z)V

    :goto_0
    invoke-virtual {v1, v6}, Lym/r$c;->e(Ljava/lang/Object;)V

    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static synthetic z(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->l2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z0(Lcom/withpersona/sdk2/inquiry/selfie/e$c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lym/k$a;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->M1(Lcom/withpersona/sdk2/inquiry/selfie/e$c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lym/k$a;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final z2(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;)Lkotlin/Unit;
    .locals 1

    invoke-virtual {p0}, Lym/k$a;->d()Lym/h;

    move-result-object p0

    new-instance v0, Lyp/e4;

    invoke-direct {v0, p2, p3}, Lyp/e4;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;)V

    const/4 p2, 0x1

    const/4 p3, 0x0

    invoke-static {p1, p3, v0, p2, p3}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final z3(Lym/k$a;Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1}, Lcom/withpersona/sdk2/inquiry/selfie/p;->n(Lym/k$a;ZILjava/lang/Object;)Lkotlin/jvm/functions/Function1;

    move-result-object p0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final B3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;
    .locals 33
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;)",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->c:Ltr/b$a;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->P()Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;

    move-result-object v4

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;->g()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ltr/b$a;->a(Ljava/lang/String;)Ltr/b;

    move-result-object v3

    new-instance v4, Lyp/z3;

    move-object/from16 v5, p2

    invoke-direct {v4, v0, v5, v1, v2}, Lyp/z3;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/k$a;)V

    const-class v6, Ltr/b;

    invoke-static {v6}, Lkotlin/jvm/internal/d0;->k(Ljava/lang/Class;)Lhu/m;

    move-result-object v6

    const-string v7, ""

    invoke-static {v2, v3, v6, v7, v4}, Lym/w;->l(Lym/a;Lym/o;Lhu/m;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->i()Ljava/lang/String;

    move-result-object v4

    new-instance v8, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$i;

    sget-object v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->P()Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;

    move-result-object v6

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;->a()J

    move-result-wide v6

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->J()Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;

    move-result-object v9

    sget-object v10, Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    const/4 v10, 0x1

    xor-int/2addr v9, v10

    invoke-direct {v8, v3, v6, v7, v9}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$i;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;JZ)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->I()Z

    move-result v3

    iget-object v6, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->j:Luq/a;

    invoke-virtual {v6}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v11

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static {v2, v6, v10, v7}, Lcom/withpersona/sdk2/inquiry/selfie/p;->n(Lym/k$a;ZILjava/lang/Object;)Lkotlin/jvm/functions/Function1;

    move-result-object v14

    invoke-virtual/range {p0 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->b4(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lmn/a;

    move-result-object v16

    iget-object v6, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/selfie/p;->C(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;

    move-result-object v9

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->P()Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;

    move-result-object v7

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;->f()Z

    move-result v18

    iget-object v7, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->g:Lcom/withpersona/sdk2/camera/e$a;

    iget-object v10, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->h:Lhn/c$a;

    move-object/from16 v20, v10

    move v10, v3

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;->j()Lkn/a;

    move-result-object v3

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v23

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;->s()Z

    move-result v24

    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->p:Lgo/e;

    sget-object v12, Lgo/a;->a:Lgo/a;

    invoke-virtual {v5, v12}, Lgo/e;->a(Lgo/d;)Z

    move-result v25

    new-instance v12, Lyp/k4;

    invoke-direct {v12, v2, v0}, Lyp/k4;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)V

    new-instance v13, Lyp/v4;

    invoke-direct {v13, v0, v2}, Lyp/v4;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)V

    new-instance v15, Lyp/a1;

    invoke-direct {v15, v0, v2, v1}, Lyp/a1;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)V

    const/high16 v31, 0x3c000000    # 0.0078125f

    const/16 v32, 0x0

    const/4 v5, 0x0

    move-object/from16 v17, v6

    const/4 v6, 0x0

    move-object/from16 v19, v7

    const/4 v7, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-static/range {v1 .. v32}, Lcom/withpersona/sdk2/inquiry/selfie/o;->n(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/k$a;Lkn/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;ZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lmn/a;Lur/a;ZLcom/withpersona/sdk2/camera/e$a;Lhn/c$a;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZZZZZZZILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;

    move-result-object v1

    return-object v1
.end method

.method public final D2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;)",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->r()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->n()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->h0()Ljava/lang/String;

    move-result-object v7

    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->j:Luq/a;

    invoke-virtual {v2}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->J()Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;

    move-result-object v2

    sget-object v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$CenterOnly;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$CenterOnly;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/4 v8, 0x0

    if-eqz v3, :cond_1

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->a()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;->getPromptPage()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$PromptPage;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$PromptPage;->getSelfieCenterPictograph()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    move-result-object v8

    :cond_0
    :goto_0
    move-object v9, v8

    goto :goto_2

    :cond_1
    sget-object v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ThreePhotos;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ThreePhotos;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    sget-object v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    new-instance v1, Ljt/l;

    invoke-direct {v1}, Ljt/l;-><init>()V

    throw v1

    :cond_3
    :goto_1
    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->a()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;->getPromptPage()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$PromptPage;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$PromptPage;->getSelfiePictograph()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    move-result-object v8

    goto :goto_0

    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->N()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->J()Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->A()Ljava/util/List;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->s()Ljava/lang/String;

    move-result-object v13

    new-instance v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;

    new-instance v15, Lyp/j2;

    move-object/from16 v2, p1

    move-object/from16 v14, p2

    invoke-direct {v15, v1, v0, v2, v14}, Lyp/j2;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;)V

    new-instance v2, Lyp/k2;

    invoke-direct {v2, v1, v0}, Lyp/k2;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)V

    new-instance v14, Lyp/l2;

    invoke-direct {v14, v0, v1}, Lyp/l2;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)V

    new-instance v18, Lyp/m2;

    invoke-direct/range {v18 .. v18}, Lyp/m2;-><init>()V

    move-object/from16 v17, v14

    const/4 v14, 0x0

    move-object/from16 v16, v2

    invoke-direct/range {v3 .. v18}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    return-object v3
.end method

.method public final J2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;)",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;->j()Lkn/a;

    move-result-object v3

    sget-object v4, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$d;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v4, v3

    const/4 v4, 0x5

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eq v3, v8, :cond_4

    if-eq v3, v7, :cond_3

    if-eq v3, v6, :cond_2

    if-eq v3, v5, :cond_1

    if-eq v3, v4, :cond_0

    new-instance v1, Ljt/l;

    invoke-direct {v1}, Ljt/l;-><init>()V

    throw v1

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Pose hint cannot be shown for center pose"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    sget-object v3, Lyp/x;->e:Lyp/x;

    goto :goto_0

    :cond_2
    sget-object v3, Lyp/x;->d:Lyp/x;

    goto :goto_0

    :cond_3
    sget-object v3, Lyp/x;->c:Lyp/x;

    goto :goto_0

    :cond_4
    sget-object v3, Lyp/x;->b:Lyp/x;

    :goto_0
    sget-object v9, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$d;->b:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    aget v10, v9, v10

    if-eq v10, v8, :cond_9

    if-eq v10, v7, :cond_8

    if-eq v10, v6, :cond_7

    if-eq v10, v5, :cond_6

    if-ne v10, v4, :cond_5

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v10

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->O()Ljava/lang/String;

    move-result-object v10

    goto :goto_1

    :cond_5
    new-instance v1, Ljt/l;

    invoke-direct {v1}, Ljt/l;-><init>()V

    throw v1

    :cond_6
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v10

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->U()Ljava/lang/String;

    move-result-object v10

    goto :goto_1

    :cond_7
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v10

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->S()Ljava/lang/String;

    move-result-object v10

    goto :goto_1

    :cond_8
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v10

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->Q()Ljava/lang/String;

    move-result-object v10

    goto :goto_1

    :cond_9
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v10

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->b0()Ljava/lang/String;

    move-result-object v10

    :goto_1
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v11

    invoke-virtual {v11}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->i()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v9, v3

    if-eq v3, v8, :cond_e

    if-eq v3, v7, :cond_d

    if-eq v3, v6, :cond_c

    if-eq v3, v5, :cond_b

    if-ne v3, v4, :cond_a

    sget-object v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;->m:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    goto :goto_2

    :cond_a
    new-instance v1, Ljt/l;

    invoke-direct {v1}, Ljt/l;-><init>()V

    throw v1

    :cond_b
    sget-object v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;->j:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    goto :goto_2

    :cond_c
    sget-object v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;->g:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    goto :goto_2

    :cond_d
    sget-object v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;->d:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    goto :goto_2

    :cond_e
    sget-object v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    :goto_2
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->J()Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;

    move-result-object v4

    sget-object v5, Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    xor-int/2addr v4, v8

    new-instance v5, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$f;

    new-instance v6, Lyp/i1;

    move-object/from16 v7, p2

    invoke-direct {v6, v2, v0, v7, v1}, Lyp/i1;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)V

    invoke-direct {v5, v6, v3, v4}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$f;-><init>(Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;Z)V

    move-object v3, v5

    move-object v5, v10

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->I()Z

    move-result v10

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->j:Luq/a;

    invoke-virtual {v4}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v4

    const/4 v6, 0x0

    const/4 v9, 0x0

    invoke-static {v2, v6, v8, v9}, Lcom/withpersona/sdk2/inquiry/selfie/p;->n(Lym/k$a;ZILjava/lang/Object;)Lkotlin/jvm/functions/Function1;

    move-result-object v14

    invoke-virtual/range {p0 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->b4(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lmn/a;

    move-result-object v16

    iget-object v6, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/selfie/p;->C(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;

    move-result-object v9

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->P()Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;

    move-result-object v8

    invoke-virtual {v8}, Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;->f()Z

    move-result v18

    iget-object v8, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->g:Lcom/withpersona/sdk2/camera/e$a;

    iget-object v12, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->h:Lhn/c$a;

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;->f()Z

    move-result v7

    move-object/from16 v19, v8

    move-object v8, v3

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;->j()Lkn/a;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v23

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;->s()Z

    move-result v24

    iget-object v13, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->p:Lgo/e;

    sget-object v15, Lgo/a;->a:Lgo/a;

    invoke-virtual {v13, v15}, Lgo/e;->a(Lgo/d;)Z

    move-result v25

    move-object/from16 v20, v12

    new-instance v12, Lyp/j1;

    invoke-direct {v12, v2, v0}, Lyp/j1;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)V

    new-instance v13, Lyp/k1;

    invoke-direct {v13, v0, v2}, Lyp/k1;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)V

    new-instance v15, Lyp/m1;

    invoke-direct {v15, v0, v2, v1}, Lyp/m1;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)V

    const/high16 v31, 0x3c000000    # 0.0078125f

    const/16 v32, 0x0

    move-object/from16 v17, v6

    const/4 v6, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    move-object/from16 v33, v11

    move-object v11, v4

    move-object/from16 v4, v33

    invoke-static/range {v1 .. v32}, Lcom/withpersona/sdk2/inquiry/selfie/o;->n(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/k$a;Lkn/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;ZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lmn/a;Lur/a;ZLcom/withpersona/sdk2/camera/e$a;Lhn/c$a;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZZZZZZZILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;

    move-result-object v1

    return-object v1
.end method

.method public final K1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;
    .locals 33
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;)",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;"
        }
    .end annotation

    move-object/from16 v4, p0

    move-object/from16 v5, p2

    move-object/from16 v2, p3

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;->D()Ljava/lang/Long;

    move-result-object v0

    const/4 v6, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;->D()Ljava/lang/Long;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "per_pose_capture_timeout_"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$h;

    invoke-direct {v1, v5, v4, v2, v6}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$h;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lnt/b;)V

    invoke-virtual {v2, v0, v1}, Lym/k$a;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    :cond_0
    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;->p()Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;->f()Lkn/a;

    move-result-object v0

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;->s()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;->E()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;

    move-result-object v3

    sget-object v7, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;

    if-ne v3, v7, :cond_1

    sget-object v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;

    :goto_0
    move-object v7, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;->E()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;

    move-result-object v3

    goto :goto_0

    :cond_2
    sget-object v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;

    goto :goto_0

    :goto_1
    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;->k()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;->g()Z

    move-result v3

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eqz v3, :cond_5

    iget-object v3, v4, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->d:Lcom/withpersona/sdk2/inquiry/selfie/e$b;

    iget-object v10, v4, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->n:Lcom/withpersona/sdk2/inquiry/selfie/g;

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;->p()Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;

    move-result-object v11

    sget-object v12, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;

    if-eq v7, v12, :cond_4

    sget-object v12, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;->d:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;

    if-ne v7, v12, :cond_3

    goto :goto_2

    :cond_3
    move v12, v8

    goto :goto_3

    :cond_4
    :goto_2
    move v12, v9

    :goto_3
    invoke-interface {v3, v10, v11, v12}, Lcom/withpersona/sdk2/inquiry/selfie/e$b;->a(Lcom/withpersona/sdk2/inquiry/selfie/g;Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;Z)Lcom/withpersona/sdk2/inquiry/selfie/e;

    move-result-object v3

    new-instance v10, Lyp/n2;

    invoke-direct {v10, v4, v5, v2}, Lyp/n2;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lym/k$a;)V

    const-class v11, Lcom/withpersona/sdk2/inquiry/selfie/e;

    invoke-static {v11}, Lkotlin/jvm/internal/d0;->k(Ljava/lang/Class;)Lhu/m;

    move-result-object v11

    const-string v12, ""

    invoke-static {v2, v3, v11, v12, v10}, Lym/w;->l(Lym/a;Lym/o;Lhu/m;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    :cond_5
    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;->I()Lkn/b;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v10

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;->j()Lkn/a;

    move-result-object v11

    invoke-static {v3, v10, v11}, Lcom/withpersona/sdk2/inquiry/selfie/n;->b(Lkn/b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;Lkn/a;)Ljava/lang/String;

    move-result-object v3

    move-object v10, v3

    goto :goto_4

    :cond_6
    move-object v10, v6

    :goto_4
    sget-object v3, Lkn/a;->b:Lkn/a;

    if-ne v0, v3, :cond_7

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->Q()Ljava/lang/String;

    move-result-object v3

    :goto_5
    move-object v11, v3

    goto :goto_6

    :cond_7
    sget-object v3, Lkn/a;->c:Lkn/a;

    if-ne v0, v3, :cond_8

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->S()Ljava/lang/String;

    move-result-object v3

    goto :goto_5

    :cond_8
    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;->I()Lkn/b;

    move-result-object v3

    if-eqz v3, :cond_9

    move-object v11, v10

    goto :goto_6

    :cond_9
    sget-object v3, Lkn/a;->a:Lkn/a;

    if-ne v0, v3, :cond_a

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->G()Ljava/lang/String;

    move-result-object v3

    goto :goto_5

    :cond_a
    move-object v11, v6

    :goto_6
    sget-object v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$d;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v12

    aget v3, v3, v12

    if-eq v3, v9, :cond_f

    const/4 v12, 0x2

    if-eq v3, v12, :cond_e

    const/4 v12, 0x3

    if-eq v3, v12, :cond_d

    const/4 v12, 0x4

    if-eq v3, v12, :cond_c

    const/4 v12, 0x5

    if-ne v3, v12, :cond_b

    sget-object v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    :goto_7
    move-object/from16 v16, v3

    goto :goto_8

    :cond_b
    new-instance v0, Ljt/l;

    invoke-direct {v0}, Ljt/l;-><init>()V

    throw v0

    :cond_c
    sget-object v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;->n:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    goto :goto_7

    :cond_d
    sget-object v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;->k:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    goto :goto_7

    :cond_e
    sget-object v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;->h:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    goto :goto_7

    :cond_f
    sget-object v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;->e:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    goto :goto_7

    :goto_8
    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;->o()Z

    move-result v3

    if-eqz v3, :cond_10

    sget-object v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;->c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;

    if-eq v7, v3, :cond_10

    sget-object v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;->d:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;

    if-eq v7, v3, :cond_10

    new-instance v12, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$d;

    new-instance v13, Lyp/o2;

    move-object v3, v2

    move-object v2, v0

    move-object v0, v13

    invoke-direct/range {v0 .. v5}, Lyp/o2;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;Lkn/a;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;)V

    move-object v2, v3

    move-object v0, v4

    new-instance v14, Lyp/p2;

    invoke-direct {v14, v0, v2}, Lyp/p2;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)V

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->J()Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;

    move-result-object v1

    sget-object v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v17, v1, 0x1

    const/16 v19, 0x4

    const/16 v20, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v12 .. v20}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$d;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_9

    :cond_10
    move-object v0, v4

    move-object/from16 v3, v16

    new-instance v12, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$a;

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->J()Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;

    move-result-object v1

    sget-object v4, Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/2addr v1, v9

    invoke-direct {v12, v3, v1, v8}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$a;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;ZZ)V

    :goto_9
    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;->o()Z

    move-result v1

    if-nez v1, :cond_11

    invoke-virtual {v0, v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->V3(Lym/k$a;)V

    :cond_11
    sget-object v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;->c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;

    if-ne v7, v1, :cond_12

    new-instance v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$i;

    invoke-direct {v3, v2, v0, v6}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$i;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lnt/b;)V

    const-string v4, "wait_to_capture_with_flash_on"

    invoke-virtual {v2, v4, v3}, Lym/k$a;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    :cond_12
    sget-object v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;->d:Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;

    if-ne v7, v3, :cond_13

    new-instance v4, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$j;

    invoke-direct {v4, v2, v0, v6}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$j;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lnt/b;)V

    const-string v5, "turn_off_flash"

    invoke-virtual {v2, v5, v4}, Lym/k$a;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    :cond_13
    invoke-virtual/range {p0 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->b4(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lmn/a;

    move-result-object v16

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v4

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->i()Ljava/lang/String;

    move-result-object v4

    move-object v5, v10

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->I()Z

    move-result v10

    iget-object v7, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->j:Luq/a;

    invoke-virtual {v7}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v7

    invoke-static {v2, v8, v9, v6}, Lcom/withpersona/sdk2/inquiry/selfie/p;->n(Lym/k$a;ZILjava/lang/Object;)Lkotlin/jvm/functions/Function1;

    move-result-object v14

    iget-object v6, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    move v13, v9

    invoke-static/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/p;->C(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->P()Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;

    move-result-object v15

    invoke-virtual {v15}, Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;->f()Z

    move-result v18

    iget-object v15, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->g:Lcom/withpersona/sdk2/camera/e$a;

    iget-object v8, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->h:Lhn/c$a;

    move-object/from16 v17, v6

    const/16 v19, 0x0

    move-object v6, v5

    move-object v5, v11

    move-object v11, v7

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;->f()Z

    move-result v7

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;->j()Lkn/a;

    move-result-object v20

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;->G()F

    move-result v21

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;->C()Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;

    move-result-object v22

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v23

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;->s()Z

    move-result v24

    iget-object v13, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->p:Lgo/e;

    move-object/from16 v26, v4

    sget-object v4, Lgo/a;->a:Lgo/a;

    invoke-virtual {v13, v4}, Lgo/e;->a(Lgo/d;)Z

    move-result v4

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;->E()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;

    move-result-object v13

    if-eq v13, v1, :cond_15

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;->E()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;

    move-result-object v1

    if-ne v1, v3, :cond_14

    goto :goto_a

    :cond_14
    move/from16 v27, v19

    goto :goto_b

    :cond_15
    :goto_a
    const/16 v27, 0x1

    :goto_b
    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;->J()Z

    move-result v1

    invoke-virtual/range {p0 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->b4(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lmn/a;

    move-result-object v3

    sget-object v13, Lmn/a;->b:Lmn/a;

    if-ne v3, v13, :cond_16

    const/16 v29, 0x1

    :goto_c
    move-object/from16 v3, v20

    move-object/from16 v20, v8

    move-object v8, v12

    goto :goto_d

    :cond_16
    move/from16 v29, v19

    goto :goto_c

    :goto_d
    new-instance v12, Lyp/q2;

    invoke-direct {v12, v2, v0}, Lyp/q2;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)V

    new-instance v13, Lyp/r2;

    invoke-direct {v13, v0, v2}, Lyp/r2;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)V

    move-object/from16 v19, v15

    new-instance v15, Lyp/t2;

    move/from16 p2, v1

    move-object/from16 v1, p1

    invoke-direct {v15, v0, v2, v1}, Lyp/t2;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)V

    const/high16 v31, 0x8000000

    const/16 v32, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    move/from16 v25, v4

    move-object/from16 v4, v26

    move/from16 v26, p2

    invoke-static/range {v1 .. v32}, Lcom/withpersona/sdk2/inquiry/selfie/o;->n(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/k$a;Lkn/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;ZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lmn/a;Lur/a;ZLcom/withpersona/sdk2/camera/e$a;Lhn/c$a;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZZZZZZZILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;

    move-result-object v1

    return-object v1
.end method

.method public final P2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;)",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;"
        }
    .end annotation

    move-object/from16 v4, p0

    move-object/from16 v6, p1

    move-object/from16 v5, p2

    move-object/from16 v2, p3

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;->k()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;->g()Z

    move-result v0

    const/4 v7, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v4, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->d:Lcom/withpersona/sdk2/inquiry/selfie/e$b;

    iget-object v1, v4, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->n:Lcom/withpersona/sdk2/inquiry/selfie/g;

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;->p()Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;

    move-result-object v3

    invoke-interface {v0, v1, v3, v7}, Lcom/withpersona/sdk2/inquiry/selfie/e$b;->a(Lcom/withpersona/sdk2/inquiry/selfie/g;Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;Z)Lcom/withpersona/sdk2/inquiry/selfie/e;

    move-result-object v0

    new-instance v1, Lyp/n1;

    invoke-direct {v1, v4, v5, v6, v2}, Lyp/n1;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/k$a;)V

    const-class v3, Lcom/withpersona/sdk2/inquiry/selfie/e;

    invoke-static {v3}, Lkotlin/jvm/internal/d0;->k(Ljava/lang/Class;)Lhu/m;

    move-result-object v3

    const-string v8, ""

    invoke-static {v2, v0, v3, v8, v1}, Lym/w;->l(Lym/a;Lym/o;Lhu/m;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    :cond_0
    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;->p()Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;->f()Lkn/a;

    move-result-object v0

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;->o()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v4, v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->V3(Lym/k$a;)V

    :cond_1
    sget-object v8, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$d;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aget v8, v8, v9

    const/4 v9, 0x1

    if-eq v8, v9, :cond_6

    const/4 v10, 0x2

    if-eq v8, v10, :cond_5

    const/4 v10, 0x3

    if-eq v8, v10, :cond_4

    const/4 v10, 0x4

    if-eq v8, v10, :cond_3

    const/4 v10, 0x5

    if-ne v8, v10, :cond_2

    sget-object v8, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    :goto_0
    move-object v14, v8

    goto :goto_1

    :cond_2
    new-instance v0, Ljt/l;

    invoke-direct {v0}, Ljt/l;-><init>()V

    throw v0

    :cond_3
    sget-object v8, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;->n:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    goto :goto_0

    :cond_4
    sget-object v8, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;->k:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    goto :goto_0

    :cond_5
    sget-object v8, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;->h:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    goto :goto_0

    :cond_6
    sget-object v8, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;->e:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    goto :goto_0

    :goto_1
    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;->E()Lkn/b;

    move-result-object v8

    const/4 v10, 0x0

    if-eqz v8, :cond_7

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v11

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;->j()Lkn/a;

    move-result-object v12

    invoke-static {v8, v11, v12}, Lcom/withpersona/sdk2/inquiry/selfie/n;->b(Lkn/b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;Lkn/a;)Ljava/lang/String;

    move-result-object v8

    goto :goto_2

    :cond_7
    move-object v8, v10

    :goto_2
    if-nez v8, :cond_8

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v11

    invoke-virtual {v11}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->d0()Ljava/lang/String;

    move-result-object v11

    move-object/from16 v19, v11

    goto :goto_3

    :cond_8
    move-object/from16 v19, v8

    :goto_3
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v11

    invoke-virtual {v11}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->i()Ljava/lang/String;

    move-result-object v20

    if-eqz v3, :cond_a

    invoke-virtual/range {p0 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->w1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Z

    move-result v3

    if-eqz v3, :cond_9

    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$e;

    new-instance v1, Lyp/o1;

    invoke-direct {v1, v2, v4, v5, v6}, Lyp/o1;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)V

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->J()Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;

    move-result-object v3

    sget-object v11, Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;

    invoke-static {v3, v11}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    xor-int/2addr v3, v9

    invoke-direct {v0, v1, v14, v3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$e;-><init>(Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;Z)V

    move-object v3, v0

    move-object v0, v4

    move-object v1, v10

    goto :goto_4

    :cond_9
    move-object v11, v10

    new-instance v10, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$d;

    move-object v2, v0

    new-instance v0, Lyp/p1;

    move-object/from16 v3, p3

    invoke-direct/range {v0 .. v5}, Lyp/p1;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;Lkn/a;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;)V

    move-object v2, v3

    move-object v1, v11

    move-object v11, v0

    move-object v0, v4

    new-instance v12, Lyp/q1;

    invoke-direct {v12, v0, v2}, Lyp/q1;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)V

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->J()Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;

    move-result-object v3

    sget-object v4, Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    xor-int/lit8 v15, v3, 0x1

    const/16 v17, 0x4

    const/16 v18, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v10 .. v18}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$d;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v3, v10

    goto :goto_4

    :cond_a
    move-object v0, v4

    move-object v1, v10

    new-instance v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$a;

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->J()Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;

    move-result-object v4

    sget-object v5, Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    xor-int/2addr v4, v9

    invoke-direct {v3, v14, v4, v7}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$a;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;ZZ)V

    :goto_4
    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->I()Z

    move-result v10

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->j:Luq/a;

    invoke-virtual {v4}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v11

    invoke-static {v2, v7, v9, v1}, Lcom/withpersona/sdk2/inquiry/selfie/p;->n(Lym/k$a;ZILjava/lang/Object;)Lkotlin/jvm/functions/Function1;

    move-result-object v14

    invoke-virtual/range {p0 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->b4(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lmn/a;

    move-result-object v16

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    invoke-static {v6}, Lcom/withpersona/sdk2/inquiry/selfie/p;->C(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;

    move-result-object v9

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->P()Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;

    move-result-object v4

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;->f()Z

    move-result v18

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->g:Lcom/withpersona/sdk2/camera/e$a;

    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->h:Lhn/c$a;

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;->f()Z

    move-result v7

    move-object v12, v8

    move-object v8, v3

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;->j()Lkn/a;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;->D()F

    move-result v21

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;->C()Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;

    move-result-object v22

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v23

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;->s()Z

    move-result v24

    iget-object v13, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->p:Lgo/e;

    sget-object v15, Lgo/a;->a:Lgo/a;

    invoke-virtual {v13, v15}, Lgo/e;->a(Lgo/d;)Z

    move-result v25

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;->G()Z

    move-result v26

    move-object v13, v12

    new-instance v12, Lyp/r1;

    invoke-direct {v12, v2, v0}, Lyp/r1;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)V

    move-object v15, v13

    new-instance v13, Lyp/s1;

    invoke-direct {v13, v0, v2}, Lyp/s1;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)V

    move-object/from16 v17, v15

    new-instance v15, Lyp/t1;

    invoke-direct {v15, v0, v2, v6}, Lyp/t1;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)V

    const/high16 v31, 0x3c000000    # 0.0078125f

    const/16 v32, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    move-object/from16 v33, v17

    move-object/from16 v17, v1

    move-object v1, v6

    move-object/from16 v6, v33

    move-object/from16 v33, v19

    move-object/from16 v19, v4

    move-object/from16 v4, v20

    move-object/from16 v20, v5

    move-object/from16 v5, v33

    invoke-static/range {v1 .. v32}, Lcom/withpersona/sdk2/inquiry/selfie/o;->n(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/k$a;Lkn/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;ZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lmn/a;Lur/a;ZLcom/withpersona/sdk2/camera/e$a;Lhn/c$a;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZZZZZZZILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;

    move-result-object v1

    return-object v1
.end method

.method public final P3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;
    .locals 33
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;)",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v2, p3

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->i()Ljava/lang/String;

    move-result-object v4

    sget-object v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;->r:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->J()Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;

    move-result-object v3

    sget-object v5, Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;

    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const/4 v5, 0x1

    xor-int/2addr v3, v5

    new-instance v8, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$h;

    new-instance v6, Lyp/u2;

    move-object/from16 v7, p2

    invoke-direct {v6, v2, v0, v7}, Lyp/u2;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;)V

    const/4 v9, 0x0

    invoke-direct {v8, v6, v9, v1, v3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$h;-><init>(Lkotlin/jvm/functions/Function0;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;Z)V

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->I()Z

    move-result v10

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->j:Luq/a;

    invoke-virtual {v1}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v11

    const/4 v1, 0x0

    invoke-static {v2, v9, v5, v1}, Lcom/withpersona/sdk2/inquiry/selfie/p;->n(Lym/k$a;ZILjava/lang/Object;)Lkotlin/jvm/functions/Function1;

    move-result-object v14

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    invoke-virtual/range {p0 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->b4(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lmn/a;

    move-result-object v16

    invoke-static/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/p;->C(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->P()Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;->f()Z

    move-result v18

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->g:Lcom/withpersona/sdk2/camera/e$a;

    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->h:Lhn/c$a;

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v23

    iget-object v6, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->p:Lgo/e;

    sget-object v7, Lgo/a;->a:Lgo/a;

    invoke-virtual {v6, v7}, Lgo/e;->a(Lgo/d;)Z

    move-result v25

    new-instance v12, Lyp/v2;

    invoke-direct {v12, v2, v0}, Lyp/v2;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)V

    new-instance v13, Lyp/w2;

    invoke-direct {v13, v0, v2}, Lyp/w2;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)V

    new-instance v15, Lyp/x2;

    move-object/from16 v6, p1

    invoke-direct {v15, v0, v2, v6}, Lyp/x2;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)V

    const/high16 v31, 0x3c000000    # 0.0078125f

    const/16 v32, 0x0

    move-object/from16 v19, v3

    const/4 v3, 0x0

    move-object/from16 v20, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    move-object/from16 v17, v1

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v32}, Lcom/withpersona/sdk2/inquiry/selfie/o;->n(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/k$a;Lkn/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;ZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lmn/a;Lur/a;ZLcom/withpersona/sdk2/camera/e$a;Lhn/c$a;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZZZZZZZILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;

    move-result-object v1

    return-object v1
.end method

.method public final T1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;
    .locals 33
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;)",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v2, p3

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->i()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;->A()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v1

    instance-of v1, v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;

    const/4 v3, 0x1

    if-eqz v1, :cond_0

    sget-object v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;->q:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    goto :goto_0

    :cond_0
    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;->z()Lkn/a;

    move-result-object v1

    sget-object v5, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$d;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v5, v1

    if-eq v1, v3, :cond_5

    const/4 v5, 0x2

    if-eq v1, v5, :cond_4

    const/4 v5, 0x3

    if-eq v1, v5, :cond_3

    const/4 v5, 0x4

    if-eq v1, v5, :cond_2

    const/4 v5, 0x5

    if-ne v1, v5, :cond_1

    sget-object v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;->c:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    goto :goto_0

    :cond_1
    new-instance v1, Ljt/l;

    invoke-direct {v1}, Ljt/l;-><init>()V

    throw v1

    :cond_2
    sget-object v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;->o:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    goto :goto_0

    :cond_3
    sget-object v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;->l:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    goto :goto_0

    :cond_4
    sget-object v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;->i:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    goto :goto_0

    :cond_5
    sget-object v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;->f:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->J()Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;

    move-result-object v5

    sget-object v6, Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    xor-int/2addr v5, v3

    new-instance v8, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$h;

    new-instance v6, Lyp/a2;

    invoke-direct {v6, v2, v0}, Lyp/a2;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)V

    invoke-direct {v8, v6, v3, v1, v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$h;-><init>(Lkotlin/jvm/functions/Function0;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;Z)V

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->I()Z

    move-result v10

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->j:Luq/a;

    invoke-virtual {v1}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v11

    const/4 v1, 0x0

    const/4 v5, 0x0

    invoke-static {v2, v1, v3, v5}, Lcom/withpersona/sdk2/inquiry/selfie/p;->n(Lym/k$a;ZILjava/lang/Object;)Lkotlin/jvm/functions/Function1;

    move-result-object v14

    invoke-virtual/range {p0 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->b4(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lmn/a;

    move-result-object v16

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    invoke-static/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/p;->C(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->P()Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;->f()Z

    move-result v18

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->g:Lcom/withpersona/sdk2/camera/e$a;

    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->h:Lhn/c$a;

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v23

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;->C()Z

    move-result v24

    iget-object v6, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->p:Lgo/e;

    sget-object v7, Lgo/a;->a:Lgo/a;

    invoke-virtual {v6, v7}, Lgo/e;->a(Lgo/d;)Z

    move-result v25

    new-instance v12, Lyp/b2;

    invoke-direct {v12, v2, v0}, Lyp/b2;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)V

    new-instance v13, Lyp/c2;

    invoke-direct {v13, v0, v2}, Lyp/c2;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)V

    new-instance v15, Lyp/d2;

    move-object/from16 v6, p1

    invoke-direct {v15, v0, v2, v6}, Lyp/d2;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)V

    const/high16 v31, 0x3c000000    # 0.0078125f

    const/16 v32, 0x0

    move-object/from16 v19, v3

    const/4 v3, 0x0

    move-object/from16 v20, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    move-object/from16 v17, v1

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v32}, Lcom/withpersona/sdk2/inquiry/selfie/o;->n(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/k$a;Lkn/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;ZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lmn/a;Lur/a;ZLcom/withpersona/sdk2/camera/e$a;Lhn/c$a;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZZZZZZZILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;

    move-result-object v1

    return-object v1
.end method

.method public final V3(Lym/k$a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;)V"
        }
    .end annotation

    new-instance v0, Lkotlin/jvm/internal/y;

    invoke-direct {v0}, Lkotlin/jvm/internal/y;-><init>()V

    const/4 v1, 0x1

    iput-boolean v1, v0, Lkotlin/jvm/internal/y;->a:Z

    new-instance v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$m;

    const/4 v2, 0x0

    invoke-direct {v1, v0, p1, p0, v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$m;-><init>(Lkotlin/jvm/internal/y;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lnt/b;)V

    const-string v0, "check_if_manual_capture_enabled"

    invoke-virtual {p1, v0, v1}, Lym/k$a;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method public final W3(Lym/k$a;Ljava/lang/Throwable;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const-string v3, "ENOSPC"

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0, v3, v2, v1, v5}, Lkotlin/text/StringsKt;->a0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-ne v0, v4, :cond_0

    new-instance p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$c;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NoDiskSpaceErrorInfo;

    invoke-direct {v0, v5, v4, v5}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NoDiskSpaceErrorInfo;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p2, v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$c;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->X3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;)V

    return-void

    :cond_0
    instance-of v0, p2, Lg0/h1;

    const-string v6, "Unknown error. Type: "

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0, v3, v2, v1, v5}, Lkotlin/text/StringsKt;->a0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v0

    if-ne v0, v4, :cond_1

    new-instance p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$c;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NoDiskSpaceErrorInfo;

    invoke-direct {v0, v5, v4, v5}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NoDiskSpaceErrorInfo;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p2, v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$c;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->X3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;)V

    return-void

    :cond_1
    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$c;

    new-instance v1, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v1, p2}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$c;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->X3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;)V

    return-void

    :cond_2
    instance-of v0, p2, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorException;

    if-eqz v0, :cond_3

    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$c;

    check-cast p2, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorException;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorException;->getErrorInfo()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    move-result-object p2

    invoke-direct {v0, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$c;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->X3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;)V

    return-void

    :cond_3
    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$c;

    new-instance v1, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v1, p2}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$c;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->X3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;)V

    return-void
.end method

.method public final X3(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;",
            ")V"
        }
    .end annotation

    instance-of v0, p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$d;

    if-nez v0, :cond_0

    instance-of v0, p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$a;

    if-nez v0, :cond_0

    instance-of v0, p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$c;

    if-nez v0, :cond_0

    instance-of v0, p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lur/a;->d()V

    :cond_1
    invoke-virtual {p1}, Lym/k$a;->d()Lym/h;

    move-result-object p1

    new-instance v0, Lyp/d4;

    invoke-direct {v0, p2}, Lyp/d4;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;)V

    const/4 p2, 0x1

    const/4 v1, 0x0

    invoke-static {p0, v1, v0, p2, v1}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p2

    invoke-interface {p1, p2}, Lym/h;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public final Z1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;)",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;"
        }
    .end annotation

    move-object/from16 v3, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->k()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;->g()Z

    move-result v0

    const/4 v6, 0x0

    if-eqz v0, :cond_0

    iget-object v0, v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->d:Lcom/withpersona/sdk2/inquiry/selfie/e$b;

    iget-object v4, v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->n:Lcom/withpersona/sdk2/inquiry/selfie/g;

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->p()Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;

    move-result-object v5

    invoke-interface {v0, v4, v5, v6}, Lcom/withpersona/sdk2/inquiry/selfie/e$b;->a(Lcom/withpersona/sdk2/inquiry/selfie/g;Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;Z)Lcom/withpersona/sdk2/inquiry/selfie/e;

    move-result-object v0

    new-instance v4, Lyp/q3;

    move-object/from16 v5, p2

    invoke-direct {v4, v3, v2, v5, v1}, Lyp/q3;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)V

    const-class v7, Lcom/withpersona/sdk2/inquiry/selfie/e;

    invoke-static {v7}, Lkotlin/jvm/internal/d0;->k(Ljava/lang/Class;)Lhu/m;

    move-result-object v7

    const-string v8, ""

    invoke-static {v2, v0, v7, v8, v4}, Lym/w;->l(Lym/a;Lym/o;Lhu/m;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    :cond_0
    move-object/from16 v5, p2

    :goto_0
    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->D()I

    move-result v0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "countdown_"

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$k;

    const/4 v5, 0x0

    move-object/from16 v4, p2

    invoke-direct/range {v0 .. v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$k;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;Lnt/b;)V

    move-object/from16 v33, v3

    move-object v3, v0

    move-object/from16 v0, v33

    invoke-virtual {v2, v7, v3}, Lym/k$a;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->G()Lkn/b;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v5

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->j()Lkn/a;

    move-result-object v7

    invoke-static {v3, v5, v7}, Lcom/withpersona/sdk2/inquiry/selfie/n;->b(Lkn/b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;Lkn/a;)Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v4

    :goto_1
    if-nez v3, :cond_2

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v5

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->G()Ljava/lang/String;

    move-result-object v5

    goto :goto_2

    :cond_2
    move-object v5, v3

    :goto_2
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v7

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->i()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$b;

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->D()I

    move-result v9

    sget-object v10, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->J()Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;

    move-result-object v11

    sget-object v12, Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;

    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    const/4 v12, 0x1

    xor-int/2addr v11, v12

    invoke-direct {v8, v9, v10, v11}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$b;-><init>(ILcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;Z)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->I()Z

    move-result v10

    iget-object v9, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->j:Luq/a;

    invoke-virtual {v9}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v11

    invoke-static {v2, v6, v12, v4}, Lcom/withpersona/sdk2/inquiry/selfie/p;->n(Lym/k$a;ZILjava/lang/Object;)Lkotlin/jvm/functions/Function1;

    move-result-object v14

    invoke-virtual/range {p0 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->b4(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lmn/a;

    move-result-object v16

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/selfie/p;->C(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;

    move-result-object v9

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->P()Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;

    move-result-object v6

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;->f()Z

    move-result v18

    iget-object v6, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->g:Lcom/withpersona/sdk2/camera/e$a;

    iget-object v12, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->h:Lhn/c$a;

    move-object/from16 v17, v4

    move-object v4, v7

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->f()Z

    move-result v7

    move-object/from16 v19, v6

    move-object v6, v3

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->j()Lkn/a;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->E()F

    move-result v21

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->C()Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;

    move-result-object v22

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v23

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->s()Z

    move-result v24

    iget-object v13, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->p:Lgo/e;

    sget-object v15, Lgo/a;->a:Lgo/a;

    invoke-virtual {v13, v15}, Lgo/e;->a(Lgo/d;)Z

    move-result v25

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;->I()Z

    move-result v26

    move-object/from16 v20, v12

    new-instance v12, Lyp/r3;

    invoke-direct {v12, v2, v0}, Lyp/r3;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)V

    new-instance v13, Lyp/s3;

    invoke-direct {v13, v0, v2}, Lyp/s3;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)V

    new-instance v15, Lyp/t3;

    invoke-direct {v15, v0, v2, v1}, Lyp/t3;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)V

    const/high16 v31, 0x3c000000    # 0.0078125f

    const/16 v32, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-static/range {v1 .. v32}, Lcom/withpersona/sdk2/inquiry/selfie/o;->n(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/k$a;Lkn/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;ZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lmn/a;Lur/a;ZLcom/withpersona/sdk2/camera/e$a;Lhn/c$a;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZZZZZZZILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;

    move-result-object v1

    return-object v1
.end method

.method public final Z3(Lym/r$c;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lym/r<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;",
            ">.c;)V"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$c;

    new-instance v1, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$WebRtcIntegrationErrorInfo;

    const-string v2, "WebRTC is listed as the preferred or only capture method, but it has not been configured for this project."

    invoke-direct {v1, v2}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$WebRtcIntegrationErrorInfo;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$c;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-virtual {p1, v0}, Lym/r$c;->d(Ljava/lang/Object;)V

    return-void
.end method

.method public final a3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;
    .locals 33
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;)",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->k()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;->g()Z

    move-result v3

    const-string v4, ""

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->d:Lcom/withpersona/sdk2/inquiry/selfie/e$b;

    iget-object v6, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->n:Lcom/withpersona/sdk2/inquiry/selfie/g;

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->p()Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;

    move-result-object v7

    invoke-interface {v3, v6, v7, v5}, Lcom/withpersona/sdk2/inquiry/selfie/e$b;->a(Lcom/withpersona/sdk2/inquiry/selfie/g;Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;Z)Lcom/withpersona/sdk2/inquiry/selfie/e;

    move-result-object v3

    new-instance v6, Lyp/u1;

    move-object/from16 v7, p2

    invoke-direct {v6, v0, v2, v7, v1}, Lyp/u1;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)V

    const-class v8, Lcom/withpersona/sdk2/inquiry/selfie/e;

    invoke-static {v8}, Lkotlin/jvm/internal/d0;->k(Ljava/lang/Class;)Lhu/m;

    move-result-object v8

    invoke-static {v2, v3, v8, v4, v6}, Lym/w;->l(Lym/a;Lym/o;Lhu/m;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    :cond_0
    move-object/from16 v7, p2

    :goto_0
    sget-object v9, Lym/o;->a:Lym/o$a;

    const/4 v13, 0x2

    const/4 v14, 0x0

    const-wide/16 v10, 0x3e8

    const/4 v12, 0x0

    invoke-static/range {v9 .. v14}, Lym/o$a;->b(Lym/o$a;JLjava/lang/String;ILjava/lang/Object;)Lym/o;

    move-result-object v3

    new-instance v6, Lyp/v1;

    invoke-direct {v6, v0, v1}, Lyp/v1;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)V

    sget-object v8, Lkotlin/reflect/KTypeProjection;->c:Lkotlin/reflect/KTypeProjection$a;

    const-class v9, Lkotlin/Unit;

    invoke-static {v9}, Lkotlin/jvm/internal/d0;->k(Ljava/lang/Class;)Lhu/m;

    move-result-object v9

    invoke-virtual {v8, v9}, Lkotlin/reflect/KTypeProjection$a;->a(Lhu/m;)Lkotlin/reflect/KTypeProjection;

    move-result-object v8

    const-class v9, Lym/o;

    invoke-static {v9, v8}, Lkotlin/jvm/internal/d0;->l(Ljava/lang/Class;Lkotlin/reflect/KTypeProjection;)Lhu/m;

    move-result-object v8

    invoke-static {v2, v3, v8, v4, v6}, Lym/w;->l(Lym/a;Lym/o;Lhu/m;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->i()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->N()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v6

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->N()Ljava/lang/String;

    move-result-object v6

    new-instance v8, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$a;

    sget-object v9, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->J()Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;

    move-result-object v10

    sget-object v11, Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    const/4 v11, 0x1

    xor-int/2addr v10, v11

    invoke-direct {v8, v9, v10, v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$a;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;ZZ)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->I()Z

    move-result v10

    iget-object v9, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->j:Luq/a;

    invoke-virtual {v9}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v9

    invoke-static {v2, v5, v11, v12}, Lcom/withpersona/sdk2/inquiry/selfie/p;->n(Lym/k$a;ZILjava/lang/Object;)Lkotlin/jvm/functions/Function1;

    move-result-object v14

    invoke-virtual/range {p0 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->b4(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lmn/a;

    move-result-object v16

    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    move-object v11, v9

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/selfie/p;->C(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;

    move-result-object v9

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->P()Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;

    move-result-object v12

    invoke-virtual {v12}, Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;->f()Z

    move-result v18

    iget-object v12, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->g:Lcom/withpersona/sdk2/camera/e$a;

    iget-object v13, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->h:Lhn/c$a;

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->f()Z

    move-result v7

    move-object/from16 v17, v5

    move-object v5, v3

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->j()Lkn/a;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->D()F

    move-result v21

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->C()Lcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;

    move-result-object v22

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v23

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->s()Z

    move-result v24

    iget-object v15, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->p:Lgo/e;

    move-object/from16 v19, v3

    sget-object v3, Lgo/a;->a:Lgo/a;

    invoke-virtual {v15, v3}, Lgo/e;->a(Lgo/d;)Z

    move-result v25

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;->E()Z

    move-result v26

    move-object/from16 v3, v19

    move-object/from16 v19, v12

    new-instance v12, Lyp/x1;

    invoke-direct {v12, v2, v0}, Lyp/x1;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)V

    move-object/from16 v20, v13

    new-instance v13, Lyp/y1;

    invoke-direct {v13, v0, v2}, Lyp/y1;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)V

    new-instance v15, Lyp/z1;

    invoke-direct {v15, v0, v2, v1}, Lyp/z1;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)V

    const/high16 v31, 0x3c000000    # 0.0078125f

    const/16 v32, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-static/range {v1 .. v32}, Lcom/withpersona/sdk2/inquiry/selfie/o;->n(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/k$a;Lkn/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;ZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lmn/a;Lur/a;ZLcom/withpersona/sdk2/camera/e$a;Lhn/c$a;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZZZZZZZILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;

    move-result-object v1

    return-object v1
.end method

.method public a4(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;)Lym/i;
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lan/q;->a(Landroid/os/Parcelable;)Lym/i;

    move-result-object p1

    return-object p1
.end method

.method public final b4(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lmn/a;
    .locals 3

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->P()Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;

    move-result-object p1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lur/a;->c()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    if-eqz v2, :cond_1

    invoke-interface {v2}, Lur/a;->g()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    :cond_1
    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a:Landroid/content/Context;

    invoke-virtual {p1, v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;->k(Ljava/lang/Boolean;Ljava/lang/Boolean;Landroid/content/Context;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_2

    check-cast p1, Lmn/a;

    return-object p1

    :cond_2
    sget-object p1, Lmn/a;->c:Lmn/a;

    return-object p1
.end method

.method public final c4(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Z
    .locals 3

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->P()Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;

    move-result-object p1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lur/a;->c()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    if-eqz v2, :cond_1

    invoke-interface {v2}, Lur/a;->g()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    :cond_1
    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a:Landroid/content/Context;

    invoke-virtual {p1, v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;->i(Ljava/lang/Boolean;Ljava/lang/Boolean;Landroid/content/Context;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_2

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic d(Ljava/lang/Object;Lym/i;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->v1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/i;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f(Ljava/lang/Object;Ljava/lang/Object;Lym/k$a;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    check-cast p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->y1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lym/k$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final f2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;)",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;"
        }
    .end annotation

    move-object/from16 v4, p0

    move-object/from16 v2, p3

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;->p()Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;->f()Lkn/a;

    move-result-object v0

    sget-object v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$d;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v3, v3, v5

    const/4 v6, 0x1

    if-eq v3, v6, :cond_4

    const/4 v5, 0x2

    if-eq v3, v5, :cond_3

    const/4 v5, 0x3

    if-eq v3, v5, :cond_2

    const/4 v5, 0x4

    if-eq v3, v5, :cond_1

    const/4 v5, 0x5

    if-ne v3, v5, :cond_0

    sget-object v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;->b:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    :goto_0
    move-object v11, v3

    goto :goto_1

    :cond_0
    new-instance v0, Ljt/l;

    invoke-direct {v0}, Ljt/l;-><init>()V

    throw v0

    :cond_1
    sget-object v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;->n:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    goto :goto_0

    :cond_2
    sget-object v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;->k:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    goto :goto_0

    :cond_3
    sget-object v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;->h:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    goto :goto_0

    :cond_4
    sget-object v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;->e:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    goto :goto_0

    :goto_1
    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;->C()I

    move-result v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "countdown_to_manual_capture_"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v5, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$l;

    const/4 v14, 0x0

    invoke-direct {v5, v2, v4, v14}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$l;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lnt/b;)V

    invoke-virtual {v2, v3, v5}, Lym/k$a;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;->D()Lkn/b;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v5

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;->j()Lkn/a;

    move-result-object v7

    invoke-static {v3, v5, v7}, Lcom/withpersona/sdk2/inquiry/selfie/n;->b(Lkn/b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;Lkn/a;)Ljava/lang/String;

    move-result-object v3

    move-object v15, v3

    goto :goto_2

    :cond_5
    move-object v15, v14

    :goto_2
    if-nez v15, :cond_6

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->G()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v16, v3

    goto :goto_3

    :cond_6
    move-object/from16 v16, v15

    :goto_3
    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->i()Ljava/lang/String;

    move-result-object v17

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;->C()I

    move-result v3

    if-nez v3, :cond_7

    new-instance v7, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$d;

    new-instance v8, Lyp/d1;

    move-object/from16 v5, p2

    move-object v3, v2

    move-object v2, v0

    move-object v0, v8

    invoke-direct/range {v0 .. v5}, Lyp/d1;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;Lkn/a;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;)V

    move-object v2, v3

    move-object v0, v4

    new-instance v9, Lyp/e1;

    invoke-direct {v9, v0, v2}, Lyp/e1;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)V

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->J()Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;

    move-result-object v1

    sget-object v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    xor-int/lit8 v12, v1, 0x1

    const/4 v13, 0x0

    const/4 v10, 0x1

    invoke-direct/range {v7 .. v13}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$d;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;ZZ)V

    :goto_4
    move-object v8, v7

    goto :goto_5

    :cond_7
    move-object v0, v4

    new-instance v7, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$b;

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;->C()I

    move-result v1

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->J()Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;

    move-result-object v3

    sget-object v4, Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    xor-int/2addr v3, v6

    invoke-direct {v7, v1, v11, v3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$b;-><init>(ILcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;Z)V

    goto :goto_4

    :goto_5
    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->I()Z

    move-result v10

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->j:Luq/a;

    invoke-virtual {v1}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v11

    const/4 v1, 0x0

    invoke-static {v2, v1, v6, v14}, Lcom/withpersona/sdk2/inquiry/selfie/p;->n(Lym/k$a;ZILjava/lang/Object;)Lkotlin/jvm/functions/Function1;

    move-result-object v14

    move-object/from16 v5, v16

    invoke-virtual/range {p0 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->b4(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lmn/a;

    move-result-object v16

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    invoke-static/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/p;->C(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->P()Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;->f()Z

    move-result v18

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->g:Lcom/withpersona/sdk2/camera/e$a;

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->h:Lhn/c$a;

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;->f()Z

    move-result v7

    move-object/from16 v19, v3

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;->j()Lkn/a;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v23

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;->s()Z

    move-result v24

    iget-object v6, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->p:Lgo/e;

    sget-object v12, Lgo/a;->a:Lgo/a;

    invoke-virtual {v6, v12}, Lgo/e;->a(Lgo/d;)Z

    move-result v25

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;->E()Z

    move-result v26

    new-instance v12, Lyp/f1;

    invoke-direct {v12, v2, v0}, Lyp/f1;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)V

    new-instance v13, Lyp/g1;

    invoke-direct {v13, v0, v2}, Lyp/g1;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)V

    move-object v6, v15

    new-instance v15, Lyp/h1;

    move-object/from16 v20, v1

    move-object/from16 v1, p1

    invoke-direct {v15, v0, v2, v1}, Lyp/h1;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)V

    const/high16 v31, 0x3c000000    # 0.0078125f

    const/16 v32, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    move-object/from16 v33, v20

    move-object/from16 v20, v4

    move-object/from16 v4, v17

    move-object/from16 v17, v33

    invoke-static/range {v1 .. v32}, Lcom/withpersona/sdk2/inquiry/selfie/o;->n(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/k$a;Lkn/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;ZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lmn/a;Lur/a;ZLcom/withpersona/sdk2/camera/e$a;Lhn/c$a;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZZZZZZZILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;

    move-result-object v1

    return-object v1
.end method

.method public bridge synthetic g(Ljava/lang/Object;)Lym/i;
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a4(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;)Lym/i;

    move-result-object p1

    return-object p1
.end method

.method public final i3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;)",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->o()Lyp/a;

    move-result-object v2

    sget-object v3, Lyp/a;->c:Lyp/a;

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;->C()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    move-result-object v3

    const/4 v4, 0x0

    if-nez v3, :cond_2

    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->b:Lcq/b$a;

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->y()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->u()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->s()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->t()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;->w()Ljava/util/List;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->J()Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->p()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;->E()Ljava/lang/String;

    move-result-object v13

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v14

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;->t()J

    move-result-wide v15

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->q()Ljava/lang/String;

    move-result-object v17

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->r:Ldq/a;

    if-nez v3, :cond_1

    const-string v3, "selfiePoseManager"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->u(Ljava/lang/String;)V

    move-object/from16 v18, v4

    goto :goto_1

    :cond_1
    move-object/from16 v18, v3

    :goto_1
    invoke-interface/range {v5 .. v18}, Lcq/b$a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;JLjava/lang/String;Ldq/a;)Lcq/b;

    move-result-object v3

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;->D()I

    move-result v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "submit_"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lyp/e3;

    invoke-direct {v6, v0, v1, v2}, Lyp/e3;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Z)V

    const-class v2, Lcq/b;

    invoke-static {v2}, Lkotlin/jvm/internal/d0;->k(Ljava/lang/Class;)Lhu/m;

    move-result-object v2

    invoke-static {v1, v3, v2, v5, v6}, Lym/w;->l(Lym/a;Lym/o;Lhu/m;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    :cond_2
    iget-object v7, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->j:Luq/a;

    const/16 v12, 0xc

    const/4 v13, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v7 .. v13}, Luq/a;->d(Luq/a;ZZZZILjava/lang/Object;)V

    new-instance v14, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->q()Ljava/lang/String;

    move-result-object v15

    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->o:Lqq/c;

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->p()Ljava/lang/String;

    move-result-object v17

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->D()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;

    move-result-object v18

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->N()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;

    move-result-object v19

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->j:Luq/a;

    invoke-virtual {v3}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v20

    new-instance v3, Lyp/f3;

    invoke-direct {v3, v0, v1}, Lyp/f3;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)V

    new-instance v5, Lyp/g3;

    invoke-direct {v5, v0, v1}, Lyp/g3;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)V

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->a()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;

    move-result-object v6

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig;->getRecordPage()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$RecordPage;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Selfie$AssetConfig$RecordPage;->getLoadingPictograph()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    move-result-object v4

    :cond_3
    move-object/from16 v23, v4

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v4

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->o()Ljava/lang/String;

    move-result-object v24

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->o()Lyp/a;

    move-result-object v25

    invoke-static/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/p;->w(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;)Ljava/lang/String;

    move-result-object v26

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v4

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->g0()Ljava/lang/String;

    move-result-object v27

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;->C()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    move-result-object v28

    new-instance v4, Lyp/h3;

    invoke-direct {v4, v1, v0}, Lyp/h3;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)V

    move-object/from16 v16, v2

    move-object/from16 v21, v3

    move-object/from16 v29, v4

    move-object/from16 v22, v5

    invoke-direct/range {v14 .. v29}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$g;-><init>(Ljava/lang/String;Lqq/c;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;Ljava/lang/String;Lyp/a;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;Lkotlin/jvm/functions/Function0;)V

    return-object v14
.end method

.method public final m2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;
    .locals 33
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;)",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    if-eqz v3, :cond_0

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->t()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lyp/y2;

    move-object/from16 v6, p2

    invoke-direct {v5, v2, v0, v1, v6}, Lyp/y2;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;)V

    invoke-interface {v3, v4, v5}, Lur/a;->f(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    :cond_0
    move-object/from16 v6, p2

    :goto_0
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->i()Ljava/lang/String;

    move-result-object v4

    sget-object v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;->p:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->J()Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;

    move-result-object v5

    sget-object v7, Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;

    invoke-static {v5, v7}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    xor-int/lit8 v5, v5, 0x1

    new-instance v8, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$h;

    new-instance v7, Lyp/z2;

    invoke-direct {v7}, Lyp/z2;-><init>()V

    const/4 v9, 0x0

    invoke-direct {v8, v7, v9, v3, v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$h;-><init>(Lkotlin/jvm/functions/Function0;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;Z)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->I()Z

    move-result v10

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->j:Luq/a;

    invoke-virtual {v3}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v11

    invoke-static {v2, v9}, Lcom/withpersona/sdk2/inquiry/selfie/p;->m(Lym/k$a;Z)Lkotlin/jvm/functions/Function1;

    move-result-object v14

    invoke-virtual/range {p0 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->b4(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lmn/a;

    move-result-object v16

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/selfie/p;->C(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;

    move-result-object v9

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->P()Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;

    move-result-object v5

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;->f()Z

    move-result v18

    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->g:Lcom/withpersona/sdk2/camera/e$a;

    iget-object v7, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->h:Lhn/c$a;

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v23

    iget-object v6, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->p:Lgo/e;

    sget-object v12, Lgo/a;->a:Lgo/a;

    invoke-virtual {v6, v12}, Lgo/e;->a(Lgo/d;)Z

    move-result v25

    new-instance v12, Lyp/a3;

    invoke-direct {v12, v2, v0}, Lyp/a3;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)V

    new-instance v13, Lyp/b3;

    invoke-direct {v13, v0, v2}, Lyp/b3;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)V

    new-instance v15, Lyp/c3;

    invoke-direct {v15, v0, v2, v1}, Lyp/c3;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)V

    const/high16 v31, 0x3c000000    # 0.0078125f

    const/16 v32, 0x0

    move-object/from16 v17, v3

    const/4 v3, 0x0

    move-object/from16 v19, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v20, v7

    const/4 v7, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-static/range {v1 .. v32}, Lcom/withpersona/sdk2/inquiry/selfie/o;->n(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/k$a;Lkn/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;ZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lmn/a;Lur/a;ZLcom/withpersona/sdk2/camera/e$a;Lhn/c$a;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZZZZZZZILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;

    move-result-object v1

    return-object v1
.end method

.method public final q3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;Lym/k$a;)Ljava/lang/Object;
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;->D()Z

    move-result v0

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-nez v0, :cond_0

    iget-object v0, v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a:Landroid/content/Context;

    sget-object v2, Lrp/i0;->a:Lrp/i0;

    invoke-static {v0, v2}, Lcom/withpersona/sdk2/inquiry/permissions/g;->b(Landroid/content/Context;Lrp/i0;)Z

    move-result v0

    if-nez v0, :cond_0

    move/from16 v33, v8

    goto :goto_0

    :cond_0
    move/from16 v33, v7

    :goto_0
    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;->C()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual/range {p0 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->w1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a:Landroid/content/Context;

    invoke-static {v0}, Ljq/g;->f(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->P()Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a:Landroid/content/Context;

    sget-object v2, Lrp/i0;->b:Lrp/i0;

    invoke-static {v0, v2}, Lcom/withpersona/sdk2/inquiry/permissions/g;->b(Landroid/content/Context;Lrp/i0;)Z

    move-result v0

    if-nez v0, :cond_1

    move/from16 v34, v8

    goto :goto_1

    :cond_1
    move/from16 v34, v7

    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;->g()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;

    const/4 v9, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;->f()Lkn/a;

    move-result-object v0

    move-object v10, v0

    goto :goto_2

    :cond_2
    move-object v10, v9

    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->i()Ljava/lang/String;

    move-result-object v11

    new-instance v12, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$g;

    new-instance v13, Lyp/i3;

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v2, p3

    move-object v0, v13

    invoke-direct/range {v0 .. v6}, Lyp/i3;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;J)V

    move-object v0, v1

    move-object v1, v3

    sget-object v14, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->J()Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;

    move-result-object v3

    sget-object v4, Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    xor-int/lit8 v15, v3, 0x1

    invoke-virtual/range {p0 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->b4(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lmn/a;

    move-result-object v3

    sget-object v4, Lmn/a;->b:Lmn/a;

    if-ne v3, v4, :cond_3

    move/from16 v16, v8

    goto :goto_3

    :cond_3
    move/from16 v16, v7

    :goto_3
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->P()Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;->a()J

    move-result-wide v17

    new-instance v3, Lyp/j3;

    invoke-direct {v3, v2}, Lyp/j3;-><init>(Lym/k$a;)V

    move-object/from16 v19, v3

    invoke-direct/range {v12 .. v19}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$g;-><init>(Lkotlin/jvm/functions/Function1;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;ZZJLkotlin/jvm/functions/Function1;)V

    move-object v3, v10

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->I()Z

    move-result v10

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->j:Luq/a;

    invoke-virtual {v4}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v4

    invoke-static {v2, v7, v8, v9}, Lcom/withpersona/sdk2/inquiry/selfie/p;->n(Lym/k$a;ZILjava/lang/Object;)Lkotlin/jvm/functions/Function1;

    move-result-object v14

    invoke-virtual/range {p0 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->b4(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lmn/a;

    move-result-object v16

    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/selfie/p;->C(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;

    move-result-object v9

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->P()Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;

    move-result-object v6

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;->f()Z

    move-result v18

    iget-object v6, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->g:Lcom/withpersona/sdk2/camera/e$a;

    iget-object v13, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->h:Lhn/c$a;

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v23

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;->s()Z

    move-result v24

    iget-object v15, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->p:Lgo/e;

    sget-object v7, Lgo/a;->a:Lgo/a;

    invoke-virtual {v15, v7}, Lgo/e;->a(Lgo/d;)Z

    move-result v25

    if-nez v33, :cond_5

    if-eqz v34, :cond_4

    goto :goto_5

    :cond_4
    const/16 v28, 0x0

    :goto_4
    move-object v8, v12

    goto :goto_6

    :cond_5
    :goto_5
    move/from16 v28, v8

    goto :goto_4

    :goto_6
    new-instance v12, Lyp/k3;

    invoke-direct {v12, v2, v0}, Lyp/k3;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)V

    move-object/from16 v20, v13

    new-instance v13, Lyp/l3;

    invoke-direct {v13, v0, v2}, Lyp/l3;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)V

    new-instance v15, Lyp/m3;

    invoke-direct {v15, v0, v2, v1}, Lyp/m3;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)V

    const/high16 v31, 0x34000000

    const/16 v32, 0x0

    move-object/from16 v17, v5

    const/4 v5, 0x0

    move-object/from16 v19, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    move-object/from16 v35, v11

    move-object v11, v4

    move-object/from16 v4, v35

    invoke-static/range {v1 .. v32}, Lcom/withpersona/sdk2/inquiry/selfie/o;->n(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/k$a;Lkn/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;ZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lmn/a;Lur/a;ZLcom/withpersona/sdk2/camera/e$a;Lhn/c$a;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZZZZZZZILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;

    move-result-object v3

    const-string v4, ""

    const-string v5, "getString(...)"

    if-eqz v33, :cond_8

    move-object v6, v4

    sget-object v4, Lrp/i0;->a:Lrp/i0;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->k()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_6

    goto :goto_7

    :cond_6
    move-object v6, v7

    :goto_7
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->j()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_7

    iget-object v7, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a:Landroid/content/Context;

    sget v8, Lvp/g;->H:I

    invoke-virtual {v7, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_7
    iget-object v8, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a:Landroid/content/Context;

    sget v9, Lvp/g;->G:I

    invoke-static {v8}, Ljq/g;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v10

    filled-new-array {v10}, [Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v8, v9, v10}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->i()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->g()Ljava/lang/String;

    move-result-object v10

    iget-object v14, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->e:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->N()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;

    move-result-object v15

    new-instance v5, Lyp/n3;

    move-object/from16 v11, p2

    invoke-direct {v5, v0, v11, v1, v2}, Lyp/n3;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/k$a;)V

    const/16 v18, 0x4e08

    const/16 v19, 0x0

    move-object v1, v3

    const/4 v3, 0x1

    move-object/from16 v17, v5

    const/4 v5, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    invoke-static/range {v1 .. v19}, Lcom/withpersona/sdk2/inquiry/permissions/g;->e(Ljava/lang/Object;Lym/k$a;ZLrp/i0;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lop/c;

    move-result-object v1

    return-object v1

    :cond_8
    move-object/from16 v11, p2

    move-object v6, v4

    if-eqz v34, :cond_b

    sget-object v4, Lrp/i0;->b:Lrp/i0;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->x()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_9

    iget-object v7, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a:Landroid/content/Context;

    sget v8, Lvp/g;->S:I

    invoke-virtual {v7, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_9
    iget-object v8, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a:Landroid/content/Context;

    sget v9, Lvp/g;->R:I

    invoke-static {v8}, Ljq/g;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v10

    filled-new-array {v10}, [Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v8, v9, v10}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->w()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->v()Ljava/lang/String;

    move-result-object v10

    iget-object v14, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->e:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->z()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_a

    goto :goto_8

    :cond_a
    move-object v6, v5

    :goto_8
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->N()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;

    move-result-object v15

    new-instance v5, Lyp/p3;

    invoke-direct {v5, v0, v11, v1, v2}, Lyp/p3;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/k$a;)V

    const/16 v18, 0xe08

    const/16 v19, 0x0

    move-object v1, v3

    const/4 v3, 0x1

    move-object/from16 v17, v5

    const/4 v5, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-string v16, "video_capture_mic_permission_request"

    invoke-static/range {v1 .. v19}, Lcom/withpersona/sdk2/inquiry/permissions/g;->e(Ljava/lang/Object;Lym/k$a;ZLrp/i0;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lop/c;

    move-result-object v1

    return-object v1

    :cond_b
    move-object v1, v3

    return-object v1
.end method

.method public final t2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;)",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;"
        }
    .end annotation

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lur/a;->d()V

    :cond_0
    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$e;

    new-instance v1, Lyp/c1;

    invoke-direct {v1, p3, p0, p1, p2}, Lyp/c1;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;)V

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$e;-><init>(Lkotlin/jvm/functions/Function0;)V

    return-object v0
.end method

.method public v1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/i;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;
    .locals 11
    .param p1    # Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lym/i;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "props"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->l:Ldq/a$b;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->u()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->y()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->t()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->C()Ljava/util/List;

    move-result-object v5

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->G()Ljava/lang/Long;

    move-result-object v6

    invoke-interface/range {v1 .. v6}, Ldq/a$b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;)Ldq/a;

    move-result-object v0

    iput-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->r:Ldq/a;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->n:Lcom/withpersona/sdk2/inquiry/selfie/g;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->O()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/withpersona/sdk2/inquiry/selfie/g;->o(Z)V

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lym/i;->b()Lxu/h;

    move-result-object p2

    invoke-virtual {p2}, Lxu/h;->I()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p2, v1

    :goto_0
    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    const-string v1, "obtain()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lxu/h;->O()[B

    move-result-object p2

    array-length v1, p2

    const/4 v2, 0x0

    invoke-virtual {v0, p2, v2, v1}, Landroid/os/Parcel;->unmarshall([BII)V

    invoke-virtual {v0, v2}, Landroid/os/Parcel;->setDataPosition(I)V

    const-class p2, Lym/i;

    invoke-virtual {p2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string p2, "parcel.readParcelable<T>\u2026class.java.classLoader)!!"

    invoke-static {v1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    :goto_1
    check-cast v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    return-object v1

    :cond_3
    :goto_2
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->K()Z

    move-result p2

    if-eqz p2, :cond_4

    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->A()Ljava/util/List;

    move-result-object v4

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->E()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;

    move-result-object v5

    sget-object v7, Lcom/withpersona/sdk2/camera/CameraProperties$b;->a:Lcom/withpersona/sdk2/camera/CameraProperties$b;

    const/16 v9, 0xa3

    const/4 v10, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v10}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;-><init>(ZZLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;ZLcom/withpersona/sdk2/camera/CameraProperties$b;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_4
    new-instance v1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$b;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final w1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Z
    .locals 3

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->P()Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;

    move-result-object p1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lur/a;->c()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    if-eqz v2, :cond_1

    invoke-interface {v2}, Lur/a;->g()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    :cond_1
    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a:Landroid/content/Context;

    invoke-virtual {p1, v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;->i(Ljava/lang/Boolean;Ljava/lang/Boolean;Landroid/content/Context;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_2

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final w2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;)",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    new-instance v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f;

    new-instance v4, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f$a;

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v5

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->D()Ljava/lang/String;

    move-result-object v5

    const-string v6, "getString(...)"

    if-nez v5, :cond_0

    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a:Landroid/content/Context;

    sget v7, Lvp/g;->Q:I

    invoke-virtual {v5, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v7

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->v()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_1

    iget-object v7, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a:Landroid/content/Context;

    sget v8, Lvp/g;->I:I

    invoke-virtual {v7, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v8

    invoke-virtual {v8}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->x()Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_2

    iget-object v8, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a:Landroid/content/Context;

    sget v9, Lvp/g;->M:I

    invoke-virtual {v8, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v9

    invoke-virtual {v9}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->z()Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_3

    iget-object v9, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a:Landroid/content/Context;

    sget v10, Lvp/g;->N:I

    invoke-virtual {v9, v10}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_3
    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v10

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->A()Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_4

    iget-object v10, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a:Landroid/content/Context;

    sget v11, Lvp/g;->O:I

    invoke-virtual {v10, v11}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_4
    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v11

    invoke-virtual {v11}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->C()Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_5

    iget-object v11, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a:Landroid/content/Context;

    sget v12, Lvp/g;->P:I

    invoke-virtual {v11, v12}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_5
    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v12

    invoke-virtual {v12}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->w()Ljava/lang/String;

    move-result-object v12

    if-nez v12, :cond_6

    iget-object v12, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a:Landroid/content/Context;

    sget v13, Lvp/g;->L:I

    invoke-virtual {v12, v13}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_6
    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v13

    invoke-virtual {v13}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->u()Ljava/lang/String;

    move-result-object v13

    if-nez v13, :cond_7

    iget-object v13, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a:Landroid/content/Context;

    sget v14, Lvp/g;->K:I

    invoke-virtual {v13, v14}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_7
    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v14

    invoke-virtual {v14}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->t()Ljava/lang/String;

    move-result-object v14

    if-nez v14, :cond_8

    iget-object v14, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a:Landroid/content/Context;

    sget v15, Lvp/g;->J:I

    invoke-virtual {v14, v15}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_8
    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    move-object v9, v10

    move-object v10, v11

    move-object v11, v12

    move-object v12, v13

    move-object v13, v14

    invoke-direct/range {v4 .. v13}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v5, v3

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;->z()Ljava/util/List;

    move-result-object v3

    move-object v6, v4

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->N()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;

    move-result-object v4

    iget-object v7, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->j:Luq/a;

    invoke-virtual {v7}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v7

    move-object v8, v6

    new-instance v6, Lyp/e2;

    invoke-direct {v6, v2, v0, v1}, Lyp/e2;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;)V

    move-object v9, v5

    move-object v5, v7

    new-instance v7, Lyp/f2;

    move-object/from16 v10, p1

    invoke-direct {v7, v2, v0, v10, v1}, Lyp/f2;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;)V

    move-object v1, v8

    new-instance v8, Lyp/g2;

    invoke-direct {v8, v2, v0}, Lyp/g2;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)V

    move-object v11, v1

    move-object v1, v9

    new-instance v9, Lyp/i2;

    invoke-direct {v9, v0, v2}, Lyp/i2;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)V

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->k()Ljava/lang/String;

    move-result-object v10

    move-object v2, v11

    invoke-direct/range {v1 .. v10}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$f$a;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V

    return-object v1
.end method

.method public final x1(Lym/r$c;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;",
            ":",
            "Lcom/withpersona/sdk2/inquiry/selfie/a;",
            ">(",
            "Lym/r<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;",
            "*>.c;TT;",
            "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;",
            ")",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    if-eqz v1, :cond_0

    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->n:Lcom/withpersona/sdk2/inquiry/selfie/g;

    move-object/from16 v3, p2

    check-cast v3, Lcom/withpersona/sdk2/inquiry/selfie/a;

    invoke-virtual {v2, v3, v1}, Lcom/withpersona/sdk2/inquiry/selfie/g;->f(Lcom/withpersona/sdk2/inquiry/selfie/a;Lcom/withpersona/sdk2/inquiry/selfie/Selfie;)V

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lym/r$c;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->q()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    instance-of v3, v1, Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieImage;

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->k:Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;

    move-object v4, v1

    check-cast v4, Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieImage;

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieImage;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Lcom/withpersona/sdk2/inquiry/selfie/directFileUploader/DirectFileUploader;->j(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    if-eqz v1, :cond_2

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;->w()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-static {v2, v1}, Lkotlin/collections/CollectionsKt;->x0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    :goto_0
    move-object v4, v2

    goto :goto_1

    :cond_2
    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;->w()Ljava/util/List;

    move-result-object v2

    goto :goto_0

    :goto_1
    const/4 v2, 0x1

    if-eqz v1, :cond_3

    move-object/from16 v3, p2

    check-cast v3, Lcom/withpersona/sdk2/inquiry/selfie/a;

    invoke-interface {v3}, Lcom/withpersona/sdk2/inquiry/selfie/a;->g()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3, v2}, Lkotlin/collections/CollectionsKt;->Y(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v3

    :goto_2
    move-object v5, v3

    goto :goto_3

    :cond_3
    move-object/from16 v3, p2

    check-cast v3, Lcom/withpersona/sdk2/inquiry/selfie/a;

    invoke-interface {v3}, Lcom/withpersona/sdk2/inquiry/selfie/a;->g()Ljava/util/List;

    move-result-object v3

    goto :goto_2

    :goto_3
    invoke-virtual/range {p1 .. p1}, Lym/r$c;->b()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->O()Z

    move-result v3

    if-eqz v3, :cond_5

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->r:Ldq/a;

    if-nez v3, :cond_4

    const-string v3, "selfiePoseManager"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->u(Ljava/lang/String;)V

    const/4 v3, 0x0

    :cond_4
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    add-int/2addr v6, v2

    invoke-virtual {v3, v6}, Ldq/a;->n(I)V

    :cond_5
    invoke-virtual/range {p1 .. p1}, Lym/r$c;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->O()Z

    move-result v2

    if-eqz v2, :cond_6

    if-eqz v1, :cond_6

    move-object/from16 v2, p2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/selfie/a;

    invoke-interface {v2}, Lcom/withpersona/sdk2/inquiry/selfie/a;->g()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;->i()Z

    move-result v3

    if-nez v3, :cond_6

    move-object v7, v4

    invoke-interface {v2}, Lcom/withpersona/sdk2/inquiry/selfie/a;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v4

    invoke-interface {v2}, Lcom/withpersona/sdk2/inquiry/selfie/a;->t()J

    move-result-wide v2

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;->u()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v8

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v9

    move-object/from16 v6, p2

    check-cast v6, Lcom/withpersona/sdk2/inquiry/selfie/a;

    invoke-interface {v6}, Lcom/withpersona/sdk2/inquiry/selfie/a;->s()Z

    move-result v10

    invoke-interface {v6}, Lcom/withpersona/sdk2/inquiry/selfie/a;->i()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;

    move-result-object v12

    invoke-interface {v6}, Lcom/withpersona/sdk2/inquiry/selfie/a;->f()Z

    move-result v13

    move-object v11, v5

    move-wide v5, v2

    new-instance v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;

    invoke-direct/range {v3 .. v13}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;-><init>(Lcom/withpersona/sdk2/camera/CameraProperties;JLjava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZLjava/util/List;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Z)V

    :goto_4
    move-object v5, v3

    goto/16 :goto_6

    :cond_6
    move-object v11, v5

    move-object v5, v11

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_8

    invoke-static {v11}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;->f()Lkn/a;

    move-result-object v2

    sget-object v3, Lkn/a;->a:Lkn/a;

    if-ne v2, v3, :cond_7

    move-object v5, v11

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v10

    move-object/from16 v2, p2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/selfie/a;

    invoke-interface {v2}, Lcom/withpersona/sdk2/inquiry/selfie/a;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v15

    invoke-interface {v2}, Lcom/withpersona/sdk2/inquiry/selfie/a;->t()J

    move-result-wide v13

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;->u()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v16

    invoke-virtual/range {p1 .. p1}, Lym/r$c;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->E()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;

    move-result-object v17

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v18

    move-object/from16 v2, p2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/selfie/a;

    invoke-interface {v2}, Lcom/withpersona/sdk2/inquiry/selfie/a;->s()Z

    move-result v19

    new-instance v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;

    const/16 v21, 0x83

    const/16 v22, 0x0

    move-object v7, v4

    const/4 v4, 0x0

    move-object v8, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v9, v7

    const/4 v7, 0x0

    const/4 v12, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v3 .. v22}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;-><init>(ZLkn/b;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Ljava/util/List;Ljava/util/List;JZJLcom/withpersona/sdk2/camera/CameraProperties;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_4

    :cond_7
    new-instance v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;

    move-object/from16 v2, p2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/selfie/a;

    invoke-interface {v2}, Lcom/withpersona/sdk2/inquiry/selfie/a;->f()Z

    move-result v6

    invoke-interface {v2}, Lcom/withpersona/sdk2/inquiry/selfie/a;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v7

    invoke-interface {v2}, Lcom/withpersona/sdk2/inquiry/selfie/a;->t()J

    move-result-wide v8

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;->u()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lym/r$c;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->E()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v12

    move-object/from16 v5, p2

    check-cast v5, Lcom/withpersona/sdk2/inquiry/selfie/a;

    invoke-interface {v5}, Lcom/withpersona/sdk2/inquiry/selfie/a;->s()Z

    move-result v13

    move-object v5, v11

    move-object v11, v2

    invoke-direct/range {v3 .. v13}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;-><init>(Ljava/util/List;Ljava/util/List;ZLcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;Lcom/withpersona/sdk2/camera/CameraProperties$b;Z)V

    goto/16 :goto_4

    :cond_8
    invoke-virtual/range {p1 .. p1}, Lym/r$c;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    invoke-virtual {v0, v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->b4(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lmn/a;

    move-result-object v2

    sget-object v3, Lmn/a;->b:Lmn/a;

    if-ne v2, v3, :cond_a

    new-instance v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;

    invoke-virtual/range {p1 .. p1}, Lym/r$c;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->o()Lyp/a;

    move-result-object v2

    sget-object v5, Lyp/a;->c:Lyp/a;

    if-ne v2, v5, :cond_9

    const-wide/16 v5, 0x0

    goto :goto_5

    :cond_9
    const-wide/16 v5, 0xbb8

    :goto_5
    move-object/from16 v2, p2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/selfie/a;

    invoke-interface {v2}, Lcom/withpersona/sdk2/inquiry/selfie/a;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v9

    invoke-interface {v2}, Lcom/withpersona/sdk2/inquiry/selfie/a;->t()J

    move-result-wide v10

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;->u()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v12

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v13

    const/16 v14, 0xc

    const/4 v15, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v3 .. v15}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;-><init>(Ljava/util/List;JZZLcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto/16 :goto_4

    :cond_a
    invoke-virtual/range {p1 .. p1}, Lym/r$c;->b()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;

    invoke-virtual {v0, v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->b4(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lmn/a;

    move-result-object v2

    sget-object v3, Lmn/a;->a:Lmn/a;

    if-ne v2, v3, :cond_b

    new-instance v3, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;

    move-object/from16 v2, p2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/selfie/a;

    invoke-interface {v2}, Lcom/withpersona/sdk2/inquiry/selfie/a;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v5

    invoke-interface {v2}, Lcom/withpersona/sdk2/inquiry/selfie/a;->t()J

    move-result-wide v6

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;->u()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v8

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v9

    invoke-direct/range {v3 .. v9}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;-><init>(Ljava/util/List;Lcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$b;)V

    goto/16 :goto_4

    :cond_b
    move-object/from16 v2, p2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/selfie/a;

    invoke-interface {v2}, Lcom/withpersona/sdk2/inquiry/selfie/a;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v6

    invoke-interface {v2}, Lcom/withpersona/sdk2/inquiry/selfie/a;->t()J

    move-result-wide v7

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;->u()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v9

    const/4 v5, 0x0

    move-object/from16 v3, p1

    invoke-static/range {v3 .. v9}, Lcom/withpersona/sdk2/inquiry/selfie/p;->D(Lym/r$c;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v3

    goto/16 :goto_4

    :goto_6
    if-nez v1, :cond_c

    return-object v5

    :cond_c
    new-instance v4, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;

    move-object/from16 v1, p2

    check-cast v1, Lcom/withpersona/sdk2/inquiry/selfie/a;

    invoke-interface {v1}, Lcom/withpersona/sdk2/inquiry/selfie/a;->j()Lkn/a;

    move-result-object v6

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;->u()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v7

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v8

    move-object/from16 v1, p2

    check-cast v1, Lcom/withpersona/sdk2/inquiry/selfie/a;

    invoke-interface {v1}, Lcom/withpersona/sdk2/inquiry/selfie/a;->s()Z

    move-result v9

    invoke-direct/range {v4 .. v9}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lkn/a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$b;Z)V

    return-object v4
.end method

.method public y1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lym/k$a;)Ljava/lang/Object;
    .locals 9
    .param p1    # Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lym/k$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "renderProps"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "renderState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lcom/withpersona/sdk2/inquiry/selfie/p;->H(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$e;

    invoke-direct {v0, p0, v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$e;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lnt/b;)V

    const-string v2, "close_camera"

    invoke-virtual {p3, v2, v0}, Lym/k$a;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    :cond_0
    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->c4(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$f;

    invoke-direct {v0, p3, p0, v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$f;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lnt/b;)V

    const-string v1, "output_webrtc_error"

    invoke-virtual {p3, v1, v0}, Lym/k$a;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    :cond_1
    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->j:Luq/a;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->f()Z

    move-result v3

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->m()Z

    move-result v4

    instance-of v0, p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;

    xor-int/lit8 v5, v0, 0x1

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v8}, Luq/a;->d(Luq/a;ZZZZILjava/lang/Object;)V

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->n:Lcom/withpersona/sdk2/inquiry/selfie/g;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->t()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2}, Lfq/l2;->f(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;)Lpq/j;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/withpersona/sdk2/inquiry/selfie/g;->e(Ljava/lang/String;Lpq/j;)V

    instance-of v1, p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;

    if-eqz v1, :cond_2

    check-cast p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->D2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$b;

    move-result-object p1

    goto/16 :goto_0

    :cond_2
    instance-of v1, p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;

    if-eqz v1, :cond_3

    check-cast p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->B3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;

    move-result-object p1

    goto/16 :goto_0

    :cond_3
    instance-of v1, p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;

    if-eqz v1, :cond_4

    check-cast p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;Lym/k$a;)Ljava/lang/Object;

    move-result-object p1

    goto/16 :goto_0

    :cond_4
    instance-of v1, p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;

    if-eqz v1, :cond_5

    check-cast p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->t2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;

    move-result-object p1

    goto/16 :goto_0

    :cond_5
    instance-of v1, p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;

    if-eqz v1, :cond_6

    check-cast p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->J2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;

    move-result-object p1

    goto/16 :goto_0

    :cond_6
    instance-of v1, p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;

    if-eqz v1, :cond_7

    check-cast p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->P2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;

    move-result-object p1

    goto/16 :goto_0

    :cond_7
    instance-of v1, p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;

    if-eqz v1, :cond_8

    check-cast p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->a3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;

    move-result-object p1

    goto/16 :goto_0

    :cond_8
    instance-of v1, p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;

    if-eqz v1, :cond_9

    check-cast p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->Z1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;

    move-result-object p1

    goto :goto_0

    :cond_9
    instance-of v1, p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;

    if-eqz v1, :cond_a

    check-cast p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->f2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;

    move-result-object p1

    goto :goto_0

    :cond_a
    instance-of v1, p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;

    if-eqz v1, :cond_b

    check-cast p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->K1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;

    move-result-object p1

    goto :goto_0

    :cond_b
    instance-of v1, p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;

    if-eqz v1, :cond_c

    check-cast p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->T1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;

    move-result-object p1

    goto :goto_0

    :cond_c
    instance-of v1, p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;

    if-eqz v1, :cond_d

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->f:Lhq/j;

    check-cast p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;

    invoke-virtual {v0, p1, p2, p3}, Lhq/j;->q(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;

    move-result-object p1

    goto :goto_0

    :cond_d
    instance-of v1, p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;

    if-eqz v1, :cond_e

    check-cast p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->m2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;

    move-result-object p1

    goto :goto_0

    :cond_e
    instance-of v1, p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;

    if-eqz v1, :cond_f

    check-cast p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->P3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;

    move-result-object p1

    goto :goto_0

    :cond_f
    instance-of v1, p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;

    if-eqz v1, :cond_10

    check-cast p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->w2(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;

    move-result-object p1

    goto :goto_0

    :cond_10
    if-eqz v0, :cond_11

    check-cast p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->i3(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;

    move-result-object p1

    goto :goto_0

    :cond_11
    instance-of v0, p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;

    if-eqz v0, :cond_13

    check-cast p2, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->z1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;

    move-result-object p1

    :goto_0
    instance-of p2, p1, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c;

    if-eqz p2, :cond_12

    invoke-static {p1}, Lcom/withpersona/sdk2/inquiry/permissions/g;->c(Ljava/lang/Object;)Lop/c;

    move-result-object p1

    :cond_12
    return-object p1

    :cond_13
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1
.end method

.method public final z1(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;
    .locals 49
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;)",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;->w()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "fetch_pose_"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$g;

    const/4 v5, 0x0

    invoke-direct {v4, v0, v2, v1, v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$g;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;ILym/k$a;Lnt/b;)V

    invoke-virtual {v1, v3, v4}, Lym/k$a;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->i()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->j()Ljava/lang/String;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->g0()Ljava/lang/String;

    move-result-object v15

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->E()Ljava/lang/String;

    move-result-object v14

    new-instance v16, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$a;

    sget-object v17, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->y()Ljava/lang/String;

    move-result-object v18

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->u()Ljava/lang/String;

    move-result-object v19

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->t()Ljava/lang/String;

    move-result-object v20

    new-instance v2, Lyp/p0;

    invoke-direct {v2, v1, v0}, Lyp/p0;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)V

    new-instance v3, Lyp/l1;

    invoke-direct {v3, v1, v0}, Lyp/l1;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)V

    move-object/from16 v21, v2

    move-object/from16 v22, v3

    invoke-direct/range {v16 .. v22}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a$a;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->N()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;

    move-result-object v18

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->I()Z

    move-result v19

    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->j:Luq/a;

    invoke-virtual {v2}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v20

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v1, v2, v3, v5}, Lcom/withpersona/sdk2/inquiry/selfie/p;->n(Lym/k$a;ZILjava/lang/Object;)Lkotlin/jvm/functions/Function1;

    move-result-object v23

    invoke-virtual/range {p0 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->b4(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lmn/a;

    move-result-object v25

    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->q:Lur/a;

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->P()Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;->f()Z

    move-result v27

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->g:Lcom/withpersona/sdk2/camera/e$a;

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->h:Lhn/c$a;

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v33

    invoke-virtual/range {p2 .. p2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;->s()Z

    move-result v34

    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;->p:Lgo/e;

    sget-object v6, Lgo/a;->a:Lgo/a;

    invoke-virtual {v5, v6}, Lgo/e;->a(Lgo/d;)Z

    move-result v35

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->o()Lyp/a;

    move-result-object v43

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->r()Ljava/lang/String;

    move-result-object v44

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;

    move-result-object v5

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input$Strings;->m()Ljava/lang/String;

    move-result-object v12

    new-instance v6, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;

    new-instance v5, Lyp/w1;

    invoke-direct {v5, v1, v0}, Lyp/w1;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)V

    new-instance v8, Lyp/h2;

    invoke-direct {v8, v0, v1}, Lyp/h2;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;)V

    new-instance v9, Lyp/s2;

    move-object/from16 v10, p1

    invoke-direct {v9, v0, v1, v10}, Lyp/s2;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)V

    new-instance v10, Lyp/d3;

    invoke-direct {v10, v1, v0}, Lyp/d3;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow;)V

    new-instance v38, Lyp/o3;

    invoke-direct/range {v38 .. v38}, Lyp/o3;-><init>()V

    const/16 v47, 0x40

    const/16 v48, 0x0

    move-object/from16 v22, v8

    const/4 v8, 0x0

    move-object/from16 v24, v9

    const/4 v9, 0x0

    move-object/from16 v30, v10

    const/4 v10, 0x0

    const/4 v13, 0x0

    move-object/from16 v17, v16

    const/16 v16, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    move-object/from16 v26, v2

    move-object/from16 v28, v3

    move-object/from16 v29, v4

    move-object/from16 v21, v5

    invoke-direct/range {v6 .. v48}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$a$a;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;ZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lmn/a;Lur/a;ZLcom/withpersona/sdk2/camera/e$a;Lhn/c$a;Lkotlin/jvm/functions/Function1;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZZZZLkotlin/jvm/functions/Function1;Lkn/a;ZZZLyp/a;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method
