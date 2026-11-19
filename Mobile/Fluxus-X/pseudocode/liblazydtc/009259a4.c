/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 009259a4
 */

int FUN_009259a4(undefined8 param_1)

{
  long lVar1;
  int iVar2;
  long lVar3;
  undefined8 local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  lVar3 = (*(code *)PTR_calloc_00cc4690)(1,8);
  if (lVar3 == 0) {
    iVar2 = 0x1b;
  }
  else {
    iVar2 = FUN_00907328(&local_40,&PTR_s_HTTP_PROXY_00cc4b10,lVar3);
    if (iVar2 == 0) {
      FUN_009073e8(param_1,local_40);
      lVar3 = 0;
    }
  }
  (*(code *)PTR_free_00cc4678)(lVar3);
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

