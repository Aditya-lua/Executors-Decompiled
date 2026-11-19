/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008ad800
 */

void FUN_008ad800(long param_1,uint param_2,char *param_3)

{
  long lVar1;
  int iVar2;
  size_t sVar3;
  ulong uVar4;
  undefined8 local_48;
  undefined4 local_3c;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if ((int)param_2 < 1) {
    if ((int)param_2 < -9999) {
      uVar4 = FUN_008aea7c(param_1);
    }
    else {
      uVar4 = *(long *)(param_1 + 0x68) + (long)(int)param_2 * 0x10;
    }
  }
  else {
    uVar4 = (*(long *)(param_1 + 0x70) + (ulong)param_2 * 0x10) - 0x10;
    if (*(ulong *)(param_1 + 0x68) <= uVar4) {
      if (((DAT_00d1f1e0 & 1) == 0) && (iVar2 = __cxa_guard_acquire(&DAT_00d1f1e0), iVar2 != 0)) {
                    /* try { // try from 008ad910 to 008ad913 has its CatchHandler @ 008ad928 */
        DAT_00d1f1d8 = FUN_007fe1ec(DAT_00cca8c8);
        __cxa_guard_release(&DAT_00d1f1e0);
      }
      uVar4 = (long)&DWORD_007f2ef0 + DAT_00d1f1d8;
    }
  }
  sVar3 = strlen(param_3);
  local_48 = FUN_008b9ff8(param_1,param_3,sVar3);
  local_3c = 5;
  FUN_008cb374(param_1,uVar4,&local_48,*(long *)(param_1 + 0x68) + -0x10);
  *(long *)(param_1 + 0x68) = *(long *)(param_1 + 0x68) + -0x10;
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

