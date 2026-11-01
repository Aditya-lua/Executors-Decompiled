
undefined8 FUN_0004fd38(undefined8 param_1)

{
  undefined1 uVar1;
  undefined8 uVar2;
  
  uVar1 = func_0x006e6bc0(param_1,1);
  uVar2 = func_0x0004fde0(uVar1);
  uVar2 = _CGEventCreateKeyboardEvent(0,uVar2,1);
  _CGEventPost(0,uVar2);
  _CFRelease(uVar2);
  return 0;
}

