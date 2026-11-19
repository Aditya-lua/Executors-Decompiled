/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0085546c
 */

long FUN_0085546c(long *param_1,undefined8 *param_2)

{
  undefined8 *puVar1;
  uint uVar2;
  int iVar3;
  ulong uVar4;
  ulong uVar5;
  long lVar6;
  byte *pbVar7;
  ulong uVar8;
  ulong uVar9;
  void *__s2;
  long lVar10;
  long lVar11;
  undefined8 uVar12;
  
  uVar2 = *(uint *)(param_2 + 1);
  if (uVar2 == 0) {
    uVar4 = 0x8fc5e37bc9b65d29;
  }
  else {
    uVar4 = 0x811c9dc5;
    pbVar7 = (byte *)*param_2;
    uVar5 = (ulong)uVar2;
    do {
      uVar5 = uVar5 - 1;
      uVar4 = (ulong)(((uint)uVar4 ^ (uint)*pbVar7) * 0x1000193);
      pbVar7 = pbVar7 + 1;
    } while (uVar5 != 0);
    uVar4 = uVar4 * -0x61c8864680b583eb;
  }
  lVar11 = param_1[3];
  lVar10 = *param_1;
  uVar4 = uVar4 >> ((ulong)*(byte *)(param_1 + 6) & 0x3f);
  uVar5 = uVar4 >> 6;
  uVar9 = 1L << (uVar4 & 0x3f);
  uVar8 = *(ulong *)(lVar11 + uVar5 * 8);
  if ((uVar9 & uVar8) != 0) {
    lVar6 = param_1[4];
    __s2 = (void *)*param_2;
    do {
      puVar1 = (undefined8 *)(lVar10 + uVar4 * 0x10);
      if ((*(uint *)(puVar1 + 1) == uVar2) &&
         (iVar3 = memcmp((void *)*puVar1,__s2,(ulong)uVar2), iVar3 == 0)) goto LAB_0085558c;
      uVar4 = uVar4 + 1 & lVar6 - 1U;
      uVar5 = uVar4 >> 6;
      uVar9 = 1L << (uVar4 & 0x3f);
      uVar8 = *(ulong *)(lVar11 + uVar5 * 8);
    } while ((uVar8 & uVar9) != 0);
  }
  *(ulong *)(lVar11 + uVar5 * 8) = uVar8 | uVar9;
  uVar12 = *param_2;
  puVar1 = (undefined8 *)(lVar10 + uVar4 * 0x10);
  puVar1[1] = param_2[1];
  *puVar1 = uVar12;
  lVar10 = *param_1;
  param_1[5] = param_1[5] + 1;
LAB_0085558c:
  return lVar10 + uVar4 * 0x10;
}

