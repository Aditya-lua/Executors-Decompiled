/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008aba9c
 */

long FUN_008aba9c(long param_1,uint param_2,int *param_3)

{
  short sVar1;
  int iVar2;
  long *plVar3;
  code *pcVar4;
  long lVar5;
  
  if ((int)param_2 < 1) {
    if ((int)param_2 < -9999) {
      plVar3 = (long *)FUN_008aea7c();
    }
    else {
      plVar3 = (long *)(*(long *)(param_1 + 0x68) + (long)(int)param_2 * 0x10);
    }
  }
  else {
    plVar3 = (long *)((*(long *)(param_1 + 0x70) + (ulong)param_2 * 0x10) - 0x10);
    if (*(long **)(param_1 + 0x68) <= plVar3) {
      if ((DAT_00d1f1e0 & 1) == 0) {
        iVar2 = __cxa_guard_acquire(&DAT_00d1f1e0);
        if (iVar2 != 0) {
                    /* try { // try from 008abbbc to 008abbbf has its CatchHandler @ 008abbd8 */
          DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
          __cxa_guard_release(&DAT_00d1f1e0);
        }
      }
      plVar3 = (long *)((long)&DWORD_007f2ef0 + DAT_00d1f1d8);
    }
  }
  if (*(int *)((long)plVar3 + 0xc) == 5) {
    lVar5 = *plVar3;
    if (param_3 != (int *)0x0) {
      sVar1 = *(short *)(lVar5 + 6);
      if (sVar1 == -0x8000) {
        pcVar4 = *(code **)(*(long *)(param_1 + 0x60) + 0x6a8);
        if (pcVar4 == (code *)0x0) {
          sVar1 = -1;
        }
        else {
          sVar1 = (*pcVar4)(param_1,lVar5 + 0x18,*(undefined4 *)(lVar5 + 0x14));
        }
        *(short *)(lVar5 + 6) = sVar1;
      }
      *param_3 = (int)sVar1;
    }
    lVar5 = lVar5 + 0x18;
  }
  else {
    lVar5 = 0;
  }
  return lVar5;
}

