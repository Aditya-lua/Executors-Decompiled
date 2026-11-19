/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00855340
 */

void FUN_00855340(long *param_1,undefined8 *param_2)

{
  undefined8 *puVar1;
  long lVar2;
  uint uVar3;
  int iVar4;
  ulong uVar5;
  byte *pbVar6;
  ulong uVar7;
  void *__s2;
  long lVar8;
  long lVar9;
  
  lVar2 = param_1[4];
  if ((ulong)param_1[5] < (ulong)(lVar2 * 3) >> 2) {
    return;
  }
  if (param_1[5] != 0) {
    uVar3 = *(uint *)(param_2 + 1);
    if (uVar3 == 0) {
      uVar5 = 0x8fc5e37bc9b65d29;
    }
    else {
      uVar5 = 0x811c9dc5;
      pbVar6 = (byte *)*param_2;
      uVar7 = (ulong)uVar3;
      do {
        uVar7 = uVar7 - 1;
        uVar5 = (ulong)(((uint)uVar5 ^ (uint)*pbVar6) * 0x1000193);
        pbVar6 = pbVar6 + 1;
      } while (uVar7 != 0);
      uVar5 = uVar5 * -0x61c8864680b583eb;
    }
    lVar8 = param_1[3];
    uVar5 = uVar5 >> ((ulong)*(byte *)(param_1 + 6) & 0x3f);
    if ((*(ulong *)(lVar8 + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) != 0) {
      lVar9 = *param_1;
      __s2 = (void *)*param_2;
      do {
        puVar1 = (undefined8 *)(lVar9 + uVar5 * 0x10);
        if ((*(uint *)(puVar1 + 1) == uVar3) &&
           (iVar4 = memcmp((void *)*puVar1,__s2,(ulong)uVar3), iVar4 == 0)) {
          return;
        }
        uVar5 = uVar5 + 1 & lVar2 - 1U;
      } while ((*(ulong *)(lVar8 + (uVar5 >> 6) * 8) >> (uVar5 & 0x3f) & 1) != 0);
    }
  }
  FUN_008555ac(param_1);
  return;
}

