/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008a6fe4
 */

void FUN_008a6fe4(long *param_1,ulong param_2)

{
  long lVar1;
  byte bVar2;
  ulong uVar3;
  ulong uVar4;
  ulong uVar5;
  long lVar6;
  ulong *puVar7;
  ulong uVar8;
  ulong uVar9;
  
  lVar1 = param_1[3];
  uVar4 = param_1[4] - 1;
  uVar5 = param_2 + 1 & uVar4;
  uVar8 = 1L << (uVar5 & 0x3f);
  puVar7 = (ulong *)(lVar1 + (uVar5 >> 6) * 8);
  if ((*puVar7 & uVar8) != 0) {
    lVar6 = *param_1;
    bVar2 = *(byte *)(param_1 + 6);
    do {
      uVar9 = *(ulong *)(lVar6 + uVar5 * 8);
      uVar3 = (uVar9 >> 4 ^ uVar9 >> 9) * -0x61c8864680b583eb >> ((ulong)bVar2 & 0x3f);
      if ((param_2 - uVar3 & uVar4) < (uVar5 - uVar3 & uVar4)) {
        *(ulong *)(lVar6 + param_2 * 8) = uVar9;
        uVar3 = param_2 >> 3 & 0x1ffffffffffffff8;
        *(ulong *)(lVar1 + uVar3) = *(ulong *)(lVar1 + uVar3) | 1L << (param_2 & 0x3f);
        *puVar7 = *puVar7 & (uVar8 ^ 0xffffffffffffffff);
        param_2 = uVar5;
      }
      uVar5 = uVar5 + 1 & uVar4;
      uVar8 = 1L << (uVar5 & 0x3f);
      puVar7 = (ulong *)(lVar1 + (uVar5 >> 6) * 8);
    } while ((*puVar7 & uVar8) != 0);
  }
  uVar4 = param_2 >> 3 & 0x1ffffffffffffff8;
  *(ulong *)(lVar1 + uVar4) =
       *(ulong *)(lVar1 + uVar4) & (1L << (param_2 & 0x3f) ^ 0xffffffffffffffffU);
  param_1[5] = param_1[5] + -1;
  return;
}

