/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 008aee78
 */

void FUN_008aee78(undefined8 param_1,undefined8 param_2)

{
  long lVar1;
  int iVar2;
  undefined1 auStack_178 [16];
  int local_168;
  undefined8 local_148;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  iVar2 = FUN_008b3568(param_1,param_2,&DAT_002b901b,auStack_178);
  if ((iVar2 == 0) || (local_168 < 1)) {
    FUN_008aa60c(param_1,1);
    FUN_008ac34c(param_1,&DAT_002ab32c,0);
  }
  else {
    FUN_008ac684(param_1,"%s:%d: ",local_148);
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}

