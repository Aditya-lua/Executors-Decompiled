
void FUN_00718250(void)

{
  ulong uVar1;
  undefined8 uVar2;
  undefined4 uVar3;
  long unaff_x20;
  long unaff_x29;
  undefined1 uStack0000000000000030;
  undefined8 in_stack_00000060;
  
  uVar1 = func_0x00717f28();
  func_0x00710d48();
  if (cRam0000000000a337d0 == '\0') {
    if ((uVar1 & 0xff00000000) == 0) {
      return;
    }
    uVar2 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x38);
    in_stack_00000060 =
         func_0x00705878(uVar2,&uStack0000000000000030,uVar1,*(undefined8 *)(unaff_x29 + -0x60),
                         *(undefined8 *)(unaff_x29 + -0x58));
  }
  else {
    uVar3 = 3;
    if ((uVar1 & 0xff00000000) != 0) {
      uVar3 = (undefined4)uVar1;
    }
    uVar2 = func_0x00704c24(*(undefined8 *)(unaff_x20 + 0xd8),0x38);
    in_stack_00000060 =
         func_0x007058b4(uVar2,&uStack0000000000000030,uVar3,*(undefined8 *)(unaff_x29 + -0x60),
                         *(undefined8 *)(unaff_x29 + -0x58));
  }
  func_0x00711dac();
  return;
}

