/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 00921be0
 */

int FUN_00921be0(long param_1)

{
  long lVar1;
  int iVar2;
  long lVar3;
  undefined8 local_40;
  long local_38;
  
  lVar1 = tpidr_el0;
  local_38 = *(long *)(lVar1 + 0x28);
  if ((*(long *)(param_1 + 0x20) == 0) ||
     ((*(byte *)(*(long *)(*(long *)(param_1 + 0x20) + 0x3a8) + 0x8c) & 3) == 0)) {
    iVar2 = 0;
  }
  else {
    lVar3 = FUN_00935600(param_1,"hds-collect");
    iVar2 = 0;
    if (lVar3 == 0) {
      iVar2 = FUN_00935470(&local_40,param_1,&PTR_s_hds_collect_00c4f618,2);
      if (iVar2 == 0) {
        iVar2 = FUN_00935594(param_1,local_40);
        if (iVar2 != 0) {
          FUN_0093551c(param_1,local_40);
        }
      }
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_38) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

