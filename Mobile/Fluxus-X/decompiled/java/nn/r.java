package nn;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.luben.zstd.BuildConfig;
import ln.Snapshot;
import org.jetbrains.annotations.NotNull;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroid/os/Parcelable;", "Lln/i;", "a", "(Landroid/os/Parcelable;)Lln/i;", "wf1-core-android"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class r {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lew/f;", "bufferedSink", BuildConfig.FLAVOR, "a", "(Lew/f;)V"}, k = 3, mv = {1, 6, 0})
    public static final class a extends p001kotlin.jvm.internal.m implements Function1<ew.f, Unit> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Parcelable f25889i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Parcelable parcelable) {
            super(1);
            this.f25889i = parcelable;
        }

        public final void a(@NotNull ew.f bufferedSink) {
            Intrinsics.checkNotNullParameter(bufferedSink, "bufferedSink");
            Parcel parcelObtain = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
            parcelObtain.writeParcelable(this.f25889i, 0);
            byte[] byteArray = parcelObtain.marshall();
            Intrinsics.checkNotNullExpressionValue(byteArray, "byteArray");
            bufferedSink.write(byteArray);
            parcelObtain.recycle();
        }

        @Override // p001kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ew.f fVar) {
            a(fVar);
            return Unit.f21506a;
        }
    }

    @NotNull
    public static final Snapshot a(@NotNull Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(parcelable, "<this>");
        return Snapshot.INSTANCE.c(new a(parcelable));
    }
}
