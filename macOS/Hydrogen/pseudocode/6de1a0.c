
undefined8 FUN_006de1a0(long param_1)

{
  undefined8 *puVar1;
  long lVar2;
  long unaff_x19;
  ulong unaff_x20;
  long unaff_x21;
  undefined8 uVar3;
  
  if (param_1 != 0) {
    param_1 = param_1 << 3;
    puVar1 = *(undefined8 **)(unaff_x21 + 0x20);
    do {
      (*(code *)**(undefined8 **)*puVar1)();
      param_1 = param_1 + -8;
      puVar1 = puVar1 + 1;
    } while (param_1 != 0);
  }
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

