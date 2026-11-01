
void FUN_00707444(long param_1)

{
  long unaff_x20;
  long *unaff_x21;
  undefined8 *puVar1;
  long unaff_x22;
  long lVar2;
  
  while( true ) {
    if (*(undefined8 **)(param_1 + 0x30) != (undefined8 *)0x0) {
      (**(code **)**(undefined8 **)(param_1 + 0x30))();
    }
    unaff_x21 = unaff_x21 + 1;
    unaff_x22 = unaff_x22 + -8;
    if (unaff_x22 == 0) break;
    param_1 = *unaff_x21;
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
                    /* WARNING: Could not recover jumptable at 0x007074b8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)**(undefined8 **)(unaff_x20 + 0x40))();
  return;
}

