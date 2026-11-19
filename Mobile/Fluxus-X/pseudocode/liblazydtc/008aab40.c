/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008aab40
 */

void FUN_008aab40(long param_1,uint param_2)

{
  undefined8 *puVar1;
  int iVar2;
  undefined8 *puVar3;
  
  if ((int)param_2 < 1) {
    if ((int)param_2 < -9999) {
      puVar3 = (undefined8 *)FUN_008aea7c();
    }
    else {
      puVar3 = (undefined8 *)(*(long *)(param_1 + 0x68) + (long)(int)param_2 * 0x10);
    }
  }
  else {
    puVar3 = (undefined8 *)((*(long *)(param_1 + 0x70) + (ulong)param_2 * 0x10) - 0x10);
    if (*(undefined8 **)(param_1 + 0x68) <= puVar3) {
      if ((DAT_00d1f1e0 & 1) == 0) {
        iVar2 = __cxa_guard_acquire(&DAT_00d1f1e0);
        if (iVar2 != 0) {
                    /* try { // try from 008aac0c to 008aac0f has its CatchHandler @ 008aac28 */
          DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
          __cxa_guard_release(&DAT_00d1f1e0);
        }
      }
      puVar3 = (undefined8 *)((long)&DWORD_007f2ef0 + DAT_00d1f1d8);
    }
  }
  while( true ) {
    puVar1 = puVar3 + 2;
    if (*(undefined8 **)(param_1 + 0x68) <= puVar1) break;
    puVar3[1] = puVar3[3];
    *puVar3 = *puVar1;
    puVar3 = puVar1;
  }
  *(undefined8 **)(param_1 + 0x68) = *(undefined8 **)(param_1 + 0x68) + -2;
  return;
}

