/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00906a88
 */

int FUN_00906a88(undefined8 param_1)

{
  long lVar1;
  int iVar2;
  undefined8 local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  iVar2 = FUN_00907328(&local_40,&PTR_s_H1_PROXY_00cc46c8,0);
  if (iVar2 == 0) {
    FUN_009073e8(param_1,local_40);
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

