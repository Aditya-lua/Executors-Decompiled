
undefined8 FUN_00300120(undefined1 param_1 [16])

{
  ulong unaff_x19;
  long unaff_x20;
  long unaff_x22;
  
  *(long *)(unaff_x22 + 0x28) = param_1._8_8_;
  *(long *)(unaff_x22 + 0x20) = param_1._0_8_;
  *(long *)(unaff_x22 + 0x38) = param_1._8_8_;
  *(long *)(unaff_x22 + 0x30) = param_1._0_8_;
  if (0x3f < unaff_x19) {
    if ((bRam0000000000a334f8 >> 4 & 1) == 0) {
      func_0x00387740();
    }
    else {
      func_0x00388580();
    }
    unaff_x19 = unaff_x19 & 0x3f;
  }
  if (unaff_x19 != 0) {
    *(int *)(unaff_x20 + 0x68) = (int)unaff_x19;
    _memcpy();
  }
  return 1;
}

