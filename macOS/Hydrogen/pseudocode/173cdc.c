
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

void FUN_00173cdc(void)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 *unaff_x19;
  undefined8 unaff_x20;
  undefined8 unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long unaff_x24;
  long unaff_x29;
  undefined8 uStack0000000000000000;
  undefined8 uStack0000000000000008;
  undefined8 uStack0000000000000010;
  undefined8 uStack0000000000000018;
  undefined8 uStack0000000000000020;
  long in_stack_00000028;
  undefined8 in_stack_00000030;
  undefined8 in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined8 in_stack_00000048;
  undefined8 uStack0000000000000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000060;
  
  do {
    if (*(long *)(unaff_x29 + -0x50) != 3) {
      uVar2 = 0;
      uStack0000000000000008 = *(undefined8 *)(unaff_x29 + -0x48);
      uStack0000000000000000 = *(undefined8 *)(unaff_x29 + -0x50);
      uStack0000000000000018 = *(undefined8 *)(unaff_x29 + -0x38);
      uStack0000000000000010 = *(undefined8 *)(unaff_x29 + -0x40);
LAB_00173d04:
      in_stack_00000028 = _UNK_00814e98;
      uStack0000000000000020 = _UNK_00814e90;
      *unaff_x19 = uVar2;
      unaff_x19[2] = uStack0000000000000008;
      unaff_x19[1] = uStack0000000000000000;
      unaff_x19[4] = uStack0000000000000018;
      unaff_x19[3] = uStack0000000000000010;
      func_0x00174248((ulong)&uStack0000000000000020 | 8);
      return;
    }
    func_0x003eee9c(&uStack0000000000000020,unaff_x21,unaff_x20);
    unaff_x20 = in_stack_00000048;
    unaff_x21 = in_stack_00000040;
    uVar1 = _UNK_00814e98;
    uVar2 = _UNK_00814e90;
    if (in_stack_00000028 == unaff_x23) {
      unaff_x19[4] = in_stack_00000040;
      unaff_x19[1] = uVar1;
      *unaff_x19 = uVar2;
      unaff_x19[3] = in_stack_00000038;
      unaff_x19[2] = in_stack_00000030;
      return;
    }
    if (in_stack_00000028 == unaff_x24) {
      uStack0000000000000008 = in_stack_00000038;
      uStack0000000000000000 = in_stack_00000030;
      uStack0000000000000018 = in_stack_00000048;
      uStack0000000000000010 = in_stack_00000040;
      uVar2 = 1;
      goto LAB_00173d04;
    }
    in_stack_00000058 = *(undefined8 *)(unaff_x22 + 0x10);
    uStack0000000000000050 = *(undefined8 *)(unaff_x22 + 8);
    in_stack_00000060 = *(undefined8 *)(unaff_x22 + 0x18);
    func_0x003f1488(unaff_x29 + -0x50,uStack0000000000000020 & 0xff,&uStack0000000000000050);
  } while( true );
}

