
void FUN_0013b334(long *param_1)

{
  bool in_CY;
  long *in_x9;
  long *plVar1;
  long *plVar2;
  long *unaff_x19;
  long unaff_x20;
  long lVar3;
  long *unaff_x21;
  long unaff_x22;
  long unaff_x23;
  long *unaff_x24;
  long lVar4;
  
  if (in_CY) {
    *(long **)(unaff_x20 + 8) = param_1;
  }
  else {
    plVar1 = param_1;
    plVar2 = unaff_x24;
    do {
      *plVar1 = 0;
      plVar1[1] = 0;
      plVar1[2] = 0;
      lVar3 = *plVar2;
      plVar1[1] = plVar2[1];
      *plVar1 = lVar3;
      plVar1[2] = plVar2[2];
      *plVar2 = 0;
      plVar2[1] = 0;
      plVar2[2] = 0;
      plVar1 = plVar1 + 3;
      plVar2 = plVar2 + 3;
    } while (plVar2 < param_1);
    *(long **)(unaff_x20 + 8) = plVar1;
  }
  if (param_1 != in_x9) {
    lVar3 = ((long)param_1 - (long)in_x9 >> 3) << 3;
    do {
      if (*unaff_x24 != 0) {
        unaff_x24[1] = *unaff_x24;
        __ZdlPv();
        *unaff_x24 = 0;
        unaff_x24[1] = 0;
        unaff_x24[2] = 0;
      }
      plVar1 = (long *)((long)unaff_x19 + lVar3 + -0x18);
      lVar4 = *plVar1;
      unaff_x24[1] = *(long *)((long)unaff_x19 + lVar3 + -0x10);
      *unaff_x24 = lVar4;
      unaff_x24[2] = *(long *)((long)unaff_x19 + lVar3 + -8);
      *plVar1 = 0;
      *(undefined8 *)((long)unaff_x19 + lVar3 + -0x10) = 0;
      *(undefined8 *)((long)unaff_x19 + lVar3 + -8) = 0;
      unaff_x24 = unaff_x24 + -3;
      lVar3 = lVar3 + -0x18;
    } while (lVar3 != 0);
  }
  if (*unaff_x19 != 0) {
    *(long *)(unaff_x23 + unaff_x22 * 0x18 + 8) = *unaff_x19;
    __ZdlPv();
    *unaff_x19 = 0;
    unaff_x19[1] = 0;
    unaff_x19[2] = 0;
  }
  lVar3 = *unaff_x21;
  unaff_x19[1] = unaff_x21[1];
  *unaff_x19 = lVar3;
  *(long *)(unaff_x23 + unaff_x22 * 0x18 + 0x10) = unaff_x21[2];
  *unaff_x21 = 0;
  unaff_x21[1] = 0;
  unaff_x21[2] = 0;
  return;
}

