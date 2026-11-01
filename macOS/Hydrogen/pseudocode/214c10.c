
void FUN_00214c10(long param_1)

{
  long lVar1;
  long unaff_x19;
  long *unaff_x21;
  long in_stack_00000038;
  undefined8 in_stack_00000048;
  long in_stack_00000088;
  long in_stack_00000090;
  long in_stack_00000098;
  undefined8 uStack00000000000000a0;
  undefined8 uStack0000000000000100;
  undefined1 auStack_7ffffffe [2147483646];
  
  _memcpy(param_1,auStack_7ffffffe + 0x8000061e,0x168);
  unaff_x21[1] = param_1;
  unaff_x21[2] = (long)&UNK_009c68c8;
  *unaff_x21 = unaff_x19 + 0x25;
  func_0x00240a1c(auStack_7ffffffe + 0x8000047e);
  func_0x00240a1c(auStack_7ffffffe + 0x8000023e);
  lVar1 = *uStack0000000000000100;
  *uStack0000000000000100 = lVar1 + -1;
  LORelease();
  if (lVar1 == 1) {
    DataMemoryBarrier(2,1);
    func_0x001f9b44(&uStack0000000000000100);
  }
  if ((in_stack_00000038 == -0x7ffffffffffffffe) && (uStack00000000000000a0 != -0x7ffffffffffffffe))
  {
    func_0x00208e34(&uStack00000000000000a0);
  }
  if (in_stack_00000088 != -0x8000000000000000) {
    in_stack_00000098 = in_stack_00000098 + 1;
    lVar1 = in_stack_00000090;
    while (in_stack_00000098 = in_stack_00000098 + -1, in_stack_00000098 != 0) {
      func_0x0016af10(lVar1);
      lVar1 = lVar1 + 0x70;
    }
    if (in_stack_00000088 != 0) {
      func_0x00187bd4(in_stack_00000090,in_stack_00000088 * 0x70,8);
    }
  }
  func_0x002087e4();
  func_0x00187bd4(in_stack_00000048,0x1a8,8);
  return;
}

