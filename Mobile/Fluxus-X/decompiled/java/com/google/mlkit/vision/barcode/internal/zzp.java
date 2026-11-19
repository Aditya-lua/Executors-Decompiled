package com.google.mlkit.vision.barcode.internal;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.internal.mlkit_vision_barcode.zzr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.barcode.common.internal.BarcodeSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzp implements BarcodeSource {
    private final zzu zza;

    public zzp(zzu zzuVar) {
        this.zza = zzuVar;
    }

    private static Barcode.CalendarDateTime zza(com.google.android.gms.internal.mlkit_vision_barcode.zzj zzjVar) {
        if (zzjVar == null) {
            return null;
        }
        return new Barcode.CalendarDateTime(zzjVar.zza, zzjVar.zzb, zzjVar.zzc, zzjVar.zzd, zzjVar.zze, zzjVar.zzf, zzjVar.zzg, zzjVar.zzh);
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Rect getBoundingBox() {
        zzu zzuVar = this.zza;
        if (zzuVar.zze == null) {
            return null;
        }
        int i10 = 0;
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        while (true) {
            Point[] pointArr = zzuVar.zze;
            if (i10 >= pointArr.length) {
                return new Rect(iMin, iMin2, iMax, iMax2);
            }
            Point point = pointArr[i10];
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
            i10++;
        }
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.CalendarEvent getCalendarEvent() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzk zzkVar = this.zza.zzl;
        if (zzkVar == null) {
            return null;
        }
        return new Barcode.CalendarEvent(zzkVar.zza, zzkVar.zzb, zzkVar.zzc, zzkVar.zzd, zzkVar.zze, zza(zzkVar.zzf), zza(zzkVar.zzg));
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.ContactInfo getContactInfo() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzl zzlVar = this.zza.zzm;
        if (zzlVar == null) {
            return null;
        }
        com.google.android.gms.internal.mlkit_vision_barcode.zzp zzpVar = zzlVar.zza;
        Barcode.PersonName personName = zzpVar == null ? null : new Barcode.PersonName(zzpVar.zza, zzpVar.zzb, zzpVar.zzc, zzpVar.zzd, zzpVar.zze, zzpVar.zzf, zzpVar.zzg);
        String str = zzlVar.zzb;
        String str2 = zzlVar.zzc;
        com.google.android.gms.internal.mlkit_vision_barcode.zzq[] zzqVarArr = zzlVar.zzd;
        ArrayList arrayList = new ArrayList();
        if (zzqVarArr != null) {
            for (com.google.android.gms.internal.mlkit_vision_barcode.zzq zzqVar : zzqVarArr) {
                if (zzqVar != null) {
                    arrayList.add(new Barcode.Phone(zzqVar.zzb, zzqVar.zza));
                }
            }
        }
        com.google.android.gms.internal.mlkit_vision_barcode.zzn[] zznVarArr = zzlVar.zze;
        ArrayList arrayList2 = new ArrayList();
        if (zznVarArr != null) {
            for (com.google.android.gms.internal.mlkit_vision_barcode.zzn zznVar : zznVarArr) {
                if (zznVar != null) {
                    arrayList2.add(new Barcode.Email(zznVar.zza, zznVar.zzb, zznVar.zzc, zznVar.zzd));
                }
            }
        }
        String[] strArr = zzlVar.zzf;
        List listAsList = strArr != null ? Arrays.asList(strArr) : new ArrayList();
        com.google.android.gms.internal.mlkit_vision_barcode.zzi[] zziVarArr = zzlVar.zzg;
        ArrayList arrayList3 = new ArrayList();
        if (zziVarArr != null) {
            for (com.google.android.gms.internal.mlkit_vision_barcode.zzi zziVar : zziVarArr) {
                if (zziVar != null) {
                    arrayList3.add(new Barcode.Address(zziVar.zza, zziVar.zzb));
                }
            }
        }
        return new Barcode.ContactInfo(personName, str, str2, arrayList, arrayList2, listAsList, arrayList3);
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Point[] getCornerPoints() {
        return this.zza.zze;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final String getDisplayValue() {
        return this.zza.zzc;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.DriverLicense getDriverLicense() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzm zzmVar = this.zza.zzn;
        if (zzmVar == null) {
            return null;
        }
        return new Barcode.DriverLicense(zzmVar.zza, zzmVar.zzb, zzmVar.zzc, zzmVar.zzd, zzmVar.zze, zzmVar.zzf, zzmVar.zzg, zzmVar.zzh, zzmVar.zzi, zzmVar.zzj, zzmVar.zzk, zzmVar.zzl, zzmVar.zzm, zzmVar.zzn);
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.Email getEmail() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzn zznVar = this.zza.zzf;
        if (zznVar != null) {
            return new Barcode.Email(zznVar.zza, zznVar.zzb, zznVar.zzc, zznVar.zzd);
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final int getFormat() {
        return this.zza.zza;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.GeoPoint getGeoPoint() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzo zzoVar = this.zza.zzk;
        if (zzoVar != null) {
            return new Barcode.GeoPoint(zzoVar.zza, zzoVar.zzb);
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.Phone getPhone() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzq zzqVar = this.zza.zzg;
        if (zzqVar != null) {
            return new Barcode.Phone(zzqVar.zzb, zzqVar.zza);
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final byte[] getRawBytes() {
        return this.zza.zzo;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final String getRawValue() {
        return this.zza.zzb;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.Sms getSms() {
        zzr zzrVar = this.zza.zzh;
        if (zzrVar != null) {
            return new Barcode.Sms(zzrVar.zza, zzrVar.zzb);
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.UrlBookmark getUrl() {
        zzs zzsVar = this.zza.zzj;
        if (zzsVar != null) {
            return new Barcode.UrlBookmark(zzsVar.zza, zzsVar.zzb);
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final int getValueType() {
        return this.zza.zzd;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.WiFi getWifi() {
        zzt zztVar = this.zza.zzi;
        if (zztVar != null) {
            return new Barcode.WiFi(zztVar.zza, zztVar.zzb, zztVar.zzc);
        }
        return null;
    }
}
