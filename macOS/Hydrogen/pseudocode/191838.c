
undefined8 FUN_00191838(void)

{
  undefined8 uVar1;
  undefined8 uVar2;
  long unaff_x29;
  undefined4 uStack0000000000000014;
  uint in_stack_00000060;
  undefined8 in_stack_00000068;
  undefined8 in_stack_00000078;
  
  func_0x00192bd0();
  uVar2 = *(undefined8 *)(unaff_x29 + 0x28);
  uVar1 = *(undefined8 *)(unaff_x29 + 0x30);
  _CFRelease();
  if ((in_stack_00000060 & 1) == 0) {
    uVar2 = _SecKeychainItemModifyAttributesAndData(in_stack_00000078,0,uVar1,uVar2);
    _CFRelease(in_stack_00000078);
    _SecKeychainItemFreeContent(0,in_stack_00000068);
  }
  else {
    uStack0000000000000014 = (undefined4)uVar1;
    uVar2 = _SecKeychainAddInternetPassword();
  }
  return uVar2;
}

