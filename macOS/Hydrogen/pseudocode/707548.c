
void FUN_00707548(undefined8 *param_1)

{
  long unaff_x20;
  undefined8 *puVar1;
  undefined8 *unaff_x21;
  long lVar2;
  long unaff_x22;
  
  while( true ) {
    (*(code *)*param_1)();
    unaff_x22 = unaff_x22 + -8;
    if (unaff_x22 == 0) break;
    param_1 = *(undefined8 **)*unaff_x21;
    unaff_x21 = unaff_x21 + 1;
  }
  if (*(long *)(unaff_x20 + 0x38) != 0) {
    lVar2 = *(long *)(unaff_x20 + 0x38) << 3;
    puVar1 = *(undefined8 **)(unaff_x20 + 0x30);
    do {
      (*(code *)**(undefined8 **)*puVar1)();
      lVar2 = lVar2 + -8;
      puVar1 = puVar1 + 1;
    } while (lVar2 != 0);
  }
  return;
}

