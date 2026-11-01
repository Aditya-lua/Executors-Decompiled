
undefined8 FUN_006de23c(void)

{
  ulong uVar1;
  undefined8 *puVar2;
  long lVar3;
  long unaff_x19;
  long unaff_x21;
  undefined8 uVar4;
  
  uVar1 = func_0x006df204();
  lVar3 = *(long *)(*(long *)(unaff_x21 + 0x28) + 0x28);
  if (lVar3 != 0) {
    lVar3 = lVar3 << 3;
    puVar2 = *(undefined8 **)(*(long *)(unaff_x21 + 0x28) + 0x20);
    do {
      (*(code *)**(undefined8 **)*puVar2)();
      lVar3 = lVar3 + -8;
      puVar2 = puVar2 + 1;
    } while (lVar3 != 0);
  }
  (**(code **)**(undefined8 **)(unaff_x21 + 0x20))();
  lVar3 = *(long *)(unaff_x19 + 0x88);
  if (uVar1 < (ulong)(lVar3 - *(long *)(unaff_x19 + 0x80) >> 4)) {
    do {
      uVar4 = *(undefined8 *)(lVar3 + -8);
      puVar2 = (undefined8 *)func_0x006db828(unaff_x19 + 0x58,lVar3 + -0x10);
      *puVar2 = uVar4;
      lVar3 = *(long *)(unaff_x19 + 0x88) + -0x10;
      *(long *)(unaff_x19 + 0x88) = lVar3;
    } while (uVar1 < (ulong)(lVar3 - *(long *)(unaff_x19 + 0x80) >> 4));
  }
  return 0;
}

