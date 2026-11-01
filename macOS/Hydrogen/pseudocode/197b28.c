
void FUN_00197b28(long param_1)

{
  long lVar1;
  long lVar2;
  long unaff_x20;
  long unaff_x21;
  long lVar3;
  long lVar4;
  undefined1 auVar5 [16];
  undefined8 in_stack_00000010;
  undefined1 uStack0000000000000030;
  long in_stack_00000038;
  long in_stack_00000040;
  long in_stack_00000048;
  long in_stack_00000058;
  long lStack_18;
  
  param_1 = param_1 + 1;
  while (param_1 = param_1 + -1, param_1 != 0) {
    unaff_x20 = unaff_x20 + 0x68;
    func_0x0018b0d4();
    unaff_x21 = unaff_x20;
  }
  if (in_stack_00000058 != 0) {
    func_0x00187bd4();
  }
  _CFRelease();
  _CFRelease(in_stack_00000010);
  lVar1 = in_stack_00000040;
  lVar3 = 0;
  lVar4 = in_stack_00000040;
  for (lVar2 = in_stack_00000048; lVar2 != 0; lVar2 = lVar2 + -1) {
    func_0x0019fb28(lVar4);
    func_0x0019e6a4(lVar4 + 8);
    unaff_x21 = lVar4;
    lVar3 = lVar2;
    lVar4 = lVar4 + 0x10;
  }
  if (in_stack_00000038 != 0) {
    func_0x00187bd4(lVar1,in_stack_00000038 << 4,8);
  }
  func_0x0019fb28(&uStack0000000000000030);
  __Unwind_Resume();
  func_0x007a2668();
  lVar2 = unaff_x21;
  while( true ) {
    lVar2 = lVar2 + 0x10;
    lVar3 = lVar3 + -1;
    if (lVar3 == 0) break;
    func_0x0018b2e8();
  }
  if (in_stack_00000038 != 0) {
    func_0x00187bd4(lVar1,in_stack_00000038 << 4,8);
    func_0x007a2668();
    func_0x007a2668();
    lVar2 = func_0x007a2668();
    lVar3 = 0;
    while (lVar3 = lVar3 + -1, lVar3 != 0) {
      lVar2 = func_0x0018b0d4(unaff_x21);
      unaff_x21 = unaff_x21 + 0x68;
    }
    if (in_stack_00000058 != 0) {
      func_0x00187bd4(lVar1,in_stack_00000058 * 0x68,8);
      lVar2 = func_0x007a2668();
    }
  }
  auVar5 = func_0x007a2668(lVar2);
  lStack_18 = *auVar5._0_8_ + 8;
  func_0x0046934c(auVar5._8_8_,&UNK_0081c0da,9,&UNK_0081c0e3,0xb,*auVar5._0_8_,&UNK_009c1938,
                  &UNK_0081c0ee,9,&lStack_18,&UNK_009c1958);
  return;
}

