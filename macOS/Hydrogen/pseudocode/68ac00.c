
void FUN_0068ac00(long param_1)

{
  undefined8 *puVar1;
  long lVar2;
  long unaff_x19;
  long unaff_x20;
  long lVar3;
  undefined8 unaff_x23;
  long unaff_x24;
  long unaff_x25;
  
  lVar3 = unaff_x20 + param_1 * -8;
  lVar2 = unaff_x24 - unaff_x20;
  if (lVar2 != 0) {
    _memmove(lVar3);
    unaff_x20 = *(long *)(unaff_x19 + 8);
  }
  puVar1 = (undefined8 *)(lVar3 + lVar2);
  *(long *)(unaff_x19 + 8) = unaff_x20 + unaff_x25 * 8;
  *(undefined8 **)(unaff_x19 + 0x10) = puVar1;
  *puVar1 = unaff_x23;
  *(long *)(unaff_x19 + 0x10) = *(long *)(unaff_x19 + 0x10) + 8;
  return;
}

