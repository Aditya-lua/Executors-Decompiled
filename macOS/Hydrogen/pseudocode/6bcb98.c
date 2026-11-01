
void FUN_006bcb98(undefined8 param_1)

{
  long unaff_x26;
  undefined1 uStack0000000000000180;
  
  func_0x006d03d8(&uStack0000000000000180);
  if (*(long *)(unaff_x26 + 0x560) != 0) {
    *(long *)(unaff_x26 + 0x568) = *(long *)(unaff_x26 + 0x560);
    __ZdlPv();
  }
  __Unwind_Resume(param_1);
  return;
}

