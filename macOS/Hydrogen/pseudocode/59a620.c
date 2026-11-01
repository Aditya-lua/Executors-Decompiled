
void FUN_0059a620(undefined8 *param_1,undefined8 param_2,undefined8 param_3)

{
  long lVar1;
  long lVar2;
  ulong uVar3;
  ulong uVar4;
  code *pcVar5;
  undefined8 uVar6;
  ulong uStack0000000000000000;
  long lStack0000000000000008;
  undefined8 uStack0000000000000018;
  long in_stack_00000020;
  ulong in_stack_00000028;
  undefined8 in_stack_00000060;
  undefined8 in_stack_00000068;
  
  func_0x0059a4cc(&uStack0000000000000018,param_2);
  uVar3 = in_stack_00000028;
  lVar1 = in_stack_00000020;
  if (uStack0000000000000018 == 0x8000000000000000) {
    if ((long)in_stack_00000028 < 0) {
      uVar6 = 0;
LAB_0059a7a4:
      func_0x007a1f00(uVar6,uVar3,&UNK_009f1a40);
                    /* WARNING: Does not return */
      pcVar5 = (code *)SoftwareBreakpoint(1,0x59a7bc);
      (*pcVar5)();
    }
    if (in_stack_00000028 == 0) {
      lStack0000000000000008 = 1;
    }
    else {
      uVar6 = 1;
      lStack0000000000000008 = func_0x00187bd0(in_stack_00000028,1);
      if (lStack0000000000000008 == 0) goto LAB_0059a7a4;
    }
    _memcpy(lStack0000000000000008,lVar1,uVar3);
    uStack0000000000000000 = uVar3;
  }
  else {
    lStack0000000000000008 = in_stack_00000020;
    uStack0000000000000000 = uStack0000000000000018;
  }
  func_0x0059a4cc(&uStack0000000000000018,param_3);
  if (uStack0000000000000000 - uVar3 < 4) {
    func_0x007acb90();
  }
  uVar4 = in_stack_00000028;
  lVar2 = in_stack_00000020;
  *(undefined4 *)(lStack0000000000000008 + uVar3) = 0x6e5c6e5c;
  lVar1 = uVar3 + 4;
  if (uStack0000000000000000 - lVar1 < in_stack_00000028) {
    func_0x007acb90();
  }
  _memcpy(lStack0000000000000008 + lVar1,lVar2,uVar4);
  param_1[3] = lVar1 + uVar4;
  param_1[2] = lStack0000000000000008;
  param_1[1] = uStack0000000000000000;
  *param_1 = 1;
  if ((uStack0000000000000018 | 0x8000000000000000) == 0x8000000000000000) {
    return;
  }
                    /* WARNING: Could not recover jumptable at 0x007b349c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR__free_00a24e58)(lVar2,uStack0000000000000018,1);
  return;
}

