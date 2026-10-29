package sa;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.identitycredentials.CredentialOption;
import p325o9.C9717a;
import p325o9.C9718b;

/* JADX INFO: renamed from: sa.i */
/* JADX INFO: loaded from: classes.dex */
public final class C11228i implements Parcelable.Creator<CredentialOption> {
    /* JADX INFO: renamed from: c */
    public static void m42264c(CredentialOption credentialOption, Parcel parcel, int i10) {
        int iM38457a = C9718b.m38457a(parcel);
        C9718b.m38478v(parcel, 1, credentialOption.getCom.appsflyer.sdk_base.referrer.Payload.TYPE java.lang.String(), false);
        C9718b.m38462f(parcel, 2, credentialOption.getCredentialRetrievalData(), false);
        C9718b.m38462f(parcel, 3, credentialOption.getCandidateQueryData(), false);
        C9718b.m38478v(parcel, 4, credentialOption.getRequestMatcher(), false);
        C9718b.m38478v(parcel, 5, credentialOption.getRequestType(), false);
        C9718b.m38478v(parcel, 6, credentialOption.getProtocolType(), false);
        C9718b.m38458b(parcel, iM38457a);
    }

    /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public CredentialOption createFromParcel(@NonNull Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        String strM38434h = "";
        String strM38434h2 = strM38434h;
        String strM38434h3 = strM38434h2;
        Bundle bundleM38428b = null;
        Bundle bundleM38428b2 = null;
        String strM38434h4 = null;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            switch (C9717a.m38440n(iM38447u)) {
                case 1:
                    strM38434h = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 2:
                    bundleM38428b = C9717a.m38428b(parcel, iM38447u);
                    break;
                case 3:
                    bundleM38428b2 = C9717a.m38428b(parcel, iM38447u);
                    break;
                case 4:
                    strM38434h4 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 5:
                    strM38434h2 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 6:
                    strM38434h3 = C9717a.m38434h(parcel, iM38447u);
                    break;
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new CredentialOption(strM38434h, bundleM38428b, bundleM38428b2, strM38434h4, strM38434h2, strM38434h3);
    }

    /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
    @Override // android.os.Parcelable.Creator
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CredentialOption[] newArray(int i10) {
        return new CredentialOption[i10];
    }
}
