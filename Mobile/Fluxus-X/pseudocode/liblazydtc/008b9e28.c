/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b9e28
 */

long FUN_008b9e28(long param_1,long param_2)

{
  int *piVar1;
  int *piVar2;
  int *piVar3;
  uint uVar4;
  ulong uVar5;
  int iVar6;
  ulong uVar7;
  uint uVar8;
  uint uVar9;
  undefined8 uVar10;
  ulong __n;
  long lVar11;
  uint uVar12;
  long lVar13;
  
  uVar4 = *(uint *)(param_2 + 0x14);
  __n = (ulong)uVar4;
  if (uVar4 < 0x20) {
    if (uVar4 == 0) {
      uVar12 = 0;
      goto LAB_008b9ee4;
    }
    lVar13 = param_2 + 0x17;
    uVar7 = __n;
    uVar12 = uVar4;
  }
  else {
    uVar8 = 0;
    uVar9 = 0;
    lVar13 = param_2 + 0x17;
    uVar7 = __n;
    uVar12 = uVar4;
    do {
      piVar1 = (int *)(lVar13 + 9);
      piVar2 = (int *)(lVar13 + 1);
      uVar7 = uVar7 - 0xc;
      piVar3 = (int *)(lVar13 + 5);
      lVar13 = lVar13 + 0xc;
      uVar12 = *piVar1 + uVar12;
      uVar9 = (uVar12 ^ *piVar2 + uVar9) - (uVar12 >> 0xe | uVar12 * 0x40000);
      uVar8 = (uVar9 ^ *piVar3 + uVar8) - (uVar9 >> 0xb | uVar9 * 0x200000);
      uVar12 = (uVar8 ^ uVar12) - (uVar8 >> 0x19 | uVar8 * 0x80);
    } while (0x1f < uVar7);
  }
  do {
    uVar5 = uVar7 - 1;
    uVar12 = uVar12 * 0x20 + (uVar12 >> 2) + (uint)*(byte *)(lVar13 + uVar7) ^ uVar12;
    uVar7 = uVar5;
  } while (uVar5 != 0);
LAB_008b9ee4:
  lVar13 = *(long *)(param_1 + 0x60);
  if (DAT_00d1fbd8 == '\x01') {
    uVar9 = *(int *)(lVar13 + 0x30) + *(int *)(lVar13 + 0x28) * uVar12 >>
            (ulong)(*(byte *)(lVar13 + 0x44) & 0x1f);
  }
  else {
    uVar9 = *(int *)(lVar13 + 0x2c) - 1U & uVar12;
  }
  lVar11 = *(long *)(*(long *)(lVar13 + 0x38) + (long)(int)uVar9 * 8);
  while( true ) {
    if (lVar11 == 0) {
      *(undefined1 *)(param_2 + 0x18 + __n) = 0;
      *(undefined4 *)(param_2 + 4) = 0x8000ffff;
      lVar11 = *(long *)(lVar13 + 0x38);
      iVar6 = *(int *)(lVar13 + 0x40);
      uVar8 = *(uint *)(lVar13 + 0x2c);
      *(uint *)(param_2 + 0x10) = uVar12;
      uVar10 = *(undefined8 *)(lVar11 + (long)(int)uVar9 * 8);
      uVar4 = iVar6 + 1;
      *(uint *)(lVar13 + 0x40) = uVar4;
      *(undefined8 *)(param_2 + 8) = uVar10;
      *(long *)(lVar11 + (long)(int)uVar9 * 8) = param_2;
      if ((uVar8 < uVar4) && ((int)uVar8 < 0x40000000)) {
        FUN_008b9b8c(param_1,uVar8 << 1);
      }
      return param_2;
    }
    if ((*(uint *)(lVar11 + 0x14) == uVar4) &&
       (iVar6 = memcmp((void *)(lVar11 + 0x18),(void *)(param_2 + 0x18),__n), iVar6 == 0)) break;
    lVar11 = *(long *)(lVar11 + 8);
  }
  if ((*(byte *)(lVar13 + 2) & 3 ^ *(byte *)(lVar11 + 2) & 0xb) == 3) {
    *(byte *)(lVar11 + 2) = *(byte *)(lVar11 + 2) ^ 3;
    return lVar11;
  }
  return lVar11;
}

