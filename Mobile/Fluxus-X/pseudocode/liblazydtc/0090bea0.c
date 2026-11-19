/* Ghidra 12.2 pseudocode; native types and names may be inferred.
 * Binary: liblazydtc.so; entry: 0090bea0
 */

undefined1  [16] FUN_0090bea0(long param_1,undefined8 param_2,undefined4 param_3)

{
  long lVar1;
  int iVar2;
  long *plVar3;
  long lVar4;
  undefined8 uVar5;
  long lVar6;
  undefined1 auVar7 [16];
  long local_58;
  undefined8 local_50;
  long local_48;
  
  lVar1 = tpidr_el0;
  local_48 = *(long *)(lVar1 + 0x28);
  lVar6 = *(long *)(param_1 + 0x10);
  local_58 = 0;
  local_50 = 0;
  lVar4 = 0;
  uVar5 = 0;
  if ((*(byte *)(lVar6 + 0x84) & 1) == 0) goto LAB_0090bf54;
  plVar3 = *(long **)(lVar6 + 0x60);
  if (plVar3 != (long *)0x0) {
    iVar2 = (**(code **)(*plVar3 + 0x70))(plVar3,param_2,param_3,0,&local_58);
    lVar4 = 0;
    uVar5 = 0;
    if (iVar2 != 0) goto LAB_0090bf54;
    if (local_58 == 0) {
      lVar4 = 0;
      uVar5 = 0;
      if ((int)local_50 == 0) goto LAB_0090bf54;
    }
    lVar4 = FUN_00941e38(local_58,local_50,0,0);
    if (0 < lVar4) {
      lVar4 = local_58;
      uVar5 = local_50;
      goto LAB_0090bf54;
    }
  }
  lVar4 = 0;
  uVar5 = 0;
LAB_0090bf54:
  local_58 = 0;
  local_50 = 0;
  if (((((*(byte *)(lVar6 + 0x54) & 1) != 0) &&
       (plVar3 = *(long **)(lVar6 + 0x30), plVar3 != (long *)0x0)) &&
      (iVar2 = (**(code **)(*plVar3 + 0x70))(plVar3,param_2,param_3,0,&local_58), iVar2 == 0)) &&
     (((local_58 != 0 || ((int)local_50 != 0)) &&
      (lVar6 = FUN_00941e38(local_58,local_50,lVar4,uVar5), 0 < lVar6)))) {
    lVar4 = local_58;
    uVar5 = local_50;
  }
  if (*(long *)(lVar1 + 0x28) != local_48) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  auVar7._8_8_ = uVar5;
  auVar7._0_8_ = lVar4;
  return auVar7;
}

