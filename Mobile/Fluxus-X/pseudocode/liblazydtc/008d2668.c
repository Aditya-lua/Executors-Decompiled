/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008d2668
 */

int LZ4_loadDictSlow(void *param_1,long *param_2,uint param_3)

{
  long lVar1;
  uint uVar2;
  int iVar3;
  long *plVar4;
  long *plVar5;
  int iVar6;
  long *plVar8;
  long *plVar7;
  ulong uVar9;
  int iVar10;
  
  memset(param_1,0,0x4020);
  uVar2 = *(uint *)((long)param_1 + 0x4010);
  iVar3 = 0;
  iVar6 = uVar2 + 0x10000;
  *(int *)((long)param_1 + 0x4010) = iVar6;
  if (7 < (int)param_3) {
    lVar1 = (long)param_2 + (ulong)param_3;
    plVar5 = (long *)(lVar1 - 8);
    plVar4 = (long *)(lVar1 - 0x10000);
    if (param_3 < 0x10001) {
      plVar4 = param_2;
    }
    iVar3 = (int)lVar1 - (int)plVar4;
    *(long **)((long)param_1 + 0x4000) = plVar4;
    *(undefined4 *)((long)param_1 + 0x4014) = 2;
    *(int *)((long)param_1 + 0x4018) = iVar3;
    if (plVar4 <= plVar5) {
      iVar6 = iVar6 - iVar3;
      plVar8 = plVar4;
      iVar10 = iVar6;
      do {
        plVar7 = (long *)((long)plVar8 + 3);
        *(int *)((long)param_1 + ((ulong)(*plVar8 * -0x30e4432345000000) >> 0x32 & 0x3ffc)) = iVar10
        ;
        iVar10 = iVar10 + 3;
        plVar8 = plVar7;
      } while (plVar7 <= plVar5);
      do {
        uVar9 = (ulong)(*plVar4 * -0x30e4432345000000) >> 0x34;
        if (*(uint *)((long)param_1 + uVar9 * 4) <= uVar2) {
          *(int *)((long)param_1 + uVar9 * 4) = iVar6;
        }
        plVar4 = (long *)((long)plVar4 + 1);
        iVar6 = iVar6 + 1;
      } while (plVar4 <= plVar5);
    }
  }
  return iVar3;
}

