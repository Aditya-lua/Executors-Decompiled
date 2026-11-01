
/* WARNING: Globals starting with '_' overlap smaller symbols at the same address */

undefined8 * FUN_002d9cec(void)

{
  int iVar1;
  code *pcVar2;
  undefined8 *unaff_x19;
  
  *unaff_x19 = _UNK_007fc080;
  iVar1 = func_0x002d9a70();
  if (iVar1 != 0) {
    if (*(code **)(unaff_x19[2] + 0x58) == (code *)0x0) {
      func_0x0028f83c(6,0,0x7d,"/aws-lc/crypto/fipsmodule/evp/evp.c",0x1f9);
    }
    else {
      iVar1 = (**(code **)(unaff_x19[2] + 0x58))();
      if (iVar1 != 0) {
        return unaff_x19;
      }
    }
  }
  iVar1 = func_0x00370810();
  if (iVar1 != 0) {
    if ((unaff_x19[2] != 0) && (pcVar2 = *(code **)(unaff_x19[2] + 0xa0), pcVar2 != (code *)0x0)) {
      (*pcVar2)();
      unaff_x19[1] = 0;
      *(undefined4 *)((long)unaff_x19 + 4) = 0;
    }
    func_0x0036e3d8();
  }
  return (undefined8 *)0x0;
}

