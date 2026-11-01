
undefined1  [16] FUN_0043d5c0(void)

{
  undefined8 uVar1;
  undefined1 (*pauVar2) [16];
  int iStack0000000000000050;
  undefined8 in_stack_00000058;
  undefined8 in_stack_00000088;
  long in_stack_00000098;
  undefined1 auStack_7ffffffe [2147483630];
  
  uVar1 = func_0x007a2668();
  if ((1 < iStack0000000000000050 - 3U) && (in_stack_00000098 != 0)) {
    func_0x00187bd4(in_stack_00000088,in_stack_00000098 << 3,8);
    uVar1 = __Unwind_Resume(uVar1);
    if (_iStack0000000000000050 != 0) {
      func_0x00187bd4(in_stack_00000058,_iStack0000000000000050 << 4,8);
    }
    func_0x003f78d0(auStack_7ffffffe + 0x80001dfe);
  }
  pauVar2 = (undefined1 (*) [16])__Unwind_Resume(uVar1);
  return *pauVar2;
}

