package p016an;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7746m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p560xu.InterfaceC12926f;
import p581ym.Snapshot;

/* JADX INFO: renamed from: an.q */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m31665d2 = {"Landroid/os/Parcelable;", "Lym/i;", "a", "(Landroid/os/Parcelable;)Lym/i;", "wf1-core-android"}, m31666k = 2, m31667mv = {1, 6, 0}, m31669xi = 48)
public final class C0388q {

    /* JADX INFO: renamed from: an.q$a */
    @Metadata(m31664d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m31665d2 = {"Lxu/f;", "bufferedSink", "", "a", "(Lxu/f;)V"}, m31666k = 3, m31667mv = {1, 6, 0})
    public static final class a extends AbstractC7746m implements Function1<InterfaceC12926f, Unit> {

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ Parcelable f954i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Parcelable parcelable) {
            super(1);
            this.f954i = parcelable;
        }

        /* JADX INFO: renamed from: a */
        public final void m1448a(@NotNull InterfaceC12926f bufferedSink) {
            Intrinsics.checkNotNullParameter(bufferedSink, "bufferedSink");
            Parcel parcelObtain = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
            parcelObtain.writeParcelable(this.f954i, 0);
            byte[] byteArray = parcelObtain.marshall();
            Intrinsics.checkNotNullExpressionValue(byteArray, "byteArray");
            bufferedSink.write(byteArray);
            parcelObtain.recycle();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC12926f interfaceC12926f) {
            m1448a(interfaceC12926f);
            return Unit.f29331a;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Snapshot m1447a(@NotNull Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(parcelable, "<this>");
        return Snapshot.INSTANCE.m48873c(new a(parcelable));
    }
}
