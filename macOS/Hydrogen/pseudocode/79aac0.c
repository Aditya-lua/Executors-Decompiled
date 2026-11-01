
undefined1 (*) [16] FUN_0079aac0(ulong param_1,undefined8 param_2,long param_3)

{
  undefined8 *in_x9;
  undefined8 *unaff_x19;
  undefined1 auVar1 [16];
  
  auVar1 = *(undefined1 (*) [16])(param_3 + 8);
  *in_x9 = 0;
  if ((param_1 & 1) == 0) {
    auVar1 = func_0x0042b2b8();
  }
  *unaff_x19 = 1;
  *(undefined1 (*) [16])(unaff_x19 + 1) = auVar1;
  return (undefined1 (*) [16])(unaff_x19 + 1);
}

