/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ada90
 */

void FUN_008ada90(long param_1,uint param_2)

{
  int iVar1;
  undefined8 *puVar2;
  long *plVar3;
  long lVar4;
  undefined8 uVar5;
  
  if (0 < (int)param_2) {
    plVar3 = (long *)(*(long *)(param_1 + 0x70) + (ulong)param_2 * 0x10 + -0x10);
    if (plVar3 < *(long **)(param_1 + 0x68)) goto LAB_008adb10;
    plVar3 = (long *)&DAT_00d1f000;
    if ((DAT_00d1f1e0 & 1) == 0) goto LAB_008adb88;
    while( true ) {
      plVar3 = (long *)((long)&DWORD_007f2ef0 + plVar3[0x3b]);
LAB_008adb10:
      if (*(char *)(*plVar3 + 7) == '\0') break;
      FUN_008b3cec(param_1);
LAB_008adb88:
      iVar1 = __cxa_guard_acquire(&DAT_00d1f1e0);
      if (iVar1 != 0) {
                    /* try { // try from 008adba8 to 008adbab has its CatchHandler @ 008adbc4 */
        lVar4 = FUN_007fe1ec(DAT_00cca8c8);
        plVar3[0x3b] = lVar4;
        __cxa_guard_release(&DAT_00d1f1e0);
      }
    }
    lVar4 = *(long *)(param_1 + 0x68);
    puVar2 = (undefined8 *)FUN_008bcd04(param_1);
    uVar5 = *(undefined8 *)(lVar4 + -0x10);
    puVar2[1] = *(undefined8 *)(lVar4 + -8);
    *puVar2 = uVar5;
    lVar4 = *(long *)(param_1 + 0x68);
    if (((4 < *(int *)(lVar4 + -4)) && ((*(byte *)(*plVar3 + 2) >> 2 & 1) != 0)) &&
       ((*(byte *)(*(long *)(lVar4 + -0x10) + 2) & 3) != 0)) {
      FUN_008b6370(param_1);
      lVar4 = *(long *)(param_1 + 0x68);
    }
    *(long *)(param_1 + 0x68) = lVar4 + -0x10;
    return;
  }
  if ((int)param_2 < -9999) {
    plVar3 = (long *)FUN_008aea7c(param_1);
    goto LAB_008adb10;
  }
  plVar3 = (long *)(*(long *)(param_1 + 0x68) + (long)(int)param_2 * 0x10);
  goto LAB_008adb10;
}

