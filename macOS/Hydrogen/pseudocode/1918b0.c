
undefined8 FUN_001918b0(void)

{
  undefined8 uVar1;
  undefined8 in_stack_00000068;
  
  uVar1 = _SecKeychainItemModifyAttributesAndData();
  _CFRelease();
  _SecKeychainItemFreeContent(0,in_stack_00000068);
  return uVar1;
}

