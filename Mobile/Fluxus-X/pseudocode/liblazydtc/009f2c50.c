/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f2c50
 */

void ossl_i2c_ASN1_INTEGER(uint *param_1,long *param_2)

{
  long lVar1;
  long lVar2;
  long lVar3;
  ulong uVar4;
  byte *pbVar5;
  undefined1 *puVar6;
  byte *pbVar7;
  long lVar8;
  byte bVar9;
  uint uVar10;
  byte bVar11;
  uint uVar12;
  ulong uVar13;
  ulong uVar14;
  
  pbVar7 = *(byte **)(param_1 + 2);
  uVar10 = 0;
  uVar13 = 0;
  lVar8 = 0;
  lVar3 = 1;
  if ((pbVar7 == (byte *)0x0) || (uVar12 = *param_1, uVar12 == 0)) goto LAB_009f2d54;
  bVar11 = *pbVar7;
  lVar8 = (long)(int)uVar12;
  if ((param_1[1] >> 8 & 1) == 0) {
    uVar10 = 0;
    uVar13 = (ulong)((param_1[1] & 0x100) == 0 && (char)bVar11 < '\0');
  }
  else if (bVar11 < 0x81) {
    if (bVar11 == 0x80) {
      uVar10 = 0;
      if (1 < uVar12) {
        uVar13 = lVar8 - 1;
        if (uVar13 < 2) {
          bVar9 = 0;
          uVar4 = 1;
LAB_009f2d2c:
          lVar3 = lVar8 - uVar4;
          pbVar5 = pbVar7 + uVar4;
          do {
            lVar3 = lVar3 + -1;
            bVar9 = bVar9 | *pbVar5;
            pbVar5 = pbVar5 + 1;
          } while (lVar3 != 0);
        }
        else {
          bVar11 = 0;
          bVar9 = 0;
          uVar4 = uVar13 | 1;
          uVar14 = uVar13 & 0xfffffffffffffffe;
          pbVar5 = pbVar7;
          do {
            uVar14 = uVar14 - 2;
            bVar11 = bVar11 | pbVar5[1];
            bVar9 = bVar9 | pbVar5[2];
            pbVar5 = pbVar5 + 2;
          } while (uVar14 != 0);
          bVar9 = bVar9 | bVar11;
          if (uVar13 != (uVar13 & 0xfffffffffffffffe)) goto LAB_009f2d2c;
        }
        uVar10 = -(uint)(bVar9 != 0);
      }
      uVar13 = (ulong)(uVar10 & 1);
    }
    else {
      uVar13 = 0;
      uVar10 = 0xff;
    }
  }
  else {
    uVar10 = 0xff;
    uVar13 = 1;
  }
  lVar3 = uVar13 + lVar8;
LAB_009f2d54:
  if ((param_2 != (long *)0x0) && (puVar6 = (undefined1 *)*param_2, puVar6 != (undefined1 *)0x0)) {
    *puVar6 = (char)uVar10;
    if (lVar8 != 0) {
      uVar12 = uVar10 & 1;
      do {
        lVar2 = lVar8 + -1;
        lVar1 = lVar8 + uVar13;
        lVar8 = lVar8 + -1;
        uVar12 = uVar12 + ((uint)pbVar7[lVar2] ^ uVar10 & 0xff);
        puVar6[lVar1 + -1] = (char)uVar12;
        uVar12 = uVar12 >> 8;
      } while (lVar8 != 0);
    }
    *param_2 = *param_2 + lVar3;
  }
  return;
}

