
undefined8 FUN_0004fc48(void)

{
  undefined8 uVar1;
  undefined8 uVar2;
  
  uVar1 = func_0x006e6a4c();
  uVar2 = func_0x006e6a4c();
  uVar1 = _CGEventCreateMouseEvent(uVar1,uVar2,0,5,0);
  _CGEventPost(0,uVar1);
  _CFRelease(uVar1);
  return 0;
}

