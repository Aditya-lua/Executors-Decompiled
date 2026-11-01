
void FUN_0022dbb4(void)

{
  undefined8 uVar1;
  undefined *puVar2;
  undefined8 unaff_x21;
  undefined8 *unaff_x22;
  long unaff_x23;
  long in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined1 uStack0000000000000050;
  undefined8 in_stack_00000088;
  undefined8 in_stack_00000090;
  undefined8 in_stack_00000098;
  undefined8 in_stack_000000a0;
  undefined8 in_stack_000000a8;
  undefined8 in_stack_000000b0;
  undefined8 in_stack_000000b8;
  undefined8 in_stack_000000c0;
  undefined8 in_stack_000000c8;
  undefined8 in_stack_000000d0;
  undefined8 in_stack_000000d8;
  undefined8 in_stack_000000e0;
  undefined8 in_stack_000000e8;
  undefined8 in_stack_000000f0;
  undefined8 in_stack_000000f8;
  undefined8 in_stack_00000100;
  undefined8 in_stack_00000108;
  undefined8 in_stack_00000110;
  undefined1 uStack0000000000000150;
  undefined8 in_stack_00000190;
  undefined8 in_stack_00000198;
  undefined8 in_stack_000001a0;
  undefined8 in_stack_000001a8;
  long in_stack_000001b0;
  undefined8 in_stack_000001c0;
  undefined8 in_stack_000001c8;
  undefined8 in_stack_000001d0;
  undefined8 in_stack_000001d8;
  undefined8 in_stack_000001e0;
  byte in_stack_00000229;
  undefined1 auStack_7ffffffe [2147483646];
  
  if (*(long *)(unaff_x23 + 0x2c0) == 1) {
    *(undefined8 *)(unaff_x23 + 0x2c0) = 2;
  }
  func_0x00248ae4();
  (**(code **)(*(long *)(in_stack_000001b0 + 0x118) + 0x20))
            (*(long *)(in_stack_000001b0 + 0x110) +
             (*(long *)(*(long *)(in_stack_000001b0 + 0x118) + 0x10) - 1U & 0xfffffffffffffff0) +
             0x10,&UNK_00828b07,0xd,auStack_7ffffffe + 0x80000316,0x20,auStack_7ffffffe + 0x80000356
             ,0x30);
  func_0x0024901c();
  *(undefined1 *)(unaff_x23 + 0x49) = 2;
  func_0x0022c09c(auStack_7ffffffe + 0x8000030e,auStack_7ffffffe + 0x8000027e);
  if ((in_stack_00000229 & 1) == 0) {
    uVar1 = func_0x0020a620(0x1a8);
    _memcpy(uVar1,auStack_7ffffffe + 0x8000043e,0x1a8);
    puVar2 = &UNK_009c8478;
  }
  else {
    uVar1 = func_0x0020a620(0x198);
    _memcpy(uVar1,auStack_7ffffffe + 0x8000043e,0x198);
    puVar2 = &UNK_009c84c0;
  }
  unaff_x22[1] = uVar1;
  unaff_x22[2] = puVar2;
  *unaff_x22 = unaff_x21;
  func_0x001ad290(auStack_7ffffffe + 0x80000236);
  if (in_stack_00000038 != 0) {
    func_0x00187bd4(in_stack_00000040,in_stack_00000038,1);
  }
  func_0x0018d654(&uStack0000000000000050);
  func_0x00223280(&uStack0000000000000150);
  func_0x0022200c();
  func_0x00187bd4();
  return;
}

