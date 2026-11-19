/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00852f98
 */

undefined1  [16] FUN_00852f98(long *param_1,byte *param_2,uint param_3)

{
  undefined8 *puVar1;
  int iVar2;
  ulong uVar3;
  long lVar4;
  byte *pbVar5;
  ulong uVar6;
  void *__s1;
  long lVar7;
  long lVar8;
  undefined1 auVar9 [16];
  
  if (param_1[5] != 0) {
    if (param_3 == 0) {
      uVar3 = 0x8fc5e37bc9b65d29;
    }
    else {
      uVar3 = 0x811c9dc5;
      pbVar5 = param_2;
      uVar6 = (ulong)param_3;
      do {
        uVar6 = uVar6 - 1;
        uVar3 = (ulong)(((uint)uVar3 ^ (uint)*pbVar5) * 0x1000193);
        pbVar5 = pbVar5 + 1;
      } while (uVar6 != 0);
      uVar3 = uVar3 * -0x61c8864680b583eb;
    }
    lVar7 = param_1[3];
    uVar3 = uVar3 >> ((ulong)*(byte *)(param_1 + 6) & 0x3f);
    if ((*(ulong *)(lVar7 + (uVar3 >> 6) * 8) >> (uVar3 & 0x3f) & 1) != 0) {
      lVar4 = param_1[4];
      lVar8 = *param_1;
      uVar6 = 0x119;
      do {
        puVar1 = (undefined8 *)(lVar8 + uVar3 * 0x10);
        if (*(uint *)(puVar1 + 1) == param_3) {
          __s1 = (void *)*puVar1;
          iVar2 = memcmp(__s1,param_2,(ulong)param_3);
          if (iVar2 == 0) {
            uVar6 = (ulong)*(uint *)((long)puVar1 + 0xc);
            goto LAB_008530a8;
          }
        }
        uVar3 = uVar3 + 1 & lVar4 - 1U;
      } while ((*(ulong *)(lVar7 + (uVar3 >> 6) * 8) >> (uVar3 & 0x3f) & 1) != 0);
      __s1 = (void *)0x0;
      goto LAB_008530a8;
    }
  }
  __s1 = (void *)0x0;
  uVar6 = 0x119;
LAB_008530a8:
  auVar9._8_8_ = uVar6;
  auVar9._0_8_ = __s1;
  return auVar9;
}

