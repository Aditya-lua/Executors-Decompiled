
/* WARNING: Removing unreachable block (ram,0x005efe9c) */
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

long * FUN_005efe0c(undefined8 *param_1,long *param_2,long *param_3,undefined8 param_4,ulong param_5
                   )

{
  undefined8 uVar1;
  long *plVar2;
  ulong uVar3;
  undefined1 *unaff_x24;
  long unaff_x29;
  undefined1 uStack0000000000000007;
  undefined1 uStack0000000000000008;
  undefined1 uStack0000000000000109;
  ulong in_stack_00000110;
  ulong in_stack_00000118;
  
  uVar1 = _UNK_008ba4e0;
  param_1[1] = _UNK_008ba4e8;
  *param_1 = uVar1;
  uStack0000000000000109 = 1;
  if (param_5 == 0) {
    uVar3 = 0x100;
    if (&uStack0000000000000008 != unaff_x24) goto LAB_005efed4;
  }
  else {
    do {
      uVar3 = param_5;
      if (in_stack_00000118 <= param_5) {
        uVar3 = in_stack_00000118;
      }
      (**(code **)(*param_2 + 0x50))(param_2,unaff_x24,uVar3);
      plVar2 = (long *)(**(code **)(*param_3 + 0x130))(param_3,param_4,unaff_x24,uVar3,0,1);
      param_5 = param_5 - uVar3;
    } while (param_5 != 0);
    uVar3 = in_stack_00000110;
    param_2 = plVar2;
    if (in_stack_00000118 <= in_stack_00000110) {
      uVar3 = in_stack_00000118;
    }
  }
  for (; uVar3 != 0; uVar3 = uVar3 - 1) {
    (&uStack0000000000000007)[uVar3] = 0;
  }
LAB_005efed4:
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x48)) {
    return param_2;
  }
  ___stack_chk_fail();
  uVar3 = in_stack_00000110;
  if (in_stack_00000118 <= in_stack_00000110) {
    uVar3 = in_stack_00000118;
  }
  if (unaff_x24 == &uStack0000000000000008 && uVar3 != 0) {
    do {
      (&uStack0000000000000007)[uVar3] = 0;
      uVar3 = uVar3 - 1;
    } while (uVar3 != 0);
  }
  __Unwind_Resume();
  return (long *)0x0;
}

