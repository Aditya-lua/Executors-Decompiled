/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00854258
 */

void FUN_00854258(long *param_1)

{
  byte bVar1;
  int iVar2;
  ulong uVar3;
  long lVar4;
  uint uVar5;
  int iVar6;
  ulong uVar7;
  
  iVar2 = (int)param_1[2];
  uVar3 = param_1[1];
  uVar5 = iVar2 + 1;
  *(uint *)(param_1 + 2) = uVar5;
  if (uVar3 <= uVar5) {
    return;
  }
  lVar4 = *param_1;
  bVar1 = *(byte *)(lVar4 + (ulong)uVar5);
  if (bVar1 < 0xd) {
    if (bVar1 == 0) {
      return;
    }
    if (bVar1 != 10) {
LAB_008542dc:
      iVar2 = iVar2 + 2;
      goto LAB_008542e0;
    }
    iVar6 = *(int *)((long)param_1 + 0x14);
    iVar2 = iVar2 + 2;
  }
  else {
    if (bVar1 == 0x7a) {
      uVar7 = (ulong)(iVar2 + 2U);
      *(uint *)(param_1 + 2) = iVar2 + 2U;
      if (uVar3 <= uVar7) {
        return;
      }
      iVar6 = *(int *)((long)param_1 + 0x14);
      uVar5 = iVar2 + 3;
      do {
        bVar1 = *(byte *)(lVar4 + uVar7);
        if (0x20 < bVar1) {
          return;
        }
        if ((1L << ((ulong)bVar1 & 0x3f) & 0x100003a00U) == 0) {
          if ((ulong)bVar1 != 10) {
            return;
          }
          iVar6 = iVar6 + 1;
          *(int *)((long)param_1 + 0x14) = iVar6;
          *(uint *)(param_1 + 3) = uVar5;
        }
        uVar7 = (ulong)uVar5;
        *(uint *)(param_1 + 2) = uVar5;
        uVar5 = uVar5 + 1;
      } while (uVar7 < uVar3);
      return;
    }
    if (bVar1 != 0xd) goto LAB_008542dc;
    uVar5 = iVar2 + 2;
    *(uint *)(param_1 + 2) = uVar5;
    if (uVar3 <= uVar5) {
      return;
    }
    if (*(char *)(lVar4 + (ulong)uVar5) != '\n') {
      return;
    }
    iVar6 = *(int *)((long)param_1 + 0x14);
    iVar2 = iVar2 + 3;
  }
  *(int *)((long)param_1 + 0x14) = iVar6 + 1;
  *(int *)(param_1 + 3) = iVar2;
LAB_008542e0:
  *(int *)(param_1 + 2) = iVar2;
  return;
}

