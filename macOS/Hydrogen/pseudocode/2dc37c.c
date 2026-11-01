
long FUN_002dc37c(void)

{
  int iVar1;
  long lVar2;
  long lVar3;
  code *pcVar4;
  long unaff_x20;
  long *plVar5;
  
  lVar2 = func_0x002dc228();
  if (lVar2 == 0) {
    return 0;
  }
  plVar5 = *(long **)(lVar2 + 8);
  if (plVar5 != (long *)0x0) {
    if (*(long *)(*plVar5 + 0x28) == unaff_x20) {
      lVar3 = func_0x0036effc();
      plVar5[2] = lVar3;
      if (lVar3 != 0) {
        return lVar2;
      }
    }
    else {
      func_0x0028f83c(6,0,0x89,"/aws-lc/crypto/fipsmodule/evp/p_kem.c",0x1b2);
    }
  }
  iVar1 = func_0x00370810(lVar2);
  if (iVar1 == 0) {
    return 0;
  }
  if ((*(long *)(lVar2 + 0x10) != 0) &&
     (pcVar4 = *(code **)(*(long *)(lVar2 + 0x10) + 0xa0), pcVar4 != (code *)0x0)) {
    (*pcVar4)(lVar2);
    *(undefined8 *)(lVar2 + 8) = 0;
    *(undefined4 *)(lVar2 + 4) = 0;
  }
  func_0x0036e3d8(lVar2);
  return 0;
}

