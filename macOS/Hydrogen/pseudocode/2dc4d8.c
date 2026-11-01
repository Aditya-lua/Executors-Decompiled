
long FUN_002dc4d8(void)

{
  int iVar1;
  long lVar2;
  code *pcVar3;
  long unaff_x19;
  long unaff_x21;
  long *plVar4;
  long unaff_x23;
  long *unaff_x24;
  
  if (unaff_x24 != (long *)0x0) {
    if ((*(long *)(*unaff_x24 + 0x20) == unaff_x21) && (*(long *)(*unaff_x24 + 0x28) == unaff_x23))
    {
      lVar2 = func_0x0036effc();
      plVar4 = unaff_x24 + 1;
      *plVar4 = lVar2;
      lVar2 = func_0x0036effc();
      unaff_x24[2] = lVar2;
      if (*plVar4 != 0 && lVar2 != 0) {
        return unaff_x19;
      }
      *unaff_x24 = 0;
      func_0x0036e3d8();
      func_0x0036e3d8(unaff_x24[2]);
      *plVar4 = 0;
      unaff_x24[2] = 0;
    }
    else {
      func_0x0028f83c(6,0,0x89,"/aws-lc/crypto/fipsmodule/evp/p_kem.c",0x1d2);
    }
  }
  iVar1 = func_0x00370810();
  if (iVar1 != 0) {
    if ((*(long *)(unaff_x19 + 0x10) != 0) &&
       (pcVar3 = *(code **)(*(long *)(unaff_x19 + 0x10) + 0xa0), pcVar3 != (code *)0x0)) {
      (*pcVar3)();
      *(undefined8 *)(unaff_x19 + 8) = 0;
      *(undefined4 *)(unaff_x19 + 4) = 0;
    }
    func_0x0036e3d8();
  }
  return 0;
}

