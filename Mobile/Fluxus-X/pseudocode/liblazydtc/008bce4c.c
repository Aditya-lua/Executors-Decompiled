/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008bce4c
 */

void FUN_008bce4c(undefined8 param_1,long param_2,undefined8 param_3)

{
  long lVar1;
  int iVar2;
  long lVar3;
  undefined8 local_48;
  undefined4 local_3c;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  lVar3 = FUN_008bb440(param_2,param_3);
  *(undefined1 *)(param_2 + 6) = 0;
  if ((DAT_00d1f1e0 & 1) == 0) {
    iVar2 = __cxa_guard_acquire(&DAT_00d1f1e0);
    if (iVar2 != 0) {
                    /* try { // try from 008bcf1c to 008bcf1f has its CatchHandler @ 008bcf38 */
      DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8,param_2);
      __cxa_guard_release(&DAT_00d1f1e0);
    }
  }
  if (lVar3 == (long)&DWORD_007f2ef0 + DAT_00d1f1d8) {
    local_3c = 5;
    local_48 = param_3;
    FUN_008bc8d0(param_1,param_2,&local_48,param_3);
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

