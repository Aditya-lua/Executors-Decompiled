/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090a514
 */

int FUN_0090a514(undefined8 param_1,long param_2,int param_3,undefined8 param_4,undefined4 param_5)

{
  long lVar1;
  byte bVar2;
  long lVar3;
  undefined4 *puVar4;
  int iVar5;
  undefined4 *puVar6;
  undefined8 uVar7;
  undefined8 local_60;
  long local_58;
  
  lVar3 = tpidr_el0;
  local_58 = *(long *)(lVar3 + 0x28);
  lVar1 = param_2 + (long)param_3 * 8;
  iVar5 = 0;
  if (*(long *)(lVar1 + 0x248) == 0) {
    if (*(int *)(*(long *)(param_2 + 0x3a8) + 0x8c) == 2) {
      iVar5 = FUN_0090ba88(param_1,param_2,param_3,param_4);
      if ((iVar5 != 0) || (*(long *)(lVar1 + 0x248) != 0)) goto LAB_0090a560;
    }
    bVar2 = *(byte *)(param_2 + 0x572);
    local_60 = 0;
    puVar6 = (undefined4 *)(*(code *)PTR_calloc_00cc4690)(1,0x18);
    if (puVar6 == (undefined4 *)0x0) {
      uVar7 = 0;
      iVar5 = 0x1b;
    }
    else {
      *puVar6 = 0;
      *(undefined8 *)(puVar6 + 2) = param_4;
      puVar6[4] = param_5;
      puVar6[5] = (uint)bVar2;
      iVar5 = FUN_00907328(&local_60,&PTR_s_SETUP_00cc47b8,puVar6);
      uVar7 = local_60;
      puVar4 = (undefined4 *)0x0;
      if (iVar5 != 0) {
        uVar7 = 0;
        puVar4 = puVar6;
      }
      puVar6 = puVar4;
    }
    (*(code *)PTR_free_00cc4678)(puVar6);
    if (iVar5 == 0) {
      FUN_0090738c(param_1,param_2,param_3,uVar7);
    }
  }
LAB_0090a560:
  if (*(long *)(lVar3 + 0x28) != local_58) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return iVar5;
}

