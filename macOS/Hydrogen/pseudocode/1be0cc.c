
undefined1  [16] FUN_001be0cc(long param_1)

{
  undefined1 in_ZR;
  int iVar1;
  undefined8 uVar2;
  long unaff_x19;
  long unaff_x20;
  long *unaff_x21;
  long unaff_x23;
  long unaff_x24;
  long unaff_x25;
  undefined1 auVar3 [16];
  
  do {
    if ((bool)in_ZR) {
      uVar2 = 0;
      *(long *)(unaff_x20 + 0x10) = param_1 + -0x18;
LAB_001be110:
      auVar3._8_8_ = unaff_x19;
      auVar3._0_8_ = uVar2;
      return auVar3;
    }
    if ((*(long *)(unaff_x25 + -8) == unaff_x23) &&
       (iVar1 = _memcmp(*(undefined8 *)(unaff_x25 + -0x10)), iVar1 == 0)) {
      *(long *)(unaff_x20 + 0x10) = unaff_x25;
      uVar2 = 1;
      goto LAB_001be110;
    }
    unaff_x19 = unaff_x19 + 1;
    *unaff_x21 = unaff_x19;
    param_1 = unaff_x25 + 0x18;
    in_ZR = unaff_x25 == unaff_x24;
    unaff_x25 = param_1;
  } while( true );
}

