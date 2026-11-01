
undefined8 FUN_0020603c(undefined8 param_1)

{
  ulong uVar1;
  undefined8 *unaff_x20;
  long unaff_x21;
  ulong *unaff_x22;
  ulong unaff_x23;
  undefined8 uStack0000000000000020;
  undefined8 uStack0000000000000030;
  
  uStack0000000000000030 = *(undefined8 *)(unaff_x21 + 0x10);
  uStack0000000000000020 = param_1;
  func_0x00244e7c(unaff_x20 + 2);
  if ((((unaff_x23 & 1) == 0) && ((*unaff_x22 & 0x7fffffffffffffff) != 0)) &&
     (uVar1 = func_0x007a1140(), (uVar1 & 1) == 0)) {
    *(undefined1 *)(unaff_x20 + 1) = 1;
  }
  func_0x00430048(*unaff_x20);
  return 1;
}

