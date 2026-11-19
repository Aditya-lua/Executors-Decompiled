/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f0b7c
 */

/* WARNING: Removing unreachable block (ram,0x009f0be0) */
/* WARNING: Removing unreachable block (ram,0x009f0be4) */
/* WARNING: Removing unreachable block (ram,0x009f0bf4) */

int ASN1_get_object(uchar **pp,long *plength,int *ptag,int *pclass,long omax)

{
  byte bVar1;
  byte bVar2;
  ulong uVar3;
  undefined8 uVar4;
  byte *pbVar5;
  uint uVar6;
  ulong uVar7;
  int iVar8;
  byte *pbVar9;
  long lVar10;
  uint uVar11;
  byte *pbVar12;
  uint uVar13;
  
  if (omax < 1) {
    ERR_new();
    ERR_set_debug("crypto/asn1/asn1_lib.c",0x38,"ASN1_get_object");
    uVar4 = 0xe0;
    goto LAB_009f0d20;
  }
  pbVar5 = *pp;
  lVar10 = omax + -1;
  pbVar9 = pbVar5 + 1;
  bVar1 = *pbVar5;
  uVar11 = bVar1 & 0x1f;
  uVar13 = bVar1 & 0xc0;
  if (uVar11 == 0x1f) {
    if (lVar10 != 0) {
      pbVar9 = pbVar5 + 2;
      lVar10 = omax + -2;
      if (lVar10 != 0) {
        *ptag = pbVar5[1] & 0x7f;
        *pclass = uVar13;
        if (1 < omax + -1) goto LAB_009f0c2c;
      }
    }
  }
  else if (lVar10 != 0) {
    *ptag = uVar11;
    *pclass = uVar13;
LAB_009f0c2c:
    bVar2 = *pbVar9;
    uVar11 = bVar1 & 0x20;
    if (bVar2 == 0x80) {
      *plength = 0;
      if ((bVar1 & 0x20) != 0) {
        uVar7 = 0;
        pbVar9 = pbVar9 + 1;
        uVar13 = 1;
        goto LAB_009f0c68;
      }
    }
    else {
      uVar13 = bVar2 & 0x7f;
      uVar7 = (ulong)uVar13;
      pbVar9 = pbVar9 + 1;
      if (-1 < (char)bVar2) {
LAB_009f0c60:
        uVar13 = 0;
        *plength = uVar7;
LAB_009f0c68:
        if ((long)(pbVar5 + (omax - (long)pbVar9)) < (long)uVar7) {
          ERR_new();
          ERR_set_debug("crypto/asn1/asn1_lib.c",0x5f,"ASN1_get_object");
          ERR_set_error(0xd,0x9b,0);
          uVar11 = uVar11 | 0x80;
        }
        *pp = pbVar9;
        return uVar11 | uVar13;
      }
      if ((long)(ulong)(uVar13 + 1) < lVar10) {
        if ((bVar2 & 0x7f) == 0) {
LAB_009f0d6c:
          uVar7 = 0;
          goto LAB_009f0c60;
        }
        do {
          uVar6 = (uint)uVar7;
          uVar13 = uVar6;
          if (*pbVar9 != 0) break;
          uVar13 = uVar6 - 1;
          uVar7 = (ulong)uVar13;
          pbVar9 = pbVar9 + 1;
        } while (uVar13 != 0 && 0 < (int)uVar6);
        if ((int)uVar13 < 9) {
          if ((int)uVar13 < 1) goto LAB_009f0d6c;
          iVar8 = uVar13 + 1;
          uVar7 = 0;
          pbVar12 = pbVar9;
          do {
            pbVar9 = pbVar12 + 1;
            iVar8 = iVar8 + -1;
            uVar3 = uVar7 << 8;
            uVar7 = *pbVar12 | uVar3;
            pbVar12 = pbVar9;
          } while (1 < iVar8);
          if (-1 < (long)uVar3) goto LAB_009f0c60;
        }
      }
    }
  }
  ERR_new();
  ERR_set_debug("crypto/asn1/asn1_lib.c",0x69,"ASN1_get_object");
  uVar4 = 0x7b;
LAB_009f0d20:
  ERR_set_error(0xd,uVar4,0);
  return 0x80;
}

