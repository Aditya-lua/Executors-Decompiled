
undefined8 FUN_00174e44(void)

{
  long *plVar1;
  long lVar2;
  undefined8 extraout_x8;
  undefined8 extraout_x8_00;
  undefined8 extraout_x8_01;
  undefined8 uVar3;
  undefined8 extraout_x9;
  undefined8 *unaff_x19;
  code *unaff_x21;
  
  plVar1 = (long *)(*unaff_x21)();
  if (*plVar1 != 1) {
    if (*plVar1 == 2) {
      return extraout_x8;
    }
    func_0x0079a048(0);
  }
  lVar2 = (*unaff_x21)();
  uVar3 = extraout_x8_00;
  if (*(long *)(lVar2 + 8) == 0) {
    lVar2 = (*unaff_x21)();
    if (*(long *)(lVar2 + 0x20) != 0) {
      lVar2 = (*unaff_x21)();
      *(undefined8 *)(lVar2 + 0x20) = extraout_x9;
      *unaff_x19 = 0;
    }
    lVar2 = (*unaff_x21)();
    *(undefined8 *)(lVar2 + 8) = 0;
    uVar3 = extraout_x8_01;
  }
  return uVar3;
}

