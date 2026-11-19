/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009fb854
 */

int BIO_dump_indent_cb(cb *cb,void *u,char *s,int len,int indent)

{
  byte *pbVar1;
  uint param3;
  int iVar2;
  uint param5;
  int iVar3;
  bool bVar4;
  uint uVar5;
  int iVar6;
  int iVar7;
  size_t len_00;
  long lVar8;
  uchar param4;
  uint uVar9;
  ulong uVar10;
  int iVar11;
  byte bVar12;
  int iVar13;
  long lVar14;
  ulong uVar15;
  ulong uVar16;
  byte abStack_18c [300];
  
  if (0x3f < indent) {
    indent = 0x40;
  }
  param3 = indent & (indent >> 0x1f ^ 0xffffffffU);
  uVar9 = param3;
  if (5 < (int)param3) {
    uVar9 = 6;
  }
  iVar3 = (param3 + 3) - uVar9;
  iVar2 = iVar3 + 3;
  if (-1 < iVar3) {
    iVar2 = iVar3;
  }
  uVar9 = -(iVar2 >> 2) + 0x10;
  iVar3 = 0;
  if (uVar9 != 0) {
    iVar3 = len / (int)uVar9;
  }
  if ((int)(iVar3 * uVar9) < len) {
    iVar3 = iVar3 + 1;
  }
  if (iVar3 < 1) {
    iVar7 = 0;
  }
  else {
    iVar13 = 0;
    lVar14 = 0;
    iVar7 = 0;
    do {
      param5 = (int)lVar14 * uVar9;
      uVar5 = BIO_snprintf((char *)abStack_18c,0x121,"%*s%04x - ",param3,"",param5);
      uVar16 = (ulong)uVar5;
      lVar8 = (long)(int)uVar5;
      uVar10 = 0x121 - lVar8;
      if (0 < (int)uVar9) {
        uVar15 = 0;
        do {
          if (3 < uVar10) {
            if (iVar13 + (int)uVar15 < len) {
              param4 = '-';
              if (uVar15 != 7) {
                param4 = ' ';
              }
              BIO_snprintf((char *)(abStack_18c + lVar8),4,"%02x%c",
                           (uint)(byte)s[uVar15 + (long)iVar13],param4);
            }
            else {
              pbVar1 = abStack_18c + lVar8;
              pbVar1[0] = 0x20;
              pbVar1[1] = 0x20;
              pbVar1[2] = 0x20;
              pbVar1[3] = 0;
            }
            uVar16 = (ulong)((int)uVar16 + 3);
          }
          uVar15 = uVar15 + 1;
          lVar8 = (long)(int)uVar16;
          uVar10 = 0x121 - lVar8;
        } while (uVar9 != uVar15);
      }
      if (2 < uVar10) {
        uVar16 = (ulong)((int)uVar16 + 2);
        abStack_18c[lVar8 + 2] = 0;
        (abStack_18c + lVar8)[0] = 0x20;
        (abStack_18c + lVar8)[1] = 0x20;
      }
      iVar6 = (int)uVar16;
      uVar10 = (ulong)iVar6;
      bVar4 = (uVar10 | 1) == 0x121;
      if ((0 < (int)uVar9) && ((int)param5 < len)) {
        uVar15 = uVar10;
        lVar8 = 0;
        do {
          iVar6 = (int)uVar16;
          if (bVar4) {
            uVar10 = (ulong)iVar6;
          }
          else {
            bVar12 = s[lVar8 + iVar13];
            uVar10 = (long)iVar6 + 1;
            if (0x5e < bVar12 - 0x20) {
              bVar12 = 0x2e;
            }
            abStack_18c[uVar15] = bVar12;
            abStack_18c[(long)iVar6 + 1] = 0;
            uVar16 = uVar10;
          }
          iVar6 = (int)uVar16;
          bVar4 = (uVar10 | 1) == 0x121;
        } while ((lVar8 + 1 < (long)(int)uVar9) &&
                (iVar11 = (int)lVar8, uVar15 = uVar10, lVar8 = lVar8 + 1, iVar13 + iVar11 + 1 < len)
                );
      }
      if (bVar4) {
        len_00 = (size_t)iVar6;
      }
      else {
        len_00 = (long)iVar6 + 1;
        abStack_18c[uVar10] = 10;
        abStack_18c[(long)iVar6 + 1] = 0;
      }
      iVar6 = (*cb)(abStack_18c,len_00,u);
      if (iVar6 < 0) {
        return iVar6;
      }
      lVar14 = lVar14 + 1;
      iVar7 = iVar6 + iVar7;
      iVar13 = iVar13 + -(iVar2 >> 2) + 0x10;
    } while (lVar14 < iVar3);
  }
  return iVar7;
}

