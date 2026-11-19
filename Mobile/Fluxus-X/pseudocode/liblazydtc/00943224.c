/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00943224
 */

void FUN_00943224(long param_1,int param_2,long param_3,uint param_4,int param_5,uint param_6)

{
  uint *puVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  byte bVar5;
  int iVar6;
  undefined4 uVar7;
  uint uVar8;
  long lVar9;
  
  lVar9 = *(long *)(param_1 + 0x20);
  bVar5 = FUN_00932de0();
  if (((*(byte *)(lVar9 + 0x3a2) >> 6 & 1) == 0) &&
     ((*(byte *)(lVar9 + 0x574) < 0x14 & (bVar5 ^ 0xff)) != 0)) {
    if (param_2 == -1) {
      uVar7 = 0xffffffff;
    }
    else {
      uVar7 = *(undefined4 *)(lVar9 + (long)param_2 * 4 + 0x220);
    }
    *(undefined4 *)(lVar9 + 0x3c8) = uVar7;
    if (param_5 == -1) {
      uVar7 = 0xffffffff;
    }
    else {
      uVar7 = *(undefined4 *)(lVar9 + (long)param_5 * 4 + 0x220);
    }
    *(undefined4 *)(lVar9 + 0x3cc) = uVar7;
  }
  else {
    iVar6 = param_2;
    if ((param_2 != -1) || (iVar6 = param_5, param_5 != -1)) {
      iVar6 = *(int *)(lVar9 + (long)iVar6 * 4 + 0x220);
    }
    *(int *)(lVar9 + 0x3c8) = iVar6;
    *(int *)(lVar9 + 0x3cc) = iVar6;
    iVar6 = 0;
    if ((bVar5 & 1) == 0) {
      iVar6 = param_5;
    }
    param_5 = iVar6;
  }
  puVar1 = (uint *)(param_1 + 0x1b1);
  uVar4 = *puVar1;
  uVar2 = (param_4 & 1) << 0xe;
  uVar3 = (param_6 & 1) << 0x12;
  uVar8 = uVar4 & 0xfff80000 | uVar4 & 0x38000 | uVar4 & 0x3fff | uVar2 | uVar3;
  *(long *)(param_1 + 0xd8) = param_3;
  *puVar1 = uVar8;
  if ((param_4 & 1) == 0) {
    uVar8 = uVar4 & 0xfff80000 | uVar4 & 0x38000 | uVar4 & 0x3ffe | uVar2 | uVar3;
    *puVar1 = uVar8;
    if (0 < param_3) {
      FUN_00931c24(param_1,param_3);
      uVar8 = *puVar1;
    }
  }
  if ((uVar8 & 0xc000) != 0x8000) {
    if (param_2 != -1) {
      *(uint *)(param_1 + 0x128) = *(uint *)(param_1 + 0x128) | 1;
    }
    if (param_5 != -1) {
      *(uint *)(param_1 + 0x128) = *(uint *)(param_1 + 0x128) | 2;
    }
  }
  return;
}

