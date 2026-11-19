/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008adbdc
 */

undefined8 FUN_008adbdc(long param_1,uint param_2)

{
  int iVar1;
  long *plVar2;
  long lVar3;
  
  if ((int)param_2 < 1) {
    if ((int)param_2 < -9999) {
      plVar2 = (long *)FUN_008aea7c(param_1);
      goto LAB_008adc4c;
    }
    plVar2 = (long *)(*(long *)(param_1 + 0x68) + (long)(int)param_2 * 0x10);
    goto LAB_008adc4c;
  }
  plVar2 = (long *)((*(long *)(param_1 + 0x70) + (ulong)param_2 * 0x10) - 0x10);
  if (plVar2 < *(long **)(param_1 + 0x68)) goto LAB_008adc4c;
  if ((DAT_00d1f1e0 & 1) == 0) goto LAB_008adcf4;
  while( true ) {
    plVar2 = (long *)((long)&DWORD_007f2ef0 + DAT_00d1f1d8);
LAB_008adc4c:
    if (*(int *)(*(long *)(param_1 + 0x68) + -4) == 0) {
      lVar3 = 0;
    }
    else {
      lVar3 = *(long *)(*(long *)(param_1 + 0x68) + -0x10);
    }
    iVar1 = *(int *)((long)plVar2 + 0xc);
    if (iVar1 == 8) {
      *(long *)(*plVar2 + 8) = lVar3;
      if (lVar3 == 0) goto LAB_008adcd0;
      goto LAB_008adc9c;
    }
    if (iVar1 != 6) {
      *(long *)(*(long *)(param_1 + 0x60) + (long)iVar1 * 8 + 0x448) = lVar3;
      goto LAB_008adcd0;
    }
    if (*(char *)(*plVar2 + 7) == '\0') break;
    FUN_008b3cec(param_1);
LAB_008adcf4:
    iVar1 = __cxa_guard_acquire(&DAT_00d1f1e0);
    if (iVar1 != 0) {
                    /* try { // try from 008add10 to 008add13 has its CatchHandler @ 008add30 */
      DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
      __cxa_guard_release(&DAT_00d1f1e0);
    }
  }
  *(long *)(*plVar2 + 0x10) = lVar3;
  if (lVar3 != 0) {
LAB_008adc9c:
    if (((*(byte *)(*plVar2 + 2) >> 2 & 1) != 0) && ((*(byte *)(lVar3 + 2) & 3) != 0)) {
      FUN_008b6188(param_1);
    }
  }
LAB_008adcd0:
  *(long *)(param_1 + 0x68) = *(long *)(param_1 + 0x68) + -0x10;
  return 1;
}

