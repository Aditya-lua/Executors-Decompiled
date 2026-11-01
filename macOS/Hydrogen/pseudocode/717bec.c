
long FUN_00717bec(void)

{
  bool in_ZR;
  undefined8 uVar1;
  undefined8 *unaff_x20;
  long unaff_x21;
  long unaff_x22;
  undefined1 *unaff_x24;
  undefined8 uStack0000000000000028;
  undefined8 uStack0000000000000030;
  undefined8 in_stack_00000038;
  
  if (in_ZR) {
    uStack0000000000000028 = *(undefined8 *)(unaff_x21 + 0x84);
    func_0x00710d48();
    if (*(int *)(unaff_x21 + 0x80) == 0x119) {
      uVar1 = *(undefined8 *)(unaff_x21 + 0x98);
      in_stack_00000038 = *(undefined8 *)(unaff_x21 + 0x8c);
      uStack0000000000000030 = *(undefined8 *)(unaff_x21 + 0x84);
      func_0x00710d48();
    }
    else {
      func_0x0072415c();
      in_stack_00000038 = *(undefined8 *)(unaff_x21 + 0x84);
      uVar1 = *(undefined8 *)(unaff_x21 + 0x128);
    }
    *unaff_x20 = uVar1;
    uStack0000000000000030 = *(undefined8 *)(unaff_x22 + 0xc);
    uVar1 = func_0x00704c24(*(undefined8 *)(unaff_x21 + 0xd8),0x50);
    unaff_x22 = func_0x00706238(uVar1,&uStack0000000000000030);
    *unaff_x24 = 1;
  }
  return unaff_x22;
}

