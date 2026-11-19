/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00aff314
 */

int NAME_CONSTRAINTS_check_CN(X509 *param_1,undefined8 param_2)

{
  byte bVar1;
  bool bVar2;
  uchar *ptr;
  int loc;
  int iVar3;
  int iVar4;
  X509_NAME *name;
  X509_NAME_ENTRY *ne;
  ASN1_STRING *in;
  void *pvVar5;
  long lVar6;
  long lVar7;
  long lVar8;
  long lVar9;
  size_t __n;
  undefined4 local_90 [2];
  undefined4 *local_88;
  undefined4 local_80;
  undefined4 local_7c;
  uchar *local_78;
  undefined8 local_70;
  uchar *local_68;
  
  name = X509_get_subject_name(param_1);
  local_88 = &local_80;
  local_70 = 0;
  local_7c = 0x16;
  local_90[0] = 2;
  loc = X509_NAME_get_index_by_NID(name,0xd,-1);
  if (loc != -1) {
    do {
      ne = X509_NAME_get_entry(name,loc);
      in = X509_NAME_ENTRY_get_data(ne);
      iVar3 = ASN1_STRING_to_UTF8(&local_68,in);
      ptr = local_68;
      if (iVar3 < 0) {
        return 0x11;
      }
      lVar8 = -((long)iVar3 << 0x20);
      lVar7 = (long)iVar3;
      do {
        iVar4 = iVar3;
        lVar9 = lVar8;
        lVar6 = lVar7 + -1;
        if (lVar7 < 1) break;
        lVar8 = lVar9 + 0x100000000;
        iVar3 = iVar4 + -1;
        lVar7 = lVar6;
      } while (local_68[lVar6] == '\0');
      __n = -lVar9 >> 0x20;
      pvVar5 = memchr(local_68,0,__n);
      if (pvVar5 != (void *)0x0) {
        CRYPTO_free(ptr);
        return 0x35;
      }
      if (iVar4 < 1) {
LAB_00aff4d4:
        CRYPTO_free(ptr);
      }
      else {
        lVar8 = 0;
        bVar2 = false;
        do {
          bVar1 = ptr[lVar8];
          if (((0x19 < (byte)((bVar1 & 0xdf) + 0xbf)) && (bVar1 != 0x5f)) &&
             (9 < (byte)(bVar1 - 0x30))) {
            if ((lVar8 == 0) || (-0x100000000 - lVar9 >> 0x20 <= lVar8)) goto LAB_00aff4d4;
            if (bVar1 != 0x2d) {
              if (((bVar1 != 0x2e) || (ptr[lVar8 + 1] == '.')) ||
                 ((ptr[lVar8 + 1] == '-' || (ptr[lVar8 + -1] == '-')))) goto LAB_00aff4d4;
              bVar2 = true;
            }
          }
          lVar8 = lVar8 + 1;
        } while (lVar8 < (long)__n);
        if (!bVar2) goto LAB_00aff4d4;
        if (lVar9 != 0) {
          local_80 = (undefined4)((ulong)-lVar9 >> 0x20);
          local_78 = ptr;
          iVar3 = FUN_00aff100(local_90,param_2);
          CRYPTO_free(ptr);
          if (iVar3 != 0) {
            return iVar3;
          }
        }
      }
      loc = X509_NAME_get_index_by_NID(name,0xd,loc);
    } while (loc != -1);
  }
  return 0;
}

