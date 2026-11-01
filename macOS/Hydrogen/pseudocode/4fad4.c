
undefined8 FUN_0004fad4(void)

{
  undefined8 uVar1;
  
  uVar1 = _CGEventCreateMouseEvent(0,3,1);
  _CGEventPost(0,uVar1);
  _CFRelease(uVar1);
  _CFRelease();
  return 0;
}

