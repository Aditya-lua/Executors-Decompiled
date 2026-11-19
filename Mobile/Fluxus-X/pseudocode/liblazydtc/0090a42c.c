/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090a42c
 */

int FUN_0090a42c(undefined8 param_1,undefined8 param_2,undefined8 param_3,undefined4 param_4,
                undefined4 param_5)

{
  long lVar1;
  undefined4 *puVar2;
  int iVar3;
  undefined4 *puVar4;
  undefined8 uVar5;
  undefined8 local_50;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  local_50 = 0;
  puVar4 = (undefined4 *)(*(code *)PTR_calloc_00cc4690)(1,0x18);
  if (puVar4 == (undefined4 *)0x0) {
    uVar5 = 0;
    iVar3 = 0x1b;
  }
  else {
    *puVar4 = 0;
    *(undefined8 *)(puVar4 + 2) = param_3;
    puVar4[4] = param_5;
    puVar4[5] = param_4;
    iVar3 = FUN_00907328(&local_50,&PTR_s_SETUP_00cc47b8,puVar4);
    uVar5 = local_50;
    puVar2 = (undefined4 *)0x0;
    if (iVar3 != 0) {
      uVar5 = 0;
      puVar2 = puVar4;
    }
    puVar4 = puVar2;
  }
  (*(code *)PTR_free_00cc4678)(puVar4);
  if (iVar3 == 0) {
    FUN_009073e8(param_1,uVar5);
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar3;
}

