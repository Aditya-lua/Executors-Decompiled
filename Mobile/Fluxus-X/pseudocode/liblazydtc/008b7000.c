/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008b7000
 */

void FUN_008b7000(long param_1)

{
  ulong *puVar1;
  uint uVar2;
  int iVar3;
  ulong uVar4;
  ulong uVar5;
  ulong uVar6;
  ulong uVar7;
  ulong uVar8;
  long lVar9;
  
  uVar4 = *(ulong *)(param_1 + 0x20);
  uVar5 = *(ulong *)(param_1 + 0x50);
  uVar7 = *(ulong *)(param_1 + 0x68);
  if (uVar4 <= uVar5) {
    uVar6 = uVar4;
    uVar8 = uVar7;
    do {
      puVar1 = (ulong *)(uVar6 + 0x18);
      uVar6 = uVar6 + 0x30;
      uVar7 = *puVar1;
      if (*puVar1 <= uVar8) {
        uVar7 = uVar8;
      }
      uVar8 = uVar7;
    } while (uVar6 <= uVar5);
  }
  uVar2 = *(uint *)(param_1 + 0x44);
  if ((int)uVar2 < 0x4e21) {
    lVar9 = *(long *)(param_1 + 0x58);
    if ((0x10 < (int)uVar2) &&
       (iVar3 = (int)(uVar5 - uVar4 >> 4) * -0x55555555,
       (ulong)((long)iVar3 + (long)iVar3 * 2) < (ulong)(long)(int)uVar2)) {
      FUN_008b4164(param_1,uVar2 >> 1);
    }
    uVar2 = *(uint *)(param_1 + 0x40);
    if ((0x5a < (int)uVar2) &&
       (uVar7 = uVar7 - lVar9,
       (ulong)(((long)(uVar7 * 0x10000000) >> 0x20) + (long)(int)(uVar7 >> 4) * 2) <
       (ulong)(long)(int)uVar2)) {
      FUN_008b3fdc(param_1,uVar2 >> 1,0);
      return;
    }
  }
  return;
}

