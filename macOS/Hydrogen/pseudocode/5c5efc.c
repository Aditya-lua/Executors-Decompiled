
void FUN_005c5efc(undefined8 param_1)

{
  long lVar1;
  long lVar2;
  long lVar3;
  long lVar4;
  long unaff_x29;
  undefined1 uStack0000000000000008;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  undefined8 uStack0000000000000048;
  undefined8 uStack0000000000000050;
  long in_stack_00000060;
  
  uStack0000000000000030 = 0;
  _uStack0000000000000008 = 1;
  uStack0000000000000028 = 1;
  uStack0000000000000048 = param_1;
  func_0x005c6f60(&uStack0000000000000050,&uStack0000000000000008);
  lVar1 = uStack0000000000000050;
  lVar2 = in_stack_00000060;
  while (lVar1 != 0) {
    *(undefined1 **)(unaff_x29 + -0x38) = &uStack0000000000000008;
    lVar4 = lVar1 + lVar2 * 0x18;
    lVar3 = *(long *)(lVar4 + 0x218);
    uStack0000000000000050 = lVar1;
    in_stack_00000060 = lVar2;
    if (lVar3 != 0) {
      func_0x00187bd4(*(undefined8 *)(lVar4 + 0x220),lVar3,1);
    }
    func_0x005c6384(lVar1 + lVar2 * 0x30);
    func_0x005c6f60(&uStack0000000000000050,&uStack0000000000000008);
    lVar1 = uStack0000000000000050;
    lVar2 = in_stack_00000060;
  }
  return;
}

