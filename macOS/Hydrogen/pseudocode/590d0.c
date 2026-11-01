
undefined8 FUN_000590d0(undefined8 param_1)

{
  uint uVar1;
  int iVar2;
  undefined8 uVar3;
  uint in_w8;
  undefined8 unaff_x20;
  long unaff_x23;
  long unaff_x29;
  undefined8 in_stack_00000038;
  long in_stack_00000048;
  undefined8 in_stack_00000058;
  long in_stack_00000068;
  undefined8 uStack0000000000000088;
  undefined1 uStack0000000000000110;
  
  while( true ) {
    uVar1 = 0;
    if (in_w8 == 0) {
      uVar1 = (uint)param_1;
    }
    if ((uVar1 & 1) == 0) goto LAB_00059104;
    unaff_x23 = unaff_x23 + -1;
    if ((unaff_x23 == 0) || (iVar2 = func_0x0005a288(), iVar2 == 0)) break;
    uStack0000000000000088._7_1_ = 0;
    param_1 = func_0x0005a3d4(&uStack0000000000000110,unaff_x23 == 1,
                              (long)&uStack0000000000000088 + 7);
    in_w8 = (uint)uStack0000000000000088._7_1_;
    unaff_x20 = param_1;
  }
  unaff_x20 = 1;
LAB_00059104:
  _shutdown();
  _close();
  if (in_stack_00000048 < 0) {
    __ZdlPv(in_stack_00000038);
  }
  if (in_stack_00000068 < 0) {
    __ZdlPv(in_stack_00000058);
    if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x38)) goto LAB_000591f4;
  }
  else if (*(long *)PTR____stack_chk_guard_009b01e8 != *(long *)(unaff_x29 + -0x38)) {
LAB_000591f4:
    uVar3 = ___stack_chk_fail();
    if (in_stack_00000048 < 0) {
      __ZdlPv(in_stack_00000038);
    }
    while (-1 < in_stack_00000068) {
      __Unwind_Resume(uVar3);
    }
    __ZdlPv(in_stack_00000058);
    uVar3 = __Unwind_Resume(uVar3);
    return uVar3;
  }
  return unaff_x20;
}

