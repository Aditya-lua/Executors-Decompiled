
void FUN_0003575c(undefined8 *param_1)

{
  undefined1 auVar1 [16];
  undefined1 auVar2 [16];
  undefined8 uVar3;
  long in_x9;
  long in_x10;
  long in_x11;
  ulong uVar4;
  long in_x12;
  ulong in_x13;
  long in_x14;
  long in_x15;
  long in_x16;
  long unaff_x19;
  undefined8 *unaff_x20;
  long *unaff_x21;
  long lVar5;
  long lVar6;
  
  lVar5 = in_x14 + in_x12 * in_x16;
  auVar1._8_8_ = 0;
  auVar1._0_8_ = (ulong)(in_x10 + in_x11) >> 1;
  auVar2._8_8_ = 0;
  auVar2._0_8_ = in_x13;
  uVar4 = SUB168(auVar1 * auVar2,8) >> 4;
  lVar6 = param_1[uVar4] + ((in_x10 + in_x11) - uVar4 * in_x15) * in_x16;
  if (lVar5 != lVar6) {
    do {
      if (*(long *)(lVar5 + 0x38) != 0) {
        *(long *)(lVar5 + 0x40) = *(long *)(lVar5 + 0x38);
        __ZdlPv();
      }
      if (*(long *)(lVar5 + 0x20) != 0) {
        *(long *)(lVar5 + 0x28) = *(long *)(lVar5 + 0x20);
        __ZdlPv();
      }
      lVar5 = lVar5 + 0x60;
      if (lVar5 - *unaff_x21 == 0xfc0) {
        unaff_x21 = unaff_x21 + 1;
        lVar5 = *unaff_x21;
      }
    } while (lVar5 != lVar6);
    param_1 = *(undefined8 **)(unaff_x19 + 8);
    in_x9 = *(long *)(unaff_x19 + 0x10);
  }
  *unaff_x20 = 0;
  uVar4 = in_x9 - (long)param_1;
  while (0x10 < uVar4) {
    __ZdlPv(*param_1);
    param_1 = (undefined8 *)(*(long *)(unaff_x19 + 8) + 8);
    *(undefined8 **)(unaff_x19 + 8) = param_1;
    uVar4 = *(long *)(unaff_x19 + 0x10) - (long)param_1;
  }
  if (uVar4 >> 3 == 1) {
    uVar3 = 0x15;
  }
  else {
    if (uVar4 >> 3 != 2) {
      return;
    }
    uVar3 = 0x2a;
  }
  *(undefined8 *)(unaff_x19 + 0x20) = uVar3;
  return;
}

