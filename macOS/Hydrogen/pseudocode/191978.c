
undefined8 FUN_00191978(undefined8 param_1)

{
  undefined8 uVar1;
  uint in_stack_00000008;
  undefined8 in_stack_00000010;
  undefined8 in_stack_00000020;
  
  func_0x00192acc(param_1,1);
  _CFRelease();
  if ((in_stack_00000008 & 1) == 0) {
    uVar1 = _SecKeychainItemModifyAttributesAndData(in_stack_00000020,0);
    _CFRelease(in_stack_00000020);
    _SecKeychainItemFreeContent(0,in_stack_00000010);
  }
  else {
    uVar1 = _SecKeychainAddGenericPassword();
  }
  return uVar1;
}

