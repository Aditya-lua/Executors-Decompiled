/* 7ff70c8f1dd0 FUN_7ff70c8f1dd0 */

/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 FUN_7ff70c8f1dd0(void)

{
  int iVar1;
  undefined8 *unaff_RBP;
  undefined8 unaff_RDI;
  
  func_0x7ff70d81b06b(0x7ff70cc1a6e0);
  if (_DAT_7ff70cc1a6e8 == 0) {
    _DAT_7ff70cc1a6e8 = 1;
    _DAT_7ff70cbebad0 = _DAT_7ff70cb96730;
    _DAT_7ff70cbebad8 = _DAT_7ff70cb96728;
    _DAT_7ff70cbebae0 = _DAT_7ff70cb96738;
    _DAT_7ff70cbebae8 = _DAT_7ff70cb96650;
    _DAT_7ff70cbebaf0 = _DAT_7ff70cb96720;
    *unaff_RBP = 0x7ff70c8f1e64;
    iVar1 = FUN_7ff70c941a10();
    if (iVar1 == 0) {
      *unaff_RBP = 0x7ff70c8f1e87;
      iVar1 = FUN_7ff70c942050();
      if (iVar1 != 0) {
        *unaff_RBP = 0x7ff70c8f1e95;
        iVar1 = FUN_7ff70c944a00(3);
        if (iVar1 == 0) {
          *unaff_RBP = 0x7ff70c8f1e9e;
          iVar1 = FUN_7ff70c944c80();
          if (iVar1 == 0) {
            _DAT_7ff70cc1a6ec = 3;
            goto LAB_7ff70c8f1dea;
          }
        }
      }
    }
    _DAT_7ff70cc1a6e8 = _DAT_7ff70cc1a6e8 + -1;
    *unaff_RBP = unaff_RDI;
    unaff_RBP[-1] = 0x7ff70c8f1e7b;
    func_0x7ff70d9e123c(0x7ff70cc1a6e0);
  }
  else {
LAB_7ff70c8f1dea:
    *unaff_RBP = 0x7ff70c8f1df6;
    func_0x7ff70d5f6564(0x7ff70cc1a6e0);
    *unaff_RBP = 0x7ff70c8f1e01;
    iVar1 = FUN_7ff70c945ec0(unaff_RBP + 5);
    if (iVar1 == 0) {
      return unaff_RBP[5];
    }
  }
  return 0;
}


