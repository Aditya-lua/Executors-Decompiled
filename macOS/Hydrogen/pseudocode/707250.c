
void FUN_00707250(void)

{
  long unaff_x20;
  undefined8 *puVar1;
  long lVar2;
  
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

