/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00853270
 */

void * FUN_00853270(long *param_1,byte *param_2)

{
  undefined8 *puVar1;
  int iVar2;
  size_t sVar3;
  ulong uVar4;
  long lVar5;
  byte *pbVar6;
  ulong uVar7;
  void *__s1;
  long lVar8;
  long lVar9;
  
  sVar3 = strlen((char *)param_2);
  if (param_1[5] != 0) {
    if ((int)sVar3 == 0) {
      uVar4 = 0x8fc5e37bc9b65d29;
    }
    else {
      uVar4 = 0x811c9dc5;
      pbVar6 = param_2;
      uVar7 = sVar3 & 0xffffffff;
      do {
        uVar7 = uVar7 - 1;
        uVar4 = (ulong)(((uint)uVar4 ^ (uint)*pbVar6) * 0x1000193);
        pbVar6 = pbVar6 + 1;
      } while (uVar7 != 0);
      uVar4 = uVar4 * -0x61c8864680b583eb;
    }
    lVar8 = param_1[3];
    uVar4 = uVar4 >> ((ulong)*(byte *)(param_1 + 6) & 0x3f);
    if ((*(ulong *)(lVar8 + (uVar4 >> 6) * 8) >> (uVar4 & 0x3f) & 1) != 0) {
      lVar5 = param_1[4];
      lVar9 = *param_1;
      do {
        puVar1 = (undefined8 *)(lVar9 + uVar4 * 0x10);
        if (*(int *)(puVar1 + 1) == (int)sVar3) {
          __s1 = (void *)*puVar1;
          iVar2 = memcmp(__s1,param_2,sVar3 & 0xffffffff);
          if (iVar2 == 0) {
            return __s1;
          }
        }
        uVar4 = uVar4 + 1 & lVar5 - 1U;
      } while ((*(ulong *)(lVar8 + (uVar4 >> 6) * 8) >> (uVar4 & 0x3f) & 1) != 0);
    }
  }
  return (void *)0x0;
}

