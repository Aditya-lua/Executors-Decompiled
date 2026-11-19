/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090ae10
 */

int FUN_0090ae10(undefined8 param_1)

{
  long lVar1;
  int iVar2;
  undefined4 *puVar3;
  undefined8 local_50;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  local_50 = 0;
  puVar3 = (undefined4 *)(*(code *)PTR_calloc_00cc4690)(1,0x28);
  if (puVar3 == (undefined4 *)0x0) {
    iVar2 = 0x1b;
  }
  else {
    *puVar3 = 0;
    FUN_00904528(puVar3 + 2,0x800);
    iVar2 = FUN_00907328(&local_50,&PTR_s_HAPROXY_00cc4830,puVar3);
    if (iVar2 == 0) {
      FUN_009073e8(param_1,local_50);
    }
    else {
      FUN_00904534(puVar3 + 2);
      (*(code *)PTR_free_00cc4678)(puVar3);
    }
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar2;
}

