
undefined8 FUN_006de270(void)

{
  undefined1 in_ZR;
  undefined8 *puVar1;
  long lVar2;
  long unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  undefined8 *unaff_x22;
  undefined8 uVar3;
  long unaff_x23;
  
  while (!(bool)in_ZR) {
    (*(code *)**(undefined8 **)*unaff_x22)();
    unaff_x23 = unaff_x23 + -8;
    unaff_x22 = unaff_x22 + 1;
    in_ZR = unaff_x23 == 0;
  }
  (**(code **)**(undefined8 **)(unaff_x21 + 0x20))();
  lVar2 = *(long *)(unaff_x19 + 0x88);
  if (unaff_x20 < (ulong)(lVar2 - *(long *)(unaff_x19 + 0x80) >> 4)) {
    do {
      uVar3 = *(undefined8 *)(lVar2 + -8);
      puVar1 = (undefined8 *)func_0x006db828(unaff_x19 + 0x58,lVar2 + -0x10);
      *puVar1 = uVar3;
      lVar2 = *(long *)(unaff_x19 + 0x88) + -0x10;
      *(long *)(unaff_x19 + 0x88) = lVar2;
    } while (unaff_x20 < (ulong)(lVar2 - *(long *)(unaff_x19 + 0x80) >> 4));
  }
  return 0;
}

