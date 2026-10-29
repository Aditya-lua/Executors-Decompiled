package com.withpersona.sdk2.camera;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7699p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m31664d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\tJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, m31665d2 = {"Lcom/withpersona/sdk2/camera/AutoCaptureRuleSet;", "Landroid/os/Parcelable;", "", "Lcom/withpersona/sdk2/camera/AutoCaptureRule;", "rules", "<init>", "(Ljava/util/List;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "camera_release"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final /* data */ class AutoCaptureRuleSet implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AutoCaptureRuleSet> CREATOR = new C3395a();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public final List<AutoCaptureRule> rules;

    /* JADX INFO: renamed from: com.withpersona.sdk2.camera.AutoCaptureRuleSet$a */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3395a implements Parcelable.Creator<AutoCaptureRuleSet> {
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AutoCaptureRuleSet createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(parcel.readParcelable(AutoCaptureRuleSet.class.getClassLoader()));
            }
            return new AutoCaptureRuleSet(arrayList);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AutoCaptureRuleSet[] newArray(int i10) {
            return new AutoCaptureRuleSet[i10];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public AutoCaptureRuleSet() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<AutoCaptureRule> m16167a() {
        return this.rules;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AutoCaptureRuleSet) && Intrinsics.m31980c(this.rules, ((AutoCaptureRuleSet) other).rules);
    }

    public int hashCode() {
        return this.rules.hashCode();
    }

    @NotNull
    public String toString() {
        return "AutoCaptureRuleSet(rules=" + this.rules + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<AutoCaptureRule> list = this.rules;
        dest.writeInt(list.size());
        Iterator<AutoCaptureRule> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.withpersona.sdk2.camera.AutoCaptureRule> */
    /* JADX WARN: Multi-variable type inference failed */
    public AutoCaptureRuleSet(@NotNull List<? extends AutoCaptureRule> rules) {
        Intrinsics.checkNotNullParameter(rules, "rules");
        this.rules = rules;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
      (wrap java.util.List:?: TERNARY null = ((wrap int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap java.util.List:0x0004: INVOKE  STATIC call: kotlin.collections.p.k():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:4)) : (r1v0 java.util.List))
     A[MD:(java.util.List<? extends com.withpersona.sdk2.camera.AutoCaptureRule>):void (m)] (LINE:5) call: com.withpersona.sdk2.camera.AutoCaptureRuleSet.<init>(java.util.List):void type: THIS */
    public /* synthetic */ AutoCaptureRuleSet(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C7699p.m31892k() : list);
    }
}
