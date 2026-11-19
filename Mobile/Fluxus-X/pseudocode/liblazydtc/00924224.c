/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00924224
 */

int FUN_00924224(undefined8 param_1)

{
  long lVar1;
  int iVar2;
  long local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  local_40 = 0;
  iVar2 = FUN_009356e0(&local_40,param_1,&PTR_s_chunked_00c4f678,1);
  if (iVar2 == 0) {
    iVar2 = FUN_00935a68(param_1,local_40);
  }
  if ((iVar2 != 0) && (local_40 != 0)) {
    FUN_0093578c(param_1);
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

