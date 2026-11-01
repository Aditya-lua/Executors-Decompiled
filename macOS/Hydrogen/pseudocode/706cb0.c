
void FUN_00706cb0(long param_1)

{
  long unaff_x20;
  undefined8 *puVar1;
  
  if (param_1 != 0) {
    param_1 = param_1 << 3;
    puVar1 = *(undefined8 **)(unaff_x20 + 0x20);
    do {
      (*(code *)**(undefined8 **)*puVar1)();
      param_1 = param_1 + -8;
      puVar1 = puVar1 + 1;
    } while (param_1 != 0);
  }
  return;
}

