
void FUN_00708050(undefined8 param_1,long *param_2)

{
  int iVar1;
  long unaff_x20;
  undefined8 *puVar2;
  long lVar3;
  
  iVar1 = (**(code **)(*param_2 + 0x198))(param_2);
  if (iVar1 == 0) {
    return;
  }
  if (*(long *)(unaff_x20 + 0x58) != 0) {
    lVar3 = *(long *)(unaff_x20 + 0x58) << 3;
    puVar2 = *(undefined8 **)(unaff_x20 + 0x50);
    do {
      (*(code *)**(undefined8 **)*puVar2)();
      lVar3 = lVar3 + -8;
      puVar2 = puVar2 + 1;
    } while (lVar3 != 0);
  }
  if (*(undefined8 **)(unaff_x20 + 0x60) != (undefined8 *)0x0) {
    (**(code **)**(undefined8 **)(unaff_x20 + 0x60))();
  }
                    /* WARNING: Could not recover jumptable at 0x007080c8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (**(code **)**(undefined8 **)(unaff_x20 + 0x78))();
  return;
}

