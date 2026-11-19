/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0096a268
 */

int FUN_0096a268(undefined8 param_1,long param_2,undefined4 param_3)

{
  long lVar1;
  int iVar2;
  long lVar3;
  long lVar4;
  undefined8 local_60;
  long local_58;
  
  lVar1 = tpidr_el0;
  local_58 = *(long *)(lVar1 + 0x28);
  local_60 = 0;
  lVar4 = *(long *)(param_2 + 0x3a0);
  lVar3 = (*(code *)PTR_calloc_00cc4690)(1,0x60);
  if (lVar3 == 0) {
    iVar2 = 0x1b;
  }
  else {
    *(ulong *)(lVar3 + 0x28) = (lVar4 << 0x27) >> 0x3f & 0x749238;
    lVar4 = (*(code *)PTR_calloc_00cc4690)(1,*(undefined8 *)(PTR_DAT_00cc4d08 + 0x18));
    *(long *)(lVar3 + 0x30) = lVar4;
    if (lVar4 == 0) {
      (*(code *)PTR_free_00cc4678)(lVar3);
      iVar2 = 0x1b;
    }
    else {
      iVar2 = FUN_00907328(&local_60,&PTR_DAT_00cc4d20,lVar3);
      if (iVar2 == 0) {
        FUN_0090738c(param_1,param_2,param_3,local_60);
      }
      else {
        (*(code *)PTR_free_00cc4678)(*(undefined8 *)(lVar3 + 0x30));
        (*(code *)PTR_free_00cc4678)(lVar3);
      }
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

