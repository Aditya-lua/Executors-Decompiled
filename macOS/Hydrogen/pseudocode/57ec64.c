
long FUN_0057ec64(undefined8 param_1,undefined4 param_2)

{
  long lVar1;
  long unaff_x21;
  long unaff_x22;
  long unaff_x23;
  undefined1 auVar2 [12];
  
  _memmove(param_1,param_2,unaff_x21 << 6);
  *(long *)(unaff_x22 + 0x10) = unaff_x23 + unaff_x21;
  __Unwind_Resume();
  auVar2 = func_0x007a2668();
  lVar1 = *(long *)(auVar2._0_8_ + 8) + (ulong)auVar2._8_4_ * 0x10;
  if (*(ulong *)(auVar2._0_8_ + 0x10) <= (ulong)auVar2._8_4_) {
    lVar1 = 0;
  }
  return lVar1;
}

