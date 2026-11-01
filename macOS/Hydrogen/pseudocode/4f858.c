
undefined8 FUN_0004f858(undefined1 param_1 [16],undefined8 param_2)

{
  undefined8 uVar1;
  undefined8 uVar2;
  undefined8 uVar3;
  
  __Unwind_Resume();
  uVar1 = _CGEventCreate(0);
  uVar3 = _CGEventGetLocation();
  uVar2 = _CGEventCreateMouseEvent(0,1,0);
  _CGEventPost(0,uVar2);
  uVar3 = _CGEventCreateMouseEvent(uVar3,param_2,0,2,0);
  _CGEventPost(0,uVar3);
  _CFRelease(uVar2);
  _CFRelease(uVar3);
  _CFRelease(uVar1);
  return 0;
}

