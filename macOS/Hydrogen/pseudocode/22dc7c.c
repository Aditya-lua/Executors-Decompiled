
void FUN_0022dc7c(void)

{
  undefined8 uVar1;
  undefined8 unaff_x21;
  undefined8 *unaff_x22;
  long unaff_x27;
  long in_stack_00000038;
  undefined8 in_stack_00000040;
  undefined1 uStack0000000000000150;
  undefined8 in_stack_00000190;
  undefined8 in_stack_00000198;
  undefined8 in_stack_000001a0;
  undefined8 in_stack_000001a8;
  undefined1 auStack_7ffffffe [2147483646];
  
  uVar1 = func_0x0020a620(0x198);
  _memcpy(uVar1,auStack_7ffffffe + 0x8000043e,0x198);
  unaff_x22[1] = uVar1;
  unaff_x22[2] = &UNK_009c84c0;
  *unaff_x22 = unaff_x21;
  func_0x001ad290(auStack_7ffffffe + 0x80000236);
  if (in_stack_00000038 != 0) {
    func_0x00187bd4(in_stack_00000040,in_stack_00000038,1);
  }
  func_0x0018d654(unaff_x27 + 0x30);
  func_0x00223280(&uStack0000000000000150);
  func_0x0022200c();
  func_0x00187bd4();
  return;
}

