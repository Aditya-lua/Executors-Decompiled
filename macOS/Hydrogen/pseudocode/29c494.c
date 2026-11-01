
undefined8 FUN_0029c494(long param_1)

{
  bool in_ZR;
  long in_x9;
  ulong *puVar1;
  long in_x10;
  ulong in_x13;
  undefined4 unaff_w19;
  long unaff_x20;
  
  if (!in_ZR) {
    param_1 = param_1 - in_x10;
    puVar1 = (ulong *)(in_x9 + in_x10 * 8);
    do {
      in_x13 = *puVar1 | in_x13;
      param_1 = param_1 + -1;
      puVar1 = puVar1 + 1;
    } while (param_1 != 0);
  }
  if (in_x13 == 0) {
    *(undefined4 *)(unaff_x20 + 8) = unaff_w19;
    return 1;
  }
  func_0x0028f83c(3,0,0x66,"/aws-lc/crypto/fipsmodule/bn/bn.c",0x19e);
  return 0;
}

