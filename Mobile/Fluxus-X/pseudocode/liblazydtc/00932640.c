/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00932640
 */

void FUN_00932640(undefined8 param_1,char *param_2,long param_3)

{
  long lVar1;
  undefined8 uVar2;
  uint local_5c;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  while (param_3 = param_3 + -1, param_3 != 0) {
    do {
      uVar2 = FUN_00932448(param_1,&local_5c);
      if ((int)uVar2 != 0) goto LAB_009326d0;
    } while (0xfffffffb < local_5c);
    *param_2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"[local_5c % 0x3e];
    param_2 = param_2 + 1;
  }
  uVar2 = 0;
  *param_2 = '\0';
LAB_009326d0:
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(uVar2);
  }
  return;
}

