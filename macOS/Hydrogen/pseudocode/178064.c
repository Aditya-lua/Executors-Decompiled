
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00178064(undefined8 param_1)

{
  undefined8 uVar1;
  long lVar2;
  long *plVar3;
  undefined8 *unaff_x19;
  undefined8 *unaff_x20;
  long unaff_x29;
  long in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 uStack0000000000000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined1 uStack0000000000000050;
  long lStack0000000000000060;
  undefined8 uStack0000000000000068;
  undefined8 uStack0000000000000070;
  
  lStack0000000000000060 = unaff_x29 + -0x70;
  uStack0000000000000068 = 2;
  uStack0000000000000070 = param_1;
  func_0x00459f08(&uStack0000000000000038,&uStack0000000000000050);
  unaff_x20[4] = in_stack_00000048;
  uVar1 = _UNK_00815270;
  unaff_x20[1] = _UNK_00815278;
  *unaff_x20 = uVar1;
  unaff_x20[3] = in_stack_00000040;
  unaff_x20[2] = uStack0000000000000038;
  if (in_stack_00000008 != 0) {
    func_0x00187bd4(in_stack_00000010,in_stack_00000008,1);
  }
  lVar2 = *(long *)*unaff_x19;
  *(long *)*unaff_x19 = lVar2 + -1;
  LORelease();
  if (lVar2 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001f9f08();
  }
  plVar3 = (long *)unaff_x19[1];
  lVar2 = *plVar3;
  *plVar3 = lVar2 + -1;
  LORelease();
  if (lVar2 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001f9964(unaff_x19 + 1);
  }
  return;
}

