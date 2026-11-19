/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009f3a88
 */

int ossl_i2c_uint64_int(undefined1 *param_1,ulong param_2,int param_3)

{
  char cVar1;
  long lVar2;
  ulong uVar3;
  uint uVar4;
  int iVar5;
  ulong uVar6;
  long lVar7;
  ulong uVar8;
  byte *pbVar9;
  byte bVar10;
  ulong uVar11;
  byte bVar12;
  ulong uVar13;
  long lVar14;
  uint uVar15;
  char acStack_3 [3];
  
  uVar8 = 0;
  do {
    uVar13 = uVar8;
    uVar3 = param_2 >> 8;
    uVar8 = uVar13 - 1;
    uVar4 = (uint)param_2;
    cVar1 = (char)param_2;
    acStack_3[uVar13 + 2] = cVar1;
    param_2 = uVar3;
  } while (uVar3 != 0);
  if (uVar8 == 0) {
    uVar3 = 0;
    uVar13 = 0;
    uVar4 = 0;
    iVar5 = 1;
    goto joined_r0x009f3afc;
  }
  uVar3 = -uVar8;
  iVar5 = (int)uVar8;
  if (param_3 == 0) {
    uVar4 = 0;
    uVar15 = (uint)(cVar1 < '\0');
    uVar13 = (ulong)uVar15;
    iVar5 = uVar15 - iVar5;
    goto joined_r0x009f3afc;
  }
  uVar4 = uVar4 & 0xff;
  if (0x80 < uVar4) {
    uVar4 = 0xff;
    uVar13 = 1;
    iVar5 = 1 - iVar5;
    goto joined_r0x009f3afc;
  }
  if (uVar4 != 0x80) {
    uVar13 = 0;
    uVar4 = 0xff;
    iVar5 = -iVar5;
    goto joined_r0x009f3afc;
  }
  uVar4 = 0;
  if (1 < uVar3) {
    uVar11 = ~uVar8;
    if (uVar11 < 2) {
      bVar10 = 0;
      uVar6 = 1;
LAB_009f3be0:
      lVar7 = uVar6 + uVar8;
      lVar14 = lVar7 + 1;
      do {
        lVar2 = lVar7 + 3;
        lVar14 = lVar14 + 1;
        lVar7 = lVar7 + 1;
        bVar10 = bVar10 | acStack_3[lVar2];
      } while (lVar14 != 1);
    }
    else {
      bVar12 = 0;
      bVar10 = 0;
      uVar6 = uVar11 | 1;
      pbVar9 = (byte *)(acStack_3 + uVar13 + 4);
      uVar13 = uVar11 & 0xfffffffffffffffe;
      do {
        uVar13 = uVar13 - 2;
        bVar12 = bVar12 | pbVar9[-1];
        bVar10 = bVar10 | *pbVar9;
        pbVar9 = pbVar9 + 2;
      } while (uVar13 != 0);
      bVar10 = bVar10 | bVar12;
      if (uVar11 != (uVar11 & 0xfffffffffffffffe)) goto LAB_009f3be0;
    }
    uVar4 = -(uint)(bVar10 != 0);
  }
  uVar13 = (ulong)(uVar4 & 1);
  iVar5 = (uVar4 & 1) - iVar5;
joined_r0x009f3afc:
  if ((param_1 != (undefined1 *)0x0) && (*param_1 = (char)uVar4, uVar3 != 0)) {
    pbVar9 = (byte *)(acStack_3 + uVar8 + uVar3 + 3);
    uVar15 = uVar4 & 1;
    do {
      pbVar9 = pbVar9 + -1;
      lVar14 = uVar3 + uVar13;
      uVar3 = uVar3 - 1;
      uVar15 = uVar15 + ((uint)*pbVar9 ^ uVar4 & 0xff);
      param_1[lVar14 + -1] = (char)uVar15;
      uVar15 = uVar15 >> 8;
    } while (uVar3 != 0);
  }
  return iVar5;
}

