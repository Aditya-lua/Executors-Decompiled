/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008af190
 */

undefined1  [16] FUN_008af190(ulong param_1,undefined8 param_2,undefined4 param_3)

{
  long lVar1;
  int iVar2;
  undefined1 auVar3 [16];
  int local_3c;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  iVar2 = FUN_008ab0e0();
  if ((iVar2 < 1) || (param_1 = FUN_008ab528(param_2,param_3,&local_3c), local_3c != 0)) {
    if (*(long *)(lVar1 + 0x28) == local_38) {
      auVar3._8_8_ = 0;
      auVar3._0_8_ = param_1;
      return auVar3;
    }
  }
  else if (*(long *)(lVar1 + 0x28) == local_38) {
                    /* WARNING: Subroutine does not return */
    FUN_008af05c(param_2,param_3,3);
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}

