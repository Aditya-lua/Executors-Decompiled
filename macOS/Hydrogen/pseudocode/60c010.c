
long FUN_0060c010(ulong param_1,undefined8 param_2,undefined8 param_3)

{
  bool bVar1;
  ulong uVar2;
  long unaff_x21;
  ulong in_stack_00000010;
  ulong in_stack_00000018;
  long in_stack_00000020;
  undefined8 uStack0000000000000030;
  ulong in_stack_00000040;
  ulong in_stack_00000048;
  long in_stack_00000050;
  
  bVar1 = (param_1 & 1) != 0;
  if (bVar1) {
    func_0x006072ac(param_3,unaff_x21 + 0x18);
    func_0x00609afc(&uStack0000000000000030);
  }
  else {
    func_0x00609afc(&uStack0000000000000030,param_3,1);
  }
  func_0x005ffccc(unaff_x21 + 0x78,&uStack0000000000000030);
  uStack0000000000000030 = &UNK_009f5d60;
  uVar2 = in_stack_00000040;
  if (in_stack_00000048 <= in_stack_00000040) {
    uVar2 = in_stack_00000048;
  }
  if (in_stack_00000050 != 0) {
    if (uVar2 != 0) {
      do {
        *(undefined8 *)(in_stack_00000050 + -8 + uVar2 * 8) = 0;
        uVar2 = uVar2 - 1;
      } while (uVar2 != 0);
    }
    func_0x00611644();
  }
  if (bVar1) {
    if (in_stack_00000018 <= in_stack_00000010) {
      in_stack_00000010 = in_stack_00000018;
    }
    if (in_stack_00000020 != 0) {
      if (in_stack_00000010 != 0) {
        do {
          *(undefined8 *)(in_stack_00000020 + -8 + in_stack_00000010 * 8) = 0;
          in_stack_00000010 = in_stack_00000010 - 1;
        } while (in_stack_00000010 != 0);
      }
      func_0x00611644();
    }
  }
  return unaff_x21 + 0x78;
}

