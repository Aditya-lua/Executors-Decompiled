
undefined8 FUN_006db718(void)

{
  undefined1 in_CY;
  long lVar1;
  long unaff_x19;
  ulong unaff_x21;
  ulong uVar2;
  long unaff_x22;
  long unaff_x23;
  
  while (!(bool)in_CY) {
    lVar1 = *(long *)(*(long *)(unaff_x19 + 0x20) + unaff_x21 * 8);
    if (lVar1 == 0 || *(int *)(lVar1 + 8) != *(int *)(unaff_x22 + 0xad8)) {
      if (lVar1 != 0 && *(int *)(lVar1 + 8) == *(int *)(unaff_x23 + 0xae8)) {
        func_0x006dbd2c();
      }
    }
    else {
      func_0x006dbc08();
    }
    unaff_x21 = unaff_x21 + 1;
    in_CY = *(ulong *)(unaff_x19 + 0x28) <= unaff_x21;
  }
  if (*(long *)(unaff_x19 + 0x38) != 0) {
    uVar2 = 0;
    do {
      (**(code **)**(undefined8 **)(*(long *)(unaff_x19 + 0x30) + uVar2 * 8))();
      uVar2 = uVar2 + 1;
    } while (uVar2 < *(ulong *)(unaff_x19 + 0x38));
  }
  return 0;
}

