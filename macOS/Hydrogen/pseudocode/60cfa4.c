
void FUN_0060cfa4(undefined8 param_1,long param_2,undefined8 param_3,undefined8 param_4,
                 undefined8 param_5)

{
  long lVar1;
  ulong uVar2;
  long unaff_x19;
  long unaff_x20;
  long unaff_x22;
  long unaff_x23;
  undefined8 unaff_x24;
  long unaff_x26;
  long unaff_x27;
  long unaff_x28;
  long unaff_x29;
  undefined1 uStack0000000000000030;
  long in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000f8;
  long in_stack_00000120;
  
  while( true ) {
    func_0x005fc898(unaff_x24,param_2,unaff_x22,param_4,param_5,unaff_x23);
    func_0x005fde88(unaff_x29 + -0x88);
    func_0x005ffccc(unaff_x20,unaff_x29 + -0x88);
    *(undefined **)(unaff_x29 + -0x88) = &UNK_009f5d60;
    lVar1 = *(long *)(unaff_x29 + -0x68);
    uVar2 = *(ulong *)(unaff_x29 + -0x78);
    if (*(ulong *)(unaff_x29 + -0x70) <= *(ulong *)(unaff_x29 + -0x78)) {
      uVar2 = *(ulong *)(unaff_x29 + -0x70);
    }
    if (lVar1 != 0) {
      if (uVar2 != 0) {
        do {
          *(undefined8 *)(lVar1 + -8 + uVar2 * 8) = 0;
          uVar2 = uVar2 - 1;
        } while (uVar2 != 0);
      }
      func_0x00611644();
    }
    unaff_x22 = in_stack_00000120;
    unaff_x24 = in_stack_00000098;
    unaff_x23 = in_stack_00000060;
    unaff_x26 = unaff_x26 + 1;
    if (unaff_x26 == unaff_x27) break;
    unaff_x20 = unaff_x19 + unaff_x26 * unaff_x28;
    if (in_stack_00000120 != *(long *)(unaff_x20 + 0x20)) {
      _memcpy(in_stack_00000120,*(long *)(unaff_x20 + 0x20),*(long *)(unaff_x20 + 0x18) << 3);
    }
    lVar1 = *(long *)(unaff_x20 + 0x18);
    if (unaff_x23 * 2 != lVar1) {
      _bzero(unaff_x22 + lVar1 * 8,unaff_x23 * 0x10 + lVar1 * -8);
    }
    param_2 = unaff_x22 + unaff_x23 * 0x10;
    param_4 = in_stack_00000068;
    param_5 = in_stack_000000f8;
  }
  func_0x00610518(&uStack0000000000000030);
  return;
}

