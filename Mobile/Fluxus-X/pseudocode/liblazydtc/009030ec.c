/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009030ec
 */

void curl_easy_upkeep(int *param_1)

{
  long lVar1;
  undefined8 uVar2;
  long lVar3;
  undefined1 local_48 [16];
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if ((param_1 == (int *)0x0) || (*param_1 != -0x3f212453)) {
    uVar2 = 0x2b;
  }
  else {
    lVar3 = *(long *)(param_1 + 0x32);
    if (lVar3 != 0) {
      local_48 = FUN_00941cb8();
      FUN_00910008(param_1,lVar3 + 0x158,local_48,FUN_00903188);
    }
    uVar2 = 0;
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar2);
  }
  return;
}

