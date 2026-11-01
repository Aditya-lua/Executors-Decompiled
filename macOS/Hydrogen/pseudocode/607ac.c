
void FUN_000607ac(void)

{
  undefined8 uVar1;
  long *plVar2;
  long lVar3;
  long unaff_x29;
  undefined1 uStack0000000000000018;
  undefined1 uStack0000000000000030;
  long lStack0000000000000038;
  long *in_stack_00000050;
  
  func_0x0005fe74();
  if (*(long *)PTR____stack_chk_guard_009b01e8 == *(long *)(unaff_x29 + -0x18)) {
    return;
  }
  uVar1 = ___stack_chk_fail();
  if (in_stack_00000050 == &lStack0000000000000038) {
    lVar3 = 4;
    plVar2 = &lStack0000000000000038;
  }
  else {
    if (in_stack_00000050 == (long *)0x0) goto LAB_00060810;
    lVar3 = 5;
    plVar2 = in_stack_00000050;
  }
  (**(code **)(*plVar2 + lVar3 * 8))();
LAB_00060810:
  func_0x00799c5c(&uStack0000000000000030,&uStack0000000000000018);
  func_0x0005fe74();
  __Unwind_Resume(uVar1);
  __Unwind_Resume();
  return;
}

