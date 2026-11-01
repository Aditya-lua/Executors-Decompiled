
/* WARNING: Removing unreachable block (ram,0x00737128) */
/* WARNING: Removing unreachable block (ram,0x00737140) */

undefined1  [16] FUN_0073709c(code *param_1)

{
  int iVar1;
  long lVar2;
  long *plVar3;
  undefined8 uVar4;
  long unaff_x23;
  undefined1 auVar5 [16];
  long in_stack_00000000;
  int iStack0000000000000008;
  
  iVar1 = (*param_1)();
  uVar4 = 0;
  lVar2 = 0;
  if (iVar1 == 0) {
    if (((in_stack_00000000 == 0) && (iStack0000000000000008 == 0)) ||
       (lVar2 = func_0x00782ea8(in_stack_00000000,_iStack0000000000000008,0,0), lVar2 < 1)) {
      uVar4 = 0;
      lVar2 = 0;
    }
    else {
      uVar4 = _iStack0000000000000008;
      lVar2 = in_stack_00000000;
    }
  }
  if ((*(long *)(unaff_x23 + 0x28) != 0) &&
     (plVar3 = *(long **)(*(long *)(unaff_x23 + 0x28) + 0x28), plVar3 != (long *)0x0)) {
    (**(code **)(*plVar3 + 0x70))();
  }
  auVar5._8_8_ = uVar4;
  auVar5._0_8_ = lVar2;
  return auVar5;
}

