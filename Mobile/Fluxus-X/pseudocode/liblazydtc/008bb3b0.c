/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008bb3b0
 */

long FUN_008bb3b0(long param_1)

{
  int iVar1;
  
  if ((DAT_00d1f1e0 & 1) == 0) {
    iVar1 = __cxa_guard_acquire(&DAT_00d1f1e0);
    if (iVar1 != 0) {
                    /* try { // try from 008bb40c to 008bb40f has its CatchHandler @ 008bb428 */
      DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
      __cxa_guard_release(&DAT_00d1f1e0);
    }
  }
  return DAT_00d1f1d8 + param_1;
}

