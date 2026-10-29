package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p325o9.C9717a;

/* JADX INFO: loaded from: classes.dex */
public final class zzvc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM38424D = C9717a.m38424D(parcel);
        String strM38434h = null;
        Rect rect = null;
        ArrayList arrayListM38438l = null;
        String strM38434h2 = null;
        ArrayList arrayListM38438l2 = null;
        float fM38445s = 0.0f;
        float fM38445s2 = 0.0f;
        while (parcel.dataPosition() < iM38424D) {
            int iM38447u = C9717a.m38447u(parcel);
            switch (C9717a.m38440n(iM38447u)) {
                case 1:
                    strM38434h = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 2:
                    rect = (Rect) C9717a.m38433g(parcel, iM38447u, Rect.CREATOR);
                    break;
                case 3:
                    arrayListM38438l = C9717a.m38438l(parcel, iM38447u, Point.CREATOR);
                    break;
                case 4:
                    strM38434h2 = C9717a.m38434h(parcel, iM38447u);
                    break;
                case 5:
                    fM38445s = C9717a.m38445s(parcel, iM38447u);
                    break;
                case 6:
                    fM38445s2 = C9717a.m38445s(parcel, iM38447u);
                    break;
                case 7:
                    arrayListM38438l2 = C9717a.m38438l(parcel, iM38447u, zzvj.CREATOR);
                    break;
                default:
                    C9717a.m38423C(parcel, iM38447u);
                    break;
            }
        }
        C9717a.m38439m(parcel, iM38424D);
        return new zzvb(strM38434h, rect, arrayListM38438l, strM38434h2, fM38445s, fM38445s2, arrayListM38438l2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzvb[i10];
    }
}
