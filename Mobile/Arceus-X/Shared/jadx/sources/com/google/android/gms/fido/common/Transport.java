package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import p100eb.C4953j4;
import p100eb.C4971m4;

/* JADX INFO: loaded from: classes.dex */
public enum Transport implements ReflectedParcelable {
    BLUETOOTH_CLASSIC("bt"),
    BLUETOOTH_LOW_ENERGY("ble"),
    NFC("nfc"),
    USB("usb"),
    INTERNAL("internal"),
    HYBRID("cable"),
    HYBRID_V2("hybrid");


    @NonNull
    public static final Parcelable.Creator<Transport> CREATOR = new Parcelable.Creator() { // from class: com.google.android.gms.fido.common.a
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return Transport.m9248a(parcel.readString());
            } catch (Transport.C1918a e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new Transport[i10];
        }
    };

    /* JADX INFO: renamed from: a */
    public final String f7584a;

    /* JADX INFO: renamed from: com.google.android.gms.fido.common.Transport$a */
    public static class C1918a extends Exception {
        public C1918a(@NonNull String str) {
            super(str);
        }
    }

    Transport(String str) {
        this.f7584a = str;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static Transport m9248a(@NonNull String str) throws C1918a {
        if (str.equals("hybrid") && (!C4953j4.m23649a() || !C4971m4.m23676a())) {
            return HYBRID;
        }
        for (Transport transport : values()) {
            if (str.equals(transport.f7584a)) {
                return transport;
            }
        }
        throw new C1918a(String.format("Transport %s not supported", str));
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public static List<Transport> m9249j(@NonNull JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        HashSet hashSet = new HashSet(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String string = jSONArray.getString(i10);
            if (string != null && !string.isEmpty()) {
                try {
                    hashSet.add(m9248a(string));
                } catch (C1918a unused) {
                    Log.w("Transport", "Ignoring unrecognized transport ".concat(string));
                }
            }
        }
        return new ArrayList(hashSet);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.f7584a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeString(this.f7584a);
    }
}
