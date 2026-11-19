/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008bbce8
 */

void FUN_008bbce8(undefined8 param_1,long param_2,undefined8 param_3)

{
  int iVar1;
  long lVar2;
  
  lVar2 = FUN_008bb604(param_2,param_3);
  *(undefined1 *)(param_2 + 6) = 0;
  if ((DAT_00d1f1e0 & 1) == 0) {
    iVar1 = __cxa_guard_acquire(&DAT_00d1f1e0);
    if (iVar1 != 0) {
                    /* try { // try from 008bbda4 to 008bbda7 has its CatchHandler @ 008bbdc4 */
      DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8,param_2);
      __cxa_guard_release(&DAT_00d1f1e0);
    }
  }
  if (lVar2 == (long)&DWORD_007f2ef0 + DAT_00d1f1d8) {
    FUN_008bbddc(param_1,param_2,param_3);
    return;
  }
  return;
}

