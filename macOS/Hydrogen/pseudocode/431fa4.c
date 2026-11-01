
/* WARNING: Removing unreachable block (ram,0x004321b8) */
/* WARNING: Removing unreachable block (ram,0x004321c4) */

undefined8 FUN_00431fa4(void)

{
  bool in_ZR;
  ulong uVar1;
  undefined8 unaff_x20;
  
  if (in_ZR) {
    uVar1 = func_0x0046920c();
    if (((((((uVar1 & 1) == 0) && (uVar1 = func_0x0046a9ac(), (uVar1 & 1) == 0)) &&
          (uVar1 = func_0x0046a9ac(), (uVar1 & 1) == 0)) &&
         ((uVar1 = func_0x0046a9ac(), (uVar1 & 1) == 0 &&
          (uVar1 = func_0x0046a9ac(), (uVar1 & 1) == 0)))) &&
        ((uVar1 = func_0x0046a9ac(), (uVar1 & 1) == 0 &&
         ((uVar1 = func_0x0046a9ac(), (uVar1 & 1) == 0 &&
          (uVar1 = func_0x0046a9ac(), (uVar1 & 1) == 0)))))) &&
       ((uVar1 = func_0x0046a9ac(), (uVar1 & 1) == 0 &&
        ((uVar1 = func_0x0046a9ac(), (uVar1 & 1) == 0 &&
         (uVar1 = func_0x0046a9ac(), (uVar1 & 1) == 0)))))) {
      unaff_x20 = func_0x0046a9ac();
    }
    else {
      unaff_x20 = 1;
    }
  }
  return unaff_x20;
}

