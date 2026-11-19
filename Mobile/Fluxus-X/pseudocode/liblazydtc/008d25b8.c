/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008d25b8
 */

int LZ4_loadDict(void *param_1,long *param_2,uint param_3)

{
  long lVar1;
  int iVar2;
  long *plVar4;
  long *plVar3;
  int iVar5;
  
  memset(param_1,0,0x4020);
  iVar2 = 0;
  iVar5 = *(int *)((long)param_1 + 0x4010) + 0x10000;
  *(int *)((long)param_1 + 0x4010) = iVar5;
  if (7 < (int)param_3) {
    lVar1 = (long)param_2 + (ulong)param_3;
    plVar4 = (long *)(lVar1 - 0x10000);
    if (param_3 < 0x10001) {
      plVar4 = param_2;
    }
    iVar2 = (int)lVar1 - (int)plVar4;
    *(long **)((long)param_1 + 0x4000) = plVar4;
    *(undefined4 *)((long)param_1 + 0x4014) = 2;
    *(int *)((long)param_1 + 0x4018) = iVar2;
    if (plVar4 <= (long *)(lVar1 - 8U)) {
      iVar5 = iVar5 - iVar2;
      do {
        plVar3 = (long *)((long)plVar4 + 3);
        *(int *)((long)param_1 + ((ulong)(*plVar4 * -0x30e4432345000000) >> 0x32 & 0x3ffc)) = iVar5;
        iVar5 = iVar5 + 3;
        plVar4 = plVar3;
      } while (plVar3 <= (long *)(lVar1 - 8U));
    }
  }
  return iVar2;
}

